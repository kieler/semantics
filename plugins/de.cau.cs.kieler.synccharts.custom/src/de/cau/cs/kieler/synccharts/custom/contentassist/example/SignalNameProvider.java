package de.cau.cs.kieler.synccharts.custom.contentassist.example;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.custom.contentassist.providers.AbstractEObjectProvider;

/**
 * This is a provider for signal. It caches all Signals contained in an
 * editing domains resource set.
 * 
 * @author pkl, cku
 * @version 1.0
 */
public class SignalNameProvider extends AbstractEObjectProvider {

	public static final SignalNameProvider INSTANCE = new SignalNameProvider();

	/**
	 * Initialize the cache by iterating over the resources contained in the
	 * editing domain.
	 * 
	 * @param editingDomain
	 */

	@Override
	public void init(EditingDomain editingDomain) {
		if (editingDomain != null) {
			ResourceSet rs = editingDomain.getResourceSet();
			setElementMap(new HashMap<String, EObject>());
			for (Resource r : rs.getResources()) {
				for (Iterator<EObject> it = r.getAllContents(); it.hasNext();) {
					EObject eObject = it.next();
					if (eObject instanceof Signal) {
						Signal element = (Signal) eObject;
						if (element.getName() != null) {
							getElementMap().put(element.getName(), element);
						}
					}
				}
			}
		}
	}
}