package de.cau.cs.kieler.synccharts.custom.contentassist.example;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.custom.contentassist.providers.AbstractEObjectProvider;

/**
 * This is a provider for signals. Here is the place where to filter signals and
 * cache them.
 * 
 * @author pkl, cku
 * @version 1.1
 */
public class SignalNameProvider extends AbstractEObjectProvider {

	public static SignalNameProvider INSTANCE = new SignalNameProvider();

	/**
	 * Initialize the cache by collecting all signals of parent states of
	 * editing transition.
	 * 
	 * @param editingTransition
	 */

	@Override
	public void init(EObject editingTransition) {
		if (editingTransition instanceof Transition) {
			setElementMap(new HashMap<String, EObject>());
			ArrayList<Signal> signals = new ArrayList<Signal>();
			EObject eContainer = editingTransition.eContainer();
			if (eContainer != null)
				collectSignalsOfParents(eContainer.eContainer(), signals);
			for (Signal signal : signals) {
				getElementMap().put(signal.getName(), signal);
			}
		}
	}

	/**
	 * collects recursively all signals of states of parents of given
	 * eContainer.
	 * 
	 * @param eContainer
	 * @param signals
	 * @return
	 */
	private ArrayList<Signal> collectSignalsOfParents(EObject eContainer,
			ArrayList<Signal> signals) {
		if (eContainer != null) {
			if (eContainer instanceof State) {
				signals.addAll(((State) eContainer).getSignals());
			}
			collectSignalsOfParents(eContainer.eContainer(), signals);
		}
		return signals;
	}

}