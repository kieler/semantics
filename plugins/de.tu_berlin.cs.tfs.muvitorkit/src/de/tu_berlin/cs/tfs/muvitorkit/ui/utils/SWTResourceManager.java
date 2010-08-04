package de.tu_berlin.cs.tfs.muvitorkit.ui.utils;

import java.util.HashMap;
import java.util.Vector;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Widget;

/**
 * Class to manage SWT resources (Font, Color, Image and Cursor) There are no
 * restrictions on the use of this code.
 * 
 * You may change this code and your changes will not be overwritten, but if you
 * change the version number below then this class will be completely
 * overwritten by Jigloo. #SWTResourceManager:version4.0.0#
 */
public class SWTResourceManager {

	private static final HashMap<String, Object> resources = new HashMap<String, Object>();

	static final Vector<Widget> users = new Vector<Widget>();

	private static final DisposeListener disposeListener = new DisposeListener() {
		public void widgetDisposed(final DisposeEvent e) {
			users.remove(e.getSource());
			if (users.isEmpty()) {
				dispose();
			}
		}
	};

	/**
	 * This method should be called by *all* Widgets which use resources
	 * provided by this SWTResourceManager. When widgets are disposed, they are
	 * removed from the "users" Vector, and when no more registered Widgets are
	 * left, all resources are disposed.
	 * <P>
	 * If this method is not called for all Widgets then it should not be called
	 * at all, and the "dispose" method should be explicitly called after all
	 * resources are no longer being used.
	 */
	public static void registerResourceUser(final Widget widget) {
		if (users.contains(widget)) {
			return;
		}
		users.add(widget);
		widget.addDisposeListener(disposeListener);
	}

	public static void dispose() {
		for (final Object resource : resources.keySet()) {
			if (resource instanceof Font) {
				((Font) resource).dispose();
			} else if (resource instanceof Color) {
				((Color) resource).dispose();
			} else if (resource instanceof Image) {
				((Image) resource).dispose();
			} else if (resource instanceof Cursor) {
				((Cursor) resource).dispose();
			}
		}
		resources.clear();
	}

	public static Font getFont(final String name, final int size,
			final int style) {
		return getFont(name, size, style, false, false);
	}

	public static Font getFont(final String name, final int size,
			final int style, final boolean strikeout, final boolean underline) {
		final String fontName = name + "|" + size + "|" + style + "|"
				+ strikeout + "|" + underline;
		final Object cachedFont = resources.get(fontName);
		if (cachedFont != null) {
			return (Font) cachedFont;
		}
		final FontData fd = new FontData(name, size, style);
		if (strikeout || underline) {
			try {
				final Class<?> lfCls = Class
						.forName("org.eclipse.swt.internal.win32.LOGFONT");
				final Object lf = FontData.class.getField("data").get(fd);
				if (lf != null && lfCls != null) {
					if (strikeout) {
						lfCls.getField("lfStrikeOut").set(lf,
								Byte.valueOf((byte) 1));
					}
					if (underline) {
						lfCls.getField("lfUnderline").set(lf,
								Byte.valueOf((byte) 1));
					}
				}
			} catch (final Throwable e) {
				System.err.println("Unable to set underline or strikeout"
						+ " (probably on a non-Windows platform). " + e);
			}
		}
		final Font font = new Font(Display.getDefault(), fd);
		resources.put(fontName, font);
		return font;
	}

	public static Image getImage(final String url, final Control widget) {
		final Image img = getImage(url);
		if (img != null && widget != null) {
			img.setBackground(widget.getBackground());
		}
		return img;
	}

	public static Image getImage(final String urlPar) {
		String url = urlPar.replace('\\', '/');
		if (url.startsWith("/")) {
			url = url.substring(1);
		}
		final Object cachedImage = resources.get(url);
		if (cachedImage != null && cachedImage instanceof Image) {
			return (Image) cachedImage;
		}
		try {
			final Image img = new Image(Display.getDefault(),
					SWTResourceManager.class.getClassLoader()
							.getResourceAsStream(url));
			resources.put(url, img);
			return img;
		} catch (final Exception e) {
			System.err
					.println("SWTResourceManager.getImage: Error getting image "
							+ url + ", " + e);
			return null;
		}
	}

	public static Color getColor(final RGB rgb) {
		return getColor(rgb.red, rgb.green, rgb.blue);
	}

	public static Color getColor(final int red, final int green, final int blue) {
		final String name = "COLOR:" + red + "," + green + "," + blue;
		final Object cachedColor = resources.get(name);
		if (cachedColor != null) {
			return (Color) cachedColor;
		}
		final Color color = new Color(Display.getDefault(), red, green, blue);
		resources.put(name, color);
		return color;
	}

	public static Cursor getCursor(final int type) {
		final String name = "CURSOR:" + type;
		final Object cachedCursor = resources.get(name);
		if (cachedCursor != null) {
			return (Cursor) cachedCursor;
		}
		final Cursor cursor = new Cursor(Display.getDefault(), type);
		resources.put(name, cursor);
		return cursor;
	}

}
