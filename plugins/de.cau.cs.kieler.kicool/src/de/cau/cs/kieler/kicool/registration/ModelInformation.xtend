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
package de.cau.cs.kieler.kicool.registration

import de.cau.cs.kieler.core.services.KielerServiceLoader
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data

/**
 * @author als
 */
@Data
class ModelInformation {
    
    @Accessors 
    static val PROVIDERS = KielerServiceLoader.load(IModelInformationProvider).toList
        
    static def String getResourceExtension(Object model) {
        return PROVIDERS.map[getResourceExtension(model)].findFirst[!it.nullOrEmpty]
    }    

}