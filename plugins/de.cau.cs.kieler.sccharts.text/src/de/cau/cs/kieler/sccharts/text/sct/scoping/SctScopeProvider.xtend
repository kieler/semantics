/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.text.sct.scoping

import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.Binding
import de.cau.cs.kieler.sccharts.CallNode
import de.cau.cs.kieler.sccharts.Dataflow
import de.cau.cs.kieler.sccharts.DataflowFeature
import de.cau.cs.kieler.sccharts.DefineNode
import de.cau.cs.kieler.sccharts.Node
import de.cau.cs.kieler.sccharts.ReferenceNode
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.TestReferenceNode
import de.cau.cs.kieler.sccharts.Transition
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
    
    /*
     * die folgenden beiden Methoden dienen zur Anzeige aller möglichen valuedObjects
     * in einer Datenflussumgebung und nochmals explizit für DefineNodes
     * Das muss aber nochmals überarbeitet werden, da nicht alles korrekt erfasst wird.
     */
    
//    public def IScope defineNode_ValuedObjectReferenceScope(EObject context, EReference reference) {
//        if (context instanceof DefineNode) {
//            val superScope = super.getScope(context.eContainer, reference)
//            
//            println("NOCHMAL DefineNode")
//            println("dn.eC: " + (context as DefineNode).eContainer) // = dataflow
//            println("df.ec: " + ((context as DefineNode).eContainer as Dataflow).eContainer)
//            
//            val voIterable = <ValuedObject>newArrayList
//            val dn = context as DefineNode
//            dn.inputs.forEach[
//                if (it.input){
//                    voIterable += valuedObjects
//                }
//            ]
//            val df = dn.eContainer as Dataflow
//            df.declarations.forEach[
//                if (it.input) {
//                    voIterable += valuedObjects
//                }
//            ]
//            
//            return Scopes.scopeFor(voIterable, superScope)
//        }
//        return IScope.NULLSCOPE
//    }
//    
//    public def IScope dataflow_ValuedObjectReferenceScope(EObject context, EReference reference) {
//        //var EObject theContext = context;
//        //val obj = theContext
//        if (context instanceof Dataflow) {
//            val df = context as Dataflow
////            println("df: " + df + " ref: " + reference)
////            println("df.trn: " + df.nodes.filter(e|e instanceof TestReferenceNode))
//            val superScope = super.getScope(context.eContainer, reference)
////            println("df_vor_scope")
//            val res = context.eResource
////            println("context: " + context)
//            
//            val trns = df.nodes.filter(e|e instanceof TestReferenceNode)
//            val voIterable = <ValuedObject>newArrayList
//            //add local output vo's
//            df.declarations.forEach[
//                if (it.input) {
//                    voIterable += valuedObjects
//                }
//            ]
//            //add global output co's
////            println("df.eC: " + df.eContainer)
//            (df.eContainer as State).declarations.forEach[
//                if (it.input) {
//                    voIterable += valuedObjects
//                }
//            ]
//            for (trn: trns) {
//                (trn as TestReferenceNode).referencedScope.declarations.forEach[
//                    if (it.output) {
////                        println("output: " + it)
//                        voIterable += valuedObjects
////                        println("voList: " + voIterable)
//                    }
//                ]
//            }
//            return Scopes.scopeFor(voIterable)
//            //return IScope.NULLSCOPE;
//            //return superScope
//        } else {
//            return IScope.NULLSCOPE;
//        }
//    }

// funzt wie bei der referencedNode
            /*was ist hier mit?*/
//    public def IScope referenceNode_SenderScope(EObject context, EReference reference) {
//        var EObject theContext = context;
//        val obj = theContext.eGet(pack.referenceNode_ReferencedScope, true);
//        if (!isProxy(obj)) {
//            val refScope = obj as Scope
//            
//            val voIterable = <ValuedObject>newArrayList
//            refScope.declarations.forEach[
//                //if (it.output) voIterable += valuedObjects
//                if (it.input) voIterable += valuedObjects
//            ]
//            
//            return Scopes.scopeFor(voIterable);
//        } else {
//            return IScope.NULLSCOPE;
//        }
//    }
    
    
    
    public def IScope dataflowFeature_ValuedObjectReferenceScope(EObject context, EReference reference) {
        var EObject theContext = context;
        val obj = theContext.eGet(pack.dataflowFeature_Node, true)
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
    
//    public def IScope scope_DataflowFeature_node(EObject context, EReference reference) {
//        
//        println("test " + context)
//        val s = context as State
//        val d = s.concurrencies.filter(typeof(Dataflow)).toList
//        val nodeList = <Node>newArrayList
//        d.forEach[
//            nodeList += it.nodes.filter(typeof(DefineNode))
//            nodeList += it.nodes.filter(typeof(TestReferenceNode))
//        ] 
//        println("nl: " + nodeList)
//        
//        return Scopes.scopeFor(nodeList)
//    }
    
    
    public def IScope scope_ValuedObjectReference_valuedObject(EObject context, EReference reference) {
//		if (context instanceof ReferenceNode) {
//		    //return testReferenceNode_SenderScope(context, reference)
//		} // DataflowFeature: direct modelling
//		else if (context instanceof Dataflow) {
//		    println("DF: " + context + ", " + reference)
//		    var df = context as Dataflow
//		    //println("dfn: " + df.nodes.filter(e|e instanceof DefineNode))
////		    println("con: " + context.eContainer)
//		    val s = context.eContainer as State
////		    println(s.getScope(reference).allElements)
//		    //return dataflow_ValuedObjectScope(context, reference)
//		}
        if (context instanceof DataflowFeature) {
            return dataflowFeature_ValuedObjectReferenceScope(context, reference)
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
        val region = (trans.eContainer().eContainer()) as Region
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
}
