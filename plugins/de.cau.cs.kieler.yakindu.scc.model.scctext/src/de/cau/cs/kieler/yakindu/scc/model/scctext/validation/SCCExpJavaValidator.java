package de.cau.cs.kieler.yakindu.scc.model.scctext.validation;

import java.util.ArrayList;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.yakindu.sct.model.sgraph.Declaration;
import org.yakindu.sct.model.sgraph.Event;
import org.yakindu.sct.model.sgraph.Variable;
import org.yakindu.sct.model.stext.validation.STextJavaValidator;

import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage;
import de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition;
import de.cau.cs.kieler.yakindu.scc.model.scctext.util.SccUtils;

public class SCCExpJavaValidator extends STextJavaValidator {

	@Check(CheckType.FAST)
	public void checkVariableDefinition(VariableDefinition variable) {
		ArrayList<Declaration> declarations = SccUtils
				.getAncestorDeclarations(variable.eContainer().eContainer());
		if (declarations != null) {
			for (Declaration declaration : declarations) {
				if (declaration != null) {
					if (declaration.getName().equals(variable.getName())) {
						error("Variable '"+variable.getName()+"' already exists in an ancestor State.",
								SccexpPackage.Literals.VARIABLE_DEFINITION__DIRECTION);
						return;
					}
				}
			}
		}
	}
	
//	@Check(CheckType.FAST)
//	public void checkEventDefinition(ReactionTrigger reactionTrigger){
//		error("ReactionTrigger",null);
//	}
	
}
