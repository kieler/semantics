package de.tu_berlin.cs.tfs.muvitorkit.gef.directedit;

import de.tu_berlin.cs.tfs.muvitorkit.gef.editparts.AdapterConnectionEditPart;
import de.tu_berlin.cs.tfs.muvitorkit.gef.editparts.AdapterGraphicalEditPart;
import de.tu_berlin.cs.tfs.muvitorkit.gef.editparts.AdapterTreeEditPart;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ICellEditorValidator;

/**
 * Interface for providing necessary information to
 * {@link MuvitorTreeDirectEditManager} and {@link MuvitorTreeDirectEditPolicy}.
 * For {@link AdapterTreeEditPart}s only!
 * 
 * <p>
 * If you want {@link AdapterGraphicalEditPart}s or
 * {@link AdapterConnectionEditPart}s to support direct editing you have to let
 * them implement {@link IGraphicalDirectEditPart} instead.
 * 
 * @author "Tony Modica"
 * 
 */
public interface IDirectEditPart {

	/**
	 * @return The featureID from the EMF model's {@link EPackage} that
	 *         describes the feature of this edit part's model to be edited by
	 *         the direct edit manager.
	 */
	public int getDirectEditFeatureID();

	/**
	 * Optionally, you may pass a validator whose returned error message will be
	 * shown while direct editing. If the returned string is <code>null</code>
	 * or "" the current value of the cell editor is considered as valid.
	 * Example:
	 * 
	 * <pre>
	 * return new ICellEditorValidator() {
	 * 	&#064;Override
	 * 	public String isValid(Object value) {
	 * 		if (((String) value).length() % 2 == 1) {
	 * 			return &quot;No names with odd length!&quot;;
	 * 		}
	 * 		return null;
	 * 	};
	 * </pre>
	 * 
	 * @return a validator or <code>null</code>
	 */
	public ICellEditorValidator getDirectEditValidator();

	/**
	 * Interface for providing necessary information to
	 * {@link MuvitorDirectEditManager} and {@link MuvitorDirectEditPolicy}. For
	 * {@link AdapterGraphicalEditPart}s or {@link AdapterConnectionEditPart}s
	 * only!
	 * 
	 * <p>
	 * If you want {@link AdapterTreeEditPart}s to support direct editing you
	 * have to let them implement {@link IDirectEditPart} instead.
	 * 
	 * @author "Tony Modica"
	 * 
	 */
	public interface IGraphicalDirectEditPart extends IDirectEditPart {
		/**
		 * Usually, this method returns the bounds of some {@link Label}
		 * displaying the value that should be edited directly.
		 * 
		 * @return the bounds to position the cell editor for direct editing
		 */
		public Rectangle getValueLabelTextBounds();

		/**
		 * Usually, this method sets the value as text to the {@link Label}
		 * whose bounds are used to position the cell editor.
		 * 
		 * @param value
		 *            the current value of the direct edit cell editor, for
		 *            updating the edit part's figure during direct editing
		 */
		public void updateValueDisplay(String value);

	}
}
