/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.circuit

import com.google.inject.Inject
import de.cau.cs.kieler.circuit.Actor

import de.cau.cs.kieler.circuit.CircuitFactory
import de.cau.cs.kieler.core.kexpressions.BoolValue
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.circuit.features.CircuitFeatures
import java.util.HashMap
import java.util.LinkedList
import de.cau.cs.kieler.circuit.properties.IActorTypeProvider

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.circuit.properties.IPortTypeProvider
import de.cau.cs.kieler.circuit.properties.ILinkTypeProvider

/**
 * @author fry
 * 
 * Transformation from SSA SCG into Circuit.
 * Follows the control flow of the SCG.
 */
class SSA_SCG2CircuitTransformation extends AbstractProductionTransformation implements Traceable, IActorTypeProvider, IPortTypeProvider, ILinkTypeProvider {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return CircuitTransformation::SCG2CIRCUIT_ID
    }

    override getName() {
        return CircuitTransformation::SCG2CIRCUIT_NAME
    }

    override getProducedFeatureId() {
        return CircuitFeatures::CIRCUIT_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(CircuitFeatures::SCG2SSASCG_ID)
    }

    // -------------------------------------------------------------------------
    // --                             INJECTIONS                              --
    // -------------------------------------------------------------------------
    @Inject
    extension KEffectsSerializeExtensions

    @Inject
    LinkCreator linkCreator

    @Inject
    CircuitInitialization circuitInitialization

    // -------------------------------------------------------------------------
    // --                             LISTS/MAPS                              --
    // -------------------------------------------------------------------------
    protected var KielerCompilerContext compilerContext

    // Stores names of all variables which have already been created by a assignment node transformation.
    // This can happen if expressions are transformed.
    val LinkedList<String> assignmentActor = new LinkedList<String>

    // Stores all valuedObject which shall be linked to one specific named wire. 
    val voExpressions = new HashMap<String, ValuedObject>

    // -------------------------------------------------------------------------
    // --                          Transformation Start                       --
    // -------------------------------------------------------------------------
    def transform(SCGraph scg, KielerCompilerContext context) {

        assignmentActor.clear
        voExpressions.clear

        // this map stores SSA variables of input output variables and their highest version number
        // only interesting for linkCreator 
        val inputOutputMap = context.compilationResult.getAuxiliaryData(SSAMapData).head.inputOutputMap

        // -------------------------------------------------------
        // --              Create Circuit Regions               --
        // -------------------------------------------------------
        /**
         * Root object which will contain the circuit:
         * 
         * - In/Output nodes for each input and output
         * - ProgramLogic region for the program's logic
         * - Initialization region for input output registers and reset logic
         */
        val newCircuit = CircuitFactory::eINSTANCE.createActor
        newCircuit.type = IActorTypeProvider.CIRCUIT_REGION
        newCircuit.name = scg.label

        // Tell KITT that this is not an in-place transformation from here on.
        creationalTransformation(scg, newCircuit)
        newCircuit.trace(scg)

        val logicRegion = CircuitFactory::eINSTANCE.createActor.trace(scg)
        logicRegion.type = IActorTypeProvider.CIRCUIT_REGION
        logicRegion.name = "Program Logic"
        newCircuit.innerActors += logicRegion

        val initializationRegion = CircuitFactory::eINSTANCE.createActor
        initializationRegion.type = IActorTypeProvider.CIRCUIT_REGION
        initializationRegion.name = "Circuit Initialization"
        newCircuit.innerActors += initializationRegion

        // -------------------------------------------------------
        // --              Initialize Circuit Regions           --
        // -------------------------------------------------------
        // filter all input/output declarations to initialize the circuit
        val inputsAndOutputs = scg.declarations.filter[isInput || isOutput].toList

        // initialize circuit creates all inputs/outputs and a tick and reset input
        circuitInitialization.initialize(inputsAndOutputs, initializationRegion, logicRegion, newCircuit)

        // -------------------------------------------------------
        // --              Transform SSA SCG Nodes              --
        // -------------------------------------------------------
        // create actors of the circuit. chose entry node of SCG as starting point.
        val entry = scg.eAllContents.filter(Entry).head
        transformNodesToActors(entry.next.target, logicRegion)

        // -------------------------------------------------------
        // --              Create Links                         --
        // -------------------------------------------------------
        // create links for each region of the circuit
        // this has to be done step by step..... otherwise wrong ports are connected
        linkCreator.circuitRegion(newCircuit)
        linkCreator.logicRegion(logicRegion, inputOutputMap)
        linkCreator.initRegion(initializationRegion)

        // return the circuit
        newCircuit

    }

    /**
     * Follow the control flow of the SSA SCG and check the type of the nodes.
     * 
     * - for assignment nodes call transformAssignemnt and check the next node for its type
     * - for conditional nodes call transformConditionalNodes and let this function call 
     *   transformNodesToActors if the control flow is unique again
     */
    def void transformNodesToActors(Node n, Actor logic) {
        if (!(n instanceof Exit)) {
            if (n instanceof Assignment) {
                transformAssignment(n, logic)
                transformNodesToActors(n.next.target, logic)
            } else if (n instanceof Conditional) {
                transformNodesToActors(transformConditionalNodes(n, n.then.target, n.^else.target, logic), logic)
            }
        }
    }

    /**
     * Creates a MUX for each Assignment node on the "else"-branch. This MUX has the condition as selector port.
     * The assignment of the "else"-branch is input for the false case of the condition. (port name: In_0)
     * The assignment on the then branch is input for the true case of the condition. (port name: In_1)
     * 
     * In case of a conditional node on the "then"-branch: first transform its assignment nodes before coming back to its "root"
     */
    def Node transformConditionalNodes(Conditional source, Node thenNode, Node elseNode, Actor logic) {
        checkForVOassignments(source.condition)

        // on the "else"-branch should only be assignment nodes. If this is not the case something went wrong before..
        if (elseNode instanceof Assignment) {
            if (thenNode instanceof Conditional) {

                transformConditionalNodes(source,
                    transformConditionalNodes(thenNode, thenNode.then.target, thenNode.^else.target, logic),
                    elseNode.next.target, logic)
            } else if (thenNode instanceof Assignment) {

                // --           Create new MUX           --
                val newMUX = CircuitFactory::eINSTANCE.createActor.trace(source, thenNode, thenNode.valuedObject,
                    thenNode.assignment)
                newMUX.type = IActorTypeProvider.MUX
                newMUX.name = thenNode.valuedObject.name

                // add MUX to logic region
                logic.innerActors += newMUX

                val truePort = CircuitFactory::eINSTANCE.createPort.trace(thenNode.assignment)
                val falsePort = CircuitFactory::eINSTANCE.createPort // no tracing, because input happens out of nowhere
                val selectPort = CircuitFactory::eINSTANCE.createPort.trace(source)
                val outputPort = CircuitFactory::eINSTANCE.createPort.trace(thenNode, thenNode.valuedObject)

                newMUX.ports.add(truePort)
                newMUX.ports.add(falsePort)
                newMUX.ports.add(selectPort)
                newMUX.ports.add(outputPort)

                truePort.type = IPortTypeProvider.SEL_TRUE_INPUT
                falsePort.type = IPortTypeProvider.SEL_FALSE_INPUT
                selectPort.type = IPortTypeProvider.SELECTION
                outputPort.type = IPortTypeProvider.OUT

                outputPort.name = thenNode.valuedObject.name
                selectPort.name = source.condition.serialize.toString

                // --           handle input of true port: source is then-branch           --
                // create constant 0 and 1 or take the whole expression as input for the true case of the condition
                // if an expression is assigned: call transformExpression to create all necessary gates
                if (thenNode.assignment.serialize.toString == "true") {
                    truePort.name = IActorTypeProvider.VCC + newMUX.name
                    circuitInitialization.createConstantOne(logic, truePort.name, thenNode)
                } else if (thenNode.assignment.serialize.toString == "false") {
                    truePort.name = IActorTypeProvider.GND + newMUX.name
                    circuitInitialization.createConstantZero(logic, truePort.name, thenNode)
                } else {
                    val exp = thenNode.assignment
                    if (exp instanceof ValuedObjectReference) {
                        voExpressions.put(thenNode.valuedObject.name, exp.valuedObject)

                    } else {
                        checkForVOassignments(thenNode.assignment)
                        truePort.name = thenNode.assignment.serialize.toString
                        transformExpressions(thenNode.assignment, logic, thenNode)
                    }
                }

                // --           handle input of false port: source is else-branch           --
                falsePort.name = elseNode.assignment.serialize.toString

                // e.g. O_1 = pre(O)
                if (!(elseNode.assignment instanceof ValuedObjectReference)) {
                    transformExpressions(elseNode.assignment, logic, elseNode)
                }

                // call this method again if the target of then- and else-branch is not the same
                if (!(thenNode.next.target == elseNode.next.target)) {
                    transformConditionalNodes(source, thenNode.next.target, elseNode.next.target, logic)
                } else {
                    return thenNode.next.target
                }

            }
        } else {
            throw new IllegalArgumentException(
                "No assignment node on else-branch! Node string is: " + elseNode.toString);
        }
    }

    /**
     * This method receives only assignments with guards on their left sides. 
     * 
     * E.g. g3 = !(g1 && !A)
     * In this case transformAssignment should create a NOT gate with name g3,
     * one input port named g1 && !A and one output port named g3
     * 
     */
    def transformAssignment(Assignment assignment, Actor logic) {

        // Get the right side of assignment. 
        val expr = assignment.assignment

        // specify which type of logical gate the actor should be
        if (expr instanceof OperatorExpression) {

            // Create actor for guard gX
            var guardname = assignment.valuedObject.name
            val actor = CircuitFactory::eINSTANCE.createActor.trace(assignment, assignment.valuedObject, expr)
            actor.name = guardname
            assignmentActor.add(actor.name)
            // Create output port of guard actor gX
            val outputPort = CircuitFactory::eINSTANCE.createPort.trace(assignment, assignment.valuedObject, expr)
            outputPort.type = IPortTypeProvider.OUT
            outputPort.name = guardname
            actor.ports += outputPort

            switch (expr.operator) {
                case LOGICAL_AND:
                    actor.type = IActorTypeProvider.AND
                case LOGICAL_OR:
                    actor.type = IActorTypeProvider.OR
                case NOT:
                    actor.type = IActorTypeProvider.NOT
                case PRE: {
                    actor.type = IActorTypeProvider.REG
                    addRegisterPorts(actor)
                }
                default: {
                    System.out.println("found unknown SCG OperatorExpression: " + expr.getOperator.getName)
                }
            }

            // Group all logic gates which are created from the expressions in one region.
            val actorRegion = CircuitFactory::eINSTANCE.createActor.trace(assignment)
            actorRegion.type = IActorTypeProvider.GUARD_REGION
            actorRegion.innerActors += actor
            actorRegion.name = guardname
            logic.innerActors += actorRegion

            // the created actor gate gX gets an input port for each subExpression
            // and for each subExpression is transformed into gates with method transformExpressions
            for (Expression subexpr : expr.subExpressions) {
                val inputPort = CircuitFactory::eINSTANCE.createPort.trace(subexpr)
                actor.ports += inputPort
                inputPort.type = IPortTypeProvider.IN

                if (!(expr.operator.getName == "PRE")) {
                    checkForVOassignments(subexpr) // this replaces all variables with different names but same meanings (e.g. g0 and _GO) by the same variable
                    transformExpressions(subexpr, actorRegion, assignment)

                }

                inputPort.name = subexpr.serialize.toString
            }
        }


        /* Searches for Assignments with ValuedObjectReferences as Expressions
         * e.g. g0 = _GO 
         * 
         * should solve copy propagation problems like gXb = gX
         * 
         * this is a problem because there is no gate for renaming a wire.. so all equivalent names for wires are stored in
         * list voExpressions. This is working as long as subsequently only the key is used. this key will then be replaced by its value
         * in all subsequent assignment nodes.
         * 
         * g0 = _GO is an exception. Key and value are interchanged. 
         * This is done because in the simulation is only g0 present and not _GO.... Maybe this changes if C Code generation is changed.
         * 
         * 
         * */
        else if (expr instanceof ValuedObjectReference) {
            if (assignment.valuedObject.name == "g0") {
                voExpressions.put(expr.valuedObject.name, assignment.valuedObject)
            } else {
                voExpressions.put(assignment.valuedObject.name, expr.valuedObject)
            }
        }

    }

    /**
     * Replaces all variables which have different names but the same meaning with the same variable name.
     * This is necessary because the ports need to have the same names to create links.
     */
    def checkForVOassignments(Expression expr) {
        if (expr instanceof ValuedObjectReference) {
            val name = expr.valuedObject.name
            if (voExpressions.containsKey(name)) {
                expr.valuedObject = voExpressions.get(name)

            }
        } else {
            val vos = expr.eAllContents.filter(ValuedObjectReference).toList

            for (vo : vos) {
                val name2 = vo.valuedObject.name
                if (voExpressions.containsKey(name2)) {
                    vo.valuedObject = voExpressions.get(name2)
                }
            }
        }
    }

    /**
     * Transforms right sides of assignment nodes.
     * 
     */
    def void transformExpressions(Expression expr, Actor logic, Assignment originalNode) {

        // has to be checked due to recursion
        if (expr instanceof OperatorExpression) {

            // check if this actor already exists
            if (!assignmentActor.contains(expr.serialize.toString)) {
                // create actor for expression
                val actor = CircuitFactory::eINSTANCE.createActor.trace(originalNode, expr)
                actor.name = expr.serialize.toString
                logic.innerActors += actor
                assignmentActor.add(actor.name)

                // create output port for actor
                val p = CircuitFactory::eINSTANCE.createPort.trace(expr)
                p.type = "Out"
                p.name = expr.serialize.toString
                actor.ports += p

                // specify actor type
                switch (expr.operator) {
                    case LOGICAL_AND:
                        actor.type = IActorTypeProvider.AND
                    case LOGICAL_OR:
                        actor.type = IActorTypeProvider.OR
                    case NOT:
                        actor.type = IActorTypeProvider.NOT
                    case PRE: {
                        actor.type = IActorTypeProvider.REG
                        addRegisterPorts(actor)
                    }
                    default: {
                        System.out.println("found unknown SCG OperatorExpression: " + expr.getOperator.getName)
                    }
                }

                // the created actor needs an input port for each subexpression
                // and the subexpressions are transformed, too.
                for (Expression subExpr : expr.subExpressions) {
                    val port = CircuitFactory::eINSTANCE.createPort.trace(subExpr)
                    actor.ports += port
                    port.type = IPortTypeProvider.IN
                    port.name = subExpr.serialize.toString

                    if (subExpr instanceof OperatorExpression) {
                        transformExpressions(subExpr, logic, originalNode)
                    } else if (subExpr instanceof BoolValue) {
                        switch (subExpr.value.toString) {
                            case "true": {
                                port.name = IActorTypeProvider.VCC + expr.serialize.toString
                                circuitInitialization.createConstantOne(logic, port.name, originalNode)
                            }
                            case "false": {
                                port.name = IActorTypeProvider.GND + expr.serialize.toString
                                circuitInitialization.createConstantZero(logic, port.name, originalNode)
                            }
                        }
                    }
                }
            }
        }
    }

    def addRegisterPorts(Actor actor) {
        val tickPort = CircuitFactory::eINSTANCE.createPort
        val resetPort = CircuitFactory::eINSTANCE.createPort

        tickPort.type = IPortTypeProvider.TICK_IN
        tickPort.name = "Tick"

        resetPort.type = IPortTypeProvider.RESET_PRE_IN
        resetPort.name = "Reset_Pre"

        actor.ports.add(tickPort)
        actor.ports.add(resetPort)
    }

}
