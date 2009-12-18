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
package de.cau.cs.kieler.core.ui.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;

/**
 * An interface for figures that react to changes of model attributes.
 *
 * @author msp
 */
public interface IAttributeAwareFigure extends IFigure, Adapter {

    /**
     * Listen to changes in attributes of the given model element.
     * 
     * @param object the model element that is watched
     */
    void listenTo(EObject object);
    
}
