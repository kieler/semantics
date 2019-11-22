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

import de.cau.cs.kieler.core.services.KielerLanguage
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data
import java.util.Comparator

/**
 * @author als
 */
@Data
class ModelInformation {
    
    @Accessors 
    static val LANGUAGES = KielerLanguage.allRegisteredLanguages
    @Accessors
    static val MODEL_LANGUAGE_MAP = LANGUAGES.fold(newHashMap)[map, lang | lang.supportedModels.forEach[ map.put(it, lang) ]; map]
        
    /** Sorts a list of types s.t. a super type is place after a sub type. */
    static val Comparator<Class<?>> TYPE_SORTER = new Comparator<Class<?>>() {
        override compare(Class<?> o1, Class<?> o2) {
            if (o1.isAssignableFrom(o2)) {
                return 1
            } else if (o2.isAssignableFrom(o1)) {
                return -1
            } else {
                return 0
            }
        }
    }
    
    static def getLanguage(Object model) {
        val matches = MODEL_LANGUAGE_MAP.keySet.filter[it.isAssignableFrom(model.class)].toList
        switch (matches) {
            case matches.size == 1: return MODEL_LANGUAGE_MAP.get(matches.head)
            case matches.size > 1: return MODEL_LANGUAGE_MAP.get(matches.sortWith(TYPE_SORTER).head)
            default: return null
        }
    }
    
    static def String getResourceExtension(Object model) {
        return model.language?.getResourceExtension(model)
    }
    
    static def getExtensionAndInjector(Object model) {
        val lang = model.language
        if (lang !== null) {
            return new Pair(lang.getResourceExtension(model), lang.injector)
        } else {
            return null
        }
    }

}