package de.cau.cs.kieler.yakindu.scc.ui.integration.scctext.modules;

import org.eclipse.xtext.parser.IParser;

import de.cau.cs.kieler.yakindu.scc.model.scctext.SCCExpRuntimeModule;
import de.cau.cs.kieler.yakindu.scc.ui.integration.scctext.parsers.StatechartAntlrParser;

public class StatechartRuntimeModule extends SCCExpRuntimeModule {
	@Override
	public Class<? extends IParser> bindIParser() {
		return StatechartAntlrParser.class;
	}
}