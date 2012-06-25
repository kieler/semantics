package de.cau.cs.kieler.synccharts.codegen.esterel.xtend

import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
//import de.cau.cs.kieler.esterel.esterel.Module
//import de.cau.cs.kieler.core.kexpressions.*
//import java.util.*


class Synccharts2Esterel {

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













