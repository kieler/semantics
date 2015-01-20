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
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
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
import de.cau.cs.kieler.sccharts.Sender
import de.cau.cs.kieler.sccharts.ReferencedNode
import de.cau.cs.kieler.sccharts.TestReferenceNode
import de.cau.cs.kieler.sccharts.Receiver
import de.cau.cs.kieler.sccharts.InputNode
import de.cau.cs.kieler.sccharts.OutputNode
import de.cau.cs.kieler.sccharts.DefineNode
import de.cau.cs.kieler.sccharts.CallNode
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.sccharts.Dataflow
import de.cau.cs.kieler.sccharts.DataflowFeature

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

    public def IScope scope_referencedNode_referencedScope(EObject context, EReference reference) {
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
    
    public def IScope scope_testReferenceNode_referencedScope(EObject context, EReference reference) {
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
 * maybe rewrite in case of the return of the parameters reference
 */
 
//    public def IScope scope_callNode_parameters(EObject context, EReference reference) {
//        return IScope.NULLSCOPE
//    }
    
//    public def IScope scope_callNode_parameters(EObject context, EReference reference) {
//        val superScope = super.getScope(context.eContainer, reference)
//        
//        val res = context.eResource
//        println("res: " + res)
//        if (res != null) {
//            val resSet = res.resourceSet
//            if (resSet != null) {
//                val rIterable = <Scope>newArrayList
//                for (r : resSet.resources) {
//                    val contentList = r.contents.filter(e|e instanceof Declaration).toList
//                    println("cL: " + contentList)
//                    if (!contentList.nullOrEmpty) {
//                        for (content : contentList) {
//                            if ((content as Declaration).input)
//                            rIterable += content as Scope
//                            //rIterable += content as Scope
//                        }
//                    }
//                }
//                return Scopes.scopeFor(rIterable, nameProvider, superScope);
//            }
//        }
//        return IScope.NULLSCOPE;
//        //return superScope
//    }
    
    public def IScope referencedNode_SenderScope(EObject context, EReference reference) {
        var EObject theContext = context;

        val obj = theContext.eGet(pack.referencedNode_ReferencedScope, true);
        if (!isProxy(obj)) {
            val refScope = obj as Scope

            val voIterable = <ValuedObject>newArrayList
            refScope.declarations.forEach[
            	if (it.output) voIterable += valuedObjects
            ]

            return Scopes.scopeFor(voIterable);
        } else {
            return IScope.NULLSCOPE;
        }
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
    public def IScope testReferenceNode_SenderScope(EObject context, EReference reference) {
        var EObject theContext = context;
        val obj = theContext.eGet(pack.testReferenceNode_ReferencedScope, true);
        if (!isProxy(obj)) {
            val refScope = obj as Scope
            
            val voIterable = <ValuedObject>newArrayList
            refScope.declarations.forEach[
                //if (it.output) voIterable += valuedObjects
                if (it.input) voIterable += valuedObjects
            ]
            
            return Scopes.scopeFor(voIterable);
        } else {
            return IScope.NULLSCOPE;
        }
    }
    public def IScope dataflowFeature_ValuedObjectReferenceScope(EObject context, EReference reference) {
        var EObject theContext = context;
        val obj = theContext.eGet(pack.dataflowFeature_Node, true)
        if (!isProxy(obj)) {
            // case of TRN: get outputs of referencedScope (scchart)
            if (obj instanceof TestReferenceNode) {
                var refNode = obj as TestReferenceNode
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
    
    public def IScope scope_ValuedObjectReference_valuedObject(EObject context, EReference reference) {
		if (context instanceof ReferencedNode) {
			return referencedNode_SenderScope(context, reference)
		} // neu else if fuer trNode
		else if (context instanceof TestReferenceNode) {
		    //return testReferenceNode_SenderScope(context, reference)
		} // DataflowFeature: direct modelling
		else if (context instanceof DataflowFeature) {
		    //val f = context as DataflowFeature
		    //val fnode = f.node
		    //println("df feature: " + (context as DataflowFeature).node)
		    return dataflowFeature_ValuedObjectReferenceScope(context, reference)
		    //return defineNode_ValuedObjectReferenceScope(context, reference)
		}
        return null;
    }
    
//    public def IScope scope_TestReceiver_valuedObject(EObject context, EReference reference) {
//        val superScope = super.getScope(context.eContainer, reference)
//        if (context instanceof TestReceiver) {
//            if ((context as TestReceiver).node instanceof TestReferenceNode) {
//                var EObject theContext = (context as TestReceiver).node as TestReferenceNode
//                val obj = theContext.eGet(pack.testReferenceNode_ReferencedScope, true)
//                if (!isProxy(obj)) {
//                    val refScope = obj as Scope
//                    val voIterable = <ValuedObject>newArrayList
//                    refScope.declarations.forEach[
//                        if (it.input) voIterable += valuedObjects
//                    ]
//                    return Scopes.scopeFor(voIterable)
//                }  else {
//                    return superScope
//                }
//            } else if ((context as TestReceiver).node instanceof OutputNode) {
//                if ((context as TestReceiver).sender instanceof TestReferenceNode) {
//                    var EObject theContext = (context as TestReceiver).sender as TestReferenceNode
//                    val obj = theContext.eGet(pack.testReferenceNode_ReferencedScope, true)
//                
//                    if (!isProxy(obj)) {
//                        val refScope = obj as Scope
//                        val voIterable = <ValuedObject>newArrayList
//                        refScope.declarations.forEach[
//                            if (it.output) voIterable += valuedObjects
//                        ]
//                        return Scopes.scopeFor(voIterable)
//                    } else {
//                        return superScope
//                    }
//                } else if ((context as TestReceiver).sender instanceof CallNode) {
//                    var EObject theContext = (context as TestReceiver).sender as CallNode
//                    val obj = theContext.eGet(pack.callNode_CallReference, true)
//                    val dn = obj as DefineNode
//                    val outs = <ValuedObject>newArrayList
//                    dn.outputs.forEach[ out|
//                        outs += out.valuedObjects
//                    ]
//                    return Scopes.scopeFor(outs)
//                }
//                 else {
//                    var EObject theContext = (context as TestReceiver).sender as DefineNode
//                    val obj = theContext.eGet(pack.defineNode_Outputs, true)
//                    
//                    val dn = theContext as DefineNode
//                    val outs = <ValuedObject>newArrayList
//                    dn.outputs.forEach[ out|
//                        outs += out.valuedObjects
//                    ]
//                    return Scopes.scopeFor(outs)
//                }
//            } else if ((context as TestReceiver).node instanceof CallNode) {
//                var EObject theContext = (context as TestReceiver).node as CallNode
//                //callReference (DefineNode)
//                val callRef = (theContext.eGet(pack.callNode_CallReference, true)) as DefineNode
//                //val dn = (callRef as DefineNode).eGet(pack.defineNode_Inputs, true)
//                val ins = <ValuedObject>newArrayList
//                callRef.inputs.forEach[ in|
//                    ins += in.valuedObjects
//                ]
//                
//                return Scopes.scopeFor(ins)
//                
//            } else if((context as TestReceiver).node instanceof DefineNode) {
//                var EObject theContext = (context as TestReceiver).node as DefineNode
//                val obj = theContext.eGet(pack.defineNode_Inputs, true)
//                val dn = theContext as DefineNode
//                val ins = <ValuedObject>newArrayList
////                println("dn: " + dn.inputs)
//                dn.inputs.forEach[ in|
////                    println("in: " + in.valuedObjects)
//                    ins += in.valuedObjects
//                ]
//                return Scopes.scopeFor(ins)
//            } else {
//                return superScope
//            }
//        }
//        return null
//    }
    
    public def IScope scope_Receiver_valuedObject(EObject context, EReference reference) {
    	val superScope = super.getScope(context.eContainer, reference)
        if (context instanceof Receiver) {
        	if ((context as Receiver).node instanceof ReferencedNode) {
	        	var EObject theContext = (context as Receiver).node as ReferencedNode
        		val obj = theContext.eGet(pack.referencedNode_ReferencedScope, true);
        		if (!isProxy(obj)) {
            		val refScope = obj as Scope

            		val voIterable = <ValuedObject>newArrayList
            		refScope.declarations.forEach[
            			if (it.input) voIterable += valuedObjects
            		]

            		return Scopes.scopeFor(voIterable);
        		} else {
            		return superScope;
        		}
        		// neu: else if mit TestReferenceNode: funktioniert fuer inputs
       		} else if ((context as Receiver).node instanceof TestReferenceNode) {
       		    var EObject theContext = (context as Receiver).node as TestReferenceNode
       		    val obj = theContext.eGet(pack.testReferenceNode_ReferencedScope, true);
       		    if(!isProxy(obj)) {
       		        val refScope = obj as Scope
       		        
       		        val voIterable = <ValuedObject>newArrayList
       		        refScope.declarations.forEach[
       		            if (it.input) voIterable += valuedObjects
       		        ]
       		        
       		        return Scopes.scopeFor(voIterable);
       		    } else {
       		        return superScope;
       		    }
       		} else {
       		    
       			return superScope
       		}
   		}
   		return null
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
