/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.prom

import com.google.common.base.Charsets
import com.google.common.io.Files
import de.cau.cs.kieler.esterel.esterel.impl.ProgramImpl
import de.cau.cs.kieler.prom.launchconfig.IWrapperCodeAnnotationAnalyzer
import java.io.File
import java.util.List
import java.util.regex.Pattern
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.prom.common.WrapperCodeAnnotationData

/** 
 * An analyzer for wrapper code annotations in Esterel files.
 * @author aas
 */
class EsterelWrapperCodeAnnotationAnalyzer implements IWrapperCodeAnnotationAnalyzer {
    
    override getAnnotations(EObject model) {
        // At the moment there are no annotations for inputs/outputs in the esterel grammar.
        // So instead we parse the text file manually and search for special comments.
        return parseModelAndGetWrapperCodeAnnotations(model)
        
        // Get annotations on inputs/outputs 
//        if (model instanceof Program) {
//            val modules = model.modules
//            if (!modules.isNullOrEmpty) {
//                val module = modules.get(0)
//                
//                val in = module.interface
//                val decls = in.intSignalDecls
//                if(!decls.isNullOrEmpty) {
//                    for(d : decls) {
//                        val signals = d.signals
//                        if(!signals.isNullOrEmpty) {
//                            for(s : signals) {
//                                System.err.println(s.name)
//                                for(a : s.annotations) {
//                                    System.err.println("\t"+s)
//                                }
//                            }             
//                        }
//                    }
//                }
//            }
//        }
    }
    
    def private List<WrapperCodeAnnotationData> parseModelAndGetWrapperCodeAnnotations(EObject model) {
        // The returned list
        val datas = newArrayList() 
        
        // Get model name
        var modelName = ""
        if (model instanceof ProgramImpl) {
            val modules = model.modules
            if(!modules.isNullOrEmpty)
                modelName = modules.get(0).name
        }
        
        // Load text from model
        val path = model.eResource.URI.path
        val file = new File(path)
        val lines = Files.readLines(file, Charsets.UTF_8)
        val annotations = newArrayList()
        // Iterate over lines and parse
        for(line : lines) {
            val anno = parseLineAndGetWrapperCodeAnnotation(line)
            if(anno != null) {
                anno.modelName = modelName
                annotations += anno
            } else {
                val inputOutput = parseInputOutputDeclaration(line)
                // Finish wrapper code annotation data with information of input / output
                if(inputOutput != null && !annotations.nullOrEmpty) {
                    for(a : annotations) {
                        a.input = inputOutput.isInput
                        a.output = inputOutput.isOutput
                        a.varName = inputOutput.name
                        a.varType = inputOutput.type
                        
                        // Add this annotation to the return list
                        datas += a
                    }
                    
                    // This input / output is done
                    annotations.clear()
                }
            }
        }
        
        return datas
    }
    
    def private WrapperCodeAnnotationData parseLineAndGetWrapperCodeAnnotation(String line) {
        // Find line comment
        val wrapperCommentRegEx = "^\\s*%\\s*Wrapper "
        val p = Pattern.compile(wrapperCommentRegEx);
        val m = p.matcher(line);
        if(m.find) {
            // Rest of the line comment is assumed to be the annotation with parameters
            val token = line.substring(m.end()).trim.split(" ")
            if(!token.isNullOrEmpty) {
                val data = new WrapperCodeAnnotationData()
                data.ignoreNonExistingSnippet = false
                data.name = token.get(0)
                // Annotation has arguments?
                if(token.size > 1) {
                    for(var i = 1; i < token.size; i++) {
                        data.arguments += token.get(i)
                    }
                }
                
                return data
            }
        }
        return null
    }

    def private InputOutputData parseInputOutputDeclaration(String line) {
        val inputoutputRegEx = "^\\s*inputoutput "
        val inputRegEx = "^\\s*input "
        val outputRegEx = "^\\s*output "
        var ioData = parseInputOutputDeclarationHelper(line, inputoutputRegEx, true, true)
        if(ioData == null)
            ioData = parseInputOutputDeclarationHelper(line, inputRegEx, true, false)
        if(ioData == null)
            ioData = parseInputOutputDeclarationHelper(line, outputRegEx, false, true)
            
        return ioData
    }
    
    def private InputOutputData parseInputOutputDeclarationHelper(String line, String regex, boolean isInput, boolean isOutput) {
        val wordPatter = Pattern.compile("\\w+");
        val p = Pattern.compile(regex);
        val m = p.matcher(line);
        if(m.find) {
            val declaration = line.substring(m.end)
            val wordMatcher = wordPatter.matcher(declaration)
            if(wordMatcher.find) {
                val name = declaration.substring(wordMatcher.start, wordMatcher.end)
                return new InputOutputData(isInput, isOutput, name, "")
            } else {
                return null
            }
        }
        return null
    }
    
    private static class InputOutputData {
        @Accessors
        public var boolean isInput = false
        @Accessors
        public var boolean isOutput = false
        @Accessors
        public var String name = ""
        @Accessors
        public var String type = ""
        
        new(boolean isInput, boolean isOutput, String name, String type) {
            this.isInput = isInput
            this.isOutput = isOutput
            this.name = name
            this.type = type
        }
    }
}
