package de.cau.cs.kieler.annotations.extensions

import de.cau.cs.kieler.annotations.Pragma
import de.cau.cs.kieler.annotations.Pragmatable
import de.cau.cs.kieler.annotations.StringPragma

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.annotations.AnnotationsFactory
import java.util.List

/**
 * Annotations extensions
 * 
 * @author ssm
 */
class PragmaExtensions {
	
    def Pragma getPragma(Pragmatable pragmatable, String name) {
        pragmatable.getPragmas(name)?.head
    }

    def getPragmas(Pragmatable pragmatable, String name) {
        pragmatable.pragmas.filter[ it.name.equalsIgnoreCase(name) ]
    }
    
    def getPragmasCS(Pragmatable pragmatable, String name) {
        pragmatable.pragmas.filter[ it.name.equals(name) ]
    }
    
    def getStringPragmas(Pragmatable pragmatable, String name) {
        pragmatable.getPragmas(name).filter(StringPragma)
    }

    def StringPragma createStringPragma(String name, String value) {
        AnnotationsFactory::eINSTANCE.createStringPragma => [
            it.name = name
            it.values += value
        ]
    }
    
    def StringPragma createStringPragma(String name, List<String> values) {
        AnnotationsFactory::eINSTANCE.createStringPragma => [
            it.name = name
            it.values.addAll(values)
        ]
    }

    def Pragma createPragmaTag(String name) {
        AnnotationsFactory::eINSTANCE.createPragma => [
            it.name = name
        ]
    }

    def boolean hasPragma(Pragmatable pragmatable, String name) {
        !pragmatable.pragmas.nullOrEmpty && !pragmatable.getPragmas(name).empty
    }
    
    def void copyPragmas(Pragmatable source, Pragmatable target) {
        source.pragmas.forEach[
            target.pragmas += it.copy
        ]
    }    
	
}