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
package de.cau.cs.kieler.synccharts.interfacedeclparser.bridge;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.KielerModelException;
import de.cau.cs.kieler.core.model.util.PossiblyEmptyCompoundCommand;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.interfacedeclparser.InterfaceDeclStandaloneSetup;

/**
 * Wrapping class to communicate between trigger listener and the acutal
 * serialize/parse commands.
 * 
 * @author uru
 * @author car
 * 
 */
public class InterfaceDeclProcessorWrapper {

    private Injector injector;
    /**
     * determines that the interface declaration string should be parsed into
     * internal syncchart objects.
     */
    public static final boolean PARSE = true;
    /**
     * determines that the internal signals and variables should be serialized
     * into the interface declaration string.
     */
    public static final boolean SERIALIZE = false;

    /**
     * Constructor. creates injector for parsing
     */
    public InterfaceDeclProcessorWrapper() {
        this.injector = new InterfaceDeclStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    /**
     * return serialization command suited if a signal's or variable's name
     * changed, something was added/deleted, or some change within a region
     * occured.
     * 
     * @param state
     *            the root state containing the ifdecl.
     * @param changedSignalOrVar
     *            either the changed signal or the variable.
     * @param oldName
     *            if there was a renaming - the name prior modifying
     * @param occurredChange
     *            determines the change that occurred
     * 
     * @return serialization command
     */
    public Command getSerializationCommand(final State state, final EObject changedSignalOrVar,
            final String oldName, final int occurredChange) {
        return getSerializationCommandPr(state, changedSignalOrVar, oldName, occurredChange);
    }

    /**
     * return serialization command suited for any other change than the
     * previous constructor is covering.
     * 
     * @param state
     *            the root state containing the ifdecl.
     * @param changedSignalOrVar
     *            either the changed signal or the variable.
     * 
     * @return serialization command
     */
    public Command getSerializationCommand(final State state, final EObject changedSignalOrVar) {
        return getSerializationCommandPr(state, changedSignalOrVar, null, -1);
    }

    /**
     * return the actual InterfaceDeclSerializeCommand with all passed
     * parameters.
     * 
     * @param state
     *            the root state containing the ifdecl.
     * @param changedSignalOrVar
     *            either the changed signal or the variable.
     * @param oldName
     *            if there was a renaming - the name prior modifying
     * @param occurredChange
     *            determines the change that occurred
     * 
     * @return serialization command
     */
    private Command getSerializationCommandPr(final State state, final EObject changedSignalOrVar,
            final String oldName, final int occurredChange) {

        PossiblyEmptyCompoundCommand pecc = new PossiblyEmptyCompoundCommand();
        // pass a null resource. prior serializing the resource is freshly received
        pecc.append(new InterfaceDeclSerializeCommand(state, changedSignalOrVar, null, oldName,
                injector, occurredChange));
        return pecc;
    }

    /**
     * Command parses the interface declaration of a state.
     * 
     * @param state
     *            state whose interface declaration should be parsed
     * @return command parsing interface declaration
     */
    public Command getParseCommand(final State state) {
        return new InterfaceDeclParseCommand(state, injector);
    }

    /**
     * public connection for the handler. Creates an InterfaceDeclParseCommand,
     * and executes it via the command stack.
     * 
     * @param parent
     *            parent state containing the interface declaration.
     * @param parse
     *            determine whether to parse or serialize.
     * @throws Exception
     *             if there was a problem executing on the command stack.
     * 
     */
    public static void processInterfaceDecl(final EObject parent, final boolean parse)
            throws Exception {

        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(parent);
        final InterfaceDeclProcessorWrapper parser = new InterfaceDeclProcessorWrapper();
        ParseInterfaceDeclProcessCommand cmd = parser.new ParseInterfaceDeclProcessCommand(parent,
                parser, parse);

        CommandStack stack = domain.getCommandStack();
        stack.execute(cmd);
        if (cmd.isError() && cmd.getException() != null) {
            throw cmd.exception;
        }
    }

    /**
     * Creates an InterfaceDeclParseCommand, and executes it via the command
     * stack.
     * 
     * @param parent
     *            parent state containing the interface declaration.
     * @param parse
     *            determine whether to parse or serialize.
     * @throws KielerModelException
     *             if something else than a state was passed as parent.
     * 
     */
    public void processInterfaceDeclCommand(final EObject parent, final boolean parse)
            throws KielerModelException {

        if (parent == null) {
            return;
        } else if (parent instanceof State) {

            if (parse == PARSE) {
                InterfaceDeclParseCommand cmd = new InterfaceDeclParseCommand((State) parent,
                        injector);
                cmd.processInterfaceDeclParse();
            } else if (parse == SERIALIZE) {
                XtextResource res = new InterfaceDeclParseCommand((State) parent, injector)
                        .getParsedResource();
                // this is a canonical serialization, it DOENST keep formatting
                InterfaceDeclSerializeCommand cmd = new InterfaceDeclSerializeCommand(
                        (State) parent, injector, res);
                cmd.processCanonicalSerialization();
            }
        } else {
            throw new KielerModelException(
                    "Can't parse Interface Declaration. Passed object is not of type State: "
                            + parent, parent);
        }
    }

    public Command getCanonialSerializeCommand(final State s) {
        return new CanonialSerializationCommand(s);
    }

    private class CanonialSerializationCommand extends AbstractCommand {
        private State state;
        private InterfaceDeclSerializeCommand cmd;

        public CanonialSerializationCommand(final State theState) {
            this.state = theState;
            XtextResource res = new InterfaceDeclParseCommand(theState, injector)
                    .getParsedResource();
            this.cmd = new InterfaceDeclSerializeCommand(state, injector, res);
            this.isExecutable = true;
        }

        public void execute() {
            cmd.processCanonicalSerialization();
        }

        public void redo() {
            execute();
        }

        @Override
        public void undo() {
            System.out.println("UNDO");
            cmd.undo();
        }

        @Override
        protected boolean prepare() {
            return true;
        }
    }

    /**
     * Command needed for the manual parsing to be executed on the command
     * stack.
     */
    private class ParseInterfaceDeclProcessCommand extends AbstractCommand {

        private InterfaceDeclProcessorWrapper parser;
        private EObject parent;
        private boolean parse;

        public ParseInterfaceDeclProcessCommand(final EObject theParent,
                final InterfaceDeclProcessorWrapper theParser, final boolean theParse) {
            this.parent = theParent;
            this.parser = theParser;
            this.parse = theParse;
        }

        private boolean error = false;
        private Exception exception;

        public boolean isError() {
            return error;
        }

        public Exception getException() {
            return exception;
        }

        public void execute() {
            try {
                parser.processInterfaceDeclCommand(parent, parse);
            } catch (Exception e) {
                error = true;
                exception = e;
            }
        }

        public void redo() {
            execute();
        }

        @Override
        public boolean canUndo() {
            return false;
        }

        @Override
        protected boolean prepare() {
            return true;
        }
    };
}
