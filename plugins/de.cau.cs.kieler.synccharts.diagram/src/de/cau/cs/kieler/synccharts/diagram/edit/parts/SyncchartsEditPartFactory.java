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

            case RegionLabelEditPart.VISUAL_ID:
                return new RegionLabelEditPart(view);

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

            case ActionEditPart.VISUAL_ID:
                return new ActionEditPart(view);

            case ActionLabelEditPart.VISUAL_ID:
                return new ActionLabelEditPart(view);

            case Action2EditPart.VISUAL_ID:
                return new Action2EditPart(view);

            case ActionLabel2EditPart.VISUAL_ID:
                return new ActionLabel2EditPart(view);

            case Action3EditPart.VISUAL_ID:
                return new Action3EditPart(view);

            case ActionLabel3EditPart.VISUAL_ID:
                return new ActionLabel3EditPart(view);

            case Action4EditPart.VISUAL_ID:
                return new Action4EditPart(view);

            case ActionLabel4EditPart.VISUAL_ID:
                return new ActionLabel4EditPart(view);

            case TextualCodeEditPart.VISUAL_ID:
                return new TextualCodeEditPart(view);

            case StateStateEditPart.VISUAL_ID:
                return new StateStateEditPart(view);

            case StateState2EditPart.VISUAL_ID:
                return new StateState2EditPart(view);

            case StateState3EditPart.VISUAL_ID:
                return new StateState3EditPart(view);

            case StateState4EditPart.VISUAL_ID:
                return new StateState4EditPart(view);

            case StateState5EditPart.VISUAL_ID:
                return new StateState5EditPart(view);

            case StateRegionCompartmentEditPart.VISUAL_ID:
                return new StateRegionCompartmentEditPart(view);

            case RegionStateCompartmentEditPart.VISUAL_ID:
                return new RegionStateCompartmentEditPart(view);

            case StateState6EditPart.VISUAL_ID:
                return new StateState6EditPart(view);

            case StateState7EditPart.VISUAL_ID:
                return new StateState7EditPart(view);

            case StateState8EditPart.VISUAL_ID:
                return new StateState8EditPart(view);

            case StateState9EditPart.VISUAL_ID:
                return new StateState9EditPart(view);

            case StateState10EditPart.VISUAL_ID:
                return new StateState10EditPart(view);

            case StateRegionCompartment2EditPart.VISUAL_ID:
                return new StateRegionCompartment2EditPart(view);

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
            if (getWrapLabel().isTextWrapOn() && getWrapLabel().getText().length() > 0) {
                rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
            } else {

                Font font = text.getFont();
                if (!font.isDisposed()) {
                    int avr = FigureUtilities.getFontMetrics(font).getAverageCharWidth();
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

            Font font = text.getFont();
            if (!font.isDisposed()) {
                int avr = FigureUtilities.getFontMetrics(font).getAverageCharWidth();
                rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(
                        avr * 2, 0));
            }
            if (!rect.equals(new Rectangle(text.getBounds()))) {
                text.setBounds(rect.x, rect.y, rect.width, rect.height);
            }
        }
    }
}
