package de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext;

import org.yakindu.sct.ui.editor.extensions.AbstractExpressionsProvider;

import com.google.inject.Module;

import de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.modules.StateRuntimeModule;
import de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.modules.StateUIModule;


public class StateExpressionProvider extends AbstractExpressionsProvider {
	@Override
	protected Module getRuntimeModule() {
		return new StateRuntimeModule();
	}

	@Override
	protected Module getUIModule() {
		return new StateUIModule(Activator.getDefault());
	}
}