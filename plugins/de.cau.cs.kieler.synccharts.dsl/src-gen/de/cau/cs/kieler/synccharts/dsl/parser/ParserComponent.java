package de.cau.cs.kieler.synccharts.dsl.parser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.xtext.parser.impl.AbstractParserComponent;
import org.openarchitectureware.xtext.resource.IXtextResource;

import de.cau.cs.kieler.synccharts.dsl.resource.scdslResourceFactory;

public class ParserComponent extends AbstractParserComponent {
	static {
		scdslResourceFactory.register();
	}

	protected String getFileExtension() {
		return "scdsl";
	}

}
