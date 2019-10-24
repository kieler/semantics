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
package de.cau.cs.kieler.c.sccharts.extensions

import org.eclipse.cdt.core.dom.ast.IASTEnumerationSpecifier
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit
import org.eclipse.cdt.core.dom.ast.IASTNode
import org.eclipse.cdt.core.dom.ast.IASTComment
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration
import org.eclipse.cdt.core.dom.ast.IASTCompositeTypeSpecifier
import org.eclipse.cdt.core.dom.ast.IASTFunctionDefinition
import org.eclipse.cdt.core.dom.ast.IASTFunctionDeclarator

/**
 * @author lewe
 *
 */
class SMExtractorExtensions {
    
    val stateEnumComment = "//_EXTRACTOR_STATE_ENUM"
    val eventEnumComment = "//_EXTRACTOR_EVENT_ENUM"
    val stateChangeFuncComment = "//_EXTRACTOR_STATE_CHANGE_FUNCTION"
    val stateInterface = "//_EXTRACTOR_STATE_INTERFACE"
    val stateEvalFunc = "//_EXTRACTOR_STATE_CLASS_EVALUATE_FUNC"
    
    def IASTEnumerationSpecifier findStateEnum(IASTTranslationUnit ast) {
         var IASTEnumerationSpecifier res
         
         val comments = ast.getComments()
         val idx = comments.getIdxOfComment(stateEnumComment)
         
         val enumComment = comments.get(idx)
         val commentFollowingNode = ast.getCommentFollowingNode(enumComment)
         
         println("enum commentFollowingNode: " + commentFollowingNode)
                           
         if (commentFollowingNode instanceof IASTSimpleDeclaration && commentFollowingNode.children.head instanceof IASTEnumerationSpecifier) {
             res = commentFollowingNode.children.head as IASTEnumerationSpecifier
         }
         
         res
     }
     
     def IASTCompositeTypeSpecifier findStateInterface(IASTTranslationUnit ast) {
         var IASTCompositeTypeSpecifier res
//         println("INSIDE findStateInterface")
         val comments = ast.getComments()
         val idx = comments.getIdxOfComment(stateInterface)
//         println("idx bestimmt: " + idx)
         val interfaceComment = comments.get(idx)
         val commentFollowingNode = ast.getCommentFollowingNode(interfaceComment)
//         println("commentFollowingNode bestimmt: " + commentFollowingNode)
         
         val children = commentFollowingNode.children
//         println("kinder der interface node length: " + children.length)
//         println("kinder head: " + children.head.class)
         val interfaceDef = children.head
         
         if (interfaceDef instanceof IASTCompositeTypeSpecifier) {
             /*
//             println("head: " + interfaceDef)
//             println("head name: " + interfaceDef.getName.toString)
             val members = interfaceDef.getMembers
             println("head members.length: " + members.length)
             for (member : members) {
                 println("member: " + member)
             }
             */
             res = interfaceDef
         }
         
         res
     }
     
     def IASTFunctionDeclarator findEvalFunc(IASTTranslationUnit ast) {
         var IASTFunctionDeclarator res
         
         val comments = ast.getComments
         val idx = comments.getIdxOfComment(stateEvalFunc)
         
         val evalFuncComment = comments.get(idx)
         val commentFollowingNode = ast.getCommentFollowingNode(evalFuncComment)
//         println("Found eval func node: " + commentFollowingNode)
//         println("Found Name: " + (commentFollowingNode as IASTFunctionDefinition).getDeclarator.getName.toString)
         
         if (commentFollowingNode instanceof IASTFunctionDefinition) {
             res = commentFollowingNode.getDeclarator
         }
         
         res
     }
     
     def IASTEnumerationSpecifier findEventEnum(IASTTranslationUnit ast) {
         var IASTEnumerationSpecifier res
         
         val comments = ast.getComments
         val idx = comments.getIdxOfComment(eventEnumComment)
         
         val eventEnumComment = comments.get(idx)
         val commentFollowingNode = ast.getCommentFollowingNode(eventEnumComment)
         
         if (commentFollowingNode instanceof IASTSimpleDeclaration && commentFollowingNode.children.head instanceof IASTEnumerationSpecifier) {
             res = commentFollowingNode.children.head as IASTEnumerationSpecifier
         }
         
         res
     }
     
     def IASTFunctionDeclarator findStateChangeFunc(IASTTranslationUnit ast) {
         var IASTFunctionDeclarator res
         
         val comments = ast.getComments
         val idx = comments.getIdxOfComment(stateChangeFuncComment)
         
         val stateChangeFuncComment = comments.get(idx)
         val commentFollowingNode = ast.getCommentFollowingNode(stateChangeFuncComment)
         
         if (commentFollowingNode instanceof IASTFunctionDefinition) res = commentFollowingNode.getDeclarator
         
         res
     }
     
     def IASTNode getCommentFollowingNode(IASTNode ast, IASTComment comment) {
         var IASTNode res
         
         val commentContainingFilename = comment.getContainingFilename
         val commentOffset = comment.getNodeLocations.get(0).getNodeOffset
         
         var found = false
         for (var i = 0; i < ast.children.length && !found; i++) {
             val child = ast.children.get(i)
             val childFilename = child.getContainingFilename
             val childOffset = child.getNodeLocations.get(0).getNodeOffset
             val childLength = child.getNodeLocations.get(0).getNodeLength
             
             if (childFilename.equals(commentContainingFilename)) {
                 if (childOffset < commentOffset && (childOffset + childLength) > commentOffset) {
                     res = getCommentFollowingNode(child, comment)
                     found = true
                 } else if (childOffset > commentOffset) {
                     res = child
                     found = true
                 }
             }
         }
         
         res
     }
     
     def int getIdxOfComment(IASTComment[] comments, String str) {
         var res = -1
         
         for (var i = 0; i < comments.length && res == -1; i++) {
             if(comments.get(i).toString.equals(str)) {
                 res = i
             }
         }
         res
     }
     
}