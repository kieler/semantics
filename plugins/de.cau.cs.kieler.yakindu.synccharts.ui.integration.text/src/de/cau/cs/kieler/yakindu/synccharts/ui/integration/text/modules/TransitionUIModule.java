package de.cau.cs.kieler.yakindu.synccharts.ui.integration.text.modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;

import de.cau.cs.kieler.yakindu.synccharts.model.text.ui.SyncTextUiModule;
import de.cau.cs.kieler.yakindu.synccharts.ui.integration.text.parsers.TransitionContentAssistParser;

public class TransitionUIModule extends SyncTextUiModule {
	public TransitionUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return TransitionContentAssistParser.class;
	}
}