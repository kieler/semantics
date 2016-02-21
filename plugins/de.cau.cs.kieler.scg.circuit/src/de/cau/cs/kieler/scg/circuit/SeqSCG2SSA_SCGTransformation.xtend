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
	val conditionalEndNodes = new HashMap<Conditional,Node>

//	val ssaPreMap = new HashMap<String, Integer>
	def transform(SCGraph scg, KielerCompilerContext context) {

		valuedObjectList.clear
		originalOutputs.clear
		outputOccurenceCounter.clear
		conditionalEndNodes.clear

		// stores names of SSA variables and the latest version numbers
		ssaMap.clear
//		ssaPreMap.clear
		// val scgraph = scg.copy
		// assuming only one entry node exists
		val entry = scg.nodes.filter(Entry).head
		// search for Assignments
		filterRelevantAssignments(scg.nodes.filter(Assignment).toList)

		createSSAs(entry.next.target, scg)


		context.compilationResult.addAuxiliaryData((new SSAMapData) => [it.conditionalEndNodes = conditionalEndNodes])

		for(s : conditionalEndNodes.entrySet){
		System.out.println(s.key.toString + " Fhas " + s.value.toString)
		
		}
		
		return scg
	}

	def void createSSAs(Node n, SCGraph scg) {

		if (!(n instanceof Exit)) {

			if (n instanceof Assignment) {
				transformAssignmentNodes(n, scg)
				createSSAs(n.next.target, scg)
			} else if (n instanceof Conditional) {
				val target = n.^else.target
				conditionalEndNodes.put(n,target)
				transformConditionalNodes(n, n, n, n.^else.target, scg)
				createSSAs(target, scg)
			}

		}
	}

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
			val isSSArelevant = ssaMap.containsKey(name)

			var ValuedObject storeVO

			if (isSSArelevant) {
				storeVO = valuedObjectList.get(name)
			}

			transformAssignmentNodes(thisNode, scg)

			if (isSSArelevant) {

				val newNode = ScgFactory::eINSTANCE.createAssignment

				newNode.valuedObject = thisNode.valuedObject

				// if this is the first SSA variable of an Output x, use pre(x)
				if (storeVO.isOutput && !storeVO.isInput && (ssaMap.get(name) == 1)) {
					val expression = KExpressionsFactory::eINSTANCE.createOperatorExpression
					expression.setOperator(OperatorType::PRE)

					expression.subExpressions.add(storeVO.reference)

					newNode.assignment = expression
				} else {
					newNode.assignment = storeVO.reference

				}
				scg.nodes += newNode

				if (predecessorNodeElse instanceof Conditional) {
					predecessorNodeElse.^else.target = newNode
				} else if (predecessorNodeElse instanceof Assignment) {
					predecessorNodeElse.next.target = newNode
				}

				val newLink = ScgFactory::eINSTANCE.createControlFlow

				newLink.target = target

				newNode.next = newLink

				if (!(thisNode.next.target == target)) {

					transformConditionalNodes(sourceConditional, thisNode, newNode, target, scg)
									
					
				}
				
				

			}
			

			else if (!(thisNode.next.target == target)) {

				transformConditionalNodes(sourceConditional, thisNode, predecessorNodeElse, target, scg)
			}
			
			}
		

	}

	def transformAssignmentNodes(Assignment n, SCGraph scg) {
		val name = n.valuedObject.name
		val type = n.valuedObject.type

		if (ssaMap.containsKey(name)) {

			transformExpressions(n.assignment)
			val m = ssaMap.get(name)
			ssaMap.replace(name, m, m + 1)

			if ((outputOccurenceCounter.get(name) == null) || !(ssaMap.get(name) >= (outputOccurenceCounter.get(name)))) {

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

				valuedObjectList.replace(name, vo) // valuedObjectList.put(name, vo)
			}

		} else {
			val expr = n.assignment
			n.assignment = transformExpressions(expr)
		}

	}

	def filterRelevantAssignments(List<Assignment> assignments) {
		for (a : assignments) {
			val name = a.valuedObject.name
			// gx and _condgx are unique 
			if (!(name.startsWith("g") || (name.startsWith("_")))) {
				if (a.valuedObject.isOutput && !a.valuedObject.isInput) {
					if (outputOccurenceCounter.containsKey(name)) {
						val m = outputOccurenceCounter.get(name)
						outputOccurenceCounter.replace(name, m, m + 1)
					} else {
						outputOccurenceCounter.put(name, 1)

					}

				}

				// insert every SSA variable into ssaMap and set its version to 0
				if (!ssaMap.containsKey(name)) {
					ssaMap.put(name, 0);

					valuedObjectList.put(name, a.valuedObject)
					if (a.valuedObject.isOutput && !a.valuedObject.isInput) {
						originalOutputs.put(name, a.valuedObject)
					}
				}

			}

		}

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
	HashMap<Conditional, Node> conditionalEndNodes
}