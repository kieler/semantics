package de.cau.cs.kieler.prom.common

import java.util.List
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures

class KiCoLaunchData extends ConfigurationSerializable {
    
    /**
     * Key for the attribute that holds a launch data object.
     */
    private static val LAUNCH_DATA_IDENTIFIER_ATTR = "launchdata"
    
    /**
     * The features of the KIELER Compiler that produces finished code.
     * The field is used to cache the features.
     */
    private static val codeGenerationFeatures = KielerCompiler.getFeature(CodeGenerationFeatures.TARGET_ID)
    
    /**
     * The name of the project that should be launched
     */
    @Accessors
    protected String projectName = ""
    /**
     * A project relative path to the main file.
     */
    @Accessors
    protected String mainFile = ""
    
    /**
     * The files that should be compiled via KiCo
     */
    @Accessors
    protected List<FileCompilationData> files = newArrayList()
    
    /**
     * The target language for KiCo compilation.
     * This is the id of a KiCo transformation feature.
     */
    @Accessors(PRIVATE_SETTER, PUBLIC_GETTER)
    protected String targetLanguage = ""
    /**
     * Flag that is infered from the target language and determines
     * if the target is a single transformation for code generation (e.g. "s.java")
     * or a complex compile chain (e.g. "*T_ABORTWTO, T_EXIT").
     */
     @Accessors(PRIVATE_SETTER, PUBLIC_GETTER)
    private boolean isCompileChain = false
    /**
     * The file extension for the specified target language (e.g. '.java' for Java Code) 
     */
    @Accessors
    protected String targetLanguageFileExtension = ""
    /**
     * A path to a file used as template for the KiCo compilation result.
     */
    @Accessors
    protected String targetTemplate = ""
    /**
     * A path to a directory.
     * Compiled output will be saved to this path.
     * If the path is empty, compilation results are saved to the directory of their input files.
     */
    @Accessors
    protected String targetDirectory = ""
    
    /**
     * A path to a file that is used as template for wrapper code generation.
     */
    @Accessors
    protected String wrapperCodeTemplate = ""
    /**
     * A path to a directory containing snippet definitions to use in wrapper code generation from annotations.
     */
    @Accessors
    protected String wrapperCodeSnippetDirectory = ""

    /**
     * List with commands which should be executed after the compilation and wrapper code generation
     * of a launch ended successfully.
     */
    @Accessors
    protected List<CommandData> commands = newArrayList()
    /**
     * The class name of an implementation of the associated launch shortcut for this environment.
     */
    @Accessors
    protected String associatedLaunchShortcut = ""
    
    /**
     * {inheritDoc}
     */
    override getIdentifier() {
        return KiCoLaunchData.LAUNCH_DATA_IDENTIFIER_ATTR
    }
    
    /**
     * {inheritDoc}
     */
    override setIdentifier(String value) {
        // The identifier is constant for this data class.
    }
    
    /**
     * Setter for the compilation target.
     */
    public def void setTargetLanguage(String value) {
        targetLanguage = value;
        updateIsCompileChain()
    }
    
    /**
     * Checkes if the compilation target is a single transformation or complex compile chain. 
     */
    private def void updateIsCompileChain() {
        isCompileChain = false
        if (codeGenerationFeatures != null) {
            val transformations = codeGenerationFeatures.expandingTransformations
            // There is no transformation with the given id
            // => the target is a compile chain and not a transformation.
            isCompileChain = transformations.filter[it.id == targetLanguage].isEmpty
        }
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