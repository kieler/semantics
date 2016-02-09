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

class SeqSSAscgTransformation extends AbstractProductionTransformation {

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
	val ssaPreMap = new HashMap<String, Integer>

	def transform(SCGraph scg, KielerCompilerContext context) {

		// stores names of SSA variables and the latest version numbers
		ssaMap.clear
		ssaPreMap.clear

		// val scgraph = scg.copy
		val nodes = scg.nodes

		

		// search for Assignments
		filterRelevantAssignments(nodes.filter(Assignment).toList, ssaMap)

		createSSAs(scg, nodes)

//		setSSApreAndOutputs(scg.eAllContents.filter(Declaration).toList)
		context.compilationResult.addAuxiliaryData((new SSAMapData) => [it.ssaMap = ssaMap])

		return scg
	}

	def createSSAs(SCGraph scg, EList<Node> nodes) {

		for (n : nodes) {
			if (n instanceof Assignment) {
				val name = n.valuedObject.name
				val type = n.valuedObject.type
				
				if (ssaMap.containsKey(name)) {

					transformExpressions(n.assignment, ssaMap)
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

				} else {
					n.assignment = transformExpressions(n.assignment, ssaMap)
				}
			}
		}
	}

	def setSSApreAndOutputs(List<Declaration> declarations) {

		for (d : declarations) {
			if (d.isOutput && !d.isInput) {
				d.valuedObjects.forEach [ vo |

					val name = vo.name
					val readvalue = ssaMap.get(name)
					ssaPreMap.put(name, readvalue)
				]
			}
			for (v : d.valuedObjects) {
			}
		}

	}

	def filterRelevantAssignments(List<Assignment> assignments, HashMap<String, Integer> ssaMap) {

		assignments.forEach [ a |
			val name = a.valuedObject.name
			// gx and _condgx are unique 
			if (!(name.startsWith("g") || (name.startsWith("_")))) {

				// insert every SSA variable into ssaMap and set its version to 0
				if (!ssaMap.containsKey(name)) {
					ssaMap.put(name, 0);
				}
			}
		]
	}

	def Expression transformExpressions(Expression expression, HashMap<String, Integer> map) {

		val values = expression.eAllContents.filter(ValuedObjectReference)

		values.forEach [ v |
			val varName = v.valuedObject.name
			if (map.containsKey(varName) && map.get(varName) > 0) {

				val vo = createValuedObject(varName + "_" + ssaMap.get(varName))
				v.valuedObject = vo
			}

		]
		expression
	}

}

class SSAMapData extends AbstractKielerCompilerAuxiliaryData {
	@Accessors
	HashMap<String, Integer> ssaMap
}