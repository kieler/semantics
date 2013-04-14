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

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.yakindu.base.base.BasePackage;
import org.yakindu.sct.ui.editor.DiagramActivator;
import org.yakindu.sct.ui.editor.editparts.RegionNameEditPart;

/**
 * This class extends the RegionNameEditPart to skip the <name> text if a region
 * has no name.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 */
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
