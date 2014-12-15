package de.cau.cs.kieler.core.annotations.extensions

import de.cau.cs.kieler.core.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.annotations.Annotation
import de.cau.cs.kieler.core.annotations.Annotatable
import de.cau.cs.kieler.core.annotations.StringAnnotation
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class AnnotationsExtensions {
	
	def public Annotation getStringAnnotation(Annotatable annotatable, String name) {
		annotatable.annotations.filter[ it.name == name ]?.head
	} 

    def public Iterable<Annotation> getStringAnnotations(Annotatable annotatable, String name) {
        annotatable.annotations.filter[ it.name == name ]
    } 
	
	def public String getStringAnnotationValue(Annotatable annotatable, String name) {
		val anno = annotatable.getStringAnnotation(name)
		if (anno != null) 
			(anno as StringAnnotation).value
		else
			""
	}

	def public Annotatable addAnnotation(Annotatable source, String name, String value) {
		source => [ annotations += name.createStringAnnotation(value) ]
	}
	
	def public Annotation createStringAnnotation(String name, String value) {
		AnnotationsFactory::eINSTANCE.createStringAnnotation => [
			it.name = name
			it.value = value
		]
	}
		
		
	def public void copyAnnotations(Annotatable source, Annotatable target) {
	    source.annotations.forEach[
	        target.annotations += it.copy
	    ]
	}
	
	
	def public boolean hasAnnotation(Annotatable annotatable, String name) {
		!annotatable.annotations.nullOrEmpty && annotatable.annotations.filter[ it.name == name].size > 0
	}
}