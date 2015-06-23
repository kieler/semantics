/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.sim.c.xtend

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.esterel.sim.c.EsterelCSimulationPlugin
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Statement
import de.cau.cs.kieler.esterel.esterel.Module
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.esterel.esterel.Await
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.EveryDo
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.esterel.esterel.Halt
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.Nothing
import de.cau.cs.kieler.esterel.esterel.Pause
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.Repeat
import de.cau.cs.kieler.esterel.esterel.Run
import de.cau.cs.kieler.esterel.esterel.Suspend
import de.cau.cs.kieler.esterel.esterel.Sustain
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.kexpressions.ValueType
import de.cau.cs.kieler.esterel.esterel.LocalSignalList
import de.cau.cs.kieler.esterel.esterel.ModuleBody
import de.cau.cs.kieler.esterel.esterel.Parallel
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.StatementContainer

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.esterel.scl.transformations.EsterelTransformation
import de.cau.cs.kieler.esterel.features.EsterelFeature
import com.google.common.collect.Sets

/**
 * This class handles the<BR>
 *   - Simulation visualization<BR>
 * 
 * @author cmot
 * @kieler.design 2014-11-26 proposed cmot
 * @kieler.rating 2014-11-26 proposed yellow
 */
class SimulationVisualization extends AbstractExpansionTransformation {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return EsterelTransformation::SIMULATIONVISUALIZATION_ID
    }

    override getName() {
        return EsterelTransformation::SIMULATIONVISUALIZATION_NAME
    }

    override getExpandsFeatureId() {
        return EsterelFeature::SIMULATIONVISUALIZATION_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(EsterelFeature::BASIC_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet()
    }
    
    //-------------------------------------------------------------------------
    
    @Inject
    extension KExpressionsExtension

//    @Inject
//    extension Esterel

    //-------------------------------------------------------------------------
    //--         S I M U L A T I O N    V I S U A L I Z A T I O N            --
    //-------------------------------------------------------------------------
    // TODO: Describe
    var AUXILIARY_VARIABLE_TAG_STATE = EsterelCSimulationPlugin::AUXILIARY_VARIABLE_TAG

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"
    
    def Program transformNoVisualization(Program model) {
        // The default does nothing
        model
    }

    def Program transformVisualization(Program program) {
        // The default does nothing
        
        // TODO: enable visualization
        // Use the same auxiliary variable tag 
        val AUXILIARY_VARIABLE_TAG = EsterelCSimulationPlugin::AUXILIARY_VARIABLE_TAG
        
        // Clone the complete Esterel program
        // clone the program and then copy modules to preserve the run-links
        val target = program.copy as Program;
        
        val originalStatements = program.eAllContents().toIterable().filter(typeof(Statement));
        
        val targetMainmodule = target.eAllContents().toIterable().filter(typeof(Module)).toList.get(0);
        val targetMainmoduleStatements = targetMainmodule.eAllContents().toIterable().filter(typeof(Statement));
        val targetMainmoduleStatementsCopy = targetMainmoduleStatements.toList;
        
        // Ensure an interface declaration
        if (targetMainmodule.interface == null) {
            val moduleInterface = EsterelFactory::eINSTANCE.createModuleInterface(); 
            targetMainmodule.setInterface(moduleInterface);
        } 
        
        // For every statement in the Esterel program do the transformation
        // Iterate over a copy of the list  
        var i = 0;  
        val originalStatementsList = originalStatements.toList;
        
        for(targetStatement : targetMainmoduleStatementsCopy) {
            var originalStatement = originalStatementsList.get(i);
            i = i + 1;
            val originalStatementURIFragment = originalStatement.eResource.getURIFragment(originalStatement);
            val statementUID = AUXILIARY_VARIABLE_TAG + originalStatementURIFragment.hashCode.toString().replace("-","M");
            // This statement we want to modify
            targetStatement.transformStatement(targetMainmodule, statementUID);
        }
        
        target;
    }   
    
    
    //-------------------------------------------------------------------------
    
    // Statement transformation in the fashion like described at the top
    def void transformStatement(Statement statement, Module mainmodule, String UID) {
        var container = statement.eContainer;

        var parallelStatement = EsterelFactory::eINSTANCE.createParallel()
        var sequenceStatement1 = EsterelFactory::eINSTANCE.createSequence()
        var sequenceStatement2 = EsterelFactory::eINSTANCE.createSequence()
        var blockStatement = EsterelFactory::eINSTANCE.createBlock()
        var blockStatement2 = EsterelFactory::eINSTANCE.createBlock()

        // abort signal
        var abortSignalDecl = EsterelFactory::eINSTANCE.createLocalSignalDecl()
        var abortSignalLink = EsterelFactory::eINSTANCE.createLocalSignal()
        var abortISignal = KExpressionsFactory::eINSTANCE.createISignal();
        var abortEmitStatement = EsterelFactory::eINSTANCE.createEmit();

        // auxiliary signal
                // Must be linked in Output
        var auxiliarySignalISignal = KExpressionsFactory::eINSTANCE.createISignal();
                // Must be linked in ModuleBody->interface
        var auxiliarySignalOutput = KExpressionsFactory::eINSTANCE.createOutput();
        var auxiliaryEmitStatement = EsterelFactory::eINSTANCE.createEmit();
        var auxiliarySustainStatement = EsterelFactory::eINSTANCE.createSustain();


        var abortStatement = EsterelFactory::eINSTANCE.createAbort();
        var abortInstanceStatement =  EsterelFactory::eINSTANCE.createAbortInstance();
        var abortDelay =  EsterelFactory::eINSTANCE.createDelayExpr();
        var abortDelayEvent = EsterelFactory::eINSTANCE.createDelayEvent();
        var abortValuedObjectReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference();
        
        //Statements for which the transformation should take part
        if ((
           (statement instanceof Abort)
           ||(statement instanceof Await)
           ||(statement instanceof Do)
           ||(statement instanceof Emit)
           ||(statement instanceof EveryDo)
           ||(statement instanceof Exit)
           ||(statement instanceof Halt)
           ||(statement instanceof IfTest)
           ||(statement instanceof Loop)
           ||(statement instanceof Nothing)
           ||(statement instanceof Pause)
           ||(statement instanceof Present)
           ||(statement instanceof Repeat)
           ||(statement instanceof Run)
           ||(statement instanceof Suspend)
           ||(statement instanceof Sustain)
           ||(statement instanceof Block)
// Other statements that currently are not visualized in an Esterel debug session          
//         ||(statement instanceof ProcCall)
//         ||(statement instanceof LoopDelay)
//         ||(statement instanceof LocalSignalDecl)
//         ||(statement instanceof Assignment)
//         ||(statement instanceof Trap)
//         ||(statement instanceof LocalVariable)
//         ||(statement instanceof Exec)
        )) {
                // Setup the abortSignal using an unique name
                abortISignal.setName("AP" + statement.hashCode.toString().replace("-","M"));
                abortISignal.setIsInput(false);
                abortISignal.setIsOutput(false);
                abortISignal.setType(ValueType::PURE);
                abortSignalLink.signal.add(abortISignal);
                abortSignalDecl.setSignalList(abortSignalLink as LocalSignalList);
                // Set the abortSignal for emission (to abort parallel sustain)
                abortEmitStatement.setSignal(abortISignal);

                // Setup the auxiliarySignal as an OUTPUT to the module
                auxiliarySignalISignal.setName(UID);
                auxiliarySignalISignal.setIsInput(false);
                auxiliarySignalISignal.setIsOutput(false);
                auxiliarySignalISignal.setType(ValueType::PURE);
                // Add auxiliarySignal to module
                auxiliarySignalOutput.signals.add(auxiliarySignalISignal);
                mainmodule.interface.intSignalDecls.add(auxiliarySignalOutput);
                // Set the auxliiarySignal for emission and for sustain
                auxiliaryEmitStatement.setSignal(auxiliarySignalISignal);
                auxiliarySustainStatement.setSignal(auxiliarySignalISignal);
                
                // Build immediate abort
                abortStatement.setStatement(auxiliarySustainStatement);
                        abortValuedObjectReference.setValuedObject(abortISignal);
                      abortDelayEvent.setExpr(abortValuedObjectReference);
                    abortDelay.setEvent(abortDelayEvent);
                    abortDelay.setIsImmediate(true);
                  abortInstanceStatement.setDelay(abortDelay)
                abortStatement.setBody(abortInstanceStatement);
                
                
                // Sequence of sustain statement
                sequenceStatement2.list.add(auxiliaryEmitStatement)
                sequenceStatement2.list.add(abortStatement)
                
                // Sequence of original statement followed by the emit of the strong abort signal
                sequenceStatement1.list.add(statement);
                sequenceStatement1.list.add(abortEmitStatement);
                
                // After this statement will have a new EContainer (wrapperStatement)
                parallelStatement.list.add(sequenceStatement1)
                parallelStatement.list.add(sequenceStatement2)
                blockStatement.addStatement(parallelStatement)

                abortSignalDecl.addStatement(blockStatement)

                // Encapsulate inner [ || ] in local abort signal declaration
                // Add outer [] to this
                blockStatement2.addStatement(abortSignalDecl)
                // Add it to initial container
                container.addStatement(blockStatement2);
        }
        
    }

    
    //-------------------------------------------------------------------------

    // Multiple statements
    def dispatch void addStatement(ModuleBody parent, Statement addStatement) {
        // Replace current statements with addStatement
        parent.statements.clear();
        parent.statements.add(addStatement);
    }
    def dispatch void addStatement(Parallel parent, Statement addStatement) {
        parent.list.add(addStatement);
    }
    def dispatch void addStatement(Sequence parent, Statement addStatement) {
        parent.list.add(addStatement);
    }
    
    //-------------------------------------------------------------------------
    
    // Single statement
    def dispatch void addStatement(StatementContainer parent, Statement addStatement) {
        parent.setStatement(addStatement);
    }


    //-------------------------------------------------------------------------

}
