package de.cau.kieler.scc.ui.integration.scctext;

import org.yakindu.sct.ui.editor.extensions.AbstractExpressionsProvider;
import com.google.inject.Module;
import de.cau.kieler.scc.ui.integration.scctext.modules.TransitionRuntimeModule;
import de.cau.kieler.scc.ui.integration.scctext.modules.TransitionUIModule;

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