/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package  de.cau.cs.kieler.s.sj.xtend

import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.Pause
import de.cau.cs.kieler.s.s.Prio
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.s.s.State
import de.cau.cs.kieler.s.s.Term
import com.google.common.collect.ImmutableList

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Transformation of S code into S code that is
 * enriched with additional auxiliary states necessary for SJ
 * code generation.
 * These are all S statements that are transformed to SJ statemenst following
 * a 'B' in its name, expecting a break (for rescheduling) right after the
 * SJ statement.
 * 
 * Example:
 * 
 * state ( L__13508254_D_surface ) {
 *  prio ( 3 ) ;
 *  if ( L1 ) {
 *      emit ( L2 ) ;
 *      trans ( L__13508254_E_surface ) ;
 *  } ;
 *  trans ( L__13508254_D_depth ) ;
 * }
 * 
 * ------->
 * 
 * state ( L__13508254_D_surface ) {
 *  prio ( 3 ) ;
 *  trans( L_AUX_1 );
 * }
 * state ( L_AUX_1 ) {
 *  if ( L1 ) {
 *      emit ( L2 ) ;
 *      trans ( L__13508254_E_surface ) ;
 *  } ;
 *  trans ( L__13508254_D_depth ) ;
 * }
 * 
 * @author cmot
 */
class AuxiliaryStates {
    
         // General method to create the enriched S simulation code.
         def Program transform2Simulation (Program program) {
               
         // Clone the complete S program 
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
                  var statementUID = originalInstructionURIFragment.hashCode.toString().replace("-","M");
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
               || (instruction instanceof Term)
               || (instruction instanceof Pause)
        ) {
            // get the parent state      
            val parentState = instruction.eContainer as State;
                  
            // auxiliary state/label
            var auxiliaryState = SFactory::eINSTANCE.createState();
            auxiliaryState.setName(parentState.name + UID)
            
            // auxiliary transition to auxiliary state
            //var auxiliaryTransition = SFactory::eINSTANCE.createTrans;
            if (instruction instanceof Pause) {
                (instruction as Pause).setContinuation(auxiliaryState);
            }
            if (instruction instanceof Prio) {
                (instruction as Prio).setContinuation(auxiliaryState);
            }
            
            // now move every instruction AFTER (excluding) the instruction into the NEW
            // state
            var found = false;
            for (otherInstruction : ImmutableList::copyOf(parentState.instructions)) {
                if (!found) {
                    if (otherInstruction.equals(instruction)) {
//                      auxiliaryState.instructions.add(auxiliaryTransition);
                        found = true;
                    }
                } else {
                    auxiliaryState.instructions.add(otherInstruction);
                }
            }
            
            // now add the auxiliaryState to the parent of the parent state
            val parentParent = parentState.eContainer as Program;
            val instructionList = parentParent.states;
            val parentIndex = instructionList.indexOf(parentState);
            instructionList.add(parentIndex+1, auxiliaryState);
        }
            
      }

}
