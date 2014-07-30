/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
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

/**
 * The SyncState property sheets. This method extends the StateProperySection to
 * add two combo boxes that allow the user to set a state as initial and final.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 */
public class SyncStatePropertySection extends StatePropertySection {

	private ComboViewer isInitialKindViewer;
	private ComboViewer isFinalKindViewer;

	/**
	 * Create the right column controls which contains a text area for the state
	 * name and two combo boxes: Is Initial combo box which allows to set a
	 * state as initial. Is final combo box which allows to set a state as
	 * final.
	 */
	@Override
	protected void createRightColumnControls(Composite rightColumn) {
		createNameControl(rightColumn);
		createIsInitialControl(rightColumn);
		createIsFinalControl(rightColumn);
		createTransitionsControl(rightColumn);
	}

	/**
	 * The updateLabel method is overridden to disable the substatechart text
	 * which is no more needed in the yakindu SyncCharts editor.
	 */
	@Override
	protected void updateLabel() {
	}

	/**
	 * Create the isInitial Combo. It allows to select false or true.
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
	 * Create the isFinal Combo. It allows to select false or true.
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

	/**
	 * This method overrides the bindModel method from the StatePropertySection
	 * class to bind additionally the IsInitial and IsFinal controls.
	 */
	@Override
	public void bindModel(EMFDataBindingContext context) {
		super.bindModel(context);
		bindIsInitialKindControl(context);
		bindIsFinalKindControl(context);
	}

	/**
	 * This method enables to select the isInitial attribute.
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
	 * This method enables to select the isFinal attribute.
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
