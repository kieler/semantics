/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.legacy.text.scoping

import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.legacy.sccharts.Binding
import de.cau.cs.kieler.sccharts.legacy.sccharts.CallNode
import de.cau.cs.kieler.sccharts.legacy.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.legacy.sccharts.Equation
import de.cau.cs.kieler.sccharts.legacy.sccharts.Node
import de.cau.cs.kieler.sccharts.legacy.sccharts.ReferenceNode
import de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.legacy.sccharts.Scope
import de.cau.cs.kieler.sccharts.legacy.sccharts.State
import de.cau.cs.kieler.sccharts.legacy.sccharts.Transition
import java.util.Collections
import java.util.HashSet
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.SimpleScope
import de.cau.cs.kieler.sccharts.legacy.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.KEffectsPackage
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.Assignment
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Declaration

/**
 * This class implements to scoping for referencedScope (used in KiCoUtil.parse()) and for binding (used in the sct Xtext editor).
 * 
 * @author ssm chsch cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 *
 */
class SctScopeProvider extends AbstractDeclarativeScopeProvider {

    private val static final SCChartsPackage pack = SCChartsPackage.eINSTANCE;

    @Inject
    SctQualifiedNameProvider nameProvider

    private def boolean isProxy(Object o) {
        return (o as EObject).eIsProxy()
    }
    
    /*
     * If the context is a ReferenceNode, return a list of all SCCharts (states) in the current
     * resourceSet (the project folder).
     * This method is only slightly modified from the already existing method for referencing sccharts.
     */
    public def IScope scope_referenceNode_referencedScope(EObject context, EReference reference) {
        val superScope = super.getScope(context.eContainer, reference)
        val res = context.eResource
        if (res != null) {
            val resSet = res.resourceSet
            if (resSet != null) {
                val rIterable = <Scope>newArrayList
                for (r : resSet.resources) {
                    val contentList = r.contents.filter(e|e instanceof State).toList
                    if (!contentList.nullOrEmpty) {
                        for (content : contentList) {
                            rIterable += content as Scope
                        }
                    }
                }
                return Scopes.scopeFor(rIterable, nameProvider, superScope);
            }
        }
        return IScope.NULLSCOPE;
    }
//    
//    /*
//     * 
//     */
//    public def IScope scope_callNode_callReference(EObject context, EReference reference) {
//        println("ganz neu: " + context)
//        val superScope = super.getScope(context.eContainer, reference)
//        val res = context.eResource
//        if (res != null) {
//            val resSet = res.resourceSet
//            if (resSet != null) {
//                val callRef = <DefineNode>newArrayList
//                for (r: resSet.resources) {
//                    val contentList = r.contents.filter(e|e instanceof DefineNode).toList
//                    if (!contentList.nullOrEmpty) {
//                        for (content: contentList) {
//                            callRef += content as DefineNode
//                        }
//                    }
//                }
//                return Scopes.scopeFor(callRef, nameProvider, superScope)
//            }
//        }
//        return IScope.NULLSCOPE
//    }
    
    /*
     * If an equation refers to an output of a node this method is called
     * If the context of the equation.node is a ReferenceNode, then return a list of 
     * all outputs of the referenced SCChart.
     * If it's a CallNode then return a list of all outputs of the called DefineNode.
     */
    public def IScope equation_ValuedObjectReferenceScope(EObject context, EReference reference) {
        var EObject theContext = context;
        val obj = theContext.eGet(pack.equation_Node, true)
        if (!isProxy(obj)) {
            // case of RefNode: get outputs of referencedScope (scchart)
            if (obj instanceof ReferenceNode) {
                var refNode = obj as ReferenceNode
                val voIterable = <ValuedObject>newArrayList
                refNode.referencedScope.declarations.forEach[
                    if (it.output) {
                        voIterable += valuedObjects
                    }
                ]
                return Scopes.scopeFor(voIterable)
            }
            // case of CallNode: get outputs of referenced DefineNode
            else if (obj instanceof CallNode) {
                var refNode = obj as CallNode
                val voIterable = <ValuedObject>newArrayList
                refNode.callReference.outputs.forEach[
                    voIterable += valuedObjects
                ]
                return Scopes.scopeFor(voIterable)
            }
        } else {
            return IScope.NULLSCOPE
        }
    }
    
    /*
     * This seems not to be the right position to find out all possible nodes for an equation
     * with a reference to a node and its according outputs.
     * The context is the super state, not the dataflow, and I didn't find a way yet how to get the 
     * current dataflow concurrency where the equation is modelled.
     * At this point it would only be possible to return a list of all nodes of all dataflows.
     * But only if the created nodeList would be returned correctly.
     * The nodeList is not empty, but when trying to return a scopeFor(nodeList), the scope is empty.
     * I dond't know why, because it works for valuedObjects.
     */
    public def IScope scope_Equation_node(EObject context, EReference reference) {
        val s = context as State
        val nodeList = <Node>newArrayList
        s.regions.filter(typeof(DataflowRegion)).forEach[
            nodeList += it.nodes.filter(typeof(ReferenceNode))
        ]
        
        val voIterable = <ValuedObject>newArrayList
        s.declarations.filter[it.output].forEach[
            voIterable += valuedObjects
        ]
//        return Scopes.scopeFor(nodeList)
        return null 
    }
    
    
    /*
     * Differ between ValuedObjectReferences depending on the context which they are called from.
     * Currently just needed for equations with a node reference and to determine the according outputs. 
     */
    public def IScope scope_ValuedObjectReference_valuedObject(EObject context, EReference reference) {
        if (context instanceof Equation) {
            return equation_ValuedObjectReferenceScope(context, reference)
        }
        return null;
    }
    
    public def IScope scope_Scope_referencedScope(EObject context, EReference reference) {
        val superScope = super.getScope(context.eContainer, reference)
        val res = context.eResource
        if (res != null) {
            val resSet = res.resourceSet
            if (resSet != null) {
                val rIterable = <Scope>newArrayList
                for (r : resSet.resources) {
                    val contentList = r.contents.filter(e|e instanceof State).toList
                    if (!contentList.nullOrEmpty) {
                        for (content : contentList) {
                            rIterable += content as Scope
                        }
                    }
                }
                return Scopes.scopeFor(rIterable, nameProvider, superScope);
            }
        }
        return IScope.NULLSCOPE;
    }

    public def IScope scope_Binding_formal(EObject context, EReference reference) {
        var EObject theContext = context;
        if (context instanceof Binding) {
            theContext = context.eContainer;
        }

        val obj = theContext.eGet(pack.getScope_ReferencedScope(), true);
        if (!isProxy(obj)) {
            val refScope = obj as Scope

            val voIterable = <ValuedObject>newArrayList
            refScope.declarations.forEach[voIterable += valuedObjects]

            return Scopes.scopeFor(voIterable);
        } else {
            return IScope.NULLSCOPE;
        }

    }

    public def IScope scope_Transition_targetState(Transition trans, EReference reference) {
        val l = <IEObjectDescription>newLinkedList
        val m = new HashSet<String>
        var String key = null
        val region = (trans.eContainer().eContainer()) as ControlflowRegion
        for (State s : region.states) {
            key = s.getId();
            if (m.contains(key)) {
                key = s.getId()
            }
            l.add(
                new EObjectDescription(QualifiedName.create(key), s,
                    Collections.<String, String>emptyMap()))
            m.add(key);
        }

        return new SimpleScope(l)
    }
    

    //
    // The following lines are a work-around for the railway project and borrowed from the new SCCharts 2.0 scope providers.
    // As the actual (old) scope provider resolves the declaration by itself (instead of using the declaration scope of
    // KEXT in the new version),  the already new kexpressions almost always 
    // use the delegate to the resource scope provider. This is incredibly slow.
    // The following methods are parts of the new KEXT scope provider which resolves these references directly.  
    //
    
    override IScope getScope(EObject context, EReference reference) {
        if (context instanceof ValuedObjectReference) {
            return getScopeForValuedObjectReference(context, reference)
        }  else if (context instanceof Assignment) {
            return getScopeForAssignment(context, reference)
        }
        
        else if (reference == KEffectsPackage.Literals.ASSIGNMENT__VALUED_OBJECT) {
            return getScopeForValuedObject(context, reference)
        } else if (reference == KEffectsPackage.Literals.EMISSION__VALUED_OBJECT) {
            return getScopeForValuedObject(context, reference)
        }
        
        var IScope scope = polymorphicFindScopeForReferenceName(context, reference);
        if (scope == null) {
            scope = polymorphicFindScopeForClassName(context, reference);
            if (scope == null) {
                scope = delegateGetScope(context, reference);
//                println("CTX: " + context.toString + " || REF: " + reference.toString)
            }
        }
        return scope;
    }    
    
    protected def IScope getScopeForAssignment(EObject context, EReference reference) {
        return context.getScopeHierarchical(reference)
    }
    
    protected def IScope getScopeForValuedObjectReference(EObject context, EReference reference) {
        if (reference.eContainer instanceof ValuedObjectReference) {
            val parentVOR = reference.eContainer as ValuedObjectReference
            val declaration = parentVOR.valuedObject.eContainer as Declaration
        } else if (context.eContainer instanceof ValuedObjectReference) {
            // The context is a subreference!
            var parentVO = context.eContainer as ValuedObjectReference
            return parentVO.getScopeForReferencedDeclarationFromSubReference(reference)
        } else if (context instanceof ValuedObjectReference) {
            if (context.eContainer instanceof Assignment) {
                // The context is a subreference inside of an assignment!
                if (context != (context.eContainer as Assignment).expression) {
                  return context.eContainer.getScopeForReferencedDeclarationFromAssignment(reference)
                }
            }
        }
        return context.getScopeHierarchical(reference)
    }
    
     protected def IScope getScopeForReferencedDeclarationFromAssignment(EObject context, EReference reference) {
        if (context instanceof Assignment) {
            if (context.valuedObject != null) {
                if (context.valuedObject.eContainer != null) {
                }
            }
        }
        return context.getScopeHierarchical(reference)      
    }
    
    protected def IScope getScopeForReferencedDeclarationFromSubReference(EObject context, EReference reference) {
        if (context instanceof ValuedObjectReference) {
            if (context.valuedObject != null) {
                if (context.eContainer != null) {
                    var parentVO = context as ValuedObjectReference
                    while(parentVO.eContainer instanceof ValuedObjectReference) {
                        parentVO = parentVO.eContainer as ValuedObjectReference
                    }
                }
            }
        }
        return context.getScopeHierarchical(reference)      
    }
    
    protected def IScope getScopeForValuedObject(EObject context, EReference reference) {
        return context.getScopeHierarchical(reference)
    }
    
    protected def IScope getScopeHierarchical(EObject context, EReference reference) {
        val candidates = <ValuedObject> newArrayList
        var declarationScope = context.nextDeclarationScope
        while (declarationScope != null) {
            for(declaration : declarationScope.declarations) {
                for(VO : declaration.valuedObjects) {
                    candidates += VO
                }
            }               
            declarationScope = declarationScope.nextDeclarationScope
        }
        return Scopes.scopeFor(candidates)
    }
    
    
    protected def Scope getNextDeclarationScope(EObject eObject) {
        var eO = eObject
        while(eO != null) {
            eO = eO.eContainer
            if (eO instanceof Scope) return eO 
        }
        return null
    }
    
}
