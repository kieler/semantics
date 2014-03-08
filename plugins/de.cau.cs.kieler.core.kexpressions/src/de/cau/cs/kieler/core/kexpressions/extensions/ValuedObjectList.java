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
package de.cau.cs.kieler.core.kexpressions.extensions;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

/**
 * @author cmot
 * 
 */
public class ValuedObjectList extends ArrayList<ValuedObject> {

    private static final long serialVersionUID = 4213313884018190512L;

    private static KExpressionsExtension kExpressionsExtension = new KExpressionsExtension();

    private EObject container = null;

    public EObject getContainer() {
        return container;
    }

    public void setContainer(EObject container) {
        this.container = container;
    }

    @Override
    public boolean add(ValuedObject valuedObject) {
        boolean returnValue = super.add(valuedObject);
        // Also create a typeGroup
        if (container != null) {
            kExpressionsExtension.addValuedObject(container, valuedObject);
        }
        return returnValue;
    }

    // public boolean addAll(Collection<ValuedObject> valuedObjectList) {
    // // public boolean addAll(Collection<ValuedObject> valuedObjectList) {
    // boolean returnValue = super.addAll(valuedObjectList);
    // // Also create a typeGroup
    //
    // return returnValue;
    // }

}
