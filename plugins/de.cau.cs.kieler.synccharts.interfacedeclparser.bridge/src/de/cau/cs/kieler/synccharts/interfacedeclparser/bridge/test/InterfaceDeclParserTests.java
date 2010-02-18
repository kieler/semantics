/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.interfacedeclparser.bridge.test;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.synccharts.CombineOperator;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.interfacedeclparser.InterfaceDeclStandaloneSetup;
import de.cau.cs.kieler.synccharts.interfacedeclparser.bridge.InterfaceDeclParseCommand;
import de.cau.cs.kieler.synccharts.interfacedeclparser.bridge.InterfaceDeclProcessorWrapper;

/**
 * JUnit Test Case for the SyncCharts Editor Interfacedeclaration parser and its
 * serializer.
 * 
 * @author uru
 * @author car
 * 
 */
public class InterfaceDeclParserTests {

    private Region rootRegion, region;
    private State rootState;
    private Injector injector;
    private IAntlrParser parser;

    private static final int A = 65;
    private static final int Z = 90;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUpSyncChart() throws Exception {
        rootRegion = SyncchartsFactory.eINSTANCE.createRegion();

        rootState = SyncchartsFactory.eINSTANCE.createState();
        rootState.setLabel("SyncChart");
        rootRegion.getInnerStates().add(rootState);
        rootRegion.setId("rootReg");

        region = SyncchartsFactory.eINSTANCE.createRegion();
        region.setParentState(rootState);
        region.setId("R0");
        rootState.getRegions().add(region);
    }

    /**
     * Initialize the parser and serializer.
     * 
     * @throws Exception
     *             Something failed
     */
    @Before
    public void setUpParserAndSerializer() throws Exception {
        injector = new InterfaceDeclStandaloneSetup()
                .createInjectorAndDoEMFRegistration();
        parser = injector.getInstance(IAntlrParser.class);
    }

    @Test
    public void testParseSingle() throws Exception {
        parse("signal a;");
        for (Signal s : rootState.getSignals()) {
            if (s.getName().equals("a"))
                return;
        }
        throw new KielerException(
                "There should be a Signal a, but there is not...");
    }

    @Test
    public void testParseSome() throws Exception {
        parse("signal b, c;");
        String[] names = { "b", "c" };
        if (!searchSignals(rootState.getSignals(), names)) {
            throw new KielerException("parsing some signals failed");
        }
    }

    @Test
    public void testSerializeSingle() throws Exception {
        Signal sig = SyncchartsFactory.eINSTANCE.createSignal();
        sig.setName("IAMSPECIAL");
        rootState.getSignals().add(sig);
        String serialized = serialize(rootState);
        if (!serialized.contains("IAMSPECIAL")) {
            throw new KielerException("serializing one signal failed");
        }
    }

    
    @Test
    public void testMoreSignals() throws Exception {
        String prefix = "magicTest";
        for (int i = A; i <= Z; i++) { // ASCII letters A to Z
            char[] letters = Character.toChars(i);
            String letter = String.copyValueOf(letters);
            Signal sig = generateRandomSignal(prefix + letter);
            if (Math.random() < 0.5) {
                rootState.getSignals().add(sig);
            } else {
                rootState.getRegions().get(0).getSignals().add(sig);
            }
            Variable var = SyncchartsFactory.eINSTANCE.createVariable();
            var.setName(prefix + "var" + letter);
            rootState.getRegions().get(0).getVariables().add(var);
            serialize(rootState);

            // test if the current one has been added additionally to full test
            // below, should make it easier to find what went wrong
            if (rootState.getInterfaceDeclaration().indexOf(sig.getName()) < 0)
                throw new KielerException("Missing signal " + sig.getName()
                        + " in serialized String.");
            if (rootState.getInterfaceDeclaration().indexOf(var.getName()) < 0)
                throw new KielerException("Missing var " + var.getName()
                        + " in serialized String.");
        }
        //System.out.println(rootState.getInterfaceDeclaration());
        // test them all again
        for (int i = A; i <= Z; i++) { // ASCII letters A to Z
            char[] letters = Character.toChars(i);
            String letter = String.copyValueOf(letters);
            if (rootState.getInterfaceDeclaration().indexOf(prefix + letter) < 0)
                throw new KielerException("Missing signal " + prefix + letter
                        + " in serialized String.");
            if (rootState.getInterfaceDeclaration().indexOf(
                    prefix + "var" + letter) < 0)
                throw new KielerException("Missing var " + prefix + "var"
                        + letter + " in serialized String.");
        }
    }

    private Signal generateRandomSignal(String name) {
        Signal sig = SyncchartsFactory.eINSTANCE.createSignal();
        if (Math.random() < 0.5) {
            sig.setIsInput(true);
            if (Math.random() < 0.5) {
                sig.setIsOutput(true);
            }
        } else if (Math.random() < 0.5)
            sig.setIsOutput(true);
        else if (Math.random() < 0.5)
            sig.setCombineOperator(CombineOperator.MULT);
        else {
            sig.setHostType("uint8_t");
            sig.setHostCombineOperator("while 1; do asm(nop); done");
        }
        sig.setName(name);
        return sig;
    }

    /**
     * search for names inside a bunch of signals
     * 
     * @param signals
     *            haystack
     * @param names
     *            needles
     * @return true if all found
     */
    private boolean searchSignals(List<Signal> signals, String[] names) {
        boolean ret = true;
        for (String str : names) {
            ret &= searchSignal(signals, str);
        }
        return ret;
    }

    /**
     * search for a name inside a bunch of signals
     * 
     * @param signals
     *            haystack
     * @param name
     *            needle
     * @return true if found
     */
    private boolean searchSignal(List<Signal> signals, String name) {
        for (Signal s : rootState.getSignals()) {
            if (s.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private void parse(final String stringToParse) throws KielerException,
            IOException {
        rootState.setInterfaceDeclaration(stringToParse);
        InterfaceDeclParseCommand parseCommand = new InterfaceDeclParseCommand(
                rootState, injector);
        parseCommand.execute();
    }

    String serialize(final State state) {
        InterfaceDeclProcessorWrapper foo = new InterfaceDeclProcessorWrapper();
        Command c = foo.getCanonialSerializeCommand(state);
        c.execute();
        return state.getInterfaceDeclaration();
    }

}
