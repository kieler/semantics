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

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * Singleton instance of DiagramViewPart to display any model
 * 
 * @author als
 * 
 */
public class KiCoModelView extends DiagramViewPart {

    private enum ChangeEvent {
        SAVED, DISPLAY_MODE, TRANSFORMATIONS, ACTIVE_EDITOR, COMPILE, ACTIVE_RESOURCE
    }

    /** Viewer ID **/
    private static final String ID = "de.cau.cs.kieler.kico.klighd.view";
    private static long newSubID = 1;
    private static final String NAME = "KIELER Model View";

    public static final ImageDescriptor ICON_COMPILE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.klighd", "icons/KiCoModelViewIconCompile.png");

    public static final ImageDescriptor ICON_DUPLICATE = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.klighd",
                    "icons/KiCoModelViewIconDuplicate.png");

    /** The action for toggling compile. */
    private Action actionCompileToggle;
    private boolean compileModel = true;

    /** The action for toggling compile. */
    private Action actionDuplicate;
    private String secondaryID;
    private static HashMap<String, WeakReference<KiCoModelView>> parentalViews =
    new HashMap<String, WeakReference<KiCoModelView>>(0);

    private KiCoSelectionView selectionView;
    private HashMap<String, String> tranformations = new HashMap<String, String>();
    private boolean visualizeResourceModels = false;
    private LinkedList<IEditorPart> editors = new LinkedList<IEditorPart>();
    private IEditorPart activeEditor;
    private Object currentModel;
    private String displayMode = KiCoSelectionView.DISPLAY_SINGLE_MODEL;
    private boolean isPrimaryView = false;
    private static KiCoModelView primaryView;
    private String pinnedTransformations = null;
    
    private KiCoModelView thisInstance;

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
        }else{
            primaryView = this;
            isPrimaryView = true;
        }

        // TODO get active editor
        setSelectionView(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .findView(KiCoSelectionView.ID));
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
            if (propId == IWorkbenchPartConstants.PROP_DIRTY && !((IEditorPart) source).isDirty()) {
                updateDiagram(ChangeEvent.SAVED);
            }
        }
    };

    final IPropertyChangeListener tranformationsPropertyListener = new IPropertyChangeListener() {

        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty() == KiCoSelectionView.ACTIVE_TRANSFORMATIONS_PROPERTY_KEY) {
                String editorHash =
                        ((KiCoSelectionView) event.getSource())
                                .getPartProperty(KiCoSelectionView.ACTIVE_EDITOR_PROPERTY_KEY);
                if (event.getNewValue() != null
                        && !event.getNewValue().equals(
                                tranformations.put(editorHash, (String) event.getNewValue()))) {
                    updateDiagram(ChangeEvent.TRANSFORMATIONS);
                }
            } else if (event.getProperty() == KiCoSelectionView.DISPLAY_MODE_PROPERTY_KEY) {
                displayMode = (String) event.getNewValue();
                updateDiagram(ChangeEvent.DISPLAY_MODE);
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
        toolBarManager.add(getActionDuplicate());
        // toolBarManager.add(getActionResourceVisualization());
        toolBarManager.add(getActionCompile());

        DiagramViewManager.getInstance().registerView(this);

        // Create an IPartListener2
        IPartListener2 pl = new IPartListener2() {

            public void partVisible(IWorkbenchPartReference partRef) {
                // TODO Auto-generated method stub
            }

            public void partOpened(IWorkbenchPartReference partRef) {
                IWorkbenchPart part = partRef.getPart(false);
                if (part != null) {
                    if (isModelEditor(part)) {
                        editors.add((IEditorPart) part);
                    } else if (partRef.getId() == KiCoSelectionView.ID) {
                        setSelectionView(part);
                    } else if (part == thisInstance) {
                        if (isPrimaryView) {
                            IEditorPart editor =
                                    PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                                            .getActivePage().getActiveEditor();
                            if (isModelEditor(editor)) {
                                setActiveEditor(editor);
                            }
                        } else if (parentalViews.containsKey(secondaryID)) {
                            KiCoModelView parentView = parentalViews.get(secondaryID).get();
                            if (parent != null) {
                                tranformations.putAll(parentView.tranformations);
                                compileModel = parentView.compileModel;
                                setActiveEditor(parentView.activeEditor);
                            } else {
                                parentalViews.remove(secondaryID);
                            }
                        }
                    }
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
                IWorkbenchPart part = partRef.getPart(false);
                if (isModelEditor(part)) {
                    IEditorPart editor = (IEditorPart) part;
                    editors.remove(editor);
                    editor.removePropertyListener(dirtyPropertyListener);
                } else if (partRef.getId() == KiCoSelectionView.ID) {
                    setSelectionView(null);
                    tranformations.clear();
                } else if (part == thisInstance) {
                    // TODO hide primary
                    if (isPrimaryView) {
                        primaryView = null;
                    }
                }
            }

            public void partBroughtToTop(IWorkbenchPartReference partRef) {
                // TODO Auto-generated method stub
            }

            public void partActivated(IWorkbenchPartReference partRef) {
                IWorkbenchPart part = partRef.getPart(false);
                if (isModelEditor(part) && isPrimaryView) {
                    setActiveEditor((IEditorPart) part);
                }
            }
        };

        // Add the IPartListener2 to the page
        IWorkbenchPage page = this.getSite().getPage();
        page.addPartListener(pl);
    }

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
            updateDiagram(ChangeEvent.ACTIVE_EDITOR);
        }
    }

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
            }
        };
        actionCompileToggle.setText("Show compiled model");
        actionCompileToggle.setToolTipText("Show compiled model");
        // actionCompileToggle.setToolTipText("Show compiled model acording to compiler selection");
        actionCompileToggle.setImageDescriptor(ICON_COMPILE);
        actionCompileToggle.setChecked(compileModel);
        actionCompileToggle.setEnabled(true);
        return actionCompileToggle;
    }

    /**
     * Gets the action to duplicate.
     * 
     * @return the action
     */
    private Action getActionDuplicate() {
        if (actionDuplicate != null) {
            return actionDuplicate;
        }
        actionDuplicate = new Action("", IAction.AS_PUSH_BUTTON) {
            public void run() {
                try {
                    String subID = "secondary" + newSubID++;
                    parentalViews.put(subID, new WeakReference<KiCoModelView>(thisInstance));
                    IViewPart newViewPart =
                            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                                    .showView(ID, subID, IWorkbenchPage.VIEW_ACTIVATE);
                    if (newViewPart != null) {
                        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                                .bringToTop(newViewPart);
                    }

                } catch (PartInitException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        actionDuplicate.setText("Fork this view");
        actionDuplicate.setToolTipText("Fork this view");
        actionDuplicate.setImageDescriptor(ICON_DUPLICATE);
        return actionDuplicate;
    }

    private void updateDiagram(ChangeEvent change) {
        if (visualizeResourceModels) {
            return;
        }
        if (activeEditor != null) {
            if (activeEditor instanceof XtextEditor) {
                IXtextDocument document = ((XtextEditor) activeEditor).getDocument();
                if (document != null) {
                    document.readOnly(new IUnitOfWork.Void<XtextResource>() {

                        @Override
                        public void process(final XtextResource state) throws Exception {
                            currentModel = state.getContents().get(0);
                        }
                    });
                }
            } else if (activeEditor instanceof IEditingDomainProvider) {
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

                    // composite model in given display mode
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

                    DiagramViewManager.getInstance().createView(getPartId(), null, currentModel,
                            KlighdSynthesisProperties.emptyConfig());
                } else if (change != ChangeEvent.DISPLAY_MODE
                        && change != ChangeEvent.TRANSFORMATIONS) {
                    DiagramViewManager.getInstance().createView(getPartId(), null, currentModel,
                            KlighdSynthesisProperties.emptyConfig());
                }
            }
        }
    }
}
