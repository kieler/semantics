/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.validation;

import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.ComposedChecks;
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

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType;
import de.cau.cs.kieler.yakindu.model.sgraph.validator.SyncGraphJavaValidator;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.PreReferenceExpression;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage;

/**
 * This class implements the validator for the textual description language. It
 * extends the Yakindu Validator which contains validity rules also used by this
 * project.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 * 
 */
@ComposedChecks(validators = { SyncGraphJavaValidator.class,
		SCTResourceValidator.class })
public class SynctextJavaValidator extends STextJavaValidator {

	public static final String TRIGGER_EXPRESSION = "A trigger should be a signal or a variable of type boolean";
	public static final String PRE_ASSIGNMENT = "Can not assign a value to a pre operator";
        private static final String NORMALTERMINATION_WITH_TRIGGER = "A normal termination may not have a trigger.";

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
	    
// TODO: Changed Synctext grammar, code below needs fix? 	    
//		try {
//			//
//			if (trigger.getGuardExpression() != null) {
//				if (trigger.getGuardExpression() instanceof AssignmentExpression) {
//					error(GUARD_EXPRESSION,
//							SynctextPackage.Literals.REACTION_TRIGGER__GUARD_EXPRESSION);
//				} else {
//					InferenceResult result = sccInferrer.inferType(trigger
//							.getGuardExpression());
//					if (result.getType() == null
//							|| !typeSystem.isBooleanType(result.getType())) {
//						error(GUARD_EXPRESSION,
//								SynctextPackage.Literals.REACTION_TRIGGER__GUARD_EXPRESSION);
//					}
//				}
//			} else if (trigger.getTrigger() != null) {
//				if (!(((ElementReferenceExpression) trigger.getTrigger()
//						.getEvent()).getReference() instanceof EventDefinition)) {
//					InferenceResult result1 = sccInferrer.inferType(trigger
//							.getTrigger().getEvent());
//					if (result1.getType() == null
//							|| !typeSystem.isBooleanType(result1.getType())) {
//						error(TRIGGER_EXPRESSION,
//								SynctextPackage.Literals.REACTION_TRIGGER__GUARD_EXPRESSION);
//					}
//				}
//			}
//		} catch (IllegalArgumentException ex) {
//			// This is handled by checkExpression
//		}
	}

	
      /**
      * Verify that a normal termination transition has no trigger-expression (it may habe priority!)
      * 
      */
     @Check(CheckType.FAST)
     public void disallowTrigger(SyncTransition transition) {
             if (transition.getType() == TransitionType.NORMALTERMINATION
                             && transition.getTrigger() != null) {
                     if (transition.getTrigger() instanceof ReactionTrigger) {
                         ReactionTrigger trigger = (ReactionTrigger) transition.getTrigger();
                         Expression expression = trigger.getExpression();
                         if (expression != null) {
                             error(NORMALTERMINATION_WITH_TRIGGER, transition, null, -1);
                         }
                     }
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
				if (((AssignmentExpression) exp).getVarRef() instanceof PreReferenceExpression) {
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
