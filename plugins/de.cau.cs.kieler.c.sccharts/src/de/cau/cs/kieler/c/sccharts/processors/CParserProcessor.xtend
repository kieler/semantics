/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.processors

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.util.HashMap
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.core.dom.ast.gnu.c.GCCLanguage
import org.eclipse.cdt.core.parser.DefaultLogService
import org.eclipse.cdt.core.parser.FileContent
import org.eclipse.cdt.core.parser.IParserLogService
import org.eclipse.cdt.core.parser.IncludeFileContentProvider
import org.eclipse.cdt.core.parser.ScannerInfo
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * @author ssm
 * @kieler.design 2019-03-06 proposed
 * @kieler.rating 2019-03-06 proposed yellow
 *
 */
class CParserProcessor extends ExogenousProcessor<CodeContainer, IASTTranslationUnit> {
    
    override getId() {
        "de.cau.cs.kieler.c.sccharts.cParser"
    }
    
    override getName() {
        "C Parser"
    }
    
    override process() {
        
        val dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS")
        var now = LocalDateTime.now
        
        println("Stating CParserProcessor - Time: " + dtf.format(now))
        
        val infrastructure = ProjectInfrastructure.getProjectInfrastructure(environment)
        
        val cFileName = infrastructure.modelFile.absolutePath
        
        val FileContent fileContent = FileContent.createForExternalFileLocation(cFileName)

        val definedSymbols = new HashMap
        val String[] includePaths = #[]
        val ScannerInfo info = new ScannerInfo(definedSymbols, includePaths);
        val IParserLogService log = new DefaultLogService();

        val IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getEmptyFilesProvider();

        val int opts = 8;
        val IASTTranslationUnit translationUnit = 
            GCCLanguage.getDefault().getASTTranslationUnit(fileContent, info, emptyIncludes, null, opts, log);
        
        now = LocalDateTime.now
        println("CParserProcessor finished - Time: " + dtf.format(now))
        println("")
        
        setModel(translationUnit)
    }
    
}