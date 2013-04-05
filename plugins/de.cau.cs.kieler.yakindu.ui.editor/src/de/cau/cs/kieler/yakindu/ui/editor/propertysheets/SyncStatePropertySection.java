package de.cau.cs.kieler.yakindu.ui.editor.propertysheets;

import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.yakindu.sct.ui.editor.propertysheets.StatePropertySection;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage;

public class SyncStatePropertySection extends StatePropertySection {

	private ComboViewer isInitialKindViewer;
	private ComboViewer isFinalKindViewer;

	@Override
	protected void createRightColumnControls(Composite rightColumn) {
		createNameControl(rightColumn);

		createIsInitialControl(rightColumn);
		createIsFinalControl(rightColumn);
		createTransitionsControl(rightColumn);
		// createSubmachineControl(rightColumn);
	}

	@Override
	protected void updateLabel() {
	}

	/**
	 * Create the isInitial Combo. It allows to select false or true
	 * 
	 * @param parent
	 *            the parent Composite
	 */
	private void createIsInitialControl(Composite parent) {
		Label kindLabel = getToolkit().createLabel(parent, "Is Initial: ");
		GridDataFactory.fillDefaults().applyTo(kindLabel);
		isInitialKindViewer = new ComboViewer(parent, SWT.READ_ONLY
				| SWT.SINGLE);
		isInitialKindViewer.setContentProvider(new ArrayContentProvider());
		isInitialKindViewer.setLabelProvider(new LabelProvider());
		isInitialKindViewer.add(false);
		isInitialKindViewer.add(true);
		GridDataFactory.fillDefaults().grab(true, false)
				.applyTo(isInitialKindViewer.getControl());
	}

	/**
	 * Create the isFinal Combo. It allows to select false or true
	 * 
	 * @param parent
	 *            the parent Composite
	 */
	private void createIsFinalControl(Composite parent) {
		Label kindLabel = getToolkit().createLabel(parent, "Is Final: ");
		GridDataFactory.fillDefaults().applyTo(kindLabel);
		isFinalKindViewer = new ComboViewer(parent, SWT.READ_ONLY | SWT.SINGLE);
		isFinalKindViewer.setContentProvider(new ArrayContentProvider());
		isFinalKindViewer.setLabelProvider(new LabelProvider());
		isFinalKindViewer.add(false);
		isFinalKindViewer.add(true);
		GridDataFactory.fillDefaults().grab(true, false)
				.applyTo(isFinalKindViewer.getControl());
	}

	@Override
	public void bindModel(EMFDataBindingContext context) {
		super.bindModel(context);
		bindIsInitialKindControl(context);
		bindIsFinalKindControl(context);
	}

	/**
	 * This method enables to select the isInitial attribute
	 * 
	 * @param context
	 */
	private void bindIsInitialKindControl(EMFDataBindingContext context) {
		IEMFValueProperty property = EMFEditProperties.value(
				TransactionUtil.getEditingDomain(eObject),
				SyncgraphPackage.Literals.SYNC_STATE__IS_INITIAL);
		context.bindValue(
				ViewerProperties.singleSelection().observe(isInitialKindViewer),
				property.observe(eObject));
	}

	/**
	 * This method enables to select the isFinal attribute
	 * 
	 * @param context
	 */
	private void bindIsFinalKindControl(EMFDataBindingContext context) {
		IEMFValueProperty property = EMFEditProperties.value(
				TransactionUtil.getEditingDomain(eObject),
				SyncgraphPackage.Literals.SYNC_STATE__IS_FINAL);
		context.bindValue(
				ViewerProperties.singleSelection().observe(isFinalKindViewer),
				property.observe(eObject));
	}

}
