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

import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import org.eclipse.cdt.core.model.ITranslationUnit
import org.eclipse.cdt.internal.ui.editor.CEditor
import org.eclipse.ui.texteditor.IDocumentProvider
import org.eclipse.jface.text.IDocument
import org.eclipse.cdt.core.parser.FileContent
import java.util.HashMap
import org.eclipse.cdt.core.parser.ScannerInfo
import org.eclipse.cdt.core.parser.IParserLogService
import org.eclipse.cdt.core.parser.IncludeFileContentProvider
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.core.parser.DefaultLogService
import org.eclipse.cdt.core.dom.ast.gnu.c.GCCLanguage
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure

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
        
        val infrastructure = ProjectInfrastructure.getProjectInfrastructure(environment)
        
        val FileContent fileContent = FileContent.createForExternalFileLocation(infrastructure.sourceCodeFiles.head.absolutePath)

        val definedSymbols = new HashMap
        val String[] includePaths = #[]
        val ScannerInfo info = new ScannerInfo(definedSymbols, includePaths);
        val IParserLogService log = new DefaultLogService();

        val IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getEmptyFilesProvider();

        val int opts = 8;
        val IASTTranslationUnit translationUnit = 
            GCCLanguage.getDefault().getASTTranslationUnit(fileContent, info, emptyIncludes, null, opts, log);

        setModel(translationUnit)
    }
    
}