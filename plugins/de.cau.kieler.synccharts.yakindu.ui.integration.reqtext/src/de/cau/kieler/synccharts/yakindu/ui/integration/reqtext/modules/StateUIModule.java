package de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;

import de.cau.kieler.synccharts.yakindu.model.reqtext.ui.KidsexpUiModule;
import de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.parsers.StateContentAssistParser;

public class StateUIModule extends KidsexpUiModule {
	public StateUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return StateContentAssistParser.class;
	}
}