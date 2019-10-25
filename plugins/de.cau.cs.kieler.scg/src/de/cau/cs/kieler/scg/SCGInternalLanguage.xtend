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
package de.cau.cs.kieler.scg

import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Module
import de.cau.cs.kieler.core.services.KielerLanguage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl

/**
 * @author als
 */
class SCGInternalLanguage implements KielerLanguage {

    static Injector injector
    
    def static doSetup() {
        if (injector === null) {
            injector = Guice.createInjector(new Module() {
                override configure(Binder binder) {
                    binder.bind(ResourceSet).to(ResourceSetImpl)
                    binder.bind(Resource).to(XMIResourceImpl)
                }
            })
            // do registration
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("scg", injector.getInstance(XMIResourceFactoryImpl))
        }
        return injector
    }
    
    override getInjector() {
        return doSetup()
    }

    override getSupportedModels() {
        #[SCGraphs]
    }
    
    override getSupportedResourceExtensions() {
        #["scg"]
    }
    
    override isXtextLanguage() {
        return false;
    }
    
}