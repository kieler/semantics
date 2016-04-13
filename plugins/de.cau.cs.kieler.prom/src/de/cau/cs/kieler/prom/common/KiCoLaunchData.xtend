package de.cau.cs.kieler.prom.common

import java.util.List
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.xtend.lib.annotations.Accessors

class KiCoLaunchData extends ConfigurationSerializableData {
    
    /**
     * Key for the attribute that holds a launch data object.
     */
    private static val LAUNCH_DATA_IDENTIFIER_ATTR = "launchdata"
    
    @Accessors
    protected String projectName
    @Accessors
    protected String mainFile
    
    @Accessors
    protected List<FileCompilationData> files
    
    @Accessors
    protected String targetLanguage
    @Accessors
    protected String targetLanguageFileExtension
    @Accessors
    protected String targetTemplate
    @Accessors
    protected String targetDirectory
    
    @Accessors
    protected String wrapperCodeTemplate
    @Accessors
    protected String wrapperCodeSnippetDirectory
    @Accessors
    protected String wrapperCodeGenerator

    @Accessors
    protected List<CommandData> commands
    @Accessors
    protected String associatedLaunchShortcut
    
    override getIdentifier() {
        return KiCoLaunchData.LAUNCH_DATA_IDENTIFIER_ATTR
    }
    
    override setIdentifier(String value) {
        // The identifier is constant for this data class.
    }
    
    /**
     * Creates a data object and loads its state from the given launch configuration.
     * 
     * @param configuration The launch configuration where the data object should be loaded from
     * @return the loaded data object.
     */
    public static def KiCoLaunchData loadFromConfiguration(ILaunchConfiguration configuration) {
        val data = new KiCoLaunchData()
        data.loadAttributesFromConfiguration(configuration)
        return data
    }

    /**
     * Load the data object from the given launch configuration.
     * 
     * @param configuration The launch configuration where the data object should be loaded from
     * @return the loaded data object.
     */
    public def void loadAttributesFromConfiguration(ILaunchConfiguration configuration) {
        // Load attribute map
        val attributeMap = configuration.getAttribute(KiCoLaunchData.LAUNCH_DATA_IDENTIFIER_ATTR, newHashMap());
        loadAttributesFromMap(attributeMap)
        // Load commands
        commands = CommandData.loadAllFromConfiguration(configuration)
        // Load files
        files = FileCompilationData.loadAllFromConfiguration(configuration)
    }

    /**
     * Saves the data object to the given launch configuration.
     * Previous data of this class in the launch config is overwritten.
     * 
     * @param configuration The launch configuration where the data object should be saved
     * @param data The data object that should be saved
     */
    public static def saveToConfiguration(ILaunchConfigurationWorkingCopy configuration, KiCoLaunchData data) {
        // Save attribute map
        configuration.setAttribute(KiCoLaunchData.LAUNCH_DATA_IDENTIFIER_ATTR, data.attributeMap)
        // Save commands
        CommandData.saveAllToConfiguration(configuration, data.commands)
        // Save files
        FileCompilationData.saveAllToConfiguration(configuration, data.files)
    }
}