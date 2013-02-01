package de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.modules;

import org.eclipse.xtext.parser.IParser;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.SCChartsExpRuntimeModule;
import de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.parsers.StatechartAntlrParser;

public class StatechartRuntimeModule extends SCChartsExpRuntimeModule {
	@Override
	public Class<? extends IParser> bindIParser() {
		return StatechartAntlrParser.class;
	}
}