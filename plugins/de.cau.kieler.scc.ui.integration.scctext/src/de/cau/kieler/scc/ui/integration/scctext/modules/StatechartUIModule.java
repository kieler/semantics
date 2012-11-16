package de.cau.kieler.scc.ui.integration.scctext.modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;

import de.cau.kieler.scc.model.scctext.ui.SCCExpUiModule;
import de.cau.kieler.scc.ui.integration.scctext.parsers.StatechartContentAssistParser;

public class StatechartUIModule extends SCCExpUiModule {
	public StatechartUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return StatechartContentAssistParser.class;
	}
}