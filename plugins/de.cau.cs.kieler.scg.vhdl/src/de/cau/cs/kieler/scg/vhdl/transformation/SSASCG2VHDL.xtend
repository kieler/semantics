/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.vhdl.transformation

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.circuit.features.CircuitFeatures
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Node
import org.eclipse.emf.common.util.URI
import java.util.ArrayList
import de.cau.cs.kieler.core.kexpressions.ValuedObject

/**
 * Transformation of Circuit into VHDL code.
 * 
 * @author cmot,fry 
 * @kieler.design 2016-02-08 proposed cmot
 * @kieler.rating 2016-02-08 yellow 
 */
class SSASCG2VHDL extends AbstractProductionTransformation {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return VHDLTransformation::VHDL_ID
    }

    override getName() {
        return VHDLTransformation::VHDL_NAME
    }

    override getProducedFeatureId() {
        return VHDLTransformation::VHDL_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(CircuitFeatures::SCG2SSASCG_ID)
    }

    // -------------------------------------------------------------------------   
    // General method to create the VHDL code
    String modelname

    def transform(SCGraph scg) {
        if (scg != null) {
            val input = URI::createFileURI(scg.label)
            modelname = input.toString
            val temp = modelname.subSequence(0, modelname.indexOf("."))
            modelname = temp.toString
            modelname = modelname.replace("-", "_")
            var firstChar = modelname.charAt(0)
            
            while( Character::isDigit(firstChar) || (firstChar == "_")){
                if(!modelname.nullOrEmpty){
                     firstChar = modelname.charAt(0)
                     val tempp = modelname.subSequence(1, modelname.length).toString
                     modelname = tempp
                }else{
                    modelname = "no_valid_name"
                }
            }
        }
        
        val modelInputs = new ArrayList<ValuedObject>
        val modelOutputs = new ArrayList<ValuedObject>
        val modelLocalVariables = new ArrayList<ValuedObject>
        
        val entryNode = scg.
        
        '''
        «/* Generate the header */»
        «generateHeader()»
        ''' + '''ENTITY scgcircuit IS
        ''' + '''PORT(
        -- control
        tick: IN std_logic
        reset: IN boolean;
        -- inputs
        ''' + // TODO: ADD ALL INPUTS HERE
        '''        -- outputs
        ''' + // TODO: ADD ALL OUTPUTS HERE
        ''');
END scgcircuit;
        
        
        
ARCHITECTURE behavior of scgcircuit IS 
        ''' + '''
            begin
                    -- main logic
        ''' + '''
            «FOR innerActor : scg.eAllContents.filter(Node).toList»
                «innerActor.transformChilds»
            «ENDFOR»
        ''' + '''
        end behavior'''
    }

    // -------------------------------------------------------------------------   
    // Method for all child actors of circuit components
    def transformChilds(Node node) {
        // Filter only guards
        // if (node == null || node. .name == null || (!actor.name.startsWith("g"))) {
        // return ''''''
        // }
        // TODO: For all guard-actors derive correct VHDL expressions here (GO_local is just a place holder)
        // return '''        «actor.name» <= GO_local'''
        return '''node''' + node.hashCode
    }

    def generateHeader() {
        '''
            --/*****************************************************************************/
            --/*               G E N E R A T E D     V H D L    C O D E                    */
            --/*****************************************************************************/
            --/* KIELER - Kiel Integrated Environment for Layout Eclipse RichClient        */
            --/*                                                                           */
            --/* http://www.informatik.uni-kiel.de/rtsys/kieler/                           */
            --/* Copyright 2016 by                                                         */
            --/* + Kiel University                                                         */
            --/*   + Department of Computer Science                                        */
            --/*     + Real-Time and Embedded Systems Group                                */
            --/*                                                                           */
            --/* This code is provided under the terms of the Eclipse Public License (EPL).*/
            --/*****************************************************************************/
            
            library IEEE;
            use IEEE.STD_LOGIC_1164.ALL;
        '''
    }

// -------------------------------------------------------------------------   
}
