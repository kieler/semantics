package de.tu_berlin.cs.tfs.muvitorkit.animation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.Animation;
import org.eclipse.draw2d.Animator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;

/**
 * This is the main class users have to use in this GEF animation package. It
 * implements a {@link Command} that can be given information about how some
 * model elements (EMF {@link EObject}s) should be animated that are visualized
 * as {@link IFigure}s in {@link GraphicalViewer} s. For this, you specify
 * stepwise absolute ({@link Point}s) or relative (model elements) locations and
 * optional size factors for the model elements to be animated as described
 * below in detail.
 * <hr/>
 *
 * <h3>Why not use GEF's animation mechanism?</h3>
 * <p>
 * The GEF already contains the classes {@link Animation} and {@link Animator}
 * that can be used to animate figures. The main advantage of using this package
 * is that you can specify more powerful animations more flexibly. More
 * precisely, in addition to GEF you get this:
 * <ul>
 * <li>You can specify <b>which model</b> to animate instead of the model's
 * figure, which will be determined automatically at animation runtime. This
 * means that you can specify animations independently from actual viewers.</li>
 * <li>The stepwise definition allows you to <b>animate several elements
 * independently</b> along complex paths with flexible timing/speed (by
 * interpolating intermediate steps).</li>
 * <li>Each animated figure can be <b>zoomed smoothly on its path</b> according
 * to absolute size factors. Each figure resizes independently of all other
 * (possibly animated) figures in the same viewer!</li>
 * <li>You can easily specify <b>parallel animations</b> in several viewers.</li>
 * <li>AnimatingCommand will automatically take care of <b>reversing animations
 * for undo operations</b>.</li>
 * <li>With {@link AnimationPathModifier}s you have a convenient way to <b>alter
 * the animation paths</b> to nice curves.</li>
 * </ul>
 * <hr/>
 *
 * <h3>Stepwise animation definition - an example</h3>
 * To understand the principle of stepwise animation definition, we discuss the
 * example time schedule matrix below. It represents the definition of an
 * animation of three arbitrary model elements (<i>element1-3</i>). We have a
 * column for each element to be animated and a row for each defined animation
 * step, each with a positive integer value <i>d1-3</i> representing the
 * duration of this step in msecs (except for the first, which is the starting
 * position row):
 * <table cellspacing="0" cellpadding="3" border="1">
 * <tr>
 * <td></td>
 * <td><b>element1</b></td>
 * <td><b>element2</b></td>
 * <td><b>element3</b></td>
 * </tr>
 * <tr>
 * <td><b>start</b></td>
 * <td>element1</td>
 * <td>Point(0,0)</td>
 * <td>-/-</td>
 * </tr>
 * <tr>
 * <td>d1</td>
 * <td>element2</td>
 * <td>-/-</td>
 * <td>element1</td>
 * </tr>
 * <tr>
 * <td>d2</td>
 * <td>element3</td>
 * <td>-/-</td>
 * <td>element2</td>
 * </tr>
 * <tr>
 * <td>d3</td>
 * <td>element1</td>
 * <td>Point(100,100)</td>
 * <td>-/-</td>
 * </tr>
 * </table>
 * <p>
 * First, you have to understand what the performed animation will look like.
 * After that you shall see how you can define this animation by calling the
 * appropriate methods.
 * <p>
 * In short, each table entry tells when (after the sum of durations till this
 * step) the figure of the column's element has to be where (absolute or
 * relative location). For example, element1 is supposed to start at its own
 * position, to move in d1 msecs to the position of element2, after that to move
 * in d2 msecs to the position of element3, and to return in d3 seconds back to
 * its initial position.<br>
 * Note that when specifying relative locations, they will be resolved to the
 * absolute locations that the related figure has <i>before the animation</i>!
 * Thus, element1's figure will move to the locations of the figures of element2
 * and element3 that they have before the animation, even if these will be
 * animated themselves in this particular animation. <br>
 * Of course, only those elements will be animated, for which a figure (being
 * related to this element by some {@link GraphicalEditPart}) can be found.
 * There is no need for element1-3 having figures in <i>the same</i> viewer at
 * command-execution nor command-definition time, but only figures in open
 * viewers that exist at execution-time will be animated. AnimatingCommand will
 * not regard it as an error if no figure can be found for an element at all!
 * <p>
 * Let's continue with element2 to understand step interpolation: As you can see
 * in the table, only an absolute starting position and a position after the
 * third step has been specified. Generally, undefined steps between defined
 * steps will be interpolated linearly. So, after d1 msecs element2's figure
 * would reach the point (33,33), after d1+d2 msecs (66,66), and finally
 * (100,100).<br>
 * Note that an animation of a particular figure always starts at the first
 * specified step and ends at the last specified step. Furthermore, this could
 * lead to unexpected behavior if you specify a relative location by some other
 * model element for which no figure location can be resolved! If no start or
 * end location for the whole path of a model's figure can be resolved or
 * interpolated, it will not be animated at all, but also no error message will
 * be raised.
 * <p>
 * How element3's figure would be animated should be obvious by now. So let's
 * see how we can specify this animation in some editor action. Suppose we have
 * a container model element <code>parent</code>, which is the contents of the
 * viewer that we expect to show, and we want to animate the figures for
 * element1-3. <b>This viewer must implement {@link IGraphicalViewerProvider}
 * (have a look there for an example) to be found by AnimatingCommand.</b> In
 * addition we may have a {@link CompoundCommand} that manipulates our model
 * before and possibly after the animation. The following shows the right code
 * for this scenario (we will discuss another possibility for special purposes
 * after that as well):<br>
 *
 * <pre>
 * AnimatingCommand aniComm = new AnimatingCommand();
 * // initialize objects for animation
 * aniComm.initializeAnimatedElement(element1, parent, null);
 * aniComm.initializeAnimatedElement(element2, parent, null);
 * // specify starting position
 * aniComm.specifyStep(element1, element1);
 * aniComm.specifyStep(element2, new Point(0, 0));
 * // finish &quot;starting step&quot; definition, declare step with duration d1
 * aniComm.nextStep(d1);
 * // specify step 1
 * aniComm.specifyStep(element1, element2);
 * aniComm.initializeAnimatedElement(element3, parent, null);
 * aniComm.specifyStep(element3, element1);
 * // finish definition of step 1, declare step with duration d2
 * aniComm.nextStep(d2);
 * // specify step 2
 * aniComm.specifyStep(element1, element3);
 * aniComm.specifyStep(element3, element2);
 * // finish definition of step 2, declare step with duration d3
 * aniComm.nextStep(d3);
 * // specify step 3
 * aniComm.specifyStep(element1, element1);
 * aniComm.specifyStep(element2, new Point(100, 100));
 * // queue the animating command in the compound command
 * compoundCommand.add(aniComm);
 * </pre>
 *
 * In this short code snippet, we first create a plain AnimatingCommand and
 * declare element1 and element2 as to be animated in the viewer that has
 * <code>parent</code> as contents. This must be done for an element before
 * specifying any steps for it. We could have set some
 * {@link AnimationPathModifier}s instead of the last <code>null</code>
 * argument, but this is not mandatory.<br>
 * Now, look at the matrix table above again: In the first step (which you have
 * to imagine always as happening with the duration 0msec) we specify element1's
 * and element2's figures to be at the location of the figure of element1 itself
 * and at Point(0,0), respectively.<br>
 * Note that we have not initialized element3 so far. We could have done so,
 * though. It is not important in which step you initialize an element, as this
 * does not change the animation at all, because AnimatingCommand will fill the
 * specification for this element up to the current step with place holders. It
 * is important that you must do this <i>sometime before</i> you call
 * <code>specifyStep(...)</code> for this element!<br>
 * With this we have completed the specification of the first step and can
 * proceed to the next step by calling <code>nextStep(d1)</code>, which states
 * that the next step should take <code>d1</code> msecs to complete.<br>
 * The next row in the table says that in this step element1's figure should
 * move to the original position of element2's figure, and that element3's
 * figure should start its animation at the original position of element1's
 * figure. For this we have to initialize element3 belatedly. <br>
 * It should be clear by now, how the remaining lines correspond to the table
 * entries. Note, that you do not have to finish the last step by calling
 * <code>nextStep</code> a fourth time, however you would not know what duration
 * to specify for this unused step. <br>
 * By adding the AnimatingCommand to the compound command we are done!
 *
 * <h3>Composite figures as targets</h3>
 * You should be aware that in fact not the figure of the target edit part is
 * used to resolve the target location of an animation step, but the content
 * pane of the target edit part is. <br>
 * By default, an edit part returns its figure when asked for its content pane;
 * so for simple figures or if you just want the center of the whole composite
 * figure to be the target location, you do not have to worry about this. <br>
 * But you can make use of this by overriding your
 * {@link GraphicalEditPart#getContentPane()} to return a subfigure of your edit
 * part's (composite) figure. So, you can let the center of the subfigure be the
 * target location of each animation step that is specified with this edit part
 * as target!
 *
 *
 * If you have edit parts that are represented as composite figures
 *
 * <h3>Animations that resize figures on their path</h3>
 * Optionally, you may specify a size factor for each step with
 * {@link #specifyStep(Object, Object, double)} to highlight some element. The
 * size factor is absolute, a value of 1 will set the animated figure to the
 * original size (as does the convenience method
 * {@link #specifyStep(Object, Object)}). A value of -1 will mark this element's
 * size factor as to be interpolated for the current step, similar to the
 * locations.
 *
 * <h3>Modifying the path of an animated figure</h3>
 * If the figures' movement along a straight line bores you, you may choose from
 * several alternative movements. For this you can call
 * {@link #initializeAnimatedElement(Object, Object, AnimationPathModifier)}
 * with one of the predefined {@link AnimationPathModifier}s that are accessible
 * by static getters. Have a look there for the different available modifiers.
 *
 * <h3>Switch animations globally</h3>
 * Sometimes you might just want to switch off all animations caused by
 * AnimatingCommands. For this you just have to call
 * {@link #setPerformAnimation(boolean)}. This packages provides a sample
 * {@link ToggleAnimationAction}, which can be provided as a button in the
 * editor's tool bar that switches this flag.
 *
 * <h3>Visualize the paths of animated elements (for debugging)</h3>
 * With {@link #setDebug(boolean)} you can set a flag that forces the figures to
 * mark their way as a red line, which will remain visible in the viewer after
 * animation. So after the animation has been performed you can see and examine
 * the paths of the figures.
 *
 * <h3>Initializing at execution time rather at definition time</h3>
 * A remark about an slightly different way to define animations (i.e. by
 * subclassing): AnimatingCommand features an empty method {@link #initialize()}
 * , which will be called in {@link #execute()} and {@link #undo()} before doing
 * anything else. With this, you may implement own AnimatingCommands and include
 * the element initializations and step definitions in this subclasses by
 * putting them in the overridden {@link #initialize()}. <br>
 * The main purpose of this approach is to perform initialization at execution
 * time rather than command-creation time! For example, consider you have a list
 * of elements you want to animate, e.g. all nodes being shown in a viewer (like
 * in {@link AnimatingCommand}), and you initialize them dynamically in a loop.
 * Now imagine you want to create a complex action with several model changes,
 * including creation and deletion of nodes, and moving around all nodes. The
 * only way to initialize elements that are newly created in the surrounding
 * compound command, is to subclass AnimatingCommand and to put the initializing
 * loop in {@link #initialize()} so that all elements in the list are
 * initialized <i>just before the animation is executed</i> when the compound
 * command already created the new nodes, rather than when the compound command
 * and the AnimatingCommand are being created and no model change has happened
 * yet. Have a look at AnimatingDemoAction1 for an example.
 *
 * <h3>Refreshing viewers between animation series</h3>
 * A word about refreshing the animated viewers: Depending on what you want to
 * animate you may need to explicitly let the animated viewers be flushed before
 * or after the animation. To achieve this you can experiment with setting the
 * flags{@link #flushBefore} and {@link #flushAfter}. This could be needed
 * especially in consecutive animations, though, I can not figure out a general
 * rule for all scenarios.
 *
 *
 * @see IGraphicalViewerProvider
 * @see AnimationPathModifier
 * @see ToggleAnimationAction
 * @see AnimatedElement
 * @see Localizer
 * @see MultipleAnimation
 * @author Tony Modica
 */
public class AnimatingCommand extends Command {

	private static final String LABEL = "Animating Command";

	/**
	 * This flag may be used to generally disable animations.
	 */
	private static boolean performAnimation = true;
	
	/**
	 * This flag may be used to display an animation in more detail for
	 * debugging. The paths of the animated figures will be shown as well.
	 */
	private static boolean debug = false;

	/**
	 * A mapping from the models/animated figures to their
	 * {@link AnimatedElement}s to enable access to the initial/final
	 * coordinates by a model/figure.
	 *
	 * @see #getInitialLocation(Object)
	 * @see #getFinalLocation(Object)
	 */
	private final HashMap<Object, AnimatedElement> animatedElementsMap = new HashMap<Object, AnimatedElement>();

	/**
	 * This is a list of animated elements that have got specifications for the
	 * current step. This is used to fill up unspecified animated elements with
	 * interpolated place holder specifications.
	 */
	private final List<AnimatedElement> specifiedElementsInActualStep = new ArrayList<AnimatedElement>();

	/**
	 * This stores the relative durations that have been specified in
	 * {@link #nextStep(double)} well as to serve as a counter for the steps
	 * that have been defined so far.
	 */
	private final List<Double> relativeDurations = new ArrayList<Double>();

	/**
	 * Default duration for a single step is 400 msec.
	 */
	private static int DEFAULT_DURATION = 400;

	/**
	 * This stores how long the animation should be in total in msec. If it is
	 * set to -1 the {@link #DEFAULT_DURATION} will be regarded as length for 1
	 * relative time duration.
	 *
	 * @see #setCompleteDuration(int)
	 */
	private int completeDuration = -1;

	/**
	 * A list that contains the absolute durations in msec for the animation
	 * steps. These are calculated in {@link #calculateDurations()} so that all
	 * absolute durations in this list will sum up to {@link #completeDuration}
	 * if set (>-1). Otherwise 1 relative time duration will be interpreted as 1
	 * {@link #DEFAULT_DURATION} .
	 *
	 * This is done in {@link #execute()} and {@link #undo()} once.
	 * {@link #setCompleteDuration(int)} will update this, but only if it has
	 * been calculated before, so that the duration can not be extended
	 * afterwards.
	 */
	private ArrayList<Integer> absoluteDurations;

	/**
	 * This flag indicates that {@link #execute()} or {@link #undo()} have been
	 * called while {@link #performAnimation} was <code>true</code>. It is not
	 * related to {@link #initialize()} as overwriting this is optional!
	 */
	private boolean initialized;

	/**
	 * Set this true to force viewers being flushed when preparing animated
	 * elements. You may have to experiment with this and {@link #flushAfter} to
	 * get the right animation behavior, especially in consecutive animations.
	 */
	public boolean flushBefore = false;

	/**
	 * Set this true to force viewers being flushed after this animation. You
	 * may have to experiment with this and {@link #flushAfter} to get the right
	 * animation behavior, especially in consecutive animations.
	 */
	public boolean flushAfter = false;

	final static Set<GraphicalViewer> usedViewers = new HashSet<GraphicalViewer>();

	/**
	 * Constructor, setting default label. The first step's duration is set to 0
	 * to let it happen immediately.
	 */
	public AnimatingCommand() {
		this(LABEL);
	}

	/**
	 * Constructor for a peculiar label. The first step's duration is set to 0
	 * to let it happen immediately.
	 *
	 * @param label
	 */
	public AnimatingCommand(final String label) {
		super(label);
		// the first step will be performed immediately
		relativeDurations.add(Double.valueOf(0.0));
	}

	/***************************************************************************
	 * Command methods
	 **************************************************************************/

	/**
	 * Performs the specified animation. Calls the optional
	 * {@link #initialize()}, calculates the absolute durations, prepares the
	 * animation, performs the steps and finishes the animation. This may be
	 * overridden, but ensure to call super.execute()!
	 *
	 * @see org.eclipse.gef.commands.Command#execute()
	 * @see #calculateDurations()
	 * @see #prepareAnimation(boolean)
	 * @see #performStep(int, int)
	 * @see #animationDone()
	 */
	@Override
	public void execute() {
		if (performAnimation) {
			if (!initialized) {
				initialize();
				initialized = true;
			}

			// calculate absolute durations only once
			if (absoluteDurations == null) {
				absoluteDurations = calculateDurations();
			}

			prepareAnimation(false);

			// perform animation
			for (int i = 0; i < getStepCounter(); i++) {
				performStep(i, absoluteDurations.get(i).intValue());
			}

			animationDone();
		}
	}

	/**
	 * Performs the specified animation like {@link #execute()}, but backwards.
	 * Calls the optional {@link #initialize()}, calculates the absolute
	 * durations, prepares the animation, performs the steps in reversed order
	 * and finishes the animation. This may be overridden, but ensure to call
	 * super.undo()!
	 *
	 * @see org.eclipse.gef.commands.Command#undo()
	 * @see #calculateDurations()
	 * @see #prepareAnimation(boolean)
	 * @see #performStep(int, int)
	 * @see #animationDone()
	 */
	@Override
	public void undo() {
		if (performAnimation) {
			if (!initialized) {
				initialize();
				initialized = true;
			}

			/*
			 * Calculate absolute durations only once. This has not to be done
			 * already in execute() as the animation could just have been
			 * switched on for undo only.
			 */
			if (absoluteDurations == null) {
				absoluteDurations = calculateDurations();
			}

			prepareAnimation(true);

			// perform undo animation in reversed order
			performStep(getStepCounter() - 1, 0);
			for (int i = getStepCounter() - 2; i >= 0; i--) {
				performStep(i, absoluteDurations.get(i + 1).intValue());
			}

			animationDone();
		}
	}

	/**
	 * If {@link #initialized} is true all lists and hash maps are cleared.
	 *
	 * @see org.eclipse.gef.commands.Command#dispose()
	 */
	@Override
	final public void dispose() {
		if (initialized) {
			absoluteDurations.clear();
			animatedElementsMap.clear();
			relativeDurations.clear();
			specifiedElementsInActualStep.clear();
		}
	}

	/***************************************************************************
	 * Methods to specify animation
	 **************************************************************************/

	/**
	 * If this is set to <code>false</code> animations will be generally
	 * disabled until it is reset to <code>true</code>.
	 *
	 * @param performAnimation
	 */
	final static public void setPerformAnimation(final boolean performAnimation) {
		AnimatingCommand.performAnimation = performAnimation;
	}

	/**
	 * Setting this flag to <code>true</code> may be used to display an
	 * animation in more detail for debugging. The paths of the animated figures
	 * will be shown as well.
	 *
	 * @param debug
	 */
	final static public void setDebug(final boolean debug) {
		AnimatingCommand.debug = debug;
	}

	/**
	 * Getter for the {@link #debug} flag.
	 *
	 * @return the {@link #debug} flag
	 */
	final static public boolean isDebug() {
		return AnimatingCommand.debug;
	}

	/**
	 * Getter for the {@link #performAnimation} flag.
	 *
	 * @return the performAnimation
	 */
	final public static boolean isPerformAnimation() {
		return performAnimation;
	}

	/**
	 * You may use this to specify how long the animation should be in total in
	 * msec. If it is set to -1 the {@link #DEFAULT_DURATION} will be regarded
	 * as length for 1 relative time duration. Calling this method causes the
	 * {@link #absoluteDurations} to be recalculated by
	 * {@link #calculateDurations()}.
	 *
	 * @param duration
	 *            the time in msec for the whole animation
	 */
	final public void setCompleteDuration(final int duration) {
		completeDuration = duration;
		// update absolute durations if animation has already been
		// performed and thus no further steps will be added
		if (absoluteDurations != null) {
			absoluteDurations = calculateDurations();
		}
	}

	/**
	 * @param msecs
	 */
	public static void setDefaultDuration(final int msecs) {
		if (msecs == 0) {
			DEFAULT_DURATION = 400;
		} else {
			DEFAULT_DURATION = msecs;
		}
	}

	/**
	 * This will be called in {@link #execute()} or {@link #undo()} before the
	 * animation is performed. May be overwritten to specify animation at
	 * execution time instead of command creation time.
	 * <p>
	 * This is useful e.g. if the models to be animated have not been created
	 * yet and should be retrieved from some list when this command is being
	 * executed. So, instead of calling
	 * {@link #initializeAnimatedElement(Object, Object, AnimationPathModifier)}, {@link #nextStep(double)} and {@link #specifyStep(Object, Object)}
	 * directly on this command, this could be done here when the models are
	 * accessible.
	 * </p>
	 */
	public void initialize() {
	}

	/**
	 * Before specifying any steps for an element to animate, you have to
	 * initialize it with this method. If you already have specified some steps
	 * before, the {@link AnimatedElement} for the passed model will be filled
	 * up with place-holder steps up to the current step.
	 *
	 * @param modelOrEditPartOrFigure
	 *            can be an {@link GraphicalEditPart} or {@link EObject}
	 *            determining the model whose figure should be animated.v
	 *            Alternatively, you may pass a specific {@link IFigure} to be
	 *            animated.
	 * @param viewerOrTop
	 *            can be an {@link EObject} or {@link EditPartViewer}
	 *            determining the viewer holding a figure of the model
	 * @param pathModifier
	 *            optional {@link AnimationPathModifier}
	 */
	final public void initializeAnimatedElement(
			final Object modelOrEditPartOrFigure, final Object viewerOrTop,
			final AnimationPathModifier pathModifier) {
		final AnimatedElement newElement = new AnimatedElement(
				modelOrEditPartOrFigure, viewerOrTop, pathModifier);

		if (newElement.animatedModel != null) {
			animatedElementsMap.put(newElement.animatedModel, newElement);
		} else if (newElement.animatedFigure != null) {
			animatedElementsMap.put(newElement.animatedFigure, newElement);
		}
		// fill up animated element with place holders till actual step
		for (int i = 0; i < getStepCounter() - 1; i++) {
			newElement.addPlaceholderStep();
		}
	}

	/**
	 * Before specifying any steps for an element to animate, you have to
	 * initialize it with this method. If you already have specified some steps
	 * before, the {@link AnimatedElement} for the passed model will be filled
	 * up with place-holder steps up to the current step.
	 *
	 * Convenience method for standard paths.
	 *
	 * @param modelOrEditPartorFigure
	 *            can be an {@link GraphicalEditPart} or {@link EObject}
	 *            determining the model whose figure should be animated.
	 *            Alternatively, you may pass a specific {@link IFigure} to be
	 *            animated.
	 * @param viewerOrTop
	 *            can be an {@link EObject} or {@link EditPartViewer}
	 *            determining the viewer holding a figure of the model
	 */
	final public void initializeAnimatedElement(
			final Object modelOrEditPartorFigure, final Object viewerOrTop) {
		initializeAnimatedElement(modelOrEditPartorFigure, viewerOrTop, null);
	}

	/**
	 * Convenience method that calls {@link #nextStep(double)} with a duration
	 * of 1.0.
	 */
	final public void nextStep() {
		nextStep(1.0);
	}

	/**
	 * Completes the actual step definition by filling up the
	 * {@link AnimatedElement}s that have not been specified for this step with
	 * a place holder step. The next step is associated with the passed relative
	 * duration length.
	 *
	 * @param relativeDuration
	 *            the relative duration length of the next step
	 */
	final public void nextStep(final double relativeDuration) {
		/*
		 * fill up initialized animated elements that have not been extended by
		 * a step specification
		 */
		final List<AnimatedElement> unspecified = new ArrayList<AnimatedElement>(
				animatedElementsMap.values());
		unspecified.removeAll(specifiedElementsInActualStep);
		for (final AnimatedElement animatedElement : unspecified) {
			animatedElement.addPlaceholderStep();
		}

		// save specified relative duration for next step
		if (relativeDuration <= 0) {
			throw new IllegalArgumentException(
					"A relative duration for a step must be greater than 0!");
		}
		relativeDurations.add(Double.valueOf(relativeDuration));

		// prepare for next step
		specifiedElementsInActualStep.clear();
	}

	/**
	 * With this method you can specify the current animation step (the initial
	 * one or some subsequent one due to {@link #nextStep(double)}) with a
	 * relative size factor.
	 *
	 * <p>
	 * A valid argument for the location object has to be an {@link EObject},
	 * {@link GraphicalEditPart}, {@link Point}, or <code>null</code>.
	 * </p>
	 *
	 * @param modelOrEditPart
	 *            can be an {@link GraphicalEditPart} or {@link EObject}
	 *            determining the model whose figure should be animated.
	 * @param locationObject
	 *            If <code>null</code>, the location will be interpolated
	 * @param sizeFactor
	 *            If -1, the size will be interpolated
	 */
	final public void specifyStep(final Object modelOrEditPart,
			final Object locationObject, final double sizeFactor) {
		getAndPrepareAnimatedElement(modelOrEditPart).addStep(locationObject,
				sizeFactor);
	}

	/**
	 * With this method you can specify the current animation step (the initial
	 * one or some subsequent one due to {@link #nextStep(double)}) so that the
	 * relative size factor will be 1. If the size is meant to be interpolated
	 * you should call {@link #specifyStep(Object, Object, double)} with -1 as
	 * size factor! </p>
	 *
	 * <p>
	 * A valid argument for the location object has to be an {@link EObject},
	 * {@link GraphicalEditPart}, {@link Point}, or <code>null</code>.
	 * </p>
	 *
	 * @param modelOrEditPart
	 *            can be an {@link GraphicalEditPart} or {@link EObject}
	 *            determining the model whose figure should be animated.
	 * @param locationObject
	 *            If <code>null</code>, location and size will be interpolated
	 */
	final public void specifyStep(final Object modelOrEditPart,
			final Object locationObject) {
		getAndPrepareAnimatedElement(modelOrEditPart).addStep(locationObject);
	}

	/***************************************************************************
	 * Getter methods
	 **************************************************************************/

	/**
	 * @return the number of steps that have been defined so far
	 */
	final public int getStepCounter() {
		return relativeDurations.size();
	}

	/**
	 * This may be used to get the final bounds of a figure representing the
	 * model or for the animated figure itself. So the result of an animation
	 * can be preserved by setting these values via command to the model or
	 * figure.
	 *
	 * @param modelOrFigure
	 *            The model/figure to get the last bounds after this animation
	 *            for.
	 * @return The actual last bounds in the Localizer path of the
	 *         {@link AnimatedElement} for modelOrFigure. May be
	 *         <code>null</code> if animation (and thus resolving/interpolation)
	 *         has not been performed properly.
	 */
	final public Point getFinalLocation(final Object modelOrFigure) {
		final AnimatedElement animatedElement = animatedElementsMap
				.get(modelOrFigure);
		if (animatedElement != null && animatedElement.finalLocation != null) {
			return animatedElement.finalLocation.getCopy();
		}
		return null;
	}
	
	public boolean isAnimating() {
	    return MultipleAnimation.isAnimating();
	}

	/**
	 * This may be used to get the initial bounds of a figure representing the
	 * model or for the animated figure itself. So the result of an animation
	 * can be preserved by setting these values via command to the model or
	 * figure and be reset with undo.
	 *
	 * @param modelOrFigure
	 *            The model/figure to get the first bounds after this animation
	 *            for.
	 * @return The cached first bounds in the Localizer path of the
	 *         {@link AnimatedElement} for model. May be <code>null</code> if
	 *         animation (and thus resolving/interpolation) has not been
	 *         performed properly.
	 */
	final public Point getInitialLocation(final Object modelOrFigure) {
		final AnimatedElement animatedElement = animatedElementsMap
				.get(modelOrFigure);
		if (animatedElement != null && animatedElement.initialLocation != null) {
			return animatedElement.initialLocation.getCopy();
		}
		return null;
	}

	/***************************************************************************
	 * Internal methods
	 **************************************************************************/

	/**
	 * Calculates a list that contains the absolute durations in msec for the
	 * animation steps. These are calculated so that all absolute durations in
	 * this list will sum up to {@link #completeDuration} if set (>-1).
	 * Otherwise 1 relative time duration will be interpreted as 1
	 * {@link #DEFAULT_DURATION}.
	 *
	 * This is done in {@link #execute()} and {@link #undo()} once.
	 * {@link #setCompleteDuration(int)} call this as well, but only if it has
	 * been done before, so that the duration can not be extended afterwards.
	 *
	 * @return A list that contains the absolute durations in msec for the
	 *         animation steps.
	 */
	final private ArrayList<Integer> calculateDurations() {
		// calculate sum of all relative step durations
		double durationSum = 0.0;
		for (final Double relativeDuration : relativeDurations) {
			durationSum += relativeDuration.doubleValue();
		}

		/*
		 * if complete duration is not specified by user assume default duration
		 * for each relative duration
		 */
		if (completeDuration == -1) {
			// count 1 relative duration as 1 default duration
			completeDuration = (int) (DEFAULT_DURATION * durationSum);
		}

		// calculate absolute durations in msec
		final ArrayList<Integer> newDurations = new ArrayList<Integer>();
		for (int i = 0; i < relativeDurations.size(); i++) {
			final double absoluteDuration = relativeDurations.get(i)
					.doubleValue()
					* completeDuration / durationSum;
			newDurations.add(Integer.valueOf((int) absoluteDuration));
		}
		return newDurations;
	}

	/**
	 * Retrieves the {@link AnimatedElement} that has been created in
	 * {@link #initializeAnimatedElement(Object, Object, AnimationPathModifier)}
	 * for the passed model, edit part or figure. This animated element will be
	 * marked as specified for this step. This method ensures that a animated
	 * element gets at most one specification for the current step.
	 *
	 * @param modelOrEditPartOrFigure
	 *            can be an {@link GraphicalEditPart} or {@link EObject}
	 *            determining the model whose figure should be animated.
	 *            Alternatively, this may be a specific {@link IFigure} to be
	 *            animated.
	 * @return
	 */
	final private AnimatedElement getAndPrepareAnimatedElement(
			final Object modelOrEditPartOrFigure) {
		final AnimatedElement animatedElement = getAnimatedElement(modelOrEditPartOrFigure);
		// not initialized elements are being ignored
		Assert.isTrue(!specifiedElementsInActualStep.contains(animatedElement),
				"The current animation step has already been specified for model "
						+ modelOrEditPartOrFigure);
		/*
		 * we can add the selected animated to the list of specified elements
		 * element because this method will be called only when a step is being
		 * specified!
		 */
		specifiedElementsInActualStep.add(animatedElement);
		return animatedElement;
	}

	/**
	 * Retrieves the {@link AnimatedElement} that has been created in
	 * {@link #initializeAnimatedElement(Object, Object, AnimationPathModifier)}
	 * for the passed model, edit part or figure.
	 *
	 * @param modelOrEditPartOrFigure
	 *            can be an {@link GraphicalEditPart} or {@link EObject}
	 *            determining the model whose figure should be animated.
	 *            Alternatively, this may be a specific {@link IFigure} to be
	 *            animated.
	 * @return
	 */
	private AnimatedElement getAnimatedElement(
			final Object modelOrEditPartOrFigure) {
		AnimatedElement animatedElement = null;
		if (modelOrEditPartOrFigure instanceof EObject
				|| modelOrEditPartOrFigure instanceof IFigure) {
			animatedElement = animatedElementsMap.get(modelOrEditPartOrFigure);
		} else if (modelOrEditPartOrFigure instanceof GraphicalEditPart) {
			animatedElement = animatedElementsMap
					.get(((GraphicalEditPart) modelOrEditPartOrFigure)
							.getModel());
		} else {
			throw new IllegalArgumentException(
					"A step has to be specified for an EObject, a GraphicalEditPart, or a IFigure!");
		}
		Assert.isNotNull(animatedElement,
				"No AnimatedElement has been initialized for "
						+ modelOrEditPartOrFigure);
		return animatedElement;
	}

	/**
	 * Called by {@link #execute()} and {@link #undo()} after duration
	 * calculation and before performing the animation steps. For convenience,
	 * adds an interpolated place holder for all animated elements that have not
	 * been specified for the current (i.e. last) step. Then each animated
	 * elements is prepared for animation by calling
	 * {@link AnimatedElement#prepareForAnimation(boolean)}.
	 *
	 * @param isUndo
	 *            set <code>true</code> if the element should be prepared for
	 *            backwards undo animation
	 *
	 */
	final private void prepareAnimation(final boolean isUndo) {
		// complete step definition if needed
		if (!specifiedElementsInActualStep.isEmpty()) {
			/*
			 * fill up initialized animated elements that have not been extended
			 * by a step specification
			 */
			final List<AnimatedElement> unspecified = new ArrayList<AnimatedElement>(
					animatedElementsMap.values());
			unspecified.removeAll(specifiedElementsInActualStep);
			for (final AnimatedElement animatedElement : unspecified) {
				animatedElement.addPlaceholderStep();
			}
		}

		for (final AnimatedElement element : animatedElementsMap.values()) {
			element.prepareForAnimation(isUndo, flushBefore);
		}
	}

	/**
	 * In this method the animation of the figures happens.
	 * {@link MultipleAnimation} is signaled to watch for changes on the
	 * observed layers. Each animated element is requested to prepare step i (by
	 * calling {@link AnimatedElement#prepareStep(int)}). Then
	 * {@link MultipleAnimation} is told to run animate the changes.
	 *
	 * @param i
	 *            the index, indicating which of the specified steps should be
	 *            performed
	 * @param duration
	 *            the animation duration for this step in msec
	 */
	final private void performStep(final int i, final int duration) {
		MultipleAnimation.markBegin();
		for (final AnimatedElement element : animatedElementsMap.values()) {
			element.prepareStep(i);
		}
		MultipleAnimation.run(duration);
	}

	/**
	 * Called after an animation has been performed in {@link #execute()} or
	 * {@link #undo()}.
	 *
	 * Calls {@link AnimatedElement#animationDone()} on all
	 * {@link AnimatedElement}s and clears the
	 * {@link AnimatedElement#resetViewers}.
	 */
	final public void animationDone() {
		// call animationDone on the AnimatedElements in reversed order to
		// restore the order of the figures in their original parents
		final Object[] list = animatedElementsMap.values().toArray();
		for (int i = list.length - 1; i >= 0; i--) {
			((AnimatedElement) list[i]).animationDone();
		}
		// clean up used viewers after animation
		if (flushAfter) {
			for (final EditPartViewer viewer : usedViewers) {
				viewer.flush();
			}
			usedViewers.clear();
		}
	}
}
