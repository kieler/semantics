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
package de.cau.cs.kieler.kicool.processors.analyzers

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.environments.Environment
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 */
class ObjectCounter extends Processor<EObject, EObject> {
    
    public static val IProperty<Integer> OBJECTS = 
        new Property<Integer>("de.cau.cs.kieler.kicool.processors.analyzers.objects", 0)
    public static val IProperty<String> CLASS_NAMES = 
        new Property<String>("de.cau.cs.kieler.kicool.processors.analyzers.objects.classes", "")
    static val CLASS_COUNT_KEY = "de.cau.cs.kieler.kicool.processors.analyzers.objects."
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.analyzers.objects"
    }
    
    override getName() {
        "Object Counter"
    }
    
    override getType() {
        return ProcessorType.ANALYZER
    }
    
    override process() {
        val objectList = model.eAllContents.toList
        
        setProperty(OBJECTS, objectList.size)
        environment.getPropertyAndSetIfAbsent(Environment.BENCHMARK_RESULT_KEYS, newArrayList()).addAll(#[OBJECTS.id])
        
        val classString = getProperty(CLASS_NAMES)
        if (classString.nullOrEmpty) return;
        
        val classes = classString.split(",")
        for (clazz : classes) {
            val classCount = objectList.filter[ it.class.name.contains(clazz) ].size
            val property = new Property<Integer>(CLASS_COUNT_KEY + clazz, 0)
            
            setProperty(property, classCount)
            environment.getPropertyAndSetIfAbsent(Environment.BENCHMARK_RESULT_KEYS, newArrayList()).addAll(#[property.id])
        }
    }
    
}