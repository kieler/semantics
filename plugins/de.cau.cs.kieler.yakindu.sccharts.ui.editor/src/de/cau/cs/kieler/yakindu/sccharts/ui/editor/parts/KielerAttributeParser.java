package de.cau.cs.kieler.yakindu.sccharts.ui.editor.parts;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import de.itemis.gmf.runtime.commons.parsers.AttributeParser;

public class KielerAttributeParser extends AttributeParser {

	private final EAttribute attribute;

	public KielerAttributeParser(EAttribute attribute, String pluginId) {
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
