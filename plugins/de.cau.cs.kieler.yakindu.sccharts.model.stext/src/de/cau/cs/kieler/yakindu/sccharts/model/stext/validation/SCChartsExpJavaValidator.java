package de.cau.cs.kieler.yakindu.sccharts.model.stext.validation;

import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.ComposedChecks;
import org.yakindu.base.types.ITypeSystemAccess;
import org.yakindu.base.types.Operation;
import org.yakindu.base.types.Property;
import org.yakindu.base.types.Type;
import org.yakindu.sct.model.sgraph.Statement;
import org.yakindu.sct.model.sgraph.validation.SCTResourceValidator;
import org.yakindu.sct.model.stext.stext.AssignmentExpression;
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression;
import org.yakindu.sct.model.stext.stext.EventRaisingExpression;
import org.yakindu.sct.model.stext.stext.Expression;
import org.yakindu.sct.model.stext.stext.FeatureCall;
import org.yakindu.sct.model.stext.stext.StextPackage;
import org.yakindu.sct.model.stext.stext.VariableDefinition;
import org.yakindu.sct.model.stext.validation.STextJavaValidator;
import org.yakindu.sct.model.stext.validation.TypeCheckException;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.PreValueExpression;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.ReactionEffect;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.ReactionTrigger;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage;
import de.cau.cs.kieler.yakindu.sgraph.validator.SyncGraphJavaValidator;

@ComposedChecks(validators = { SyncGraphJavaValidator.class,
		SCTResourceValidator.class })
public class SCChartsExpJavaValidator extends STextJavaValidator {

	@Inject
	private ISCCTypeInferrer sccInferrer;
	@Inject
	private ITypeSystemAccess tsAccess;
	@Inject
	private IQualifiedNameProvider nameProvider;

	@Check(CheckType.FAST)
	public void checkGuardHasBooleanExpression(ReactionTrigger trigger) {
		if (trigger.getGuardExpression() == null)
			return;
		try {
			Type type = sccInferrer.getType(trigger.getGuardExpression());
			if (!tsAccess.isBoolean(type)) {
				error(GUARD_EXPRESSION,
						SCChartsExpPackage.Literals.REACTION_TRIGGER__GUARD_EXPRESSION);
			}
		} catch (TypeCheckException ex) {
			// This is handled by checkExpression
		}

	}
	
	// /**
	// * Check Testing non-integer variables
	// */
	// @Check(CheckType.FAST)
	// public void checkGuardHasBooleanAction(ReactionTrigger trigger) {
	// EList<EObject> triggers = trigger.getTriggers();
	// for (EObject t:triggers){
	// if(t instanceof RegularEventSpec){
	// Expression event = (((RegularEventSpec) t).getEvent());
	// if(event instanceof ElementReferenceExpression){
	// EObject reference = ((ElementReferenceExpression) event).getReference();
	// VariableDefinition variable = (VariableDefinition) reference;
	// variable.
	// // Resource reference =reference.;
	// System.out.println(reference);
	// }
	// }
	// }
	//
	// }

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

	/**
	 * Verify that no input signals/variables are affected or computed in a
	 * ReactionTrigger
	 */
	// @Check(CheckType.FAST)
	// public void checkReactionTriggerCommitInputs(ReactionTrigger
	// reactionTrigger) {
	// EList<EObject> triggers = reactionTrigger.getTriggers();
	// }

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
							SCChartsExpPackage.Literals.REACTION_EFFECT__ACTIONS,
							effect.getActions().indexOf(exp),
							FEATURE_CALL_HAS_NO_EFFECT);
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
		if (!(refExp.getReference() instanceof Operation)) {
			if (refExp.getReference() instanceof Property) {
				error("Access to property '"
						+ nameProvider.getFullyQualifiedName(refExp
								.getReference()) + "' has no effect.",
						refExp,
						StextPackage.Literals.ELEMENT_REFERENCE_EXPRESSION__REFERENCE,
						INSIGNIFICANT_INDEX, FEATURE_CALL_HAS_NO_EFFECT);
			}
		}
	}

	/**
	 * Check the affection to pre operator
	 * 
	 * @param refExp
	 */
	@Check(CheckType.FAST)
	public void checkPreEffectActions(AssignmentExpression exp) {
		if ((exp instanceof PreValueExpression)) {
			System.out.println("");
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

}
