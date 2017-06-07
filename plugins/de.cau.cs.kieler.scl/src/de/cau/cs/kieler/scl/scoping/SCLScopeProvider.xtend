package de.cau.cs.kieler.scl.scoping

import com.google.common.collect.Iterators
import de.cau.cs.kieler.kexpressions.KExpressionsPackage
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclPackage
import de.cau.cs.kieler.scl.scl.Scope
import java.util.Collections
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.SimpleScope

class SCLScopeProvider extends AbstractDeclarativeScopeProvider {

    public override IScope getScope(EObject context, EReference reference) {
        switch (reference.EReferenceType) {
            case KExpressionsPackage.eINSTANCE.valuedObject:
                return new SimpleScope(voScope(context))
            case SclPackage.eINSTANCE.label:
                return new SimpleScope(context.labelScope)
            default:
                return IScope.NULLSCOPE
        }
    }

    def voScope(EObject context) {
        var parent = context;
        val vos = newLinkedList()
        while (parent != null) {
            if (parent instanceof Scope) {
                vos.addAll((parent as Scope).declarations.map[valuedObjects])
            }
            parent = parent.eContainer
        }
        return Iterators.concat(vos.map[
            it.iterator.map[
                new EObjectDescription(QualifiedName.create(it.name), it, Collections.<String, String>emptyMap()) as IEObjectDescription
            ]
        ]).toList
    }

    def labelScope(EObject context) {
        var program = context
        while (program != null) {
            if (program instanceof SCLProgram) {
                return (program as SCLProgram).eAllContents.filter(Label).map [
                    new EObjectDescription(QualifiedName.create(it.name), it, Collections.<String, String>emptyMap()) as IEObjectDescription
                ].toList
            }
            program = program.eContainer
        }
    }
}
