package de.cau.cs.kieler.ehelp.imagepaste;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.ehelp.util.EHelpConsts;
import de.cau.cs.kieler.ehelp.util.EHelpUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ImagePaste extends AbstractHandler {

	private static final int NUM_DIGITS = 2;

	// -------------------------------------------------------------------------

	/**
	 * Get the next number with a mininum number of NUM_DIGITS
	 * 
	 * @param num
	 * @return
	 */
	private String getStringNumber(int num) {
		String strNum = num + "";
		while (strNum.length() < NUM_DIGITS) {
			strNum = "0" + strNum;
		}
		return strNum;
	}

	// -------------------------------------------------------------------------

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
//				String baseDir = Util.getCurrentWorkspaceLocationString() + "/src-gen/" + Constants.GEN_FOLDER_NAME
//						+ "/" + Constants.GEN_IMAGE_SUBFOLDER_NAME;
				String baseDir = EHelpUtil.getCurrentWorkspaceLocationString(true, true); 

				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				int n = 1;
				DataFlavor[] flavors = clipboard.getAvailableDataFlavors();
				for (DataFlavor flavor : flavors) {
					BufferedImage image;
					try {
						Object o = clipboard.getData(flavor);
						if (o instanceof BufferedImage) {
							image = (BufferedImage) o;
							String imageFilename = baseDir + "/img" + getStringNumber(n) + ".png";
							System.out.println(imageFilename);
							File file = new File(imageFilename);
							while (file.exists()) {
								n++;
								imageFilename = baseDir + "/img" + getStringNumber(n) + ".png";
								System.out.println(imageFilename);
								file = new File(imageFilename);
							}
							ImageIO.write(image, "png", file);
						}

						EHelpUtil.addToCurrentEditor("[ \"img" + getStringNumber(n) + ".png\" ]\n");
						EHelpUtil.refreshWorkspaces();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
		});

		return null;
	}

	//-------------------------------------------------------------------------

}

