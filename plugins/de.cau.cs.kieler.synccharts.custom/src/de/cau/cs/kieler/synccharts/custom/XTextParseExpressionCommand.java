package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import de.cau.cs.kieler.synccharts.SuspensionTrigger;

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
		super(TransactionUtil.getEditingDomain(((SuspensionTrigger) (((EObjectAdapter) element).getRealObject()))), newString, null);
		this.element = element;
		this.string = newString;
	}
	
}
