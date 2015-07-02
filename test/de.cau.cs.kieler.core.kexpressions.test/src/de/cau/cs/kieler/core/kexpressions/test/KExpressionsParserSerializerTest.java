/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time & Embedded Systems Group
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
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.KExpressionsStandaloneSetup;

/**
 * JUnit Test Case for the kexpressions parser and serializer.
 * 
 * @author haf, chsch, cmot, ssm
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KExpressionsParserSerializerTest {

    // -------------------------------------------------------------------------
    // -- Injector & Setup
    // -------------------------------------------------------------------------
	
    private Injector injector;

    /**
     * Initialize the parser & serializer.
     * 
     * @throws Exception Failed to create injector.
     */
    @Before
    public void setUpParserAndSerializer() throws Exception {
        injector = new KExpressionsStandaloneSetup() {
        	
        	public Injector createInjector() {
        		return Guice.createInjector(new de.cau.cs.kieler.core.kexpressions.test.KExpressionsRuntimeModule());
        	}
        	
        }.createInjectorAndDoEMFRegistration();
    }

    
    // -------------------------------------------------------------------------
    // -- Unit tests
    // -------------------------------------------------------------------------
    
    /**
     * To provide some overview test are gathered in specific categories:
     * - 100 - 200 Atomics & Types & Test functions
     * - 200 - 300 Arithmetical operations
     * - 300 - 400 Comparison
     * - 400 - 500 Boolean operators
     * - 500 - 600 Complex comparisons & operations
     * - 600 - 700 Misc (e.g. Hostcode)
     * 
     * HINT: The generic "This is a JUnit test" message is skipped from now on. 
     * All methods in this section are JUnit tests and are annotated with @Test. 
     */
    
    // -- Unit tests 100 - 200 : Atomics & Types & Test functions    

    @Test
    public void test100_vObject() {
        this.parseAndSerialize("A");
    }

    @Test
    public void test101_val() {
        this.parseAndSerialize("val(B)");
    }

    @Test
    public void test102_pre() {
        this.parseAndSerialize("pre(B)");
    }
    
    @Test
    public void test103_not()  {
        this.parseAndSerialize("!A");
    }
    
    @Test
    public void test104_notPre()  {
        this.parseAndSerialize("!pre(B)");
    }

    @Test
    public void test105_NotNot() {
        this.parseAndSerialize("!!B");
    }

    @Test
    public void test106_literal() {
        this.parseAndSerialize("true");
    }
    
    // -- Unit tests 200 - 300 : Arithmetical operations    
    
    @Test
    public void test200_sum() {
        this.parseAndSerialize("5 + 5");
    }

    @Test
    public void test201_neg() {
        this.parseAndSerialize("- 5");
    }

    @Test
    public void test202_neg2() {
        this.parseAndSerialize("-5");
    }

    @Test
    public void test203_diff() {
        this.parseAndSerialize("5 - 5");
    }

    @Test
    public void test204_diff2() {
        this.parseAndSerialize("5- 5");
    }

    @Test
    public void test205_mult() {
        this.parseAndSerialize("5 * 5");
    }

    @Test
    public void test206_diff() {
        this.parseAndSerialize("5 /5");
    }

    @Test
    public void test207_mod() {
        this.parseAndSerialize("5 % 5");
    }
    
    @Test
    public void test208_vObjAdd() {
        this.parseAndSerialize("A + 1");
    }

    @Test
    public void test209_vObjAdd2() {
        this.parseAndSerialize("1 + A");
    }

    
    // -- Unit tests 300 - 400 : Comparisons 
    
    @Test
    public void test300_SumCmp() {
        this.parseAndSerialize("5 + 5 < 7 | C");
    }

    @Test
    public void test301_vObjCmpEq() {
        this.parseAndSerialize("A == 5");
    }

    @Test
    public void test302_vObjCmpEq2() {
        this.parseAndSerialize("5 == A");
    }

    @Test
    public void test303_valCmpEq3() {
        this.parseAndSerialize("val(A) == true");
    }
    
    @Test
    public void test304_valCmpEq() {
        this.parseAndSerialize("val(A) == 5");
    }

    @Test
    public void test305_valCmpLt() {
        this.parseAndSerialize("3 < val(A)");
    }

    // -- Unit tests 400 - 500 : Boolean operators 

    @Test
    public void test400_and() {
        this.parseAndSerialize("A & B");
    }

    @Test
    public void test401_and2() {
        this.parseAndSerialize("(A & B)");
    }

    @Test
    public void test402_logicalAnd() {
        this.parseAndSerialize("A && B");
    }

    @Test
    public void test403_logicalAnd2() {
        this.parseAndSerialize("(A && B)");
    }

    @Test
    public void test404_or() {
        this.parseAndSerialize("A | B");
    }

    @Test
    public void test405_or2() {
        this.parseAndSerialize("(A | B)");
    }

    @Test(expected = AssertionError.class) // This test is expected to fail!
    public void test406_andOrFail() {
        this.parseAndSerialize("A & B | C");
    }

    @Test
    public void test407_andAnd() {
        this.parseAndSerialize("A & B & C");
    }

    @Test
    public void test408_orOr() {
        this.parseAndSerialize("A | B | C");
    }
    
    @Test
    public void test409_andOr() {
        this.parseAndSerialize("A & (B | C)");
    }

    @Test
    public void test410_notAnd() {
        this.parseAndSerialize("!(A & B)");
    }

    @Test
    public void test411_notAnd2() {
        this.parseAndSerialize("(!A & B)");
    }
    
    @Test
    public void test412_notAnd3() {
        this.parseAndSerialize("!A & B");
    }

    @Test
    public void test413_notOrNotAnd() {
        this.parseAndSerialize("!A | !(A & B)");
    }
    
    @Test
    public void test414_andOrAndOr() {
        this.parseAndSerialize("(A | B) & ((B | C) & (C | D))");
    }
    
    @Test
    public void test415_andOrAndOr2() {
        this.parseAndSerialize("(A | B) & (B | C) & (C | D)");
    }
    
    @Test
    public void test416_andOrAndOr() {
        this.parseAndSerialize("A | (B & (B | (C & (C | D))))");
    }

    // -- - 500 - 600 : Complex comparisons & operations

    @Test
    public void test500_valAddGt() {
        this.parseAndSerialize("val(A) + 4 > 3");
    }

    @Test
    public void test501_multVObjGt() {
        this.parseAndSerialize("5 * A > 3");
    }

    @Test
    public void test502_valDivValLeqVal() {
        this.parseAndSerialize("A / val(B) <= B");
    }

    @Test
    public void test503_valDivValLeqVal2() {
        this.parseAndSerialize("A / (val(B) <= B)");
    }

    @Test
    public void test504_multMinusValModGt() {
        this.parseAndSerialize("5 * A - val(B) % 2 > 3");
    }

    @Test
    public void test505_divLtValDiv() {
        this.parseAndSerialize("5 / A < val(B) / 2");
    }

    @Test
    public void test506_multValDivLt() {
        this.parseAndSerialize("A * val(B) / 2 < 2");
    }

    @Test
    public void test507_preOrPreValGtAndPre() {
        this.parseAndSerialize("(pre(A) | pre(val(B)) > 3) & pre(C)");
    }

    @Test
    public void test508_multValDivEqVal() {
        this.parseAndSerialize("5 * val(A) / 5 == val(A)");
    }

    @Test
    public void test509_preValMinus() {
        this.parseAndSerialize("pre(val(A)) - 1");
    }

    @Test
    public void test510_preValEq() {
        this.parseAndSerialize("pre(val(A)) == 100");
    }

    @Test
    public void test511_preValPlus() {
        this.parseAndSerialize("pre(val(A)) + 1");
    }

    @Test
    public void test512_Boolean() {
        this.parseAndSerialize("true | false | A == true | B == false");
    }

    @Test
    public void test513_Boolean2() throws Exception {
        this.parseAndSerialize("A == A | true");
    }
    
    // -- - 600 - 700 : Misc

    
    @Test
    public void test600_Float() {
        this.parse("A == 1.1");
//        this.parseAndSerialize("/ A(1.1), B(-2.3E-15), C(34.0)");
    }

    @Test
    public void test601_Hostcode() {
        this.parseAndSerialize("\'This is some host code\'");
    }


// @Test
// public void testSerializerHostCodeType() throws Exception {
//     this.parseAndSerialize("\'This is some host code\'(Natural)");
// }

// @Test
// public void testSerializerHostCodeEverywhere() throws Exception {
//     this.parseAndSerialize("A & \'HostCode\'(esterel) & 4 < \'Hooooost\'");
// }
    
    
    // -------------------------------------------------------------------------
    // -- Unit test helpers: parse & serialize
    // -------------------------------------------------------------------------

    /**
     * Parses an input string and subsequently serializes the parsed expression again.
     * Both, the parsing and the serialization must be valid.
     * At the moment, the parsed string and the serialization must not be syntactical identical
     * because A & B and (A & B) are both valid and are parsed to the same expression.
     * Of course, the serializer only serializes one variant. 
     * 
     * @param inputString the string that should be parsed
     */
    private void parseAndSerialize(final String inputString) {
        Expression expr = parse(inputString);
        String serializedString = serialize(expr);    			
        if (inputString.equals(serializedString)) {
            return;
        } else {
            // throw new IllegalStateException("Serialization failed. Input & output"
            //        + "are not the same: Input: " + inputString + " Output: " + serializedString);
        }
    }

    /**
     * Parses an input string and subsequently serializes the parsed expression again.
     * Both, the parsing and the serialization must be valid.
     * At the moment, the parsed string and the serialization must not be syntactical identical
     * because A & B and (A & B) are both valid and are parsed to the same expression.
     * Of course, the serializer only serializes one variant.
     * The result is compared to the output string. 
     * 
     * 
     * @param inputString the string that should be parsed
     * @param outputString the desired output string
     */
    private void parseAndSerialize(final String inputString, final String outputString) {
        Expression expr = parse(inputString);
        String serializedString = serialize(expr);    			
        if (outputString.equals(serializedString)) {
            return;
        } else {
            Assert.fail("The desired output string (" + 
            		outputString + 
            		") and the serialization (" + 
            		serializedString + 
            		") do not match!");
        }
    }

    
    /**
     * Create a new parse command & execute its parse method. Likely to throw
     * exceptions if the text could not be parsed.
     * 
     * @param textToParse string to be parsed
     */
    private Expression parse(final String textToParse) {
    	
        ByteArrayInputStream stream = new ByteArrayInputStream(textToParse.getBytes());

        XtextResourceSet resourceSet = injector
                .getInstance(XtextResourceSet.class);
        XtextResource resource = (XtextResource) resourceSet
                .createResource(URI
                        .createURI("platform:/resource/de.cau.cs.kieler.kexpressions.test/"
                                + "dummy.expr"));

        // now do parsing
        Map<Object, Object> loadOptions = resourceSet.getLoadOptions();
        
        // set option to resolve all links. This avoids to do lazy linking only
        // when elements
        // are actually read. This helps to identify linking errors earlier,
        // i.e. now
        loadOptions.put(
                org.eclipse.xtext.resource.XtextResource.OPTION_RESOLVE_ALL,
                true);
        try {
			resource.load(stream, loadOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}

        IParseResult parseResult = resource.getParseResult();
        if (parseResult == null) {
            Assert.fail("\"" + textToParse + "\""
                    + "Could not parse expression string. Parser did return null.");
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
            Assert.fail("\"" + textToParse + "\""
                    + " Parse errors in expression String: " + parseErrorString);
        }

        EObject parsedObject = resource.getContents().get(0);
        if (parsedObject == null || !(parsedObject instanceof Expression)) {
            Assert.fail("\""
                    + textToParse
                    + "\""
                    + "Could not parse expression string. Parser did not return an Expression object but "
                    + parsedObject);
        }
        
        return (Expression) parsedObject;
    }

    /**
     * Tries to serialize the given expression and returns the string if successful.
     * 
     * @param expr the expression in question
     * @return Returns the serialized string.
     */
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
        if (outputStream.toString() == "") {
            Assert.fail("Could not serialize expression: " + expr.toString());
        }
        return outputStream.toString();
    }
}
