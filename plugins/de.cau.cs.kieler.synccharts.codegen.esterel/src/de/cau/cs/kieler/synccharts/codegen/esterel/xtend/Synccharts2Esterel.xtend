package de.cau.cs.kieler.synccharts.codegen.esterel.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.kies.esterel.EsterelFactory
import de.cau.cs.kieler.kies.esterel.Modle
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject


class Synccharts2Esterel {

	@Inject extension Helper helper

	def create target : EsterelFactory::eINSTANCE.createProgram() transform (Region root) {
		var module = EsterelFactory::eINSTANCE.createModule()
		var body = EsterelFactory::eINSTANCE.createModuleBody()
		var pause = EsterelFactory::eINSTANCE.createPause()
		
		// Add a pause statement to a body of the main module
		body.statements.add(pause)
		module.setBody(body) 
		target.modules.add(module)
		
	}		


}













