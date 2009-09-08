/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.reconstr.SerializerUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionLabelStandaloneSetup;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.labelparser.bridge.ActionLabelParseCommand;
import de.cau.cs.kieler.synccharts.labelparser.bridge.ActionLabelParserWrapper;
import de.cau.cs.kieler.synccharts.labelparser.bridge.ActionLabelSerializer;

/**
 * JUnit Test Case for the SyncCharts Editor Transition label parser and its
 * serializer.
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

    /**
     * Create a simple SyncChart, one root state machine and two states
     * connected by one transition. The transition will then be tested.
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
        for (int i = 65; i <= 90; i++) { // ASCII letters A to Z
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
        injector = new TransitionLabelStandaloneSetup()
                .createInjectorAndDoEMFRegistration();
        serializerUtil = injector.getInstance(SerializerUtil.class);
        parser = injector.getInstance(IAntlrParser.class);
    }

    @Test
    public void testParser1() throws KielerException, IOException {
        this.parse("A/B");
    }

    @Test
    public void testParser2() throws KielerException, IOException {
        this.parse("A and B and C or D and not E or 43<?F or varA = 103 and not (B and (C or D)) / G, H(23) I, varB:=104");
    }

    @Test(expected = KielerException.class)
    public void testParserInvalid() throws KielerException, IOException {
        this.parse("A and B and InvalidSignal or D");
    }
    
    @Test
    public void testSerializer_A() throws Exception {
        this.parseAndSerialize("A");
    }
    
    @Test
    public void testSerializer_Emission() throws Exception {
        this.parseAndSerialize("/ B");
    }
    
    @Test
    public void testSerializer_Comparison() throws Exception {
        this.parseAndSerialize("varA = 5");
    }

    @Test
    public void testSerializer_ComparisonValue() throws Exception {
        this.parseAndSerialize("3 < ? A");
    }
    
    @Test
    public void testSerializer_EmissionValue() throws Exception {
        this.parseAndSerialize("/ A(3)");
    }
    
    @Test
    public void testSerializer_HostCode() throws Exception {
        this.parseAndSerialize("/ \"This is some host code\"");
    }
    @Test
    public void testSerializer_HostCodeType() throws Exception {
        this.parseAndSerialize("/ \"This is some host code\"(Natural)");
    }

    @Test
    public void testSerializer_Assignment() throws Exception {
        this.parseAndSerialize("/ varA:=5");
    }
    
    @Test
    public void testSerializer_BoolExpressionAllEffects() throws Exception {
        this.parseAndSerialize("A and B / C(3), varA:=5, \"host code\"(Esterel)");
    }
    
    @Test
    public void testSerializer_Immediate() throws Exception {
        this.parseAndSerialize("# A / B");
    }
    
    @Test
    public void testSerializer_Delay() throws Exception {
        this.parseAndSerialize("3 A / B");
    }
    
    @Test
    public void testSerializer_DelayComparison() throws Exception {
        this.parseAndSerialize("3 5 < ? A / B");
    }

    @Test
    public void testSerializer_AndOr() throws Exception {
        this.parseAndSerialize("(A and B) or C");
    }
    
    @Test
    public void testSerializer_AndOr2() throws Exception {
        this.parseAndSerialize("A and (B or C)");
    }
    
    @Test
    public void testSerializer_AndNot() throws Exception {
        this.parseAndSerialize("not A and B");
    }
    
    @Test
    public void testSerializer_AndNot2() throws Exception {
        this.parseAndSerialize("not (A and B)");
    }
    
    /**
     * Create a new parse command and execute its parse method. Likely to throw
     * exceptions if the text could not be parsed.
     * 
     * @param textToParse
     *            String to be parsed
     * @throws KielerException
     *             the main exception if something failed
     * @throws IOException
     *             unlikely to be thrown, only if there are internal errors
     *             regarding the resource factories.
     */
    private void parse(String textToParse) throws KielerException, IOException {
        ActionLabelParseCommand parseCommand = new ActionLabelParseCommand(
                transition, textToParse, parser, injector);
        parseCommand.parse();
    }
    
    private void parseAndSerialize(String inputString) throws KielerException, IOException{
        parse(inputString);
        String serializedString = ActionLabelSerializer.toString(transition); //serializerUtil.serialize(transition);
        if(inputString.equals(serializedString))
            return;
        else
            throw new KielerException("Serialization failed. Input and output" +
            		"are not the same: Input: "+inputString+" Output: "+serializedString);
    }
}
