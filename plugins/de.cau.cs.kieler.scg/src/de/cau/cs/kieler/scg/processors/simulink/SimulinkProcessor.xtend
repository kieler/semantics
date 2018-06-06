/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.simulink

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.SCCharts
import javax.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import java.util.List
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * @author msa
 *
 */
class SimulinkProcessor extends InplaceProcessor<CodeContainer> {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.simulink"
    }
    
    override getName() {
        "Simulink"
    }
    
    override process() {
        val originalModel = environment.getProperty(Environment.ORIGINAL_MODEL)
        
        if (!(originalModel instanceof SCCharts)) {
            environment.errors.add("Simulink processor needs an SCCharts model as original input.")
            return;
        }
        
        val rootState = (originalModel as SCCharts).rootStates.head
        
        val inputs = rootState.variableDeclarations.filter[ input ].map[ valuedObjects ].flatten.toList
        val outputs = rootState.variableDeclarations.filter[ output ].map[ valuedObjects ].flatten.toList
        
        
        
        val modelName = rootState.name;
        
        buildWrapperFile(modelName, inputs, outputs)
        buildMatlabFile(modelName, inputs, outputs)
     }
    
    protected def buildWrapperFile(String modelName, List<ValuedObject> inputs, List<ValuedObject> outputs) {
        val codeContainer = getModel 
        val wrapperFileString = new StringBuilder
        
        wrapperFileString.append("/*\n" +
                                 " * Automatically generated C Code by \n" +
                                 " * KIELER SCCharts - The key to Efficient Modeling \n" + 
                                 " * \n" +
                                 " * http://rtsys.informatik.uni-kiel.de/kieler \n" +
                                 " */ \n\n")
        wrapperFileString.append("#include \"" + modelName + ".c\" \n\n")
        wrapperFileString.append("void wrapper_" + modelName + "(")
        for (input : inputs) {
            val inputName = input.name
            wrapperFileString.append("double " + inputName + ", ")
        }
        for (output : outputs) {
            val outputName = output.name
            wrapperFileString.append("double *" + outputName)
            if(output == outputs.last()) {wrapperFileString.append(") \n")}
            else{wrapperFileString.append(", ")}  
        }
        wrapperFileString.append("{ \n\n" +
                                 "  TickData d; \n\n" +
                                 "  reset(&d); \n")                      
        for (input : inputs) {
            val inputName = input.name
            val inputType = input.getVariableDeclaration.type
            wrapperFileString.append("  d." + inputName + " = (" + inputType.toString + ") " + inputName + "; \n")
        }                         
        // wrapperFileString.append("  d._pg3 = 1; \n")  // TODO look if manual setting is ever necessary
        wrapperFileString.append("  tick(&d);\n\n");
        for (output : outputs) {
            val outputType = output.getVariableDeclaration.type
            val outputName = output.name
            wrapperFileString.append("  *" + outputName + " = (" + outputType + ") d." + outputName + "; \n")         
        }
        wrapperFileString.append("\n}")
        
        codeContainer.add(modelName + "_wrapper" + ".c", wrapperFileString.toString)
         
     }
        
     protected def buildMatlabFile(String modelName, List<ValuedObject> inputs, List<ValuedObject> outputs) {

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
            val outputName = output.name
            matlabFileString.append(outputName)
            if(output != outputs.last()) {matlabFileString.append(",")} 
        }
        matlabFileString.append("] = " + modelName + "(")
        for (input : inputs) {
            val inputName = input.name
            matlabFileString.append(inputName)
            if(input != inputs.last()) {matlabFileString.append(", ")} 
        }
        matlabFileString.append(") \n\n")
        matlabFileString.append("coder.cinclude('" + modelName + "_wrapper.c'); \n\n")
        for (output : outputs) {
            val outputName = output.name
            matlabFileString.append(outputName + " = 0.0; \n")
        }
        matlabFileString.append("coder.ceval('wrapper_" + modelName + "', ")
        for (input : inputs) {
            val inputName = input.name
            matlabFileString.append(inputName + ", ")
        }
        for (output : outputs) {
            val outputName = output.name
            matlabFileString.append("coder.ref(" + outputName + ")")
            if(output != outputs.last()) {matlabFileString.append(", ")} 
        }    
        matlabFileString.append(");")
                       
        codeContainer.add(modelName + "_matlabFunction" + ".txt", matlabFileString.toString + "\n")      
    }
    
}