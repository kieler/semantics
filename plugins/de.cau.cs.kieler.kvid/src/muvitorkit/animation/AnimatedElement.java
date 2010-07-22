package muvitorkit.animation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.ScalableFreeformLayeredPane;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.LayerManager;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.IPageBookViewPage;
import org.eclipse.ui.part.PageBookView;

/**
 * This class represents a (model) element to be animated in some viewer which
 * is determined by a context parent element. It manages its {@link Localizer}s
 * and preparation of animation. AnimatedElements respond to the flag
 * {@link AnimatingCommand#isDebug()} by drawing a line that shows the path of
 * the animated figure.
 *
 * <p>
 * This class is not intended for direct usage! It will be used properly by
 * {@link AnimatingCommand}s.
 * </p>
 *
 * <p>
 * The animating command calls {@link #prepareForAnimation(boolean)} for all
 * animated elements. When performing a step, the animating command calls
 * {@link #prepareStep(int)} for all involved animated elements before running
 * the animation. Eventually, all animated elements are being reset by calling
 * {@link #animationDone()}.
 * </p>
 *
 * @author Tony Modica
 *
 */
final class AnimatedElement extends LayoutListener.Stub {

	/**
	 * A map for general allowing {@link MultipleAnimator} to access data for
	 * the animatedFigure on the observed pane.
	 */
	final static private Map<IFigure, AnimatedElement> paneAnimatedElementMap = new HashMap<IFigure, AnimatedElement>();

	/**
	 * The model element whose figure in a specific viewer is to be animated (if
	 * no figure to be animated is explicitly defined).
	 */
	final EObject animatedModel;

	/**
	 * A container model being an (indirect) parent of {@link #animatedModel}.
	 * The viewer having this container as contents (determined by
	 * {@link #findViewerShowing(EObject)}) will be used for animation .
	 */
	final private EObject topModel;

	/**
	 * An ArrayList of {@link Localizer}s defining the path of this animated
	 * element.
	 */
	private final ArrayList<Localizer> path = new ArrayList<Localizer>();

	/**
	 * This holds the position of the first Localizer not being a place holder,
	 * i.e. the real starting location.
	 */
	private int startIndex;

	/**
	 * The resolved figure in the determined viewer for the model. Or a custom
	 * figure to be animated, so that there is no need for a resolved figure.
	 */
	IFigure animatedFigure;

	/**
	 * {@link #animationDone()} will store these locations after animation. They
	 * can be retrieved with {@link AnimatingCommand#getFinalLocation(Object)}
	 * and {@link AnimatingCommand#getInitalLocation(Object)}.
	 */
	Point initialLocation;
	Point finalLocation;

	/**
	 * A path modifier that will be used for calculating the coordinates the
	 * figure to be animated should follow.
	 */
	private final AnimationPathModifier pathModifier;

	/**
	 * transient data fields to perform the animation, will be set null in
	 * {@link #animationDone()}
	 */
	private GraphicalViewer viewer;
	private Polyline debugLine;
	private IFigure originalParent;
	private int originalPosition;
	private Point originalLocation;
	private IFigure layer;
	private boolean canPerform = false;
	private ScalableFreeformLayeredPane pane;
	private double currentSizeFactor;
	// initialization for first step to perform
	private double nextSizeFactor = 1.0;
	private Dimension figureCenterOffset;

	/**
	 * Universal constructor.
	 *
	 * @param modelOrEditPartOrFigure
	 *            can be an {@link GraphicalEditPart} or {@link EObject}
	 *            determining the model whose figure should be animated.
	 *            Alternatively, you may pass a specific {@link IFigure} to be
	 *            animated.
	 * @param viewerOrContents
	 *            can be an {@link EObject} or {@link EditPartViewer}
	 *            determining the viewer holding a figure of the model
	 * @param pathModifier
	 *            optional {@link AnimationPathModifier}
	 */
	AnimatedElement(final Object modelOrEditPartOrFigure,
			final Object viewerOrContents,
			final AnimationPathModifier pathModifier) {
		// determine model to be animated
		if (modelOrEditPartOrFigure instanceof GraphicalEditPart) {
			animatedModel = (EObject) ((GraphicalEditPart) modelOrEditPartOrFigure)
					.getModel();
		} else if (modelOrEditPartOrFigure instanceof EObject) {
			animatedModel = (EObject) modelOrEditPartOrFigure;
		} else if (modelOrEditPartOrFigure instanceof IFigure) {
			animatedModel = null;
			animatedFigure = (IFigure) modelOrEditPartOrFigure;
		} else {
			throw new IllegalArgumentException(
					"AnimatedElement must be initialized with an EObject, GraphicalEditPart, or IFigure!");
		}

		// determine context topModel
		if (viewerOrContents instanceof EObject) {
			topModel = (EObject) viewerOrContents;
		} else if (viewerOrContents instanceof EditPartViewer) {
			final ScrollingGraphicalViewer contentsViewer = (ScrollingGraphicalViewer) viewerOrContents;
			topModel = (EObject) contentsViewer.getContents().getModel();
		} else {
			throw new IllegalArgumentException(
					"AnimatedElement must be initialized with a top-level EObject or EditPartViewer!");
		}
		// select standard path modifier if none has been specified
		if (pathModifier == null) {
			this.pathModifier = AnimationPathModifier.getStandardModifier();
		} else {
			this.pathModifier = pathModifier;
		}
		startIndex = -1;
	}

	/**
	 * Convenience method. Use carefully with size changes!
	 *
	 * Adds a {@link Localizer}, relying on the passed object, to the path of
	 * this animated element. locationObject is used to resolve its location in
	 * a viewer context. If locationObject is not null the size factor is fixed
	 * to 1, avoiding size change. Otherwise the size factor will be set to -1
	 * to force interpolation.
	 *
	 * @param locationObject
	 *            If <code>null</code>, the added {@link Localizer} will be
	 *            interpolated completely.
	 *
	 * @see Localizer#Localizer(Object)
	 */
	final void addStep(final Object locationObject) {
		if (locationObject == null) {
			// add place holder to be interpolated
			addPlaceholderStep();
		} else {
			addStep(locationObject, 1);
		}
	}

	/**
	 * Adds a {@link Localizer} relying on the passed objects to the path of
	 * this animated element. These objects are used to resolve a location and a
	 * size in a viewer context. Look at the {@link Localizer} constructors for
	 * details.
	 *
	 * @param locationObject
	 * @param sizeFactor
	 *
	 * @see Localizer#Localizer(Object, double)
	 */
	final void addStep(final Object locationObject, final double sizeFactor) {
		// remember first non-interpolated localizer
		if (startIndex == -1 && locationObject != null) {
			startIndex = path.size();
		}
		path.add(new Localizer(locationObject, sizeFactor));
	}

	/**
	 * Adds a {@link Localizer} to the path which will be completely
	 * interpolated.
	 */
	final void addPlaceholderStep() {
		path.add(new Localizer(null, -1));
	}

	/**
	 * Called by {@link AnimatingCommand}, initializes the animation by doing
	 * the following:
	 *
	 * <ul>
	 * <li>determine the viewer having the {@link #topModel} as contents
	 * <li>get the figure representing the {@link #animatedModel} in this viewer
	 * <li>create an extra layer for this particular figure and move the figure
	 * to it
	 * <li>register this as LayoutListener to the new layer. This will do the
	 * job that Animator does in GEF.
	 * <li>call {@link #prepareLocalizers()}
	 * <li>check if this figure can be animated at all
	 * <li>set the figure' bounds to the initial (or final for undo) position
	 * </ul>
	 *
	 * @param isUndo
	 *            set <code>true</code> if the element should be prepared for
	 *            backwards undo animation
	 * @param doFlush
	 *            if <code>true</code> the viewer will be flushed before
	 *            animation
	 *
	 * @see #findViewerShowing(EObject)
	 */
	final void prepareForAnimation(final boolean isUndo, final boolean doFlush) {
		viewer = findViewerShowing(topModel);
		// short test if an animation is possible at all
		if (viewer == null || startIndex == -1
				|| !viewer.getControl().isVisible()) {
			canPerform = false;
			return;
		}

		// to remove disturbing handles: set empty selection
		viewer.setSelection(StructuredSelection.EMPTY);
		/*
		 * there may be a new figure that has just been created, flush the
		 * viewer to layout it correctly first! this is in the responsibility of
		 * the user!
		 */
		if (doFlush) {
			viewer.flush();
		}

		// prepare and check localizers
		prepareLocalizers();
		/*
		 * ensure that this can only be animated if the localizers (after
		 * startIndex) have been sufficiently resolved/interpolated
		 */
		for (int i = startIndex; i < path.size(); i++) {
			final Localizer localizer = path.get(i);
			if (localizer.needsInterpolation(true)
					|| localizer.needsInterpolation(false)) {
				canPerform = false;
				return;
			}
		}

		/*
		 * retrieve a figure from the viewer whenever a model has been specified
		 * so the animated figure can still be accessed after animation
		 */
		if (animatedModel != null) {
			final GraphicalEditPart editPart = (GraphicalEditPart) viewer
					.getEditPartRegistry().get(animatedModel);
			if (editPart == null) {
				canPerform = false;
				return;
			}

			// the figure of the passed model has to be animated
			animatedFigure = editPart.getFigure();
			// store original parent of the model's figure
			originalParent = animatedFigure.getParent();
			originalPosition = originalParent.getChildren().indexOf(
					animatedFigure);
			originalLocation = animatedFigure.getBounds().getLocation();
		}

		figureCenterOffset = animatedFigure.getSize().scale(-0.5);
		// System.out.println("figureCenterOffset : " + figureCenterOffset);

		// store initial and final locations of the animated figure
		initialLocation = path.get(startIndex).resolvedLocation;
		if (initialLocation != null) {
			initialLocation.getTranslated(figureCenterOffset);
		}
		finalLocation = path.get(path.size() - 1).resolvedLocation;
		if (finalLocation != null) {
			finalLocation.getTranslated(figureCenterOffset);
		}

		/*
		 * get the ScalableFreeformLayeredPane of the
		 * ScalableFreeformRootEditPart to put the animated figure on it
		 */
		final ScalableFreeformRootEditPart root = (ScalableFreeformRootEditPart) viewer
				.getRootEditPart();
		layer = LayerManager.Helper.find(root).getLayer(
				LayerConstants.SCALABLE_LAYERS);

		/*
		 * install sub-ScalableLayeredPanes on the pane to support scale
		 * manipulation of each animated element
		 */
		pane = new ScalableFreeformLayeredPane();
		layer.add(pane);
		pane.add(animatedFigure);

		pane.validate();
		pane.addLayoutListener(this);
		// let the MultipleAnimator know which AnimatedElement is
		// responsible for this pane (and to access data)
		paneAnimatedElementMap.put(pane, this);

		// draw optional debug path line
		if (AnimatingCommand.isDebug()) {
			// when debugging show the path as a polyline
			debugLine = new Polyline();
			debugLine.setForegroundColor(ColorConstants.red);
			// use rectangle centers for the debugLine
			if (isUndo) {
				debugLine.setStart(finalLocation);
			} else {
				debugLine.setStart(initialLocation);
			}
			// FIXED: I don't know why, but the line has to been added *before*
			// the animated figure. Does not matter any more, as I use an extra
			// pane for each animated figure
			layer.add(debugLine);
		}

		canPerform = true;
	}

	/**
	 * Called by {@link #prepareForAnimation(boolean)} to resolve and to cache
	 * the first not interpolated {@link Localizer} (for the case that its model
	 * is targeted by some Localizer). After that the rest of the
	 * {@link Localizer} {@link #path} is resolved to determine their
	 * {@link Localizer#needsInterpolation(boolean)} status. These are
	 * interpolated (if needed) by calling
	 * {@link #performInterpolation(boolean)}.
	 */
	final private void prepareLocalizers() {
		/*
		 * try to resolve first location and check if interpolation is possible
		 * at all
		 */
		if (path.get(startIndex).resolveLocation(viewer, animatedModel) == null) {
			throw new IllegalArgumentException(
					"Start Localizer can not be found or needs (partial) interpolation in this animated element: "
							+ toString());
		}

		/*
		 * try to resolve locations and sizes in Localizers as far as possible
		 */
		for (int i = startIndex; i < path.size(); i++) {
			path.get(i).resolveLocation(viewer, animatedModel);
		}

		// interpolate locations and size factors independently, but size
		// factors first!
		performInterpolation(false);
		performInterpolation(true);

		/*
		 * TODO add annotation Figure (with isStatic) (with Pointer or
		 * Connection) data to Localizer
		 */

		/*
		 * TODO add glowing Figure data to Localizer and interpolate brightness
		 * to target color
		 */

		/*
		 * TODO generalize interpolation mechanism, but the location is the most
		 * important value that must be defined for "important" localizers!
		 * Glow, size change, and annotation are considered optional
		 */
	}

	/**
	 * Called by {@link #prepareLocalizers()}. Interpolates the
	 * {@link Localizer}s in the {@link #path} that need interpolation by
	 * calculating a delta for {@link Localizer}s between sufficiently specified
	 * {@link Localizer}s. This results in a linear interpolation of locations
	 * and sizes.
	 *
	 * @param isForLocation
	 *            determined whether locations or sizes of the {@link Localizer}
	 *            {@link #path} should be interpolated.
	 */
	final private void performInterpolation(final boolean isForLocation) {
		/*
		 * interpolate (after the first defined Localizer on) where needed
		 */
		int i = startIndex + 1;
		interpolate: while (i < path.size() - 1) {
			Localizer currentLocalizer = path.get(i);
			if (!currentLocalizer.needsInterpolation(isForLocation)) {
				// location/size is already resolved
				i++;
				continue interpolate;
			}

			// find next non-interpolated Localizer
			int nextDefLocIndex = -1;
			for (int j = i + 1; j <= path.size() - 1; j++) {
				if (!path.get(j).needsInterpolation(isForLocation)) {
					nextDefLocIndex = j;
					break;
				}
			}

			// base is the previous (resolved) localizer
			Localizer base = path.get(i - 1);

			// if i is beyond the last non-interpolated location/sizeFactor just
			// copy the previous value to prevent any animation
			if (nextDefLocIndex == -1) {
				if (isForLocation) {
					currentLocalizer.resolvedLocation = base.resolvedLocation
							.getCopy();
				} else {
					currentLocalizer.sizeFactor = base.sizeFactor;
				}
				continue interpolate;
			}

			// build interpolation delta data for this range of Localizers
			Dimension locDelta = null;
			double sizeDelta = 0;
			if (isForLocation) {
				final Point start = base.resolvedLocation;
				final Point end = path.get(nextDefLocIndex).resolvedLocation;
				final double scale = 1.0 / (nextDefLocIndex - (i - 1));
				locDelta = end.getDifference(start).scale(scale);
			} else {
				final double start = base.sizeFactor;
				final double end = path.get(nextDefLocIndex).sizeFactor;
				sizeDelta = (end - start) / (nextDefLocIndex - (i - 1));
			}

			/*
			 * optimization: reusing the delta till the next non-interpolated
			 * Localizer is reached
			 */
			while (i < nextDefLocIndex) {
				if (isForLocation) {
					currentLocalizer.resolvedLocation = base.resolvedLocation
							.getTranslated(locDelta);
				} else {
					currentLocalizer.sizeFactor = base.sizeFactor + sizeDelta;
				}
				// proceed to next possibly to be interpolated Localizer
				base = currentLocalizer;
				i++;
				currentLocalizer = path.get(i);
			}
		}
	}

	/**
	 * Called by {@link AnimatingCommand}. Revalidates the animated layer if
	 * needed, sets the new bounds to the animated figure, and signals an
	 * animation to be performed on this layer.
	 *
	 * @param i
	 *            the step in the {@link #path} is going to be performed by
	 *            {@link AnimatingCommand}
	 */
	final void prepareStep(final int i) {
		// don't animate before the first (fully) specified localizer
		if (canPerform && i >= startIndex) {
			/*
			 * The pane is marked only once (for performance) as invalid in its
			 * UpdateManager. Because we hooked the MultipleAnimator into the
			 * layer, both will be hooked in the MultipleAnimation as well (see
			 * MultipleAnimator.invalidate(IFigure))
			 */
			pane.revalidate();

			/*
			 * This is a fix of the original GEF animation mechanism, so that
			 * Animation.doRun() does not need to validate (which presumably
			 * calls hookNeedCapture via Animator's postLayout) which would
			 * layout the figure to its old position!
			 */
			MultipleAnimation.hookNeedsCapture(pane);

			final Localizer currentLocalizer = path.get(i);
			currentSizeFactor = nextSizeFactor;
			nextSizeFactor = currentLocalizer.sizeFactor;
			// reuse singleton point to save creation of an object
			final Point newLocation = Point.SINGLETON;
			newLocation.setLocation(currentLocalizer.resolvedLocation);

			// System.out.print("Localizer - Target Center:" + newLocation);

			/*
			 * translate location to match animated figure's center. This must
			 * be done here instead of in MultipleAnimator so that no extra
			 * moving animation is done because of the difference between
			 * Localizer and center.
			 */
			newLocation.scale(1 / currentSizeFactor).translate(
					figureCenterOffset);

			// System.out.println("   Target location for animated figure:"
			// + newLocation);

			/*
			 * set just the target center location here, size calculation will
			 * be done by the LayoutListener parts.
			 */
			animatedFigure.setLocation(newLocation);
		}
	}

	/**
	 * Called by {@link AnimatingCommand} after all steps of an animation have
	 * been performed. Sets the animated figure's original parent and removes
	 * the animated pane (and this LayoutListener on it). The used viewer will
	 * be added to {@link AnimatingCommand#usedViewers}. All temporary data only
	 * needed for the current animation will be deleted.
	 */
	final void animationDone() {
		if (canPerform) {
			// reset viewer and remember this
			pane.removeLayoutListener(this);
			paneAnimatedElementMap.remove(pane);
			layer.remove(pane);

			// restore original parent if the model's figure has been used
			if (originalParent != null) {
				originalParent.add(animatedFigure, originalPosition);
				animatedFigure.setLocation(originalLocation);
				originalParent = null;
				originalLocation = null;
			}
			AnimatingCommand.usedViewers.add(viewer);
			pane = null;
			canPerform = false;
		}
		// discard the animatedFigure if the it has been found for a model
		// rather than been specified
		if (animatedModel != null) {
			animatedFigure = null;
		}
		// discard resolvedLocations in Localizer path but we keep initial and
		// final location!
		for (final Localizer localizer : path) {
			localizer.resolvedLocation = null;
		}
		figureCenterOffset = null;
		viewer = null;
		debugLine = null;
		layer = null;
	}

	@Override
	final public String toString() {
		final StringBuilder buffer = new StringBuilder();
		buffer.append("AnimatedElement: ");
		if (animatedModel != null) {
			buffer.append(animatedModel);
		} else {
			buffer.append(animatedFigure);
		}
		return buffer.toString();
	}

	/**
	 * This method is used to find the {@link GraphicalViewer} having the passed
	 * {@link #topModel} as contents. This viewer must been hosted in an
	 * {@link IPageBookViewPage} that implements
	 * {@link IGraphicalViewerProvider}.
	 *
	 * <p>
	 * Note: This method looks <i>only</i> for GraphicalViewers in pages of
	 * {@link PageBookView}s! It does not look for viewers in editors (for now)!
	 * </p>
	 *
	 * @param topModel
	 *            The model whose hosting viewer is been looked for
	 * @return The unique viewer having the model as its contents.
	 *         <code>null</code> if not such a unique viewer exists.
	 *
	 * @see IGraphicalViewerProvider
	 */
	public static GraphicalViewer findViewerShowing(final EObject topModel) {
		final ArrayList<GraphicalViewer> viewers = new ArrayList<GraphicalViewer>();
		final IWorkbenchPage activePage = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		final IEditorPart editor = activePage.getActiveEditor();
		if (editor instanceof DiagramEditor) {
			Map registry = ((DiagramEditor) editor).getDiagramGraphicalViewer().getEditPartRegistry();
			for (Object key : registry.keySet()) {
				EditPart part = (EditPart)registry.get(key);
				if (part.getModel().equals(topModel)) {
					viewers.add(((DiagramEditor) editor).getDiagramGraphicalViewer());
				}
			}
		}
		final IViewReference[] viewRefs = activePage.getViewReferences();
		for (final IViewReference viewRef : viewRefs) {
			final IViewPart view = viewRef.getView(false);
			if (view instanceof PageBookView) {
				final IPage page = ((PageBookView) view).getCurrentPage();
				if (page instanceof IGraphicalViewerProvider) {
					final GraphicalViewer viewer = ((IGraphicalViewerProvider) page)
							.getViewer(topModel);
					if (viewer != null) {
						viewers.add(viewer);
					}
				}
			}
		}
		// return viewer only if it is the only one showing the model
		if (viewers.size() == 1) {
			return viewers.get(0);
		}
		return null;
	}

	/*******************************************************************************
	 * The following is a special modification of org.eclipse.draw2d.Animator to
	 * be instantiated for different viewers and supporting
	 * {@link AnimationPathModifier}s and resizing on an exclusive pane for this
	 * AnimatedElement.
	 */

	private float progress = -1;

	/**
	 * Hooks invalidation in case animation is in progress.
	 *
	 * @see LayoutListener#invalidate(IFigure)
	 */
	@Override
	final public void invalidate(final IFigure container) {
		if (MultipleAnimation.isInitialRecording()) {
			MultipleAnimation.hookPane((ScalableFreeformLayeredPane) container);
		}
	}

	/**
	 * Hooks layout in case animation is in progress.
	 *
	 * @see LayoutListener#layout(org.eclipse.draw2d.IFigure)
	 */
	@Override
	public final boolean layout(final IFigure container) {
		// hook playback
		if (MultipleAnimation.isAnimating()
				&& MultipleAnimation.toCapture.contains(container)) {
			return playback(container);
		}
		return false;
	}

	/**
	 * Plays back the animated layout. Called when container is being layouted
	 * and MultipleAnimation in PLAYBACK state.
	 *
	 */
	final private boolean playback(final IFigure container) {
		/*
		 * fix: prevent revalidating loop if playback would cause an
		 * invalidation loop, i.e. for connections connected to the animated
		 * nodes: test if the current animation's "progress state" has already
		 * been played back
		 */
		if (progress == MultipleAnimation.progress) {
			return false;
		}
		progress = MultipleAnimation.progress;

		// get initial states for container
		final Map<IFigure, Rectangle> initial = MultipleAnimation.initialStates
				.get(container);
		if (initial == null) {
			return false;
		}
		// get final states for container
		final Map<IFigure, Rectangle> ending = MultipleAnimation.finalStates
				.get(container);
		/*
		 * Iterating over the figures that are explicitly set as animated as
		 * AnimatedElements should give more performance. Improved: we have
		 * exactly one figure on each pane! See prepareForAnimation for this!
		 */
		final Rectangle initialBounds = initial.get(animatedFigure);
		final Rectangle endingBounds = ending.get(animatedFigure);

		// save creation of one rectangle by using the singleton instance
		// temporarily
		// figures just copy the int values when setting new bounds
		final Rectangle newBounds = Rectangle.SINGLETON;
		newBounds.setSize(initialBounds.width, initialBounds.height);

		final Point newLocation = pathModifier.getLocation(initialBounds,
				endingBounds, progress);

		// when debugging, we add points to a polyline showing the path
		if (AnimatingCommand.isDebug()) {
			// debug moving figures that got associated a polyline debug
			// figure
			if (debugLine != null) {
				newBounds.setLocation(newLocation);
				// // show some debugging information
				// System.out.println("Point(" + newBounds.x + ","
				// + newBounds.y + ") progress:" + progress);
				debugLine.addPoint(newBounds.getCenter());
			}
		}

		final double newPaneScale = currentSizeFactor
				+ (nextSizeFactor - currentSizeFactor) * progress;
		pane.setScale(newPaneScale);

		final double reziLocationFactor = currentSizeFactor / newPaneScale;

		newLocation.translate(-figureCenterOffset.width,
				-figureCenterOffset.height);
		newLocation.scale(reziLocationFactor);
		newLocation.translate(figureCenterOffset);
		newBounds.setLocation(newLocation);

		animatedFigure.setBounds(newBounds);

		return true;
	}

	/**
	 * Hooks post layout in case animation is in progress. This was used in the
	 * original GEF animation, but now we call hookNeedsCapture manually for the
	 * AnimatedElement. This method is put here for documentation only.
	 *
	 * @see LayoutListener#postLayout(IFigure)
	 */
	@Override
	final public void postLayout(final IFigure container) {
		// if (MultipleAnimation.isFinalRecording()) {
		// MultipleAnimation.hookNeedsCapture(container);
		// }
	}
}