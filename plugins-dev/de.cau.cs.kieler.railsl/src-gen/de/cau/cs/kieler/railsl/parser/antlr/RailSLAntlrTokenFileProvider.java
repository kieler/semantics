/*
 * generated by Xtext 2.10.0
 */
package de.cau.cs.kieler.railsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RailSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/cau/cs/kieler/railsl/parser/antlr/internal/InternalRailSL.tokens");
	}
}