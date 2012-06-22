/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.xtend

import de.cau.cs.kieler.core.kexpressions.ISignal
import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.esterel.esterel.ConstantExpression
import de.cau.cs.kieler.esterel.esterel.Program

import static extension org.eclipse.xtext.xbase.lib.IteratorExtensions.*
//WAS import static extension org.eclipse.xtext.xtend2.lib.EObjectExtensions.*

// Transformation of Esterel code into Esterel code that fixes inconsistencies
// of signal declarations due to additional channel desciptions.

class InterfaceDeclarationFix {
    
    // General method to create the enriched Esterel simulation code
   	def Program fix (Program program) {
   		
//		// Clone the complete Esterel program
//		for (module : program.modules) {
//			target.modules.add(CloningExtensions::clone(module) as Module);	
//		}   		
   		
		var interfaceSignalDeclList = program.eAllContents().toIterable().filter(typeof(InterfaceSignalDecl)).toList;
//WAS	var interfaceSignalDeclList = program.allContentsIterable.filter(typeof(InterfaceSignalDecl)).toList;
		
		for (Object object : interfaceSignalDeclList) {
			var InterfaceSignalDecl interfaceSignalDecl = object as InterfaceSignalDecl;
			var signalList = interfaceSignalDecl.signals;
			
			for (ISignal signal : signalList) {
				if (signal.channelDescr != null) {
					switch (signal.channelDescr.type.type.toString) {
						case "int": signal.setType(ValueType::INT)
						case "bool": signal.setType(ValueType::BOOL)
						case "double": signal.setType(ValueType::DOUBLE)
						case "float": signal.setType(ValueType::FLOAT)
						case "host": signal.setType(ValueType::HOST)
						case "string": signal.setType(ValueType::STRING)
						case "unsigned": signal.setType(ValueType::UNSIGNED)
					}
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













