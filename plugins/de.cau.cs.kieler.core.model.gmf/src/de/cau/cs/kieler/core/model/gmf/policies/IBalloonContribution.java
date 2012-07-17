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
package de.cau.cs.kieler.core.model.gmf.policies;

import java.util.Map;

import org.eclipse.gef.EditPart;
import org.eclipse.swt.graphics.Image;

/**
 * The interface for contributions to the balloon popup bar.
 * 
 * @author soh
 */
public interface IBalloonContribution {

    /**
     * The image that should appear in the balloon.
     * 
     * @return the image
     */
    Image getImage();

    /**
     * The tooltip for the item in the balloon.
     * 
     * @return some description
     */
    String getTooltip();

    /**
     * Execute the command.
     */
    void run();

    /**
     * Set the edit part, return true if the edit part is supported.
     * 
     * @return true if the command is applicable for this edit part.
     */
    boolean isValid();

    /**
     * Initializes the balloon.
     * 
     * @param map
     *            the attributes received through the extension point.
     */
    void init(Map<String, String> map);

    /**
     * Initializes the balloon.
     * 
     * 
     * 
     * @param editPart
     *            the edit part
     */
    void init(EditPart editPart);

}
