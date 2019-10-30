package de.cau.cs.kieler.lustre.scoping

import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.lustre.lustre.AState
import de.cau.cs.kieler.lustre.lustre.AnAction
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
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
            AnAction: return getScopeForAction(context, reference)
        }
        
        return super.getScope(context, reference);
    }

    override IScope getScopeHierarchical(EObject context, EReference reference) {
        val candidates = <ValuedObject> newArrayList
        var superContext = context
        do {
            val declarations = <VariableDeclaration>newArrayList
            switch(superContext) {
                LustreProgram: declarations.addAll(superContext.constants)
                NodeDeclaration: {
                    declarations.addAll(superContext.inputs)
                    declarations.addAll(superContext.outputs)
                    declarations.addAll(superContext.constants)
                    declarations.addAll(superContext.variables)
                }
                AState: {
                    declarations.addAll(superContext.constants)
                    declarations.addAll(superContext.variables)
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
        var EObject p = context
        while (p !== null) {
            if (p instanceof LustreProgram) {
                return Scopes.scopeFor(p.nodes.map[valuedObjects.head])
            }
            p = p.eContainer
        }
        return IScope.NULLSCOPE
    }
    
    def IScope getScopeForAction(AnAction context, EReference reference) {
        var EObject automaton = context
        while (automaton !== null) {
            if (automaton instanceof Automaton) {
                return Scopes.scopeFor(automaton.states.map[valuedObject])
            } 
            automaton = automaton.eContainer
        }
        return IScope.NULLSCOPE
    }
}