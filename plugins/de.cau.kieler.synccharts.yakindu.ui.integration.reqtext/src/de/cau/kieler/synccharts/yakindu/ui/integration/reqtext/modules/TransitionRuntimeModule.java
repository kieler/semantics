package de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.modules;

import org.eclipse.xtext.parser.IParser;

import de.cau.kieler.synccharts.yakindu.model.reqtext.KidsexpRuntimeModule;
import de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.parsers.TransitionAntlrParser;


public class TransitionRuntimeModule extends KidsexpRuntimeModule {
	@Override
	public Class<? extends IParser> bindIParser() {
		return TransitionAntlrParser.class;
	}
}