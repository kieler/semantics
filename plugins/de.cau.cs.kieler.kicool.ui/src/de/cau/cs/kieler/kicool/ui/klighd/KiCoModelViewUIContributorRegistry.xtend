/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.klighd

import java.util.List
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform

/**
 * @author aas
 *
 */
class KiCoModelViewUIContributorRegistry {
    
    public static val KICO_MODEL_VIEW_UI_CONTRIBUTOR_ID = "de.cau.cs.kieler.kicool.ui.contribution"
    
    private static var List<KiCoModelViewUIContributor> contributors
    
    public static def List<KiCoModelViewUIContributor> getContributors() {
        if(contributors === null) {
            initialize
        }
        return contributors
    }
    
    private static def void initialize() {
        // Create registered contributors
        contributors = newArrayList
        val registry = Platform.getExtensionRegistry()
        val config = registry.getConfigurationElementsFor(KICO_MODEL_VIEW_UI_CONTRIBUTOR_ID);
        for (IConfigurationElement e : config) {
            val Object o = e.createExecutableExtension("class");
            if (o instanceof KiCoModelViewUIContributor) {
                contributors.add(o);
            }
        }
    }
}