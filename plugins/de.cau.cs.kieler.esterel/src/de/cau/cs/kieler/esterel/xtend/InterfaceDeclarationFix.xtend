package de.cau.cs.kieler.esterel.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject


import org.eclipse.emf.ecore.EObject

import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.esterel.esterel.*
import de.cau.cs.kieler.esterel.esterel.impl.*

import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipse.xtend.util.stdlib.CloningExtensions
import org.eclipse.xtend.util.stdlib.TraceComponent

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import static extension org.eclipse.xtext.xtend2.lib.ResourceSetExtensions.*
import static extension org.eclipse.xtext.xtend2.lib.EObjectExtensions.*

// Transformation of Esterel code into Esterel code that fixes inconsistencies
// of signal declarations due to additional channel desciptions.

class InterfaceDeclarationFix {
    
    // Generale method to create the enriched Esterel simulation code
   	def Program fix (Program program) {
   		
//		// Clone the complete Esterel program
//		for (module : program.modules) {
//			target.modules.add(CloningExtensions::clone(module) as Module);	
//		}   		
   		
		var interfaceSignalDeclList = program.allContentsIterable.filter(typeof(InterfaceSignalDecl)).toList;
		
		for (InterfaceSignalDecl interfaceSignalDecl : interfaceSignalDeclList) {
			var signalList = interfaceSignalDecl.signals;
			
			for (ISignal signal : signalList) {
				if (signal.channelDescr != null) {
//					switch (signal.channelDescr.type.type.toString) {
//						case "int": signal.setType(ValueType::INT)
//						case "bool": signal.setType(ValueType::BOOL)
//						case "double": signal.setType(ValueType::DOUBLE)
//						case "float": signal.setType(ValueType::FLOAT)
//						case "host": signal.setType(ValueType::HOST)
//						case "string": signal.setType(ValueType::STRING)
//						case "unsigned": signal.setType(ValueType::UNSIGNED)
//					}
					var expression = signal.channelDescr.expression; 
					if (expression instanceof ConstantExpression) {
						var constantExpression = expression as ConstantExpression;
						signal.setInitialValue(constantExpression.value.toString);
					}
				}
			}
			
		}
  		 
  		 program;
	}	
	

}













