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
package de.cau.cs.kieler.language.server

import com.google.inject.AbstractModule
import org.eclipse.xtext.ide.server.DefaultProjectDescriptionFactory
import org.eclipse.xtext.ide.server.IProjectDescriptionFactory
import org.eclipse.xtext.ide.server.IWorkspaceConfigFactory
import org.eclipse.xtext.ide.server.ProjectWorkspaceConfigFactory

/**
 * @author sdo
 *
 */
class KeithServerModule extends AbstractModule {
    
    override configure() {
        bind(IWorkspaceConfigFactory).to(ProjectWorkspaceConfigFactory)
        bind(IProjectDescriptionFactory).to(DefaultProjectDescriptionFactory)
    }
    
}