package de.cau.cs.kieler.yakindu.scc.ui.integration.scctext.modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;
import de.cau.cs.kieler.yakindu.scc.model.scctext.ui.SCCExpUiModule;
import de.cau.cs.kieler.yakindu.scc.ui.integration.scctext.parsers.StateContentAssistParser;

public class StateUIModule extends SCCExpUiModule {
	public StateUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return StateContentAssistParser.class;
	}
}