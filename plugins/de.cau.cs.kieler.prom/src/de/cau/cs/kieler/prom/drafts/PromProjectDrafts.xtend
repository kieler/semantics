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

import de.cau.cs.kieler.prom.PromPlugin
import java.util.ArrayList
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer
import org.eclipse.jface.preference.IPreferenceStore

/**
 * This class handles initialization of default project drafts.
 * 
 * @author aas
 */
class PromProjectDrafts extends AbstractPreferenceInitializer implements IProjectDraftInitializer{

    /**
     * The extension point id of the initializers. 
     */
    private static val INITIALIZER_EXTENSION_POINT_ID = "de.cau.cs.kieler.prom.projectDraftInitializer"

    /**
     * Fills the preference store with default project drafts if there are none.
     * The method is called by eclipse
     * when the preferences page is opened for the first time this run.
     */
    override void initializeDefaultPreferences() {
        initializeDefaults()
    }

    /**
     * Fills the preference store with default project drafts.
     * Any other drafts in the store will be lost. 
     */
    public static def void initializeDefaults(){
        if(ProjectDraftData.isPreferenceStoreEmpty(store)){
            ProjectDraftData.saveAllToPreferenceStore(store, getAllDefaults())
        }
    }

    /**
     * Fetches all default project drafts from all registered initializers.
     */
    public static def getAllDefaults(){
        val datas = new ArrayList<ProjectDraftData>()
        
        // Get instances defined from extensions.
        val config = Platform.getExtensionRegistry().getConfigurationElementsFor(INITIALIZER_EXTENSION_POINT_ID);
        try {
            for (IConfigurationElement e : config) {
            val o = e.createExecutableExtension("class");
                if (o instanceof IProjectDraftInitializer) {
                    datas += o.getProjectDrafts()
                }
            }
        } catch (CoreException ex) {
            System.err.println(ex.getMessage());
        }
        
        return datas
    }

    /**
     * @{inheritDoc}
     */
    override getProjectDrafts(){
        val datas = new ArrayList<ProjectDraftData>()
        // Generic
        datas += getGeneric()
        // Generic Java
        datas += getGenericJava()
        // Generic C
        datas += getGenericC()
        
        // Mindstorms NXT
        datas += getMindstormsNXT
        // Mindstorms EV3
        datas += getMindstormsEV3
        // Arduino
        datas += getArduinoCDT
        datas += getArduinoGeneric
        
        return datas
    }
    
    /**
     * Creates a project draft for general projects.
     * @return the created project draft
     */
    public static def ProjectDraftData getGeneric() {
        var env = new ProjectDraftData("Generic")
        env.addInitialResource("assets/CSimulation.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/c/CSimulation.ftl")
        env.addInitialResource("assets/CSimulationSnippets.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/c/CSimulationSnippets.ftl")
        env.addInitialResource("assets/BuildConfig.kibuild", "platform:/plugin/de.cau.cs.kieler.prom/resources/c/c-backend.kibuild")
        
        env.modelFile = "${project_name}"
        env.associatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
        return env
    }
    
    /**
     * Creates a project draft for Java projects.
     * @return the created project draft
     */
    public static def ProjectDraftData getGenericJava() {
        var env = new ProjectDraftData("Generic Java")
        env.addInitialResource("assets/OutputTemplate.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/java/OutputTemplate.ftl")
        env.addInitialResource("assets/JavaSimulation.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/java/JavaSimulation.ftl") 
        env.addInitialResource("assets/JavaSimulationSnippets.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/java/JavaSimulationSnippets.ftl")
        env.addInitialResource("assets/BuildConfig.kibuild", "platform:/plugin/de.cau.cs.kieler.prom/resources/java/java-backend.kibuild") 

        env.modelFile = "src/model/${project_name}"
        env.associatedProjectWizardClass = "org.eclipse.jdt.internal.ui.wizards.JavaProjectWizard"
        return env
    }
    
    /**
     * Creates a project draft for CDT projects.
     * @return the created project draft
     */
    public static def ProjectDraftData getGenericC() {
        val env = getGeneric
        env.name = "Generic C"
        env.associatedProjectWizardClass = "org.eclipse.cdt.ui.wizards.CProjectWizard"
        return env
    }
    
    /**
     * Creates a project draft for Mindstorms NXT running leJOS.
     * @return the default project draft for Mindstorms NXT running leJOS.
     */
    public static def ProjectDraftData getMindstormsNXT(){
        val env = getGenericJava
        env.addInitialResource("assets/BuildConfig.kibuild", "platform:/plugin/de.cau.cs.kieler.prom/resources/mindstorms_nxt/BuildConfig.kibuild") 
        env.addInitialResource("assets/CompilationConfig.kico", "platform:/plugin/de.cau.cs.kieler.prom/resources/mindstorms_nxt/CompilationConfig.kico")
        env.addInitialResource("assets/CompilationConfigPrio.kico", "platform:/plugin/de.cau.cs.kieler.prom/resources/mindstorms_nxt/CompilationConfigPrio.kico")
        env.addInitialResource("src/model/${project_name}Main.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/mindstorms_nxt/Main.ftl")
        env.addInitialResource("assets/snippets", "platform:/plugin/de.cau.cs.kieler.prom/resources/mindstorms_nxt/snippets")
        env.addInitialResource("assets/snippets/core.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/core/core.ftl")
        
        env.name ="Mindstorms NXT"
        env.associatedProjectWizardClass = "org.lejos.nxt.ldt.wizard.NewNXTProject"
        return env
    }
    
    /**
     * Creates a project draft for Mindstorms EV3 running leJOS.
     * @return the default project draft for Mindstorms EV3 running leJOS.
     */
    public static def ProjectDraftData getMindstormsEV3(){
        val env = getMindstormsNXT
        env.addInitialResource("src/model/${project_name}Main.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/mindstorms_ev3/Main.ftl")
        env.addInitialResource("assets/snippets/ev3", "platform:/plugin/de.cau.cs.kieler.prom/resources/mindstorms_ev3/snippets")
        
        env.name ="Mindstorms EV3"
        env.associatedProjectWizardClass = "org.lejos.ev3.ldt.wizard.NewEV3Project"
        return env
    }
    
    /**
     * Creates a project draft for Arduino development.
     * @return the default project draft for Arduino development.
     */
    public static def ProjectDraftData getArduinoGeneric(){
        val env = getGeneric
        env.addInitialResource("assets/BuildConfig.kibuild", "platform:/plugin/de.cau.cs.kieler.prom/resources/arduino/ArduinoGenericBuildConfig.kibuild")
        env.addInitialResource("assets/main.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/arduino/main_include.ftl")
        env.addInitialResource("assets/snippets", "platform:/plugin/de.cau.cs.kieler.prom/resources/arduino/snippets")
        
        env.name = "Arduino (Generic)"
        env.modelFile = "${project_name}Model"
        env.associatedProjectWizardClass = "org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard"
        return env
    }
    
    /**
     * Creates a project draft for Arduino development.
     * @return the default project draft for Arduino development.
     */
    public static def ProjectDraftData getArduinoCDT(){
        val env = getArduinoGeneric
        env.addInitialResource("assets/BuildConfig.kibuild", "platform:/plugin/de.cau.cs.kieler.prom/resources/arduino/ArduinoC++BuildConfig.kibuild")
        env.addInitialResource("assets/main.ftl", "platform:/plugin/de.cau.cs.kieler.prom/resources/arduino/main.ftl")
        env.addInitialResource("assets/snippets", "platform:/plugin/de.cau.cs.kieler.prom/resources/arduino/snippets")
        
        env.name = "Arduino (CDT)"
        env.modelFile = "${project_name}Model"
        env.associatedProjectWizardClass = "org.eclipse.cdt.arduino.ui.internal.project.NewArduinoProjectWizard"
        return env
    }
    
    /**
     * Returns the preference store of the Prom plugin
     */
    private static def IPreferenceStore getStore(){
        return PromPlugin.preferenceStore
    }
    
}
