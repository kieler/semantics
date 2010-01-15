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
package de.cau.cs.kieler.core.ui.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A condition that is composed of a set of other conditions.
 * 
 * @author msp
 */
public class CompoundCondition implements ICondition {

    private List<ICondition> conditions;

    /**
     * Creates a compound condition from a collection of conditions.
     * 
     * @param theconditions
     *            the conditions
     */
    public CompoundCondition(final Collection<ICondition> theconditions) {
        conditions = new ArrayList<ICondition>(theconditions);
    }

    /**
     * Creates a compound condition from an array of conditions.
     * 
     * @param theconditions
     *            the conditions
     */
    public CompoundCondition(final ICondition[] theconditions) {
        conditions = new ArrayList<ICondition>(theconditions.length);
        for (ICondition cond : theconditions) {
            conditions.add(cond);
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean evaluate(final Object object) {
        for (ICondition cond : conditions) {
            try {
                if (!cond.evaluate(object)) {
                    return false;
                }
            } catch (NullPointerException e) {
                // null pointer exception may occur if copy&paste is used
                return false;
            }
        }
        return true;
    }

}
