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
package de.cau.cs.kieler.prom.templates

import com.google.common.base.Strings
import de.cau.cs.kieler.prom.ExtensionLookupUtil
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.data.MacroCallData
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.preferences.InstanceScope
import org.eclipse.emf.ecore.EObject
import org.osgi.service.prefs.Preferences

/**
 * @author aas
 */
abstract class ModelAnalyzer {
    /**
     * The attribute to store this analyzer's frontend in the preferences.
     */
    private static val SIMULATION_FRONTENT_ATTR = "frontend"
    
    /**
     * List with all model analyzers loaded from extensions.
     */
    private static var List<ModelAnalyzer> analyzers
    
    /**
     * The id of the extension point for wrapper code annotation analyzers.
     */
    private static val MODEL_ANALYZER_EXTENSION_POINT_ID = "de.cau.cs.kieler.prom.modelAnalyzer"
    
    /**
     * Searches for annotations or similar semantical entities which describe that wrapper code should be injected
     * and returns a list with corresponding wrapper code annotation data.
     * 
     * @param model The model to fetch wrapper code annotations from 
     */
    public def List<MacroCallData> getAnnotationInterface(EObject model)
    
    /**
     * Searches for variables (inputs / outputs) in the model that can be used in the simulation. 
     * 
     * @param model The model
     */
    public def List<MacroCallData> getSimulationInterface(EObject model)
    
    /**
     * Returns the name of the model.
     * 
     * @param model The model
     */
    public def String getModelName(EObject model)
    
    /**
     * Returns the file extensions of the models that are handled by this analyzer.
     * 
     * @return the file extensions of the models that are handled by this analyzer
     */
    public def List<String> getSupportedFileExtensions()
    
    /**
     * Returns the types of the models that are handled by this analyzer.
     * 
     * @return the types of the models that are handled by this analyzer
     */
    public def List<Class<?>> getSupportedModelTypes()
    
    /**
     * Returns the default simulation frontend for the supported models.
     * 
     * @return the default simulation frontend for the supported models
     */
    protected def String getDefaultSimulationFrontend()
    
    /**
     * Checks whether the models within the given files can be analyzed by this instance.
     */
    public def isSupported(IFile file) {
        return file != null && isSupported(file.fileExtension)
    }
    
    /**
     * Checks whether the models with the given file extension can be analyzed by this instance.
     */
    public def isSupported(String fileExtension) {
        if(fileExtension == null) {
            return false
        }
        return supportedFileExtensions.contains(fileExtension.toLowerCase)
    }
    
    /**
     * Checks whether the model can be analyzed by this instance.
     */
    public def isSupported(EObject model) {
        if(model == null) {
            return false
        }
        for(supportedModelType : supportedModelTypes) {
            if(supportedModelType.isAssignableFrom(model.class)) {
                return true
            }
        }
        return false
    }
    
    /**
     * Returns the simulation frontend for the supported models from the preferences.
     * 
     * @return the simulation frontend for the supported models
     */
    public def String getSimulationFrontend() {
        val prefs = getPreferences
        return prefs.get(getPreferenceStoreKey(SIMULATION_FRONTENT_ATTR), Strings.nullToEmpty(defaultSimulationFrontend))
    }
    
    /**
     * Sets the simulation frontend.
     */
    public def void setSimulationFrontend(String value) {
        val prefs = getPreferences
        prefs.put(getPreferenceStoreKey(SIMULATION_FRONTENT_ATTR), value)
    }
    
    /**
     * Returns the preferences in which the attributes for model analyzers (such as the simulation frontend) are saved.
     */
    private static def Preferences getPreferences() {
        return InstanceScope.INSTANCE.getNode(PromPlugin.PLUGIN_ID)
    }
    
    /**
     * Returns the key for this analyzer to access the given attribute in the preferences.
     */
    private def String getPreferenceStoreKey(String attributeName) {
        return "modelAnalyzer."+getSupportedFileExtensions.get(0)+"."+attributeName
    }
    
    /**
     * Returns all registered model analyzers.
     */
    public static def List<ModelAnalyzer> getAnalyzers() {
        // Initialize if not done yet
        if(analyzers == null) { 
            initAnalyzers
        }
        return analyzers
    }
    
    /**
     * Instantiate the analyzers from all registered extensions.
     */
    private static def void initAnalyzers() {
        analyzers = newArrayList
        val config = ExtensionLookupUtil.getConfigurationElements(MODEL_ANALYZER_EXTENSION_POINT_ID)
        try {
            for (IConfigurationElement e : config) {
                val o = e.createExecutableExtension("class");
                if (o instanceof ModelAnalyzer) {
                    analyzers.add(o)
                }
            }
        } catch (CoreException ex) {
            System.err.println(ex.getMessage());
        }
    }
}