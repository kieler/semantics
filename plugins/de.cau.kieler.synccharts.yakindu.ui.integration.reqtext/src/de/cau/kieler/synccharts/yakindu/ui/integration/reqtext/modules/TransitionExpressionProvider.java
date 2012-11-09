package de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.modules;

import org.yakindu.sct.ui.editor.extensions.AbstractExpressionsProvider;
import com.google.inject.Module;

import de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.Activator;
import de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.modules.TransitionRuntimeModule;
import de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.modules.TransitionUIModule;

public class TransitionExpressionProvider extends AbstractExpressionsProvider {
	@Override
	protected Module getRuntimeModule() {
		return new TransitionRuntimeModule();
	}

	@Override
	protected Module getUIModule() {
		return new TransitionUIModule(Activator.getDefault());
	}
}