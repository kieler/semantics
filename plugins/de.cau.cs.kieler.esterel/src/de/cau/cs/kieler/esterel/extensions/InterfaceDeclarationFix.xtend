/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */ 
package de.cau.cs.kieler.esterel.extensions

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.SignalDeclaration
import de.cau.cs.kieler.kexpressions.ValueType

//WAS import static extension org.eclipse.xtext.xtend2.lib.EObjectExtensions.*

// Transformation of Esterel code into Esterel code that fixes inconsistencies
// of signal declarations due to additional channel desciptions.

/*
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
class InterfaceDeclarationFix { 
    
    // General method to create the enriched Esterel simulation code
   	def EsterelProgram fix (EsterelProgram program) {
   		
//		// Clone the complete Esterel program
//		for (module : program.modules) {
//			target.modules.add(CloningExtensions::clone(module) as Module);	
//		}   		
   		
		var interfaceSignalDeclList = program.eAllContents().toIterable().filter(typeof(SignalDeclaration)).toList;
//WAS	var interfaceSignalDeclList = program.allContentsIterable.filter(typeof(InterfaceSignalDecl)).toList;
		
		for (Object object : interfaceSignalDeclList) {
			var SignalDeclaration interfaceSignalDecl = object as SignalDeclaration;
			var signalList = interfaceSignalDecl.valuedObjects.filter(Signal);
			
			for (Signal signal : signalList) {
				
				switch (signal.type.toString) {
					case "int": signal.setType(ValueType::INT)
					case "bool": signal.setType(ValueType::BOOL)
					case "double": signal.setType(ValueType::DOUBLE)
					case "float": signal.setType(ValueType::FLOAT)
					case "host": signal.setType(ValueType::HOST)
					case "string": signal.setType(ValueType::STRING)
					case "unsigned": signal.setType(ValueType::UNSIGNED)
				}
//				var expression = signal.expression; 
//				if (expression instanceof ConstantExpression) {
//					var constantExpression = expression as ConstantExpression;
//					signal.setInitialValue(constantExpression.value.toString);
//				}
				
			}
			
		}
  		 
  		 program;
	}	
	

}











