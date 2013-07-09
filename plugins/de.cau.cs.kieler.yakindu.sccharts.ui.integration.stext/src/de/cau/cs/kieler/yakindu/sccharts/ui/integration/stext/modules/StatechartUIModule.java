package de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.ui.SynctextUiModule;
import de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.parsers.StatechartContentAssistParser;

public class StatechartUIModule extends SynctextUiModule {
	public StatechartUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return StatechartContentAssistParser.class;
	}
}