package de.cau.kieler.scc.ui.integration.scctext;

import org.yakindu.sct.ui.editor.extensions.AbstractExpressionsProvider;
import com.google.inject.Module;
import de.cau.kieler.scc.ui.integration.scctext.modules.StateRuntimeModule;
import de.cau.kieler.scc.ui.integration.scctext.modules.StateUIModule;

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