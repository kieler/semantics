package de.cau.cs.kieler.synccharts.custom.contentassist.part;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.fieldassist.ContentAssistCommandAdapter;

/**
 * Extends {@link TextDirectEditManager} to support
 * {@link ContentProposalAdapter}.
 * 
 * @author pkl, cku
 * @version 1.1
 */
public class LabelDirectEditManager extends TextDirectEditManager {

	private IContentProposalProvider proposalProvider;

	/**
	 * Extended Constructor.
	 * 
	 * @param source
	 * @param editorType
	 * @param locator
	 * @param proposalProvider
	 */
	public LabelDirectEditManager(GraphicalEditPart source, Class editorType,
			CellEditorLocator locator, IContentProposalProvider proposalProvider) {
		super(source, editorType, locator);
		this.proposalProvider = proposalProvider;
	}

	/**
	 * Extended initCellEditor method. Adding a
	 * {@link ContentAssistCommandAdapter}.
	 * 
	 * @see org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager#initCellEditor()
	 * @inheritDoc
	 */
	@Override
	protected void initCellEditor() {
		super.initCellEditor();
		Text text = (Text) getCellEditor().getControl();
		if (proposalProvider != null) {

			// after typing "activation characters" content assist pops up
			// with entered
			// delay (see contentAdapter.setAutoActivationDelay(...)).
			// char[] autoActivationCharacters = new char[] { '.' };

			ContentAssistCommandAdapter contentAdapter = new ContentAssistCommandAdapter(
					text, new TextContentAdapter(), proposalProvider,
					ContentAssistCommandAdapter.CONTENT_PROPOSAL_COMMAND, null);
			contentAdapter
					.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
			contentAdapter.setPropagateKeys(true);
		}
	}
}