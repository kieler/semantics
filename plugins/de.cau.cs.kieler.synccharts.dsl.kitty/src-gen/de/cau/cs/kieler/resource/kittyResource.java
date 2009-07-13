package de.cau.cs.kieler.resource;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.xtext.parser.IXtextParser;
import org.openarchitectureware.xtext.resource.AbstractXtextResource;

import de.cau.cs.kieler.parser.XtextParser;

public class kittyResource extends AbstractXtextResource {
	public kittyResource(URI uri) {
		super(uri);
		setFormattingExtension("de::cau::cs::kieler::Formatting");
		setResourceLoader(new ResourceLoaderImpl(XtextParser.class.getClassLoader()));
	}

	@Override
	protected IXtextParser createParser(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

}

