package de.cau.cs.kieler.synccharts.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import de.cau.cs.kieler.core.ui.figures.IAttributeAwareFigure;
import de.cau.cs.kieler.synccharts.custom.AttributeAwareTransitionFigure;
import de.cau.cs.kieler.synccharts.diagram.edit.policies.TransitionItemSemanticEditPolicy;

/**
 * @generated
 */
public class TransitionEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 4001;

    /**
     * @generated
     */
    public TransitionEditPart(View view) {
        super(view);
    }

    /**
     * @generated
     */
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new TransitionItemSemanticEditPolicy());
    }

    /**
     * @generated
     */
    protected boolean addFixedChild(EditPart childEditPart) {
        if (childEditPart instanceof TransitionTriggersAndEffectsEditPart) {
            ((TransitionTriggersAndEffectsEditPart) childEditPart).setLabel(getPrimaryShape()
                    .getFigureTransitionTriggersAndEffectsFigure());
            return true;
        }
        if (childEditPart instanceof TransitionPriorityEditPart) {
            ((TransitionPriorityEditPart) childEditPart).setLabel(getPrimaryShape()
                    .getFigureTransitionPriorityFigure());
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
    protected boolean removeFixedChild(EditPart childEditPart) {
        if (childEditPart instanceof TransitionTriggersAndEffectsEditPart) {
            return true;
        }
        if (childEditPart instanceof TransitionPriorityEditPart) {
            return true;
        }
        return false;
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
     * Creates figure for this edit part.
     * 
     * Body of this method does not depend on settings in generation model
     * so you may safely remove <i>generated</i> tag and modify it.
     * 
     * @generated
     */

    protected Connection createConnectionFigure() {
        Connection figure = new TransitionFigure();

        if (figure instanceof IAttributeAwareFigure) {
            ((IAttributeAwareFigure) figure).listenTo(this.getNotationView().getElement());
        }
        return figure;
    }

    /**
     * @generated
     */
    public TransitionFigure getPrimaryShape() {
        return (TransitionFigure) getFigure();
    }

    /**
     * @generated
     */
    public class TransitionFigure extends AttributeAwareTransitionFigure {

        /**
         * @generated
         */
        private WrappingLabel fFigureTransitionTriggersAndEffectsFigure;

        /**
         * @generated
         */
        private WrappingLabel fFigureTransitionPriorityFigure;

        /**
         * @generated
         */
        public TransitionFigure() {

            createContents();
        }

        /**
         * @generated
         */
        private void createContents() {

            fFigureTransitionTriggersAndEffectsFigure = new WrappingLabel();
            fFigureTransitionTriggersAndEffectsFigure.setText("");

            this.add(fFigureTransitionTriggersAndEffectsFigure);

            fFigureTransitionPriorityFigure = new WrappingLabel();
            fFigureTransitionPriorityFigure.setText("");

            fFigureTransitionPriorityFigure.setFont(FFIGURETRANSITIONPRIORITYFIGURE_FONT);

            this.add(fFigureTransitionPriorityFigure);

        }

        /**
         * @generated
         */
        private boolean myUseLocalCoordinates = false;

        /**
         * @generated
         */
        protected boolean useLocalCoordinates() {
            return myUseLocalCoordinates;
        }

        /**
         * @generated
         */
        protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
            myUseLocalCoordinates = useLocalCoordinates;
        }

        /**
         * @generated
         */
        public WrappingLabel getFigureTransitionTriggersAndEffectsFigure() {
            return fFigureTransitionTriggersAndEffectsFigure;
        }

        /**
         * @generated
         */
        public WrappingLabel getFigureTransitionPriorityFigure() {
            return fFigureTransitionPriorityFigure;
        }

    }

    /**
     * @generated
     */
    static final Font FFIGURETRANSITIONPRIORITYFIGURE_FONT = new Font(Display.getCurrent(), "Sans",
            7, SWT.NORMAL);

}
