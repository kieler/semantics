package de.cau.cs.kieler.synccharts.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import de.cau.cs.kieler.core.ui.figures.RoundedRectangleFigure;
import de.cau.cs.kieler.core.ui.figures.TranslatablePolyline;
import de.cau.cs.kieler.karma.AdvancedRenderingShapeNodeEditPart;
import de.cau.cs.kieler.karma.SwitchableFigure;
import de.cau.cs.kieler.synccharts.custom.StateLayout;
import de.cau.cs.kieler.synccharts.diagram.edit.policies.StateItemSemanticEditPolicy;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * @generated
 */
public class StateEditPart extends AdvancedRenderingShapeNodeEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 2005;

    /**
     * @generated
     */
    protected IFigure contentPane;

    /**
     * @generated
     */
    public StateEditPart(View view) {
        super(view);
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StateItemSemanticEditPolicy());
        installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
        // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
        // removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
    }

    /**
     * @generated
     */
    protected LayoutEditPolicy createLayoutEditPolicy() {
        org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

            protected EditPolicy createChildEditPolicy(EditPart child) {
                EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
                if (result == null) {
                    result = new NonResizableEditPolicy();
                }
                return result;
            }

            protected Command getMoveChildrenCommand(Request request) {
                return null;
            }

            protected Command getCreateCommand(CreateRequest request) {
                return null;
            }
        };
        return lep;
    }

    /**
     * @generated
     */
    protected IFigure createNodeShape() {
        primaryShape = new StateFigure();

        StateEditPart.this.updateFigure(primaryShape);

        return primaryShape;
    }

    /**
     * @generated
     */
    public StateFigure getPrimaryShape() {
        return (StateFigure) primaryShape;
    }

    /**
     * @generated
     */
    protected boolean addFixedChild(EditPart childEditPart) {
        if (childEditPart instanceof StateLabelEditPart) {
            ((StateLabelEditPart) childEditPart).setLabel(getPrimaryShape()
                .getFigureStateNameFigure());
            return true;
        }
        if (childEditPart instanceof StateInterfaceDeclarationEditPart) {
            ((StateInterfaceDeclarationEditPart) childEditPart).setLabel(getPrimaryShape()
                .getFigureInterfaceDeclFigure());
            return true;
        }
        return false;
    }

    /**
     * @generated
     */
    protected boolean removeFixedChild(EditPart childEditPart) {
        if (childEditPart instanceof StateLabelEditPart) {
            return true;
        }
        if (childEditPart instanceof StateInterfaceDeclarationEditPart) {
            return true;
        }
        return false;
    }

    /**
     * @generated
     */
    protected void addChildVisual(EditPart childEditPart, int index) {
        if (addFixedChild(childEditPart)) {
            return;
        }
        super.addChildVisual(childEditPart, -1);
    }

    /**
     * @generated
     */
    protected void removeChildVisual(EditPart childEditPart) {
        if (removeFixedChild(childEditPart)) {
            return;
        }
        super.removeChildVisual(childEditPart);
    }

    /**
     * @generated
     */
    protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
        return getContentPane();
    }

    /**
     * @generated
     */
    protected NodeFigure createNodePlate() {
        RoundedRectangleFigure result = new RoundedRectangleFigure();
        result.setCornerDimensions(new Dimension(StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        return result;
    }

    /**
     * Creates figure for this edit part.
     * 
     * Body of this method does not depend on settings in generation model
     * so you may safely remove <i>generated</i> tag and modify it.
     * 
     * @generated
     */
    protected NodeFigure createNodeFigure() {
        NodeFigure figure = createNodePlate();
        figure.setLayoutManager(new StackLayout());
        IFigure shape = createNodeShape();
        figure.add(shape);
        contentPane = setupContentPane(shape);
        return figure;
    }

    /**
     * Default implementation treats passed figure as content pane.
     * Respects layout one may have set for generated figure.
     * @param nodeShape instance of generated figure class
     * @generated
     */
    protected IFigure setupContentPane(IFigure nodeShape) {
        if (nodeShape.getLayoutManager() == null) {
            ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
            layout.setSpacing(5);
            nodeShape.setLayoutManager(layout);
        }
        return nodeShape; // use nodeShape itself as contentPane
    }

    /**
     * @generated
     */
    public IFigure getContentPane() {
        if (contentPane != null) {
            return contentPane;
        }
        return super.getContentPane();
    }

    /**
     * @generated
     */
    protected void setForegroundColor(Color color) {
        if (primaryShape != null) {
            primaryShape.setForegroundColor(color);
        }
    }

    /**
     * @generated
     */
    protected void setBackgroundColor(Color color) {
        if (primaryShape != null) {
            primaryShape.setBackgroundColor(color);
        }
    }

    /**
     * @generated
     */
    protected void setLineWidth(int width) {
        if (primaryShape instanceof Shape) {
            ((Shape) primaryShape).setLineWidth(width);
        }
    }

    /**
     * @generated
     */
    protected void setLineType(int style) {
        if (primaryShape instanceof Shape) {
            ((Shape) primaryShape).setLineStyle(style);
        }
    }

    /**
     * @generated
     */
    public EditPart getPrimaryChildEditPart() {
        return getChildBySemanticHint(SyncchartsVisualIDRegistry
            .getType(StateLabelEditPart.VISUAL_ID));
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnSource() {
        ArrayList<IElementType> types = new ArrayList<IElementType>(1);
        types.add(SyncchartsElementTypes.Transition_4005);
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
        LinkedList<IElementType> types = new LinkedList<IElementType>();
        if (targetEditPart instanceof de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart) {
            types.add(SyncchartsElementTypes.Transition_4005);
        }
        if (targetEditPart instanceof RegionStateEditPart) {
            types.add(SyncchartsElementTypes.Transition_4005);
        }
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
        LinkedList<IElementType> types = new LinkedList<IElementType>();
        if (relationshipType == SyncchartsElementTypes.Transition_4005) {
            types.add(SyncchartsElementTypes.State_2005);
            types.add(SyncchartsElementTypes.State_3040);
        }
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMARelTypesOnTarget() {
        ArrayList<IElementType> types = new ArrayList<IElementType>(1);
        types.add(SyncchartsElementTypes.Transition_4005);
        return types;
    }

    /**
     * @generated
     */
    public List<IElementType> getMATypesForSource(IElementType relationshipType) {
        LinkedList<IElementType> types = new LinkedList<IElementType>();
        if (relationshipType == SyncchartsElementTypes.Transition_4005) {
            types.add(SyncchartsElementTypes.State_2005);
            types.add(SyncchartsElementTypes.State_3040);
        }
        return types;
    }

    /**
     * @generated
     */
    public class StateFigure extends SwitchableFigure {

        /**
         * @generated
         */
        private WrappingLabel fFigureStateNameFigure;
        /**
         * @generated
         */
        private WrappingLabel fFigureInterfaceDeclFigure;

        /**
         * @generated
         */
        public StateFigure() {

            StateLayout layoutThis = new StateLayout();

            this.setLayoutManager(layoutThis);

            this.setSize(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20));
            createContents();
        }

        /**
         * @generated
         */
        private void createContents() {

            fFigureStateNameFigure = new WrappingLabel();
            fFigureStateNameFigure.setText("");

            fFigureStateNameFigure.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode()
                .DPtoLP(10), getMapMode().DPtoLP(5), getMapMode().DPtoLP(10)));

            this.add(fFigureStateNameFigure);

            TranslatablePolyline polyline0 = new TranslatablePolyline();
            polyline0.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(20)));
            polyline0.addPoint(new Point(getMapMode().DPtoLP(50), getMapMode().DPtoLP(20)));

            this.add(polyline0);

            fFigureInterfaceDeclFigure = new WrappingLabel();
            fFigureInterfaceDeclFigure.setText("");
            fFigureInterfaceDeclFigure.setTextWrap(true);

            fFigureInterfaceDeclFigure.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
                getMapMode().DPtoLP(10), getMapMode().DPtoLP(5), getMapMode().DPtoLP(10)));

            this.add(fFigureInterfaceDeclFigure);

        }

        /**
         * @generated
         */
        public WrappingLabel getFigureStateNameFigure() {
            return fFigureStateNameFigure;
        }

        /**
         * @generated
         */
        public WrappingLabel getFigureInterfaceDeclFigure() {
            return fFigureInterfaceDeclFigure;
        }

    }

}
