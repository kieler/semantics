package de.cau.cs.kieler.scg.klighd

import de.cau.cs.kieler.core.kexpressions.scoping.KExpressionsScopeProvider
import de.cau.cs.kieler.scg.SCGraph
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import com.google.inject.Singleton

@Singleton
class SCGKExpressionsScopeProvider extends KExpressionsScopeProvider {

    private SCGraph parent;

    def void setParent(SCGraph theParent) {
        parent = theParent;
    }
    
    def IScope scope_ValuedObject(EObject context, EReference reference) {
        Scopes.scopeFor(parent.getValuedObjects())
    }

    def IScope scope_ValuedObjectReference_valuedObject(EObject context, EReference reference) {
        Scopes.scopeFor(parent.getValuedObjects())
    }

//    override IScope getScope(EObject context, EReference reference) {
//        if (parent != null){
//                var IScope scope = createHierarchicScope(parent);
//                return scope;
//        }
//        // this is likely to return the NULLSCOPE
//        return super.getScope(context, reference);
//    }

//    def Iterable<IEObjectDescription> getElements(EObject parent){
//        var ArrayList<IEObjectDescription> elements = new ArrayList<IEObjectDescription>();
//                if (parent != null && parent instanceof SCGraph) {
//                        var List<ValuedObject> valuedObjects = (parent as SCGraph).getValuedObjects();
//                        for (ValuedObject valuedObject : valuedObjects) {
//                                elements.add(new EObjectDescription(QualifiedName.create(
//                                        valuedObject.getName()), valuedObject, Collections.EMPTY_MAP));
//                        }
//                }
//                return elements;
//    }
//
//    def IScope createHierarchicScope(EObject child){
//        if(child.eContainer()!=null){
//                val IScope parentScope = createHierarchicScope(child.eContainer());
//                val SimpleScope scope = new SimpleScope(parentScope, this.getElements(child));
//                return scope;
//        }
//        else{
//                return new SimpleScope(this.getElements(child));
//        }
//    }
    
//    def IScope scope_SCGraph(EObject context, EReference reference) {
//        IScope.NULLSCOPE;
//    }
}