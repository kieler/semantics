package de.cau.cs.kieler.synccharts.dsl.kits.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.SerializerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.dsl.KitsStandaloneSetup;

public class StandaloneKitsTest {
    private static Injector injector;
    private static SerializerUtil serializerUtil;
    private static IAntlrParser parser;

    public static void main(String[] args) {
        // get xmi res
        // TransactionalEditingDomain diagramEditor = ((DiagramEditor)
        // PlatformUI
        // .getWorkbench().getActiveWorkbenchWindow().getActivePage()
        // .getActiveEditor()).getEditingDomain();
        // Resource xmires = ((Resource) diagramEditor.getResourceSet()
        // .getResources().get(0));
        StandaloneKitsTest myTest = new StandaloneKitsTest();
        myTest.setupStandaloneSerializerAndParser();

        // FileInputStream filein;
        // try {
        // filein = new FileInputStream(
        // "/home/oba/Desktop/workspaces/KIELER/de.cau.cs.kieler.synccharts.dsl.kits/examplemodels/xmires.kixs");
        // // IParseResult parseRes = parser.doParse(filein);
        // System.out
        // .println("===============================================");
        // System.out.println("-----------PARSE COMPLETED -----------");
        // // System.out.println(parseRes.toString() + "toString completed");
        // //
        // System.out.println(parseRes.getRootNode().getElement().toString());
        //
        // System.out
        // .println("===============================================");
        // // serializerUtil.serialize(parseRes.getRootNode());
        // System.out
        // .println("-----------SERIALIZATION COMPLETED -----------");
        // System.out
        // .println("===============================================");
        // for (AbstractNode e : parseRes.getRootNode().getChildren()) {
        // System.out.print(e.serialize());
        //
        // }

        // return parsedObject;

        // } catch (FileNotFoundException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

    }

    // try {
    // EObject parsedObject = parseAndSerialize("model.kits");
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }
    private void setupStandaloneSerializerAndParser() {
        /**
         * setup parser and serializer first.
         * 
         */
        new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
        System.out.println("> platform uri registered...");
        injector = new KitsStandaloneSetup()
                .createInjectorAndDoEMFRegistration();
        System.out.println("> injector created and EMF registered...");
        // serializerUtil = injector.getInstance(SerializerUtil.class);
        parser = injector.getInstance(IAntlrParser.class);
        System.out.println("> got IAntlrParser instance...");
        XtextResourceSet resourceSet = injector
                .getInstance(XtextResourceSet.class);
        System.out.println("> got XtextResource set...");
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
                Boolean.TRUE);
        System.out.println("> load options added...");
        // why do I need this?:
        // Load the EPackage class by using EcoreUtils
//        EcoreUtil2
//                .getEPackageByClassName("de.cau.cs.kieler.synccharts.SyncchartsPackage");
        Resource resource = resourceSet
                .getResource(
                        URI
                                .createURI("platform:/resource/de.cau.cs.kieler.synccharts.dsl.kits/examplemodels/model.kits"),
                        true);
        System.out.println("> resource created from URI...");
        Region model = (Region) resource.getContents().get(0);
        System.out.println("> the model has " + model.getId()
                + "as its root element--DONE --");
    }

    private static EObject parseAndSerialize(String inputFileName)
            throws IOException {
        // parse and serialize the contents of the given file
        XtextResource xresource = createXtextResource(inputFileName);

        // diagramEditor.get
        EObject parsedObject = ParseAndGetParsedObject(xresource);
        // were there any errors or warnings?
        getParserErrorsOrWarnings(xresource, xresource.getErrors());
        getParserErrorsOrWarnings(xresource, xresource.getWarnings());
        // serialize back
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
        String modelFolder = "/home/oba/Desktop/workspaces/SEWINCH/de.cau.cs.kieler.synccharts.dsl.kits/examplemodels/";
        return modelFolder;
    }

    /**
     * 
     * @param file
     *            simple file name, without path etc
     * @return what has been parsed
     */
    private static XtextResource createXtextResource(String file) {
        new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
        // // with an EMFMetaMetaModel,
        // EmfMetaModel emfmodel;

        // Load the EPackage class by using EcoreUtils
        EPackage pack = EcoreUtil2
                .getEPackageByClassName("de.cau.cs.kieler.synccharts.SyncchartsPackage");
        // create EMFMetaModel with the given EPackage
        // emfmodel = new EmfMetaModel(pack);
        XtextResourceSet resourceSet = injector
                .getInstance(XtextResourceSet.class);

        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
                Boolean.TRUE);
        Resource resource = resourceSet
                .getResource(
                        URI
                                .createURI("platform:/resource/de.cau.cs.kieler.synccharts.dsl.kits/examplemodels/"
                                        + file), true);
        XtextResource xresource = (XtextResource) resource;
        return xresource;
    }

    private static EObject ParseAndGetParsedObject(XtextResource xres) {

        IParseResult parseResult = xres.getParseResult();
        if (parseResult == null)
            System.out
                    .println("Could not parse action string. Parser did return null.");

        EObject parsedObject = xres.getContents().get(0);
        return parsedObject;
    }

    private static void getParserErrorsOrWarnings(XtextResource resource,
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
     * @return contents of the given file, I need this to compare the
     *         parseResult with the urspruenglichen file content
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
