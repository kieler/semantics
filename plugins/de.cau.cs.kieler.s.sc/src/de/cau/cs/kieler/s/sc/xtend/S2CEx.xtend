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
package de.cau.cs.kieler.s.sc.xtend

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsSerializeExtension
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.s.s.State
import de.cau.cs.kieler.s.s.If

/**
 * @author ssm
 *
 */
class S2CEx {
    
    @Inject
    extension KExpressionsExtension       
    
    @Inject
    extension KExpressionsSerializeExtension
    
    public static String includeHeader;
    
    val preCache = <ValuedObject> newArrayList     
    
    // General method to create the c simulation interface.
    def transform (Program program) {
        val timestamp = System.currentTimeMillis
        program.eAllContents.filter(typeof(OperatorExpression)).filter[operator == OperatorType::PRE].forEach[
            it.eAllContents.filter(typeof(ValuedObjectReference)).forEach[ preCache += it.valuedObject ]    
        ]    
       var code = scHeader(program);

       if (program.globalHostCodeInstruction != null) {
           code = code + program.globalHostCodeInstruction.serialize
       }

       code = code + sResetFunction(program) + sTickFunction(program);
       
       val time = (System.currentTimeMillis - timestamp) as float
       System.out.println("C code generation finished (time used: "+(time / 1000)+"s).")    
       
       code
   }    
   
   def usesPre(ValuedObject valuedObject) {
       preCache.contains(valuedObject)
   }
   
    def scHeader(Program program) {
        return includeHeader +  sVariables(program)    
    }
    
    def sVariables(Program program) {
        var code = ""
        for(declaration : program.declarations.filter[e|!e.isSignal&&!e.isExtern]) {
            for(vo : declaration.valuedObjects) {
                code = code + vo.type.serialize + " " + vo.serialize;
                if (vo.initialValue != null) { code = code + " = " + vo.initialValue.serialize }
                code = code + ";"
                if (vo.usesPre) {
                    code = code + "PRE_" + vo.type.serialize + " " + vo.serialize;
                    if (vo.initialValue != null) { code = code + " = " + vo.initialValue.serialize }
                    code = code + ";"
                }                 
            }
        }
        code
    }
    
    def setPreVariables(Program program) {
        var code = ""
        for(declaration : program.declarations.filter[e|!e.isSignal&&!e.isExtern]) {
            for(vo : declaration.valuedObjects) {
                if (vo.usesPre) {
                    code = code + "PRE_" + vo.name + " = " + vo.name
                }                
            }
       }
       code
   }

   def resetVariables(Program program) {
        var code = ""
        for(declaration : program.declarations.filter[e|!e.isSignal&&!e.isExtern]) {
            for(vo : declaration.valuedObjects) {
                if (vo.usesPre) {
                    code = code + "PRE_" + vo.name + " = 0;";
                }
                
            }
        }
        code
    }
       
    def sResetFunction(Program program) {
        var code = "int reset(){";
        code = code + "_GO = 1;"
        code = code + resetVariables(program)
        code = code + "}"
        code
   }
   
   def sTickFunction(Program program) {
       var code = ""
       code = code + "   int tick(){"
       code = code + "       g0 = _GO;"
       for(state : program.states) {
           code = code + state.expand
       }
       code = code + "        _GO = 0;"
       code = code + program.setPreVariables
       code = code + "}"
       code
   }   
    
    
    
       // Expand a state traversing all instructions of that state.
    def dispatch CharSequence expand(State state) {
        var code = state.name + ": {"
        for(instruction:state.instructions) {
            code = code + instruction.expand
        }
        code = code + "}"
        code   
    }
   
   // Expand an IF instruction traversing all instructions of that IF instruction.
    def dispatch CharSequence expand(If ifInstruction) {
        var code = "if (" + ifInstruction.expression.serialize
        for(instruction : ifInstruction.instructions) {
            code = code + instruction.expand
        }
        code = code + "}"
        code
    }  
   
}