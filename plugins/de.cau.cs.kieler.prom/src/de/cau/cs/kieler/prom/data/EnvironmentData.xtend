/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.data

import com.google.common.io.Files
import de.cau.cs.kieler.prom.PromPlugin
import java.util.List
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.Status
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Data container for default settings to use in creation of new projects.
 * 
 * @author aas
 *
 */
class EnvironmentData extends ConfigurationSerializable {
    // Attribute names for the preference store.
    /**
     * Key for the attribute which holds a comma separated string of environment names.
     */
    private static val ENVIRONMENT_IDENTIFIERS_ATTR = "environments"
    
    // Fields
    /**
     * The unique name of the environment.
     * It is used to unambiguously store this environment's data. 
     */
    @Accessors
    protected String name = ""
    
    /**
     * The class name of an implementation of the associated project wizard.
     */
    @Accessors
    protected String associatedProjectWizardClass = ""
    
    /**
     * The project relative path to the initial model file. 
     */
    @Accessors
    protected String modelFile = ""

    /**
     * The files and folders that should be created at project setup.
     */
    @Accessors
    protected List<FileData> initialResources = newArrayList()
    
    /**
     * Creates a new instance of the class.
     */
    new() {
    }
    
    /**
     * Creates a new instance of the class with the given name.
     * 
     * @param name The initial name
     */
    new(String name) {
        this()
        this.name = name
    }
    
    /**
     * {@inheritDoc}
     */    
    override getIdentifier() {
        return name
    }
    
    /**
     * {@inheritDoc}
     */    
    override setIdentifier(String value) {
        name = value
    }
    
    /**
     * @return true if the preference store does not contain any environment definitions.<br />
     *         false otherwise.
     */
    public static def boolean isPreferenceStoreEmpty(IPreferenceStore store){
        return store.getString(EnvironmentData.ENVIRONMENT_IDENTIFIERS_ATTR) == ""
    }
    
    /**
     * Saves the environments to the preference store.
     * They can be retrieved by using loadAllFromPreferenceStore(...)
     */
    public static def void saveAllToPreferenceStore(IPreferenceStore store, List<EnvironmentData> environments){
        ConfigurationSerializable.saveAllToPreferenceStore(store, EnvironmentData.ENVIRONMENT_IDENTIFIERS_ATTR, environments)
    }
    
    /**
     * Loads all environments from the preference store
     * which have been saved using saveAllToPreferenceStore(...).
     * @return list with the environments from the preference store.
     */
    public static def List<EnvironmentData> loadAllFromPreferenceStore(IPreferenceStore store){
        return ConfigurationSerializable.loadAllFromPreferenceStore(store, EnvironmentData.ENVIRONMENT_IDENTIFIERS_ATTR, EnvironmentData)
                as List<EnvironmentData>
    }
    
    /**
     * Creates an environment with the name and loads its settings from the preference store.
     * @return the created environment.
     */
    public static def EnvironmentData loadInstanceFromPreferenceStore(IPreferenceStore store, String environmentName) {
        if(store == null) {
            return null
        } else {
            var env = new EnvironmentData(environmentName)
            env.loadFromPreferenceStore(store)
            return env
        }
    }
    
    /**
     * Creates this instance's initial resources in the given project.
     * 
     * @param project The project
     */
    public def void createInitialResources(IProject project) {
        for(data : initialResources) {
            var resolvedProjectRelativePath = data.projectRelativePath
            try {
                if(!data.projectRelativePath.trim.isNullOrEmpty) {
                    resolvedProjectRelativePath = PromPlugin.performStringSubstitution(data.projectRelativePath.trim, project)
                    
                    val path = new Path(resolvedProjectRelativePath)
                    val isFile = (path.fileExtension != null)
                    
                    if(isFile) {
                        // Setup placeholders
                        // Load path of model file
                        val modelFilePathWithoutExtension = new Path(modelFile).removeFileExtension
                        val modelFileNameWithoutExtension = modelFilePathWithoutExtension.lastSegment
                        val placeholderReplacements = #{"${project_name}" -> project.name,
                                                        "${model_name}" -> modelFileNameWithoutExtension}
                        // Create file
                        PromPlugin.initializeFile(project, resolvedProjectRelativePath,
                                                  data.origin, placeholderReplacements)
                        
                        // Remember kibuild file in project preferences
                        if(Files.getFileExtension(resolvedProjectRelativePath) == "kibuild") {
                            project.setPersistentProperty(PromPlugin.BUILD_CONFIGURATION_QUALIFIER, resolvedProjectRelativePath)
                        }
                    } else {
                        // Create folder
                        PromPlugin.initializeFolder(project, resolvedProjectRelativePath, data.origin)
                    }
                }    
            } catch (Exception e) {
                throw new Exception("Could not initialize '" + resolvedProjectRelativePath +"'\n" 
                                  + "with '" + data.origin + "'.\n"
                                  + "Please make sure that all paths are valid.", e)
            }
        }
    }
}