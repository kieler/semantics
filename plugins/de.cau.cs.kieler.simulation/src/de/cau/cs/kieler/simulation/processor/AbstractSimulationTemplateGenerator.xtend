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
package de.cau.cs.kieler.simulation.processor

import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kicool.compilation.VariableInformation
import de.cau.cs.kieler.kicool.deploy.processor.AbstractTemplateGeneratorProcessor
import java.util.List

import static extension com.google.common.collect.Sets.*

/**
 * @author als
 */
abstract class AbstractSimulationTemplateGenerator extends AbstractTemplateGeneratorProcessor<Object> {

    public static val BLACKLIST = new Property<List<String>>("de.cau.cs.kieler.simulation.comm.blacklist", null)
    
    def dropBlacklisted(Iterable<Pair<String, VariableInformation>> list) {
        if (!environment.getProperty(BLACKLIST).nullOrEmpty) {
            val blacklist = environment.getProperty(BLACKLIST).toSet
            return list.filter[value.properties.intersection(blacklist).empty]
        } else {
            return list
        }
    }
    
    def dropHostTypes(Iterable<Pair<String, VariableInformation>> list) {
        return list.filter[!(value.type === ValueType.HOST || "host".equalsIgnoreCase(value.typeName))]
    }
    
    protected def simpleName(String name) {
        return if (name.contains(".")) name.substring(name.lastIndexOf(".") + 1) else name
    }
}
