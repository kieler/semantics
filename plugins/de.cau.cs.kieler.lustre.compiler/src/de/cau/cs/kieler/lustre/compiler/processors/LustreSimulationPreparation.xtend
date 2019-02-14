/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.compiler.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.deploy.CommonTemplateVariables
import de.cau.cs.kieler.kicool.deploy.processor.TemplateEngine
import de.cau.cs.kieler.lustre.extensions.LustreCreateExtension
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration

import static de.cau.cs.kieler.kicool.compilation.VariableStore.*

/**
 * @author lgr
 */
class LustreSimulationPreparation extends InplaceProcessor<LustreProgram> {
    
    public static val LUSTRE_ORIG = "lustre-orig"
    public static val LUSTRE_VIRTUAL = "lustre-virtual"

    @Inject extension LustreCreateExtension
    
    override getId() {
        "de.cau.cs.kieler.lustre.compiler.v6.simulation.preparation"
    }

    override getName() {
        "Generate V6 Simulation Preparation"
    }

    override process() {
               
        // Model name
        var templateEnv = environment.getProperty(TemplateEngine.GENRAL_ENVIRONMENT)?:newHashMap
        templateEnv.put(CommonTemplateVariables.MODEL_DATA_NAME, model.packBody.nodes.head.valuedObjects.head.name)
        environment.setProperty(TemplateEngine.GENRAL_ENVIRONMENT, templateEnv)

        // Init store
        if (model.packBody !== null) {
            val nodes = model.packBody.nodes
            
            for (Declaration node : nodes) {
                if (node instanceof NodeDeclaration) {
                    
                    for (VariableDeclaration varDecl : node.input.parameter) {
                        for (ValuedObject valObj : varDecl.valuedObjects) {
                            processValuedObject(valObj, INPUT)
                        }
                    }
                }
            }
            
        }
    }
    
    private def processValuedObject(ValuedObject valObj, String preDefString) {
        var props = newArrayList(LUSTRE_ORIG)
        if (preDefString !== null) props += preDefString
        
        val store = VariableStore.getVariableStore(environment)
        store.update(valObj, props).type = valObj.typeForValuedObject
        
        if (valObj.typeForValuedObject != ValueType.PURE) {
            val virtual = new VariableInformation
            virtual.valuedObject = null
            virtual.type = valObj.typeForValuedObject
            virtual.properties += LUSTRE_VIRTUAL
            if (preDefString !== null) virtual.properties += preDefString
            store.variables.put(valObj.name + "_val", virtual)
        }
    }
}
