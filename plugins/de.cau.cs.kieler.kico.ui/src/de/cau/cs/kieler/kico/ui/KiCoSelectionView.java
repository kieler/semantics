package de.cau.cs.kieler.kico.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.elk.core.util.Pair;
import org.eclipse.elk.graph.properties.IProperty;
import org.eclipse.elk.graph.properties.Property;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.progress.UIJob;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.KielerCompilerSelection;
import de.cau.cs.kieler.kico.features.Feature;
import de.cau.cs.kieler.kico.features.FeatureGroup;
import de.cau.cs.kieler.kico.internal.Transformation;
import de.cau.cs.kieler.kico.internal.TransformationDummyGraph;
import de.cau.cs.kieler.kico.ui.CompileChains.CompileChain;
import de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager.KiCoSelectionChangeEventListerner;
import de.cau.cs.kieler.kico.ui.klighd.KiCoSelectionDiagramSynthesis;
import de.cau.cs.kieler.kico.ui.klighd.TransformationFeature;
import de.cau.cs.kieler.klighd.IDiagramWorkbenchPart;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.ui.view.KlighdViewPlugin;
import de.cau.cs.kieler.klighd.util.ExpansionAwareLayoutOption;
import de.cau.cs.kieler.klighd.util.ExpansionAwareLayoutOption.ExpansionAwareLayoutOptionData;
import de.cau.cs.kieler.klighd.util.Iterables2;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties.ZoomConfigButtonsHandling;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * The Class KiCoSelectionView.
 * 
 * @author cmot
 * @kieler.design 2014-04-08 proposed
 * @kieler.rating 2014-04-08 proposed yellow
 */
public class KiCoSelectionView extends DiagramViewPart {

    /** The Constant ID. */
    static final String ID = "de.cau.cs.kieler.kico.selection";

    /** The instance. */
    static KiCoSelectionView instance;

    /** The parent. */
    Composite parent;

    public static final ImageDescriptor ICON_ADVANCED = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.ui", "icons/KiCoViewIconAuto.png");

    public static final ImageDescriptor ICON_HIERARCHY = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.ui", "icons/KiCoHierarchyIcon.png");

    public static final ImageDescriptor ICON_COMPILE = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.kico.ui", "icons/KiCoViewIconCompile.png");

    public static final ImageDescriptor ICON_EXPANDALL = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.ui", "icons/full/elcl16/expandall.png");

    public static final ImageDescriptor ICON_COLLAPSEALL = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.ui", "icons/full/elcl16/collapseall.png");

    public static final ImageDescriptor ICON_SELECTALL = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.ui",
                    "icons/KiCoViewIconSelectAll.png");

    public static final ImageDescriptor ICON_DESELECTALL = AbstractUIPlugin
            .imageDescriptorFromPlugin("de.cau.cs.kieler.kico.ui",
                    "icons/KiCoViewIconDeselectAll.png");

    /** The action for toggling the advanced mode. */
    private Action actionAdvancedToggle;

    /** The action for toggling the hierarchy mode. */
    private Action actionHierarchyToggle;

    /** The action for toggling the hierarchy mode. */
    // private Action actionCompileToggle;

    /** The action for toggling the expand mode. */
    private Action actionExpandAllToggle;

    /** The action for toggling the expand mode. */
    private Action actionSelectAllToggle;

    /** The active editor property key. */
    public static final String ACTIVE_EDITOR_PROPERTY_KEY = "de.cau.cs.kieler.kico.ui.activeEditor";

    /** The active tranformations property key. */
    public static final String ACTIVE_TRANSFORMATIONS_PROPERTY_KEY =
            "de.cau.cs.kieler.kico.ui.activeTransformations";

    /**
     * The KiCoSelectionDiagramModel per editor instance.
     */
    static HashMap<Integer, KiCoSelectionDiagramModel> knownModels =
            new HashMap<Integer, KiCoSelectionDiagramModel>();

    /** The selected compile chain per editor instance. */
    static HashMap<Integer, Integer> selectedCompileChainIndex = new HashMap<Integer, Integer>();

    /** The advanced mode auto selects required transformations. */
    public static boolean advancedMode = true;

    /** The flag for expanding or collapsing all groups. */
    public final static boolean ALL_EXPANDED_DEFAULT = false;

    /** The flag for expanding or collapsing all groups. */
    public static boolean allExpanded = ALL_EXPANDED_DEFAULT;

    /** The flag for selecting or deselecting all transformations. */
    public static boolean allSelected = true;

    /** The advanced mode auto selects required transformations. */
    public static int compileMode = 0;

    /** The hierarchy or flat diagram synthesis mode. */
    public static int hierarchyMode = 0; // 0 = hierarchy, 1 = flat, 2=flat ignoring inherited, 3=
                                         // flat groups, 4 = transformation chain
    public static final int MAXHIERARCHYMODE = 4;

    /** The last editor. */
    String lastEditorModelName = null;

    /** The last editor id (the hash code of the editor part). */
    int lastEditorId = -1;

    /** The last editor ID. */
    String lastEditorTypeID = null;

    /** The registered editors. */
    static HashMap<String, CompileChains> registeredEditors = KiCoUIPlugin.getInstance()
            .getRegisteredEditors();

    /** Holds the last used workbench part reference. */
    private IWorkbenchPartReference lastWorkbenchPartReference;

    /** The combobox for displaying and selecting configurations. */
    private CompileChainCombo combo;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new ki co selection view.
     */
    public KiCoSelectionView() {
        super();
        instance = this;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the view context.
     * 
     * @param iViewer
     *            the new view context
     */
    public void setViewContext(final IViewer iViewer) {
        this.getViewer().getContextViewer().setModel(iViewer);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the selection model or creates one (with the currently active opened model) if no one
     * exists.
     * 
     * @param editorID
     *            the editor id
     * @return the selection model
     */
    public static KiCoSelectionDiagramModel getSelectionModel(int editorID) {
        if (!KiCoSelectionView.knownModels.containsKey(editorID)) {
            // We now have toe create a new selection model an a compiler context (which includes
            // the selection)
            KielerCompilerSelection selection = new KielerCompilerSelection("");

            EObject model = KiCoUIPlugin.getActiveModel();

            KielerCompilerContext context = new KielerCompilerContext(selection, model);

            KiCoSelectionDiagramModel selectionModel = new KiCoSelectionDiagramModel(context);
            KiCoSelectionView.knownModels.put(editorID, selectionModel);
        }
        return KiCoSelectionView.knownModels.get(editorID);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Updates visible transformations. This method is called by the compile chain selection combo.
     * 
     * @param comboIndex
     *            the combo index
     */
    public void updateVisibleFeatures(int selectedIndex) {
        // Clear cache
        KiCoSelectionAction.clearCache();
        // lastEditorId = -1;
        // lastEditorModelName = "";

        String editorID = this.lastEditorTypeID;
        setSelectedCompileChainIndex(lastEditorId, selectedIndex);
        CompileChains compileChain = registeredEditors.get(editorID);
        CompileChain item = compileChain.getItems().get(selectedIndex);
        List<String> visibleFeatures = item.features;
        List<String> preferredTransformations = item.preferred;
        updateView(getActiveEditorID(), visibleFeatures, preferredTransformations);
    }

    // -------------------------------------------------------------------------

    /**
     * Update compile chain combo. This method needs to be called after another editor is selected
     * and the selection possibly changes.
     */
    public void updateCompileChainCombo(String editorTypeID, int editorId) {
        CompileChains compileChain = registeredEditors.get(editorTypeID);
        if (compileChain != null && compileChain.getCount() > 1) {
            int selectedIndex = getSelectedCompileChainIndex(editorId);
            if (compileChain.getCount() > 1) {
                combo.setVisible(true);
            } else {
                combo.setVisible(false);
                selectedIndex = 0;
            }
            combo.update(compileChain.getLabels(), selectedIndex);
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Gets the selected compile chain as an index.
     * 
     * @param editorModelName
     *            the editor id
     * @return the selected compile chain index
     */
    public static int getSelectedCompileChainIndex(int editorId) {
        KiCoSelectionView.selectedCompileChainIndex.get(editorId);
        if (!KiCoSelectionView.selectedCompileChainIndex.containsKey(editorId)) {
            int defaultIndex = 0;
            KiCoSelectionView.selectedCompileChainIndex.put(editorId, defaultIndex);
        }
        return KiCoSelectionView.selectedCompileChainIndex.get(editorId).intValue();
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the selected compile chain for an editor.
     * 
     * @param editorID
     *            the editor id
     * @param index
     *            the index
     */
    public static void setSelectedCompileChainIndex(int editorID, int index) {
        KiCoSelectionView.selectedCompileChainIndex.put(editorID, index);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if a selected transformation is enabled.
     * 
     * @param featureId
     *            the transformation dummy id
     * @param selectedList
     *            the selected list
     * @return true, if is selected transformation
     */
    public static boolean isSelectedTransformationDisabled(String featureId,
            List<String> selectedList) {
        for (String transformationID : selectedList) {
            if (transformationID.startsWith("!")) {
                transformationID = transformationID.substring(1);
                if (transformationID.equals(featureId.replace("!", ""))) {
                    return true;
                }
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Tries to resolve the Feature or TransformationFeature by its Id.
     * 
     * @param featureId
     *            the feature id
     * @return the feature
     */
    public static Feature resolveFeature(String featureId) {
        // Return a feature directly
        Feature returnFeature = null;
        if (!featureId.startsWith("T_")) {
            returnFeature = KielerCompiler.getFeature(featureId);
        } else {
            // Or if this was no feature, try resolving a TransformationFeature
            Transformation transformation =
                    KielerCompiler.getTransformation(featureId.substring(2));
            returnFeature = KiCoSelectionDiagramSynthesis.getTransformationFeature(transformation);
        }
        return returnFeature;
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the required transformation visualization if the advanced mode is turned on. Also if
     * advanced mode is off selecting a feature group might mean selecting several features so this
     * runs also when advanced mode is off.
     * 
     * @param editorID
     *            the editor id
     */
    public static void addRequiredTransformationVisualization(int editorID) {
        KiCoSelectionDiagramModel selectionModel = getSelectionModel(editorID);
        KielerCompilerContext compilerContext = selectionModel.getContext();
        KielerCompilerSelection selection = compilerContext.getSelection();
        // Update the actual advanced mode here
        // This might influence the auto select results:
        // if OFF: only consider feature groups
        // if ON: also consider produce dependencies & model features
        compilerContext.setAdvancedSelect(advancedMode);
        // Ensure to use the correct active model
        compilerContext.setTransformationObject(KiCoUIPlugin.getActiveModel());
        // EObject testObject2 = compilerContext.getTransformationObject();
        Set<Feature> autoSelectedFeatures =
                compilerContext.recomputeTransformationChain(true).getAutoSelectedFeatures(false);

        ViewContext context = instance.getViewer().getViewContext();
        for (Feature autoSelectedFeature : autoSelectedFeatures) {
            if (autoSelectedFeature.isAlternative()) {
                // Maybe additionally colorize transformation (respecting preferences)
                // if a transformation is not already selected
                Transformation transformation =
                        TransformationDummyGraph.getTransformationHandlingFeature(
                                autoSelectedFeature.getId(), selection, null);
                if (transformation != null
                        && !selection.isTransformationSelected(transformation.getId())) {
                    TransformationFeature transformationFeature =
                            KiCoSelectionDiagramSynthesis.getTransformationFeature(transformation);
                    KiCoSelectionAction.colorize(transformationFeature, context,
                            KiCoSelectionAction.AUTOSELECT);
                }
            }
            KiCoSelectionAction.colorize(autoSelectedFeature, context,
                    KiCoSelectionAction.AUTOSELECT);
        }
    }

    //
    // -------------------------------------------------------------------------

    /**
     * Possibly update model if visualization of transformation chain only otherwise do nothing.
     */
    public void possiblyUpdateModel() {
        // if visualization chain model, then update the whole model!
        if (hierarchyMode == 4) {
            // Clear cache
            KiCoSelectionAction.clearCache();

            lastEditorId = -1;
            lastEditorModelName = "";

            updateView(lastWorkbenchPartReference);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the selected transformation visualization.
     * 
     * @param editorID
     *            the editor id
     */
    public static void updateSelectionTransformationVisualization(int editorId) {
        KiCoSelectionDiagramModel selectionModel = getSelectionModel(editorId);
        KielerCompilerSelection selection = selectionModel.getContext().getSelection();
        ViewContext context = instance.getViewer().getViewContext();

        // First set the normal color for all features
        for (Feature visibleFeature : KiCoSelectionDiagramSynthesis.getVisibleFeatures()) {
            KiCoSelectionAction.colorize(visibleFeature, context, KiCoSelectionAction.NORMAL);
        }

        // This must run in advanced mode ON and OFF, because of possibly selected feature groups
        KiCoSelectionView.addRequiredTransformationVisualization(editorId);

        for (String selected : selection.getSelectedFeatureAndTransformationIds()) {
            Feature feature = resolveFeature(selected);
            KiCoSelectionAction.colorize(feature, context, KiCoSelectionAction.SELECT);
        }
        for (String selected : selection.getDisabledTransformationIds()) {
            Transformation transformation = KielerCompiler.getTransformation(selected);
            Feature feature = transformation.getExpandsFeature();
            if (feature.isAlternative()) {
                // resolve a TransformationFeature instead
                feature = resolveFeature("T_" + selected);
            }
            KiCoSelectionAction.colorize(feature, context, KiCoSelectionAction.DISABLE);
        }
        
//        // Restore if nothing is selected
//        if (selection.getSelectedFeatureAndTransformationIds().size() == 0) {
//            // Restore old KIEM value
//            IEditorPart editorPart = KiemPlugin.getOpenedModelEditors()
//                    .get(new Path("de.cau.cs.kieler.kico.klighd.sourceModel"));
//            if (editorPart != null) {
//                IPath inputModelPath = ModelUtil.getInputModelPath(editorPart);
//                KiemPlugin.setCurrentModelFile(inputModelPath);
//            }
//        }
 
    }

    // -------------------------------------------------------------------------
    // HELPER METHODS FOR SELETION, DESELECTION
    // -------------------------------------------------------------------------

    /**
     * Checks if a feature or transformation (feature) is selected.
     * 
     * @param feature
     *            the feature
     * @param selection
     *            the selection
     * @return true, if is selected feature
     */
    public static boolean isSelectedFeature(Feature feature, KielerCompilerSelection selection) {
        String id = feature.getId();
        if (feature instanceof TransformationFeature) {
            id = "T_" + id;
        }
        return selection.getSelectedFeatureAndTransformationIds().contains(id);
    }

    // -------------------------

    /**
     * Selects a feature or transformation feature. If the feature was disabled, then enable it
     * first.
     * 
     * @param feature
     *            the feature
     * @param selection
     *            the selection
     * @param context
     *            the context
     */
    public static void selectFeature(Feature feature, KielerCompilerSelection selection,
            ViewContext context) {
        if (!isSelectedFeature(feature, selection)) {
            if (isDisabledTransformation(feature, selection)) {
                enableTransformation(feature, selection, context);
            }
            String id = feature.getId();
            if (feature instanceof TransformationFeature) {
                id = "T_" + id;
            }
            KielerCompilerSelection.add(id, selection.getSelectedFeatureAndTransformationIds(),
                    true);
            updateSelectionTransformationVisualization(getActiveEditorID());
            // KiCoSelectionAction.colorize(feature, context, KiCoSelectionAction.SELECT);
        }
    }

    // -------------------------

    /**
     * Unselects a feature or transformation feature.
     * 
     * @param feature
     *            the feature
     * @param selection
     *            the selection
     * @param context
     *            the context
     */
    public static void unselectFeature(Feature feature, KielerCompilerSelection selection,
            ViewContext context) {
        if (isSelectedFeature(feature, selection)) {
            String id = feature.getId();
            if (feature instanceof TransformationFeature) {
                id = "T_" + id;
            }
            KielerCompilerSelection.remove(id, selection.getSelectedFeatureAndTransformationIds());
            // KiCoSelectionAction.colorize(feature, context, KiCoSelectionAction.NORMAL);
            updateSelectionTransformationVisualization(getActiveEditorID());
        }
    }

    // -------------------------

    /**
     * Gets the transformation id for a feature where there is only a SINGLE transformation, if it
     * is a TransformationFeature (a hidden transformation) it returns the transformation id, if it
     * is an alternative feature, then return null. If it is a feature group it returns also null.
     * 
     * @param feature
     *            the feature
     * @return the transformation id
     */
    private static String getTransformationId(Feature feature) {
        if (feature instanceof FeatureGroup) {
            return null;
        }
        String featureId = feature.getId();
        String transformationId = featureId;
        if (!(feature instanceof TransformationFeature)) {
            Set<Transformation> transformations = feature.getExpandingTransformations();
            if (!transformations.isEmpty()) {
                transformationId = transformations.iterator().next().getId();
            }
        } else if (feature.isAlternative()) {
            return null;
        }
        return transformationId;
    }

    // -------------------------

    /**
     * Checks if a single transformation for a feature or a concrete transformation of an
     * alternative is disabled.
     * 
     * @param feature
     *            the feature
     * @param selection
     *            the selection
     * @return true, if is disabled transformation
     */
    public static boolean isDisabledTransformation(Feature feature,
            KielerCompilerSelection selection) {
        String transformationId = getTransformationId(feature);
        if (transformationId == null) {
            return false;
        }
        return selection.getDisabledTransformationIds().contains(transformationId);
    }

    // -------------------------

    /**
     * Disable a transformation (TransformationFeature) or a feature that has onlye one handling
     * transformation. If the feature was selected, then unselect it first!
     * 
     * @param feature
     *            the feature
     * @param selection
     *            the selection
     * @param context
     *            the context
     */
    public static void disableTransformation(Feature feature, KielerCompilerSelection selection,
            ViewContext context) {
        if ((!feature.isAlternative()) && !isDisabledTransformation(feature, selection)) {
            if (isSelectedFeature(feature, selection)) {
                unselectFeature(feature, selection, context);
            }
            String transformationId = getTransformationId(feature);
            KielerCompilerSelection.add(transformationId, selection.getDisabledTransformationIds(),
                    true);
            // KiCoSelectionAction.colorize(feature, context, KiCoSelectionAction.DISABLE);
            updateSelectionTransformationVisualization(getActiveEditorID());
        }
    }

    // -------------------------

    /**
     * Enable a transformation (TransformationFeature) or a feature that has only one handling
     * transformation.
     * 
     * @param feature
     *            the feature
     * @param selection
     *            the selection
     * @param context
     *            the context
     */
    public static void enableTransformation(Feature feature, KielerCompilerSelection selection,
            ViewContext context) {
        if ((!feature.isAlternative()) && isDisabledTransformation(feature, selection)) {
            String transformationId = getTransformationId(feature);
            KielerCompilerSelection.remove(transformationId,
                    selection.getDisabledTransformationIds());
            // KiCoSelectionAction.colorize(feature, context, KiCoSelectionAction.NORMAL);
            updateSelectionTransformationVisualization(getActiveEditorID());
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Update view on close clears the cache for registered Editors to ensure that if you open the
     * model again no strange behavior occurs.
     * 
     * @param ref
     *            the ref
     */
    public void updateViewOnClose(IWorkbenchPartReference ref) {
        if (ref != null) {
            IWorkbenchPart part = ref.getPart(true);

            if (part instanceof EditorPart) {
                EditorPart editorPart = (EditorPart) part;
                // String partName = (editorPart).getPartName();

                boolean clearAll = false;
                // Only in the following case we want to clear all because no editor is opened,
                // otherwise we (before) switched to another
                // opened editor. Note that updateView() is called BEFORE updateViewOnClose() by
                // Eclipse.
                int currentEditorId = getEditorID(editorPart);
                if (lastEditorId == currentEditorId) {
                    // if (lastEditorModelName == partName) {
                    clearAll = true;
                    // Clear last editor because we closed it
                    lastEditorModelName = "";
                    lastEditorTypeID = "";
                    lastEditorId = -1;
                    // Next view is collapsed again
                    allExpanded = ALL_EXPANDED_DEFAULT;
                    if (allExpanded) {
                        actionExpandAllToggle.setImageDescriptor(ICON_COLLAPSEALL);
                        actionExpandAllToggle
                                .setToolTipText("Collapse all expanded transformation groups.");
                    } else {
                        actionExpandAllToggle.setImageDescriptor(ICON_EXPANDALL);
                        actionExpandAllToggle
                                .setToolTipText("Expand all collapsed transformation groups.");
                    }
                }

                // Clear all selections
                int activeEditorID = getEditorID(editorPart);
                KiCoSelectionDiagramModel selectionModel = getSelectionModel(activeEditorID);
                selectionModel.getContext().getSelection().clear();

                // while (selectedAndExcludedTransformations.size() > 0) {
                // String transformationID = selectedAndExcludedTransformations.get(0);
                // removeSelectedTransformation(transformationID, activeEditorID);
                // }

                if (clearAll) {
                    notifySelectionChangeEventListener();
                    // Clear cache
                    KiCoSelectionAction.clearCache();
                }
            }
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    private void updateView(int activeEditorID, List<String> visibleFeatureIds,
            List<String> preferrdTransformationIds) {
        // Next view is collapsed again
        allExpanded = ALL_EXPANDED_DEFAULT;
        if (allExpanded) {
            actionExpandAllToggle.setImageDescriptor(ICON_COLLAPSEALL);
            actionExpandAllToggle.setToolTipText("Collapse all expanded transformation groups.");
        } else {
            actionExpandAllToggle.setImageDescriptor(ICON_EXPANDALL);
            actionExpandAllToggle.setToolTipText("Expand all collapsed transformation groups.");
        }

        // Update the visible view model
        KiCoSelectionDiagramModel selectionModel = getSelectionModel(activeEditorID);
        selectionModel.setVisibleFeatures(KielerCompiler.getFeatures(), KielerCompiler.getTransformations(), visibleFeatureIds);
        // Update preferred transformations
        selectionModel.getContext().getSelection().getPreferredTransformationIds().clear();
        for (String elementId : preferrdTransformationIds) {
            KielerCompilerSelection.add(elementId, selectionModel.getContext().getSelection()
                    .getPreferredTransformationIds(), false);
        }

        KlighdSynthesisProperties properties = new KlighdSynthesisProperties();

        if (hierarchyMode == 0) {
            // Enable collapse/expand
            getActionExpandAll().setEnabled(true);
        } else {
            // Disable collapse/expand
            getActionExpandAll().setEnabled(false);
        }

        if (hierarchyMode == 0) {
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
                    "de.cau.cs.kieler.kico.ui.klighd.KiCoSelectionDiagramSynthesis");
        } else if (hierarchyMode == 1) {
            de.cau.cs.kieler.kico.ui.klighd.KiCoSelectionDiagramFlatSynthesis.IGNORE_INHERITED_DEPENDENCIES =
                    false;
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
                    "de.cau.cs.kieler.kico.ui.klighd.KiCoSelectionDiagramFlatSynthesis");
        } else if (hierarchyMode == 2) {
            de.cau.cs.kieler.kico.ui.klighd.KiCoSelectionDiagramFlatSynthesis.IGNORE_INHERITED_DEPENDENCIES =
                    true;
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
                    "de.cau.cs.kieler.kico.ui.klighd.KiCoSelectionDiagramFlatSynthesis");
        } else if (hierarchyMode == 3) {
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
                    "de.cau.cs.kieler.kico.ui.klighd.KiCoSelectionDiagramFlatGroupsSynthesis");
        } else {
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
                    "de.cau.cs.kieler.kico.ui.klighd.KiCoSelectionDiagramChainSynthesis");
        }

       // NO incremental update possible due to the fact that KiCo.UI currently
       // has its own mapping to concrete instances.
       // TODO: do not use such a mapping and better use rendering annotations instead in
       // the future
       properties.setProperty(KlighdSynthesisProperties.REQUESTED_UPDATE_STRATEGY,
              "de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy");

        
        // Hide zoom buttons
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_ZOOM_CONFIG_BUTTONS_HANDLING,
                ZoomConfigButtonsHandling.HIDE);

        // Set the selection view model
        updateDiagram(selectionModel, properties);

        // KiCoSelectionView.addSelectedTransformationVisualization(activeEditorID);
        updateSelectionTransformationVisualization(activeEditorID);

        // notify listeners about currently active transformations
        notifySelectionChangeEventListener();
    }

    // -------------------------------------------------------------------------

    /**
     * Update view.
     * 
     * @param ref
     *            the ref
     */
    public void updateView(IWorkbenchPartReference ref) {

        if (ref != null) {
            IWorkbenchPart part = ref.getPart(true);
            String editorTypeID = ref.getId();
            if (registeredEditors.containsKey(editorTypeID)) {
                if (part instanceof EditorPart) {
                    EditorPart editorPart = (EditorPart) part;
                    String currentPartName = (editorPart).getPartName();
                    int currentEditorId = getEditorID(editorPart);

                    updateCompileChainCombo(editorTypeID, currentEditorId);
                    int selectedIndex = getSelectedCompileChainIndex(currentEditorId);
                    CompileChains compileChain = registeredEditors.get(editorTypeID);
                    CompileChain item = compileChain.getItems().get(selectedIndex);
                    List<String> visibleFeatures = item.features;
                    List<String> preferredTransformations = item.preferred;

                    if (currentEditorId != lastEditorId) {
                        lastEditorId = currentEditorId;
                        lastEditorModelName = currentPartName;
                        lastEditorTypeID = editorTypeID;
                        // Enforce recomputation of kllighd element cache
                        KiCoSelectionAction.clearCache();
                        updateView(getActiveEditorID(), visibleFeatures, preferredTransformations);
                    }
                }

                lastWorkbenchPartReference = ref;
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void createPartControl(final Composite parent) {
        super.createPartControl(parent);

        IActionBars bars = getViewSite().getActionBars();
        IToolBarManager toolBarManager = bars.getToolBarManager();

        combo = new CompileChainCombo("Compile Selection Combo box");

        toolBarManager.add(getActionSelectAll());
        toolBarManager.add(getActionExpandAll());
        toolBarManager.add(getActionAdvancedToggle());
        toolBarManager.add(getActionHierarchyToggle());
        // toolBarManager.add(getActionCompileToggle());

        toolBarManager.add(combo);

        // Create an IPartListener2
        final IPartListener2 pl = new IPartListener2() {

            public void partVisible(IWorkbenchPartReference partRef) {
                // TODO Auto-generated method stub

            }

            public void partOpened(IWorkbenchPartReference partRef) {
                // This takes care of updating the selection view even if its open AFTER the active
                // editor preventing the view from being blank
                IWorkbenchPart part = partRef.getPart(false);
                if (part != null) {
                    if (part instanceof KiCoSelectionView) {
                        updateView(partRef.getPage().getReference(
                                partRef.getPage().getActiveEditor()));
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
                updateViewOnClose(partRef);
            }

            public void partBroughtToTop(IWorkbenchPartReference partRef) {
                // TODO Auto-generated method stub

            }

            public void partActivated(IWorkbenchPartReference ref) {
                updateView(ref);
            }
        };

        // Add the IPartListener2 to the page
        final IWorkbenchPage page = this.getSite().getPage();
        page.addPartListener(pl);

        // Take care of removing part listener
        // Otherwise the listener would keep updating this view causing widget is disposed errors.
        parent.addDisposeListener(new DisposeListener() {

            public void widgetDisposed(DisposeEvent e) {
                page.removePartListener(pl);
            }
        });

    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected void addButtons() {
        // By overriding this method the KlighD view will not have any of its default buttons.
        // Instead only the following buttons will be added.
        // Zoom buttons are removed by setting SyntheisOption in updateView.

        IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
        // automatic layout button
        toolBarManager.add(new Action("Arrange", IAction.AS_PUSH_BUTTON) {
            // Constructor
            {
                setImageDescriptor(KlighdViewPlugin.getImageDescriptor("icons/full/menu16/arrange.gif"));
            }

            @Override
            public void run() {
                LightDiagramServices.layoutDiagram(instance);
            }
        });
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to toggle advanced mode.
     * 
     * @return the action
     */
    private Action getActionAdvancedToggle() {
        if (actionAdvancedToggle != null) {
            return actionAdvancedToggle;
        }
        actionAdvancedToggle = new Action("", IAction.AS_CHECK_BOX) {
            public void run() {
                if (!(KiCoSelectionView.isEditorValid())) {
                    actionAdvancedToggle.setChecked(advancedMode);
                    return;
                }
                // ACATION TOGGLE ADVANCED
                advancedMode = !advancedMode;
                actionAdvancedToggle.setChecked(advancedMode);

                // Update the auto select flag in the compiler context
                KiCoSelectionDiagramModel selectionModel = getSelectionModel(getActiveEditorID());
                KielerCompilerContext compilerContext = selectionModel.getContext();
                compilerContext.setAdvancedSelect(true);

                updateSelectionTransformationVisualization(getActiveEditorID());

                // notify listeners about currently active transformations
                notifySelectionChangeEventListener();

                // Possibly redraw model
                possiblyUpdateModel();
            }
        };
        actionAdvancedToggle.setText("Autoselect Required Transformations");
        actionAdvancedToggle.setToolTipText("Autoselects additionally required transformations");
        actionAdvancedToggle.setImageDescriptor(ICON_ADVANCED);
        actionAdvancedToggle.setChecked(advancedMode);
        return actionAdvancedToggle;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to toggle hierarchy mode.
     * 
     * @return the action
     */
    private Action getActionHierarchyToggle() {
        if (actionHierarchyToggle != null) {
            return actionHierarchyToggle;
        }
        actionHierarchyToggle = new Action("", IAction.AS_PUSH_BUTTON) {
            public void run() {
                if (!(KiCoSelectionView.isEditorValid())) {
                    return;
                }
                // ACTION TOGGLE MODE
                hierarchyMode = hierarchyMode + 1;
                if (hierarchyMode > MAXHIERARCHYMODE) {
                    hierarchyMode = 0;
                }
                // Clear cache
                KiCoSelectionAction.clearCache();

                lastEditorId = -1;
                lastEditorModelName = "";

                updateView(lastWorkbenchPartReference);
            }
        };
        actionHierarchyToggle.setText("Toggle Hierarchical/Flat View");
        actionHierarchyToggle
                .setToolTipText("Toggle between a hiearchical and a flat view of the dependencies.");
        actionHierarchyToggle.setImageDescriptor(ICON_HIERARCHY);
        return actionHierarchyToggle;
    }

    // -------------------------------------------------------------------------

    /**
     * The layout option singleton (similar to those in
     * {@link de.cau.cs.kieler.kiml.options.LayoutOptions LayoutOptions}.<br>
     * Its id is also registered in the plugin.xml.
     */
    public static final IProperty<ExpansionAwareLayoutOptionData> EXPANDABLE =
            new Property<ExpansionAwareLayoutOption.ExpansionAwareLayoutOptionData>(
                    "de.cau.cs.kieler.kico.ui.expandable");

    // -------------------------------------------------------------------------

    /**
     * Gets the action to select or deselect all nodes.
     * 
     * @return the action
     */
    private Action getActionSelectAll() {
        if (actionSelectAllToggle != null) {
            return actionSelectAllToggle;
        }

        // final IDiagramWorkbenchPart thisPart = this;
        actionSelectAllToggle = new Action("", IAction.AS_PUSH_BUTTON) {
            public void run() {
                if (!(KiCoSelectionView.isEditorValid())) {
                    return;
                }
                // ACTION SELECT ALL / NONE
                int activeEditorID = getActiveEditorID();
                KiCoSelectionDiagramModel selectionModel = getSelectionModel(activeEditorID);
                selectionModel.getContext().getSelection().getDisabledProcessorOptionIds().clear();
                selectionModel.getContext().getSelection().getEnabledProcessorOptionIds().clear();
                selectionModel.getContext().getSelection().getDisabledTransformationIds().clear();
                // De-select all
                selectionModel.getContext().getSelection().getSelectedFeatureAndTransformationIds().clear();
                // KiCoSelectionView.addSelectedTransformationVisualization(activeEditorID);
                updateSelectionTransformationVisualization(activeEditorID);

                // Notify listeners about currently active transformations
                KiCoSelectionView.notifySelectionChangeEventListener();

                // Possibly redraw model
                possiblyUpdateModel();
            }
        };
        actionSelectAllToggle.setText("Deselect All");
        actionSelectAllToggle.setToolTipText("Deselect all transformations.");
        actionSelectAllToggle.setImageDescriptor(ICON_DESELECTALL);
        return actionSelectAllToggle;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the action to expand all nodes.
     * 
     * @return the action
     */
    private Action getActionExpandAll() {
        if (actionExpandAllToggle != null) {
            return actionExpandAllToggle;
        }

        final IDiagramWorkbenchPart thisPart = this;
        actionExpandAllToggle = new Action("", IAction.AS_PUSH_BUTTON) {
            public void run() {
                if (!(KiCoSelectionView.isEditorValid())) {
                    return;
                }
                // ACTION EXPAND / COLLAPSE
                allExpanded = !allExpanded;
                if (allExpanded) {
                    actionExpandAllToggle.setImageDescriptor(ICON_COLLAPSEALL);
                    actionExpandAllToggle
                            .setToolTipText("Collapse all expanded transformation groups.");
                } else {
                    actionExpandAllToggle.setImageDescriptor(ICON_EXPANDALL);
                    actionExpandAllToggle
                            .setToolTipText("Expand all collapsed transformation groups.");
                }
                // Perform expand or collapse action
                expandAllNodes(allExpanded);

                LightDiagramServices.layoutDiagram(thisPart);
            }
        };
        actionExpandAllToggle.setText("Expand/Collapse All");
        actionExpandAllToggle.setToolTipText("Expand all collapsed transformation groups.");
        actionExpandAllToggle.setImageDescriptor(ICON_EXPANDALL);
        return actionExpandAllToggle;
    }

    // -------------------------------------------------------------------------

    /**
     * Expand or collapse all nodes.
     * 
     * @param expand
     *            the expand
     */
    private void expandAllNodes(boolean expand) {
        final IDiagramWorkbenchPart thisPart = this;
        if (expand) {
            final IViewer viewer = thisPart.getViewer();
            for (EObject k : Iterables.filter(
                    Iterables2.toIterable(viewer.getViewContext().getViewModel().eAllContents()),
                    new Predicate<EObject>() {

                        public boolean apply(EObject arg0) {
                            return arg0 instanceof KNode && !viewer.isExpanded(arg0);
                        }
                    })) {
                // ViewContext vc = viewer.getViewContext();
                viewer.expand((KNode) k);
            }
        } else {
            // final IViewer<?> viewer = thisPart.getViewer();
            // for (EObject k : Iterables.filter(
            // Iterables2.toIterable(viewer.getViewContext().getViewModel()
            // .eAllContents()), new Predicate<EObject>() {
            //
            // public boolean apply(EObject arg0) {
            // return arg0 instanceof KNode && viewer.isExpanded(arg0);
            // }
            // })) {
            // ViewContext vc = viewer.getViewContext();
            // viewer.collapse((KNode) k);
            // }

            // Clear cache
            KiCoSelectionAction.clearCache();

            lastEditorId = -1;
            lastEditorModelName = "";
            updateView(lastWorkbenchPartReference);
        }

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
     * Gets the single instance of KiCoSelectionView.
     * 
     * @return single instance of KiCoSelectionView
     */
    public static KiCoSelectionView getInstance() {
        return instance;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the active editor.
     * 
     * @return the active editor
     */
    public static IEditorPart getActiveEditor() {
        return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                .getActiveEditor();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the active editor id that is the hashCode of the active editor part.
     * 
     * @return the active editor id
     */
    public static int getActiveEditorID() {
        return getEditorID(getActiveEditor());
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the editor id that is the hash Code of an editor part.
     * 
     * @param editorPart
     *            the editor part
     * @return the active editor id
     */
    public static int getEditorID(IEditorPart editorPart) {
        if (editorPart != null) {
            return editorPart.hashCode();
        }
        return -1;
    }

    // -------------------------------------------------------------------------

    /**
     * Updates displayed diagram in this view. Initializes this view if necessary.
     */
    private void updateDiagram(final Object model, final KlighdSynthesisProperties properties) {
        if (this.getViewer() == null || this.getViewer().getViewContext() == null) {
            // The initialization case
            // Sometimes the initialization happens too fast for klighd thus do it delayed
            final boolean allExpanded = KiCoSelectionView.allExpanded;
            new UIJob("Init" + KiCoSelectionView.class.getName()) {

                @SuppressWarnings("deprecation")
                @Override
                public IStatus runInUIThread(IProgressMonitor monitor) {
                    DiagramViewManager.initializeView(instance, model, null, properties);
                    expandAllNodes(allExpanded);
                    return Status.OK_STATUS;
                }
            }.schedule();
        } else {
            // update case
            ViewContext viewContext = this.getViewer().getViewContext();
            viewContext.configure(properties);
            DiagramViewManager.updateView(viewContext, model);
        }
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------
    // TransformationChange Event Manager
    // -------------------------------------------------------------------------

    // TODO merge with CompilerSelectionStore from kico.klighd
    
    /** Manager to handle listeners on selection change events */
    public final static KiCoSelectionChangeEventManager selectionEventManger =
            new KiCoSelectionChangeEventManager();

    // -------------------------------------------------------------------------

    /**
     * @param listener
     * @see de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager#addSelectionChangeEventListener(de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager.KiCoSelectionChangeEventListerner)
     */
    public void addSelectionChangeEventListener(KiCoSelectionChangeEventListerner listener) {
        selectionEventManger.addSelectionChangeEventListener(listener);
    }

    // -------------------------------------------------------------------------

    /**
     * @param listener
     * @see de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager#removeSelectionChangeEventListener(de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager.KiCoSelectionChangeEventListerner)
     */
    public void removeSelectionChangeEventListener(KiCoSelectionChangeEventListerner listener) {
        selectionEventManger.removeSelectionChangeEventListener(listener);
    }

    // -------------------------------------------------------------------------

    /**
     * Notifies all listeners about the new selection
     */
    static void notifySelectionChangeEventListener() {
        int id = getActiveEditorID();
        KielerCompilerSelection selection = getSelectionModel(id).getContext().getSelection();
        selectionEventManger.fireSelectionChangeEvent(id,
                selection == null || selection.equals(null) ? null
                        : new Pair<KielerCompilerSelection, Boolean>(selection.clone(), advancedMode));
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the currently active editor valid w.r.t. eligamility of selecting/unselecting.
     * Otherwiese selection actions should be prevented.
     * 
     * @return true, if is editor valid
     */
    public static boolean isEditorValid() {
        if (KiCoSelectionView.getActiveEditor() == null) {
            return false;
        }
        if (KiCoUIPlugin.getActiveModel() == null) {
            return false;
        }
        if (KiCoSelectionView.getSelectionModel(KiCoSelectionView.getActiveEditorID()) != null) {
            return true;
        }
        return false;
    }

    // -------------------------------------------------------------------------
}
