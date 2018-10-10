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
package de.cau.cs.kieler.sccharts.processors.statebased.codegen

import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorModule
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * The SCChartsCodeGeneratorModule allows specific configuration for SCCharts code generators.
 * 
 * @author ssm
 * @kieler.design 2018-04-16 proposed 
 * @kieler.rating 2018-04-16 proposed yellow 
 * 
 */
abstract class SCChartsCodeGeneratorModule extends CodeGeneratorModule<SCCharts, State> {
    
    @Accessors var boolean printDebug    
    
    def SCCharts getSCCharts() {
        return rootObject
    }
    
    def State getRootState() {
        return moduleObject
    } 
    
}