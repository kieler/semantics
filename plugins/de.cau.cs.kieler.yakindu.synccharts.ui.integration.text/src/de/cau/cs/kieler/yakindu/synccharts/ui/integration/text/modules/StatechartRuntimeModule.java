package de.cau.cs.kieler.yakindu.synccharts.ui.integration.text.modules;

import org.eclipse.xtext.parser.IParser;

import de.cau.cs.kieler.yakindu.synccharts.model.text.SyncTextRuntimeModule;
import de.cau.cs.kieler.yakindu.synccharts.ui.integration.text.parsers.StatechartAntlrParser;

public class StatechartRuntimeModule extends SyncTextRuntimeModule {
	@Override
	public Class<? extends IParser> bindIParser() {
		return StatechartAntlrParser.class;
	}
}