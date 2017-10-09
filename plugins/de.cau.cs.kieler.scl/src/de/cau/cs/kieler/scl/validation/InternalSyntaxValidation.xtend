/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scl.validation

import de.cau.cs.kieler.scl.Assignment
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Label
import de.cau.cs.kieler.scl.ScopeStatement
import de.cau.cs.kieler.scl.SequencePart
import java.util.Collection
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Delegate
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage
import org.eclipse.xtext.nodemodel.impl.LeafNode
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic
import de.cau.cs.kieler.scl.SCLProgram
import de.cau.cs.kieler.scl.StatementContainer

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class InternalSyntaxValidation {    
    
    def Collection<? extends Diagnostic> createSemicolonErrors(IParseResult result) {
        val diag = <Diagnostic>newLinkedList
        val lastSeqPartLeafNode = <SequencePart, INode>newHashMap
        result.rootNode.asTreeIterable.filter(LeafNode).filter[semanticElement instanceof SequencePart].forEach[
            lastSeqPartLeafNode.put(semanticElement as SequencePart, it)
        ]
        
        for (part : lastSeqPartLeafNode.keySet) {
            // Semicolons after meta statements are always forbidden in grammar
            // if (part.semicolon && part.metaStatement) {
            val node = lastSeqPartLeafNode.get(part)
            if (!part.semicolon && !part.isMetaStatement(node) && part.eContainer !== null) {
                val container = part.eContainer.eGet(part.eContainmentFeature)
                if (container instanceof List<?>) {
                    val idx = container.indexOf(part)
                    if (idx >= 0 && idx < container.size -1) {
                        if (node.syntaxErrorMessage == null) {
                            diag += new XtextSyntaxDiagnostic(new SemicolonSyntaxErrorWrapperNode(if (part instanceof Assignment) node.parent else node))
                        } 
                    }
                }
            }
        }
        
        return diag
    }
    
    def EObject assureSemicolons(EObject eobj) {
        if (eobj instanceof SCLProgram) {
            for (sc : eobj.eAllContents.filter(StatementContainer).toIterable) {
                for (part : sc.statements.take(sc.statements.size - 1)) {
                    part.semicolon = !part.isMetaStatement(null)
                }
            }
        }
        return eobj
    }
        
    private def boolean isMetaStatement(EObject obj, INode node) {
        switch(obj) {
            Label,
            ScopeStatement,
            Thread: return true
            Conditional: {
                if (node !== null && node.grammarElement instanceof Keyword) {
                    return "}".equals((node.grammarElement as Keyword).value)
                }
                return true
            }
            default: return false
        }
    }
}

class SemicolonSyntaxErrorWrapperNode implements INode {
    
    static val SEMICOLON_SYNTAX_ERROR = new SyntaxErrorMessage("Missing Semicolon",null)
    
    // generates all methods of List and delegates to this field
    @Delegate INode delegateNode
  
    new(INode node) {
        delegateNode = node
    }
    
    override getSyntaxErrorMessage() {
        return SEMICOLON_SYNTAX_ERROR
    }
    
}