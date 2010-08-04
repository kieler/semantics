package de.tu_berlin.cs.tfs.muvitorkit.ui.utils;

import de.tu_berlin.cs.tfs.muvitorkit.ui.MuvitorActivator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.TreeEditPart;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * This class is a template, showing how a static IconUtil class can be built.
 * The purpose of this class is to manage the icons in some image folder in an
 * uniform way and cache them in the plugin's {@link ImageRegistry}. Do not
 * create or access Images for the icon files on other places! <br>
 * <b>Because of its static methods it is not intended to be subclassed but to
 * be copied and modified directly.</b>
 * 
 * <p>
 * The methods to use in your plugin are
 * <ul>
 * <li> {@link #getDescriptor(int, int, int)} to get an {@link ImageDescriptor}s
 * for Actions and {@link ToolEntry}s on Palettes, and
 * <li> {@link #getIcon(int, int, int)} to get {@link Image}s for
 * {@link TreeEditPart}s or {@link IFigure}s of {@link GraphicalEditPart}s, or
 * <li>alternatively the methods {@link #getDescriptor(int, int)} and
 * {@link #getIcon(int, int)} for icons are fully distinguishable by their name
 * without an extra attribute.
 * </ul>
 * These will take care of the correct creating of the descriptors and images
 * and caching them in the plugin's image registry.
 * 
 * <p>
 * <em>How to point to some image files:</em><br>
 * The main idea is that you specify a folder in your plugin (like in this
 * template <code>{@link #defaultImagePath} = "icons/"</code>) and put all your PNG image
 * files in it. <br>
 * All the public methods mentioned above call the private method
 * {@link #getFileName(int, int, int)} to build a file name for the given type,
 * attribute and size (preferably constants of this class like
 * {@link #GRAPH_LAYOUT}). Your task is to extend
 * {@link #getFileName(int, int, int)} with switch-case blocks such that it
 * builds the filename of the icon you put in your image folder for some type of
 * icon you need. <br>
 * <em>Naming proposition:</em><br>
 * An universal pattern for naming the icon files would be "NAMEXX.png" or
 * "NAMEATTXX.png" like the examples "graphlayout16.png" and
 * "graphlayout24.png". This way, you can build the filename by simply
 * concatenating a name string for the type constant with some attribute string
 * and the size integer like in this template.
 * 
 * @author Tony Modica
 */
public class IconUtilTemplate {

	/**
	 * A string describing the folder containing the image files.
	 */
	private static final String defaultImagePath = "icons/";

	public static final int GRAPH_LAYOUT = 0;

	public static final int GRID = 1;

	public static final int RULER = 2;

	public static final int TRIM = 3;

	/**
	 * The plugin's {@link ImageRegistry} caching the images.
	 */
	private static final ImageRegistry reg = MuvitorActivator.getDefault()
			.getImageRegistry();

	private IconUtilTemplate() {
	}

	/**
	 * @param type
	 *            an integer describing the type of icon to be returned
	 * @param size
	 *            the size of the icon to returned
	 * @return a {@link Image} for the given type and with the given size
	 * 
	 * @see #getIcon(int, int, int)
	 * @see #getFileName(int, int, int)
	 */
	final public static Image getIcon(final int type, final int size) {
		return getIcon(type, 0, size);
	}

	/**
	 * @param type
	 *            an integer describing the type of icon to be returned
	 * @param attribute
	 *            an integer describing a further distinguishing attribute of
	 *            the icon to be returned
	 * @param size
	 *            the size of the icon to be returned
	 * @return a {@link Image} for the given type, special attribute, and size
	 * 
	 * @see #getFileName(int, int, int)
	 */
	final public static Image getIcon(final int type, final int attribute,
			final int size) {
		final String fileName = getFileName(type, attribute, size) + ".png";
		final Image icon = reg.get(fileName);
		if (icon != null) {
			return icon;
		}
		// create cached descriptor for plugin's image registry and then get
		// image
		getDescriptor(type, attribute, size);
		return reg.get(fileName);
	}

	/**
	 * @param type
	 *            an integer describing the type of image descriptor to be
	 *            returned
	 * @param size
	 *            the size of the image descriptor to be returned
	 * @return a {@link ImageDescriptor} for the given type and size
	 * 
	 * @see #getDescriptor(int, int, int)
	 * @see #getFileName(int, int, int)
	 */
	final public static ImageDescriptor getDescriptor(final int type,
			final int size) {
		return getDescriptor(type, 0, size);
	}

	/**
	 * @param type
	 *            an integer describing the type of image descriptor to be
	 *            returned
	 * @param attribute
	 *            an integer describing a further distinguishing attribute of
	 *            the image descriptor to be returned
	 * @param size
	 *            the size of the image descriptor to be returned
	 * @return a {@link ImageDescriptor} for the given type and a special
	 *         attribute with the given size
	 * 
	 * @see #getFileName(int, int, int)
	 */
	final public static ImageDescriptor getDescriptor(final int type,
			final int attribute, final int size) {
		final String fileName = getFileName(type, attribute, size) + ".png";
		ImageDescriptor result = reg.getDescriptor(fileName);
		if (result != null) {
			return result;
		}
		result = MuvitorActivator.getImageDescriptor(defaultImagePath
				+ fileName);
		/*
		 * FIXED: MuvitorActivator is looking only in the actual editor plugin,
		 * so for the default actions MuvitorKit provides we have to look in the
		 * MuvitorKit plugin as well
		 */
		if (result == null) {
			result = AbstractUIPlugin.imageDescriptorFromPlugin("MuvitorKit",
					"icons/" + fileName);
		}
		if (result != null) {
			reg.put(fileName, result);
		}
		return result;
	}

	/**
	 * This method builds the file name for the given parameters that the public
	 * methods above try to open to get an {@link ImageDescriptor} or
	 * {@link Image} from.
	 * 
	 * @param type
	 *            an integer describing a type of icon
	 * @param attribute
	 *            an integer describing a further distinguishing attribute of an
	 *            icon
	 * @param size
	 *            the size of the icon
	 * @return a file name for an image file containing an image that is
	 *         described by the parameters type, attribute, and size
	 */
	private static String getFileName(final int type, final int attribute,
			final int size) {
		switch (type) {
		case GRAPH_LAYOUT:
			return "graphlayout" + size;
		case GRID:
			return "grid" + size;
		case RULER:
			return "ruler" + size;
		case TRIM:
			return "trim" + size;
		}
		return "unknown" + 16;
	}
}
