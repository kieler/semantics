package de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.modules;

import org.yakindu.sct.ui.editor.extensions.AbstractExpressionsProvider;

import com.google.inject.Module;

import de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.Activator;

public class StatechartExpressionProvider extends AbstractExpressionsProvider {
	@Override
	protected Module getRuntimeModule() {
		return new StatechartRuntimeModule();
	}

	@Override
	protected Module getUIModule() {
		return new StatechartUIModule(Activator.getDefault());
	}
}