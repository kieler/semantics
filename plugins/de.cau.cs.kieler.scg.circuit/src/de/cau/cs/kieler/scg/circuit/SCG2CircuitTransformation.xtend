package de.cau.cs.kieler.scg.circuit

import com.google.inject.Inject

import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.circuit.Actor
import de.cau.cs.kieler.scg.Guard
import java.util.LinkedList
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.synchronizer.SynchronizerSelector
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.circuit.CircuitFactory
import de.cau.cs.kieler.scg.Node
import java.util.List

class SCG2CircuitTransformation {

	@Inject
	extension SCGCoreExtensions

	@Inject
	extension SCGDeclarationExtensions

	@Inject
	extension SCGControlFlowExtensions

	@Inject
	extension KExpressionsValuedObjectExtensions

	@Inject
	extension KExpressionsCreateExtensions

	@Inject
	extension AnnotationsExtensions

	@Inject
	extension SynchronizerSelector

	@Inject
	extension KEffectsSerializeExtensions

	def transform(SCGraph scg) {

//		val guards = scg.guards
//		val g = guards.head.valuedObject.name
//		val exp = guards.head.expression.serialize
		
		val nodes = scg.eAllContents.filter(typeof(Node)).toIterable.toList
		
		//create root object which should be the frame of the circuit
		val newCircuit = CircuitFactory::eINSTANCE.createActor 
        transformNodes2Actors(nodes , newCircuit)

		
	}
	
	def transformNodes2Actors(List<Node> nodes, Actor root) {
		
		nodes.forEach [ n |
			if (n instanceof Assignment) {
				root.innerActors += transformAssignment(n)
			} else if (n instanceof Conditional) {
				root.innerActors += transformConditional(n)
			}
			
			]
			root
	}
	
	def Actor transformConditional(Conditional conditional) {
		val actor = CircuitFactory::eINSTANCE.createActor 
		
		actor.name = "cond";
		
		actor
	}
	
	def Actor transformAssignment(Assignment assignment) {
		var completeAssginment = assignment.assignment.serialize.toString
		
		//split Assignment into Strings at spaces
		//e.g. g10 = g2 || g9 => ["g10", "=", "g2", "||", "g9"]
		val String[] splittedAssignment = completeAssginment.split(" ")
		//the guradname should be found at first position of the array
		val guardname = splittedAssignment.get(0)
		
		
		val actor = CircuitFactory::eINSTANCE.createActor 
		
		actor.name = guardname
		
		actor
	}

}