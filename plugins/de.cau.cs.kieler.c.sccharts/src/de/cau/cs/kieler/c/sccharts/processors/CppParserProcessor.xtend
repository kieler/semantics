/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.c.sccharts.processors

import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import org.eclipse.cdt.core.parser.FileContent
import java.util.HashMap
import org.eclipse.cdt.core.parser.ScannerInfo
import org.eclipse.cdt.core.parser.IParserLogService
import org.eclipse.cdt.core.parser.DefaultLogService
import org.eclipse.cdt.core.parser.IncludeFileContentProvider
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage
import org.eclipse.cdt.core.model.ILanguage

/**
 * @author lewe
 *
 */
class CppParserProcessor extends ExogenousProcessor<CodeContainer, IASTTranslationUnit> {
 
    override getId() {
        "de.cau.cs.kieler.c.sccharts.cppParser"
    }
    
    override getName() {
        "C++ Parser"
    }
    
    override process() {
        
        val infrastructure = ProjectInfrastructure.getProjectInfrastructure(environment)
        
        val cppFileName = infrastructure.modelFile.absolutePath
        println("fileName: \n" + cppFileName)
        
        val FileContent fileContentCPP = FileContent.createForExternalFileLocation(cppFileName)
        
        val definedSymbols = new HashMap
        val String[] includePaths = #[]
        val ScannerInfo info = new ScannerInfo(definedSymbols, includePaths);
        val IParserLogService log = new DefaultLogService();

        val IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getSavedFilesProvider();

        val int opts = 0;
        var IASTTranslationUnit translationUnitCPP = 
            GPPLanguage.getDefault().getASTTranslationUnit(fileContentCPP, info, emptyIncludes, null, opts, log);
            
        setModel(translationUnitCPP)
    }
    
}