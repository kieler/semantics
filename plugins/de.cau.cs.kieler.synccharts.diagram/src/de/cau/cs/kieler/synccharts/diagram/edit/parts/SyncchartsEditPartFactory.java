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
import org.eclipse.swt.graphics.Font;
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

            case Region2EditPart.VISUAL_ID:
                return new Region2EditPart(view);

            case RegionIdEditPart.VISUAL_ID:
                return new RegionIdEditPart(view);

            case State2EditPart.VISUAL_ID:
                return new State2EditPart(view);

            case StateLabel2EditPart.VISUAL_ID:
                return new StateLabel2EditPart(view);

            case StateInterfaceDeclaration2EditPart.VISUAL_ID:
                return new StateInterfaceDeclaration2EditPart(view);

            case SignalEditPart.VISUAL_ID:
                return new SignalEditPart(view);

            case SignalNameEditPart.VISUAL_ID:
                return new SignalNameEditPart(view);

            case EntryActionEditPart.VISUAL_ID:
                return new EntryActionEditPart(view);

            case EntryActionLabelEditPart.VISUAL_ID:
                return new EntryActionLabelEditPart(view);

            case InnerActionEditPart.VISUAL_ID:
                return new InnerActionEditPart(view);

            case InnerActionLabelEditPart.VISUAL_ID:
                return new InnerActionLabelEditPart(view);

            case ExitActionEditPart.VISUAL_ID:
                return new ExitActionEditPart(view);

            case ExitActionLabelEditPart.VISUAL_ID:
                return new ExitActionLabelEditPart(view);

            case SuspensionTriggerEditPart.VISUAL_ID:
                return new SuspensionTriggerEditPart(view);

            case SuspensionTriggerLabelEditPart.VISUAL_ID:
                return new SuspensionTriggerLabelEditPart(view);

            case TextualCodeEditPart.VISUAL_ID:
                return new TextualCodeEditPart(view);

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

            case StateRegionCompartmentEditPart.VISUAL_ID:
                return new StateRegionCompartmentEditPart(view);

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

            case StateRegionCompartment2EditPart.VISUAL_ID:
                return new StateRegionCompartment2EditPart(view);

            case TransitionEditPart.VISUAL_ID:
                return new TransitionEditPart(view);

            case TransitionDelayEditPart.VISUAL_ID:
                return new TransitionDelayEditPart(view);

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

                Font font = text.getFont();
                if (!font.isDisposed()) {
                    int avr = FigureUtilities.getFontMetrics(font)
                            .getAverageCharWidth();
                    rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
                            SWT.DEFAULT)).expand(avr * 2, 0));
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

            Font font = text.getFont();
            if (!font.isDisposed()) {
                int avr = FigureUtilities.getFontMetrics(font)
                        .getAverageCharWidth();
                rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
                        SWT.DEFAULT)).expand(avr * 2, 0));
            }
            if (!rect.equals(new Rectangle(text.getBounds()))) {
                text.setBounds(rect.x, rect.y, rect.width, rect.height);
            }
        }
    }
}
