package de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;
import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.ui.SCChartsExpUiModule;
import de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.parsers.StateContentAssistParser;

public class StateUIModule extends SCChartsExpUiModule {
	public StateUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return StateContentAssistParser.class;
	}
}