package de.cau.cs.kieler.sccharts.prio.dependencies.klighd;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.progress.UIJob;

import com.google.common.collect.Iterables;

import de.cau.cs.kieler.kico.klighd.KiCoModelViewManager;
import de.cau.cs.kieler.klighd.KlighdDataManager;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.internal.ISynthesis;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.prio.dependencies.dependency.Dependencies;

public class SCChartsPrioDependencyView extends DiagramViewPart {

    public static final String ID = "de.cau.cs.kieler.sccharts.prio.dependencies.klighd.view";

    /** Active related editor */
    private IEditorPart activeEditor;

    /** Model extracted from editor */
    private EObject sourceModel;
    
    /** The instance of this view. */
    private static SCChartsPrioDependencyView instance;

    // ------------------------------------------------------------------------

    /**
     * Create an instance
     */
    public SCChartsPrioDependencyView() {
        super();
        instance = this;
    }

    // ------------------------------------------------------------------------

    static SCChartsPrioDependencyView getInstance() {
        return instance;
    }

    // ------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String getPartId() {
        return ID;
    }

    // ------------------------------------------------------------------------

    /** PropertyListener to check if a editor was saved. */
    final IPropertyListener dirtyPropertyListener = new IPropertyListener() {

        public void propertyChanged(Object source, int propId) {
            if (propId == IWorkbenchPartConstants.PROP_DIRTY && !((IEditorPart) source).isDirty()) {
                // dirty flag changed and editor is not dirty -> saved
                updateModel();
            }
        }
    };

    // ------------------------------------------------------------------------

    @Override
    public void createPartControl(Composite parent) {
        super.createPartControl(parent);

    }

    // ------------------------------------------------------------------------

    /**
     * Updates the active editor as source and updates diagram. This is usually called by the
     * EditorListener. If null is passed, then the model is vanished.
     * 
     * @param editor
     *            active editor or null to unset
     */
    void updateActiveEditor(IEditorPart editor) {
        if (editor != null) {
            if (activeEditor != editor) {
                // unregister save listener if necessary
                if (activeEditor != null) {
                    activeEditor.removePropertyListener(dirtyPropertyListener);
                }
                // register save listener
                editor.addPropertyListener(dirtyPropertyListener);

                // set as active editor
                activeEditor = editor;

                updateModel();
            }
        } else {
            if (activeEditor != null) {
                activeEditor.removePropertyListener(dirtyPropertyListener);
            }
            activeEditor = null;

            updateModel();
        }
    }

    // ------------------------------------------------------------------------

    /**
     * @return active editor
     */
    public IEditorPart getActiveEditor() {
        return activeEditor;
    }

    // ------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void dispose() {
        // unregister save listener if necessary
        if (activeEditor != null) {
            activeEditor.removePropertyListener(dirtyPropertyListener);
        }
        super.dispose();
    }

    // ------------------------------------------------------------------------

    /**
     * Updates the current model caused by changeEvent if necessary
     * 
     * @param change
     */
    synchronized void updateModel() {
        if (activeEditor != null) {
            sourceModel = KiCoModelViewManager.getModelFromModelEditor(activeEditor);

            // Check if source model is read correctly
            if (sourceModel == null) {
                return;
            }
            
            // Update the KLighD view asynchronously
            new UIJob("Updating SCCharts Dependency View") {

                @Override
                public IStatus runInUIThread(IProgressMonitor monitor) {
                    updateDiagram(sourceModel);
                    return Status.OK_STATUS;
                }
            }.schedule();
        }
    }

 
    private void updateDiagram(final EObject model) {
        try {
            boolean initialize = false;
            
            ViewContext vc = null;
            if (this.getViewer() == null || this.getViewer().getViewContext() == null) {
                // if viewer or context does not exist always init view
                initialize = true;
            } else {
                vc = this.getViewer().getViewContext();
            }

            // Check again if model is an SCChart
            if (!(model instanceof State)) {
                return;
            }
            
            State state = (State) model;
            // Do dependency calculation
            SCChartsPrioDependencyAnalysis analysis = new SCChartsPrioDependencyAnalysis();
            Dependencies dependencies = analysis.getDependencies(state);
            

            // Initialize diagram
            if (initialize) {
                // save previous synthesis options to restore later
                KlighdSynthesisProperties properties = new KlighdSynthesisProperties();
                if (vc != null) {
//                    ISynthesis synthesis = vc.getDiagramSynthesis();
//                    if (synthesis != null) {
//                        List<SynthesisOption> options = vc.getDisplayedSynthesisOptions();
//                        if (!options.isEmpty()) {
//                            HashMap<SynthesisOption, Object> optionsMap;
//                            for (SynthesisOption option : options) {
//                                if (synthesis.getDisplayedSynthesisOptions().contains(option)) {
//                                    optionsMap.put(option, vc.getOptionValue(option));
//                                }
//                            }
//                        }
//                    }
                }

                // get save options to restore
                ISynthesis synthesis =
                        Iterables.getFirst(
                                KlighdDataManager.getInstance().getAvailableSyntheses(
                                        model.getClass()), null);
                
                // the (re)initialization case
                DiagramViewManager.initializeView(this, dependencies, null, properties);
                // reset layout to resolve KISEMA-905
                resetLayoutConfig();

            } else {
                // update case (keeps options and sidebar)
                DiagramViewManager.updateView(this.getViewer().getViewContext(), dependencies);
            }

        } catch (Exception e) {
            // Fail silent
        }
    }

    // ------------------------------------------------------------------------

}
