package de.cau.cs.kieler.yakindu.ui.editor.parts;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.yakindu.base.base.BasePackage;
import org.yakindu.sct.ui.editor.DiagramActivator;
import org.yakindu.sct.ui.editor.editparts.RegionNameEditPart;

public class SyncRegionNameEditPart extends RegionNameEditPart {

	public IParser getParser() {
		return new SyncAttributeParser(
				BasePackage.Literals.NAMED_ELEMENT__NAME,
				DiagramActivator.PLUGIN_ID);
	}

	public String getEditText() {
		return getParser().getEditString(
				new EObjectAdapter(resolveSemanticElement()), -1);
	}
}
