package de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.modules;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.ui.SynctextUiModule;
import de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.parsers.TransitionContentAssistParser;

public class TransitionUIModule extends SynctextUiModule {
	public TransitionUIModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return TransitionContentAssistParser.class;
	}
}