package de.cau.cs.kieler.kico.klighd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.swt.widgets.Composite;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.TransformationDummy;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

public class KiCoSelectionView extends DiagramViewPart {

    static KiCoSelectionView instance;
    Composite parent;
    static final String ID = "de.cau.cs.kieler.kico.selection";

    static List<String> selectedTransformations = new ArrayList<String>();

    static HashMap<KNode, TransformationDummy> knode2transformationDummy =
            new HashMap<KNode, TransformationDummy>();

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
     * @return the selected transformations
     */
    public static List<String> getSelectedTransformations() {
        return KiCoSelectionView.selectedTransformations;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if a transformation is selected.
     * 
     * @param transformationDummy
     *            the transformation dummy
     * @return true, if is selected transformation
     */
    public static boolean isSelectedTransformation(String transformationDummyID) {
        for (String transformationID : selectedTransformations) {
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
     */
    public static void addSelectedTransformation(String transformationDummyID) {
        if (!isSelectedTransformation(transformationDummyID)) {
            selectedTransformations.add(transformationDummyID);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Removes the transformation from the list of selected transformations.
     * 
     * @param transformationDummyID
     *            the transformation dummy id
     */
    public static void removeSelectedTransformation(String transformationDummyID) {
        int found = -1;
        for (String transformationID : selectedTransformations) {
            if (transformationID.equals(transformationDummyID)) {
                found = selectedTransformations.indexOf(transformationID);
                break;
            }
        }
        if (found > -1) {
            selectedTransformations.remove(found);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void createPartControl(final Composite parent) {
        Object model = KielerCompiler.buildGraph();
        super.createPartControl(parent);
        DiagramViewManager.getInstance().registerView(this);
        DiagramViewManager.getInstance().createView(getPartId(), null, model,
                KlighdSynthesisProperties.newInstance(null));
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
}
