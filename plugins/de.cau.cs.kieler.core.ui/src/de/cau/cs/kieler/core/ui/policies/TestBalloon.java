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
package de.cau.cs.kieler.core.ui.policies;

import java.util.HashMap;

import org.eclipse.gef.EditPart;
import org.eclipse.swt.graphics.Image;

import de.cau.cs.kieler.core.ui.CoreUIPlugin;

/**
 * A test balloon.
 * 
 * @author soh
 */
public class TestBalloon implements IBalloonContribution {

    /**
     * {@inheritDoc}
     */
    public Image getImage() {
        return CoreUIPlugin.getImageDescriptor("/icons/kiel_16.gif")
                .createImage();
    }

    /**
     * {@inheritDoc}
     */
    public String getTooltip() {
        return "Don't press this button!";
    }

    /**
     * {@inheritDoc}
     */
    public void run() {
        System.out.println("I am evil Homer! I am evil Homer!");
    }

    /**
     * {@inheritDoc}
     */
    public boolean setEditPart(final EditPart editPart) {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void setAttributes(final HashMap<String, String> map) {
    }

}
