/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.core.services

import com.google.inject.Injector
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * @author als
 */
interface KielerLanguage {

    static def getAllRegisteredLanguages() {
        KielerServiceLoader.load(KielerLanguage)
    }
    
    /**
     * Returns the language injector with all necessary setups and registrations done.
     */
    abstract def Injector getInjector()
    
    /**
     * Returns a list of models classes supported by this language.
     */
    abstract def List<Class<? extends EObject>> getSupportedModels()
    
    /**
     * Returns a list of file extension (WITHOUT leading dot) supported by this language.
     */
    abstract def List<String> getSupportedResourceExtensions()
    
    /**
     * Returns the file extension for the given model if supported by this language, null otherwise.
     * No leading dot!
     */
    def String getResourceExtension(Object model) {
        if (supportedModels.exists[it.isInstance(model)]) {
            if (supportedResourceExtensions.size == 1) {
                return supportedResourceExtensions.head
            } else {
                throw new UnsupportedOperationException("Cannot find resource extension for model (none or multiple options)")
            }
        }
        return null
    }

}