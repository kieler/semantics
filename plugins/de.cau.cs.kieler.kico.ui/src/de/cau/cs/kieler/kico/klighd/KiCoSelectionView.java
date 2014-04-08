package de.cau.cs.kieler.kico.klighd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.TransformationDummy;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class KiCoSelectionView.
 * 
 * @author cmot
 * @kieler.design 2014-04-08 proposed
 * @kieler.rating 2014-04-08 proposed yellow
 */
public class KiCoSelectionView extends DiagramViewPart {

    /** The instance. */
    static KiCoSelectionView instance;

    /** The parent. */
    Composite parent;

    /** The Constant ID. */
    static final String ID = "de.cau.cs.kieler.kico.selection";

    /** The selected transformations per editor instance. */
    static HashMap<Integer, List<String>> selectedTransformations =
            new HashMap<Integer, List<String>>();

    /** The last editor. */
    String lastEditor = null;

    /** The registered editors. */
    static HashMap<String, List<String>> registeredEditors = KiCoUIPlugin.getInstance()
            .getRegisteredEditors();

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
    public void setViewContext(final IViewer<?> iViewer) {
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
    public static List<String> getSelectedTransformations(int editorID) {
        if (!KiCoSelectionView.selectedTransformations.containsKey(editorID)) {
            List<String> selectedList = new ArrayList<String>();
            KiCoSelectionView.selectedTransformations.put(editorID, selectedList);
        }
        return KiCoSelectionView.selectedTransformations.get(editorID);
    }

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
        return isSelectedTransformation(transformationDummyID, getSelectedTransformations(editorID));
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
            if (transformationID.equals(transformationDummyID)) {
                return true;
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
     */
    public static void addSelectedTransformation(String transformationDummyID, int editorID) {
        addSelectedTransformation(transformationDummyID, getSelectedTransformations(editorID));
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
            List<String> selectedList) {
        if (!isSelectedTransformation(transformationDummyID, selectedList)) {
            selectedList.add(transformationDummyID);
        }
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
        removeSelectedTransformation(transformationDummyID, getSelectedTransformations(editorID));
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
            if (transformationID.equals(transformationDummyID)) {
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
     * Update view.
     * 
     * @param ref
     *            the ref
     */
    public void updateView(IWorkbenchPartReference ref) {
        IWorkbenchPart part = ref.getPart(true);
        String editorID = ref.getId();
        if (registeredEditors.containsKey(editorID)) {
            List<String> visibleTransformations = registeredEditors.get(editorID);
            if (part instanceof EditorPart) {
                EditorPart editorPart = (EditorPart) part;
                String partName = (editorPart).getPartName();
                if (!partName.equals(lastEditor)) {
                    lastEditor = partName;
                    List<TransformationDummy> model = KielerCompiler.buildGraph();
                    KielerCompiler.reduceGraph(model, visibleTransformations);
                    DiagramViewManager.getInstance().createView(getPartId(), null, model,
                            KlighdSynthesisProperties.newInstance(null));
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void createPartControl(final Composite parent) {
        super.createPartControl(parent);
        DiagramViewManager.getInstance().registerView(this);

        // Create an IPartListener2
        IPartListener2 pl = new IPartListener2() {

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
                // TODO Auto-generated method stub

            }

            public void partBroughtToTop(IWorkbenchPartReference partRef) {
                // TODO Auto-generated method stub

            }

            public void partActivated(IWorkbenchPartReference ref) {
                updateView(ref);
            }
        };

        // Add the IPartListener2 to the page
        IWorkbenchPage page = this.getSite().getPage();
        page.addPartListener(pl);
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
        return getActiveEditor().hashCode();
    }

    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
}
