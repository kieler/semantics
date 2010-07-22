package muvitorkit.animation;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Point;

/**
 * @author Tony
 * 
 */
public interface IAnnotation {

	/**
	 * @return
	 */
	public boolean isStatic();

	/**
	 * @return
	 */
	public Point getOffset();

	/**
	 * @return
	 */
	public IFigure getFigure();

	/**
	 * @return
	 */
	public PolylineConnection getConnection();

	/**
	 * @param container
	 * @param target
	 */
	public void annotate(IFigure container, IFigure target);

	/**
	 * 
	 */
	public void deannotate();

	static public class LabelAnnotation extends Stub {

		public LabelAnnotation(final String text, final Point offset,
				final AbstractConnectionAnchor targetAnchor,
				final boolean isStatic) {
			super(new Label(text), offset, new ChopboxAnchor(null),
					targetAnchor, isStatic);
			getConnection().setLineStyle(Graphics.LINE_DASHDOTDOT);
			getConnection().setTargetDecoration(new PolylineDecoration());
		}

		public LabelAnnotation(final String text, final Point offset,
				final boolean isStatic) {
			this(text, offset, new ChopboxAnchor(null), isStatic);
		}

		public LabelAnnotation(final String text, final boolean isStatic) {
			this(text, new Point(50, 50), isStatic);
		}
	}

	static public class Stub implements IAnnotation {

		final private boolean isStatic;

		final private IFigure figure;

		final private Point offset;

		final private PolylineConnection connection = new PolylineConnection();

		/**
		 * @param figure
		 * @param offset
		 * @param targetAnchor
		 * @param isStatic
		 */
		public Stub(final IFigure figure, final Point offset,
				final AbstractConnectionAnchor sourceAnchor,
				final AbstractConnectionAnchor targetAnchor,
				final boolean isStatic) {
			this.figure = figure;
			this.offset = offset;
			this.isStatic = isStatic;
			sourceAnchor.setOwner(figure);
			connection.setSourceAnchor(sourceAnchor);
			connection.setTargetAnchor(targetAnchor);
		}

		public void annotate(final IFigure container, final IFigure target) {
			((AbstractConnectionAnchor) connection.getTargetAnchor())
					.setOwner(target);
			container.add(figure);
			container.add(connection);
		}

		public void deannotate() {
			final IFigure container = figure.getParent();
			container.remove(connection);
			container.remove(figure);
			((AbstractConnectionAnchor) connection.getTargetAnchor())
					.setOwner(null);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see muvitorkit.animation.IAnnotation#isStatic()
		 */
		public boolean isStatic() {
			return isStatic;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see muvitorkit.animation.IAnnotation#getFigure()
		 */
		public IFigure getFigure() {
			return figure;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see muvitorkit.animation.IAnnotation#getOffset()
		 */
		public Point getOffset() {
			return offset;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see muvitorkit.animation.IAnnotation#getConnection()
		 */
		public PolylineConnection getConnection() {
			return connection;
		}
	}
}
