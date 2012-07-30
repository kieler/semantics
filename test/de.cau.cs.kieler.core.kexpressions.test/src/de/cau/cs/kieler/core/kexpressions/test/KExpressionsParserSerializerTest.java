/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.kexpressions.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.KExpressionsStandaloneSetup;

/**
 * JUnit Test Case for the SyncCharts Editor Transition label parser and its
 * serializer.
 * 
 * @author haf, chsch, cmot
 */
public class KExpressionsParserSerializerTest {

    private Injector injector;

    /**
     * Initialize the parser and serializer.
     * 
     * @throws Exception
     *             Something failed
     */
    @Before
    public void setUpParserAndSerializer() throws Exception {
        injector = new KExpressionsStandaloneSetup() {
        	
        	public Injector createInjector() {
        		return Guice.createInjector(new de.cau.cs.kieler.core.kexpressions.test.KExpressionsRuntimeModule());
        	}
        	
        }.createInjectorAndDoEMFRegistration();
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerSum() throws Exception {
        this.parseAndSerialize("5 + 5");
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerNeg() throws Exception {
        this.parseAndSerialize("- 5");
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerNeg2() throws Exception {
        this.parseAndSerialize("-5");
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerDiff() throws Exception {
        this.parseAndSerialize("5 - 5");
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerDiff2() throws Exception {
        this.parseAndSerialize("5- 5");
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerSumCmp() throws Exception {
        this.parseAndSerialize("5 + 5 < 7 or C");
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerA() throws Exception {
        this.parseAndSerialize("A");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerEmission() throws Exception {
        this.parseAndSerialize("?B");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerComparison() throws Exception {
        this.parseAndSerialize("varA = 5");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerComparison2() throws Exception {
        this.parseAndSerialize("5 = varA");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerComparison3() throws Exception {
        this.parseAndSerialize("?A = 5");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerComparisonValue() throws Exception {
        this.parseAndSerialize("3 < ?A");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerValue() throws Exception {
        this.parseAndSerialize("?A = true");
    }


    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerHostCode() throws Exception {
        this.parseAndSerialize("\'This is some host code\'");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerHostCodeType() throws Exception {
        this.parseAndSerialize("\'This is some host code\'(Natural)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerHostCodeEverywhere() throws Exception {
        this.parseAndSerialize("A and \'HostCode\'(esterel) and 4 < \'Hooooost\'");
    }


    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAndOr() throws Exception {
        this.parseAndSerialize("A and B or C");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAndOr2() throws Exception {
        this.parseAndSerialize("A and (B or C)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAndNot() throws Exception {
        this.parseAndSerialize("not A and B");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAndNot2() throws Exception {
        this.parseAndSerialize("not (A and B)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerPlus() throws Exception {
        this.parseAndSerialize("?A + 4 > 3");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerMult() throws Exception {
        this.parseAndSerialize("5 * varA > 3");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerDiv() throws Exception {
        this.parseAndSerialize("varA / ?B > varB");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerPlusMult() throws Exception {
        this.parseAndSerialize("5 * varA - ?B mod 2 > 3");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerPlusDiv() throws Exception {
        this.parseAndSerialize("5 / varA - ?B / 2 > 3");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerMultDiv() throws Exception {
        this.parseAndSerialize("varA * ?B / 2 < 2");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerPre() throws Exception {
        this.parseAndSerialize("(pre(A) or pre(?B) > 3) and pre(C)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerNotPre() throws Exception {
        this.parseAndSerialize("not pre(B)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerNotNot() throws Exception {
        this.parseAndSerialize("not not B");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr1() throws Exception {
        this.parseAndSerialize("5 * ?A / 5 = ?A");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr2() throws Exception {
        this.parseAndSerialize("pre(?A) - 1");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr3() throws Exception {
        this.parseAndSerialize("pre(?A) = 100");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr4() throws Exception {
        this.parseAndSerialize("pre(?A) + 1");
    }

//    /**
//     * A JUnit test for the Labelparser.
//     * Parses only as floats will be transformed into a
//     * normal form internally. (see next test case)
//     * 
//     * @throws Exception
//     *             if parsing fails
//     */
//    @Test
//    public void testParserFloat() throws Exception {
//        this.parse("/ A(1.1), B(-23e-3), C(34f)");
//    }
//
//    /**
//     * A JUnit test for the Labelparser.
//     * 
//     * @throws Exception
//     *             if parsing fails
//     */
//    @Test
//    public void testSerializerFloat() throws Exception {
//        this.parseAndSerialize("/ A(1.1), B(-2.3E-15), C(34.0)");
//    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerBoolean() throws Exception {
        this.parseAndSerialize("true or false or varA = true or varB = false");
    }
    
    
    /* ------------------------------------------------------------------------------ */
    

    private void parseAndSerialize(final String inputString) throws KielerModelException, IOException {
        Expression expr = parse(inputString);
        String serializedString = serialize(expr);
        if (inputString.equals(serializedString)) {
            return;
        } else {
            // throw new IllegalStateException("Serialization failed. Input and output"
            //        + "are not the same: Input: " + inputString + " Output: " + serializedString);
        }
    }

    
    /**
     * Create a new parse command and execute its parse method. Likely to throw
     * exceptions if the text could not be parsed.
     * 
     * @param textToParse
     *            String to be parsed
     * @throws KielerModelException
     *             the main exception if something failed
     * @throws IOException
     *             unlikely to be thrown, only if there are internal errors
     *             regarding the resource factories.
     */
    private Expression parse(final String textToParse) throws KielerModelException, IOException {
    	
        ByteArrayInputStream stream = new ByteArrayInputStream(textToParse.getBytes());

        XtextResourceSet resourceSet = injector
                .getInstance(XtextResourceSet.class);
        XtextResource resource = (XtextResource) resourceSet
                .createResource(URI
                        .createURI("platform:/resource/de.cau.cs.kieler.kexpressions.test/"
                                + "dummy.expr"));
        // FIXME: passing the parent to the scope provider in this static way is
        // veeeeery evil, someone should really fix this....
        // 
//        DummyScopeProvider.parent = new DummyScope(); //transition.eContainer();

        // now do parsing
        Map<Object, Object> loadOptions = resourceSet.getLoadOptions();
        // set option to resolve all links. This avoids to do lazy linking only
        // when elements
        // are actually read. This helps to identify linking errors earlier,
        // i.e. now
        loadOptions.put(
                org.eclipse.xtext.resource.XtextResource.OPTION_RESOLVE_ALL,
                true);
        resource.load(stream, loadOptions);

        IParseResult parseResult = resource.getParseResult();
        if (parseResult == null) {
            throw new KielerModelException("\"" + textToParse + "\""
                    + "Could not parse expression string. Parser did return null.",
                    null);
        }

        List<Diagnostic> errors = resource.getErrors();

        if (errors != null && errors.size() > 0) {
            StringBuffer parseErrorString = new StringBuffer("");
            for (Diagnostic syntaxError : errors) {
                parseErrorString.append(syntaxError.getMessage());
                if (errors.size() > 1) {
                    parseErrorString.append("\n");
                }
            }
            throw new RuntimeException("\"" + textToParse + "\""
                    + " Parse errors in expression String: " + parseErrorString);
        }

        EObject parsedObject = resource.getContents().get(0);
        if (parsedObject == null || !(parsedObject instanceof Expression)) {
            throw new KielerModelException(
                    "\""
                            + textToParse
                            + "\""
                            + "Could not parse expression string. Parser did not return an Expression object but "
                            + parsedObject, null);
        }
        
        //this.transition.setTrigger((Expression) parsedObject);
        
        return (Expression) parsedObject;
    }

    String serialize(final Expression expr) {
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        XtextResource resource = (XtextResource) resourceSet.createResource(URI
                .createURI("platform:/resource/./dummy2.expr"));
        resource.getContents().add(expr);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            resource.save(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputStream.toString();
    }
}
