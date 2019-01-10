package de.cau.cs.kieler.lustre.scoping

import de.cau.cs.kieler.lustre.lustre.LustrePackage
//import de.cau.cs.kieler.lustre.lustre.Package_Provided
//import de.cau.cs.kieler.lustre.lustre.Package_Provided_IO
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
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