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

            case StateInterfaceDeclarationEditPart.VISUAL_ID:
                return new StateInterfaceDeclarationEditPart(view);

            case SignalEditPart.VISUAL_ID:
                return new SignalEditPart(view);

            case SignalNameEditPart.VISUAL_ID:
                return new SignalNameEditPart(view);

            case StateEntryActionEditPart.VISUAL_ID:
                return new StateEntryActionEditPart(view);

            case StateEntryActionLabelEditPart.VISUAL_ID:
                return new StateEntryActionLabelEditPart(view);

            case StateInnerActionEditPart.VISUAL_ID:
                return new StateInnerActionEditPart(view);

            case StateInnerActionLabelEditPart.VISUAL_ID:
                return new StateInnerActionLabelEditPart(view);

            case StateExitActionEditPart.VISUAL_ID:
                return new StateExitActionEditPart(view);

            case StateExitActionLabelEditPart.VISUAL_ID:
                return new StateExitActionLabelEditPart(view);

            case StateSuspensionTriggerEditPart.VISUAL_ID:
                return new StateSuspensionTriggerEditPart(view);

            case StateSuspensionTriggerLabelEditPart.VISUAL_ID:
                return new StateSuspensionTriggerLabelEditPart(view);

            case TextualCodeEditPart.VISUAL_ID:
                return new TextualCodeEditPart(view);

            case TextualCodeLabelEditPart.VISUAL_ID:
                return new TextualCodeLabelEditPart(view);

            case StateRegionEditPart.VISUAL_ID:
                return new StateRegionEditPart(view);

            case StateRegionLabelEditPart.VISUAL_ID:
                return new StateRegionLabelEditPart(view);

            case RegionStateEditPart.VISUAL_ID:
                return new RegionStateEditPart(view);

            case RegionStateLabelEditPart.VISUAL_ID:
                return new RegionStateLabelEditPart(view);

            case RegionState2LabelEditPart.VISUAL_ID:
                return new RegionState2LabelEditPart(view);

            case VariableEditPart.VISUAL_ID:
                return new VariableEditPart(view);

            case VariableNameEditPart.VISUAL_ID:
                return new VariableNameEditPart(view);

            case StateSignalCompartmentEditPart.VISUAL_ID:
                return new StateSignalCompartmentEditPart(view);

            case StateEntryActionCompartmentEditPart.VISUAL_ID:
                return new StateEntryActionCompartmentEditPart(view);

            case StateInnerActionCompartmentEditPart.VISUAL_ID:
                return new StateInnerActionCompartmentEditPart(view);

            case StateExitActionCompartmentEditPart.VISUAL_ID:
                return new StateExitActionCompartmentEditPart(view);

            case StateSuspensionTriggerCompartmentEditPart.VISUAL_ID:
                return new StateSuspensionTriggerCompartmentEditPart(view);

            case StateRegionCompartment2EditPart.VISUAL_ID:
                return new StateRegionCompartment2EditPart(view);

            case RegionStateCompartmentEditPart.VISUAL_ID:
                return new RegionStateCompartmentEditPart(view);

            case StateSignalCompartment2EditPart.VISUAL_ID:
                return new StateSignalCompartment2EditPart(view);

            case StateEntryActionCompartment2EditPart.VISUAL_ID:
                return new StateEntryActionCompartment2EditPart(view);

            case StateInnerActionCompartment2EditPart.VISUAL_ID:
                return new StateInnerActionCompartment2EditPart(view);

            case StateExitActionCompartment2EditPart.VISUAL_ID:
                return new StateExitActionCompartment2EditPart(view);

            case StateSuspensionTriggerCompartment2EditPart.VISUAL_ID:
                return new StateSuspensionTriggerCompartment2EditPart(view);

            case StateRegionCompartmentEditPart.VISUAL_ID:
                return new StateRegionCompartmentEditPart(view);

            case TransitionEditPart.VISUAL_ID:
                return new TransitionEditPart(view);

            case TransitionLabelEditPart.VISUAL_ID:
                return new TransitionLabelEditPart(view);

            case TransitionPriorityEditPart.VISUAL_ID:
                return new TransitionPriorityEditPart(view);

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
    public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
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
            if (!text.getFont().isDisposed()) {
                if (getWrapLabel().isTextWrapOn() && getWrapLabel().getText().length() > 0) {
                    rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
                } else {
                    int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
                    rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(
                        avr * 2, 0));
                }
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
            if (!text.getFont().isDisposed()) {
                int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
                rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(
                    avr * 2, 0));
            }
            if (!rect.equals(new Rectangle(text.getBounds()))) {
                text.setBounds(rect.x, rect.y, rect.width, rect.height);
            }
        }
    }
}
