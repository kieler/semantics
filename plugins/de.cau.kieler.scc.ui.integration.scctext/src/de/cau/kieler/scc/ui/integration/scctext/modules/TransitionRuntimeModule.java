package de.cau.kieler.scc.ui.integration.scctext.modules;

import org.eclipse.xtext.parser.IParser;
import de.cau.kieler.scc.model.scctext.SCCExpRuntimeModule;
import de.cau.kieler.scc.ui.integration.scctext.parsers.TransitionAntlrParser;

public class TransitionRuntimeModule extends SCCExpRuntimeModule {
	@Override
	public Class<? extends IParser> bindIParser() {
		return TransitionAntlrParser.class;
	}
}