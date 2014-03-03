package de.cau.cs.kieler.core.annotations.extensions

import de.cau.cs.kieler.core.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.annotations.Annotation

class AnnotationsExtensions {
	
	def public Annotation add(Annotation annotation, String name, String value) {
		annotation => [ annotations += name.createStringAnnotation(value) ]
	}
	
	def public Annotation createStringAnnotation(String name, String value) {
		AnnotationsFactory::eINSTANCE.createStringAnnotation => [
			it.name = name
			it.value = value
		]
	}
	
}