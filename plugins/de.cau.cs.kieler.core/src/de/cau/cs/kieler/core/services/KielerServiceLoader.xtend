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

import java.util.ServiceLoader
import org.eclipse.core.runtime.Platform
import de.cau.cs.kieler.core.CoreActivator
import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * ServiceLoader adaoted to the KIELER project.
 * 
 * @author als
 */
class KielerServiceLoader {

    /**
     * Loads and instanciates all implementing classes of the given service registered via '/META-INF/services/'.
     * <br>
     * If exected with a running eclipse platform the implementations will be loaded from the Bundles, otherwise the
     * standart ServiceLoader is used.
     * 
     * @param  service
     *         The interface or abstract class representing the service.
     * 
     * @return An iterable with instances of all implementing classes.
     */
    static def <S> Iterable<S> load(Class<S> service) {
        if (Platform.isRunning) {
            val serviceClasses = <Class<? extends S>>newHashSet
            for (bundle : CoreActivator.CONTEXT?.bundles) {
                try {
                    val file = bundle.getResource("/META-INF/services/" + service.canonicalName)
                    if (file !== null) {
                        val reader = new BufferedReader(new InputStreamReader(file.openStream))
                        reader.lines.forEach[serviceClasses += bundle.loadClass(it) as Class<? extends S>]
                        reader.close
                    }
                } catch (Exception e) {
                    // ignore
                }
            }
            return serviceClasses.filterNull.map[getConstructor?.newInstance].filterNull
        } else {
            return ServiceLoader.load(service)
        }
    }
}
