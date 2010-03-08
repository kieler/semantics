/******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/

package de.cau.cs.kieler.core.ui.policies;

import java.util.Iterator;
import java.util.List;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteListener;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gmf.runtime.common.ui.services.icon.IconService;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.palette.PaletteToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.CreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.internal.palette.PaletteStack;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.RGB;

/**
 * This is the default popup bar editpolicy installed on diagrams. The popup bar
 * is populated using the element types of the tools of the palette drawer of
 * the last selected palette tool. If the diagram was just opened, the popup bar
 * is populated using the element types of the tools of the palette drawer that
 * is initially open. If there is no drawer initially open, then
 * <code>fillWithDefaults()</code> is called to initially populate the popup
 * bar.
 * 
 * @author cmahoney
 */
public class DiagramPopupBarPolicy extends PopupBarPolicy implements PaletteListener {

    /**
     * Holds the last active palette tool.
     */
    private ToolEntry theLastTool = null;

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gef.EditPolicy#activate()
     */
    @Override
    public void activate() {
        super.activate();
        addPaletteListener();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gef.EditPolicy#deactivate()
     */
    @Override
    public void deactivate() {
        removePaletteListener();
        super.deactivate();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gmf.runtime.diagram.ui.editpolicies.PopupBarEditPolicy#fillActionDescriptors()
     */
    @Override
    protected void fillPopupBarDescriptors() {
        fillBasedOnLastActivePaletteTool();
        if (getPopupBarDescriptors().isEmpty()) {
            fillBasedOnOpenPaletteDrawer();
            if (getPopupBarDescriptors().isEmpty()) {
                fillWithDefaults();
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gef.palette.PaletteListener#activeToolChanged(org.eclipse.gef.ui.palette.PaletteViewer,
     *      org.eclipse.gef.palette.ToolEntry)
     */
    public void activeToolChanged(PaletteViewer palette, ToolEntry tool) {
        if (!(tool instanceof SelectionToolEntry)) {
            theLastTool = tool;
        }
    }

    /**
     * Adds this edit policy as a palette listener.
     */
    private void addPaletteListener() {
        PaletteViewer paletteViewer = getHost().getViewer().getEditDomain()
                .getPaletteViewer();
        if (paletteViewer != null) {
            paletteViewer.addPaletteListener(this);
        }
    }

    /**
     * Removes this edit policy as a palette listener.
     */
    private void removePaletteListener() {
        PaletteViewer paletteViewer = getHost().getViewer().getEditDomain()
                .getPaletteViewer();
        if (paletteViewer != null) {
            paletteViewer.removePaletteListener(this);
        }
        theLastTool = null;
    }

    /**
     * Adds popup bar descriptors for all the shape tools in the palette
     * container of the last active palette tool. Subclasses may override if
     * they wish to customize this behavior for their diagram.
     */
    protected void fillBasedOnLastActivePaletteTool() {
        if (theLastTool == null) {
            return;
        }

        // Find the palette group or drawer containing the last active tool.
        PaletteContainer container = theLastTool.getParent();
        if (container == null) {
            return;
        }

        while (!(container instanceof PaletteDrawer)
                && !(container instanceof PaletteGroup)
                && !(container instanceof PaletteRoot)
                && container.getParent() != null) {
            container = container.getParent();
        }

        // Make sure the palette container is still in the palette root and has
        // not been removed. See bugzilla#176752.
        PaletteRoot realPaletteRoot = getHost().getViewer().getEditDomain()
                .getPaletteViewer().getPaletteRoot();
        PaletteContainer paletteRoot = container;
        boolean sameRoot = false;
        while (paletteRoot != null) {
            paletteRoot = paletteRoot.getParent();
            if (paletteRoot == realPaletteRoot) {
                sameRoot = true;
                break;
            }
        }

        if (sameRoot) {
            fillWithPaletteToolsInContainer(container);
        }
    }

    /**
     * Adds popup bar descriptors for all the shape tools in the given palette
     * container. Subclasses may override if they wish to customize this
     * behavior for their diagram.
     * 
     * @param palContainer
     *            the <code>PaletteContainer</code>
     */
    protected void fillWithPaletteToolsInContainer(PaletteContainer palContainer) {
        if (palContainer != null) {
            List theEntries = palContainer.getChildren();
            int isz = theEntries.size();
            for (int i = 0; i < isz; i++) {
                PaletteEntry theEntry = (PaletteEntry) theEntries.get(i);

                if (theEntry != null) {
                    if (theEntry instanceof PaletteToolEntry) {
                        PaletteToolEntry theXtoolsEntry = (PaletteToolEntry) theEntry;
                        Tool tempTool = theXtoolsEntry.createTool();
                        if ((tempTool != null)
                                && (tempTool instanceof CreationTool)) {
                            CreationTool theXtoolsTool = (CreationTool) tempTool;
                            IElementType theToolType = theXtoolsTool
                                    .getElementType();
                            if ((theToolType != null)) {

                                Image image = IconService.getInstance()
                                        .getIcon(theToolType);

                                // Workaround for mirroring and SWT.ICON issue
                                if (image != null && image.type == SWT.ICON
                                        && isMirrored()) {
                                    image = convert(image);
                                }

                                addPopupBarDescriptor(theToolType, image);
                            }
                        }
                    } else if (theEntry instanceof PaletteStack) {
                        // add all the entries from a palette stack as well
                        PaletteStack theStack = (PaletteStack) theEntry;
                        fillWithPaletteToolsInContainer(theStack);
                    }
                }
            }
        }
    }

    private boolean isMirrored() {
        return ((getHost().getViewer().getControl().getStyle() & SWT.MIRRORED) != 0);
    }

    private Image convert(Image srcImage) {
        int height = srcImage.getBounds().height;
        int width = srcImage.getBounds().width;

        ImageData srcImageData = srcImage.getImageData();

        RGB backgroundRGB = ((GraphicalEditPart) getHost()).getFigure()
                .getBackgroundColor().getRGB();
        int backgroundColor = srcImageData.palette.getPixel(backgroundRGB);

        // Set the transparent pixels to the background color
        int count = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (((srcImageData.maskData[count >> 3] >> (7 - (count % 8))) & 1) == 0) {
                    srcImageData.setPixel(x, y, backgroundColor);
                }
                count++;
            }
        }
        srcImageData.maskData = null;

        Image convertedImage = ImageDescriptor
                .createFromImageData(srcImageData).createImage(
                        srcImage.getDevice());

        imagesToBeDisposed.add(convertedImage);

        return convertedImage;
    }

    /**
     * Adds popup bar descriptors for all the shape tools in the palette drawer
     * that is initially open. Subclasses may override if they wish to customize
     * this behavior for their diagram.
     */
    protected void fillBasedOnOpenPaletteDrawer() {
        PaletteViewer paletteViewer = getHost().getViewer().getEditDomain()
                .getPaletteViewer();

        if (paletteViewer != null) {
            for (Iterator iter = paletteViewer.getPaletteRoot().getChildren()
                    .iterator(); iter.hasNext();) {
                Object child = iter.next();
                if (child instanceof PaletteDrawer) {
                    PaletteDrawer drawer = (PaletteDrawer) child;
                    if (drawer.isInitiallyOpen()) {
                        fillWithPaletteToolsInContainer(drawer);
                        break;
                    }
                }
            }
        }
    }

    /**
     * Subclasses can override to provide default tools if the popup bar cannot
     * be populated based on the state of the palette.
     */
    protected void fillWithDefaults() {
        // by default, add no popup bar descriptors.
    }

}
