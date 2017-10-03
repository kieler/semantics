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
package de.cau.cs.kieler.prom.drafts

import com.google.common.io.Files
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.data.ConfigurationSerializable
import de.cau.cs.kieler.prom.data.FileData
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.Path
import org.eclipse.jface.preference.IPreferenceStore

/**
 * Data container for default settings to use in creation of new projects.
 * 
 * @author aas
 *
 */
class ProjectDraftData extends ConfigurationSerializable {
    /**
     * Key for the attribute which holds a comma separated string of project draft names.
     */
    private static val PROJECT_DRAFT_IDENTIFIERS_ATTR = "drafts"
    
    /**
     * The unique name of the project draft.
     * It is used to unambiguously store its data. 
     */
    public String name = ""
    
    /**
     * The class name of an implementation of the associated project wizard.
     */
    public String associatedProjectWizardClass = ""
    
    /**
     * The project relative path to the initial model file. 
     */
    public String modelFile = ""

    /**
     * The files and folders that should be created at project setup.
     */
    public List<FileData> initialResources = newArrayList()
    
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
     * Adds an initial resource for the project.
     * If there is already an inital resource with the given project relative path, it is updated.
     */
    public def void addInitialResource(String projectRelativePath, String origin) {
        addInitialResource(new FileData(projectRelativePath, origin))
    }
    
    /**
     * Adds an initial resource for the project.
     * Possible duplicates of this resource are removed.
     */
    public def void addInitialResource(FileData data) {
        if(!initialResources.isNullOrEmpty) {
            val duplicates = initialResources.filter[it.projectRelativePath == data.projectRelativePath]
            if(!duplicates.isNullOrEmpty) {
                initialResources.removeAll(duplicates)
            }
        }
        initialResources.add(data)
    }
    
    /**
     * Adds initial resources for the project.
     * Possible duplicates of the resources are removed.
     */
    public def void addInitialResources(FileData... datas) {
        for(d : datas) {
            addInitialResource(d)
        }
    }
    
    /**
     * @return true if the preference store does not contain any project draft definitions.<br />
     *         false otherwise.
     */
    public static def boolean isPreferenceStoreEmpty(IPreferenceStore store){
        return store.getString(ProjectDraftData.PROJECT_DRAFT_IDENTIFIERS_ATTR) == ""
    }
    
    /**
     * Saves the project drafts to the preference store.
     * They can be retrieved by using loadAllFromPreferenceStore(...)
     */
    public static def void saveAllToPreferenceStore(IPreferenceStore store, List<ProjectDraftData> drafts){
        ConfigurationSerializable.saveAllToPreferenceStore(store, ProjectDraftData.PROJECT_DRAFT_IDENTIFIERS_ATTR, drafts)
    }
    
    /**
     * Loads all project drafts from the preference store
     * which have been saved using saveAllToPreferenceStore(...).
     * @return list with the project drafts from the preference store.
     */
    public static def List<ProjectDraftData> loadAllFromPreferenceStore(IPreferenceStore store){
        return ConfigurationSerializable.loadAllFromPreferenceStore(store, ProjectDraftData.PROJECT_DRAFT_IDENTIFIERS_ATTR, ProjectDraftData)
                as List<ProjectDraftData>
    }
    
    /**
     * Creates an project draft with the name and loads its settings from the preference store.
     * @return the created project draft.
     */
    public static def ProjectDraftData loadInstanceFromPreferenceStore(IPreferenceStore store, String name) {
        if(store == null) {
            return null
        } else {
            var env = new ProjectDraftData(name)
            env.loadFromPreferenceStore(store)
            return env
        }
    }
    
    /**
     * Creates this instance's initial resources in the given project.
     * 
     * @param project The project
     */
    public def void createInitialResources(IProject project, Map<String, String> additionalReplacements) {
        for(data : initialResources) {
            var resolvedProjectRelativePath = data.projectRelativePath
            try {
                if(!data.projectRelativePath.trim.isNullOrEmpty) {
                    resolvedProjectRelativePath = PromPlugin.performStringSubstitution(data.projectRelativePath.trim, project)
                    
                    val path = new Path(resolvedProjectRelativePath)
                    val isFile = (path.fileExtension != null)
                    
                    if(isFile) {
                        // Setup placeholder replacements
                        val modelFilePathWithoutExtension = new Path(modelFile).removeFileExtension
                        val modelFileNameWithoutExtension = modelFilePathWithoutExtension.lastSegment
                        
                        val placeholderReplacements = newHashMap
                        placeholderReplacements.put("project_name", project.name)
                        placeholderReplacements.put("model_name", modelFileNameWithoutExtension)
                        if(additionalReplacements != null) {
                            placeholderReplacements.putAll(additionalReplacements)
                        }
                        
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