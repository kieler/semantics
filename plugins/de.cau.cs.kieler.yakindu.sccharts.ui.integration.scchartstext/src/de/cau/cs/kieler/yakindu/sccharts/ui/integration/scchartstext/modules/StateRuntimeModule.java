package de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.modules;

import org.eclipse.xtext.parser.IParser;

import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.SCChartsExpRuntimeModule;
import de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.parsers.StateAntlrParser;

public class StateRuntimeModule extends SCChartsExpRuntimeModule {
	@Override
	public Class<? extends IParser> bindIParser() {
		return StateAntlrParser.class;
	}
}