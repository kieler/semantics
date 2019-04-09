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
package de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.java

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.StringPragma
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.annotations.registry.PragmaRegistry
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kicool.compilation.codegen.AbstractCodeGenerator.*
import static de.cau.cs.kieler.kicool.compilation.codegen.CodeGeneratorNames.*

import static extension de.cau.cs.kieler.sccharts.processors.statebased.lean.codegen.AbstractStatebasedLeanTemplate.hostcodeSafeName

/**
 * Java Code Generator for the Statebased code generation using templates.
 * 
 * @author wechselberg
 */
class StatebasedLeanJavaCodeGenerator extends ExogenousProcessor<SCCharts, CodeContainer> {
    
    @Inject extension PragmaExtensions
    @Inject protected Injector injector
    
    protected static val HOSTCODE = PragmaRegistry.register("hostcode", StringPragma, "Allows additional hostcode to be included (e.g. includes).")    
    protected static val PACKAGE = PragmaRegistry.register("package", StringPragma, "Package name for the generated file(s)")
    protected static val INCLUDE = PragmaRegistry.register("include", StringPragma, "Additional things that should be imported")
    protected static val SUPERCLASS = PragmaRegistry.register("superclass", StringPragma, "Superclass to use for the generated class file.")

    public static val JAVA_EXTENSION = ".java"
    public static val IMPORTS = "imports"
    public static val CONTEXT_SUFFIX = "Context"
    
    @Accessors Map<CodeGeneratorNames, String> naming = <CodeGeneratorNames, String> newHashMap
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.codegen.statebased.lean.java"
    }
    
    override getName() {
        "State-based Java Code (Lean)"
    }
    
    override process() {
        val template = injector.getInstance(StatebasedLeanJavaTemplate) as StatebasedLeanJavaTemplate

        if (model.getStringPragmas(SUPERCLASS).size > 0) {
            template.superClass = model.getStringPragmas(SUPERCLASS).head.values.head
        }
        
        template.create(model.rootStates.head)

        val cc = new CodeContainer
        cc.writeToCodeContainer(template, model.rootStates.head.name.hostcodeSafeName, model)
        
        setModel(cc)
    }
    
    protected def void writeToCodeContainer(CodeContainer codeContainer, StatebasedLeanJavaTemplate template, String codeFilename, SCCharts scc) {
        val javaFilename = codeFilename + JAVA_EXTENSION
        val javaFile = new StringBuilder

        javaFile.packageAdditions(scc)
        javaFile.append(addHeader)
        javaFile.hostcodeAdditions(scc, template)
        javaFile.append(template.source)

        naming.put(TICK, environment.getProperty(TICK_FUNCTION_NAME))
        naming.put(RESET, environment.getProperty(RESET_FUNCTION_NAME))
        naming.put(LOGIC, environment.getProperty(LOGIC_FUNCTION_NAME))
        naming.put(TICKDATA, environment.getProperty(TICKDATA_STRUCT_NAME))   
        
        codeContainer.addJavaCode(javaFilename, javaFile.toString).naming.putAll(naming)
        
        if (template.needsContextInterface) {
          val contextFilename = codeFilename + CONTEXT_SUFFIX + JAVA_EXTENSION
          val contextFile = new StringBuilder
          
          contextFile.packageAdditions(scc)
          contextFile.append(addHeader)
          contextFile.hostcodeAdditions(scc, template)
          contextFile.append(template.context)
          
          codeContainer.addJavaContextInterface(contextFilename, contextFile.toString)
        }
               
    }      
    
    protected def CharSequence addHeader() {
        return '''
          /*
           * Automatically generated Java code by
           * KIELER SCCharts - The Key to Efficient Modeling
           *
           * http://rtsys.informatik.uni-kiel.de/kieler
           */
        '''
    }      
    
    protected def void hostcodeAdditions(StringBuilder sb, SCCharts scc, StatebasedLeanJavaTemplate template) {
        val includes = template.findModifications.get(IMPORTS)
        for (include : includes)  {
            sb.append("import " + include + ";\n")
        }

        val includePragmas = scc.getStringPragmas(INCLUDE)
        for (pragma : includePragmas) {
            sb.append("import ").append(pragma.values.head).append(";\n")
        }        
        
        val hostcodePragmas = scc.getStringPragmas(HOSTCODE)
        for (pragma : hostcodePragmas) {
            sb.append(pragma.values.head + "\n")
        }
        
        if (hostcodePragmas.size > 0 || includes.size > 0 || includePragmas.size > 0) {
            sb.append("\n")
        }
    }

    protected def void packageAdditions(StringBuilder sb, SCCharts scc) {
        val packagePragma = scc.getStringPragmas(PACKAGE)
        if (packagePragma.size > 0) {
            sb.append("package ").append(packagePragma.head.values.head).append(";\n\n")
        }
    }
}
