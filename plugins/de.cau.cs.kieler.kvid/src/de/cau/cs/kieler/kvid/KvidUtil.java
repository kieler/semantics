/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kvid;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.annotations.NamedObject;

/**
 * Utility class for the KViD-Plugin. Holds commonly used methods statically.
 * 
 * @author jjc
 *
 */
public final class KvidUtil {
    
    /**
     * There shouldn't be an instance of this class.
     */
    private KvidUtil() { }

    /**
     * Converts a given AWT {@link Image} in it's SWT representation.
     * 
     * @param image The image in AWT format
     * @return The SWT {@link ImageData} for the given image
     */
    public static ImageData convertAWTImageToSWT(final Image image) {
        if (image == null) {
            throw new IllegalArgumentException("Null 'image' argument.");
        }
        int w = image.getWidth(null);
        int h = image.getHeight(null);
        if (w == -1 || h == -1) {
            return null;
        }
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return convertToSWT(bi);
    }
    
    /**
     * Helper method for converting AWT images into SWT ones.
     * 
     * @param bufferedImage The {@link BufferedImage} resulting from the first step of conversion
     * @return The SWT {@link ImageData} for the given image
     */
    private static ImageData convertToSWT(final BufferedImage bufferedImage) {
        if (bufferedImage.getColorModel() instanceof DirectColorModel) {
            DirectColorModel colorModel
                    = (DirectColorModel) bufferedImage.getColorModel();
            PaletteData palette = new PaletteData(colorModel.getRedMask(),
                    colorModel.getGreenMask(), colorModel.getBlueMask());
            ImageData data = new ImageData(bufferedImage.getWidth(),
                    bufferedImage.getHeight(), colorModel.getPixelSize(),
                    palette);
            WritableRaster raster = bufferedImage.getRaster();
            final int rasterSize = 3;
            int[] pixelArray = new int[rasterSize];
            for (int y = 0; y < data.height; y++) {
                for (int x = 0; x < data.width; x++) {
                    raster.getPixel(x, y, pixelArray);
                    int pixel = palette.getPixel(new RGB(pixelArray[0],
                            pixelArray[1], pixelArray[2]));
                    data.setPixel(x, y, pixel);
                }
            }
            return data;
        } else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
            IndexColorModel colorModel = (IndexColorModel)
                    bufferedImage.getColorModel();
            int size = colorModel.getMapSize();
            byte[] reds = new byte[size];
            byte[] greens = new byte[size];
            byte[] blues = new byte[size];
            colorModel.getReds(reds);
            colorModel.getGreens(greens);
            colorModel.getBlues(blues);
            RGB[] rgbs = new RGB[size];
            final int mask = 0xFF;
            for (int i = 0; i < rgbs.length; i++) {
                rgbs[i] = new RGB(reds[i] & mask, greens[i] & mask,
                        blues[i] & mask);
            }
            PaletteData palette = new PaletteData(rgbs);
            ImageData data = new ImageData(bufferedImage.getWidth(),
                    bufferedImage.getHeight(), colorModel.getPixelSize(),
                    palette);
            data.transparentPixel = colorModel.getTransparentPixel();
            WritableRaster raster = bufferedImage.getRaster();
            int[] pixelArray = new int[1];
            for (int y = 0; y < data.height; y++) {
                for (int x = 0; x < data.width; x++) {
                    raster.getPixel(x, y, pixelArray);
                    data.setPixel(x, y, pixelArray[0]);
                }
            }
            return data;
        }
        return null;
    }
    
    /**
     * Converts a EMF/GMF Fragment URI into a Ptolemy URI.
     * A Fragment URI looks like: //(type).(number of child of this type)/ etc.
     * A Ptolemy URI looks like: .(element name).(second element name)
     * 
     * This requires unique names on the same hierarchy level.
     * 
     * @param fragmentUri The Fragment URI to convert
     * @param resource The resource which holds the model element referred by
     *          the Fragment URI
     * @return A Ptolemy URI referring the model element
     */
    public static String fragmentUri2PtolemyUri(final String fragmentUri, final Resource resource) {
        String result = "";
        if (fragmentUri.startsWith("//")) {
            int lastOccurance = 2;
            int currentOccurance;
            while (fragmentUri.indexOf("/", lastOccurance) != -1) {
                currentOccurance = fragmentUri.indexOf("/", lastOccurance);
                result += ".";
                String currentUri;
                if (currentOccurance != lastOccurance) {
                    currentUri = fragmentUri.substring(0, currentOccurance);
                    lastOccurance = currentOccurance;
                } else {
                    currentUri = fragmentUri;
                    lastOccurance = fragmentUri.length();
                }
                EObject model = resource.getEObject(currentUri);
                if (model instanceof NamedObject) {
                    result += ((NamedObject) model).getName();
                } else {
                    throw new RuntimeException("Ptolemy URIs will only work with NamedObjects");
                }
            }
        } else {
            throw new RuntimeException("Malformatted URI");
        }
        return result;
    }
    
    /**
     * Converts a Ptolemy URI into a EMF/GMF Fragment URI.
     * A Fragment URI looks like: //(type).(number of child of this type)/ etc.
     * A Ptolemy URI looks like: .(element name).(second element name)
     * 
     * This requires unique names on the same hierarchy level.
     * 
     * @param ptolemyUri A Ptolemy URI referring the model element
     * @param resource The resource which holds the model element referred by
     *          the Fragment URI
     * @return The Fragment URI
     */
    public static String ptolemyUri2FragmentUri(final String ptolemyUri, final Resource resource) {
        String result = "";
        if (ptolemyUri.startsWith(".")) {
            EObject root = resource.getContents().get(0);
            result = "/";
            int lastOccurance = 1;
            int currentOccurance;
            
            while (ptolemyUri.indexOf(".", lastOccurance) != -1) {
                //parse Ptolemy URI and find corresponding EObject on the current level 
                result += "/";
                currentOccurance = ptolemyUri.indexOf(".", lastOccurance);
                String currentUri;
                
                if (currentOccurance != lastOccurance) {
                    currentUri = ptolemyUri.substring(lastOccurance, currentOccurance);
                    lastOccurance = currentOccurance;
                } else {
                    //when this is the last referrer, just take the rest
                    currentUri = ptolemyUri.substring(lastOccurance);
                    currentUri = currentUri.replaceAll("\\.", "");
                    lastOccurance = ptolemyUri.length();
                }
                String currentResult = new String(result);
                for (EObject eo : root.eContents()) {
                    //iterate through the current level and find the NamedObject with the same name
                    if (eo instanceof NamedObject) {
                        if (((NamedObject) eo).getName().equals(currentUri)) {
                            result += ((InternalEObject) eo.eContainer())
                                    .eURIFragmentSegment(
                                            eo.eContainingFeature(), eo);
                            root = eo;
                            break;
                        }
                    }
                }
                if (currentResult.equals(result)) {
                    //Element wasn't found, although this was the right level
                    //Return null then
                    return null;
                }
            }
        } else {
            throw new RuntimeException("Malformatted URI");
        }
        return result;
    }
    
    /**
     * Helper method for getting the currently active editor.
     * 
     * @return The currently active editor in the UI
     */
    public static IEditorPart getActiveEditor() {
        IEditorPart editor = null;
        IWorkbenchWindow[] activeWindows = PlatformUI.getWorkbench().getWorkbenchWindows();
        for (int i = 0; i < activeWindows.length; i++) {
            IWorkbenchPage page = activeWindows[i].getActivePage();
            if (page.getActiveEditor() != null) {
                editor = page.getActiveEditor();
            }
        }
        return editor;        
    }
}
