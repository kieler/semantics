/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.actions;

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;

import de.cau.cs.kieler.core.kgraph.KNode;

/**
 * 
 * @author als
 * @kieler.design 2014-08-26 proposed
 * @kieler.rating 2014-08-26 proposed yellow
 */
public class TracingSelectionEnablePropertyTester extends PropertyTester {

    public final String NAMESPACE = "de.cau.cs.kieler.kitt.klighd.enable.select.property";
    public final String SOURCE = "source";
    public final String TARGET = "target";
    public final String NONE = "none";

    public TracingSelectionEnablePropertyTester() {
    }

    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        try {
            KNode node = (KNode)(((List) receiver).get(0));
            if (property.equals(SOURCE)) {
                System.out.println("SOURCE");
                return true;
            } else if (property.equals(TARGET)) {
                System.out.println("TARGET");
                return true;
            } else if (property.equals(NONE)) {
                System.out.println("NONO");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
