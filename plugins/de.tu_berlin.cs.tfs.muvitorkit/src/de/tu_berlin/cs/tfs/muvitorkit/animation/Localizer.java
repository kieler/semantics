package de.tu_berlin.cs.tfs.muvitorkit.animation;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;

/**
 * <p>
 * Data class describing a location (possibly indirect through a model element)
 * and the size factor an {@link AnimatedElement} should be set to when reaching
 * this {@link Localizer} while following its path. <br>
 * Some methods allow retrieving absolute values respecting a viewport's offset
 * and zoom scale. <br>
 * A Localizer may need interpolation before resolving it's location or size
 * factor, serving as a place holder in an {@link AnimatedElement}s path.
 * </p>
 * 
 * <p>
 * This class is not intended for direct usage. It will be used properly by
 * {@link AnimatedElement}s.
 * </p>
 * 
 * @author Tony Modica
 */
final class Localizer {

	/**
	 * A target model element specifying a location which will be retrieved in a
	 * viewer context by it's edit parts.
	 */
	private EObject targetModel;

	/**
	 * The absolute location to be taken into account when resolving the bounds
	 * of this Localizer.
	 */
	private Point absoluteLocation;

	/**
	 * The relative size factor to be taken into account when resolving the
	 * bounds of this Localizer. A -1 will mark it as to be interpolated. This
	 * field will be overwritten with the appropriate value by the
	 * interpolation!
	 */
	double sizeFactor;

	/**
	 * Transient data field used to store resolved and interpolated results. May
	 * be null if no editPart for targetModel could be found in viewer This
	 * should be accessed only after calling
	 * {@link #resolveLocation(EditPartViewer)} and, if needed, interpolating in
	 * AnimatedElement.
	 */
	Point resolvedLocation;

	/**
	 * Main constructor for {@link Localizer}s with a relative size
	 * specification. If the passed object is <code>null</code> this
	 * {@link Localizer} will need to be interpolated.
	 * 
	 * @param object
	 *            Object used to resolve location of this Localizer in viewers.
	 *            Use <code>null</code> if location is meant to be interpolated.
	 * @param sizeFactor
	 *            double scaling factor used to resolve size of this Localizer
	 *            in viewers. Use 1 for no size change and -1 if size is meant
	 *            to be interpolated.
	 * 
	 */
	protected Localizer(final Object object, final double sizeFactor) {
		// to avoid zero-division we do not allow a size factor of 0
		if (sizeFactor != 0) {
			this.sizeFactor = sizeFactor;
		} else {
			this.sizeFactor = 0.01;
		}
		if (object instanceof EObject) {
			targetModel = (EObject) object;
		} else if (object instanceof GraphicalEditPart) {
			targetModel = (EObject) ((GraphicalEditPart) object).getModel();
		} else if (object instanceof Point) {
			absoluteLocation = (Point) object;
		} else if (object == null) {
		} else {
			throw new IllegalArgumentException(
					"Localizer must be defined with EObject, GraphicalEditPart or Point!");
		}
	}

	/**
	 * <p>
	 * Tries to resolve the center location the figure should be set to when
	 * reaching this Localizer. These bounds will be absolute, i.e. relative to
	 * a zoom level of 1.0 and a viewport offset of (0,0)!
	 * </p>
	 * 
	 * <p>
	 * This method should be called always when considering a Localizer in a
	 * viewer context. Afterwards it may still need to be interpolated which can
	 * be checked with {@link #needsInterpolation(boolean)};
	 * 
	 * @param viewer
	 *            The viewer context to resolve locations and sizes of the
	 *            actual figures
	 * @param animatedModel
	 *            The model of the host AnimatedElement. Used for resolving a
	 *            more appropriate location here. This may be null, the animated
	 *            element is a custom figure without hosting edit part then.
	 * @return The resolved bounds for convenience. May be <code>null</code> if
	 *         no edit part can be found for the target model or if
	 *         interpolation is needed.
	 * 
	 * @see #needsInterpolation(boolean)
	 */
	/**
	 * @param viewer
	 * 
	 * @return
	 */
	@SuppressWarnings("null")
	final Point resolveLocation(final EditPartViewer viewer,
			final EObject animatedModel) {
		// shortcut if already resolved
		if (resolvedLocation != null) {
			return resolvedLocation;
		}

		Assert.isTrue(viewer != null, "Localizer needs viewer for resolving!");
		/*
		 * if a model has been set as locating object find the figure of its
		 * editpart and translate the location to absolute
		 */
		if (targetModel != null) {
			final GraphicalEditPart targetEditPart = (GraphicalEditPart) viewer
					.getEditPartRegistry().get(targetModel);
			if (targetEditPart == null) {
				return null;
			}
			/*
			 * if target model is the animated model then use models figure's
			 * bounds, otherwise use the content pane's bounds. This looks much
			 * better and prevents the figure to hop in the first and last step,
			 * if it starts/ends on its original positions
			 */
			final IFigure targetFigure = targetModel == animatedModel ? targetEditPart
					.getFigure()
					: targetEditPart.getContentPane();
			resolvedLocation = targetFigure.getBounds().getCenter();
			targetFigure.translateToAbsolute(resolvedLocation);

			final Point viewportOffset = ((FigureCanvas) viewer.getControl())
					.getViewport().getViewLocation();
			resolvedLocation.translate(viewportOffset);
			final ScalableFreeformRootEditPart root = (ScalableFreeformRootEditPart) viewer
					.getRootEditPart();
			final double zoomLevel = root.getZoomManager().getZoom();
			resolvedLocation.scale(1 / zoomLevel);
		} else if (absoluteLocation != null) {
			resolvedLocation = absoluteLocation;
		}
		return resolvedLocation;
	}

	/**
	 * Check if location/size has to be interpolated.
	 * 
	 * @param forLocation
	 *            switch to choose between interrogation of possible location or
	 *            size interpolation
	 * @return whether the location/size of this localizer would not be resolved
	 *         completely by {@link #resolveLocation(EditPartViewer)}.
	 */
	final boolean needsInterpolation(final boolean forLocation) {
		if (forLocation) {
			return absoluteLocation == null && targetModel == null;
		}
		return sizeFactor <= 0;
	}

	@Override
	final public String toString() {
		final StringBuilder buffer = new StringBuilder();
		if (absoluteLocation != null) {
			buffer.append("!");
			buffer.append(absoluteLocation);
		}
		if (sizeFactor != -1) {
			buffer.append("Size<");
			buffer.append(sizeFactor);
			buffer.append(">");
		}
		buffer.append("@");
		if (needsInterpolation(true)) {
			buffer.append("L?");
		}
		if (resolvedLocation != null) {
			buffer.append(resolvedLocation);
		}
		if (needsInterpolation(true)) {
			buffer.append("S?");
		}
		if (null != targetModel) {
			buffer.append(targetModel);
		}
		return buffer.toString();
	}

}