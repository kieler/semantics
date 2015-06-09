/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.sequentializer.AbstractSequentializer
import java.util.Set
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.ecore.EObject

/** 
 * 
 * @author ssm
 * @kieler.design 2015-05-03 proposed 
 * @kieler.rating 2015-05-03 proposed yellow
 */
class SCPDGTransformation extends Transformation {

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    @Inject
    extension SCGControlFlowExtensions

//    @Inject
//    extension SCGThreadExtensions
//
//    @Inject
//    extension KExpressionsExtension

    @Inject
    extension AnnotationsExtensions

    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    public static val ANNOTATION_SCPDGTRANSFORMATION = "scpdg"

    var Entry programEntry;
    val Set<Node> depthDone = newHashSet()
    val Set<Node> depthToDo = newHashSet()

    // -------------------------------------------------------------------------
    // -- Transformation method
    // -------------------------------------------------------------------------
    /** 
     * Generic model transformation interface.
     * 
     * @param eObject
     *          the root element of the input model
     * @return Returns the root element of the transformed model.
     */
    override transform(EObject eObject, KielerCompilerContext context) {
        val SCGraph scg = transformSCGToSCPDG(eObject as SCGraph, context)
        //scg.removeUnnecessaryDependencies
        return scg
    }

    def SCGraph transformSCGToSCPDG(SCGraph scg, KielerCompilerContext context) {

        if (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED) ||
            scg.hasAnnotation(ANNOTATION_SCPDGTRANSFORMATION)) {
            return scg
        }

        val cfs = <ControlFlow>newHashSet;
        programEntry = (scg.nodes.head as Entry)

       
        programEntry.transformSCPDG(cfs, scg, context)
        
        while(!depthToDo.empty){
            val depth = depthToDo.head
            depthDone += depth
            depthToDo.remove(depth)
            depth.transformSCPDG(cfs, scg, context)
        }

//        cfs.clear
//
//        if (hasSurface) {
//            scg.nodes.forEach [ node |
//                if (node instanceof Depth && node != dummyDepth) {
//                    cfs += (node as Depth).next
//                    unusedDepth.add(node)
//                }
//            ]
//
//            dummyDepth.transformSCPDG(cfs, scg, context)
//        }


        scg => [
            annotations += createStringAnnotation(ANNOTATION_SCPDGTRANSFORMATION, "")
        ]

        scg
    }

    private def Set<Node> getNextControlFlowNode(Node node) {
        val Set<Node> ret = newHashSet()
        val next = node.nextNode
        if (next == null) {

            //System.out.println(node.class.simpleName)
            return ret
        }
        next.forEach [ nextNode |
            if (nextNode instanceof Surface) {
                ret += nextNode
            } else if (nextNode instanceof Depth) {
                ret += nextNode
            } else if (nextNode instanceof Join) {
                ret += nextNode
            } else if (nextNode == programEntry.exit) {
                ret += (programEntry.exit as Node)
            } else {
                ret.addAll(nextNode.nextControlFlowNode)
            }
            
        ]
        return ret
    }

    private def Set<Node> nextNode(Node node) {
        if (node instanceof Entry) {
            return newHashSet((node as Entry).next.target)
        }
        if (node instanceof Depth) {
            return newHashSet((node as Depth).next.target)
        }
        if (node instanceof Exit) {
            return newHashSet((node as Exit).next.target)
        }
        if (node instanceof Assignment) {
            return newHashSet((node as Assignment).next.target)
        }
        if (node instanceof Fork) {
            val Set<Node> ret = newHashSet()
                (node as Fork).next.forEach[cf|
                    ret += cf.target
                ]
            return ret
        }
        if (node instanceof Join) {
            return newHashSet((node as Join).next.target)
        }
        if (node instanceof Conditional){
            val ret = newHashSet;
            ret += node.^else.target
            ret += node.then.target
            return ret
        }
        return null
    }

    private def dispatch transformSCPDG(Entry entry, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
        controlFlows += entry.allNext

        while (!controlFlows.empty) {
            val cf = controlFlows.head
            val node = cf.target
            controlFlows.remove(cf)

            val cdTarget = node.transformSCPDG(controlFlows, scg, context)

            if ((cdTarget != null) && !(cdTarget instanceof Exit)) {
                ScgFactory::eINSTANCE.createControlDependency => [
                    target = cdTarget as Node
                    entry.dependencies += it
                ]
                (cdTarget as Node).nextControlFlowNode.forEach[target|
                ScgFactory::eINSTANCE.createControlDependency => [
                    val Node cfnode = target
                    setTarget(cfnode);
                    (cdTarget as Node).dependencies += it
                ]
                
                ]
            }

            node.removeNext

        }
        entry.next = null
    }

    private def removeNext(Node node) {

        if (node instanceof Entry) {
            (node as Entry).next = null
        }
        if (node instanceof Depth) {
            (node as Depth).next = null
        }
        if (node instanceof Exit) {
            (node as Exit).next = null
        }
        if (node instanceof Assignment) {
            (node as Assignment).next = null
        }
        if (node instanceof Join) {
            (node as Join).next = null
        }
    }

    private def dispatch transformSCPDG(Surface surface, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
        if(!depthDone.contains(surface.depth)){
            depthToDo.add(surface.depth)
        }
       
        surface

    }

    private def dispatch transformSCPDG(Depth depth, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
        controlFlows += depth.allNext;

        while (!controlFlows.empty) {
            val cf = controlFlows.head
            val node = cf.target
            controlFlows.remove(cf)

            val cdTarget = node.transformSCPDG(controlFlows, scg, context)

            if ((cdTarget != null) && !(cdTarget instanceof Exit) && !(cdTarget instanceof Depth)) {
                ScgFactory::eINSTANCE.createControlDependency => [
                    target = cdTarget as Node
                    depth.dependencies += it
                ]
                (cdTarget as Node).nextControlFlowNode.forEach[target|
                ScgFactory::eINSTANCE.createControlDependency => [
                    val Node cfnode = target
                    setTarget(cfnode);
                    (cdTarget as Node).dependencies += it
                ]
                
                ]
            }

            node.removeNext

        }
        depth.removeNext
    }

    private def dispatch Node transformSCPDG(Exit exit, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
        controlFlows += exit.allNext
        if (exit.entry != programEntry) {
            scg.nodes.remove(exit)
            return null
        }
        exit
    }
    
    private def dispatch Node transformSCPDG(Conditional cond, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
            controlFlows += cond.allNext
            
            cond.^else.target.allNext.forEach[cf|
                //TODO create else Dependencies
            ]            
            cond
            
        }

    private def dispatch Node transformSCPDG(Assignment assignment, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
        controlFlows += assignment.allNext
        assignment
    }

    private def dispatch Node transformSCPDG(Fork fork, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
        fork.allNext.map[target].forEach[controlFlows += allNext]
        fork.allNext.map[target].forEach [ e |
            (e as Entry).next = null
            scg.nodes.remove(e)
        ]

        //fork.next.clear
        scg.nodes.remove(fork)
        null
    }

    private def dispatch Node transformSCPDG(Join join, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
        controlFlows += join.allNext

        //join.next = null    	
        scg.nodes.remove(join)
        null
    }

    def private boolean existsNonTrivialDependency(Node root, Node target) {
        val dependend = new BasicEList
        root.dependencies.forEach [ depend |
            if (target != depend.target)
                dependend.add(depend.target)
        ]

        while (!dependend.empty) {
            val node = dependend.head
            if (!node.dependencies.forall [ dependency |
                dependend.add(dependency.target)
                dependency.target != target
            ]) {
                return true
            }
            dependend.remove(node)
        }
        false
    }

    def private SCGraph removeUnnecessaryDependencies(SCGraph scg) {
        scg.nodes.forEach [ node |
            node.removeUnnecessaryDependencies
        ]

        return scg
    }

    def private removeUnnecessaryDependencies(Node node) {
        val unnecessaryDependencies = new BasicEList
        node.dependencies.forEach [ dependcy |
            if (dependcy instanceof ControlDependency) {
                if (!node.dependencies.forall [ depend |
                    if (depend != dependcy && depend.target == dependcy.target) {

                        return false

                    }
                    true
                ]) {

                    unnecessaryDependencies.add(dependcy)
                }

                if (existsNonTrivialDependency(node, dependcy.target)) {

                    unnecessaryDependencies.add(dependcy)
                }
            }
        ]

        unnecessaryDependencies.forEach [ dependency |
            node.dependencies.remove(dependency)
        ]
    }

}
