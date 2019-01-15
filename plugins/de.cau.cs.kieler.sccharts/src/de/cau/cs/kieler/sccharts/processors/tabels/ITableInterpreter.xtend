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
package de.cau.cs.kieler.sccharts.processors.tabels

import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.List

/**
 * @author stu114663
 *
 */
interface ITableInterpreter {
    def void initialize(HeaderNumbers[] headerLine, List<List<String>> table)
    def SCCharts interpret()
    def void createStates(ControlflowRegion region)
    def void createTransitions()
}