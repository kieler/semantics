/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.sccharts

import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.TypedStringAnnotation
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageClient
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.interactive.ConstraintProperty
import de.cau.cs.kieler.klighd.lsp.interactive.IConstraintSerializer
import de.cau.cs.kieler.sccharts.impl.StateImpl
import java.io.ByteArrayOutputStream
import java.util.List
import java.util.Map
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.lsp4j.Position
import org.eclipse.lsp4j.Range
import org.eclipse.lsp4j.TextEdit

/**
 * Serialize a constraint for an SCChart node (region or state) as a layout annotation.
 * 
 * @author sdo
 * 
 */
class SCTXConstraintSerializer implements IConstraintSerializer {

    override canHandle(Object graph) {
        return graph instanceof StateImpl
    }

    override serializeConstraints(List<ConstraintProperty<Object>> changedNodes, Object graph, String uri,
        KGraphLanguageServerExtension ls, KGraphLanguageClient client) {
        changedNodes.forEach[c|
            val Annotatable anno = c.KNode.getProperty(KlighdInternalProperties.MODEL_ELEMEMT) as Annotatable
            copyConstraintAnnotations(anno, c.KNode, c.property.id, c.property)
        ]
        // Serialize model into given uri.
        val resource = ls.getResource(uri)
            
        // Get previous file content as String
        var outputStream = new ByteArrayOutputStream
        resource.save(outputStream, emptyMap)
        val codeBefore = outputStream.toString
        val Map<String, List<TextEdit>> changes = newHashMap 
        // Get changed file as String
        outputStream = new ByteArrayOutputStream
        resource.save(outputStream, emptyMap)
        val String codeAfter = outputStream.toString().trim
        
        // The range is the length of the previous file.
        // Just make sure the range is big enough
        val Range range = new Range(new Position(0, 0), new Position(codeBefore.split("\r\n|\r|\n").length * 2, 0))
        val TextEdit textEdit = new TextEdit(range, codeAfter)
        changes.put(uri, #[textEdit]);
        client.replaceContentInFile(uri, codeAfter, range)
    }
    
    /**
     * Copies an arbitrary IProperty of a KNode to a State if the value on the KNode 
     * is different to the value on the State.
     * If the new value on the KNode was the default value of the property 
     * then the property is set to null on the State.
     * 
     * @param state The target state.
     * @param kNode The source KNode of the property.
     * @param annotation The annotation that should be set.
     * @param property Determines which IProperty should be copied.
     */
    static def <T> copyConstraintAnnotations(Annotatable state, KNode kNode, String annotation, IProperty<T> property) {
        val String value = "" + kNode.getProperty(property)
        
        val annotations = state.getAnnotations().filter(TypedStringAnnotation)

        // Remove old annotation if it exists.
        var TypedStringAnnotation annotationToRemove = null
        for (a : annotations) {
            if (a.type.equals(annotation)) {
                annotationToRemove = a
            }
        }
        if (annotationToRemove !== null) {
            state.annotations.remove(annotationToRemove)
        }
        
        // Add annotation with new value if the value is not the default one.
        if (kNode.getProperty(property) !== null && !kNode.getProperty(property).equals(property.^default)) {
            var newA = AnnotationsFactory::eINSTANCE.createTypedStringAnnotation => [
                it.name = "layout"
                it.type = annotation
                it.values += value
            ]
            state.annotations.add(newA)    
        }
        
    }

}
