package de.cau.cs.kieler.synccharts.custom.contentassist.example;

import de.cau.cs.kieler.synccharts.custom.contentassist.providers.AbstractContentProposalProvider;

/**
 * Content proposal provider for the property fieldassist processor.
 * 
 * @author pkl, cku
 * @version 1.0
 */
public class SignalNameContentProposalProvider extends
		AbstractContentProposalProvider {

	/**
	 * Constructor.
	 * 
	 * @param proposals
	 */
	public SignalNameContentProposalProvider() {
		super();
	}

	@Override
	protected String[] getProposalsAsStrings() {
		return SignalNameProvider.INSTANCE.getElementNames();
	}	
}