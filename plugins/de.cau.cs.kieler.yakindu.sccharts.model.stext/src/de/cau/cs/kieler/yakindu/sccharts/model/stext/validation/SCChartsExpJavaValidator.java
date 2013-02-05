package de.cau.cs.kieler.yakindu.sccharts.model.stext.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.ComposedChecks;
import org.yakindu.base.types.ITypeSystemAccess;
import org.yakindu.base.types.Type;
import org.yakindu.sct.model.sgraph.Statement;
import org.yakindu.sct.model.sgraph.validation.SCTResourceValidator;
import org.yakindu.sct.model.stext.stext.ReactionTrigger;
import org.yakindu.sct.model.stext.stext.StextPackage;
import org.yakindu.sct.model.stext.stext.VariableDefinition;
import org.yakindu.sct.model.stext.validation.STextJavaValidator;
import org.yakindu.sct.model.stext.validation.TypeCheckException;

import com.google.inject.Inject;

import de.cau.cs.kieler.yakindu.model.sgraph.validator.SyncGraphJavaValidator;

@ComposedChecks(validators = { SyncGraphJavaValidator.class,
		SCTResourceValidator.class })
public class SCChartsExpJavaValidator extends STextJavaValidator {

	@Inject
	private ISCCTypeInferrer sccInferrer;
	@Inject
	private ITypeSystemAccess tsAccess;

	@Check(CheckType.FAST)
	public void checkGuardHasBooleanExpression(ReactionTrigger trigger) {
		if (trigger.getGuardExpression() == null)
			return;
		try {
			Type type = sccInferrer.getType(trigger.getGuardExpression());
			if (!tsAccess.isBoolean(type)) {
				error(GUARD_EXPRESSION,
						StextPackage.Literals.REACTION_TRIGGER__GUARD_EXPRESSION);
			}
		} catch (TypeCheckException ex) {
			// This is handled by checkExpression
		}

	}
	
	@Check(CheckType.FAST)
	public void checkVariableDefinitionInitialValue(
			VariableDefinition definition) {
		Type varType = definition.getType();
		if (definition.getInitialValue() == null)
			return;
		try {
			Type valType = sccInferrer.getType(definition.getInitialValue());
			Type combine = tsAccess.combine(valType, varType);
			if (combine == null || !tsAccess.isAssignable(varType, valType)) {
				error("Can not assign a value of type '" + valType.getName()
						+ "' to a variable of type '" + varType + "'",
						StextPackage.Literals.VARIABLE_DEFINITION__INITIAL_VALUE);
			}
		} catch (Exception e) {
			error(e.getMessage(), null);
		}
	}
	
	@Check(CheckType.FAST)
	public void checkExpression(final Statement statement) {
		try {
			sccInferrer.getType(statement);
		} catch (TypeCheckException e) {
			error(e.getMessage(), null);
		} catch (IllegalArgumentException e) {
			// This happens, when the expression is not completed for Unhandled
			// parameter types: [null]
			// We can safely ignore this exception
		}
	}

}
