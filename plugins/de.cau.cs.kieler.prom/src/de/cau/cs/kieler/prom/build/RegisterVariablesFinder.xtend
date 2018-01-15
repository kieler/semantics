/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.prom.build

import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.prom.build.compilation.KiCoModelCompiler
import de.cau.cs.kieler.prom.build.compilation.ModelCompiler
import de.cau.cs.kieler.prom.build.templates.SimulationTemplateProcessor
import de.cau.cs.kieler.prom.build.templates.TemplateProcessor
import de.cau.cs.kieler.scg.SCGraphs
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors
import org.osgi.service.prefs.Preferences
import org.eclipse.core.runtime.preferences.InstanceScope
import de.cau.cs.kieler.prom.PromPlugin

/**
 * Adds the variables to the communicated variables in the simulation that save the sate of a model
 * These are the guard registers in the form _pgXXXX. They are created for pre statements in the SCG.
 * 
 * When these variables are available in the simulation (as well as all internal variables of the model),
 * it is possible to revert the complete state of the model.
 * 
 * @author aas
 *
 */
class RegisterVariablesFinder extends PromBuildAdapter {
    
    private static var RegisterVariablesFinder instance
    
    public static val ENABLED_ATTR = "registerVariablesFinder.enabled"
    
    /**
     * Enables or disables this class by setting the corresponding value in the preferences.
     */    
    public static def void setEnabled(boolean value) {
        preferences.putBoolean(ENABLED_ATTR, value);
        preferences.flush
    }
    
    /**
     * Returns the enabled state for this class from the preferences.
     */    
    public static def boolean isEnabled() {
        return preferences.getBoolean(ENABLED_ATTR, true);
    }
    
    /**
     * Constructor
     * 
     * Registers this listener.
     */
    new() {
        // Register this listener for model compilation and template processing
        register
        // Unregister old instance if needed
        if(instance !== null) {
            instance.unregister
        }
        instance = this
    }
    
    /**
     * The variables that are created during compilation and save the state of the model (the _pgXXXX variables)
     */
    @Accessors
    private var Set<String> registerVariables
    
    /**
     * Adds the register variables to the additional variables of a simulation template processor.
     * 
     * @param processor The potential simulation template processor
     */
    override beforeProcessing(TemplateProcessor processor) {
        if(!enabled) {
            return
        }
        if(processor instanceof SimulationTemplateProcessor) {
            // Add the variables to the simulation template processor
            if(!registerVariables.isNullOrEmpty) {
                registerVariables.add("_GO")
                processor.putAdditionalVariables("other", registerVariables.toList)
            }
        }
    }
    
    /**
     * Reset the register variables.
     * 
     * @param compiler The potential KiCoModelCompiler
     */
    override beforeCompilation(ModelCompiler compiler) {
        if(!enabled) {
            return
        }
        registerVariables = newHashSet
    }
    
    /**
     * Searches for register variables in the compilation result of the context.
     * 
     * @param compiler The potential KiCoModelCompiler
     */
    override afterIntermediateCompilation(ModelCompiler compiler) {
        if(!enabled) {
            return
        }
        // Get guard registers if any in the intermediate results of this processor
        var SCGraphs lastSCGraphs
        if(compiler instanceof KiCoModelCompiler) {
            for (iResult : compiler.context.processorInstancesSequence) {
                val intermediateResultModel = iResult.environment.getProperty(Environment.MODEL)
                if(intermediateResultModel instanceof SCGraphs) {
                    lastSCGraphs = intermediateResultModel
                }
            }
        }
        if(lastSCGraphs != null) {
            // Only look for register variables once
            if(registerVariables.isNullOrEmpty) {
                val monitor = compiler.monitor
                if(monitor != null) {
                    monitor.subTask("Searching register variables in SCG.")    
                }
                updateRegisterVariables(lastSCGraphs)
            }    
        }
    }
    
    /**
     * Returns the variables that have been generated to save the current state of the model.
     * 
     * @param scGraphs The SCGraphs
     * @return the names of variables that save the state of the model
     */
    private def void updateRegisterVariables(SCGraphs scGraphs) {
        for(scg : scGraphs.scgs) {
            for(node : scg.nodes) {
                if(node instanceof Assignment) {
                    val exp = node.expression
                    if(exp != null && exp instanceof OperatorExpression) {
                        val opExp = exp as OperatorExpression
                        if(opExp.operator == OperatorType.PRE) {
                            
                            for(subExp : opExp.subExpressions) {
                                if(subExp instanceof ValuedObjectReference) {
                                    val operand = subExp.valuedObject.name
//                                    println(node.reference.valuedObject.name + " = " + opExp.operator+"("+operand+")")
                                    val registerVariable = getRegisterVariable(operand)
                                    if(registerVariable != null) {
                                        registerVariables.add(registerVariable)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    /**
     * Returns the name of the register variable that is created for the given operand in a pre statement of an SCG.
     * 
     * @param preOperand The operand of a pre statement (for instance '_g3' in the statement 'pre(_g3)' )
     * @return the name of the variable that is generated in the code generation for the pre statement. 
     */
    private def String getRegisterVariable(String preOperand) {
        if(preOperand.startsWith("_g")) {
            return "_pg"+preOperand.substring(2)
        }
        return null
    }
    
    /**
     * Returns the preferences in which the attributes are stored.
     */
    private static def Preferences getPreferences() {
        return InstanceScope.INSTANCE.getNode(PromPlugin.PLUGIN_ID)
    }
}