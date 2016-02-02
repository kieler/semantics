
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
	extension KExpressionsValuedObjectExtensions
	val ssaMap = new HashMap<String, Integer>
	val ssaPreMap = new HashMap<String, Integer>

	def transform(SCGraph scg, KielerCompilerContext context) {

		// stores names of SSA variables and the latest version numbers
		ssaMap.clear
		ssaPreMap.clear

		val scgraph = scg.copy
		System.out.println(scgraph.toString)

		val nodes = scgraph.nodes

		filterRelevantAssignments(nodes.filter(Assignment).toList, ssaMap)

		createSSAs(scgraph, nodes)
		
		setSSApreAndOutputs(nodes.filter(Declaration).toList)
		
		context.compilationResult.addAuxiliaryData((new SSAMapData) => [ it.ssaMap = ssaMap ])
		
		return scgraph
	}

	def createSSAs(SCGraph scgCopy, EList<Node> nodes) {

		for (n : nodes) {
			if (n instanceof Assignment) {
				val name = n.valuedObject.name
				if (ssaMap.containsKey(name)) {
					val newNode = ScgFactory::eINSTANCE.createAssignment

					
					val copyExpr = n.assignment.copy
					newNode.assignment = transformExpressions(copyExpr, ssaMap)
					
					val m = ssaMap.get(name)
					ssaMap.replace(name, m, m + 1)
					val vo = createValuedObject(name + "_" + ssaMap.get(name))
					newNode.valuedObject = vo
				
					val incomingLinks = n.incoming.immutableCopy
					for (l : incomingLinks) {

						l.target = newNode
					}
					newNode.next = n.next
					n.replace(newNode)

					
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
					System.out.println("added " + name + " with value " + ssaMap.get(name))
				}
			}
		]
	}

	def Expression transformExpressions(Expression expression, HashMap<String, Integer> map) {

		val values = expression.eAllContents.filter(ValuedObjectReference)

		values.forEach [ v |
			val varName = v.valuedObject.name

			if (map.containsKey(varName)) {
				v.valuedObject.name = varName + "_" + map.get(varName)
			}

		]
		expression
	}

}

class SSAMapData extends AbstractKielerCompilerAuxiliaryData {
	@Accessors
	HashMap<String, Integer> ssaMap 	
}