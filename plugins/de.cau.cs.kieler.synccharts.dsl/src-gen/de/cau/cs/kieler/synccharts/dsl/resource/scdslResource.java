package de.cau.cs.kieler.synccharts.dsl.resource;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.xtext.parser.IXtextParser;
import org.openarchitectureware.xtext.resource.AbstractXtextResource;

import de.cau.cs.kieler.synccharts.dsl.parser.XtextParser;

public class scdslResource extends AbstractXtextResource {
	public scdslResource(URI uri) {
		super(uri);
		setFormattingExtension("de::cau::cs::kieler::synccharts::dsl::Formatting");
		setResourceLoader(new ResourceLoaderImpl(XtextParser.class.getClassLoader()));
	}

	@Override
	protected IXtextParser createParser(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

}

