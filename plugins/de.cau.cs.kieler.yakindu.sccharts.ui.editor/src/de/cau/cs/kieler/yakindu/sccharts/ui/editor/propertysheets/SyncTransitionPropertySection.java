package de.cau.cs.kieler.yakindu.sccharts.ui.editor.propertysheets;

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

import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncgraphPackage;
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.TransitionType;

public class SyncTransitionPropertySection extends
		AbstractTwoColumnEditorPropertySection {

	private Control textControl;
	private ComboViewer transitionTypeKindViewer;
	private ComboViewer isHistoryKindViewer;

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
		Label kindLabel = getToolkit().createLabel(parent, "Transition Type: ");
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
	 * Create the isHistory Combo. It allows to select false or true
	 * 
	 * @param parent
	 *            the parent Composite
	 */
	private void createIsHistoryControl(Composite parent) {
		Label kindLabel = getToolkit().createLabel(parent, "Is History: ");
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
	 * Bind the transition type
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
		bindIsHistoryKindControl(context);
	}

	@Override
	protected void createRightColumnControls(Composite rightColumn) {
		createTransitionTypeControl(rightColumn);
		createIsHistoryControl(rightColumn);
	}

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
	 * This method enables to select the isHistory attribute
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
}
