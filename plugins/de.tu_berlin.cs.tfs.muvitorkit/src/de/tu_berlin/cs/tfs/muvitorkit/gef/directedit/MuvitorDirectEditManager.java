package de.tu_berlin.cs.tfs.muvitorkit.gef.directedit;

import de.tu_berlin.cs.tfs.muvitorkit.gef.directedit.IDirectEditPart.IGraphicalDirectEditPart;
import de.tu_berlin.cs.tfs.muvitorkit.gef.editparts.AdapterConnectionEditPart;
import de.tu_berlin.cs.tfs.muvitorkit.gef.editparts.AdapterGraphicalEditPart;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.SWTResourceManager;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.window.DefaultToolTip;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.internal.PartSite;
import org.eclipse.ui.part.CellEditorActionHandler;

/**
 * The {@link DirectEditManager} for {@link IGraphicalDirectEditPart}s that have
 * a {@link MuvitorDirectEditPolicy} installed. Creates an
 * {@link TextCellEditor} for changing the name of a named element in place.
 * 
 * @see AdapterConnectionEditPart
 * @see AdapterGraphicalEditPart
 */
@SuppressWarnings("restriction")
public class MuvitorDirectEditManager extends DirectEditManager {
	private IActionBars actionBars;

	private CellEditorActionHandler actionHandler;

	private IAction copy, cut, paste, undo, redo, find, selectAll, delete;

	DefaultToolTip errorToolTip;

	public MuvitorDirectEditManager(final GraphicalEditPart source) {
		super(source, null, new CellEditorLocator() {
			/**
			 * Determine the position for the {@link CellEditor} based on the
			 * bounds {@link IGraphicalDirectEditPart} provide.
			 */
			public void relocate(final CellEditor celleditor) {
				final IFigure figure = source.getFigure();
				final Text text = (Text) celleditor.getControl();
				final Rectangle rect = ((IGraphicalDirectEditPart) source)
						.getValueLabelTextBounds();
				figure.translateToAbsolute(rect);
				final Point size = text.computeSize(SWT.DEFAULT, SWT.DEFAULT,
						true);
				final org.eclipse.swt.graphics.Rectangle trim = text
						.computeTrim(0, 0, 0, 0);
				rect.translate(trim.x, trim.y);
				rect.width = Math.max(size.x, rect.width);
				rect.width += trim.width;
				rect.height += trim.height;
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		});
		Assert
				.isTrue(
						source instanceof IGraphicalDirectEditPart,
						"MuvitorDirectEditManager must not be installed on edit parts that do not implement IGraphicalDirectEditPart!");
	}

	@Override
	protected void bringDown() {
		getErrorToolTip().hide();
		getErrorToolTip().deactivate();
		if (actionHandler != null) {
			actionHandler.dispose();
			actionHandler = null;
		}
		if (actionBars != null) {
			// restore saved actions
			actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(), copy);
			actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(),
					paste);
			actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
					delete);
			actionBars.setGlobalActionHandler(ActionFactory.SELECT_ALL.getId(),
					selectAll);
			actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(), cut);
			actionBars.setGlobalActionHandler(ActionFactory.FIND.getId(), find);
			actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undo);
			actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redo);
			// -----------------
			actionBars.updateActionBars();
			actionBars = null;
		}

		super.bringDown();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.tools.DirectEditManager#createCellEditorOn(org.eclipse
	 * .swt.widgets.Composite)
	 */
	@Override
	protected CellEditor createCellEditorOn(final Composite composite) {
		return new TextCellEditor(composite) {

			@Override
			protected boolean isCorrect(final Object value) {
				if (super.isCorrect(value)) {
					// do not hide (possibly just create) errorToolTip if not
					// necessary
					if (errorToolTip != null) {
						getErrorToolTip().hide();
					}
					text.setForeground(SWTResourceManager.getColor(0, 0, 0));
					text.setToolTipText(getErrorMessage());
					return true;
				}
				text.setForeground(SWTResourceManager.getColor(255, 0, 0));
				getErrorToolTip().setText(getErrorMessage());
				getErrorToolTip().show(getControl().getSize());
				return false;
			}

		};
	}

	DefaultToolTip getErrorToolTip() {
		if (errorToolTip == null) {
			errorToolTip = new DefaultToolTip(getCellEditor().getControl(),
					ToolTip.RECREATE | SWT.SHADOW_IN, true);
		}
		return errorToolTip;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.tools.DirectEditManager#initCellEditor()
	 */
	@Override
	protected void initCellEditor() {
		final EObject model = (EObject) getEditPart().getModel();
		final int featureID = ((IGraphicalDirectEditPart) getEditPart())
				.getDirectEditFeatureID();
		final EStructuralFeature feature = model.eClass()
				.getEStructuralFeature(featureID);
		final String value = model.eGet(feature).toString();
		getCellEditor().setValue(value);
		getCellEditor().setValidator(
				((IGraphicalDirectEditPart) getEditPart())
						.getDirectEditValidator());
		updateActionBars();
	}

	private void updateActionBars() {
		// FIXED if a view is maximized we must use the viewsite's action bars
		// because there is no "active editor"
		final PartSite site = (PartSite) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActivePart()
				.getSite();
		actionBars = site.getActionBars();
		// save current actions
		copy = actionBars.getGlobalActionHandler(ActionFactory.COPY.getId());
		paste = actionBars.getGlobalActionHandler(ActionFactory.PASTE.getId());
		delete = actionBars
				.getGlobalActionHandler(ActionFactory.DELETE.getId());
		selectAll = actionBars.getGlobalActionHandler(ActionFactory.SELECT_ALL
				.getId());
		cut = actionBars.getGlobalActionHandler(ActionFactory.CUT.getId());
		find = actionBars.getGlobalActionHandler(ActionFactory.FIND.getId());
		undo = actionBars.getGlobalActionHandler(ActionFactory.UNDO.getId());
		redo = actionBars.getGlobalActionHandler(ActionFactory.REDO.getId());
		// ---------
		actionHandler = new CellEditorActionHandler(actionBars);
		actionHandler.addCellEditor(getCellEditor());
		actionBars.updateActionBars();
	}
}
