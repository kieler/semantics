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
package de.cau.cs.kieler.kvid.ui.displays;

import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.kvid.datadistributor.Property;
import de.cau.cs.kieler.kvid.datadistributor.RuntimeConfiguration;
import de.cau.cs.kieler.kvid.visual.complex.AbstractDataDisplayEditPart;
import de.cau.cs.kieler.kvid.visual.complex.AbstractDisplayFactory;

/**
 * @author jjc
 *
 */
public class DisplayFactory extends AbstractDisplayFactory {
    
    /** Constant for getting scope clearing moment by name. */
    public static final String CLEAR_SCOPES = "Clear scopes when";
    
    /**
     * Constructor which will be called automatically.
     * Adds properties for the scope elements to the configuration.
     */
    public DisplayFactory() {
        RuntimeConfiguration.getInstance().addProperty(
                new Property("Clear scopes when", new String[] {
                        "visualization starts",
                        "visualization finishes" }));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbstractDataDisplayEditPart create(final View view, final String semanticHint) {
        if (semanticHint.equals("ScopeNode")) {
            return new ScopeEditPart(view);
        }
        return null;
    }

}
