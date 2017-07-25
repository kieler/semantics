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
package de.cau.cs.kieler.scg.processors.transformators.codegen.c

import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraph
import java.util.Map
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import java.util.List
import com.google.inject.Inject
import de.cau.cs.kieler.scg.codegen.SCG2CSerializeHRExtensions

/**
 * @author ssm
 * @kieler.design 2017-07-24 proposed 
 * @kieler.rating 2017-07-24 proposed yellow 
 * 
 */
class CCodeGeneratorLogicModule extends SCGCodeGeneratorModule {
    
    @Inject extension SCG2CSerializeHRExtensions
    
    static val LOGIC_NAME = "logic"
    
    @Inject CCodeGeneratorStructModule struct 
    @Inject CCodeGeneratorResetModule reset
    @Inject CCodeGeneratorTickModule tick 
    
    protected val conditionalStack = <Conditional> newLinkedList
    
    override configure(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap, SCGCodeGeneratorModule parent
    ) {
        super.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, parent)
    }
    
    def getName() {
        LOGIC_NAME + baseName + suffix
    }
    
    override generateInit() {
        code.append("void ").append(getName)
        code.append("(")
        code.append(struct.getName).append("* ").append(struct.getVariableName)
        code.append(") {\n")
    }
    
    override generate() {
        var nodes = newLinkedList => [ it += scg.nodes.head ]
        conditionalStack.clear
        
        while(!nodes.empty) {
            val node = nodes.pop
            node.generate(nodes)
        }
    }
    
    override generateDone() {
        code.append("}\n")
    }
    
    protected def dispatch void generate(Assignment assignment, List<Node> nodes) {
        indent(conditionalStack.size + 1)
        valuedObjectPrefix = struct.getVariableName + "->"
        code.append(assignment.serializeHR).append(";\n")
    }
    
    protected def dispatch void generate(Conditional conditional, List<Node> nodes) {
        
    }
    
    protected def dispatch void generate(Entry entry, List<Node> nodes) {
        nodes += entry.next?.target
    }
    
    protected def dispatch void generate(Exit exit, List<Node> nodes) {
    }
    
}