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
package de.cau.cs.kieler.synccharts.listener;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * A cache for unique strings.
 * 
 * @author haf
 */
public class UniqueStringCache {

    private List<String> cachedValues = new ArrayList<String>();
    private EObject parent;
    private EAttribute attribute;

    /**
     * Constructor.
     * 
     * @param theParent the parent
     * @param theAttribute the attribute
     */
    public UniqueStringCache(final EObject theParent, final EAttribute theAttribute) {
        parent = theParent;
        attribute = theAttribute;
    }

    /**
     * Is the string contained?
     * 
     * @param string a string
     * @return true if it is contained
     */
    public boolean contains(final String string) {
        for (String cachedString : cachedValues) {
            if (cachedString.equals(string)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Add a string.
     * 
     * @param string a string
     */
    public void add(final String string) {
        cachedValues.add(string);
    }

    /**
     * Get the list.
     * 
     * @return the list
     */
    public List<String> getList() {
        return cachedValues;
    }

    /**
     * Get the parent.
     * 
     * @return the parent.
     */
    public EObject getParent() {
        return parent;
    }

    /**
     * Get the attribute.
     * 
     * @return the attribute
     */
    public EAttribute getAttribute() {
        return attribute;
    }

}
