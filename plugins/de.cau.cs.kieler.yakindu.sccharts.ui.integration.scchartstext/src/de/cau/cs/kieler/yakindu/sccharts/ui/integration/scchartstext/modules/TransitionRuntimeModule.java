package de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.modules;

import org.eclipse.xtext.parser.IParser;

import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.SCChartsExpRuntimeModule;
import de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.parsers.TransitionAntlrParser;

public class TransitionRuntimeModule extends SCChartsExpRuntimeModule {
	@Override
	public Class<? extends IParser> bindIParser() {
		return TransitionAntlrParser.class;
	}
}