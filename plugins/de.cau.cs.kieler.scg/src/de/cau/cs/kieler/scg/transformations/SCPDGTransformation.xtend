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
import de.cau.cs.kieler.scg.AbsoluteWrite_Read
import de.cau.cs.kieler.scg.AbsoluteWrite_RelativeWrite
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
import de.cau.cs.kieler.scg.RelativeWrite_Read
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.Write_Write
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.sequentializer.AbstractSequentializer
import java.util.HashSet
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
    val breaks = <Depth, Set<Depth>>newHashMap()
    val nodes = <Node, Set<Node>>newHashMap()
    val keys = <Depth>newHashSet()
    val ticksToConvert = <Depth>newHashSet()

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

        //        scg.removeUnnecessaryDependencies
        return scg
    }

    def SCGraph transformSCGToSCPDG(SCGraph scg, KielerCompilerContext context) {

        if (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED) ||
            scg.hasAnnotation(ANNOTATION_SCPDGTRANSFORMATION)) {
            return scg
        }
        val oldSCGNodes = newHashSet()
        scg.nodes.forEach [ node |
            oldSCGNodes.add(node)
        ]
        
        
        
        val cfs = <ControlFlow>newHashSet;
        programEntry = (scg.nodes.head as Entry)

        cfs += (programEntry as Node).allNext

        cfs.convertTick((programEntry as Node), scg, context)

        while (!ticksToConvert.empty) {
            cfs.clear
            val tick = ticksToConvert.head
            scg.nodes.add(tick)
            scg.nodes.add(tick.surface)
            val depths = breaks.get(tick)
            ticksToConvert.remove(tick)
            depths.forEach [ node |
                cfs += node.next
            ]
            cfs.convertTick(tick, scg, context)
        }

        scg.nodes.forEach [ node |
            node.removeNext
        ]

        val depthsToDelete = newHashSet()

        keys.forEach [ key |
            breaks.get(key).forEach [ break |
                depthsToDelete += break
            ]
        ]

        depthsToDelete.forEach [ depth |
            scg.nodes.remove(depth.surface)
            scg.nodes.remove(depth)
        ]

        oldSCGNodes.forEach [ node |
            if (node != programEntry && node != programEntry.exit)
                scg.nodes.remove(node)
        ]

        scg => [
            annotations += createStringAnnotation(ANNOTATION_SCPDGTRANSFORMATION, "")
        ]

        scg
    }

    private def generateConditinalDependencys(SCGraph scg) {
        scg
    }

    private def Set<Node> clone(Set<Node> nodes) {
        val newNodes = <Node>newHashSet()
        val nodeMap = <Node, Node>newHashMap()
        nodes.forEach [ node |
            val Node newNode = (node.createNode as Node)
            if (newNode != null)
                newNodes += newNode
            nodeMap.put(node, newNode)
        ]

        nodes.forEach [ node |
            node.dependencies.forEach [ dependency |
                if (nodes.contains(dependency.target)) {
                    createDependency(dependency, nodeMap.get(node), nodeMap.get(dependency.target))
                }
            ]
        ]
        (newNodes as Set<Node>)
    }

    def private dispatch createDependency(AbsoluteWrite_Read absWR, Node root, Node targetNode) {
        ScgFactory::eINSTANCE.createAbsoluteWrite_Read => [
            target = targetNode
            root.dependencies.add(it)
        ]
    }

    def private dispatch createDependency(AbsoluteWrite_RelativeWrite absWrW, Node root, Node targetNode) {
        ScgFactory::eINSTANCE.createAbsoluteWrite_RelativeWrite => [
            target = targetNode
            root.dependencies.add(it)
        ]
    }

    def private dispatch createDependency(RelativeWrite_Read rWR, Node root, Node targetNode) {
        ScgFactory::eINSTANCE.createRelativeWrite_Read => [
            target = targetNode
            root.dependencies.add(it)
        ]
    }

    def private dispatch createDependency(Write_Write wW, Node root, Node targetNode) {
        ScgFactory::eINSTANCE.createWrite_Write => [
            target = targetNode
            root.dependencies.add(it)
        ]
    }

    def private dispatch createDependency(ControlDependency conDep, Node root, Node targetNode) {
        ScgFactory::eINSTANCE.createControlDependency => [
            target = targetNode
            root.dependencies.add(it)
        ]
    }

    private def Set<ControlFlow> convertTick(Set<ControlFlow> controlFlows, Node firstNode, SCGraph scg,
        KielerCompilerContext context) {

        val depths = new HashSet
        val nodes = new HashSet
        val depth = new HashSet
        while (!controlFlows.empty) {
            val cf = controlFlows.head
            val node = cf.target
            controlFlows.remove(cf)
            if (node instanceof Depth)
                depths += (node as Depth)
            if (node instanceof Surface)
                depths += (node as Surface).depth
            val cdTarget = node.transformSCPDG(controlFlows, scg, context)
            if ((cdTarget != null) && !(cdTarget instanceof Exit) && !(cdTarget instanceof Surface)) {
                nodes += (cdTarget as Node)

            }
        }

        keys.forEach [ keys |
            val break = breaks.get(keys)
            if (break.size == depths.size && depth.size == 0) {
                if (break.forall[dep|depths.contains(dep)]) {
                    depth.add(keys)
                }

            }
        ]
        if (depth.empty && !depths.empty) {
            val dep = ScgFactory::eINSTANCE.createDepth => [
                surface = ScgFactory::eINSTANCE.createSurface => []
            ]

            depth.add(dep)
            breaks.put(dep, depths)
            keys += dep
            ticksToConvert += dep
        }

        var Node tempTargetNode = null
        if (depth.empty) {
            tempTargetNode = programEntry.exit
        } else {
            tempTargetNode = depth.head.surface
        }

        val targetNode = tempTargetNode

        ScgFactory::eINSTANCE.createControlDependency => [
            target = targetNode
            firstNode.dependencies.add(it)
        ]

        this.nodes.put(firstNode, clone(nodes))

        val nodes2 = this.nodes.get(firstNode)

        nodes2.forEach [ node |
            ScgFactory::eINSTANCE.createControlDependency => [
                target = node
                firstNode.dependencies.add(it)
            ]
            ScgFactory::eINSTANCE.createControlDependency => [
                target = targetNode
                node.dependencies.add(it)
            ]
        ]

        nodes2.add(firstNode)
        nodes2.removeUnnecessaryDependencies

        nodes2.forEach [ node |
            scg.nodes.add(node)
        ]
        controlFlows
    }

    private def dispatch createNode(Assignment assignmentOld) {
        ScgFactory::eINSTANCE.createAssignment => [ newAssignment |
            assignmentOld.indices.forEach [ indic |
                newAssignment.indices.add(indic)
            ]
            newAssignment.assignment = assignmentOld.assignment
            newAssignment.isInitial = assignmentOld.isIsInitial
        ]
    }

    private def dispatch createNode(Conditional conditional) {
        ScgFactory::eINSTANCE.createConditional => [ newConditional |
            newConditional.condition = conditional.condition
        ]
    }

    private def dispatch transformSCPDG(Entry entry, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
        controlFlows += entry.allNext

        entry
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

        controlFlows += surface.allNext
        surface

    }

    private def dispatch transformSCPDG(Depth depth, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
        controlFlows += depth.allNext;
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

        null
    }

    private def dispatch Node transformSCPDG(Join join, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {
        controlFlows += join.allNext

        null
    }

    private def dispatch Node transformSCPDG(Conditional conditional, Set<ControlFlow> controlFlows, SCGraph scg,
        KielerCompilerContext context) {

        controlFlows += conditional.allNext

        conditional
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

    def private Set<Node> removeUnnecessaryDependencies(Set<Node> scg) {
        scg.forEach [ node |
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
