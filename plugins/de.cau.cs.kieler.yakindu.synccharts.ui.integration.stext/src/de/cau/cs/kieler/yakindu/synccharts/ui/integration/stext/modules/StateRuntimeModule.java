package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.modules;

import org.eclipse.xtext.parser.IParser;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.SyncExpRuntimeModule;
import de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers.StateAntlrParser;

public class StateRuntimeModule extends SyncExpRuntimeModule {
	@Override
	public Class<? extends IParser> bindIParser() {
		return StateAntlrParser.class;
	}
}