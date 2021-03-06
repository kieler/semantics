/*
 * generated by Xtext
 */
package de.cau.cs.kieler.kexpressions.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import de.cau.cs.kieler.kexpressions.Parameter
import org.eclipse.xtext.scoping.IScope

/**
 * @author ssm
 * @kieler.design 2017-07-05 proposed 
 * @kieler.rating 2017-07-05 proposed yellow
 */
class KExpressionsScopeProvider extends de.cau.cs.kieler.annotations.scoping.AnnotationsScopeProvider {

    override getScope(EObject context, EReference reference) {
        switch(context) {
            Parameter: return getScopeForParameter(context, reference)
        }
        
        return super.getScope(context, reference)
    }
    
    protected def IScope getScopeForParameter(Parameter parameter, EReference reference) {
        return super.getScope(parameter as EObject, reference)
    }

}
