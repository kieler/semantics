package de.cau.cs.kieler.lustre.scoping

import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.lustre.PackBody
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 * @author cpa
 */
class LustreScopeProvider extends AbstractLustreScopeProvider {
    
    override getScope(EObject context, EReference reference) {
        
        switch(context) {
            ReferenceCall: return getScopeForNodeReference(context, reference)
        }
        
        return super.getScope(context, reference);
    }

    override IScope getScopeHierarchical(EObject context, EReference reference) {
        val candidates = <ValuedObject> newArrayList
        var superContext = context
        do {
            val declarations = <VariableDeclaration>newArrayList
            switch(superContext) {
                PackBody: declarations.addAll(superContext.constants)
                NodeDeclaration: {
                    declarations.addAll(superContext.input.parameter)
                    declarations.addAll(superContext.output.parameter)
                    declarations.addAll(superContext.constants)
                    declarations.addAll(superContext.variables.map[vardecl])
                }
            }
            for(declaration : declarations) {
                for(VO : declaration.valuedObjects) {
                    candidates += VO
                }
            }
            superContext = superContext.eContainer
        } while (superContext !== null)
        
        return Scopes.scopeFor(candidates)
    }
    
    def IScope getScopeForNodeReference(ReferenceCall context, EReference reference) {
        var EObject body = context
        while (body !== null) {
            if (body instanceof PackBody) {
                return Scopes.scopeFor(body.nodes.map[valuedObjects.head])
            }
            body = body.eContainer
        }
        return IScope.NULLSCOPE
    }
}