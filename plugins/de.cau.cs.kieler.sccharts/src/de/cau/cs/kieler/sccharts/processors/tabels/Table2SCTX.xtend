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

import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.List

/**
 * @author stu114663
 * 
 */
class Table2SCTX extends ExogenousProcessor<List<List<String>>, SCCharts> {
    public static val IProperty<TableInterpreter> TABLE_INTERPRETER = new Property<TableInterpreter>(
        "de.cau.cs.kieler.sccharts.processors.tabels.interpreter", null)

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.Table2SCTX"
    }

    override getName() {
        "Table2SCTX"
    }

    override process() {
        // TODO check for empty model
        try {
            var TableInterpreter ti = environment.getProperty(TABLE_INTERPRETER)
            if (ti === null) {
                model = null
                // TODO better exception
                throw new Exception("Could not get Property: " + TABLE_INTERPRETER.id)
            } else {
                model = ti.interpret()
            }
        } catch (Exception exception) {
            // TODO exception is not shown?
            environment.errors.add(exception)
        }
    }
}
