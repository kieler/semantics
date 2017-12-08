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

import com.google.common.base.Predicate
import com.google.common.collect.LinkedHashMultimap
import com.google.common.collect.Multimap
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@Data
class ResourceExtension {
    private final String className;
    private final String fileExtension;
    private final boolean isXMI;
    private final String editorID;
    private final Predicate<Object> predicate;
    
    /*
     * STATIC extension point loading
     */       
    public static final String RESOURCEEXTENSION_EXTENSION_POINT_ID =
            "de.cau.cs.kieler.kicool.resource.extension" 
             
    @Accessors 
    private static final Multimap<String, ResourceExtension> cache = LinkedHashMultimap.create(20,2)
    
    public static def loadResourceExtensions() {
        cache.clear
        val resourceExtensions =
                Platform.getExtensionRegistry().getConfigurationElementsFor(
                        RESOURCEEXTENSION_EXTENSION_POINT_ID);
        for (rext : resourceExtensions) {
            try {
                val className = rext.getAttribute("ePackageName");
                val fileExtension = rext.getAttribute("extensionName");
                val isXMI = rext.getAttribute("isXMI");
                val editorID = rext.getAttribute("editor_id");
                var Predicate<Object> predicate = null
                if (!rext.getAttribute("predicate").nullOrEmpty) {
                    try {
                        predicate = rext.createExecutableExtension("predicate") as Predicate<Object>
                    } catch (Exception e) {
                        e.printStackTrace
                    }
                }
                cache.put(className, new ResourceExtension(className, fileExtension,
                        isXMI.toLowerCase.trim.equals("true"), editorID, predicate))
            } catch (Exception e) {
                e.printStackTrace
            }
        }
    }
    
    public static def ResourceExtension getResourceExtension(Object model) {
        if (cache.empty) loadResourceExtensions
        val candidates = if (model instanceof EObject) {
            cache.get((model as EObject).eClass().getEPackage().getName())
        } else {
            cache.get(model.getClass().getSimpleName())
        }
        switch (candidates.size) {
            case 0: return null
            case 1: return candidates.head
            default: return candidates.filter[predicate === null || predicate.apply(model)].head
        }
    }    

}