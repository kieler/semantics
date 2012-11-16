package de.cau.kieler.scc.ui.integration.scctext.modules;

import org.eclipse.xtext.parser.IParser;
import de.cau.kieler.scc.model.scctext.SCCExpRuntimeModule;
import de.cau.kieler.scc.ui.integration.scctext.parsers.StateAntlrParser;

public class StateRuntimeModule extends SCCExpRuntimeModule {
	@Override
	public Class<? extends IParser> bindIParser() {
		return StateAntlrParser.class;
	}
}