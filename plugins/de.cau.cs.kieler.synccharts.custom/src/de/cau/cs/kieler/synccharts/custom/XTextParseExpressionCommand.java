/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

/**
 * A special command with a different constructor to parse expressions.
 * @author schm
 *
 */
public class XTextParseExpressionCommand extends XTextParseCommand {

	/**
	 * The constructor
	 * @param element The element to change.
	 * @param newString The string to parse.
	 * @param flags Some flags.
	 */
	// A special command for parsing Expressions
	public XTextParseExpressionCommand(IAdaptable element, String newString, int flags) {
		super(TransactionUtil.getEditingDomain((/*(SuspensionTrigger)*/ (((EObjectAdapter) element).getRealObject()))), newString, null);
		this.element = element;
		this.string = newString;
	}
	
}
