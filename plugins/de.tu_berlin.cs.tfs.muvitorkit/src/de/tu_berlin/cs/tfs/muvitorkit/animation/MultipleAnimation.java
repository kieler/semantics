package de.tu_berlin.cs.tfs.muvitorkit.animation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ScalableFreeformLayeredPane;
import org.eclipse.draw2d.UpdateManager;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.internal.Workbench;

/**
 * This class is a modified version of org.eclipse.draw2d.Animation to work with
 * multiple {@link UpdateManager}s. <br>
 * Additionally there are slight modifications, especially in
 * {@link #doRun(int)} so that performValidation() is not been called on the
 * update managers. Instead {@link #hookNeedsCapture(IFigure)} has to be called
 * manually which is done in {@link AnimatedElement}. <br>
 * This class is optimized for use with {@link AnimatedElement} and
 * {@link AnimatedElement} in an {@link AnimatingCommand}!
 * 
 * <p>
 * This class is not intended for direct usage. It will be used properly by
 * {@link AnimatingCommand}s.
 * </p>
 * 
 * @author Tony Modica
 */
@SuppressWarnings("restriction")
final class MultipleAnimation {

	final private static Set<ScalableFreeformLayeredPane> animatedPanes = new HashSet<ScalableFreeformLayeredPane>();
	final static Map<ScalableFreeformLayeredPane, Map<IFigure, Rectangle>> finalStates = new HashMap<ScalableFreeformLayeredPane, Map<IFigure, Rectangle>>();
	final static Map<ScalableFreeformLayeredPane, Map<IFigure, Rectangle>> initialStates = new HashMap<ScalableFreeformLayeredPane, Map<IFigure, Rectangle>>();
	final static Set<IFigure> toCapture = new HashSet<IFigure>();
	static float progress;
	private static final int PLAYBACK = 3;
	private static final int RECORD_FINAL = 2;
	private static final int RECORD_INITIAL = 1;
	private static final int IDLE = 0;
	private static int state;

	private MultipleAnimation() {
	}

	/**
	 * @param duration
	 */
	private static synchronized void doRun(final int duration) {
		state = RECORD_FINAL;
		// collect update managers
		final Set<UpdateManager> updateManagers = new HashSet<UpdateManager>();
		for (final ScalableFreeformLayeredPane pane : animatedPanes) {
			updateManagers.add(pane.getUpdateManager());
		}

		/**
		 * No validation is done here, instead
		 * MultipleAnimation.hookNeedsCapture(parent, Animator.getDefault())
		 * should have been called in AnimatedElement.prepareStep(int)
		 */
		// for (UpdateManager updateManager : updateManagers) {
		// updateManager.performValidation(); }
		// capture
		for (final Iterator<ScalableFreeformLayeredPane> it = animatedPanes
				.iterator(); it.hasNext();) {
			final ScalableFreeformLayeredPane pane = it.next();
			if (toCapture.contains(pane)) {
				// capture figure, record final state of figure, put final state
				finalStates.put(pane, getCurrentState(pane));
			} else {
				it.remove();
			}
		}

		state = PLAYBACK;
		progress = 0;
		final long startTime = System.currentTimeMillis();

		/*
		 * Fixed this: For smoother animation, progress starts now with 0 and
		 * not with 0.1f!
		 */
		final Display display = Workbench.getInstance().getDisplay();
		while (progress != -1) {
			// step
			for (final ScalableFreeformLayeredPane pane : initialStates
					.keySet()) {
				pane.revalidate();
			}
			for (final UpdateManager updateManager : updateManagers) {
				updateManager.performUpdate();
			}
			// FIXED: this prevents lagging animation and increases GUI's
			// responsiveness while animation
			while (display.readAndDispatch()) {
				;
			}
			if (progress == 1.0) {
				progress = -1;
			} else {
				final int delta = (int) (System.currentTimeMillis() - startTime);
				if (delta >= duration) {
					progress = 1f;
				} else {
					progress = 1f * delta / duration;
				}
			}
		}
	}

	/**
	 * Called when being in state {@link #RECORD_INITIAL} and container is being
	 * invalidated.
	 * 
	 * @param pane
	 */
	final static void hookPane(final ScalableFreeformLayeredPane pane) {
		if (animatedPanes.add(pane)) {
			// init figure, record initial state of figure, put initial state
			initialStates.put(pane, getCurrentState(pane));
		}
	}

	/**
	 * Called when being in state {@link #RECORD_FINAL} and container is being
	 * layouted.
	 * 
	 * @param pane
	 */
	final static void hookNeedsCapture(final IFigure pane) {
		if (animatedPanes.contains(pane)) {
			toCapture.add(pane);
		}
	}

	/**
	 * Returns <code>true</code> if muvitorkit.animation is in progress.
	 * 
	 * @return <code>true</code> when animating
	 * @since 3.2
	 */
	final static boolean isAnimating() {
		return state == PLAYBACK;
	}

	// final static boolean isFinalRecording() {
	// return state == RECORD_FINAL;
	// }

	final static boolean isInitialRecording() {
		return state == RECORD_INITIAL;
	}

	/**
	 * Marks the beginning of the muvitorkit.animation process. If the beginning
	 * has already been marked, this has no effect.
	 * 
	 * @return returns <code>true</code> if beginning was not previously marked
	 * @since 3.2
	 */
	final static boolean markBegin() {
		if (state == IDLE) {
			state = RECORD_INITIAL;
			return true;
		}
		return false;
	}

	/**
	 * Captures the final states for the animation and then plays the animation.
	 * 
	 * @param duration
	 *            the length of animation in milliseconds
	 */
	final static void run(final int duration) {
		if (state == IDLE) {
			return;
		}
		try {
			if (!animatedPanes.isEmpty()) {
				doRun(duration);
			}
		} finally {
			// cleanup
			state = IDLE;
			// step
			for (final ScalableFreeformLayeredPane pane : initialStates
					.keySet()) {
				pane.revalidate();
			}
			/*
			 * Allow layout to occur normally (?) updateManager.performUpdate();
			 */
			initialStates.clear();
			finalStates.clear();
			animatedPanes.clear();
			toCapture.clear();
		}
	}

	/**
	 * Returns an object encapsulating the placement of children in a container.
	 * This method is called to capture both the initial and final states.
	 * 
	 * @param container
	 *            the container figure
	 * @return the current state
	 * @since 3.2
	 */
	@SuppressWarnings("unchecked")
	final static private Map<IFigure, Rectangle> getCurrentState(
			final IFigure container) {
		final Map<IFigure, Rectangle> locations = new HashMap<IFigure, Rectangle>();
		for (final IFigure child : (List<IFigure>) container.getChildren()) {
			locations.put(child, child.getBounds().getCopy());
		}
		return locations;
	}
}