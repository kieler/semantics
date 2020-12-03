/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.simulink

import de.cau.cs.kieler.annotations.Nameable
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.VariableStore
import java.util.List

/**
 * @author msa
 *
 */
class SimulinkProcessor extends InplaceProcessor<CodeContainer> {
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.codegen.simulink"
    }
    
    override getName() {
        "Simulink"
    }
    
    override process() {
        val vs = VariableStore.get(environment)
        val inputs = vs.variables.entries.filter[value.input].map[key].toList
        val outputs = vs.variables.entries.filter[value.output].map[key].toList
        val osm = compilationContext.originalModel
        val modelName =  if (osm instanceof Nameable) osm.name else "unknown"; 
       
        buildWrapperFile(modelName, inputs, outputs)
        buildMatlabFile(modelName, inputs, outputs)
     }
    
    protected def buildWrapperFile(String modelName, List<String> inputs, List<String> outputs) {
        val codeContainer = getModel 
        val wrapperFileString = new StringBuilder
        
        wrapperFileString.append("/*\n" +
                                 " * Automatically generated C Code by \n" +
                                 " * KIELER SCCharts - The key to Efficient Modeling \n" + 
                                 " * \n" +
                                 " * http://rtsys.informatik.uni-kiel.de/kieler \n" +
                                 " */ \n\n")
        wrapperFileString.append("#include \"" + modelName + ".c\" \n\n")
        
        wrapperFileString.append("static TickData_" + modelName + " d_" + modelName + "; \n")
        wrapperFileString.append("static char init_" + modelName + " = true; \n\n")
        
        wrapperFileString.append("static inline void wrapper_" + modelName + "(")
        for (input : inputs) {
            wrapperFileString.append("double " + input + ", ")
        }
        for (output : outputs) {
            wrapperFileString.append("double *" + output)
            if(output == outputs.last()) {wrapperFileString.append(") \n")}
            else{wrapperFileString.append(", ")}  
        }
        wrapperFileString.append("{ \n\n" +
                                 "  if(init_" + modelName + ") { \n" +
                                 "      reset_" + modelName + "(&d_" + modelName + "); \n" +
                                 "      init_" + modelName + " = false;  \n" +
                                 "  } \n")                    
        for (input : inputs) {
            wrapperFileString.append("  d_" + modelName + "." + input + " = " + input + "; \n")
        }                         
        wrapperFileString.append("  tick_" + modelName + "(&d_" + modelName + ");\n\n")
        for (output : outputs) {
            wrapperFileString.append("  *" + output + " = d_" + modelName + "." + output + "; \n")         
        }
        wrapperFileString.append("\n}")
        
        codeContainer.add(modelName + "_wrapper" + ".c", wrapperFileString.toString)
         
     }
        
     protected def buildMatlabFile(String modelName, List<String> inputs, List<String> outputs) {

        val codeContainer = getModel 
        val matlabFileString = new StringBuilder
        
        matlabFileString.append("% \n" +
                                "% Automatically generated MATLAB Code by \n" +
                                "% KIELER SCCharts - The Key to Efficient Modeling \n" + 
                                "% http://rtsys.informatik.uni-kiel.de/kieler \n" +
                                "% \n" +
                                "% copy this into a MATLAB Function Block \n" +
                                "% \n\n")
        matlabFileString.append("function [")
        for (output : outputs) {
            matlabFileString.append(output)
            if(output != outputs.last()) {matlabFileString.append(",")} 
        }
        matlabFileString.append("] = " + modelName + "(")
        for (input : inputs) {
            matlabFileString.append(input)
            if(input != inputs.last()) {matlabFileString.append(", ")} 
        }
        matlabFileString.append(") \n\n")
        matlabFileString.append("coder.cinclude('" + modelName + "_wrapper.c'); \n\n")
        for (output : outputs) {
            matlabFileString.append(output + " = 0.0; \n")
        }
        matlabFileString.append("coder.ceval('wrapper_" + modelName + "', ")
        for (input : inputs) {
            matlabFileString.append(input + ", ")
        }
        for (output : outputs) {
            matlabFileString.append("coder.ref(" + output + ")")
            if(output != outputs.last()) {matlabFileString.append(", ")} 
        }    
        matlabFileString.append(");")
                       
        codeContainer.add(modelName + "_matlabFunction" + ".txt", matlabFileString.toString + "\n")      
    }
    
}