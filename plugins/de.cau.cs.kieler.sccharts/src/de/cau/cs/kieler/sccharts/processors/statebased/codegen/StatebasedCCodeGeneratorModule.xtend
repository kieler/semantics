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
package de.cau.cs.kieler.sccharts.processors.statebased.codegen

import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import com.google.inject.Injector
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import static de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames.*
import de.cau.cs.kieler.annotations.Nameable

/**
 * Root C Code Generator Module
 * 
 * Initializes necessary modules and invokes them in correct order.
 * 
 * @author ssm
 * @kieler.design 2018-04-16 proposed 
 * @kieler.rating 2018-04-16 proposed yellow 
 * 
 */
class StatebasedCCodeGeneratorModule extends SCChartsCodeGeneratorModule {
    
    @Inject extension PragmaExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension StatebasedCCodeSerializeHRExtensions
    
    @Inject Injector injector
    
    public static val IProperty<String> SIMULTATION_C_STRUCT_ACCESS = 
       new Property<String>("de.cau.cs.kieler.simulation.c.struct.access", ".iface.")    
    
    protected static val HOSTCODE = PragmaRegistry.register("hostcode", StringPragma, "Allows additional hostcode to be included (e.g. includes).") 
    
    public static val C_EXTENSION = ".c"
    public static val H_EXTENSION = ".h"
    
    @Accessors var SCChartsCodeGeneratorModule struct
    @Accessors var SCChartsCodeGeneratorModule reset 
    @Accessors var SCChartsCodeGeneratorModule tick
    @Accessors var SCChartsCodeGeneratorModule logic
    
    override configure() {
        commentsEnabled = processorInstance.environment.getProperty(AbstractCodeGenerator.COMMENTS_ENABLED)
        
        struct = injector.getInstance(StatebasedCCodeGeneratorStructModule)
        reset = injector.getInstance(StatebasedCCodeGeneratorResetModule)
        tick = injector.getInstance(StatebasedCCodeGeneratorTickModule)
        logic = injector.getInstance(StatebasedCCodeGeneratorLogicModule)
            
        struct.configure(baseName, SCCharts, rootState, processorInstance, codeGeneratorModuleMap, 
            codeFilename + H_EXTENSION, this, TICKDATA_STRUCT_NAME)
        reset.configure(baseName, SCCharts, rootState, processorInstance, codeGeneratorModuleMap, 
            codeFilename + C_EXTENSION, this, RESET_FUNCTION_NAME)
        tick.configure(baseName, SCCharts, rootState, processorInstance, codeGeneratorModuleMap, 
            codeFilename + C_EXTENSION, this, TICK_FUNCTION_NAME)
        logic.configure(baseName, SCCharts, rootState, processorInstance, codeGeneratorModuleMap, 
            codeFilename + C_EXTENSION, this, LOGIC_FUNCTION_NAME)
    }
    
    override generateInit() {
        struct.printDebug = printDebug
        reset.printDebug = printDebug
        tick.printDebug = printDebug
        logic.printDebug = printDebug
        struct.leanMode = leanMode
        reset.leanMode = leanMode
        tick.leanMode = leanMode
        logic.leanMode = leanMode
        
        struct.generateInit
        reset.generateInit
        logic.generateInit
        tick.generateInit
    }
    
    override generate() {
        struct.generate
        logic.generate
        reset.generate
        tick.generate
    }
    
    
    override generateDone() {
        struct.generateDone
        logic.generateDone
        reset.generateDone
        tick.generateDone
        
        populateAnnotationModel
    }
    
    /**
     * In C, the generator write creates two files, a header and a c file.
     */
    override generateWrite(CodeContainer codeContainer) {
        val hFilename = codeFilename + H_EXTENSION
        val cFilename = codeFilename + C_EXTENSION
        val hFile = new StringBuilder
        val cFile = new StringBuilder

        val headerMacro = ("_" + hFilename.replaceAll("\\.", "_") + "_").toUpperCase

        hFile.addHeader
        hFile.append("#ifndef " + headerMacro + "\n")
        hFile.append("#define " + headerMacro + "\n\n")
        hFile.append(struct.code)
        hFile.append("\n#endif")
        
        cFile.addHeader
        cFile.hostcodeAdditions
        cFile.append("#include \"" + hFilename + "\"\n\n")        
        cFile.append(reset.code).append("\n")
        cFile.append(logic.code).append("\n")
        cFile.append(tick.code)

        naming.put(TICK, tick.getName)
        naming.put(RESET, reset.getName)
        naming.put(LOGIC, logic.getName)
        naming.put(TICKDATA, struct.getName)
        
        codeContainer.addCCode(cFilename, cFile.toString) => [
            naming.putAll(naming)
            modelName = if (moduleObject instanceof Nameable) moduleObject.name else "_default"   
        ]       
        codeContainer.addCHeader(hFilename, hFile.toString) => [
            naming.putAll(naming)
            modelName = if (moduleObject instanceof Nameable) moduleObject.name else "_default"
        ]
        
        processorInstance.environment.setProperty(SIMULTATION_C_STRUCT_ACCESS, 
            "." + (struct as StatebasedCCodeGeneratorStructModule).getRegionIfaceName + ".")
    }    
    
    /**
     * Adds the information header.
     */
    protected def void addHeader(StringBuilder sb) {
        sb.append(
            "/*\n" + " * Automatically generated C code by\n" + " * KIELER SCCharts - The Key to Efficient Modeling\n" +
                " *\n" + " * http://rtsys.informatik.uni-kiel.de/kieler\n" + " */\n\n")
    }  
    
    /**
     * Adds hostcode additions. These can come from internal sources like the serialization, 
     * but also from the model via hostcode pragmas.
     */
    protected def void hostcodeAdditions(StringBuilder sb) {
        val includes = modifications.get(StatebasedCCodeSerializeHRExtensions.INCLUDES)
        for (include : includes)  {
            sb.append("#include " + include + "\n")
        }
        
        val hostcodePragmas = SCCharts.getStringPragmas(HOSTCODE)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || includes.size > 0) {
            sb.append("\n")
        }
    }  
 
 
    protected def populateAnnotationModel() {
        val annotationModel = (processorInstance as StatebasedCCodeGenerator).annotationModel
        val annotationModelStates = (processorInstance as StatebasedCCodeGenerator).annotationModel
        val annotationModelStatesAndRegions = (processorInstance as StatebasedCCodeGenerator).annotationModel
        
        for (object : (logic as StatebasedCCodeGeneratorLogicModule).objectFunctionMap.keySet) {
            val sb = (logic as StatebasedCCodeGeneratorLogicModule).objectFunctionMap.get(object)
            val code = sb.toString.trim
//            annotationModel.addInfo(object, code)
            
            if (object instanceof State) {
                if (!object.isSuperstate) {
//                    annotationModelStates.addInfo(object, code)
                    annotationModelStatesAndRegions.addInfo(object, code)
                }
            } else if (object instanceof Region) {
                annotationModelStatesAndRegions.addInfo(object, code)
            }
        }        
    }
    
    
    
}