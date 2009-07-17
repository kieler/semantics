package de.cau.cs.kieler.synccharts.custom;

import java.io.ByteArrayInputStream;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Assignment;
import de.cau.cs.kieler.synccharts.ComplexExpression;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.SignalReference;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SuspensionTrigger;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.Variable;
import de.cau.cs.kieler.synccharts.VariableReference;
import de.cau.cs.kieler.synccharts.dsl.parser.XtextParser;

// A wrapper for the xText parser
public class XTextParserWrapper implements IParser {

	private XtextParser parser;
	
	public XTextParserWrapper(Action action) {
	}
	
	public XTextParserWrapper(SuspensionTrigger suspensionTrigger) {
	}

	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	// Method to return the editString of an action or a suspensionTrigger
	public String getEditString(IAdaptable element, int flags) {
		if (element instanceof EObjectAdapter) {
			if (((EObjectAdapter) element).getRealObject() instanceof Action) {
				Action action = (Action) (((EObjectAdapter) element).getRealObject());
				if (action.getTriggersAndEffects() != null) {
					return action.getTriggersAndEffects().replace("INVALID: ", "");
				}
			}
			else if (((EObjectAdapter) element).getRealObject() instanceof SuspensionTrigger) {
				SuspensionTrigger suspensionTrigger = (SuspensionTrigger) (((EObjectAdapter) element).getRealObject());
				if (suspensionTrigger.getTrigger() != null) {
					return suspensionTrigger.getTrigger().replace("INVALID: ", "");
				}
			}
		}
		return "";
	}

	// Return the xText command
	public ICommand getParseCommand(IAdaptable element, String newString, int flags) {
		if (((EObjectAdapter) element).getRealObject() instanceof SuspensionTrigger) {
			return new XTextParseExpressionCommand(element, newString, flags);
		}
		else {
			return new XTextParseCommand(element, newString, flags);
		}
	}

	// Return the print string of an action or a suspensionTrigger
	public String getPrintString(IAdaptable element, int flags) {
		String immediateString = "";
		if (element instanceof EObjectAdapter) {
			if (((EObjectAdapter) element).getRealObject() instanceof Action) {
				Action action = (Action) (((EObjectAdapter) element).getRealObject());
				// If the element is a transition, has a trigger and is immediate, add a '#' to the string
				if (((EObjectAdapter) element).getRealObject() instanceof Transition) {
					Transition transition = (Transition) (((EObjectAdapter) element).getRealObject());
					if ((transition.getTrigger() != null) && (transition.isIsImmediate())) {
						immediateString = "#";
					}
				}
				if (action.getTriggersAndEffects() != null) {
					return immediateString + action.getTriggersAndEffects();
				}
			}
			else if (((EObjectAdapter) element).getRealObject() instanceof SuspensionTrigger) {
				SuspensionTrigger suspensionTrigger = (SuspensionTrigger) (((EObjectAdapter) element).getRealObject());
				// If the suspension trigger is immediate, add a '#' to the string
				if (suspensionTrigger.isImmediate()) {
					immediateString = "#";
				}
				if (suspensionTrigger.getTrigger() != null) {
					return immediateString + suspensionTrigger.getTrigger();
				}
			}
		}
		return "";
	}

	// This wrapper affects notification events
	public boolean isAffectingEvent(Object event, int flags) {
		if (event instanceof Notification) {
			Object feature = ((Notification) event).getFeature();
			if (feature.equals(SyncchartsPackage.eINSTANCE.getAction_TriggersAndEffects())) {
				return true;
			}
			else if (feature.equals(SyncchartsPackage.eINSTANCE.getSuspensionTrigger_Trigger())) {
				return true;
			}
		}
		return false;
	}

	// Check whether the edit string is valid by parsing it
	public IParserEditStatus isValidEditString(IAdaptable element, String editString) {
		try {
			if (element instanceof Action) {
				ByteArrayInputStream stream = new ByteArrayInputStream(editString.getBytes());
				parser = new XtextParser(stream);
				Node node = parser.getParser().parse();
				Action newAction = (Action) node.getModelElement();
				Action action = (Action)element;
				if (checkSignals(action, newAction)) {
					return ParserEditStatus.EDITABLE_STATUS;
				}
			}
			if (element instanceof SuspensionTrigger) {
				ByteArrayInputStream stream = new ByteArrayInputStream(editString.getBytes());
				parser = new XtextParser(stream);
				Node node = parser.getParser().parse();
				Expression newExpression = (Expression) node.getModelElement();
				Expression expression = (Expression) ((SuspensionTrigger) element).getExpression();
				if (checkSignals((SuspensionTrigger) element, expression, newExpression)) {
					return ParserEditStatus.EDITABLE_STATUS;
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ParserEditStatus.UNEDITABLE_STATUS;
	}
			
	// Method to collect all signals declared in state or its parent (+ grandparent etc.) states
	private EList<Signal> collectValidSignals(State state) {
		EList<Signal> newSignals = new BasicEList<Signal>();
		if ((state.getSignals() != null) && (state.getSignals().size() > 0)) {
			newSignals.addAll(state.getSignals());
		}
		if ((state.getParentRegion() != null) && (state.getParentRegion().getParentState() != null)) {
			newSignals.addAll(collectValidSignals(state.getParentRegion().getParentState()));
		}
		return newSignals;
	}
	
	// Methods to check whether the signals are defined correctly
	private boolean checkSignals(Action action, Action newAction) {
		boolean allValid = true;
		boolean oneEqual = false;
		for (Signal s1 : getSignals(newAction)) {
			oneEqual = false;
			EList<Signal> validSignals = new BasicEList();
			if (action instanceof Transition) {
				try {
					validSignals = collectValidSignals((State) ((Region) ((State) ((Transition) action).getSourceState()).getParentRegion()).getParentState());
				} catch (Exception e) {
					return false;
				}
			}
			else {
				try {
					validSignals = collectValidSignals(action.getParentStateEntryAction());
				} catch (Exception e) {
					try {
						validSignals = collectValidSignals(action.getParentStateInnerAction());
					} catch (Exception f) {
						try {
							validSignals = collectValidSignals(action.getParentStateExitAction());
						} catch (Exception g) {
							return false;
						}
					}
				}
			}
			for (Signal s2 : validSignals) {
				if (s1.getName().equals(s2.getName())) {
					oneEqual = true;
					break;
				}
			}
			if (!oneEqual) {
				allValid = false;
				break;
			}
		}
		return allValid;
	}
	
	// A similar method for suspension triggers
	private boolean checkSignals(SuspensionTrigger suspensionTrigger, Expression expression, Expression newExpression) {
		boolean allValid = true;
		boolean oneEqual = false;
		for (Signal s1 : getSignals(newExpression)) {
			oneEqual = false;
			EList<Signal> validSignals = new BasicEList();
			
			validSignals = collectValidSignals(suspensionTrigger.getParentState());
			for (Signal s2 : validSignals) {
				if (s1.getName().equals(s2.getName())) {
					oneEqual = true;
					break;
				}
			}
			if (!oneEqual) {
				allValid = false;
				break;
			}
		}
		return allValid;
	}
	
	private EList<Signal> getSignals(Action action) {
		EList<Signal> signals = getSignals(action.getTrigger());
		EList<Signal> tempSignals;
//		for (Emission e : action.getEmissions()) {
//			tempSignals = getSignals(e);
//			for (Signal s : tempSignals) {
//				if (!signals.contains(s)) {
//					signals.add(s);
//				}
//			}
//		}
//		for (Assignment a : action.getAssignments()) {
//			tempSignals = getSignals(a);
//			for (Signal s : tempSignals) {
//				if (!signals.contains(s)) {
//					signals.add(s);
//				}
//			}
//		}
		for (Effect e : action.getEffects()) {
			tempSignals = getSignals(e);
			for (Signal s : tempSignals) {
				if (!signals.contains(s)) {
					signals.add(s);
				}
			}
		}
		return signals;
	}
	
	private EList<Signal> getSignals(Effect e) {
		if (e instanceof Emission) {
			return getSignals(((Emission) e));
		}
		else if (e instanceof Assignment) {
			return getSignals(((Assignment) e));
		}
		return null;
	}

	private EList<Signal> getSignals(Expression expression) {
		if (expression instanceof SignalReference)
			return getSignals((SignalReference)expression);
		if (expression instanceof VariableReference)
			return getSignals((VariableReference)expression);
		if (expression instanceof ComplexExpression)
			return getSignals((ComplexExpression)expression);
		return null;
	}
	
	private EList<Signal> getSignals(ComplexExpression complexExpression) {
		EList<Signal> signals = new BasicEList<Signal>();
		EList<Signal> tempSignals;
		for (Expression exp : complexExpression.getSubExpressions()) {
			tempSignals = getSignals(exp);
			for (Signal s : tempSignals) {
				if (!signals.contains(s)) {
					signals.add(s);
				}
			}
		}
		return signals;
	}
	
	private EList<Signal> getSignals(Assignment assignment) {
		return getSignals(assignment.getExpression());
	}
	
	private EList<Signal> getSignals(Emission emission) {
		return getSignals(emission.getSignal());
	}
	
	private EList<Signal> getSignals(SignalReference signalRef) {
		return getSignals(signalRef.getSignal());
	}
	
	private EList<Signal> getSignals(VariableReference variableRef) {
		return getSignals(variableRef.getVariable());
	}

	private EList<Signal> getSignals(Variable variable) {
		return new BasicEList<Signal>();
	}

	private EList<Signal> getSignals(Signal signal) {
		EList<Signal> signals = new BasicEList<Signal>();
		signals.add(signal);
		return signals;
	}
}
