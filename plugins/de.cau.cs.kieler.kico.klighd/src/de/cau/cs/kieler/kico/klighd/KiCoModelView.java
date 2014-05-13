/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd;

import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.klighd.model.KiCoModelChain;
import de.cau.cs.kieler.kico.klighd.model.KiCoModelWrapper;
import de.cau.cs.kieler.kico.ui.KiCoSelectionView;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * Singleton instance of DiagramViewPart to display any model
 * 
 * @author als
 * 
 */
public class KiCoModelView extends DiagramViewPart {

    /** Viewer ID **/
    private static final String ID = "de.cau.cs.kieler.kico.klighd";
    private KiCoSelectionView selectionView;
    private HashMap<String, String> tranformations = new HashMap<String, String>();
    private boolean visualizeResourceModels = false;
    private LinkedList<XtextEditor> editors = new LinkedList<XtextEditor>();
    private XtextEditor activeEditor;
    private Object currentModel;
    private LinkedList<String> preferSourceModel = new LinkedList<String>();
    private String displayMode = KiCoSelectionView.DISPLAY_SINGLE_MODEL;

    /**
     * Create an instance
     */
    public KiCoModelView() {
        super();
        setSelectionView(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .findView(KiCoSelectionView.ID));
    }
    
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPartId() {
        return ID;
    }

    // -------------------------------------------------------------------------

    /**
     * @param selectionView
     *            the selectionView to set
     */
    public void setSelectionView(IWorkbenchPart view) {
        if (view == null) {
            if (selectionView != null) {
                selectionView.removePartPropertyListener(tranformationsPropertyListener);
            }
            selectionView = null;
        } else if (view instanceof KiCoSelectionView) {
            if (selectionView != null) {
                selectionView.removePartPropertyListener(tranformationsPropertyListener);
            }
            selectionView = (KiCoSelectionView) view;
            selectionView.addPartPropertyListener(tranformationsPropertyListener);
        }

    }

    final IPropertyListener dirtyPropertyListener = new IPropertyListener() {

        public void propertyChanged(Object source, int propId) {
            if (propId == IWorkbenchPartConstants.PROP_DIRTY) {
                updateDiagram(true);
            }
        }
    };

    final IPropertyChangeListener tranformationsPropertyListener = new IPropertyChangeListener() {

        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty() == KiCoSelectionView.ACTIVE_TRANSFORMATIONS_PROPERTY_KEY) {
                String editorHash =
                        ((KiCoSelectionView) event.getSource())
                                .getPartProperty(KiCoSelectionView.ACTIVE_EDITOR_PROPERTY_KEY);
                if (tranformations.put(editorHash, (String) event.getNewValue()) != event
                        .getNewValue()) {
                    preferSourceModel.remove(editorHash);
                    updateDiagram(false);
                }
            } else if (event.getProperty() == KiCoSelectionView.DISPLAY_MODE_PROPERTY_KEY) {
                displayMode = (String) event.getNewValue();
            }
        }
    };

    /**
     * {@inheritDoc}
     */
    public void createPartControl(final Composite parent) {
        super.createPartControl(parent);

        IActionBars bars = getViewSite().getActionBars();
        IToolBarManager toolBarManager = bars.getToolBarManager();
        // toolBarManager.add(getActionSave());
        // toolBarManager.add(getActionSeparate());
        // toolBarManager.add(getActionResourceVisualization());

        DiagramViewManager.getInstance().registerView(this);

        // Create an IPartListener2
        IPartListener2 pl = new IPartListener2() {

            public void partVisible(IWorkbenchPartReference partRef) {
                // TODO Auto-generated method stub

            }

            public void partOpened(IWorkbenchPartReference partRef) {
                if (isEditor(partRef)) {
                    editors.add((XtextEditor) partRef.getPart(false));
                } else if (partRef.getId() == KiCoSelectionView.ID) {
                    setSelectionView(partRef.getPart(false));
                }
            }

            public void partInputChanged(IWorkbenchPartReference partRef) {
                // TODO Auto-generated method stub

            }

            public void partHidden(IWorkbenchPartReference partRef) {
                // TODO Auto-generated method stub

            }

            public void partDeactivated(IWorkbenchPartReference partRef) {
                // TODO Auto-generated method stub

            }

            public void partClosed(IWorkbenchPartReference partRef) {
                if (isEditor(partRef)) {
                    XtextEditor editor = (XtextEditor) partRef.getPart(false);
                    editors.remove(editor);
                    editor.removePropertyListener(dirtyPropertyListener);
                } else if (partRef.getId() == KiCoSelectionView.ID) {
                    setSelectionView(null);
                }
            }

            public void partBroughtToTop(IWorkbenchPartReference partRef) {
                // TODO Auto-generated method stub
            }

            public void partActivated(IWorkbenchPartReference partRef) {
                if (isEditor(partRef)) {
                    activeEditorChanged((XtextEditor) partRef.getPart(false));
                }
            }
        };

        // Add the IPartListener2 to the page
        IWorkbenchPage page = this.getSite().getPage();
        page.addPartListener(pl);
    }

    private boolean isEditor(IWorkbenchPartReference partRef) {
        IWorkbenchPart part = partRef.getPart(false);
        if (part != null && part instanceof XtextEditor) {
            return true;
        }
        return false;
    }

    private void activeEditorChanged(XtextEditor editor) {
        if (activeEditor != editor) {
            if (editors.contains(activeEditor)) {
                activeEditor.removePropertyListener(dirtyPropertyListener);
            }
            editor.addPropertyListener(dirtyPropertyListener);
            activeEditor = editor;
            updateDiagram(false);
        }
    }

    void updateDiagram(boolean dirtyPropertyChanged) {
        if (visualizeResourceModels) {
            return;
        }
        if (activeEditor != null) {
            // check if refreshing is superfluous
            if (dirtyPropertyChanged && activeEditor.isDirty()) {
                return;
            }

            IXtextDocument document = activeEditor.getDocument();
            if (document != null) {
                document.readOnly(new IUnitOfWork.Void<XtextResource>() {

                    @Override
                    public void process(final XtextResource state) throws Exception {
                        currentModel = state.getContents().get(0);
                    }
                });
                if (currentModel != null) {
                    if (tranformations.containsKey(activeEditor.hashCode())
                            && !preferSourceModel.contains(activeEditor.hashCode())) {
                        // compile
                        EObject compiledModel =
                                KielerCompiler.compile(tranformations.get(activeEditor.hashCode()),
                                        (EObject) currentModel);

                        if (compiledModel != null) {
                            if (displayMode == KiCoSelectionView.DISPLAY_SINGLE_MODEL) {
                                currentModel = compiledModel;
                            } else if (displayMode == KiCoSelectionView.DISPLAY_SIDE_BY_SIDE) {
                                KiCoModelChain chain = new KiCoModelChain();
                                chain.models.add(new KiCoModelWrapper(currentModel));
                                chain.models.add(new KiCoModelWrapper(compiledModel));
                                currentModel = chain;
                            }
                        }
                    }
                    KlighdSynthesisProperties properties = new KlighdSynthesisProperties();
                    DiagramViewManager.getInstance().createView(ID, null, currentModel,
                            properties);
                }
            }
        }
    }
}
