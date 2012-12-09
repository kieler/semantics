package de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext;

import org.yakindu.sct.ui.editor.extensions.AbstractExpressionsProvider;

import com.google.inject.Module;

import de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.modules.StatechartRuntimeModule;
import de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.modules.StatechartUIModule;



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