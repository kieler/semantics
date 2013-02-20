package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.ui.SyncExpUiModule;
import de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers.StatechartContentAssistParser;

public class StatechartUIModule extends SyncExpUiModule {
	public StatechartUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return StatechartContentAssistParser.class;
	}
}