/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.sim.xtend

import de.cau.cs.kieler.esterel.sim.EsterelSimPlugin

import de.cau.cs.kieler.esterel.esterel.ValueType
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.EveryDo
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.esterel.esterel.Halt
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.Module
import de.cau.cs.kieler.esterel.esterel.Nothing
import de.cau.cs.kieler.esterel.esterel.EsterelParallel
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Repeat
import de.cau.cs.kieler.esterel.esterel.Run
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementContainer
import de.cau.cs.kieler.esterel.esterel.Suspend
import de.cau.cs.kieler.esterel.esterel.Sustain
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.scest.scest.UnEmit
import de.cau.cs.kieler.esterel.esterel.EsterelThread

/**
 * Transformation of Esterel code into Esterel code that is 
 * enriched with additional signals for each statement.<BR>
 * <BR>
 * These signals, here HP, are generated in the following fashion for a<BR> 
 * statement P:<BR>
 * <BR>
 * <PRE> 
 *  signal AP in<BR> 
 *  	[P; emit AP; || emit HP; abort sustain HP when immediate AP]<BR> 
 *  end <BR>
 * </PRE> 
 * <BR>
 * As names for the signals are randomly generated and must be unique<BR>
 * there must be a mapping that keeps track which signal (name) belongs to<BR>
 * which original Esterel statement.<BR>
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-05-31 yellow KI-7
 */
class Esterel2Simulation {

    // -------------------------------------------------------------------------
    // General method to create the enriched Esterel simulation code
    def Program transform2Simulation(Program program) {
        // Use the same auxiliary variable tag 
        val AUXILIARY_VARIABLE_TAG = EsterelSimPlugin::AUXILIARY_VARIABLE_TAG

        // Clone the complete Esterel program
        // clone the program and then copy modules to preserve the run-links
        val target = program.copy as Program;

        val originalStatements = program.eAllContents().toIterable().filter(typeof(Statement));

        val targetMainmodule = target.eAllContents().toIterable().filter(typeof(Module)).toList.get(0);
        val targetMainmoduleStatements = targetMainmodule.eAllContents().toIterable().filter(typeof(Statement));
        val targetMainmoduleStatementsCopy = targetMainmoduleStatements.toList;

        // Ensure an interface declaration
//        if (targetMainmodule.interface == null) {
//            val moduleInterface = EsterelFactory::eINSTANCE.createModuleInterface();
//            targetMainmodule.setInterface(moduleInterface);
//        }

        // For every statement in the Esterel program do the transformation
        // Iterate over a copy of the list	
        var i = 0;
        val originalStatementsList = originalStatements.toList;

        for (targetStatement : targetMainmoduleStatementsCopy) {
            var originalStatement = originalStatementsList.get(i);
            i = i + 1;
            val originalStatementURIFragment = originalStatement.eResource.getURIFragment(originalStatement);
            val statementUID = AUXILIARY_VARIABLE_TAG +
                originalStatementURIFragment.hashCode.toString().replace("-", "M");
            // This statement we want to modify
            targetStatement.transformStatement(targetMainmodule, statementUID);
        }

        target;
    }

    // -------------------------------------------------------------------------
    // Statement transformation in the fashion like described at the top
    def void transformStatement(Statement statement, Module mainmodule, String UID) {
        var container = statement.eContainer;

        // Statements for which the transformation should take part
        if (((statement instanceof Abort) || (statement instanceof Await) || (statement instanceof Do) ||
            (statement instanceof Emit) ||
            (statement instanceof UnEmit) || (statement instanceof EveryDo) ||
            (statement instanceof Exit) || (statement instanceof Halt) || (statement instanceof IfTest) ||
            (statement instanceof Loop) || (statement instanceof Nothing) || (statement instanceof Pause) ||
            (statement instanceof Present) || (statement instanceof Repeat) || (statement instanceof Run) ||
            (statement instanceof Suspend) || (statement instanceof Sustain) || (statement instanceof Block) 
// Other statements that currently are not visualized in an Esterel debug session          
//         ||(statement instanceof ProcCall)
//         ||(statement instanceof LoopDelay)
//         ||(statement instanceof LocalSignalDecl)
//         ||(statement instanceof Assignment)
//         || (statement instanceof Trap)      ||(statement instanceof LocalVariable)
//         ||(statement instanceof Exec)
        )) {

            var parallelStatement = EsterelFactory::eINSTANCE.createEsterelParallel()
            var thread1 = EsterelFactory::eINSTANCE.createEsterelThread()
            var thread2 = EsterelFactory::eINSTANCE.createEsterelThread()
//            var sequenceStatement1 = EsterelFactory::eINSTANCE.createSequence()
//            var sequenceStatement2 = EsterelFactory::eINSTANCE.createSequence()
            var blockStatement = EsterelFactory::eINSTANCE.createBlock()
            var blockStatement2 = EsterelFactory::eINSTANCE.createBlock()

            // abort signal
            var abortSignalDecl = EsterelFactory::eINSTANCE.createLocalSignalDecl()
//            var abortSignalLink = EsterelFactory::eINSTANCE.createLocalSignal()
            var abortISignal = EsterelFactory::eINSTANCE.createISignal();
            var abortEmitStatement = EsterelFactory::eINSTANCE.createEmit();

            // auxiliary signal
            // Must be linked in Output
            var auxiliarySignalISignal = EsterelFactory::eINSTANCE.createISignal();
            // Must be linked in ModuleBody->interface
            var auxiliarySignalOutput = EsterelFactory::eINSTANCE.createOutput();
            var auxiliaryEmitStatement = EsterelFactory::eINSTANCE.createEmit();
            var auxiliarySustainStatement = EsterelFactory::eINSTANCE.createSustain();

            var abortStatement = EsterelFactory::eINSTANCE.createAbort();
//            var abortInstanceStatement = EsterelFactory::eINSTANCE.createAbortInstance();
            var abortDelay = EsterelFactory::eINSTANCE.createDelayExpr();
//            var abortDelayEvent = EsterelFactory::eINSTANCE.createDelayEvent();
            var abortValuedObjectReference = EsterelFactory::eINSTANCE.createValuedObjectReference();

            // Setup the abortSignal using an unique name
            abortISignal.setName("AP" + statement.hashCode.toString().replace("-", "M"));
//            abortISignal.setIsInput(false);
//            abortISignal.setIsOutput(false);
            abortISignal.setType(ValueType::PURE);
//            abortSignalLink.signal.add(abortISignal);
//            abortSignalDecl.setSignalList(abortSignalLink as LocalSignalList);
            // Set the abortSignal for emission (to abort parallel sustain)
            abortEmitStatement.setSignal(abortISignal);

            // Setup the auxiliarySignal as an OUTPUT to the module
            auxiliarySignalISignal.setName(UID);
//            auxiliarySignalISignal.setIsInput(false);
//            auxiliarySignalISignal.setIsOutput(false);
            auxiliarySignalISignal.setType(ValueType::PURE);
            // Add auxiliarySignal to module
            auxiliarySignalOutput.signals.add(auxiliarySignalISignal);
            mainmodule.getIntSignalDecls.add(auxiliarySignalOutput);
            // Set the auxliiarySignal for emission and for sustain
            auxiliaryEmitStatement.setSignal(auxiliarySignalISignal);
            auxiliarySustainStatement.setSignal(auxiliarySignalISignal);

            // Build immediate abort
            abortStatement.statements.add(auxiliarySustainStatement);
            abortValuedObjectReference.setValuedObject(abortISignal);
//            abortDelayEvent.setExpr(abortValuedObjectReference);
            abortDelay.setSignalExpr(abortValuedObjectReference);
            abortDelay.setSignalExpr(abortValuedObjectReference);
//            abortDelay.setEvent(abortDelayEvent);
            abortDelay.setIsImmediate(true);
//            abortInstanceStatement.setDelay(abortDelay)
            abortStatement.setDelay(abortDelay);

            // Sequence of sustain statement
//            sequenceStatement2.list.add(auxiliaryEmitStatement)
//            sequenceStatement2.list.add(abortStatement)

            // Sequence of original statement followed by the emit of the strong abort signal
//            sequenceStatement1.list.add(statement);
//            sequenceStatement1.list.add(abortEmitStatement);

            // After this statement will have a new EContainer (wrapperStatement)
            parallelStatement.threads.add(thread1)
            parallelStatement.threads.add(thread2)
            thread1.getStatements.add(statement)
            thread1.getStatements.add(abortEmitStatement)
            thread2.getStatements.add(auxiliaryEmitStatement)
            thread2.getStatements.add(abortStatement)
//            parallelStatement.threads.statements.add(sequenceStatement1)
//            parallelStatement.list.add(sequenceStatement2)
//            blockStatement.addStatement(parallelStatement)
            blockStatement.getStatements.add(parallelStatement)

//            abortSignalDecl.addStatement(blockStatement)
            abortSignalDecl.getStatements.add(blockStatement)
            // Encapsulate inner [ || ] in local abort signal declaration
            // Add outer [] to this
//            blockStatement2.addStatement(abortSignalDecl)
            blockStatement2.getStatements.add(abortSignalDecl)
            // Add it to initial container
            container.addStatement(blockStatement2);
        } else {
            // this is necessary to handle not highlighted statements correctly (KISEMA-1004)
            var blockStatement2 = EsterelFactory::eINSTANCE.createBlock()
            blockStatement2.addStatement(statement)
            container.addStatement(blockStatement2);
        }

    }

    // -------------------------------------------------------------------------
    // Multiple statements
    def dispatch void addStatement(Module parent, Statement addStatement) {
        // Replace current statements with addStatement
        // parent.statements.clear();
        System::out.println("ADD MODULEBODY " + parent.class.name + " <- " + addStatement.class.name)
        parent.statements.add(addStatement);
    }

    def dispatch void addStatement(EsterelThread parent, Statement addStatement) {
        System::out.println("ADD PARALLEL  " + parent.class.name + " <- " + addStatement.class.name)
        parent.statements.add(addStatement);
    }

//    def dispatch void addStatement(Sequence parent, Statement addStatement) {
//        System::out.println("ADD SEQUENCE  " + parent.class.name + " <- " + addStatement.class.name)
//        parent.list.add(addStatement);
//    }

    // -------------------------------------------------------------------------
    // Single statement
    def dispatch void addStatement(StatementContainer parent, Statement addStatement) {
        System::out.println("ADD SIMPLE   " + parent.class.name + " <- " + addStatement.class.name)
        parent.statements.add(addStatement);
    }
// -------------------------------------------------------------------------
}













