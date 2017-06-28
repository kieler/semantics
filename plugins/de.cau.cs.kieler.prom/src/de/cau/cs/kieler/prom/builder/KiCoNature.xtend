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
package de.cau.cs.kieler.prom.builder

import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IProjectNature
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.resources.ICommand

/**
 * Nature for projects that have models which can be compiled with KiCo.
 * 
 * @author aas
 *
 */
class KiCoNature implements IProjectNature {

    // ID of the natures, which consists of Bundle-SymbolicName + ID
    public static final String NATURE_ID = "de.cau.cs.kieler.prom.KiCoNature";
    
    private IProject project;
    
    /**
     * Add the KiCoBuilder to the project
     */
    override void configure() throws CoreException {
        // Add builder to project
        val desc = project.getDescription();
        val commands = desc.getBuildSpec();
        // do nothing if builder is already set
        for (var i = 0; i < commands.length; i++) {
            if (commands.get(i).getBuilderName().equals(KiCoBuilder.BUILDER_ID)) {
                return; 
            }
        }
    
        // Create a new build command
        val ICommand[] newCommands = newArrayOfSize(commands.length + 1);
        System.arraycopy(commands, 0, newCommands, 0, commands.length);
        val command = desc.newCommand();
        // Add builder for this nature
        command.setBuilderName(KiCoBuilder.BUILDER_ID); 
        newCommands.set(newCommands.length - 1, command);
        desc.setBuildSpec(newCommands);
        // write to .project file
        project.setDescription(desc, null);
    }
    
    /**
     * Remove the KiCoBuilder from the project
     */
    override void deconfigure() throws CoreException {
        // Remove builder
        val desc = project.getDescription();
        val commands = desc.getBuildSpec();
        // Remove KiCo builder
        val newCommands = commands.filter[!it.builderName.equals(KiCoBuilder.BUILDER_ID)];
        // Set commands
        desc.setBuildSpec(newCommands);
        // write to .project file
        project.setDescription(desc, null);
    }
    
    /**
     * Returns the project
     * @return the project
     */
    override IProject getProject() {
        return project;
    }

    /**
     * Sets the project
     * @return the project
     */
    override void setProject(IProject project) {
        this.project = project;
    }
}