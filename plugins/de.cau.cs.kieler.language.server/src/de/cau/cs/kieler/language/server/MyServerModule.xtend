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

import de.cau.cs.kieler.sccharts.ide.text.IExecutableCommandService
import de.cau.cs.kieler.sccharts.ide.text.MyExecutableCommandService
import de.cau.cs.kieler.sccharts.ide.text.MyLanguageServerExtension
import org.eclipse.xtext.ide.DefaultIdeModule
import org.eclipse.xtext.ide.server.ILanguageServerExtension

/**
 * @author sdo
 *
 */
class MyServerModule extends DefaultIdeModule {
    
    def Class<? extends ILanguageServerExtension> bindILanguageServerExtension() {
        MyLanguageServerExtension
    }

    def Class<? extends IExecutableCommandService> bindIExecutableCommandService() {
        MyExecutableCommandService
    }
}