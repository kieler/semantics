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
package de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.xtend.lib.annotations.Accessors
import com.google.common.collect.Multimap
import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.annotations.StringPragma
import com.google.inject.Injector
import java.util.Map
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames
import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import static de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames.*

/**
 * C Code Generator for the Statebased code generation using templates.
 * 
 * @author ssm
 * @kieler.design 2018-12-06 proposed 
 * @kieler.rating 2018-12-06 proposed yellow 
 * 
 */
class StatebasedLeanCCodeGenerator extends ExogenousProcessor<SCCharts, CodeContainer> {
    
    @Inject extension PragmaExtensions
    @Inject protected Injector injector
    
    public static val IProperty<String> SIMULTATION_C_STRUCT_ACCESS = 
       new Property<String>("de.cau.cs.kieler.simulation.c.struct.access", ".iface.")       
    
    protected static val HOSTCODE = PragmaRegistry.register("hostcode", StringPragma, "Allows additional hostcode to be included (e.g. includes).")    

    public static val C_EXTENSION = ".c"
    public static val H_EXTENSION = ".h"
    public static val INCLUDES = "includes"
    
    @Accessors Map<CodeGeneratorNames, String> naming = <CodeGeneratorNames, String> newHashMap
    @Accessors val Multimap<String, String> modifications = HashMultimap.create
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.codegen.statebased.lean"
    }
    
    override getName() {
        "State-based C Code (Lean)"
    }
    
    override process() {
        val template = injector.getInstance(StatebasedLeanCTemplate) as StatebasedLeanCTemplate
        template.create(model.rootStates.head)
        
        val cc = new CodeContainer
        cc.writeToCodeContainer(template, model.rootStates.head.name.hostcodeSafeName, model)
        
        setModel(cc)
    }
    
    protected def void writeToCodeContainer(CodeContainer codeContainer, StatebasedLeanCTemplate template, String codeFilename, SCCharts scc) {
        val hFilename = codeFilename + H_EXTENSION
        val cFilename = codeFilename + C_EXTENSION
        val hFile = new StringBuilder
        val cFile = new StringBuilder

        val headerMacro = ("_" + hFilename.replaceAll("\\.", "_") + "_").toUpperCase

        hFile.append(addHeader)
        hFile.append("#ifndef " + headerMacro + "\n")
        hFile.append("#define " + headerMacro + "\n\n")
        hFile.append(template.header)
        hFile.append("\n#endif")
        
        cFile.append(addHeader)
        cFile.hostcodeAdditions(scc)
        cFile.append("#include \"" + hFilename + "\"\n\n")        
        cFile.append(template.source)

        naming.put(TICK, environment.getProperty(TICK_FUNCTION_NAME))
        naming.put(RESET, environment.getProperty(RESET_FUNCTION_NAME))
        naming.put(LOGIC, environment.getProperty(LOGIC_FUNCTION_NAME))
        naming.put(TICKDATA, environment.getProperty(TICKDATA_STRUCT_NAME))   
        
        codeContainer.addCCode(cFilename, cFile.toString).naming.putAll(naming)       
        codeContainer.addCHeader(hFilename, hFile.toString).naming.putAll(naming)
        
        environment.setProperty(SIMULTATION_C_STRUCT_ACCESS, 
            ".iface.")
    }      
    
    protected def addHeader() {
        return 
            '''
            /*
             * Automatically generated C code by
             * KIELER SCCharts - The Key to Efficient Modeling
             *
             * http://rtsys.informatik.uni-kiel.de/kieler
             
            '''
    }      
    
    protected def void hostcodeAdditions(StringBuilder sb, SCCharts scc) {
        val includes = modifications.get(INCLUDES)
        for (include : includes)  {
            sb.append("#include " + include + "\n")
        }
        
        val hostcodePragmas = scc.getStringPragmas(HOSTCODE)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        if (hostcodePragmas.size > 0 || includes.size > 0) {
            sb.append("\n")
        }
    }      
    
    static def hostcodeSafeName(String string) {
        if (string === null) return ""
        string.replaceAll("[\\s-]","_")
    }    
    
}
