package de.cau.cs.kieler.scg.circuit

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.circuit.features.CircuitFeatures
import de.cau.cs.kieler.scg.features.SCGFeatures
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.scg.SCGraph
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

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
		return SCGFeatures::SEQUENTIALIZE_ID
	}

	override getRequiredFeatureIds() {
		return newHashSet(SCGFeatures::SEQUENTIALIZE_ID)
	}

	@Inject
	extension KEffectsSerializeExtensions

	@Inject
	CircuitInitialization circuitInitialization

	@Inject
	TransformToSSA transformToSSA

	def transform(SCGraph scg) {
		val scgraph = scg.copy
		
		return scgraph
	}
	
	
}