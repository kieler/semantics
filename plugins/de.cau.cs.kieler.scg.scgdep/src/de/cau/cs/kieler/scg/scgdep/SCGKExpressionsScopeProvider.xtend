package de.cau.cs.kieler.scg.scgdep

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.scoping.KExpressionsScopeProvider
import java.util.ArrayList
import java.util.Collections
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.impl.SimpleScope

class SCGKExpressionsScopeProvider extends KExpressionsScopeProvider {
    private static var EObject parent;
    private static var Iterable<IEObjectDescription> elements;

    override getScope(EObject context, EReference reference) {
        //super.getScope(context, reference);
         new SimpleScope(elements);
    }

    def void setParent(EObject theParent) {
        parent = theParent;
        elements = new ArrayList<IEObjectDescription>();

        val valuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
        
        (elements as ArrayList<IEObjectDescription>).add(
            new EObjectDescription(QualifiedName.create('O'), 
                valuedObject, 
                Collections.EMPTY_MAP
            )
        )        
    }    
    
}