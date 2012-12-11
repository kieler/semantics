package de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.validation;

import java.util.ArrayList;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.stext.validation.STextJavaValidator;

import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.SCChartsExpPackage;
import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition;
import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.util.SccUtils;
 

public class SCChartsExpJavaValidator extends STextJavaValidator {

	
	/*
	 *  Check variable definitions
	 */
	@Check(CheckType.FAST)
	public void checkVariableDefinition(VariableDefinition variable) {
		// load all declarations made in ancestor States
		// the parameter is variable.eContainer().eContainer() to skip current
		// state declarations
		ArrayList<Declaration> declarations = SccUtils
				.getAncestorDeclarations(variable.eContainer().eContainer());
		for (Declaration declaration : declarations) {
			if (declaration != null) {
				if (declaration.getName().equals(variable.getName())) {
					error("Variable '" + variable.getName()
							+ "' already exists in an ancestor State.",
							SCChartsExpPackage.Literals.VARIABLE_DEFINITION__DIRECTION);
					return;
				}
			}
		}
		// load all declarations made in the current sate
		declarations = SccUtils.getCurrentStateDeclarations(variable
				.eContainer());
		// The variable isEscapeError is initially set to true to escape errors.
		// If a declaration is found in the list with same name, isEscapeError
		// is set to true. If another declaration with the same name is found,
		// an error is displayed.
		boolean isEscapeError = true;
		for (Declaration declaration : declarations) {
			if (declaration != null) {
				if (declaration.getName().equals(variable.getName())) {
					if (isEscapeError) {
						isEscapeError = false;
					} else {
						error("Variable '" + variable.getName()
								+ "' exists more than ones in the same State.",
								SCChartsExpPackage.Literals.VARIABLE_DEFINITION__DIRECTION);
						return;
					}
				}
			}
		}
	}

	// @Check(CheckType.FAST)
	// public void checkEventDefinition(ReactionTrigger reactionTrigger){
	// error("ReactionTrigger",null);
	// }

}
