package de.cau.cs.kieler.synccharts.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsVisualIDRegistry;

/**
 * @generated
 */
public class SyncchartsEditPartFactory implements EditPartFactory {

    /**
     * @generated
     */
    public EditPart createEditPart(EditPart context, Object model) {
        if (model instanceof View) {
            View view = (View) model;
            switch (SyncchartsVisualIDRegistry.getVisualID(view)) {

            case RegionEditPart.VISUAL_ID:
                return new RegionEditPart(view);

            case StateEditPart.VISUAL_ID:
                return new StateEditPart(view);

            case StateLabelEditPart.VISUAL_ID:
                return new StateLabelEditPart(view);

            case Region2EditPart.VISUAL_ID:
                return new Region2EditPart(view);

            case State2EditPart.VISUAL_ID:
                return new State2EditPart(view);

            case StateLabel2EditPart.VISUAL_ID:
                return new StateLabel2EditPart(view);

            case SignalEditPart.VISUAL_ID:
                return new SignalEditPart(view);

            case SignalNameEditPart.VISUAL_ID:
                return new SignalNameEditPart(view);

            case ActionEditPart.VISUAL_ID:
                return new ActionEditPart(view);

            case ActionTriggersAndEffectsEditPart.VISUAL_ID:
                return new ActionTriggersAndEffectsEditPart(view);

            case Action2EditPart.VISUAL_ID:
                return new Action2EditPart(view);

            case ActionTriggersAndEffects2EditPart.VISUAL_ID:
                return new ActionTriggersAndEffects2EditPart(view);

            case Action3EditPart.VISUAL_ID:
                return new Action3EditPart(view);

            case ActionTriggersAndEffects3EditPart.VISUAL_ID:
                return new ActionTriggersAndEffects3EditPart(view);

            case Action4EditPart.VISUAL_ID:
                return new Action4EditPart(view);

            case ActionTriggersAndEffects4EditPart.VISUAL_ID:
                return new ActionTriggersAndEffects4EditPart(view);

            case StateSignalEditPart.VISUAL_ID:
                return new StateSignalEditPart(view);

            case StateOnEntryActionEditPart.VISUAL_ID:
                return new StateOnEntryActionEditPart(view);

            case StateOnInsideActionEditPart.VISUAL_ID:
                return new StateOnInsideActionEditPart(view);

            case StateOnExitActionEditPart.VISUAL_ID:
                return new StateOnExitActionEditPart(view);

            case StateSuspendEditPart.VISUAL_ID:
                return new StateSuspendEditPart(view);

            case StateRegionCompartmentEditPart.VISUAL_ID:
                return new StateRegionCompartmentEditPart(view);

            case RegionStateCompartmentEditPart.VISUAL_ID:
                return new RegionStateCompartmentEditPart(view);

            case StateSignal2EditPart.VISUAL_ID:
                return new StateSignal2EditPart(view);

            case StateOnEntryAction2EditPart.VISUAL_ID:
                return new StateOnEntryAction2EditPart(view);

            case StateOnInsideAction2EditPart.VISUAL_ID:
                return new StateOnInsideAction2EditPart(view);

            case StateOnExitAction2EditPart.VISUAL_ID:
                return new StateOnExitAction2EditPart(view);

            case StateSuspend2EditPart.VISUAL_ID:
                return new StateSuspend2EditPart(view);

            case StateRegionCompartment2EditPart.VISUAL_ID:
                return new StateRegionCompartment2EditPart(view);

            case TransitionEditPart.VISUAL_ID:
                return new TransitionEditPart(view);

            case TransitionTriggersAndEffectsEditPart.VISUAL_ID:
                return new TransitionTriggersAndEffectsEditPart(view);

            }
        }
        return createUnrecognizedEditPart(context, model);
    }

    /**
     * @generated
     */
    private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
        // Handle creation of unrecognized child node EditParts here
        return null;
    }

    /**
     * @generated
     */
    public static CellEditorLocator getTextCellEditorLocator(
            ITextAwareEditPart source) {
        if (source.getFigure() instanceof WrappingLabel)
            return new TextCellEditorLocator((WrappingLabel) source.getFigure());
        else {
            return new LabelCellEditorLocator((Label) source.getFigure());
        }
    }

    /**
     * @generated
     */
    static private class TextCellEditorLocator implements CellEditorLocator {

        /**
         * @generated
         */
        private WrappingLabel wrapLabel;

        /**
         * @generated
         */
        public TextCellEditorLocator(WrappingLabel wrapLabel) {
            this.wrapLabel = wrapLabel;
        }

        /**
         * @generated
         */
        public WrappingLabel getWrapLabel() {
            return wrapLabel;
        }

        /**
         * @generated
         */
        public void relocate(CellEditor celleditor) {
            Text text = (Text) celleditor.getControl();
            Rectangle rect = getWrapLabel().getTextBounds().getCopy();
            getWrapLabel().translateToAbsolute(rect);
            if (getWrapLabel().isTextWrapOn()
                    && getWrapLabel().getText().length() > 0) {
                rect.setSize(new Dimension(text.computeSize(rect.width,
                        SWT.DEFAULT)));
            } else {
                int avr = FigureUtilities.getFontMetrics(text.getFont())
                        .getAverageCharWidth();
                rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
                        SWT.DEFAULT)).expand(avr * 2, 0));
            }
            if (!rect.equals(new Rectangle(text.getBounds()))) {
                text.setBounds(rect.x, rect.y, rect.width, rect.height);
            }
        }
    }

    /**
     * @generated
     */
    private static class LabelCellEditorLocator implements CellEditorLocator {

        /**
         * @generated
         */
        private Label label;

        /**
         * @generated
         */
        public LabelCellEditorLocator(Label label) {
            this.label = label;
        }

        /**
         * @generated
         */
        public Label getLabel() {
            return label;
        }

        /**
         * @generated
         */
        public void relocate(CellEditor celleditor) {
            Text text = (Text) celleditor.getControl();
            Rectangle rect = getLabel().getTextBounds().getCopy();
            getLabel().translateToAbsolute(rect);
            int avr = FigureUtilities.getFontMetrics(text.getFont())
                    .getAverageCharWidth();
            rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
                    SWT.DEFAULT)).expand(avr * 2, 0));
            if (!rect.equals(new Rectangle(text.getBounds()))) {
                text.setBounds(rect.x, rect.y, rect.width, rect.height);
            }
        }
    }
}
