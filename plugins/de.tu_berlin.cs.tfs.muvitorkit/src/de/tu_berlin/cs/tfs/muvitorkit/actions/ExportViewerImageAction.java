/**
 *
 */
package de.tu_berlin.cs.tfs.muvitorkit.actions;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.SimpleRootEditPart;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;

/**
 * This action exports the whole EditPartViewer containing some selected
 * GraphicalEditPart to a png, jpeg, or bmp image file.
 * 
 * @author Tony Modica
 * 
 */
public class ExportViewerImageAction extends SelectionAction {

	public static final String ID = "ExportViewerImageAction";

	private static int counter = 1;

	/**
	 * The viewer containing the currently selected GraphicalEditPart
	 */
	private EditPartViewer viewer = null;

	public ExportViewerImageAction(final IWorkbenchPart part) {
		super(part);
		setId(ID);
		setText("Export viewer image");
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT));
	}

	/**
	 * This action is enabled if a GraphicalEditPart is selected.
	 * 
	 * @see org.eclipse.gef.ui.actions.WorkbenchPartAction#calculateEnabled()
	 */
	@Override
	protected boolean calculateEnabled() {
		if (getSelection() == null) {
			return false;
		}
		final Object firstSelection = ((StructuredSelection) getSelection())
				.getFirstElement();
		if (firstSelection == null
				|| !(firstSelection instanceof GraphicalEditPart)) {
			return false;
		}
		viewer = ((GraphicalEditPart) firstSelection).getRoot().getViewer();
		return true;
	}

	/**
	 * Ask for a file name and save the viewer containing the currently selected
	 * GraphicalEditPart to a image file.
	 */
	@Override
	public void run() {
		final IEditorInput editorInput = (IEditorInput) getWorkbenchPart()
				.getAdapter(IEditorInput.class);
		final SaveAsDialog dialog = new SaveAsDialog(new Shell(Display
				.getDefault()));
		dialog.setBlockOnOpen(true);
		if (editorInput == null) {
			dialog.setOriginalName("viewerImage" + counter + ".png");
		} else {
			final String fileName = editorInput.getName();
			final int extensionPos = fileName.lastIndexOf(".");
			dialog
					.setOriginalName(fileName.substring(0, extensionPos)
							+ ".png");
		}
		dialog.create();
		dialog
				.setMessage("If you don't choose an extension png will be used a default.\nAfter export the workspace needs a manual refresh to show new image file.");
		dialog.setTitle("Specify file to export viewer image (png, jpeg, bmp)");
		dialog.open();
		if (Window.CANCEL == dialog.getReturnCode()) {
			return;
		}

		final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		final IPath path = root.getLocation().append(dialog.getResult());

		int format;
		final String ext = path.getFileExtension();
		if (ext.equals("png")) {
			format = SWT.IMAGE_PNG;
			// GIFs unterst�tzen nur 8bit Farben
			// } else if (ext.equals("gif")) {
			// format = SWT.IMAGE_GIF;
		} else if (ext.equals("jpeg")) {
			format = SWT.IMAGE_JPEG;
		} else if (ext.equals("bmp")) {
			format = SWT.IMAGE_BMP;
			// } else if (ext.equals("ico")) {
			// format = SWT.IMAGE_ICO;
		} else {
			MessageDialog
					.openError(
							null,
							"Invalid file extension!",
							"The specified extension ("
									+ ext
									+ ") is not a valid image format extension.\nPlease use png, jpeg, or bmp!");
			return;
		}

		IFigure figure = ((SimpleRootEditPart) viewer.getRootEditPart())
				.getFigure();
		if (figure instanceof Viewport) {
			figure = ((Viewport) figure).getContents();
		}
		final byte[] imageCode = createImage(figure, format);
		try {
			final File file = path.toFile();
			final FileOutputStream fos = new FileOutputStream(file);
			fos.write(imageCode);
			fos.flush();
			fos.close();
			counter++;
		} catch (final IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Returns the bytes of an encoded image for the specified IFigure in the
	 * specified format.
	 * 
	 * @param figure
	 *            the Figure to create an image for.
	 * @param format
	 *            one of SWT.IMAGE_BMP, SWT.IMAGE_BMP_RLE, SWT.IMAGE_GIF
	 *            SWT.IMAGE_ICO, SWT.IMAGE_JPEG, or SWT.IMAGE_PNG
	 * @return the bytes of an encoded image for the specified Figure
	 */
	private byte[] createImage(final IFigure figure, final int format) {

		final Device device = viewer.getControl().getDisplay();

		final Rectangle r = figure.getBounds();

		final ByteArrayOutputStream result = new ByteArrayOutputStream();

		Image image = null;
		GC gc = null;
		Graphics g = null;
		try {
			image = new Image(device, r.width, r.height);
			gc = new GC(image);
			g = new SWTGraphics(gc);
			g.translate(r.x * -1, r.y * -1);

			figure.paint(g);

			final ImageLoader imageLoader = new ImageLoader();
			imageLoader.data = new ImageData[] { image.getImageData() };
			imageLoader.save(result, format);
		} finally {
			if (g != null) {
				g.dispose();
			}
			if (gc != null) {
				gc.dispose();
			}
			if (image != null) {
				image.dispose();
			}
		}
		return result.toByteArray();
	}

}
