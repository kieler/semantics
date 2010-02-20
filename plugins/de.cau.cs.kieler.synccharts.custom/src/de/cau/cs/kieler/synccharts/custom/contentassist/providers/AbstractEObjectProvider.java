package de.cau.cs.kieler.synccharts.custom.contentassist.providers;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

/**
 * Creates and manages a cache of {@link EObject}s, depending on inheriting
 * initialize.
 * 
 * @author pkl, cku
 * @version 1.0
 */

public abstract class AbstractEObjectProvider {
	private HashMap<String, EObject> elementMap = null;

	/**
	 * Initialize the cache.
	 * 
	 * @param editingTransition
	 * @return
	 */
	public abstract void init(EObject editingElement);

	/**
	 * Returns the element names.
	 * 
	 * @return Array of element names.
	 */
	public String[] getElementNames() {
		if (getElementMap() != null) {
			String[] names = new String[getElementMap().size()];
			return getElementMap().keySet().toArray(names);
		}
		return new String[0];
	}

	/**
	 * Returns a map of name-element pairs.
	 * 
	 * @return Map of EObjects.
	 */
	protected HashMap<String, EObject> getElementMap() {
		if (elementMap != null) {
			return elementMap;
		}
		return new HashMap<String, EObject>();
	}

	/**
	 * Set the EObject map.
	 * 
	 * @param elementMap
	 */
	protected void setElementMap(HashMap<String, EObject> elementMap) {
		this.elementMap = elementMap;
	}

}
