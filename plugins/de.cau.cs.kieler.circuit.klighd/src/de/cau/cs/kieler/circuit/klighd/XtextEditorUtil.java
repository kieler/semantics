/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.circuit.klighd;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;

import de.cau.cs.kieler.klighd.IDiagramWorkbenchPart;
import de.cau.cs.kieler.klighd.IKlighdSelection;
import de.cau.cs.kieler.klighd.ISourceProxy;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;

public class XtextEditorUtil {

    /**
     * Factory method providing an implementation of {@link ISourceProxy} enabling the execution of
     * KLighD operations properly within Xtext's {@link IUnitOfWork IUnitOfWorks}.
     *
     * @param editorPart
     *            the {@link XtextEditor} whose model shall be accessed
     * @return the desired {@link ISourceProxy} implementation
     */
    public static ISourceProxy getXtextModelAccessProxy(final IEditorPart editorPart) {
        if (!(editorPart instanceof XtextEditor)) {
            // if a non-Xtext editor is given don't to anything;
            return null;
        }

        final XtextEditor xtextEditor = (XtextEditor) editorPart;

        // because Xtext editors protect the model (resource) by a transaction mechanism
        //  an instance of ISourceProxy is returned instead of returning the model directly
        return new ISourceProxy() {

            // The implementation of 'execute(...)' implements Xtext's transaction mechanism;
            // KLighD will invoke this method and provide a function wrapping the KLighD internal
            //  functionality; the function's result must be returned by 'execute(...)' method

            public <T> T execute(final Function<Object, T> function) {
                if (xtextEditor.getDocument() == null) {
                    // stop if for some reason there's no document (shouldn't happen)
                    return null;
                }

                // perform a read operation on the model and execute KLighD's tasks
                return xtextEditor.getDocument().readOnly(new IUnitOfWork<T, XtextResource>() {

                    public T exec(final XtextResource res) throws Exception {
                        // return just 'null' if there's no model within the resource
                        //  otherwise apply the function provided by KLighD
                        return res.getContents().isEmpty() ? null :
                            function.apply(res.getContents().get(0));
                    }
                });
            }
        };
    }

    private static final Map<XtextEditor, ISelectionListener> selectionListeners = Maps.newHashMap();


    /**
     * Registers an {@link ISelectionListener} dedicated to {@code diagramPart}
     * in the Eclipse selection service. This selection listener listens for selections
     * in {@code diagramPart} and is in charge of highlighting the corresponding
     * declarations in {@code editorPart}, which is supposed to be an {@link XtextEditor}.<br>
     * <br>
     * The registered listeners are tracked and de-registered if {@code editorPart} is closed.
     *
     * @param editorPart
     *            is supposed to be a valid {@link XtextEditor}
     * @param diagramPart
     *            the diagram view part to be listened for selection changes
     */
    public static void registerSelectionListener(IEditorPart editorPart, IDiagramWorkbenchPart diagramPart) {
        if (!(editorPart instanceof XtextEditor)) {
            return;
        }

        final XtextEditor xtextEditor = (XtextEditor) editorPart;

        // the selection listeners are installed corresponding to the 'xtextEditors'
        //  that provide the source (domain) models
        // if there is already a listener tracked with the given editor, we're done
        if (selectionListeners.containsKey(xtextEditor)) {
            return;
        }

        // otherwise instantiate a new listener, ...
        final ISelectionListener selectionListener = new ISelectionListener() {

            @Override
            public void selectionChanged(IWorkbenchPart part, ISelection selection) {
                // first check for the correct selection type (just for safety purposes)
                if (!(selection instanceof IKlighdSelection)) {
                    return;
                }

                final IKlighdSelection klighdSelection = (IKlighdSelection) selection;

                // obtain the first selected diagram element and ask KLighD
                //  (i.e. the diagram's ViewContext) for the corresponding source element
                final Object selectedDomainElement = klighdSelection.getViewContext().getSourceElement(
                        Iterators.getNext(klighdSelection.diagramElementsIterator(), null));

                // try to highlight the corresponding definition if 'selectedDomainElement' is
                //  a valid model element, i.e. non null, for example
                if (selectedDomainElement instanceof EObject) {
                    highlightSelection(xtextEditor, (EObject) selectedDomainElement);
                }
            }
        };

        // ... keep it in mind, ...
        selectionListeners.put(xtextEditor, selectionListener);

        // ... compose the partId from primary and secondary id as required by the selection service
        //  (the KLighD DiagramViewPart is a multi view; black magic ... *hoo*), ...
        final String partId = DiagramViewPart.VIEW_ID + ":" + diagramPart.getPartId();

        // ... and register the listener in the platform.
        final IWorkbenchPage diagramPartPage = diagramPart.getSite().getPage();
        diagramPartPage.addSelectionListener(partId, selectionListener);

        // For properly de-installing the selection listener we need to keep track of the editor. If
        //  gets closed the selection listener gets obsolete as there's nothing to highlight any more.
        // Thus, we register an IPartListener that listens for the closure of the editor.
        // It reveals the selection listener to be removed from the memory map, removes it from the
        //  platform (selection service), and finally de-installes itself.

        final IWorkbenchPage editorPartPage = xtextEditor.getSite().getPage();
        editorPartPage.addPartListener(new IPartListener() {

            @Override
            public void partClosed(IWorkbenchPart part) {
                if (part == xtextEditor) {
                    final ISelectionListener l = selectionListeners.remove(xtextEditor);
                    diagramPartPage.removeSelectionListener(partId, l);
                    editorPartPage.removePartListener(this);
                }
            }

            @Override
            public void partOpened(IWorkbenchPart part) {
            }

            @Override
            public void partDeactivated(IWorkbenchPart part) {
            }

            @Override
            public void partBroughtToTop(IWorkbenchPart part) {
            }

            @Override
            public void partActivated(IWorkbenchPart part) {
            }
        });
    }


    private static void highlightSelection(XtextEditor xtextEditor, EObject element) {

        // ask 'xtextEditor' for the position of 'element's definition
        final Integer[] elementData = xtextEditor.getDocument().readOnly(
                new IUnitOfWork<Integer[], XtextResource>() {

                    public Integer[] exec(final XtextResource state) throws Exception {

                        final INode node = NodeModelUtils.findActualNodeFor(element);
                        return node == null ? null
                                : new Integer[] { node.getOffset(), node.getLength() };
                    }
                });

        if (elementData == null) {
            return;
        }

        // set the selection to that area
        xtextEditor.getInternalSourceViewer().setSelectedRange(elementData[0], elementData[1]);
        xtextEditor.getInternalSourceViewer().revealRange(elementData[0], elementData[1]);

        // bring the editor to foreground
        xtextEditor.getSite().getPage().bringToTop(xtextEditor);
    }
}
