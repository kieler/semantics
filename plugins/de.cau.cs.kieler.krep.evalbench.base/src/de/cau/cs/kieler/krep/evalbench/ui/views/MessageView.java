package de.cau.cs.kieler.krep.evalbench.ui.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * A View for logging of arbitrary messages to targets.
 * 
 * @author ctr
 */
public class MessageView extends ViewPart {

	/** The identifier string for this view */
	public static final String VIEW_ID = "de.cau.cs.kieler.krep.evalbench.ui.views.message";

	/** The viewer used to display connection logs */
	private static TextViewer viewer;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// create text viewer
		viewer = new TextViewer(parent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	/*
	 * display message
	 */
	/**
	 * @param data
	 *            message
	 */
	public static void print(String data) {
		if(viewer !=null){
			viewer.append(data + "\n");
		}
	}

	/**
	 * Gets the text viewer.
	 * 
	 * @return text viewer
	 */
	public TextViewer getViewer() {
		return viewer;
	}
}
