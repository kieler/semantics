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
package de.cau.cs.kieler.yakindu.ui.editor.parts;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import de.itemis.gmf.runtime.commons.parsers.AttributeParser;

/**
 * This class extends the Attribute parser to skip the <name> text if a region
 * or a state has no name.
 * 
 * @author Bob
 * @kieler.rating green 2013-04-13
 * 
 */
public class SyncAttributeParser extends AttributeParser {

	private final EAttribute attribute;

	/**
	 * The constructor initializes the super constructor and the attribute
	 * value.
	 * 
	 * @param attribute
	 * @param pluginId
	 */
	public SyncAttributeParser(EAttribute attribute, String pluginId) {
		super(attribute, pluginId);
		this.attribute = attribute;
	}

	/**
	 * Override this method to skip the <name> text in a Region.
	 */
	@Override
	public String getEditString(IAdaptable adapter, int flags) {
		EObject element = (EObject) adapter.getAdapter(EObject.class);
		if (element.eGet(attribute) != null) {
			return String.valueOf(element.eGet(attribute));
		} else {
			return "";
		}
	}

}
