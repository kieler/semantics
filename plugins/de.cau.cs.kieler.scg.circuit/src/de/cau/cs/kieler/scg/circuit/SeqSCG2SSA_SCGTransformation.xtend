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

	var SCGraph scg
	var valuedObjectList = new HashMap<String, ValuedObject>

//	val ssaPreMap = new HashMap<String, Integer>
	def transform(SCGraph scgraph, KielerCompilerContext context) {

		valuedObjectList.clear
		scg = scgraph

		// stores names of SSA variables and the latest version numbers
		ssaMap.clear
//		ssaPreMap.clear
		// val scgraph = scg.copy
		// assuming only one entry node exists
		val entry = scg.nodes.filter(Entry).head
		// search for Assignments
		filterRelevantAssignments(scg.nodes.filter(Assignment).toList)

		for (b : valuedObjectList.entrySet) {
			System.out.println(b.key + " has value " + b.value)
		}

		createSSAs(entry.next.target)

//		val vos = scg.eAllContents.filter(ValuedObject).toList
//		for(vo : vos){
//			System.out.println(vo.name)
//			if(vo.isOutput && !vo.isInput){
//				val name = vo.name
//				vo.name = "pre_" + name
//			}
//		}
		context.compilationResult.addAuxiliaryData((new SSAMapData) => [it.ssaMap = ssaMap])
		return scg
	}

	def void createSSAs(Node n) {

		if (!(n instanceof Exit)) {

			if (n instanceof Assignment) {
				transformAssignmentNodes(n)
				createSSAs(n.next.target)
			} else if (n instanceof Conditional) {
				transformConditionalNodes(n, n, n, n.^else.target)
				createSSAs(n.^else.target)
			}
		}
//		
//		
//		for (n : nodes.immutableCopy) {
//			if (n == endCondition) {
//				activeConditional = false
//			}
//
//			if (n instanceof Conditional) {
//				if (!activeConditional) {
//					activeConditional = true
//					endCondition = n.^else.target
//
//					System.out.println("i found a condition " + n.condition.serialize.toString)
//					transformConditionalNodes(n, n, n, endCondition)
//
//				}
//			} else if (n instanceof Assignment) {
//
//				if (!activeConditional) {
//					System.out.println("i found an assignment " + n.valuedObject.name)
//					transformAssignmentNodes(n)
//				}
//			}
//		}
	}

	def void transformConditionalNodes(Conditional sourceConditional, Node predecessorNodeThen,
		Node predecessorNodeElse, Node target) {

		var Node thisNode

		if (predecessorNodeThen instanceof Conditional) {
			thisNode = predecessorNodeThen.then.target
		}
		if (predecessorNodeThen instanceof Assignment) {
			thisNode = predecessorNodeThen.next.target
		}
		if (thisNode instanceof Conditional) {
			transformConditionalNodes(thisNode, thisNode, thisNode, thisNode.^else.target)
		} else if (thisNode instanceof Assignment) {
			val name = thisNode.valuedObject.name
			val isSSArelevant = ssaMap.containsKey(name)
			val storeVO = valuedObjectList.get(name)

			transformAssignmentNodes(thisNode)

			if (isSSArelevant) {

				val newNode = ScgFactory::eINSTANCE.createAssignment

				newNode.valuedObject = thisNode.valuedObject

				newNode.assignment = storeVO.reference

				scg.nodes += newNode

				if (predecessorNodeElse instanceof Conditional) {
					predecessorNodeElse.^else.target = newNode
				} else if (predecessorNodeElse instanceof Assignment) {
					predecessorNodeElse.next.target = newNode
				}

				val newLink = ScgFactory::eINSTANCE.createControlFlow

				newLink.target = target

				newNode.next = newLink

				if (!(thisNode.next == target)) {
					System.out.println("11")

					transformConditionalNodes(sourceConditional, thisNode, newNode, target)
				}

			}

			if (!(thisNode.next == target)) {

				transformConditionalNodes(sourceConditional, thisNode, predecessorNodeElse, target)
			}
		}

	}

	def transformAssignmentNodes(Assignment n) {
		val name = n.valuedObject.name
		val type = n.valuedObject.type

		if (ssaMap.containsKey(name)) {

			transformExpressions(n.assignment)
			val m = ssaMap.get(name)
			ssaMap.replace(name, m, m + 1)

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

			valuedObjectList.replace(name, vo)

		} else {
			val expr = n.assignment
			n.assignment = transformExpressions(expr)
		}

	}

//	def setSSApreAndOutputs(List<Declaration> declarations) {
//
//		for (d : declarations) {
//			if (d.isOutput && !d.isInput) {
//				d.valuedObjects.forEach [ vo |
//
//					val name = vo.name
//					val readvalue = ssaMap.get(name)
//					ssaPreMap.put(name, readvalue)
//				]
//			}
//			for (v : d.valuedObjects) {
//			}
//		}
//
//	}
	def filterRelevantAssignments(List<Assignment> assignments) {
//TODO: klären, ob man hier auf inlut, output oder beides nicht testen muss
		assignments.forEach [ a |
			val name = a.valuedObject.name
			// gx and _condgx are unique 
			if (!(name.startsWith("g") || (name.startsWith("_")))) {

				// insert every SSA variable into ssaMap and set its version to 0
				if (!ssaMap.containsKey(name)) {
					ssaMap.put(name, 0);

					valuedObjectList.put(name, a.valuedObject)
				}

			}
		]
	}

	def Expression transformExpressions(Expression expression) {

		if (expression instanceof ValuedObjectReference) {
			val varName = expression.valuedObject.name

			if (ssaMap.containsKey(varName) && ssaMap.get(varName) > 0) {
//				val vo = createValuedObject(varName + "_" + ssaMap.get(varName))
				expression.valuedObject = valuedObjectList.get(varName)
			}

		} else {
			val values = expression.eAllContents.filter(ValuedObjectReference)
			values.forEach [ v |
				val varName = v.valuedObject.name

				if (ssaMap.containsKey(varName) && ssaMap.get(varName) > 0) {
//					val vo = createValuedObject(varName + "_" + ssaMap.get(varName))
					v.valuedObject = valuedObjectList.get(varName)
				}

			]

		}
		expression
	}

}

class SSAMapData extends AbstractKielerCompilerAuxiliaryData {
	@Accessors
	HashMap<String, Integer> ssaMap
}