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
package de.cau.cs.kieler.synccharts.text.actions.bridge.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.Variable;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.text.actions.ActionsStandaloneSetup;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelParseCommand;

/**
 * JUnit Test Case for the SyncCharts Editor Transition label parser and its serializer.
 * 
 * @author haf
 * 
 * @kieler.rating 2010-01-19 [proposed] yellow proposed by haf
 * 
 */
public class ParserSerializerTest {

    private Region rootRegion;
    private Transition transition;

    private Injector injector;
    // SerializerUtil serializerUtil;
    private IParser parser;

    private static final int A = 65;
    private static final int Z = 90;

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

        // Injector injector = new KitsStandaloneSetup().createInjector();
        // Resource r =
        // injector.getInstance(XtextResourceSet.class).createResource(URI.createFileURI("test.kits"));
        // r.getContents().add(this.rootRegion);
        // r.save(System.out, Collections.EMPTY_MAP);
    }

    /**
     * Initialize the parser and serializer.
     * 
     * @throws Exception
     *             Something failed
     */
    @Before
    public void setUpParserAndSerializer() throws Exception {
        injector = new ActionsStandaloneSetup().createInjectorAndDoEMFRegistration();
        // serializerUtil = injector.getInstance(SerializerUtil.class);
        parser = injector.getInstance(IParser.class);
    }

    // modified by wah 
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws KielerException
     *             if parsing failed
     * @throws IOException
     *             internal parser error
     */
    @Test
    public void testParser1() {
        try {
            this.parse("A/B");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }

    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws KielerException
     *             if parsing failed
     * @throws IOException
     *             internal parser error
     */
    @Test
    public void testParser2() {
        try {
            this.parse("A and B and C or D and not D or (43<?D) or (varA = 103) and "
                    + "not (B and (C or D)) / G, H(23), I, varB:=104");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    @Test
    public void testParser3() {
        try {
            this.parse("A and B and C or D and not D or  " + "not (B and (C or D))");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws KielerException
     *             if parsing failed
     * @throws IOException
     *             internal parser error
     */
    public void testParserInvalid() {
        try {
            this.parse("A and B and InvalidSignal or D");
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
    public void testSerializerA1() {
        try {
            this.parseAndSerialize("A / B(5)");
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
    public void testSerializerA2() {
        try {
            this.parseAndSerialize("# 2 A / B(5)");
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
    public void testSerializerA3() {
        try {
            this.parseAndSerialize("A / B(5)");
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
            this.parseAndSerialize("A / B(5)");
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
    // @Test
    // public void testSerializerComparison2() throws Exception {
    // this.parseAndSerialize("5 = varA");
    // }
    // modified by wah
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

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerEmissionValue() {
        try {
            this.parseAndSerialize("/ A(3)");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    @Test
    public void testSerializerEmissionComplexValue() {
        try {
            this.parseAndSerialize("/ A(?B + 100)");
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
    public void testSerializerEmissionBoolean() {
        try {
            this.parseAndSerialize("/ A(3 < varA and B)");
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
    public void testSerializerHostCode() {
        try {
            this.parseAndSerialize("/ \'This is some host code\'");
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
            this.parseAndSerialize("/ \'This is some host code\'(Natural)");
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
            this.parseAndSerialize("A and \'HostCode\' and 4 < \'Hooooost\' /"
                    + " \'This is some host code\'");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
        // this.parseAndSerialize("(A and \"HostCode\"(host)) and (4 < \"Hooooost\") /"
        // + " \"This is some host code\"(Natural)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAssignment() {
        try {
            this.parseAndSerialize("/ varA:=5");
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
    public void testSerializerAssignmentBoolean() {
        try {
            this.parseAndSerialize("/ varA:=42 = varB or not C");
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
    public void testSerializerBoolExpressionAllEffects() {
        try {
            this.parseAndSerialize("A and B / C(3), varA:=5, \'host code\'(Esterel)");
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
    public void testSerializerImmediate() {
        try {
            this.parseAndSerialize("# A / B");
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
    public void testSerializerImmediateSimple() {
        try {
            this.parseAndSerialize("#");
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
    public void testSerializerDelayedPlain() {
        try {
            this.parseAndSerialize("3 tick");
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
    public void testSerializerDelayedConst() {
        try {
            this.parseAndSerialize("3 true");
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
    public void testSerializerDelayedTrigger() {
        try {
            this.parseAndSerialize("3 A");
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
    public void testSerializerDelayedEffect() {
        try {
            this.parseAndSerialize("3 tick / B");
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
    public void testSerializerDelayedBoth() {
        try {
            this.parseAndSerialize("3 A / B");
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
    public void testSerializerDelayComparison() {
        try {
            this.parseAndSerialize("3 5 < ?A / B");
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
            this.parseAndSerialize("varA : ?B > varB");
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
    public void testSerializerPlusMult() {
        try {
            this.parseAndSerialize("5 * varA - ?B mod 2> 3");
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
    public void testSerializerPlusDiv() {
        try {
            this.parseAndSerialize("5 : varA - ?B : 2 > 3");
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
            this.parseAndSerialize("varA * ?B : 2 < 2");
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
            this.parseAndSerialize("5 * ?A : 5 = ?A / B");
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
            this.parseAndSerialize("/ A(pre(?A) - 1)");
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
            this.parseAndSerialize("pre(?A) = -100 / A(-100)");
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
            this.parseAndSerialize("/ A(pre(?A) + 1)");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * A JUnit test for the Labelparser. Parses only as floats will be transformed into a normal
     * form internally. (see next test case)
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testParserFloat() {
        try {
            this.parse("/ A(1.1), B(-23e-3), C(34f)");
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
    public void testSerializerFloat() {
        try {
            this.parseAndSerialize("/ A(1.1), B(-2.3E-15), C(34.0)");
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
    public void testSerializerBoolean() {
        try {
            this.parseAndSerialize("true or false / A(true), B(false)");
        } catch (Exception e) {
            thrown.expectMessage(e.getMessage());
        }
    }

    /**
     * Create a new parse command and execute its parse method. Likely to throw exceptions if the
     * text could not be parsed.
     * 
     * @param textToParse
     *            String to be parsed
     * @throws IOException
     *             unlikely to be thrown, only if there are internal errors regarding the resource
     *             factories.
     */
    private void parse(final String textToParse) throws KielerModelException, IOException {
        ActionLabelParseCommand parseCommand = new ActionLabelParseCommand(transition, textToParse,
                injector);
        parseCommand.parse();
    }

    String serialize(final Action action) {
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        XtextResource resource = (XtextResource) resourceSet.createResource(URI
                .createURI("platform:/resource/./dummy2.action"));
        resource.getContents().add(action);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            resource.save(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputStream.toString();
    }

    private void parseAndSerialize(final String inputString) throws KielerModelException,
            IOException {
        parse(inputString);
        // Our Inofficial simple custom Serializer
        // String serializedString = ActionLabelSerializer.toString(transition);
        // Official XText Serializer
        String serializedString = serialize(transition);
        if (inputString.equals(serializedString)) {
            return;
        } else {
            // throw new IllegalStateException("Serialization failed. Input and output"
            // + "are not the same: Input: " + inputString + " Output: " + serializedString);
            /** modified by wah */
            thrown.expectMessage("Serialization failed. Input and output"
                    + "are not the same: Input: " + inputString + " Output: " + serializedString);

        }
    }
}
