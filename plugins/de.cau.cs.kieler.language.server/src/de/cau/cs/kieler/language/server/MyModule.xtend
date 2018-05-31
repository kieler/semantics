/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import org.eclipse.xtext.service.AbstractGenericModule
import org.eclipse.xtext.ide.server.ILanguageServerExtension

/**
 * @author sdo
 * 
 */
class MyModule extends AbstractGenericModule {

// TODO bind everything needed
    def Class<? extends ILanguageServerExtension> bindILanguageServerExtension() {
        MyLanguageServerExtension
    }

//    def Class<? extends IExecutableCommandService> bindIExecutableCommandService() {
//        MyExecutableCommandService
//    }
}
