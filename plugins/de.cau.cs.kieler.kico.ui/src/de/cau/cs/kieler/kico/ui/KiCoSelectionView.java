package de.cau.cs.kieler.kico.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Combo;
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

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.TransformationDummy;
import de.cau.cs.kieler.kico.ui.CompileChains.CompileChain;
import de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager.KiCoSelectionChangeEventListerner;
import de.cau.cs.kieler.kico.ui.klighd.KiCoDiagramSynthesis;
import de.cau.cs.kieler.kiml.ui.KimlUiPlugin;
import de.cau.cs.kieler.klighd.IDiagramWorkbenchPart;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.util.ExpansionAwareLayoutOption;
import de.cau.cs.kieler.klighd.util.ExpansionAwareLayoutOption.ExpansionAwareLayoutOptionData;
import de.cau.cs.kieler.klighd.util.Iterables2;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties.ZoomConfigButtonsHandling;

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
            .imageDescriptorFromPlugin("org.eclipse.ui", "icons/full/elcl16/expandall.gif");

    public static final ImageDescriptor ICON_COLLAPSEALL = AbstractUIPlugin
            .imageDescriptorFromPlugin("org.eclipse.ui", "icons/full/elcl16/collapseall.gif");

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
     * The KielerCompiler contexts including graph model of TransformationDummys per editor
     * instance.
     */
    static HashMap<Integer, KielerCompilerContext> knownContexts =
            new HashMap<Integer, KielerCompilerContext>();

    /** The selected transformations per editor instance. */
    static HashMap<Integer, List<String>> selectedAndDisabledTransformations =
            new HashMap<Integer, List<String>>();
    
    /** The selected compile chain per editor instance. */
    static HashMap<String, Integer> selectedCompileChainIndex = new HashMap<String, Integer>();

    /** The auto-calculated required transformations per editor instance. */
    static HashMap<Integer, List<String>> requiredTransformations =
            new HashMap<Integer, List<String>>();

    /** The advaned mode auto selects required transformations. */
    public static boolean advancedMode = true;

    /** The flag for expanding or collapsing all groups. */
    public static boolean allExpanded = false;

    /** The flag for selecting or deselecting all transformations. */
    public static boolean allSelected = false;

    /** The advaned mode auto selects required transformations. */
    public static int compileMode = 0;
    public static final int COMPILEMODEMAX = 5; // 5 stages of compilation

    /** The hierarchy or flat diagram synthesis mode. */
    public static int hierarchyMode = 0; // 0 = hierarchy, 1 = flat & no groups, 2 = flat
    public static final int MAXHIERARCHYMODE = 2;

    /** The last editor. */
    String lastEditor = null;

    /** The last editor ID. */
    String lastEditorID = null;

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

    /**
     * Gets the selected transformations as a list of Strings of their IDs.
     * 
     * @param editorID
     *            the editor id
     * @return the selected transformations
     */
    public static List<String> getSelectedAndDisabledTransformations(int editorID) {
        if (!KiCoSelectionView.selectedAndDisabledTransformations.containsKey(editorID)) {
            List<String> selectedList = new ArrayList<String>();
            KiCoSelectionView.selectedAndDisabledTransformations.put(editorID, selectedList);
        }
        return KiCoSelectionView.selectedAndDisabledTransformations.get(editorID);
    }

    // -------------------------------------------------------------------------
   
    /**
     * Gets the selected transformations as a list of Strings of their IDs.
     * 
     * @param editorID
     *            the editor id
     * @return the selected transformations
     */
    public static List<String> getSelectedTransformations(int editorID) {
        List<String> selectedAndDisabledList =  getSelectedAndDisabledTransformations(editorID);
        List<String> returnList = new ArrayList<String>();
        for (String selectedAndDisabled : selectedAndDisabledList) {
            if (!selectedAndDisabled.startsWith("!")) {
                returnList.add(selectedAndDisabled);
            }
        }
        return returnList;
    }

    /**
     * Gets the disabled transformations as a list of Strings of their IDs.
     * 
     * @param editorID
     *            the editor id
     * @return the selected transformations
     */
    public static List<String> getDisabledTransformations(int editorID) {
        List<String> selectedAndDisabledList =  getSelectedAndDisabledTransformations(editorID);
        List<String> returnList = new ArrayList<String>();
        for (String selectedAndDisabled : selectedAndDisabledList) {
            if (selectedAndDisabled.startsWith("!")) {
                returnList.add(selectedAndDisabled.substring(1));
            }
        }
        return returnList;
    }


    

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Updates visible transformations. This method is called by the compile chain selection combo.
     *
     * @param comboIndex the combo index
     */
    public void updateVisibleTransformations(int selectedIndex) {
        String editorID = this.lastEditorID;
        setSelectedCompileChainIndex(lastEditor, selectedIndex);
        CompileChains compileChain = registeredEditors.get(editorID);
        CompileChain item = compileChain.getItems().get(selectedIndex);
        List<String> visibleTransformations = item.transformations;
        updateView(getActiveEditorID(), visibleTransformations);
    }
    
    /**
     * Update compile chain combo. This method needs to be called after another
     * editor is selected and the selection possibly changes.
     */
    public void updateCompileChainCombo(String editorTypeID, String editor) {
        CompileChains compileChain = registeredEditors.get(editorTypeID);
        if (compileChain != null && compileChain.getCount() > 1) {
            int selectedIndex = getSelectedCompileChainIndex(editor);
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
     * @param editorID
     *            the editor id
     * @return the selected compile chain index
     */
    public static int getSelectedCompileChainIndex(String editorID) {
        KiCoSelectionView.selectedCompileChainIndex.get(editorID);
        if (!KiCoSelectionView.selectedCompileChainIndex.containsKey(editorID)) {
            int defaultIndex = 0;
            KiCoSelectionView.selectedCompileChainIndex.put(editorID, defaultIndex);
        }
        return KiCoSelectionView.selectedCompileChainIndex.get(editorID).intValue();
    }

    // -------------------------------------------------------------------------
    
    /**
     * Sets the selected compile chain for an editor.
     *
     * @param editorID the editor id
     * @param index the index
     */
    public static void setSelectedCompileChainIndex(String editorID, int index) {
        KiCoSelectionView.selectedCompileChainIndex.put(editorID, index);
    }
    
    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Checks if a transformation is selected.
     * 
     * @param transformationDummyID
     *            the transformation dummy id
     * @param editorID
     *            the editor id
     * @return true, if is selected transformation
     */
    public static boolean isSelectedTransformation(String transformationDummyID, int editorID) {
        return isSelectedTransformation(transformationDummyID, getSelectedAndDisabledTransformations(editorID));
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if a transformation is selected.
     * 
     * @param transformationDummyID
     *            the transformation dummy id
     * @param selectedList
     *            the selected list
     * @return true, if is selected transformation
     */
    public static boolean isSelectedTransformation(String transformationDummyID,
            List<String> selectedList) {
        for (String transformationID : selectedList) {
            if (transformationID.startsWith("!")) {
                transformationID = transformationID.substring(1);
            }
            if (transformationID.equals(transformationDummyID)) {
                return true;
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if a selected transformation is enabled.
     * 
     * @param transformationDummyID
     *            the transformation dummy id
     * @param editorID
     *            the editor id
     * @return true, if is selected transformation
     */
    public static boolean isSelectedTransformationDisabled(String transformationDummyID,
            int editorID) {
        return isSelectedTransformationDisabled(transformationDummyID,
                getSelectedAndDisabledTransformations(editorID));
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if a selected transformation is enabled.
     * 
     * @param transformationDummyID
     *            the transformation dummy id
     * @param selectedList
     *            the selected list
     * @return true, if is selected transformation
     */
    public static boolean isSelectedTransformationDisabled(String transformationDummyID,
            List<String> selectedList) {
        for (String transformationID : selectedList) {
            if (transformationID.startsWith("!")) {
                transformationID = transformationID.substring(1);
                if (transformationID.equals(transformationDummyID.replace("!", ""))) {
                    return true;
                }
            }
        }
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the transformation to be selected.
     * 
     * @param transformationDummyID
     *            the transformation dummy id
     * @param editorID
     *            the editor id
     * @param enabled
     *            the enabled
     */
    public static void addSelectedTransformation(String transformationDummyID, int editorID,
            boolean enabled) {
        addSelectedTransformation(transformationDummyID, getSelectedAndDisabledTransformations(editorID),
                enabled);
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the transformation to be selected.
     * 
     * @param transformationDummyID
     *            the transformation dummy id
     * @param selectedList
     *            the selected list
     */
    public static void addSelectedTransformation(String transformationDummyID,
            List<String> selectedList, boolean enabled) {
        removeSelectedTransformation(transformationDummyID, selectedList);
        if (!enabled) {
            transformationDummyID = "!" + transformationDummyID;
        }
        selectedList.add(transformationDummyID);
    }

    // -------------------------------------------------------------------------

    /**
     * Removes the transformation from the list of selected transformations.
     * 
     * @param transformationDummyID
     *            the transformation dummy id
     * @param editorID
     *            the editor id
     */
    public static void removeSelectedTransformation(String transformationDummyID, int editorID) {
        removeSelectedTransformation(transformationDummyID, getSelectedAndDisabledTransformations(editorID));
    }

    // -------------------------------------------------------------------------

    /**
     * Removes the transformation from the list of selected transformations.
     * 
     * @param transformationDummyID
     *            the transformation dummy id
     * @param selectedList
     *            the selected list
     */
    public static void removeSelectedTransformation(String transformationDummyID,
            List<String> selectedList) {
        int found = -1;
        for (String transformationID : selectedList) {
            String enabledTransformationID = transformationID;
            if (enabledTransformationID.startsWith("!")) {
                enabledTransformationID = enabledTransformationID.substring(1);
            }
            if (enabledTransformationID.equals(transformationDummyID)) {
                found = selectedList.indexOf(transformationID);
                break;
            }
        }
        if (found > -1) {
            selectedList.remove(found);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets and possibly recalculated the additionally required transformations as a list of Strings
     * of their IDs.
     * 
     * @param editorID
     *            the editor id
     * @return the selected transformations
     */
    public static List<String> getRequiredTransformations(int editorID) {
        return getRequiredTransformations(editorID, false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets and possibly recalculated the additionally required transformations as a list of Strings
     * of their IDs.
     * 
     * @param editorID
     *            the editor id
     * @param recalculate
     *            the recalculate
     * @return the selected transformations
     */
    public static List<String> getRequiredTransformations(int editorID, boolean recalculate) {
        if (!KiCoSelectionView.requiredTransformations.containsKey(editorID)) {
            List<String> requiredList = new ArrayList<String>();
            KiCoSelectionView.requiredTransformations.put(editorID, requiredList);
        }
        List<String> requiredList = KiCoSelectionView.requiredTransformations.get(editorID);

        if (recalculate) {
            requiredList.clear();
            List<String> selectedTransformations = getSelectedTransformations(editorID);
            List<String> disabledTransformations = getDisabledTransformations(editorID);
            List<String> allRequiredTransformations =
                    KielerCompiler.calculatePreRequirements(selectedTransformations,
                            disabledTransformations, false);
            for (String requiredTransformation : allRequiredTransformations) {
                boolean found = false;
                for (String selectedTransformation : selectedTransformations) {
                    if (selectedTransformation.equals(requiredTransformation)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    // if this is a required transformation ONLY (which is not selected) then add it
                    requiredList.add(requiredTransformation);
                }
            }
        }

        return requiredList;

    }

    // -------------------------------------------------------------------------

    /**
     * Gets the KielerCompiler context (with the graph of TransformationDummies) for an editor.
     * 
     * @param editorID
     *            the editor id
     * @return the model
     */
    public static KielerCompilerContext getKielerCompilerContext(int editorID) {
        if (knownContexts.containsKey(editorID)) {
            return knownContexts.get(editorID);
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Tries to resolve transformation dummy by its ID and the current editor.
     * 
     * @param transformationID
     *            the transformation id
     * @param editorID
     *            the editor id
     * @return the transformation dummy
     */
    public static TransformationDummy resolveTransformationDummy(String transformationID,
            int editorID) {
        KielerCompilerContext context = getKielerCompilerContext(editorID);
        if (context != null) {
            for (TransformationDummy transformationDummy : context.getGraph()) {
                if (transformationDummy.id.equals(transformationID)) {
                    return transformationDummy;
                } else if (transformationDummy.id.equals(transformationID.replace("!", ""))) {
                    return transformationDummy;
                }
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Removes the required transformation visualization.
     * 
     * @param editorID
     *            the editor id
     */
    public static void removeRequiredTransformationVisualization(int editorID) {
        List<String> requiredTransformations =
                KiCoSelectionView.getRequiredTransformations(editorID, true);
        ViewContext context = instance.getViewer().getViewContext();
        for (String requiredTransformationID : requiredTransformations) {
            TransformationDummy requiredTransformationDummy =
                    resolveTransformationDummy(requiredTransformationID,
                            KiCoSelectionView.getActiveEditorID());
            if (requiredTransformationDummy != null) {
                if (!isSelectedTransformationDisabled(requiredTransformationID, editorID)) {
                    KiCoKlighdAction.setLabelColor(requiredTransformationDummy, context,
                            KiCoDiagramSynthesis.BLACK, KiCoDiagramSynthesis.BLUE1);
                    KiCoKlighdAction.setStateColor(requiredTransformationDummy, context,
                            KiCoDiagramSynthesis.BLUE1, KiCoDiagramSynthesis.BLUE2);
                }
            }
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Adds the required transformation visualization if the advanced mode is turned on.
     * 
     * @param editorID
     *            the editor id
     */
    public static void addRequiredTransformationVisualization(int editorID) {
        if (advancedMode) {
            List<String> requiredTransformations =
                    KiCoSelectionView.getRequiredTransformations(editorID, true);
            ViewContext context = instance.getViewer().getViewContext();
            for (String requiredTransformationID : requiredTransformations) {
                TransformationDummy requiredTransformationDummy =
                        resolveTransformationDummy(requiredTransformationID, editorID);
                if (requiredTransformationDummy != null) {
                    if (!isSelectedTransformationDisabled(requiredTransformationID, editorID)) {
                        KiCoKlighdAction.setLabelColor(requiredTransformationDummy, context,
                                KiCoDiagramSynthesis.WHITE, KiCoDiagramSynthesis.BLUE3b);
                        KiCoKlighdAction.setStateColor(requiredTransformationDummy, context,
                                KiCoDiagramSynthesis.BLUE3b, KiCoDiagramSynthesis.BLUE3b);
                    }
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the selected transformation visualization.
     * 
     * @param editorID
     *            the editor id
     */
    public static void addSelectedTransformationVisualization(int editorID) {
        List<String> selectedTransformations =
                KiCoSelectionView.getSelectedAndDisabledTransformations(editorID);
        ViewContext context = instance.getViewer().getViewContext();
        for (String selectedTransformationID : selectedTransformations) {
            TransformationDummy selectedTransformationDummy =
                    resolveTransformationDummy(selectedTransformationID, editorID);
            if (selectedTransformationDummy != null) {
                if (!isSelectedTransformationDisabled(selectedTransformationID, editorID)) {
                    KiCoKlighdAction.setLabelColor(selectedTransformationDummy, context,
                            KiCoDiagramSynthesis.WHITE, KiCoDiagramSynthesis.BLUE3);
                    KiCoKlighdAction.setStateColor(selectedTransformationDummy, context,
                            KiCoDiagramSynthesis.BLUE3, KiCoDiagramSynthesis.BLUE4);
                } else {
                    KiCoKlighdAction.setLabelColor(selectedTransformationDummy, context,
                            KiCoDiagramSynthesis.DARKGRAY, KiCoDiagramSynthesis.GRAY1);
                    KiCoKlighdAction.setStateColor(selectedTransformationDummy, context,
                            KiCoDiagramSynthesis.GRAY1, KiCoDiagramSynthesis.GRAY2);
                }

            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the all transformations.
     * 
     * @return the all transformations
     */
    public static List<TransformationDummy> getAllTransformations(int editorID) {
        KielerCompilerContext context = getKielerCompilerContext(editorID);
        if (context != null) {
            return context.getGraph();
        }
        return new ArrayList<TransformationDummy>();
    }

    // -------------------------------------------------------------------------

    /**
     * Removes other possibly selected alternatives for a transformation from the list of selected
     * transformations.
     * 
     * @param transformationDummyID
     *            the transformation dummy id
     * @param editorID
     *            the editor id
     * @return the list
     */
    public static List<TransformationDummy> calculateOtherAlternativeTransformations(
            String transformationDummyID, int editorID) {
        List<TransformationDummy> returnList = new ArrayList<TransformationDummy>();
        TransformationDummy transformationDummy =
                resolveTransformationDummy(transformationDummyID, editorID);
        if (transformationDummy != null && transformationDummy.reverseDependencies != null) {
            for (TransformationDummy reverseDependency : transformationDummy.reverseDependencies) {
                if (reverseDependency.isAlternative()) {
                    // in this case the parent is an alternative group and we need to deselect ALL
                    // OTHER alternatives
                    for (TransformationDummy otherAlternative : reverseDependency.dependencies) {
                        if (otherAlternative != transformationDummy) {
                            returnList.add(otherAlternative);
                        }
                    }
                }
            }
        }
        return returnList;
    }

    // -------------------------------------------------------------------------

    /**
     * Removes the selected transformation visualization.
     * 
     * @param editorID
     *            the editor id
     */
    public static void removeSelectedTransformationVisualization(int editorID) {
        List<String> selectedTransformations =
                KiCoSelectionView.getSelectedAndDisabledTransformations(editorID);
        ViewContext context = instance.getViewer().getViewContext();
        for (String selectedTransformationID : selectedTransformations) {
            TransformationDummy selectedTransformationDummy =
                    resolveTransformationDummy(selectedTransformationID,
                            KiCoSelectionView.getActiveEditorID());
            if (selectedTransformationDummy != null) {
                KiCoKlighdAction.setLabelColor(selectedTransformationDummy, context,
                        KiCoDiagramSynthesis.BLACK, KiCoDiagramSynthesis.BLUE1);
                KiCoKlighdAction.setStateColor(selectedTransformationDummy, context,
                        KiCoDiagramSynthesis.BLUE1, KiCoDiagramSynthesis.BLUE2);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the selected transformation visualization.
     * 
     * @param editorID
     *            the editor id
     */
    public static void addSelectedTransformationVisualization(int editorID,
            List<String> transformationDummyIDs) {
        ViewContext context = instance.getViewer().getViewContext();
        for (String selectedTransformationID : transformationDummyIDs) {
            TransformationDummy selectedTransformationDummy =
                    resolveTransformationDummy(selectedTransformationID,
                            KiCoSelectionView.getActiveEditorID());
            if (selectedTransformationDummy != null) {
                KiCoKlighdAction.setLabelColor(selectedTransformationDummy, context,
                        KiCoDiagramSynthesis.WHITE, KiCoDiagramSynthesis.BLUE3);
                KiCoKlighdAction.setStateColor(selectedTransformationDummy, context,
                        KiCoDiagramSynthesis.BLUE3, KiCoDiagramSynthesis.BLUE4);
            }
        }
    }

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
                String partName = (editorPart).getPartName();

                boolean clearAll = false;
                // Only in the following case we want to clear all because no editor is opened,
                // otherwise we (before) switched to another
                // opened editor. Note that updateView() is called BEFORE updateViewOnClose() by
                // Eclipse.
                if (lastEditor == partName) {
                    clearAll = true;
                    // Clear last editor because we closed it
                    lastEditor = "";
                    lastEditorID = "";
                    // Next view is collapsed again
                    allExpanded = false;
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

                int activeEditorID = getActiveEditorID(editorPart);

                List<String> selectedAndExcludedTransformations =
                        getSelectedAndDisabledTransformations(activeEditorID);

                while (selectedAndExcludedTransformations.size() > 0) {
                    String transformationID = selectedAndExcludedTransformations.get(0);
                    removeSelectedTransformation(transformationID, activeEditorID);
                }

                if (clearAll) {
                    removeSelectedTransformationVisualization(activeEditorID);
                    updateView(activeEditorID, new ArrayList<String>());
                    updateActiveTransformationsProperty();
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    private void updateView(int activeEditorID, List<String> visibleTransformations) {
        // Next view is collapsed again
        allExpanded = false;
        if (allExpanded) {
            actionExpandAllToggle.setImageDescriptor(ICON_COLLAPSEALL);
            actionExpandAllToggle.setToolTipText("Collapse all expanded transformation groups.");
        } else {
            actionExpandAllToggle.setImageDescriptor(ICON_EXPANDALL);
            actionExpandAllToggle.setToolTipText("Expand all collapsed transformation groups.");
        }

        List<String> selectedTransformationIDs = new ArrayList<String>();
        List<String> disabledTransformationIDs = new ArrayList<String>();
        List<String> selectedAndExcludedTransformations =
                getSelectedAndDisabledTransformations(activeEditorID);
        for (String transformation : selectedAndExcludedTransformations) {
            if (transformation.startsWith("!")) {
                disabledTransformationIDs.add(transformation.substring(1));
            } else {
                selectedTransformationIDs.add(transformation);
            }
        }

        KielerCompilerContext context =
                new KielerCompilerContext(selectedTransformationIDs, disabledTransformationIDs);

        context.buildGraph();

        if (compileMode >= 1) {
            // 2. eliminate unused alternative paths
            KielerCompiler.cleanupImpossibleAlternatives(context);
        }
        if (compileMode >= 2) {
            // 3. mark nodes, including groups
            KielerCompiler.markNodes(context, context.getSelectedTransformationIDs(), true);
        }
        if (compileMode >= 3) {
            // 4. mark reverse dependencies
            KielerCompiler.markReverseDependencies(context);
        }
        if (compileMode >= 4) {
            // 5. eliminate unmarked nodes
            KielerCompiler.eliminatedUnmarkedNodes(context);
        }
        if (compileMode >= 5) {
            // 5b remove excluded transformations
            if (disabledTransformationIDs.size() > 0) {
                KielerCompiler.removeFromGraph(context, context.getDisabledTransformationIDs());
            }
        }
        // if (compileMode >= 6) {
        // // 6. topological sort
        // processedTransformationIDs = KielerCompiler.topologicalSort(tempModel);
        // }
        // if (compileMode >= 7) {
        //
        // }
        //
        // if (excludedTransformationIDs != null && excludedTransformationIDs.size()
        // > 0) {
        // }
        //
        //
        // if (noGroups) {
        // // 7. final cleanup, eliminate any groups
        // processedTransformationIDs =
        // eliminateGroupIds(processedTransformationIDs);
        // }

        KielerCompiler.reduceGraph(context, visibleTransformations);
        knownContexts.put(activeEditorID, context);

        KlighdSynthesisProperties properties = new KlighdSynthesisProperties();
        if (hierarchyMode == 0) {
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
                    "de.cau.cs.kieler.kico.ui.klighd.diagramSynthesis");
        } else if (hierarchyMode == 1) {
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
                    "de.cau.cs.kieler.kico.ui.klighd.diagramFlatNoGroupsSynthesis");
        } else {
            properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
                    "de.cau.cs.kieler.kico.ui.klighd.diagramFlatSynthesis");
        }

        // Hide zoom buttons
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_ZOOM_CONFIG_BUTTONS_HANDLING,
                ZoomConfigButtonsHandling.HIDE);

        updateDiagram(context.getGraph(), properties);

        if (KiCoSelectionView.advancedMode) {
            KiCoSelectionView.addRequiredTransformationVisualization(activeEditorID);
        }
        KiCoSelectionView.addSelectedTransformationVisualization(activeEditorID);

        // notify listeners about currently active transformations
        updateActiveTransformationsProperty();

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
            String editorID = ref.getId();
            if (registeredEditors.containsKey(editorID)) {
                if (part instanceof EditorPart) {
                    EditorPart editorPart = (EditorPart) part;
                    String partName = (editorPart).getPartName();

                    updateCompileChainCombo(editorID, partName);
                    int selectedIndex = getSelectedCompileChainIndex(partName);
                    CompileChains compileChain = registeredEditors.get(editorID);
                    CompileChain item = compileChain.getItems().get(selectedIndex);
                    List<String> visibleTransformations = item.transformations;

                    if (!partName.equals(lastEditor)) {
                        lastEditor = partName;
                        lastEditorID = editorID;
                        updateView(getActiveEditorID(), visibleTransformations);
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
                // TODO Auto-generated method stub

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
                setImageDescriptor(KimlUiPlugin
                        .getImageDescriptor("icons/menu16/kieler-arrange.gif"));
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
                // TOGGLE
                advancedMode = !advancedMode;
                actionAdvancedToggle.setChecked(advancedMode);

                if (advancedMode) {
                    addRequiredTransformationVisualization(getActiveEditorID());
                } else {
                    removeRequiredTransformationVisualization(getActiveEditorID());
                }

                // notify listeners about currently active transformations
                updateActiveTransformationsProperty();

            }
        };
        actionAdvancedToggle.setText("Autoselect Required Transformations");
        actionAdvancedToggle.setToolTipText("Autoselects additionally required transformations");
        actionAdvancedToggle.setImageDescriptor(ICON_ADVANCED);
        actionAdvancedToggle.setChecked(advancedMode);
        return actionAdvancedToggle;
    }

    // -------------------------------------------------------------------------

    // /**
    // * Gets the action to toggle compile mode.
    // *
    // * @return the action
    // */
    // private Action getActionCompileToggle() {
    // if (actionCompileToggle != null) {
    // return actionCompileToggle;
    // }
    // actionCompileToggle = new Action("", IAction.AS_PUSH_BUTTON) {
    // public void run() {
    // // TOGGLE
    // compileMode++;
    // if (compileMode > COMPILEMODEMAX) {
    // compileMode = 0;
    // }
    // lastEditor = "";
    // updateView(lastWorkbenchPartReference);
    // }
    // };
    // actionCompileToggle.setText("Toggle Compile Mode");
    // actionCompileToggle
    // .setToolTipText("Toggles between different stages of the transformation selection algorihm until the selection used for compilation");
    // actionCompileToggle.setImageDescriptor(ICON_COMPILE);
    // return actionCompileToggle;
    // }

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
                // TOGGLE
                hierarchyMode = hierarchyMode + 1;
                if (hierarchyMode > MAXHIERARCHYMODE) {
                    hierarchyMode = 0;
                }
                lastEditor = "";
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

        final IDiagramWorkbenchPart thisPart = this;
        actionSelectAllToggle = new Action("", IAction.AS_PUSH_BUTTON) {
            public void run() {
                // TOGGLE
                allSelected = !allSelected;
                if (allSelected) {
                    actionSelectAllToggle.setImageDescriptor(ICON_DESELECTALL);
                    actionSelectAllToggle.setToolTipText("Deselect all transformations.");
                } else {
                    actionSelectAllToggle.setImageDescriptor(ICON_SELECTALL);
                    actionSelectAllToggle.setToolTipText("Select all transformations.");
                }
                int activeEditorID = getActiveEditorID();
                if (allSelected) {
                    List<TransformationDummy> allTransformations =
                            getAllTransformations(activeEditorID);
                    List<String> allTransformationIDs = new ArrayList<String>();
                    for (TransformationDummy transformationDummy : allTransformations) {
                        allTransformationIDs.add(transformationDummy.transformationId);
                    }
                    addSelectedTransformationVisualization(activeEditorID, allTransformationIDs);
                    List<String> selectedAndExcludedTransformations =
                            getSelectedAndDisabledTransformations(activeEditorID);
                    for (String transformationID : allTransformationIDs) {
                        addSelectedTransformation(transformationID,
                                selectedAndExcludedTransformations, true);
                    }
                } else {
                    List<String> selectedAndExcludedTransformations =
                            getSelectedAndDisabledTransformations(activeEditorID);
                    removeSelectedTransformationVisualization(activeEditorID);

                    while (selectedAndExcludedTransformations.size() > 0) {
                        String transformationID = selectedAndExcludedTransformations.get(0);
                        removeSelectedTransformation(transformationID, activeEditorID);
                    }
                }
                updateActiveTransformationsProperty();
                LightDiagramServices.layoutDiagram(thisPart);
            }
        };
        actionSelectAllToggle.setText("Select/Deselect All");
        actionSelectAllToggle.setToolTipText("Select all transformations.");
        actionSelectAllToggle.setImageDescriptor(ICON_SELECTALL);
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
                // TOGGLE
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

                if (allExpanded) {
                    final IViewer viewer = thisPart.getViewer();
                    for (EObject k : Iterables.filter(
                            Iterables2.toIterable(viewer.getViewContext().getViewModel()
                                    .eAllContents()), new Predicate<EObject>() {

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
                    lastEditor = "";
                    updateView(lastWorkbenchPartReference);
                }

                // Object object = vc.getSourceElement(k);
                // if (object instanceof TransformationDummy) {
                // TransformationDummy transformationDummy = (TransformationDummy) object;
                // if (!transformationDummy.isGroup()) {
                // viewer.collapse((KNode) k);
                //
                // }
                // }

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

    // // Force to reload and adapt to currently selected editor
    // Object model = KielerCompiler.buildGraph();
    // DiagramViewManager.getInstance().createView(getPartId(), null, model,
    // KlighdSynthesisProperties.newInstance(null));

    /**
     * Gets the active editor id.
     * 
     * @return the active editor id
     */
    public static int getActiveEditorID() {
        return getActiveEditorID(getActiveEditor());
    }

    public static int getActiveEditorID(IEditorPart editorPart) {
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
            new UIJob("Init" + KiCoSelectionView.class.getName()) {

                @Override
                public IStatus runInUIThread(IProgressMonitor monitor) {
                    DiagramViewManager.initializeView(instance, model, null, properties);
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

    // TransformationChange Event Manager
    // -------------------------------------------------------------------------

    /** Manager to handle listeners on selection change events */
    private final static KiCoSelectionChangeEventManager selectionEventManger =
            new KiCoSelectionChangeEventManager();

    /**
     * @param listener
     * @see de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager#addSelectionChangeEventListener(de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager.KiCoSelectionChangeEventListerner)
     */
    public void addSelectionChangeEventListener(KiCoSelectionChangeEventListerner listener) {
        selectionEventManger.addSelectionChangeEventListener(listener);
    }

    /**
     * @param listener
     * @see de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager#removeSelectionChangeEventListener(de.cau.cs.kieler.kico.ui.KiCoSelectionChangeEventManager.KiCoSelectionChangeEventListerner)
     */
    public void removeSelectionChangeEventListener(KiCoSelectionChangeEventListerner listener) {
        selectionEventManger.removeSelectionChangeEventListener(listener);
    }

    /**
     * Notifies all listeners about the new selection
     */
    public static void updateActiveTransformationsProperty() {
        KiCoSelection currentSelection =
                new KiCoSelection(getActiveEditorID(),
                        selectedAndDisabledTransformations.get(getActiveEditorID()),
                        requiredTransformations.get(getActiveEditorID()), advancedMode);
        selectionEventManger.fireSelectionChangeEvent(currentSelection);
    }

    // -------------------------------------------------------------------------
}
