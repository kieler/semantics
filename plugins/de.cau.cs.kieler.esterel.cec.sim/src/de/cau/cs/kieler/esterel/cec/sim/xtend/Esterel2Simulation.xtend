package de.cau.cs.kieler.esterel.cec.sim.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.kies.esterel.EsterelFactory
import de.cau.cs.kieler.kies.esterel.Program
import de.cau.cs.kieler.kies.esterel.Module
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject
import org.eclipse.xtend.util.stdlib.cloning
import org.eclipse.xtend.util.stdlib.tracing

import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipse.xtend.util.stdlib.CloningExtensions

// Transformation of Esterel code into Esterelcode that is
// enriched with additional signals for each statement.

// These signals, here HP, are generated in the following fashion for a 
// statement P:
// 
//  signal AP in 
//  	[P; emit AP; || emit HP; abort sustain HP when immediate AP] 
//  end 
//
// As names for the signals are randomly generated and must be unique
// there must be a mapping that keeps track which sigal (name) belongs to
// which original Esterel statement.

class Esterel2Simulation {
    
    // Generale method to create the enriched Esterel simulation code
   	def create target : EsterelFactory::eINSTANCE.createProgram transform2Simulation (Program program) {

		// Clone the complete Esterel program
		for (module : program.modules) {
			target.modules.add(CloningExtensions::clone(module) as Module);	
		}
		
	}	
	

}













