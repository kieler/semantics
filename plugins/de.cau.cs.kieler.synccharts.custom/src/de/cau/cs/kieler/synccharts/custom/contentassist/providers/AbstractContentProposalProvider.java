package de.cau.cs.kieler.synccharts.custom.contentassist.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;

/**
 * builds depending on label context a list of {@link IContentProposal}s.
 * 
 * @author pkl, cku
 * @version 1.1
 */
public abstract class AbstractContentProposalProvider implements
		IContentProposalProvider {

	/**
	 * Gets proposals from the inheriting ProposalProvider and generates an array of IContentproposals.<br>
	 * These proposals are filtered by labelcontent and cursorposition.
	 * 
	 * @param contents
	 * @param position
	 * @return array of {@link IContentProposal}s.
	 */
	public IContentProposal[] getProposals(final String contents, final int position) {
		String[] proposals = getProposalsAsStrings();
		if (proposals != null) {
			String name = contents.trim();
			List<IContentProposal> tempProposals = new ArrayList<IContentProposal>();

			for (int i = 0; i < proposals.length; i++) {
				if (proposals[i].startsWith(contents)) {
					tempProposals.add(makeContentProposal(proposals[i], null,
							name.length() + proposals[i].length() + 1));
				}
			}
			IContentProposal[] contentProposals = new IContentProposal[tempProposals
					.size()];
			return tempProposals.toArray(contentProposals);
		}
		// empty array
		return new IContentProposal[0];
	}

	/**
	 * Builds an {@link IContentProposal} with the parsed values.
	 * 
	 * @param proposal
	 * @param position
	 * @param description
	 * @return The content proposal.
	 */
	protected IContentProposal makeContentProposal(final String proposal,
			final String description, final int position) {
		return new IContentProposal() {
			public String getContent() {
				return proposal;
			}

			public String getDescription() {
				return description;
			}

			public String getLabel() {
				return proposal;
			}

			public int getCursorPosition() {
				return position;
			}
		};
	}

	/**
	 * Returns the classifier proposals.
	 * 
	 * @return Array of String proposals.
	 */
	protected abstract String[] getProposalsAsStrings();

}
