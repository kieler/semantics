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
package de.cau.cs.kieler.kicool.processors.ast

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.io.File
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.deploy.processor.AbstractSystemCompilerProcessor
import java.io.BufferedReader
import java.io.FileReader
import java.util.LinkedList
import java.util.regex.Pattern
import de.cau.cs.kieler.kicool.processors.ast.KAST.KASTNode
import java.util.regex.Matcher
import de.cau.cs.kieler.kicool.processors.ast.KAST.KASTFieldValue
import de.cau.cs.kieler.kicool.processors.ast.KAST.KASTFieldReference

/**
 * @author ssm
 * @kieler.design 2019-04-23 proposed
 * @kieler.rating 2019-04-23 proposed yellow
 */
class GCCAST2KAST extends AbstractSystemCompilerProcessor<CodeContainer, KAST> {

    public static val IProperty<KAST> KAST = 
        new Property<KAST>("de.cau.cs.kieler.kicool.kast", null)

    override getId() {
        "de.cau.cs.kieler.kicool.kast.gcc"
    }
    
    override getName() {
        "KAST"
    }
    
    override process() {
        // Setup project infrastructure
        val infra = ProjectInfrastructure.getProjectInfrastructure(environment)
        if (infra.generatedCodeFolder === null) {
            return
        } else {
            infra.log(logger)
        }
        
        var lines = infra.readASTFromDebug
        val kAST = new KAST
        lines = lines.normalize
        lines.createKAST(kAST)        
        setModel(kAST)

        logger.saveLog(environment, "kast-report.log")
    }
    
    protected def void createSubKAST(LinkedList<String> lines, KAST kAST) {
        // @11  result_decl  type: @10  scpe: @21  srcp: print.c:2  note: artificial  size: @18  algn: 32
        val p = Pattern.compile("^@(\\d+)\\s+(\\w+)\\s+(.*)$")
        val p2 = Pattern.compile("^(.+?):\\s(.+?)\\s+(.*)$")
        val p3 = Pattern.compile("^@(\\d+)$")
        
        val referenceNodes = <KASTFieldReference> newLinkedList
        var nodeIndex = 0
        var emptyLines = 0
        while (!lines.empty && emptyLines < 2) {
            val line = lines.pop
            
            if (line.empty) {
                emptyLines++   
            } else {
                emptyLines = 0

                val m = p.matcher(line)
                if (m.matches) {
                    
                    nodeIndex++
                    if (Integer.parseInt(m.group(1)) != nodeIndex) {
                        throw new IllegalStateException("The node index and the actual node count mismatch.")
                    }
                    val kASTNode = new KASTNode(nodeIndex, m.group(2))
                    kAST.nodes += kASTNode
                    
                    var rest = m.group(3).trim + " "
                    var Matcher m2
                    while((m2 = p2.matcher(rest)).matches) {
                        val attrName = m2.group(1)
                        val attrValue = m2.group(2)
                        rest = m2.group(3).trim + " "
                        
                        val m3 = p3.matcher(attrValue.trim)
                        if (m3.matches) {
                            val kASTField = new KASTFieldReference(attrName.trim, Integer.parseInt(m3.group(1)), null)
                            kASTNode.fields += kASTField
                            referenceNodes += kASTField
                        } else {
                            val kASTField = new KASTFieldValue(attrName.trim, attrValue.trim)
                            kASTNode.fields += kASTField
                        }
                    }
                }                                 
            }
        }
        
        for (rN : referenceNodes) {
            rN.reference = kAST.nodes.get(rN.index - 1)
        }
    }
    
    protected def void createKAST(LinkedList<String> lines, KAST kAST) {
        // ;; Function __debugbreak (null)
        val pattern = Pattern.compile("^;; Function (\\w+) \\(.*$")
        
        while (!lines.empty) {
            val line = lines.pop

            val matcher = pattern.matcher(line)            
            if (matcher.matches) {
                val subKAST = new KAST => [
                    name = matcher.group(1)
                    kAST.subKASTs += it
                ]
                lines.createSubKAST(subKAST)
            }
        }
    }
    
    protected def LinkedList<String> normalize(LinkedList<String> lines) {
        val nl = <String> newLinkedList
        var emptyLines = 0
        var String lastLine = ""
        var inTableMode = false
        while (!lines.empty) {
            val line = lines.pop
            
            if (line.empty) {
                emptyLines++
                if (emptyLines > 1) {
                    nl.add(lastLine)
                    lastLine = ""
                    inTableMode = false
                }
            } else {
                emptyLines = 0
            }
            
            if (line.startsWith("@") || !inTableMode) {
                nl.add(lastLine) 
                lastLine = line             
                if (line.startsWith("@")) {
                    inTableMode = true
                }
            } else {
                lastLine = lastLine + "    " + line.trim    
            }    
        }
        nl.add(lastLine) 
        return nl
    }
    
    protected def LinkedList<String> readASTFromDebug(ProjectInfrastructure infra) {
        // Bin folder
        val debugFolder = infra.createDebugFolder(false)
        
        logger.println
        logger.println("== Creating KAST ==")
        
        val sourceAST = new File(debugFolder, environment.getProperty(GCCAST.RAW_AST_NAME)?:GCCAST.RAW_AST_NAME.^default)
        logger.println("Source AST file: " + sourceAST)

        val br = new BufferedReader(new FileReader(sourceAST)); 
  
        val lines = <String> newLinkedList
        var String st 
        while ((st = br.readLine()) !== null) {
            lines += st
        }         
        
        return lines        
    }

}