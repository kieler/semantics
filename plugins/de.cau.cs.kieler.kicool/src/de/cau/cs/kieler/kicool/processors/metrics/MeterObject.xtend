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
package de.cau.cs.kieler.kicool.processors.metrics

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.core.properties.IProperty
import java.util.List
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * Meter Object
 * 
 * @author ssm
 * @kieler.design 2020-02-09 proposed
 * @kieler.rating 2020-02-09 proposed yellow  
 */
@FinalFieldsConstructor
class MeterObject {

    public static val IProperty<List<MeterObject>> METER_OBJECTS = 
        new Property<List<MeterObject>>("de.cau.cs.kieler.kicool.meterObject", <MeterObject> newLinkedList)
    
    @Accessors val String name
    @Accessors val double value
    @Accessors val boolean reverse
}