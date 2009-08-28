package de.cau.cs.kieler.synccharts.dsl.rtsys.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic; //import org.eclipse.xtend.typesystem.emf.Setup;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parsetree.reconstr.SerializerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet; //	import org.junit.Before;
//	import org.junit.Test;

import com.google.inject.Injector;

import de.cau.cs.kieler.synccharts.dsl.RetypingSyncchartsStandaloneSetup;

public class StandaloneRtsysParserTest {

	private static Injector injector;
	private static SerializerUtil serializerUtil;

	public static void main(String[] args) {
		injector = new RetypingSyncchartsStandaloneSetup()
				.createInjectorAndDoEMFRegistration();

		serializerUtil = injector.getInstance(SerializerUtil.class);
		try {
			testParser1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// @Before
	// @Test
	public static void testParser1() throws IOException {
		EObject parsedObject = parseAndSerialize("example.mydsl");
		// VarDeclList model = (VarDeclList) parsedObject;
		// String serializedString = serializerUtil.serialize(model.getVar()
		// .get(0));
		// System.out.println(serializedString);
	}

	private static EObject parseAndSerialize(String inputFileName)
			throws IOException {
		// parse and serialize the contents of the given file
		EObject parsedObject = parseFile(inputFileName);
		String serializedString = serializerUtil.serialize(parsedObject);
		// what was in the file?
		String fileContent = readFile(getModelFolder() + inputFileName);
		// is the file content equal to the serialized string at the end?
		if (fileContent.equals(serializedString)) {
			System.out.println("parseAndSerialize::Serialized String: "
					+ serializedString);

		} else
			System.out
					.println("parseAndSerialize::Serialization failed. Input and output"
							+ "are not the same: Input: "
							+ fileContent
							+ " Output: " + serializedString);
		return parsedObject;
	}

	/**
	 * change this path if you change the model folder!! this sucks
	 * 
	 * @return the path to the folder that contains the models
	 * 
	 */
	private static String getModelFolder() {
		String modelFolder = "/home/oba/Desktop/Link to shared/kieler/trunk/plugins/de.cau.cs.kieler.synccharts.dsl.rtsys/examplemodels/";
		return modelFolder;
	}
/**
 * 
 * @param file simple file name, without path etc
 * @return what has been parsed
 */
	private static EObject parseFile(String file) {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");

		XtextResourceSet resourceSet = injector
				.getInstance(XtextResourceSet.class);

		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI
				.createURI("platform:/resource/org.xtext.example.mydsl/models/"
						+ file), true);
		XtextResource xresource = (XtextResource) resource;

		IParseResult parseResult = xresource.getParseResult();
		if (parseResult == null)
			System.out
					.println("Could not parse action string. Parser did return null.");
		// // were there any errors or warnings?
		getErrorsOrWarnings(xresource, xresource.getErrors());
		getErrorsOrWarnings(xresource, xresource.getWarnings());
		EObject parsedObject = resource.getContents().get(0);
		return parsedObject;
	}

	private static void getErrorsOrWarnings(XtextResource resource,
			EList<Diagnostic> diagnostics) {

		if (diagnostics != null && diagnostics.size() > 0) {
			String parseErrorString = "";

			for (Diagnostic diagnostic : diagnostics) {
				parseErrorString += "\n" + diagnostic.getMessage();
			}
			System.out.println("Parse errors or warnings in action String: "
					+ parseErrorString);
		}

	}
/**
 * 
 * @param filename
 * @return contents of the given file, I need this to compare the parseResult with the urspruenglichen file content
 * @throws IOException
 */
	private static String readFile(String filename) throws IOException {
		// String lineSep = System.getProperty("line.separator");
		// BufferedReader br = new BufferedReader(new FileReader(filename));
		// String nextLine = "";
		// StringBuffer sb = new StringBuffer();
		// while ((nextLine = br.readLine()) != null) {
		// sb.append(nextLine);
		// sb.append(lineSep);
		// }
		Scanner scanner = new Scanner(new File(filename)).useDelimiter("\\Z");
		String contents = scanner.next();
		// System.out.println(contents);
		scanner.close();
		// return sb.toString();
		return contents;
	}

}
