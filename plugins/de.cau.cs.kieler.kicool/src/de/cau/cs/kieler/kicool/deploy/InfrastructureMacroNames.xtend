/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.deploy

/**
 * 
 * @author ssm
 * @kieler.design 2019-05-21 proposed
 * @kieler.rating 2019-05-21 proposed yellow  
 */
class InfrastructureMacroNames {
    
    static val macroList = newHashMap(
        "\\$MODELNAME" -> [ infra | modelNameMacro(infra) ]
    )    
   
    static def String resolveMacros(String string, ProjectInfrastructure infra) {
        var s = string
        for (macro : macroList.entrySet) {
            s = s.replaceAll(macro.key, macro.value.apply(infra))
        }
        return s
    }
   
   
    static def String modelNameMacro(ProjectInfrastructure infra) {
        infra.sourceCode.head.modelName    
    }
}