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
package de.cau.cs.kieler.language.server

import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.ide.server.WorkspaceManager
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.Issue

/**
 * The initialize message of the LSP sends a baseDir of the workspace. Xtext automatically uses that to create
 * a folder with Xtext nature. This is not what we want since it heavily influences performance.
 * 
 * @author sdo
 *
 */
class DisableBaseDirWorkspaceManager extends WorkspaceManager {
    override void initialize(URI baseDir, (URI, Iterable<Issue>)=>void issueAcceptor, CancelIndicator cancelIndicator) {
        refreshWorkspaceConfig(cancelIndicator)
    }
}