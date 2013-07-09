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
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.yakindu.sct.model.sgraph.SGraphPackage;
import org.yakindu.sct.ui.editor.extensions.ExpressionLanguageProviderExtensions.SemanticTarget;
import org.yakindu.sct.ui.editor.propertysheets.AbstractTwoColumnEditorPropertySection;
import org.yakindu.sct.ui.editor.utils.HelpContextIds;

import com.google.inject.Injector;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphPackage;

/**
 * The SyncTransition property sheets. This class extends the
 * AbstractTwoColumnEditorPropertySection to implement the SyncTransition
 * property sheets. The SyncTransition property sheets allows the user to change
 * the transition type, to set a transition to a transition history, and to
 * write transition reactions (triggers and effects). The transition reactions
 * text area is bound to the right column controls. The Transition type combo
 * and isHistory combo are bound into the left column controls.
 * 
 * cmot added isImmediate attribute on 7.6.2013.
 * 
 * @author wah, cmot
 * @kieler.rating green 2013-04-13
 */
public class SyncTransitionPropertySection extends
		AbstractTwoColumnEditorPropertySection {

	/** TEXT */
	private static final String COMBO_LABEL_TRANSITION_TYPE = "Transition Type: ";
	private static final String COMBO_LABEL_TRANSITION_IS_HISTORY = "Is History: ";
        private static final String COMBO_LABEL_TRANSITION_IS_IMMEDIATE = "Is Immediate: ";

	private Control textControl;
	private ComboViewer transitionTypeKindViewer;
	private ComboViewer isHistoryKindViewer;
        private ComboViewer isImmediateKindViewer;

	@Override
	protected Layout createLeftColumnLayout() {
		return new GridLayout(2, false);
	}

	/**
	 * Create the selection Combo. It allows to select the transition type
	 * (WEAKABORT, STRONGABORT or NORMALTERMINATION)
	 * 
	 * @param parent
	 *            the parent Composite
	 */
	private void createTransitionTypeControl(Composite parent) {
		Label kindLabel = getToolkit().createLabel(parent,
				COMBO_LABEL_TRANSITION_TYPE);
		GridDataFactory.fillDefaults().applyTo(kindLabel);
		transitionTypeKindViewer = new ComboViewer(parent, SWT.READ_ONLY
				| SWT.SINGLE);
		transitionTypeKindViewer.setContentProvider(new ArrayContentProvider());
		transitionTypeKindViewer.setLabelProvider(new LabelProvider());
		transitionTypeKindViewer.setInput(TransitionType.values());
		GridDataFactory.fillDefaults().grab(true, false)
				.applyTo(transitionTypeKindViewer.getControl());
	}

	/**
	 * Create the isHistory Combo. It allows to select false or true.
	 * 
	 * @param parent
	 *            the parent Composite
	 */
	private void createIsHistoryControl(Composite parent) {
		Label kindLabel = getToolkit().createLabel(parent,
				COMBO_LABEL_TRANSITION_IS_HISTORY);
		GridDataFactory.fillDefaults().applyTo(kindLabel);
		isHistoryKindViewer = new ComboViewer(parent, SWT.READ_ONLY
				| SWT.SINGLE);
		isHistoryKindViewer.setContentProvider(new ArrayContentProvider());
		isHistoryKindViewer.setLabelProvider(new LabelProvider());
		isHistoryKindViewer.add(false);
		isHistoryKindViewer.add(true);
		GridDataFactory.fillDefaults().grab(true, false)
				.applyTo(isHistoryKindViewer.getControl());
	}

        /**
         * Create the isImmediate Combo. It allows to select false or true.
         * 
         * @param parent
         *            the parent Composite
         */
        private void createIsImmediateControl(Composite parent) {
                Label kindLabel = getToolkit().createLabel(parent,
                                COMBO_LABEL_TRANSITION_IS_IMMEDIATE);
                GridDataFactory.fillDefaults().applyTo(kindLabel);
                isImmediateKindViewer = new ComboViewer(parent, SWT.READ_ONLY
                                | SWT.SINGLE);
                isImmediateKindViewer.setContentProvider(new ArrayContentProvider());
                isImmediateKindViewer.setLabelProvider(new LabelProvider());
                isImmediateKindViewer.add(false);
                isImmediateKindViewer.add(true);
                GridDataFactory.fillDefaults().grab(true, false)
                                .applyTo(isImmediateKindViewer.getControl());
        }	
	
	/**
	 * This method enables to select the transition type
	 * 
	 * @param context
	 */
	private void bindTransitionTypeKindControl(EMFDataBindingContext context) {
		IEMFValueProperty property = EMFEditProperties.value(
				TransactionUtil.getEditingDomain(eObject),
				SyncgraphPackage.Literals.SYNC_TRANSITION__TYPE);
		context.bindValue(
				ViewerProperties.singleSelection().observe(
						transitionTypeKindViewer), property.observe(eObject));
	}

	/**
	 * This method overrides the bindModel method from the
	 * TransitionPropertySection class to bind additionally the TransitionType
	 * and IsHistory controls.
	 */
	@Override
	public void bindModel(EMFDataBindingContext context) {
		IEMFValueProperty modelProperty = EMFEditProperties.value(
				TransactionUtil.getEditingDomain(eObject),
				SGraphPackage.Literals.SPECIFICATION_ELEMENT__SPECIFICATION);
		ISWTObservableValue uiProperty = WidgetProperties.text(SWT.FocusOut)
				.observe(textControl);
		context.bindValue(uiProperty, modelProperty.observe(eObject));
		bindTransitionTypeKindControl(context);
                bindIsImmediateKindControl(context);
		bindIsHistoryKindControl(context);
	}

	/**
	 * Create the Transition Type combo box control and the IsHistory com box
	 * control in the right column (right side) of the property section.
	 */
	@Override
	protected void createRightColumnControls(Composite rightColumn) {
		createTransitionTypeControl(rightColumn);
		createIsImmediateControl(rightColumn);
                createIsHistoryControl(rightColumn);
	}

	/**
	 * Create the Transition text control in the left column (left side) of the
	 * property section.
	 */
	@Override
	protected void createLeftColumnControls(Composite leftColumn) {
		Injector injector = getInjector(SemanticTarget.TransitionSpecification);
		if (injector != null) {
			textControl = new StyledText(leftColumn, SWT.MULTI | SWT.BORDER
					| SWT.V_SCROLL | SWT.WRAP);
			((StyledText) textControl).setAlwaysShowScrollBars(false);
			enableXtext(textControl, injector);
			createHelpWidget(leftColumn, textControl,
					HelpContextIds.SC_PROPERTIES_TRANSITION_EXPRESSION);
		} else {
			textControl = getToolkit().createText(leftColumn, "", SWT.MULTI);
		}
		GridDataFactory.fillDefaults().grab(true, true)
				.hint(leftColumn.getSize()).applyTo(textControl);
	}

	/**
	 * This method enables to select the isHistory attribute. This method binds
	 * the IsHistory control to enable to change the transition as history if
	 * the user changes the combo box value.
	 * 
	 * @param context
	 */
	private void bindIsHistoryKindControl(EMFDataBindingContext context) {
		IEMFValueProperty property = EMFEditProperties.value(
				TransactionUtil.getEditingDomain(eObject),
				SyncgraphPackage.Literals.SYNC_TRANSITION__IS_HISTORY);
		context.bindValue(
				ViewerProperties.singleSelection().observe(isHistoryKindViewer),
				property.observe(eObject));
	}
	
        /**
         * This method enables to select the isImmediate attribute. This method binds
         * the IsImmediate control to enable to change the transition as immediate if
         * the user changes the combo box value.
         * 
         * @param context
         */
        private void bindIsImmediateKindControl(EMFDataBindingContext context) {
                IEMFValueProperty property = EMFEditProperties.value(
                                TransactionUtil.getEditingDomain(eObject),
                                SyncgraphPackage.Literals.SYNC_TRANSITION__IS_IMMEDIATE);
                context.bindValue(
                                ViewerProperties.singleSelection().observe(isImmediateKindViewer),
                                property.observe(eObject));
        }	
}
