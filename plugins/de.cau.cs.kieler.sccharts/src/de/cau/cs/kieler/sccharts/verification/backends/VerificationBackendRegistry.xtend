/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
 package de.cau.cs.kieler.sccharts.verification.backends

import java.util.List
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform

/**
 * @author aas
 */
class VerificationBackendRegistry {
    
    public static val VERIFICATION_BACKEND_ID = "de.cau.cs.kieler.sccharts.verification.verificationBackend"
    
    private static var List<VerificationBackend> backends
    
    public static def List<VerificationBackend> getBackends() {
        if(backends === null) {
            initialize
        }
        return backends
    }
    
    private static def void initialize() {
        // Create registered contributors
        backends = newArrayList
        val registry = Platform.getExtensionRegistry()
        val config = registry.getConfigurationElementsFor(VERIFICATION_BACKEND_ID);
        for (IConfigurationElement e : config) {
            val Object o = e.createExecutableExtension("class");
            if (o instanceof VerificationBackend) {
                backends.add(o);
            }
        }
    }
}