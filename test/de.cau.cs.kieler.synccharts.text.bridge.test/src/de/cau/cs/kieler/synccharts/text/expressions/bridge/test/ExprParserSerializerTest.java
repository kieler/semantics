/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.text.expressions.bridge.test;

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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.KExpressionsStandaloneSetup;
import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.Variable;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.text.actions.bridge.DiagnosticException;
import de.cau.cs.kieler.synccharts.text.actions.scoping.ActionsScopeProvider;

/**
 * JUnit Test Case for the SyncCharts Editor Transition label parser and its serializer.
 * 
 * @author haf, chsch
 * 
 * @kieler.rating 2010-01-19 [proposed] yellow proposed by haf
 * 
 */
public class ExprParserSerializerTest {

    private Region rootRegion;
    private Transition transition;

    private Injector injector;

    private static final int A = 65;
    private static final int Z = 90;

    // modified by wah
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Create a simple SyncChart, one root state machine and two states connected by one transition.
     * The transition will then be tested.
     * 
     * @throws java.lang.Exception
     *             Something failed
     */
    @Before
    public void setUpSyncChart() throws Exception {
        rootRegion = SyncchartsFactory.eINSTANCE.createRegion();

        State rootState = SyncchartsFactory.eINSTANCE.createState();
        rootState.setLabel("SyncChart");
        rootRegion.getStates().add(rootState);

        Region region = SyncchartsFactory.eINSTANCE.createRegion();
        rootState.getRegions().add(region);

        // Create one signal for each letter
        for (int i = A; i <= Z; i++) { // ASCII letters A to Z
            Signal sig = KExpressionsFactory.eINSTANCE.createSignal();
            char[] letters = Character.toChars(i);
            String letter = String.copyValueOf(letters);
            sig.setName(letter);
            sig.setIsInput(true);
            rootState.getSignals().add(sig);

            Variable var = KExpressionsFactory.eINSTANCE.createVariable();
            var.setName("var" + letter);
            region.getVariables().add(var);
        }

        State s1 = SyncchartsFactory.eINSTANCE.createState();
        s1.setLabel("S1");
        region.getStates().add(s1);

        State s2 = SyncchartsFactory.eINSTANCE.createState();
        s2.setLabel("S2");
        region.getStates().add(s2);

        transition = SyncchartsFactory.eINSTANCE.createTransition();
        transition.setSourceState(s1);
        transition.setTargetState(s2);
    }

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
                return Guice
                        .createInjector(new de.cau.cs.kieler.synccharts.text.expressions.bridge.test.ExpressionsRuntimeModule());
            }

        }.createInjectorAndDoEMFRegistration();
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    // @Test
    // public void testSerializerSum() throws Exception {
    // this.parseAndSerialize("- 5");{
    // this.parseAndSerialize("5 + 5");
    // }
    // modified by wah
    @Test
    public void testSerializerSum() {
        try {
            this.parseAndSerialize("5 + 5");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerNeg() {
        try {
            this.parseAndSerialize("- 5");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerNeg2() {
        try {
            this.parseAndSerialize("-5");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerDiff() {
        try {
            this.parseAndSerialize("5 - 5");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerDiff2() {
        try {
            this.parseAndSerialize("5-5");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerSumCmp() {
        try {
            this.parseAndSerialize("5 + 5 < 7 or C");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Expressionparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerA() {
        try {
            this.parseAndSerialize("A");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerEmission() {
        try {
            this.parseAndSerialize("?B");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerComparison() {
        try {
            this.parseAndSerialize("varA = 5");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerComparison2() {
        try {
            this.parseAndSerialize("5 = varA");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerComparison3() {
        try {
            this.parseAndSerialize("?A = 5");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerComparisonValue() {
        try {
            this.parseAndSerialize("3 < ?A");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerValue() {
        try {
            this.parseAndSerialize("?A = true");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    // /**
    // * A JUnit test for the Labelparser.
    // *
    // * @throws Exception
    // * if parsing fails
    // */
    // @Test
    // public void testSerializerEmissionValue() throws Exception {
    // this.parseAndSerialize("/ A(3)");
    // }
    //
    // @Test
    // public void testSerializerEmissionComplexValue() throws Exception {
    // this.parseAndSerialize("/ A(?B + 100)");
    // }
    //
    // /**
    // * A JUnit test for the Labelparser.
    // *
    // * @throws Exception
    // * if parsing fails
    // */
    // @Test
    // public void testSerializerEmissionBoolean() throws Exception {
    // this.parseAndSerialize("/ A((3 < varA) and B)");
    // }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerHostCode() {
        try {
            this.parseAndSerialize("\'This is some host code\'");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerHostCodeType() {
        try {
            this.parseAndSerialize("\'This is some host code\'(Natural)");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerHostCodeEverywhere() {
        try {
            this.parseAndSerialize("A and \'HostCode\'(esterel) and 4 < \'Hooooost\'");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    // /**
    // * A JUnit test for the Labelparser.
    // *
    // * @throws Exception
    // * if parsing fails
    // */
    // @Test
    // public void testSerializerAssignment() throws Exception {
    // this.parseAndSerialize("/ varA:=5");
    // }
    //
    // /**
    // * A JUnit test for the Labelparser.
    // *
    // * @throws Exception
    // * if parsing fails
    // */
    // @Test
    // public void testSerializerAssignmentBoolean() throws Exception {
    // this.parseAndSerialize("/ varA:=(42 = varB) or not C");
    // }

    // /**
    // * A JUnit test for the Labelparser.
    // *
    // * @throws Exception
    // * if parsing fails
    // */
    // @Test
    // public void testSerializerBoolExpressionAllEffects() throws Exception {
    // this.parseAndSerialize("A and B / C(3), varA:=5, \"host code\"(Esterel)");
    // }
    //
    // /**
    // * A JUnit test for the Labelparser.
    // *
    // * @throws Exception
    // * if parsing fails
    // */
    // @Test
    // public void testSerializerImmediate() throws Exception {
    // this.parseAndSerialize("# A / B");
    // }
    //
    // /**
    // * A JUnit test for the Labelparser.
    // *
    // * @throws Exception
    // * if parsing fails
    // */
    // @Test
    // public void testSerializerImmediateSimple() throws Exception {
    // this.parseAndSerialize("#");
    // }
    //
    // /**
    // * A JUnit test for the Labelparser.
    // *
    // * @throws Exception
    // * if parsing fails
    // */
    // @Test
    // public void testSerializerDelayComparison() throws Exception {
    // this.parseAndSerialize("5 < ?A / B");
    // }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAndOr() {
        try {
            this.parseAndSerialize("A and B or C");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAndOr2() {
        try {
            this.parseAndSerialize("A and (B or C)");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAndNot() {
        try {
            this.parseAndSerialize("not A and B");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }

    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAndNot2() {
        try {
            this.parseAndSerialize("not (A and B)");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerPlus() {
        try {
            this.parseAndSerialize("?A + 4 > 3");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }

    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerMult() {
        try {
            this.parseAndSerialize("5 * varA > 3");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerDiv() {
        try {
            this.parseAndSerialize("varA / ?B > varB");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
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
    public void testSerializerPlusDiv() {
        try {
            this.parseAndSerialize("5 / varA - ?B / 2 > 3");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerMultDiv() {
        try {
            this.parseAndSerialize("varA * ?B / 2 < 2");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerPre() {
        try {
            this.parseAndSerialize("(pre(A) or pre(?B) > 3) and pre(C)");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerNotPre() {
        try {
            this.parseAndSerialize("not pre(B)");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerNotNot() {
        try {
            this.parseAndSerialize("not not B");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr1() {
        try {
            this.parseAndSerialize("5 * ?A / 5 = ?A");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr2() {
        try {
            this.parseAndSerialize("pre(?A) - 1");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr3() {
        try {
            this.parseAndSerialize("pre(?A) = 100");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr4() {
        try {
            this.parseAndSerialize("pre(?A) + 1");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    // /**
    // * A JUnit test for the Labelparser.
    // * Parses only as floats will be transformed into a
    // * normal form internally. (see next test case)
    // *
    // * @throws Exception
    // * if parsing fails
    // */
    // @Test
    // public void testParserFloat() throws Exception {
    // this.parse("/ A(1.1), B(-23e-3), C(34f)");
    // }
    //
    // /**
    // * A JUnit test for the Labelparser.
    // *
    // * @throws Exception
    // * if parsing fails
    // */
    // @Test
    // public void testSerializerFloat() throws Exception {
    // this.parseAndSerialize("/ A(1.1), B(-2.3E-15), C(34.0)");
    // }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerBoolean() {
        try {
            this.parseAndSerialize("true or false or varA = true or varB = false");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /* ------------------------------------------------------------------------------ */

    private void parseAndSerialize(final String inputString) throws KielerModelException,
            IOException {
        Expression expr = parse(inputString);
        String serializedString = serialize(expr);
        if (inputString.equals(serializedString)) {
            return;
        } else {
            throw new IllegalStateException("Serialization failed. Input and output"
                    + "are not the same: Input: " + inputString + " Output: " + serializedString);
        }
    }

    /**
     * Create a new parse command and execute its parse method. Likely to throw exceptions if the
     * text could not be parsed.
     * 
     * @param textToParse
     *            String to be parsed
     * @throws KielerModelException
     *             the main exception if something failed
     * @throws IOException
     *             unlikely to be thrown, only if there are internal errors regarding the resource
     *             factories.
     */
    private Expression parse(final String textToParse) throws KielerModelException, IOException {

        ByteArrayInputStream stream = new ByteArrayInputStream(textToParse.getBytes());

        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        XtextResource resource = (XtextResource) resourceSet.createResource(URI
                .createURI("platform:/resource/de.cau.cs.kieler.synccharts.text/" + "dummy.expr"));
        // FIXME: passing the parent to the scope provider in this static way is
        // veeeeery evil, someone should really fix this....
        //
        ActionsScopeProvider.parent = transition.eContainer();

        // now do parsing
        Map<Object, Object> loadOptions = resourceSet.getLoadOptions();
        // set option to resolve all links. This avoids to do lazy linking only
        // when elements
        // are actually read. This helps to identify linking errors earlier,
        // i.e. now
        loadOptions.put(org.eclipse.xtext.resource.XtextResource.OPTION_RESOLVE_ALL, true);
        resource.load(stream, loadOptions);

        IParseResult parseResult = resource.getParseResult();
        if (parseResult == null) {
            throw new KielerModelException("\"" + textToParse + "\""
                    + "Could not parse expression string. Parser did return null.", null);
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
            throw new DiagnosticException("\"" + textToParse + "\""
                    + " Parse errors in expression String: " + parseErrorString, null, errors);
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
        this.transition.setTrigger((Expression) parsedObject);

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
