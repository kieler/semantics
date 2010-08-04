package de.tu_berlin.cs.tfs.muvitorkit.animation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.ui.part.PageBookView;

/**
 * Interface used by {@link AnimatedElement} to retrieve a
 * {@link GraphicalViewer} showing a specified model element from a
 * {@link PageBookView} that implements this interface.
 * 
 * @author "Tony Modica"
 */
public interface IGraphicalViewerProvider {

	/**
	 * Method to get the viewer showing a specific model. Added to support
	 * AnimatingCommand in finding the viewer in which it should animate some
	 * figures.
	 * <p>
	 * A sample implementation could look like this:
	 * 
	 * <pre>
	 * public GraphicalViewer getViewer(final EObject model) {
	 * 	for (final GraphicalViewer viewer : viewers) {
	 * 		if (viewer.getContents() != null
	 * 				&amp;&amp; viewer.getContents().getModel() == model) {
	 * 			return viewer;
	 * 		}
	 * 	}
	 * 	return null;
	 * }
	 * </pre>
	 * 
	 * </p>
	 * 
	 * @param model
	 *            the model element shown in the viewer
	 * @return a viewer showing the passed model if it exists, otherwise
	 *         <code>null</code>
	 */

	public GraphicalViewer getViewer(final EObject model);

}
