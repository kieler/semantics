package de.cau.cs.kieler.lustre.scoping

import de.cau.cs.kieler.lustre.lustre.LustrePackage
//import de.cau.cs.kieler.lustre.lustre.Package_Provided
//import de.cau.cs.kieler.lustre.lustre.Package_Provided_IO
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScope
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.lustre.lustre.PackBody
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceCall

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
                    declarations.addAll(superContext.input.parameter.map[vardecl])
                    declarations.addAll(superContext.output.parameter.map[vardecl])
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


//    override getScope(EObject context, EReference reference) {
////
////        // Scope provider for variable references inside a node
////        // Allows references to local variables and constants, inputs, outputs, and package variables and constants
////        if ((context instanceof VariableReference && reference == LustrePackage.Literals.VARIABLE_REFERENCE__VALUE) ||
////            context instanceof Equation && reference == LustrePackage.Literals.EQUATION__LEFT) {
////            val elementNode = EcoreUtil2.getContainerOfType(context, Node_Declaration)
////            val elementPackage = EcoreUtil2.getContainerOfType(context, Package_Declaration)
////            val candidates = new ArrayList<EObject>
////            candidates +=
////                elementNode.variables + elementNode.constants + elementNode.parameters + elementNode.returned +
////                    elementPackage.constants
////            return Scopes.scopeFor(candidates)
////        } 
//        
//        // Scope provider for parameters/returns inside a node header of a package header
//        // Allows references to the corresponding parameters/returns inside the actual node header
//        if (context instanceof Package_Provided_IO &&
//            reference == LustrePackage.Literals.PACKAGE_PROVIDED_IO__NAME) {
//            val providedElement = EcoreUtil2.getContainerOfType(context, Package_Provided)
//            if (providedElement.parameters.contains(context))
//                return Scopes.scopeFor(providedElement.name.parameters)
//            else
//                return Scopes.scopeFor(providedElement.name.returned)
//        }
//
//        return super.getScope(context, reference);
//    }

}