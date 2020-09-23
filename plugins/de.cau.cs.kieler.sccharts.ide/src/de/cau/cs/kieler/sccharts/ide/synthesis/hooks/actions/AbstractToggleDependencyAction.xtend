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
package de.cau.cs.kieler.sccharts.ide.synthesis.hooks.actions

import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.klighd.IAction
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

/**
 * @author sdo
 *
 */
abstract class AbstractToggleDependencyAction implements IAction {
    
    public static val IProperty<DataDependency> DATA_DEPENDENCY =
        new Property<DataDependency>("de.cau.cs.kieler.sccharts.ui.synthesis.hools.dataDependency", null)    
    
    public static val ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.actions.toggleDependencyAction"
    
    public static val AUTO_SCHEDULE_OBJECT_NAME = "_auto"
    
}