package de.cau.cs.kieler.annotations.extensions

import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.CommentAnnotation
import de.cau.cs.kieler.annotations.Pragma
import de.cau.cs.kieler.annotations.PragmaStringAnnotation
import de.cau.cs.kieler.annotations.Pragmatable
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.TypedStringAnnotation
import java.util.Set

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Annotations extensions
 * 
 * @author ssm
 */
class AnnotationsExtensions {
	
	def Annotation getAnnotation(Annotatable annotatable, String name) {
		annotatable.getAnnotations(name)?.head
	} 

    def Iterable<Annotation> getAnnotations(Annotatable annotatable, String name) {
        annotatable.annotations.filter[ it.name.equals(name) ]
    } 
    
    def Pragma getPragma(Pragmatable pragmatable, String name) {
        pragmatable.getPragmas(name)?.head
    } 

    def getPragmas(Pragmatable pragmatable, String name) {
        pragmatable.pragmas.filter[ it.name.equals(name) ]
    }     
    
    def getStringPragma(Pragmatable pragmatable, String name) {
        pragmatable.getPragmas(name).filter(StringPragma)
    }
	
	def String getStringAnnotationValue(Annotatable annotatable, String name) {
		val annotation = annotatable.getAnnotation(name)
		if (annotation != null) 
			(annotation as StringAnnotation).values.head
		else
			""
	}

	def Annotatable createStringAnnotation(Annotatable source, String name, String value) {
		source => [ annotations += name.createStringAnnotation(value) ]
	}
	
	def Annotation createStringAnnotation(String name, String value) {
		AnnotationsFactory::eINSTANCE.createStringAnnotation => [
			it.name = name
			it.values += value
		]
	}

    def Annotation createTypedStringAnnotation(String name, String type, String value) {
        AnnotationsFactory::eINSTANCE.createTypedStringAnnotation => [
            it.name = name
            it.type = type
            it.values += value
        ]
    }

	def void copyAnnotations(Annotatable source, Annotatable target) {
	    source.annotations.forEach[
	        target.annotations += it.copy
	    ]
	}

    def copyAnnotations(Annotatable source, Annotatable target, Set<String> filter) {
        source.annotations.filter[ filter.contains(it.name) ].forEach[
            target.annotations += it.copy
        ]
    }
	
	def boolean hasAnnotation(Annotatable annotatable, String name) {
		!annotatable.annotations.nullOrEmpty && !annotatable.annotations.filter[ it.name == name].empty
	}

    def boolean hasPragma(Annotatable annotatable, String name) {
        !annotatable.annotations.nullOrEmpty && !annotatable.annotations.filter(PragmaStringAnnotation).filter[ it.name == name ].empty
    }
	
    def void removeAnnotations(Annotatable annotatable, String name) {
        if (!annotatable.annotations.nullOrEmpty) {
            !annotatable.annotations.removeIf[ it.name.equals(name) ]
        }    
    }	
	
	def boolean hasCommentAnnotation(Annotatable annotatable) {
	   !annotatable.annotations.nullOrEmpty && !annotatable.annotations.filter(typeof(CommentAnnotation)).empty    
	}
	
	def getCommentAnnotations(Annotatable annotatable) {
	    annotatable.annotations.filter(CommentAnnotation)
	}
	
	
	def boolean hasTypedAnnotation(Annotatable annotatable) {
       !annotatable.annotations.nullOrEmpty && !annotatable.typedAnnotations.empty    
    }
    
    def getTypedAnnotations(Annotatable annotatable) {
        annotatable.annotations.filter(TypedStringAnnotation)
    }
    
    def getTypedAnnotations(Annotatable annotatable, String name) {
        annotatable.getAnnotations(name).filter(TypedStringAnnotation)
    }
    
    def asStringAnnotation(Annotation annotation) {
        annotation as StringAnnotation
    }
}