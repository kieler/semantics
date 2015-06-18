package de.cau.cs.kieler.sccharts.esterel.transformation

import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.esterel.esterel.EsterelFactory

class SCChartsToEsterelTransformation extends AbstractModelTransformation {
	
	override EObject transform(EObject model) {
		val program = EsterelFactory::eINSTANCE.createProgram
		val module = EsterelFactory::eINSTANCE.createModule
		module.name = "module"
		val body = EsterelFactory::eINSTANCE.createModuleBody
		val state = EsterelFactory::eINSTANCE.createNothing
		body.statements.add(state)
		module.body = body
		module.end = "end module"
		program.modules.add(module)
		
		program
	}
}