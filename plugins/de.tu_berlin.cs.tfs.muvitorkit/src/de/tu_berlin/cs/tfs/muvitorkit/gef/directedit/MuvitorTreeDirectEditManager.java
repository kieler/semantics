package de.tu_berlin.cs.tfs.muvitorkit.gef.directedit;

import de.tu_berlin.cs.tfs.muvitorkit.gef.editparts.AdapterTreeEditPart;
import de.tu_berlin.cs.tfs.muvitorkit.ui.utils.SWTResourceManager;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.gef.TreeEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.window.DefaultToolTip;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * A helper class to perform a direct edit with a TextCellEditor on
 * {@link IDirectEditPart}s that have a {@link MuvitorTreeDirectEditPolicy}
 * installed. Adapted for {@link TreeEditPart}s from
 * {@link MuvitorDirectEditManager}.
 * 
 * @see AdapterTreeEditPart
 * 
 * @author Tony Modica
 */

public class MuvitorTreeDirectEditManager {

	private ICellEditorListener cellEditorListener;

	/**
	 * Is <code>true</code> if the cell editor's value has been changed.
	 */
	boolean dirty;

	private DirectEditRequest request;

	private EditPartListener editPartListener;

	private final TreeEditPart source;

	private CellEditor cellEditor;

	private boolean committing = false;

	private org.eclipse.swt.custom.TreeEditor tableEditor;

	private final ICellEditorValidator validator;

	DefaultToolTip errorToolTip;

	/**
	 * Constructs a new DirectEditManager for the given source edit part. A new
	 * TextCellEditor will be created and placed using the given
	 * CellEditorLocator.
	 * 
	 * @param source
	 *            The source edit part
	 */
	public MuvitorTreeDirectEditManager(final TreeEditPart source) {
		Assert
				.isTrue(
						source instanceof IDirectEditPart,
						"MuvitorTreeDirectEditManager must not be installed on edit parts that do not implement IDirectEditPart!");
		this.source = source;
		validator = ((IDirectEditPart) source).getDirectEditValidator();
	}

	/**
	 * Cleanup is done here. Any feedback is erased and listeners unhooked. If
	 * the cell editor is not <code>null</code>, it will be
	 * {@link CellEditor#deactivate() deativated}, {@link CellEditor#dispose()
	 * disposed}, and set to <code>null</code>.
	 */
	void bringDown() {
		unhookListeners();
		if (cellEditor != null) {
			cellEditor.setValidator(null);
			cellEditor.deactivate();
			cellEditor.dispose();
			cellEditor = null;
		}
		if (tableEditor != null) {
			tableEditor.getEditor().dispose();
			tableEditor.dispose();
			tableEditor = null;
		}
		request = null;
		dirty = false;
	}

	/**
	 * Shows the cell editor when direct edit is started.
	 */
	public void show() {
		if (cellEditor != null) {
			return;
		}
		final TreeItem treeItem = (TreeItem) source.getWidget();
		final Composite composite = treeItem.getParent();
		cellEditor = new TextCellEditor(composite) {
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
				getErrorToolTip().show(
						new Point(treeItem.getBounds().width, treeItem
								.getBounds().height));
				return false;
			}
		};
		hookListeners();

		tableEditor = new org.eclipse.swt.custom.TreeEditor((Tree) composite);

		final CellEditor.LayoutData layout = cellEditor.getLayoutData();
		tableEditor.horizontalAlignment = layout.horizontalAlignment;
		tableEditor.grabHorizontal = layout.grabHorizontal;
		tableEditor.minimumWidth = layout.minimumWidth;
		tableEditor.setEditor(cellEditor.getControl(), (TreeItem) source
				.getWidget(), 0);

		cellEditor.setValidator(validator);

		final EObject model = (EObject) source.getModel();
		final int featureID = ((IDirectEditPart) source)
				.getDirectEditFeatureID();
		final EStructuralFeature feature = model.eClass()
				.getEStructuralFeature(featureID);
		final String value = model.eGet(feature).toString();
		cellEditor.setValue(value);

		cellEditor.activate();
		cellEditor.setFocus();
	}

	DefaultToolTip getErrorToolTip() {
		if (errorToolTip == null) {
			errorToolTip = new DefaultToolTip(cellEditor.getControl(),
					ToolTip.RECREATE, true);
		}
		return errorToolTip;
	}

	/**
	 * Commits the current value of the cell editor by getting a {@link Command}
	 * from the source edit part and executing it via the {@link CommandStack}.
	 * Finally, {@link #bringDown()} is called to perform and necessary cleanup.
	 */
	void commit() {
		if (committing) {
			return;
		}
		committing = true;
		try {
			if (dirty) {
				getDirectEditRequest().setDirectEditFeature(
						cellEditor.getValue());
				final CommandStack stack = source.getViewer().getEditDomain()
						.getCommandStack();
				stack.execute(source.getCommand(getDirectEditRequest()));
			}
		} finally {
			bringDown();
			committing = false;
		}
	}

	private DirectEditRequest getDirectEditRequest() {
		if (request == null) {
			request = new DirectEditRequest();
		}
		return request;
	}

	private void hookListeners() {
		cellEditorListener = new ICellEditorListener() {

			public void applyEditorValue() {
				commit();
			}

			public void cancelEditor() {
				bringDown();
			}

			public void editorValueChanged(final boolean old,
					final boolean newState) {
				dirty = newState;
			}
		};
		cellEditor.addListener(cellEditorListener);
		editPartListener = new EditPartListener.Stub() {

			@Override
			public void selectedStateChanged(final EditPart editpart) {
				if (editpart.getSelected() != 2) {
					bringDown();
				}
			}
		};
		source.addEditPartListener(editPartListener);
	}

	/**
	 * Unhooks listeners. Called from {@link #bringDown()}.
	 */
	private void unhookListeners() {
		source.removeEditPartListener(editPartListener);
		editPartListener = null;
		if (cellEditor != null) {
			cellEditor.removeListener(cellEditorListener);
			cellEditorListener = null;
		}
	}

}
