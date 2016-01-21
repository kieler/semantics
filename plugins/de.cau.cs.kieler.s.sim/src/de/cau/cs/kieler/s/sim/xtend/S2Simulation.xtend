/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.xtend

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.s.extensions.SExtension
import de.cau.cs.kieler.s.s.Abort
import de.cau.cs.kieler.s.s.Assignment
import de.cau.cs.kieler.s.s.Await
import de.cau.cs.kieler.s.s.Emit
import de.cau.cs.kieler.s.s.Fork
import de.cau.cs.kieler.s.s.Halt
import de.cau.cs.kieler.s.s.HostCodeInstruction
import de.cau.cs.kieler.s.s.If
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.Join
import de.cau.cs.kieler.s.s.LocalSignal
import de.cau.cs.kieler.s.s.Pause
import de.cau.cs.kieler.s.s.Prio
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.s.s.State
import de.cau.cs.kieler.s.s.Term
import de.cau.cs.kieler.s.s.Trans
import de.cau.cs.kieler.s.sim.SSimPlugin

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Transformation of S code into S code that is
 * enriched with additional signals for each s statement.
 * <BR><BR>
 * These signals, here HP, are generated in the following fashion for a 
 * statement P:
 * <BR><BR>
 * Emit HP; P
 * <BR><BR>
 * As names for the signals are randomly generated and must be unique
 * there must be a mapping that keeps track which signal (name) belongs to
 * which original S statement.
 * 
 * @author cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
class S2Simulation {
    
    @Inject
    extension KExpressionsValuedObjectExtensions    

    @Inject
    extension KExpressionsDeclarationExtensions    

    @Inject
    extension SExtension 
    
         // General method to create the enriched S simulation code.
    def Program transform2Simulation (Program program) {
         var AUXILIARY_VARIABLE_TAG = SSimPlugin::AUXILIARY_VARIABLE_TAG
               
         // Clone the complete S program 
//         var target = CloningExtensions::clone(program) as Program;
         var target = program.copy

         var originalInstructions = program.eAllContents().toIterable().filter(typeof(Instruction));
         var targetInstructions = target.eAllContents().toIterable().filter(typeof(Instruction)).toList();
            
         // For every instruction in the S program do the transformation
         // Iterate over a copy of the list      
         var i = 0;      
         var originalInstructionsList = originalInstructions.toList;
         for (targetInstruction : targetInstructions) {
                  var originalInstruction = originalInstructionsList.get(i);
                  i = i + 1;
                  val originalInstructionURIFragment = originalInstruction.eResource.getURIFragment(originalInstruction);
                  // The following URI is generated conforming to SKiviPlugin.DataComponent.getEncodedEObjectId(...).
                  var statementUID = AUXILIARY_VARIABLE_TAG + originalInstructionURIFragment.hashCode.toString().replace("-","M");
                  // This statement we want to modify
                  targetInstruction.transformInstruction(target, statementUID);
         }
           
         target;
      }      
      
      // Instruction transformation in the fashion like described at the top.
      def void transformInstruction(Instruction instruction, Program program, String UID) {
        //SIMPLE TEST
        if (
               (instruction instanceof Prio)
               ||(instruction instanceof Assignment)
               ||(instruction instanceof Trans)
               ||(instruction instanceof Fork)
               ||(instruction instanceof Join)
               ||(instruction instanceof Pause)
               ||(instruction instanceof Term)
               ||(instruction instanceof Halt)
               ||(instruction instanceof LocalSignal)
               ||(instruction instanceof Emit)
               ||(instruction instanceof Abort)
               ||(instruction instanceof If)
               ||(instruction instanceof Await)
               ||(instruction instanceof HostCodeInstruction)
        ) {
                  
            // auxiliary signal
            val auxiliarySignal = KExpressionsFactory::eINSTANCE.createValuedObject() => [
                name = UID
            ]
            createVariableDeclaration(ValueType::PURE) => [
                signal = true
                input = false
                output = true
                attach(auxiliarySignal)
                program.declarations += it
            ]
                        
            var auxiliaryEmitInstruction = SFactory::eINSTANCE.createEmit
            // Set the auxiliarySignal for emission 
            auxiliaryEmitInstruction.setSignal(auxiliarySignal);
            
            // get the container of the instruction
            var container = instruction.eContainer;
            
            if (container instanceof State) {
                  // Add auxiliarySignal to program
                  val stateInstruction = container as State;
                  val instructionList = stateInstruction.instructions;
                  val index = instructionList.indexOf(instruction);
                  instructionList.add(index, auxiliaryEmitInstruction);
            }
            else if (container instanceof If) {
                  // Add auxiliarySignal to program
                  val ifInstruction = container as If
                  val instructionList = ifInstruction.instructions;
                  val index = instructionList.indexOf(instruction);
                  instructionList.add(index, auxiliaryEmitInstruction);
            }
                  
        }
            
      }

}
