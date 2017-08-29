/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.legacy.annotations.registry

import de.cau.cs.kieler.sccharts.legacy.annotations.Annotation
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Data
import com.google.inject.Singleton

/**
 * @author ssm
 * @kieler.design 2016-06-10 ssm als
 *
 */
@Singleton
class AnnotationsRegistry {
    
    private static val annotationsMap = <String, List<AnnotationEntry>> newHashMap
    
    def static String register(String name, de.cau.cs.kieler.sccharts.legacy.annotations.registry.AnnotationsType type, Class<? extends Annotation> annotationClass, 
        Class<? extends EObject> eClass, String description
    ) {
        val newAnnotationsEntry = new AnnotationEntry(name, type, annotationClass, eClass, description)
        val annotationsList = 
            if (annotationsMap.containsKey(name)) annotationsMap.get(name)
                else <AnnotationEntry> newLinkedList
        annotationsMap.put(name, annotationsList => [ it += newAnnotationsEntry ])
        return name 
    }
    
    def static Set<AnnotationEntry> getRegisteredAnnotations() {
        annotationsMap.values.flatten.toSet
    }
    
    def static void printRegisteredAnnotations() {
        for(entry : getRegisteredAnnotations) {
            val StringBuilder sb = new StringBuilder
            sb.append(entry.name)
            sb.append(" ")
            sb.append(entry.type.toString)
            sb.append(" ")
            sb.append(entry.clazz.toString)
            sb.append("\n  ");
            sb.append(entry.description)
            sb.append("\n")
            println(sb)
        }
    }
    
}

@Data
class AnnotationEntry {
    val String name
    val de.cau.cs.kieler.sccharts.legacy.annotations.registry.AnnotationsType type
    val Class<? extends Annotation> clazz
    val Class<? extends EObject> eClass
    val String description
}
