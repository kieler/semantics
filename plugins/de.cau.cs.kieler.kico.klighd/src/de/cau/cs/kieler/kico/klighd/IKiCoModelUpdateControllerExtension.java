/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kico.klighd;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;

import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;

/**
 * @author ssm
 * @kieler.design 2016-06-08 proposed
 * @kieler.rating 2016-06-08 proposed yellow  
 */
public interface IKiCoModelUpdateControllerExtension {
    
    /**
     * Allows new menu contributions.
     * 
     * @param toolBar defines the toolbar object.
     * @param menu defines menu object.
     */
    void addContributions(final IToolBarManager toolBar, final IMenuManager menu);
    
    /**
     * Allows hooks for diagram updates.
     * 
     * @param model defines the model in question.
     * @param properties holds the klighd synthesis properties.
     */
    void onDiagramUpdate(final Object model, final KlighdSynthesisProperties properties);    
    
}
