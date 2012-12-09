package de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;
import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.ui.SCChartsExpUiModule;
import de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.parsers.StatechartContentAssistParser;

public class StatechartUIModule extends SCChartsExpUiModule {
	public StatechartUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return StatechartContentAssistParser.class;
	}
}