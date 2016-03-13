package de.cau.cs.kieler.scg.circuit

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.circuit.features.CircuitFeatures
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.util.EList

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kico.KielerCompilerContext
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kico.AbstractKielerCompilerAuxiliaryData
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType

class SeqSCG2SSA_SCGTransformation extends AbstractProductionTransformation {

	// -------------------------------------------------------------------------
	// --                 K I C O      C O N F I G U R A T I O N              --
	// -------------------------------------------------------------------------
	override getId() {
		return CircuitFeatures::SCG2SSASCG_ID
	}

	override getName() {
		return CircuitFeatures::SCG2SSASCG_NAME
	}

	override getProducedFeatureId() {
		return CircuitFeatures::SCG2SSASCG_ID
	}

	override getRequiredFeatureIds() {
		return newHashSet(SCGFeatures::SEQUENTIALIZE_ID)
	}

	@Inject
	extension KEffectsSerializeExtensions

	@Inject
	extension KExpressionsDeclarationExtensions

	@Inject
	extension KExpressionsValuedObjectExtensions
	
	
	val ssaMap = new HashMap<String, Integer>
	val valuedObjectList = new HashMap<String, ValuedObject>
	val originalOutputs = new HashMap<String, ValuedObject>
	val outputOccurenceCounter = new HashMap<String, Integer>
	val inputOutputMap = new HashMap<String, Integer>

	def transform(SCGraph scg, KielerCompilerContext context) {

		valuedObjectList.clear
		originalOutputs.clear
		outputOccurenceCounter.clear
		ssaMap.clear
		inputOutputMap.clear

		// Assuming only one entry node exists in a sequentialized SCG; Make it the starting point of the SSA transformation
		val entry = scg.nodes.filter(Entry).head

		// Search for all assignments which have to be replaced by SSA variables and fill all lists.
		filterRelevantAssignments(scg.nodes.filter(Assignment).toList)

		createSSAs(entry.next.target, scg)

		context.compilationResult.addAuxiliaryData((new SSAMapData) => [it.inputOutputMap = inputOutputMap])

		return scg
	}

	/**
	 * Follows the control flow of the SCG and checks type of nodes.
	 * --> if current node is an assignment node: transform it with createAssignmentNodes and call createSSAs with the next node.
	 * --> if current node is a conditional node: transform all nodes occurring on the "then"-branch with transformConditionalNodes.
	 *     remember the target of the "else"-branch (conditionalEndNodes) and call createSSAs with this node.
	 */
	def void createSSAs(Node n, SCGraph scg) {

		if (!(n instanceof Exit)) {

			if (n instanceof Assignment) {
				transformAssignmentNodes(n, scg)
				createSSAs(n.next.target, scg)
			} else if (n instanceof Conditional) {
				val target = n.^else.target
				transformConditionalNodes(n, n, n, n.^else.target, scg)
				createSSAs(target, scg)
			}

		}
	}

	/**
	 * Transforms all nodes in the "then"-branch originating in a conditional node.
	 * 
	 * For each node:
	 * - in case of a new conditional: call transformConditionalNodes with the current node as sourceConditional
	 * - in case of an assignment: replace variable by its SSA version and create a new assignment node on the "else"-branch.
	 * 	 						   This new assignment node assigns the old version of the SSA variable.
	 */
	def void transformConditionalNodes(Conditional sourceConditional, Node predecessorNodeThen,
		Node predecessorNodeElse, Node target, SCGraph scg) {

		var Node thisNode

		if (predecessorNodeThen instanceof Conditional) {
			thisNode = predecessorNodeThen.then.target
		}
		if (predecessorNodeThen instanceof Assignment) {
			thisNode = predecessorNodeThen.next.target
		}
		if (thisNode instanceof Conditional) {
			transformConditionalNodes(thisNode, thisNode, thisNode, thisNode.^else.target, scg)
		} else if (thisNode instanceof Assignment) {

			val name = thisNode.valuedObject.name

			// make sure this assignment is really relevant. 
			// maybe this is not necessary. if not, replace all if(isSSArelevant)..
			val isSSArelevant = ssaMap.containsKey(name)

			// store the current target valued object before transforming the assignemnt node
			var ValuedObject storeVO

			if (isSSArelevant) {
				storeVO = valuedObjectList.get(name)
			}

			transformAssignmentNodes(thisNode, scg)

			// create a new assignment node on the "else"-branch
			if (isSSArelevant) {

				val newNode = ScgFactory::eINSTANCE.createAssignment
				newNode.valuedObject = thisNode.valuedObject

				// if this is the first assignment to an Output x, use pre(x) as assignment on the "else"-branch
				// otherwise just use the latest version.
				if (!storeVO.isInput && (ssaMap.get(name) == 1)) {
					val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
					expression.setOperator(OperatorType::PRE)
					expression.subExpressions.add(storeVO.reference)
					newNode.assignment = expression
				} else {
					newNode.assignment = storeVO.reference
				}
				scg.nodes += newNode

				// change the control flow of the "else"-branch.
				// the new created assignment node is set between the predecessor on the "else"-branch
				// and its former target node.
				if (predecessorNodeElse instanceof Conditional) {
					predecessorNodeElse.^else.target = newNode
				} else if (predecessorNodeElse instanceof Assignment) {
					predecessorNodeElse.next.target = newNode
				}

				val newLink = ScgFactory::eINSTANCE.createControlFlow

				newLink.target = target

				newNode.next = newLink

				// as long as there are two control flow branches restart this method for the next node on the "then"-branch.
				if (!(thisNode.next.target == target)) {
					transformConditionalNodes(sourceConditional, thisNode, newNode, target, scg)
				}
			} else if (!(thisNode.next.target == target)) {

				transformConditionalNodes(sourceConditional, thisNode, predecessorNodeElse, target, scg)
			}

		}
	}

	/**
	 * Check for each assignment node if it is SSA relevant. If so, replace the target of the assignment by an SSA variable.
	 * For each assignment call transformExpression to replace SSA variable occurrences on the right side of the assignment.
	 * 
	 */
	def transformAssignmentNodes(Assignment n, SCGraph scg) {
		val name = n.valuedObject.name
		val type = n.valuedObject.type

		if (ssaMap.containsKey(name)) {

			transformExpressions(n.assignment)
			val m = ssaMap.get(name)
			ssaMap.replace(name, m, m + 1)

			// don't create more valuedObjects than needed.. 
			// if this is the last time an output is target of an assignment, the original output variable shall be the target.
			if ((outputOccurenceCounter.get(name) == null) ||
				!(ssaMap.get(name) >= (outputOccurenceCounter.get(name)))) {

				val vo = createValuedObject(name + "_" + ssaMap.get(name))
				val dec = createDeclaration()
				dec.valuedObjects += vo

				switch (type) {
					case BOOL: dec => [setType(ValueType::BOOL)]
					case DOUBLE: dec => [setType(ValueType::DOUBLE)]
					case FLOAT: dec => [setType(ValueType::FLOAT)]
					case HOST: dec => [setType(ValueType::HOST)]
					case INT: dec => [setType(ValueType::INT)]
					case PURE: dec => [setType(ValueType::PURE)]
					case STRING: dec => [setType(ValueType::STRING)]
					case UNSIGNED: dec => [setType(ValueType::UNSIGNED)]
				}

				scg.declarations += dec
				n.valuedObject = vo

				// remember the new valuedObject for this variable to use it in the expression transformation
				valuedObjectList.replace(name, vo)
			}
		} else {
			val expr = n.assignment
			n.assignment = transformExpressions(expr)
		}

	}

	/**
	 * Gets the list of all Assignment nodes of the SCG and filters assignments to output and input output variables.
	 * 
	 * The assignments are stored in different lists:
	 * 
	 * - originalOutputs remembers the original output's name and its valuedObject
	 * - outputOccurenceCounter stores how often an output variable is target of an assignment (highest version number as break condition)
	 * - ssaMap stores every output variable with counter 0 (counter for SSA variables)
	 * - valuedObjectList stores the to a name associated valuedObject
	 * 
	 */
	def filterRelevantAssignments(List<Assignment> assignments) {
		for (a : assignments) {
			val name = a.valuedObject.name
			// gX and _condgx are unique 
			if (!(name.startsWith("g") || (name.startsWith("_")))) {

				if (!a.valuedObject.isInput) {
					originalOutputs.put(name, a.valuedObject)

					if (outputOccurenceCounter.containsKey(name)) {
						val m = outputOccurenceCounter.get(name)
						outputOccurenceCounter.replace(name, m, m + 1)
					} else {
						outputOccurenceCounter.put(name, 1)
					}
				}
				// store highest version of input output variable for the circuit transformation
				if (a.valuedObject.isInput && a.valuedObject.isOutput) {
					if (inputOutputMap.containsKey(name)) {
						val m = inputOutputMap.get(name)
						inputOutputMap.replace(name, m, m + 1)
					} else {
						inputOutputMap.put(name, 1)
					}

				}

				// insert every SSA variable into ssaMap and set its version to 0
				if (!ssaMap.containsKey(name)) {
					ssaMap.put(name, 0);
					valuedObjectList.put(name, a.valuedObject)
				}
			}
		}
	}

	/**
	 * In each Expression replace all SSA variables with their at this moment highest version
	 */
	def Expression transformExpressions(Expression expression) {

		if (expression instanceof ValuedObjectReference) {
			val varName = expression.valuedObject.name

			if (ssaMap.containsKey(varName) && ssaMap.get(varName) > 0) {
				expression.valuedObject = valuedObjectList.get(varName)
			}

		} else {
			val values = expression.eAllContents.filter(ValuedObjectReference)
			values.forEach [ v |
				val varName = v.valuedObject.name

				if (ssaMap.containsKey(varName) && ssaMap.get(varName) > 0) {
					v.valuedObject = valuedObjectList.get(varName)
				}
			]
		}
		expression
	}
}

//Prepare data for CircuitTransformation
class SSAMapData extends AbstractKielerCompilerAuxiliaryData {
	@Accessors
	HashMap<String, Integer> inputOutputMap
}