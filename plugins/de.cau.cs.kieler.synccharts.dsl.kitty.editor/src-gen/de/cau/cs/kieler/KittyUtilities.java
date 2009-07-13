package de.cau.cs.kieler;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.openarchitectureware.xtext.AbstractLanguageUtilities;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.IXtextParser;

import de.cau.cs.kieler.parser.XtextParser;

public class KittyUtilities extends AbstractLanguageUtilities {

	// enforce eager registration of metamodel
	private static final EPackage EPACKAGE = de.cau.cs.kieler.MetaModelRegistration.getEPackage();
	
	@Override
	protected IXtextParser internalParse(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

	public String getFileExtension() {
		return "kitty";
	}

	public EPackage getEPackage() {
		return EPACKAGE;
	}

	List<String> r = new ArrayList<String>();
	{
		r.add("suspend");
		r.add("nt");
		r.add("model");
		r.add("normalTermination");
		r.add("localVariable");
		r.add("choice");
		r.add("var");
		r.add("exitActivity");
		r.add("type");
		r.add("float");
		r.add("version");
		r.add("initial");
		r.add("priority");
		r.add("dynamicchoice");
		r.add("strongAbortion");
		r.add("_");
		r.add("do");
		r.add("combine integer with *");
		r.add("boolean");
		r.add("localEvent");
		r.add("combine integer with +");
		r.add("doActivity");
		r.add("internal");
		r.add("final");
		r.add("it");
		r.add("sp");
		r.add("integer");
		r.add("entryActivity");
		r.add("suspension");
		r.add("label");
		r.add("double");
		r.add("statechart");
		r.add("exit");
		r.add("history");
		r.add("input");
		r.add("co");
		r.add("sa");
		r.add("weakAbortion");
		r.add("entry");
		r.add("conditional");
		r.add("wa");
		r.add("output");
	}
	public List<String> allKeywords() {
		return r;
	}

	protected ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

	public IPartitionTokenScanner getPartitionScanner() {
		return new GeneratedPartitionScanner();
	}

	@Override
	public AbstractXtextEditorPlugin getXtextEditorPlugin() {
		return KittyEditorPlugin.getDefault();
	}
	
	@Override
	public String getPackageForExtensions() {
		return "de::cau::cs::kieler";
	}
	
	public XtextFile getXtextFile() {
		return MetaModelRegistration.getXtextFile();
	}
	

}
