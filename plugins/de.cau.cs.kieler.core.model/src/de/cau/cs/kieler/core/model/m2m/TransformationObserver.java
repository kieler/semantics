/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.m2m;

import java.util.LinkedList;
import java.util.List;

/**
 * Register yourself to this class to get notified about recently executed transformations.
 * 
 * @author ckru
 */
public final class TransformationObserver {

    /**
     * the listeners registered to the observer.
     */
    private List<ITransformationListener> listeners = new LinkedList<ITransformationListener>();
    
    /**
     * the singleton instance.
     */
    private static final TransformationObserver INSTANCE = new TransformationObserver();
    
    /**
     * constructor invisible since this is singleton.
     */
    private TransformationObserver() {
        
    }
     
    /**
     * Gets the singleton instance.
     * @return the singleton instance of this class
     */
    public static TransformationObserver getInstance() {
        return INSTANCE;
    }
    
    /**
     * Registered listeners will be notified after transformation execution.
     * 
     * @param listener the listener to be registered
     */
    public void register(final ITransformationListener listener) {
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }
    
    /**
     * deregister here if you want to stop being notified.
     * 
     * @param listener the listener to be deregistered
     */
    public void deregister(final ITransformationListener listener) {
        if (listeners.contains(listener)) {
            listeners.remove(listener);
        }
    }
    
    /**
     * Notify the registered listeners of a recently executed transformation.
     * 
     * @param context the context of the executed transformation
     * @param descriptor the descriptor of the executed transformation
     */
    public void notifyListeners(final ITransformationContext context,
            final TransformationDescriptor descriptor) {
        for (ITransformationListener listener: listeners) {
            listener.transformationExecuted(descriptor.getTransformationName(),
                    descriptor.getParameters(), descriptor.getResult());
        }
    }
    
}
