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

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.ui.internal.commands.WorkbenchCommandSupport;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.junit.*;
import org.junit.internal.runners.TestMethod;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.synccharts.CombineOperator;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
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
    InterfaceDeclProcessorWrapper idpw;

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
        idpw = new InterfaceDeclProcessorWrapper();
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
        // System.out.println(rootState.getInterfaceDeclaration());
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

    // TODO: this is not the way
    @Test
    public void undoTestParse() throws Exception {
        rootState.setInterfaceDeclaration("//comment");
        Command parseCommand = idpw.getParseCommand(rootState);
        parseCommand.execute();
        // System.out.println(rootState.getSignals().size() + " Sigs");
        rootState.setInterfaceDeclaration("//comment\nsignal somesig;");
        Command parseCommand2 = idpw.getParseCommand(rootState);
        parseCommand2.execute();
        // System.out.println(rootState.getSignals().size() + " Sigs");
        parseCommand2.undo();
        // System.out.println(rootState.getSignals().size() + " Sigs");
    }

    @Test
    public void undoTestSerialize() throws Exception {
        // rootState.eGet(SyncchartsPackage.STATE__INTERFACE_DECLARATION);

        /*
         * IParser p = ((ITextAwareEditPart) editPart).getParser(); // only edit
         * if empty, other behaviors like append would also be possible if
         * (p.getEditString(editPart, 0).length() == 0) { ICommand c =
         * p.getParseCommand(editPart, insertIfEmpty, 0); try { c.execute(null,
         * null); } catch (ExecutionException e) { // if it fails we do not want
         * to nag the user } }
         */

        // serialize empty state
        Command c1 = idpw.getCanonialSerializeCommand(rootState);
        c1.execute();
        //System.out.println("#" + rootState.getInterfaceDeclaration() + "#"
        //        + rootState.getSignals().size());
        Signal sig1 = generateRandomSignal("sig1");
        rootState.getSignals().add(sig1);
        Command c2 = idpw.getCanonialSerializeCommand(rootState);
        c2.execute();
        //System.out.println("#" + rootState.getInterfaceDeclaration() + "#"
        //        + rootState.getSignals().size());
        c2.undo();
        //System.out.println("#" + rootState.getInterfaceDeclaration() + "#"
        //        + rootState.getSignals().size());
        Signal sig2 = generateRandomSignal("sig2");
        rootState.getSignals().add(sig2);
        c2 = idpw.getCanonialSerializeCommand(rootState);
        c2.execute();
        //System.out.println("#" + rootState.getInterfaceDeclaration() + "#"
        //        + rootState.getSignals().size());
        c2.undo();
        //System.out.println("#" + rootState.getInterfaceDeclaration() + "#"
        //       + rootState.getSignals().size());
    }
    
    @Test
    public void workflow() throws Exception {
        rootState.setInterfaceDeclaration("signal A, B, C; // signals\n"+"R0: var D, E, F; // vars");
        assertEquals(0, rootState.getSignals().size());
        assertEquals(0, rootState.getRegions().get(0).getVariables().size());
        assertEquals(0, rootState.getRegions().get(0).getSignals().size());
        
        Command c1 = idpw.getParseCommand(rootState);
        c1.execute();
        assertEquals(3, rootState.getSignals().size());
        assertEquals(3, rootState.getRegions().get(0).getVariables().size());
        assertEquals(0, rootState.getRegions().get(0).getSignals().size());
       
        Signal moveMe = rootState.getSignals().get(0);
        rootState.getSignals().remove(moveMe);
        rootState.getRegions().get(0).getSignals().add(moveMe);
        Command c2 = idpw.getCanonialSerializeCommand(rootState);
        c2.execute();
        asssertContains(rootState.getInterfaceDeclaration(), moveMe.getName());
        assertEquals(2, rootState.getSignals().size());
        assertEquals(3, rootState.getRegions().get(0).getVariables().size());
        assertEquals(1, rootState.getRegions().get(0).getSignals().size());
        System.out.println(rootState.getInterfaceDeclaration());
        
        // undo
        c2.undo();
        // this would be caused by a trigger handler, dunno how to get them here right now
        Command triggerFaker1 = idpw.getParseCommand(rootState);
        triggerFaker1.execute();
        asssertContains(rootState.getInterfaceDeclaration(), moveMe.getName());
        assertEquals(3, rootState.getSignals().size());
        assertEquals(3, rootState.getRegions().get(0).getVariables().size());
        assertEquals(0, rootState.getRegions().get(0).getSignals().size());
        System.out.println(rootState.getInterfaceDeclaration());
        
        // change afterwards
        Signal changeMe = rootState.getSignals().get(2);
        changeMe.setIsInput(true);
        changeMe.setInitialValue("23");
        Command triggerFaker2 = idpw.getCanonialSerializeCommand(rootState);
        triggerFaker2.execute();
        asssertContains(rootState.getInterfaceDeclaration(), changeMe.getName());
        assertEquals(3, rootState.getSignals().size());
        assertEquals(3, rootState.getRegions().get(0).getVariables().size());
        assertEquals(0, rootState.getRegions().get(0).getSignals().size());        
    }

    // since extends TestCase causes problems
    private void assertEquals(int a, int b) throws Exception {
        if (a != b) throw new KielerException(a + " != " + b);
    }
    
    private void asssertContains(String haystack, String needle) throws Exception {
        if (haystack.indexOf(needle) < 0) throw new KielerException(needle + " not found in " + haystack);
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
        Command parseCommand = idpw.getParseCommand(rootState);
        parseCommand.execute();
    }

    String serialize(final State state) {
        Command c = idpw.getCanonialSerializeCommand(state);
        c.execute();
        return state.getInterfaceDeclaration();
    }

}
