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

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import java.util.List
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property

/**
 * @author stu114663
 * 
 */
class TableIdentifierProcessor extends InplaceProcessor<List<List<String>>> {
    @Inject
    var TableIdentifier tableid

    public static val IProperty<TableInterpreter> TABLE_INTERPRETER = new Property<TableInterpreter>(
        "de.cau.cs.kieler.sccharts.processors.tabels.interpreter", null)

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.TableIdentifier"
    }

    override getName() {
        "TableIdentifier"
    }

    override process() {
        try {
            // TODO check for empty model
            environment.setProperty(
                de.cau.cs.kieler.sccharts.processors.tabels.TableIdentifierProcessor.TABLE_INTERPRETER,
                tableid.identify(getModel())
            )
        } catch (IllegalArgumentException exception) {
            // TODO exception is not shown?
            environment.errors.add(exception)
        }
    }
}
