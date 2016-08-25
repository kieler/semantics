/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.extensions;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtensionOLD;
import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.sccharts.Scope;

/**
 * ValuedObjectList is a specific list. If you add ValuedObjects to this list their TypeGroup will
 * be added to the container. If they do not have a TypeGroup yet, a TypeGroup will be created.
 * 
 * @author cmot
 * @kieler.design 2015-12-15 proposed
 * @kieler.rating 2015-12-15 proposed yellow
 */
public class ValuedObjectList extends ArrayList<ValuedObject> {

    private static final long serialVersionUID = 4213313884018190512L;

    private static SCChartsTransformationExtension sCChartsTransformationExtension = new SCChartsTransformationExtension();

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
        if (container != null && container instanceof Scope) {
            sCChartsTransformationExtension._addValuedObject((Scope)container, valuedObject);      
        }
        return returnValue;
    }

}
