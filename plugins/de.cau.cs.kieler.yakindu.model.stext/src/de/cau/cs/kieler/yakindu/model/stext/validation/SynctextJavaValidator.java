package de.cau.cs.kieler.yakindu.model.stext.validation;

import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.ComposedChecks;
import org.yakindu.base.types.ITypeSystem.InferenceResult;
import org.yakindu.base.types.Operation;
import org.yakindu.base.types.Property;
import org.yakindu.sct.model.sgraph.validation.SCTResourceValidator;
import org.yakindu.sct.model.stext.stext.AssignmentExpression;
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression;
import org.yakindu.sct.model.stext.stext.EventRaisingExpression;
import org.yakindu.sct.model.stext.stext.Expression;
import org.yakindu.sct.model.stext.stext.FeatureCall;
import org.yakindu.sct.model.stext.stext.StextPackage;
import org.yakindu.sct.model.stext.types.ISTextTypeInferrer;
import org.yakindu.sct.model.stext.types.ISTextTypeSystem;
import org.yakindu.sct.model.stext.validation.STextJavaValidator;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

import de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition;
import de.cau.cs.kieler.yakindu.model.stext.synctext.PreValueExpression;
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect;
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger;
import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage;
import de.cau.cs.kieler.yakindu.sgraph.validator.SyncGraphJavaValidator;

/**
 * This class implements the validator for the textual description language. It
 * extends the Yakindu Validator which contains validity rules also used by this
 * project.
 * 
 * @author wah
 * 
 */
@ComposedChecks(validators = { SyncGraphJavaValidator.class,
		SCTResourceValidator.class })
public class SynctextJavaValidator extends STextJavaValidator {

	public static final String TRIGGER_EXPRESSION = "A trigger should be a signal or a variable of type boolean";
	public static final String PRE_ASSIGNMENT = "Can not assign a value to a pre operator";

	@Inject
	private ISTextTypeInferrer sccInferrer;
	@Inject
	private ISTextTypeSystem typeSystem;
	@Inject
	private ISTextTypeSystem tsAccess;
	@Inject
	private IQualifiedNameProvider nameProvider;

	/**
	 * Check the Trigger and GuardExpression
	 */
	@Check(CheckType.FAST)
	public void checkGuardHasBooleanExpression(ReactionTrigger trigger) {
		try {
			//
			if (trigger.getGuardExpression() != null) {
				if (trigger.getGuardExpression() instanceof AssignmentExpression) {
					error(GUARD_EXPRESSION,
							SynctextPackage.Literals.REACTION_TRIGGER__GUARD_EXPRESSION);
				} else {
					InferenceResult result = sccInferrer.inferType(trigger
							.getGuardExpression());
					if (result.getType() == null
							|| !typeSystem.isBooleanType(result.getType())) {
						error(GUARD_EXPRESSION,
								SynctextPackage.Literals.REACTION_TRIGGER__GUARD_EXPRESSION);
					}
				}
			} else if (trigger.getTrigger() != null) {
				if (!(((ElementReferenceExpression) trigger.getTrigger()
						.getEvent()).getReference() instanceof EventDefinition)) {
					InferenceResult result1 = sccInferrer.inferType(trigger
							.getTrigger().getEvent());
					if (result1.getType() == null
							|| !typeSystem.isBooleanType(result1.getType())) {
						error(TRIGGER_EXPRESSION,
								SynctextPackage.Literals.REACTION_TRIGGER__GUARD_EXPRESSION);
					}
				}
			}
		} catch (IllegalArgumentException ex) {
			// This is handled by checkExpression
		}
	}

	/**
	 * Only Expressions that produce an effect should be used as actions.
	 * 
	 * @param effect
	 */
	@Check(CheckType.FAST)
	public void checkReactionEffectActions(ReactionEffect effect) {
		for (Expression exp : effect.getActions()) {

			if (!(exp instanceof AssignmentExpression)
					&& !(exp instanceof EventRaisingExpression)) {
				if (exp instanceof FeatureCall) {
					checkFeatureCallEffect((FeatureCall) exp);
				} else if (exp instanceof ElementReferenceExpression) {
					checkElementReferenceEffect((ElementReferenceExpression) exp);
				} else {
					error("Action has no effect.",
							SynctextPackage.Literals.REACTION_EFFECT__ACTIONS,
							effect.getActions().indexOf(exp),
							FEATURE_CALL_HAS_NO_EFFECT);
				}
			} else if (exp instanceof AssignmentExpression) {
				/**
				 * Check that no value is assigned to a pre operator
				 */
				if (((AssignmentExpression) exp).getVarRef() instanceof PreValueExpression) {
					error(PRE_ASSIGNMENT,
							SynctextPackage.Literals.REACTION_EFFECT__ACTIONS);
				}
			}
		}
	}

	/**
	 * Override the method checkElementReferenceEffect() to allows signal firing
	 * (A / S)
	 * 
	 */
	protected void checkFeatureCallEffect(FeatureCall call) {
		if (call.getFeature() != null
				&& !(call.getFeature() instanceof Operation)) {
			if (call.getFeature() instanceof Property) {
				error("Access to property '"
						+ nameProvider.getFullyQualifiedName(call.getFeature())
						+ "' has no effect.", call,
						StextPackage.Literals.FEATURE_CALL__FEATURE,
						INSIGNIFICANT_INDEX, FEATURE_CALL_HAS_NO_EFFECT);
			}
		}
	}

	/**
	 * Override the method checkElementReferenceEffect() to allows signal firing
	 * (A / S)
	 * 
	 */
	protected void checkElementReferenceEffect(ElementReferenceExpression refExp) {
//		if (!(refExp.getReference() instanceof Operation)) {
//			if (refExp.getReference() instanceof Property) {
//				error("Access blo to property '"
//						+ nameProvider.getFullyQualifiedName(refExp
//								.getReference()) + "' has no effect.",
//						refExp,
//						StextPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__REFERENCE,
//						INSIGNIFICANT_INDEX, FEATURE_CALL_HAS_NO_EFFECT);
//			}
//		}
	}

	/**
	 * Check the affection to pre operator
	 * 
	 * @param refExp
	 */
	// @Check(CheckType.FAST)
	// public void checkPreEffectActions(AssignmentExpression exp) {
	// if ((exp instanceof PreValueExpression)) {
	// System.out.println("");
	// }
	// }

	/*********************************************************************************************************
	 * The following methods are override to allow the Injection of sccInferrer
	 * object
	 */
	// @Check(CheckType.FAST)
	// public void checkVariableDefinitionInitialValue(
	// VariableDefinition definition) {
	// Type varType = definition.getType();
	// if (definition.getInitialValue() == null)
	// return;
	// try {
	// Type valType = sccInferrer.getType(definition.getInitialValue());
	// Type combine = tsAccess.combine(valType, varType);
	// if (combine == null || !tsAccess.isAssignable(varType, valType)) {
	// error("Can not assign a value of type '" + valType.getName()
	// + "' to a variable of type '" + varType + "'",
	// StextPackage.Literals.VARIABLE_DEFINITION__INITIAL_VALUE);
	// }
	// } catch (Exception e) {
	// error(e.getMessage(), null);
	// }
	// }

	// @Check(CheckType.FAST)
	// public void checkExpression(final Statement statement) {
	// try {
	// sccInferrer.getType(statement);
	// } catch (TypeCheckException e) {
	// error(e.getMessage(), null);
	// } catch (IllegalArgumentException e) {
	// // This happens, when the expression is not completed for Unhandled
	// // parameter types: [null]
	// // We can safely ignore this exception
	// }
	// }

	@Check(CheckType.FAST)
	public void checkAssignmentExpression(final AssignmentExpression exp) {

		final String name = getVariableName(exp);

		List<AssignmentExpression> contents = EcoreUtil2.eAllOfType(exp,
				AssignmentExpression.class);
		contents.remove(exp);

		Iterable<AssignmentExpression> filter = Iterables.filter(contents,
				new Predicate<AssignmentExpression>() {
					public boolean apply(final AssignmentExpression ex) {
						String variableName = getVariableName(ex);
						return variableName.equals(name);

					}
				});
		if (Iterables.size(filter) > 0) {
			error(ASSIGNMENT_EXPRESSION, null);
		}
	}

	private String getVariableName(AssignmentExpression exp) {
		Expression varRef = exp.getVarRef();
		if (varRef instanceof FeatureCall) {
			Property reference = (Property) ((FeatureCall) varRef).getFeature();
			return reference.getName();
		}
		return null;
	}
	
	/**
	 * Disable the Wrong Number of arguments error
	 *
	 */
	@Override
	@Check(CheckType.FAST)
	public void checkOperationArguments_FeatureCall(final FeatureCall call) {
	}
	@Override
	@Check(CheckType.FAST)
	public void checkOperationArguments_TypedElementReferenceExpression(final ElementReferenceExpression call) {
		
	}
}
