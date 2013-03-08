package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.ui.SyncChartstextUiModule;
import de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers.StateContentAssistParser;

public class StateUIModule extends SyncChartstextUiModule {
	public StateUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return StateContentAssistParser.class;
	}
}