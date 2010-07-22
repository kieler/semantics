/**
 *
 */
package muvitorkit.animation;

import static java.lang.StrictMath.PI;
import static java.lang.StrictMath.hypot;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.random;
import static java.lang.StrictMath.sin;
import static java.lang.StrictMath.sqrt;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * This class provides some basic {@link AnimationPathModifier}s ready to use
 * with {@link AnimatingCommand}s:
 *
 * <ul>
 * <li> {@link #getStandardModifier()}: just linear interpolation over progress,
 * no y-amplitude.
 * <li> {@link #getCircularModifier()}: alter the path to be a half circle from
 * start to end.
 * <li> {@link #getEllipticModifier(int)}: alter the path to be a ellipse from
 * start to end with a given axis length in px.
 * <li> {@link #getParabolicModifier(int)} : alter the path to be a parabolic
 * curve from start to end with a given maximum amplitude length in px.
 * <li> {@link #getRandomModifier(int)} : alter the path to have random
 * y-amplitudes.
 * <li> {@link #getSineModifier(int, float)} : alter the path to a sine curve
 * with given frequency and amplitude.
 * </ul>
 *
 * <p>
 * Of course you may implement your own modifier via
 * {@link #getLocation(Rectangle, Rectangle, float)} using the helper method
 * {@link #getOrthogonalShifted(Point, Dimension, double)} to rotate the
 * relative coordinate system. Sorry, I can't explain this better now.
 * </p>
 *
 * TODO Proceed steadily on the paths themselves instead of proceeding steadily
 * along the shift vector. So the elements would not "accelerate" when reaching
 * the end of a circle. This would need to alter the x coordinate according to
 * the progress and the shape of the path as well.
 *
 * @author "Tony Modica"
 *
 */
abstract public class AnimationPathModifier {

	private final static AnimationPathModifier linearModifier = new AnimationPathModifier() {
		@Override
		public Point getLocation(final Rectangle initialBounds,
				final Rectangle endingBounds, final double progress) {
			final Point initialLocation = initialBounds.getLocation();
			final Dimension shift = endingBounds.getLocation().getDifference(
					initialLocation).scale(progress);
			return initialLocation.translate(shift);
		}
	};

	private final static AnimationPathModifier circularModifier = new AnimationPathModifier() {
		@Override
		public Point getLocation(final Rectangle initialBounds,
				final Rectangle endingBounds, final double progress) {
			final Point initialLocation = initialBounds.getLocation();
			final Dimension shift = endingBounds.getLocation().getDifference(
					initialLocation);
			final double axis = hypot(shift.width, shift.height);
			final double delta = sqrt(progress - pow(progress, 2)) * axis;
			shift.scale(progress);
			return getOrthogonalShifted(initialLocation.translate(shift),
					shift, delta);
		}
	};

	abstract public Point getLocation(final Rectangle intialBounds,
			final Rectangle endingBounds, double progress);

	final static public AnimationPathModifier getStandardModifier() {
		return linearModifier;
		// return getRandomModifier(100);
		// return getParabolicModifier(100);
		// return getSineModifier(50, 3);
		// return getEllipticModifier(100);
		// return getCircularModifier();
	}

	final static public AnimationPathModifier getSineModifier(final int amp,
			final float periods) {
		return new AnimationPathModifier() {
			// a whole period is 360° or 2*PI
			final private double cachedFactor = periods * 2 * PI;

			@Override
			public Point getLocation(final Rectangle initialBounds,
					final Rectangle endingBounds, final double progress) {
				final Point initialLocation = initialBounds.getLocation();
				final double delta = amp * sin(progress * cachedFactor);
				final Dimension shift = endingBounds.getLocation()
						.getDifference(initialLocation).scale(progress);
				return getOrthogonalShifted(initialLocation.translate(shift),
						shift, delta);
			}
		};
	}

	final static public AnimationPathModifier getEllipticModifier(final int axis) {
		return new AnimationPathModifier() {
			@Override
			public Point getLocation(final Rectangle initialBounds,
					final Rectangle endingBounds, final double progress) {
				final Point initialLocation = initialBounds.getLocation();
				final double delta = sqrt(progress - pow(progress, 2)) * 2
						* axis;
				final Dimension shift = endingBounds.getLocation()
						.getDifference(initialLocation).scale(progress);
				return getOrthogonalShifted(initialLocation.translate(shift),
						shift, delta);
			}
		};
	}

	final static public AnimationPathModifier getCircularModifier() {
		return circularModifier;
	}

	final static public AnimationPathModifier getParabolicModifier(final int amp) {
		return new AnimationPathModifier() {
			@Override
			public Point getLocation(final Rectangle initialBounds,
					final Rectangle endingBounds, final double progress) {
				final Point initialLocation = initialBounds.getLocation();
				final double delta = amp * (1 - pow((2 * progress - 1), 2));
				final Dimension shift = endingBounds.getLocation()
						.getDifference(initialLocation).scale(progress);
				return getOrthogonalShifted(initialLocation.translate(shift),
						shift, delta);
			}
		};
	}

	final static public AnimationPathModifier getRandomModifier(final int max) {
		return new AnimationPathModifier() {
			@Override
			public Point getLocation(final Rectangle initialBounds,
					final Rectangle endingBounds, final double progress) {
				final Point initialLocation = initialBounds.getLocation();
				final double delta = (random() - 0.5) * max;
				final Dimension shift = endingBounds.getLocation()
						.getDifference(initialLocation).scale(progress);
				return getOrthogonalShifted(initialLocation.translate(shift),
						shift, delta);
			}
		};
	}

	final protected static Point getOrthogonalShifted(final Point location,
			final Dimension direction, final double length) {
		final double factor = length / hypot(direction.width, direction.height);
		direction.transpose().scale(-factor, factor);
		return location.translate(direction);
	}
}
