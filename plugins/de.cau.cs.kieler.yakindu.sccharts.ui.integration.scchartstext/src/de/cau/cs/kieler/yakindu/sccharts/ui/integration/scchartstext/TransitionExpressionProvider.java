package de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext;

import org.yakindu.sct.ui.editor.extensions.AbstractExpressionsProvider;

import com.google.inject.Module;

import de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.modules.TransitionRuntimeModule;
import de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.modules.TransitionUIModule;


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