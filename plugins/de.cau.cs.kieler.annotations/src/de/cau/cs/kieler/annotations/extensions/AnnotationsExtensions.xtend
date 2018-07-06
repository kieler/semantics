package de.cau.cs.kieler.annotations.extensions

import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.annotations.CommentAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.TypedStringAnnotation
import java.util.Set

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.annotations.TagAnnotation
import de.cau.cs.kieler.annotations.IntAnnotation

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
        annotatable.annotations?.filter[ 
            it.name !== null && it.name.equals(name)
        ]
    } 
    
	def String getStringAnnotationValue(Annotatable annotatable, String name) {
		val annotation = annotatable.getAnnotation(name)
		if (annotation !== null) 
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
    
    def Annotation createTagAnnotation(String name) {
        AnnotationsFactory::eINSTANCE.createTagAnnotation => [
            it.name = name
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
		!annotatable.annotations.nullOrEmpty && !annotatable.annotations.filter[ it.name == name ].empty
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
    
    def asIntAnnotation(Annotation annotation) {
        annotation as IntAnnotation
    }
    
    def asAnnotatable(EObject eObject) {
        eObject as Annotatable
    }
    
    def addStringAnnotation(Annotatable annotatable, String name, String text) {
        annotatable.annotations += AnnotationsFactory.eINSTANCE.createStringAnnotation => [
            it.name = name
            values += text
        ]
    }
    
    def boolean hasEqualAnnotationValue(Annotatable source, String name, Annotatable target) {
        if (!source.hasAnnotation(name) || !target.hasAnnotation(name)) return false;
        val sourceAnnotation = source.getAnnotation(name)
        val targetAnnotation = target.getAnnotation(name)
        
        switch(sourceAnnotation) {
            TagAnnotation: if (targetAnnotation instanceof TagAnnotation) return true
            IntAnnotation: if (targetAnnotation instanceof IntAnnotation) 
                               if (sourceAnnotation.value == targetAnnotation.value) return true
            StringAnnotation: if (targetAnnotation instanceof StringAnnotation) {
                var i = 0 
                for (s : sourceAnnotation.values) {
                    if (targetAnnotation.values.size - 1 < i || !targetAnnotation.values.get(i).equals(s)) return false
                    i++ 
                }
                return true
            }
        }
        
        return false
    }
}