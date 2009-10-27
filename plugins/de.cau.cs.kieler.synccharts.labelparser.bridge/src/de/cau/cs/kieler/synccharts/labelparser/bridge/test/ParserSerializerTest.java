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
package de.cau.cs.kieler.synccharts.labelparser.bridge.test;

import java.io.IOException;

import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.SerializerUtil;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.Transition; //import de.cau.cs.kieler.synccharts.TransitionLabelStandaloneSetup;
import de.cau.cs.kieler.synccharts.ActionLabelStandaloneSetup;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.labelparser.bridge.ActionLabelParseCommand;
import de.cau.cs.kieler.synccharts.labelparser.bridge.ActionLabelSerializer;

/**
 * JUnit Test Case for the SyncCharts Editor Transition label parser and its serializer.
 * 
 * @author haf
 * 
 */
public class ParserSerializerTest {

    Region rootRegion;
    Transition transition;

    Injector injector;
    SerializerUtil serializerUtil;
    IAntlrParser parser;

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
        rootRegion.getInnerStates().add(rootState);

        Region region = SyncchartsFactory.eINSTANCE.createRegion();
        rootState.getRegions().add(region);

        // Create one signal for each letter
        for (int i = A; i <= Z; i++) { // ASCII letters A to Z
            Signal sig = SyncchartsFactory.eINSTANCE.createSignal();
            char[] letters = Character.toChars(i);
            String letter = String.copyValueOf(letters);
            sig.setName(letter);
            sig.setIsInput(true);
            rootState.getSignals().add(sig);

            Variable var = SyncchartsFactory.eINSTANCE.createVariable();
            var.setName("var" + letter);
            region.getVariables().add(var);
        }

        State s1 = SyncchartsFactory.eINSTANCE.createState();
        s1.setLabel("S1");
        region.getInnerStates().add(s1);

        State s2 = SyncchartsFactory.eINSTANCE.createState();
        s2.setLabel("S2");
        region.getInnerStates().add(s2);

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
        injector = new ActionLabelStandaloneSetup().createInjectorAndDoEMFRegistration();
        serializerUtil = injector.getInstance(SerializerUtil.class);
        parser = injector.getInstance(IAntlrParser.class);
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
    public void testParser1() throws KielerException, IOException {
        this.parse("A/B");
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
    public void testParser2() throws KielerException, IOException {
        this.parse("A and B and C or D and not E or (43<?F) or (varA = 103) and "
                + "not (B and (C or D)) / G, H(23) I, varB:=104");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws KielerException
     *             if parsing failed
     * @throws IOException
     *             internal parser error
     */
    @Test(expected = KielerException.class)
    public void testParserInvalid() throws KielerException, IOException {
        this.parse("A and B and InvalidSignal or D");
    }

    /**
     * A JUnit test for the Labelparser.
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
        this.parseAndSerialize("/ B");
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
        this.parseAndSerialize("? A = 5");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerComparisonValue() throws Exception {
        this.parseAndSerialize("3 < ? A");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerEmissionValue() throws Exception {
        this.parseAndSerialize("/ A(3)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerEmissionBoolean() throws Exception {
        this.parseAndSerialize("/ A((3 < varA) and B)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerHostCode() throws Exception {
        this.parseAndSerialize("/ \"This is some host code\"");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerHostCodeType() throws Exception {
        this.parseAndSerialize("/ \"This is some host code\"(Natural)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerHostCodeEverywhere() throws Exception {
        this
                .parseAndSerialize("(A and \"HostCode\"(host)) and (4 < \"Hooooost\") / \"This is some host code\"(Natural)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAssignment() throws Exception {
        this.parseAndSerialize("/ varA:=5");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAssignmentBoolean() throws Exception {
        this.parseAndSerialize("/ varA:=(42 = varB) or not C");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerBoolExpressionAllEffects() throws Exception {
        this.parseAndSerialize("A and B / C(3), varA:=5, \"host code\"(Esterel)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerImmediate() throws Exception {
        this.parseAndSerialize("# A / B");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerDelay() throws Exception {
        this.parseAndSerialize("3 A / B");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerDelayComparison() throws Exception {
        this.parseAndSerialize("3 5 < ? A / B");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerAndOr() throws Exception {
        this.parseAndSerialize("(A and B) or C");
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
        this.parseAndSerialize("(? A + 4) > 3");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerMult() throws Exception {
        this.parseAndSerialize("(5 * varA) > 3");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerDiv() throws Exception {
        this.parseAndSerialize("(varA / ? B) > varB");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerPlusMult() throws Exception {
        this.parseAndSerialize("((5 * varA) - (? B mod 2)) > 3");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerPlusDiv() throws Exception {
        this.parseAndSerialize("((5 / varA) - (? B / 2)) > 3");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerMultDiv() throws Exception {
        this.parseAndSerialize("(varA * (? B / 2)) < 2");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerPre() throws Exception {
        this.parseAndSerialize("(pre (A) or (pre (? B) > 3)) or pre ((A and B))");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr1() throws Exception {
        this.parseAndSerialize("(5 * (? A / 5)) = ? A / B");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr2() throws Exception {
        this.parseAndSerialize("/ A(pre (? A) - 1)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr3() throws Exception {
        this.parseAndSerialize("pre (? A) = -100 / A(-100)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerCtr4() throws Exception {
        this.parseAndSerialize("/ A(pre (? A) + 1)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerFloat() throws Exception {
        this.parseAndSerialize("/ A(1.1), B(-23e-3), C(34f)");
    }

    /**
     * A JUnit test for the Labelparser.
     * 
     * @throws Exception
     *             if parsing fails
     */
    @Test
    public void testSerializerBoolean() throws Exception {
        this.parseAndSerialize("true or false / A(true), B(false)");
    }

    /**
     * Create a new parse command and execute its parse method. Likely to throw exceptions if the
     * text could not be parsed.
     * 
     * @param textToParse
     *            String to be parsed
     * @throws KielerException
     *             the main exception if something failed
     * @throws IOException
     *             unlikely to be thrown, only if there are internal errors regarding the resource
     *             factories.
     */
    private void parse(final String textToParse) throws KielerException, IOException {
        ActionLabelParseCommand parseCommand = new ActionLabelParseCommand(transition, textToParse,
                parser, injector);
        parseCommand.parse();
    }

    private void parseAndSerialize(final String inputString) throws KielerException, IOException {
        parse(inputString);
        String serializedString = ActionLabelSerializer.toString(transition);
        if (inputString.equals(serializedString)) {
            return;
        } else {
            throw new KielerException("Serialization failed. Input and output"
                    + "are not the same: Input: " + inputString + " Output: " + serializedString);
        }
    }
}
