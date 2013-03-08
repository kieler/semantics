package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.modules;

import org.eclipse.xtext.parser.IParser;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.SyncChartstextRuntimeModule;
import de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers.TransitionAntlrParser;

public class TransitionRuntimeModule extends SyncChartstextRuntimeModule {
	@Override
	public Class<? extends IParser> bindIParser() {
		return TransitionAntlrParser.class;
	}
}