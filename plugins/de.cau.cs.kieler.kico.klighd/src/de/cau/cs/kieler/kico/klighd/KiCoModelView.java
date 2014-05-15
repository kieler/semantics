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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
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

/**
 * Singleton instance of DiagramViewPart to display any model
 * 
 * @author als
 * 
 */
public class KiCoModelView extends DiagramViewPart {

    /**
     * Events that can cause a update of shown model
     * 
     * @author als
     * 
     */
    private enum ChangeEvent {
        SAVED, DISPLAY_MODE, TRANSFORMATIONS, ACTIVE_EDITOR, COMPILE, ACTIVE_RESOURCE
    }

    /** This instance */
    private KiCoModelView thisInstance;

    /** Viewer ID **/
    private static final String ID = "de.cau.cs.kieler.kico.klighd.view";

    // ICONS
    /** The icon for toggling side-by-side display mode button. */
    public static final ImageDescriptor ICON_COMPILE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/KiCoModelViewIconCompile.png");
    /** The icon for toggling compile button. */
    public static final ImageDescriptor ICON_FORK = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/KiCoModelViewIconDuplicate.png");
    /** The icon for forking view button. */
    public static final ImageDescriptor ICON_SIDE_BY_SIDE = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.ui",
                    "icons/KiCoViewIconSideBySide.png");

    // ACTIONS
    /** The action for toggling side-by-side display mode. */
    private Action actionSideBySideToggle;
    /** Flag if side-by-side display mode is active. */
    private boolean displaySideBySide = false;

    /** The action for toggling compile. */
    private Action actionCompileToggle;
    /** Flag if compile mode is active. */
    private boolean compileModel = true;

    /** Flag if resources should be displayed. */
    private boolean visualizeResourceModels = false;

    /** String of pinned transformations. */
    private String pinnedTransformations = null;

    /** The action for forking view. */
    private Action actionFork;

    private String secondaryID;
    // TODO sync id dilevery and assignment after restart
    private static long newSubID = 1;
    private boolean isPrimaryView = false;
    private static List<String> secondaryIDs = new LinkedList<String>();

    private KiCoSelectionView selectionView;
    private HashMap<String, String> tranformations = new HashMap<String, String>();

    private LinkedList<IEditorPart> editors = new LinkedList<IEditorPart>();
    private IEditorPart activeEditor;
    private Object currentModel;

    // TODO StartupDeamon
    // IEditorPart editor =
    // PlatformUI.getWorkbench().getActiveWorkbenchWindow()
    // .getActivePage().getActiveEditor();
    // if (isModelEditor(editor)) {
    // setActiveEditor(editor);
    // }

    /**
     * Create an instance
     */
    public KiCoModelView() {
        super();
        thisInstance = this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void init(IViewSite site) throws PartInitException {
        super.init(site);

        if (site.getSecondaryId() != null) {
            secondaryID = site.getSecondaryId();
            synchronized (secondaryIDs) {
                secondaryIDs.add(secondaryID);
            }
        } else {
            isPrimaryView = true;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPartId() {
        if (isPrimaryView) {
            return ID;
        } else {
            return ID + "." + secondaryID;
        }
    }

    // -- LISTENER
    // -------------------------------------------------------------------------

    /** PropertyListener to check if a editor was saved. */
    final IPropertyListener dirtyPropertyListener = new IPropertyListener() {

        public void propertyChanged(Object source, int propId) {
            if (propId == IWorkbenchPartConstants.PROP_DIRTY && !((IEditorPart) source).isDirty()) {
                updateModel(ChangeEvent.SAVED);
            }
        }
    };

    /** PropertyChangeListener to get changes of selected transformations in KiCoSelectionView. */
    final IPropertyChangeListener tranformationsPropertyListener = new IPropertyChangeListener() {

        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty() == KiCoSelectionView.ACTIVE_TRANSFORMATIONS_PROPERTY_KEY) {
                String editorHash =
                        ((KiCoSelectionView) event.getSource())
                                .getPartProperty(KiCoSelectionView.ACTIVE_EDITOR_PROPERTY_KEY);
                if (event.getNewValue() != null
                        && !event.getNewValue().equals(
                                tranformations.put(editorHash, (String) event.getNewValue()))) {
                    updateModel(ChangeEvent.TRANSFORMATIONS);
                }
            }
        }
    };

    /** PartListener to react on opened/closed/activated Editors and KiCoSelectionView. */
    final IPartListener2 partListener = new IPartListener2() {

        public void partVisible(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partOpened(IWorkbenchPartReference partRef) {
            IWorkbenchPart part = partRef.getPart(false);
            if (part != null) {
                if (isModelEditor(part)) {
                    editors.add((IEditorPart) part);
                } else if (partRef.getId() == KiCoSelectionView.ID) {
                    setSelectionView(part);
                }
            }
        }

        public void partInputChanged(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partHidden(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partDeactivated(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partClosed(IWorkbenchPartReference partRef) {
            IWorkbenchPart part = partRef.getPart(false);
            if (isModelEditor(part)) {
                //add to editor list
                IEditorPart editor = (IEditorPart) part;
                editors.remove(editor);
                editor.removePropertyListener(dirtyPropertyListener);
                // close this secondary view if editor was active editor
                if (!isPrimaryView && editor == activeEditor) {
                    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                            .hideView(thisInstance);
                }
            } else if (partRef.getId() == KiCoSelectionView.ID) {
                setSelectionView(null);
                tranformations.clear();
            }
        }

        public void partBroughtToTop(IWorkbenchPartReference partRef) {
            // Do nothing
        }

        public void partActivated(IWorkbenchPartReference partRef) {
            IWorkbenchPart part = partRef.getPart(false);
            if (isModelEditor(part) && isPrimaryView) {
                setActiveEditor((IEditorPart) part);
            }
        }
    };

    // -- Register LISTENER
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void createPartControl(final Composite parent) {
        super.createPartControl(parent);

        IActionBars bars = getViewSite().getActionBars();
        IToolBarManager toolBarManager = bars.getToolBarManager();
        // toolBarManager.add(getActionSave());
        toolBarManager.add(getActionFork());
        // toolBarManager.add(getActionResourceVisualization());
        toolBarManager.add(getActionCompile());
        toolBarManager.add(getActionSideBySide());

        DiagramViewManager.getInstance().registerView(this);

        // Add the partListener to the page
        final IWorkbenchPage page = this.getSite().getPage();
        page.addPartListener(partListener);

        // Take care of removing part listener
        parent.addDisposeListener(new DisposeListener() {

            public void widgetDisposed(DisposeEvent e) {
                page.removePartListener(partListener);
            }
        });

        // Find KiCoSelectionView and register as transformation source
        setSelectionView(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .findView(KiCoSelectionView.ID));
    }

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

    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        // Cleanup
        if (!isPrimaryView) {
            synchronized (secondaryIDs) {
                secondaryIDs.remove(secondaryID);
            }
        }
        // remove listener from selectionView
        setSelectionView(null);

        super.dispose();
    }

    // -- TEST and SET
    // -------------------------------------------------------------------------
    // TODO docu

    private boolean isModelEditor(IWorkbenchPart part) {
        if (part instanceof IEditorPart) {
            return isModelEditor((IEditorPart) part);
        }
        return false;
    }

    private boolean isModelEditor(IEditorPart part) {
        if (part != null && (part instanceof XtextEditor || part instanceof IEditingDomainProvider)) {
            return true;
        }
        return false;
    }

    private void setActiveEditor(IEditorPart editor) {
        if (editor != null && activeEditor != editor) {
            if (editors.contains(activeEditor)) {
                activeEditor.removePropertyListener(dirtyPropertyListener);
            }
            editor.addPropertyListener(dirtyPropertyListener);
            activeEditor = editor;
            if (!isPrimaryView) {
                setPartName(editor.getTitle());
            }
            updateModel(ChangeEvent.ACTIVE_EDITOR);
        }
    }

    // -- ACTIONS
    // -------------------------------------------------------------------------

    /**
     * Gets the action to toggle compile.
     * 
     * @return the action
     */
    private Action getActionCompile() {
        if (actionCompileToggle != null) {
            return actionCompileToggle;
        }
        actionCompileToggle = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                compileModel = actionCompileToggle.isChecked();
                updateModel(ChangeEvent.COMPILE);
            }
        };
        actionCompileToggle.setText("Show compiled model");
        actionCompileToggle.setToolTipText("Show compiled model");
        // actionCompileToggle.setToolTipText("Show compiled model acording to compiler selection");
        actionCompileToggle.setImageDescriptor(ICON_COMPILE);
        actionCompileToggle.setChecked(compileModel);
        return actionCompileToggle;
    }

    /**
     * Gets the action to toggle side-by-side display mode.
     * 
     * @return the action
     */
    private Action getActionSideBySide() {
        if (actionSideBySideToggle != null) {
            return actionSideBySideToggle;
        }
        actionSideBySideToggle = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                displaySideBySide = actionSideBySideToggle.isChecked();
                updateModel(ChangeEvent.DISPLAY_MODE);
            }
        };
        actionSideBySideToggle.setText("Enable side-by-side display mode");
        actionSideBySideToggle.setToolTipText("Enable side-by-side display mode");
        // actionSideBySideToggle.setToolTipText("Enables side-by-side display mode of compiled and source model.");
        actionSideBySideToggle.setImageDescriptor(ICON_SIDE_BY_SIDE);
        actionSideBySideToggle.setChecked(displaySideBySide);
        return actionSideBySideToggle;
    }

    /**
     * Gets the action to fork this view.
     * 
     * @return the action
     */
    private Action getActionFork() {
        if (actionFork != null) {
            return actionFork;
        }
        actionFork = new Action("", IAction.AS_PUSH_BUTTON) {
            public void run() {
                try {
                    // Create new subID
                    String subID = "secondary" + newSubID++;
                    // Create new View
                    IViewPart newViewPart =
                            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                                    .showView(ID, subID, IWorkbenchPage.VIEW_ACTIVATE);
                    // Configure child view
                    if (newViewPart instanceof KiCoModelView) {
                        KiCoModelView child = (KiCoModelView) newViewPart;
                        child.setActiveEditor(KiCoModelView.this.activeEditor);
                        // TODO configure child
                    }

                } catch (PartInitException e) {
                    e.printStackTrace();
                }
            }
        };
        actionFork.setText("Fork this view");
        actionFork.setToolTipText("Fork this view");
        actionFork.setImageDescriptor(ICON_FORK);
        return actionFork;
    }

    // -- UPDATE
    // -------------------------------------------------------------------------

    private void updateModel(ChangeEvent change) {
        if (visualizeResourceModels) {
            // TODO Resource selection
            return;
        }
        if (activeEditor != null) {
            if (activeEditor instanceof XtextEditor) {// Get model from XTextEditor
                IXtextDocument document = ((XtextEditor) activeEditor).getDocument();
                if (document != null) {
                    document.readOnly(new IUnitOfWork.Void<XtextResource>() {

                        @Override
                        public void process(final XtextResource state) throws Exception {
                            currentModel = state.getContents().get(0);
                        }
                    });
                }
            } else if (activeEditor instanceof IEditingDomainProvider) {// Get model from EMF
                                                                        // TreeEditor
                IEditingDomainProvider editor = (IEditingDomainProvider) activeEditor;

                List<Resource> resources =
                        editor.getEditingDomain().getResourceSet().getResources();

                if (!resources.isEmpty() && !resources.get(0).getContents().isEmpty()) {
                    currentModel =
                            EcoreUtil.getRootContainer(resources.get(0).getContents().get(0));
                }
            }
            if (currentModel != null) {
                // TODO test if synthesis available
                // if compiling is available and requested
                if (tranformations.containsKey(Integer.toString(activeEditor.hashCode()))
                        && !tranformations.get(Integer.toString(activeEditor.hashCode())).isEmpty()
                        && compileModel) {
                    // compile
                    EObject compiledModel =
                            KielerCompiler.compile(
                                    tranformations.get(Integer.toString(activeEditor.hashCode())),
                                    (EObject) currentModel);

                    // TODO test if compiler error occured
                    // composite model in given display mode
                    if (compiledModel != null) {
                        if (displaySideBySide) {
                            KiCoModelChain chain = new KiCoModelChain();
                            chain.models.add(new KiCoModelWrapper(currentModel));
                            chain.models.add(new KiCoModelWrapper(compiledModel));

                            currentModel = chain;
                        } else {
                            currentModel = compiledModel;
                        }
                    }

                    updateDiagram();
                } else if (change != ChangeEvent.DISPLAY_MODE
                        && change != ChangeEvent.TRANSFORMATIONS) {
                    updateDiagram();
                }
            }
        }
    }

    /**
     * Updates displayed diagram to currentModel.
     */
    private void updateDiagram() {
        if (this.getViewer() == null || this.getViewer().getViewContext() == null) {
            // the initialization case
            DiagramViewManager.getInstance().createView(getPartId(), null, currentModel, null);
            this.getViewer().getViewContext().setSourceWorkbenchPart(activeEditor);
        } else {
            // update case
            this.getViewer().getViewContext().setSourceWorkbenchPart(activeEditor);
            DiagramViewManager.getInstance().updateView(this.getViewer().getViewContext(),
                    currentModel);
        }

    }
}
