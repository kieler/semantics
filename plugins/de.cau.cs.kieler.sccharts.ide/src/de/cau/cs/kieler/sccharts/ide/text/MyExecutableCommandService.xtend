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
package de.cau.cs.kieler.sccharts.ide.text

import org.eclipse.lsp4j.ExecuteCommandParams
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.util.CancelIndicator

/**
 * @author sdo
 * 
 */
class MyExecutableCommandService implements IExecutableCommandService {
//TODO
    override initialize() {
        #["testlang.a", "testlang.b", "testlang.c"]
    }

    override execute(ExecuteCommandParams params, ILanguageServerAccess access, CancelIndicator cancelIndicator) {
        if (params.command == "testlang.a") {
            return "a"
        } else if (params.command == "testlang.b") {
            return "b"
        } else if (params.command == "testlang.c") {
            return "c"
        }
    }

}
