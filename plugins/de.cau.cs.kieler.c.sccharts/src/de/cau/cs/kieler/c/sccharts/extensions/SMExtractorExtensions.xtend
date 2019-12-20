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
import org.eclipse.cdt.core.dom.ast.IASTDeclarator
import org.eclipse.cdt.core.dom.ast.IASTSwitchStatement

/**
 * @author lewe
 *
 */
class SMExtractorExtensions {
    
    // All used marking comments
    val stateEnumComment = "//_EXTRACTOR_STATE_ENUM"
    val eventEnumComment = "//_EXTRACTOR_EVENT_ENUM"
    val behaviourSwitchComment = "//_EXTRACTOR_BEHAVIOUR_SWITCH"
    val stateChangeFuncComment = "//_EXTRACTOR_STATE_CHANGE_FUNCTION"
    val stateEvalFunc = "//_EXTRACTOR_STATE_CLASS_EVALUATE_FUNC"
    
    // Finds the enum following the state extractor comment
    def IASTEnumerationSpecifier findStateEnum(IASTTranslationUnit ast) {
         var IASTEnumerationSpecifier res
         
         // Get the comment idx 
         val comments = ast.getComments()
         val idx = comments.getIdxOfComment(stateEnumComment)
         
         // Test if idx was found
         if (idx >= 0) {
             val enumComment = comments.get(idx)
             val commentFollowingNode = ast.getCommentFollowingNode(enumComment)
             
             // Test if comment following node has wanted type                               
             if (commentFollowingNode instanceof IASTSimpleDeclaration && commentFollowingNode.children.head instanceof IASTEnumerationSpecifier) {
                 res = commentFollowingNode.children.head as IASTEnumerationSpecifier
             } else {
                 println("State enum extractor comment does not mark an enum node!")
             }
         } else {
             println("Could not find state enum extractor comment!")
         }
         
         res
     }
     
     // Finds the enum following the event extractor comment
     def IASTEnumerationSpecifier findEventEnum(IASTTranslationUnit ast) {
         var IASTEnumerationSpecifier res
         
         // Get the comment idx 
         val comments = ast.getComments
         val idx = comments.getIdxOfComment(eventEnumComment)
         
         // Test if idx was found
         if (idx >= 0) {
             val eventEnumComment = comments.get(idx)
             val commentFollowingNode = ast.getCommentFollowingNode(eventEnumComment)
         
             // Test if comment following node has wanted type                               
             if (commentFollowingNode instanceof IASTSimpleDeclaration && commentFollowingNode.children.head instanceof IASTEnumerationSpecifier) {
                res = commentFollowingNode.children.head as IASTEnumerationSpecifier
             } else {
                 println("Event enum extractor comment does not mark an enum node!")
             }
         } else {
             println("Could not find event enum extractor comment!")
         }
         
         res
     }
     
     // Finds the switch following the behaviour switch extractor comment
     def IASTSwitchStatement findBehaviourSwitch(IASTTranslationUnit ast) {
        var IASTSwitchStatement res
         
        // Get the comment idx 
        val comments = ast.getComments()
        val idx = comments.getIdxOfComment(behaviourSwitchComment)
         
        // Test if idx was found
         if (idx >= 0) {
             val switchComment = comments.get(idx)
             val commentFollowingNode = ast.getCommentFollowingNode(switchComment)
      
             // Test if comment following node has wanted type                               
             if (commentFollowingNode instanceof IASTSwitchStatement) {
                res = commentFollowingNode
             } else {
                 println("Behaviour switch extractor comment does not mark a switch node!")
             }
         } else {
             println("Could not find behaviour switch extractor comment!")
         }
         
        res
     }
      // Finds the Function Declarator following the state change function extractor comment
     def IASTDeclarator findStateChangeFunc(IASTTranslationUnit ast) {
         var IASTDeclarator res
         
         // Get the comment idx 
         val comments = ast.getComments
         val idx = comments.getIdxOfComment(stateChangeFuncComment)
         
         // Test if idx was found
         if (idx >= 0) {
             val stateChangeFuncComment = comments.get(idx)
             val commentFollowingNode = ast.getCommentFollowingNode(stateChangeFuncComment)
             
             // Test if comment following node has wanted type                               
             if (commentFollowingNode instanceof IASTFunctionDefinition) {
                 res = commentFollowingNode.getDeclarator
             // Test if comment marks the abstract function declaration                               
             } else if (commentFollowingNode instanceof IASTSimpleDeclaration) {
                 res = commentFollowingNode.getDeclarators.head
             } else {
                 println("State change function extractor comment does not mark a function declaration node!")
             }
         } else {
             println("Could not find state change function extractor comment!")
         }
         
         res
     }
     
      // Finds the Function Declarator following the evaluation function extractor comment
     def IASTFunctionDeclarator findEvalFunc(IASTTranslationUnit ast) {
         var IASTFunctionDeclarator res
         
         // Get the comment idx 
         val comments = ast.getComments
         val idx = comments.getIdxOfComment(stateEvalFunc)
         
         // Test if idx was found
         if (idx >= 0) {
             val evalFuncComment = comments.get(idx)
             val commentFollowingNode = ast.getCommentFollowingNode(evalFuncComment)
             
             // Test if comment following node has wanted type    
             if (commentFollowingNode instanceof IASTFunctionDefinition) {
                 res = commentFollowingNode.getDeclarator
             } else {
                 println("Evaluation function extractor comment does not mark a function declaration node!")
             }
         } else {
             println("Could not find evaluation function extractor comment!")
         }
         
         res
     }
     
     // Finds the first ast node following the given comment in the source code
     def IASTNode getCommentFollowingNode(IASTNode parentNode, IASTComment comment) {
         var IASTNode res
         
         // Retrieve comment location information
         val commentContainingFilename = comment.getContainingFilename
         val commentOffset = comment.getNodeLocations.get(0).getNodeOffset
         
         var found = false
         // Test children of given parent node
         for (var i = 0; i < parentNode.children.length && !found; i++) {
             val child = parentNode.children.get(i)
             
             // Retrieve child location information 
             val childFilename = child.getContainingFilename
             val childOffset = child.getNodeLocations.get(0).getNodeOffset
             val childLength = child.getNodeLocations.get(0).getNodeLength
             
             // Test if child is in the same file as the comment
             if (childFilename.equals(commentContainingFilename)) {
                 
                 // Test if the comment is inside the child node
                 if (childOffset < commentOffset && (childOffset + childLength) > commentOffset) {
                     res = getCommentFollowingNode(child, comment)
                     found = true
                 // Test if child is defined after the comment    
                 } else if (childOffset > commentOffset) {
                     res = child
                     found = true
                 }
             }
         }
         
         res
     }
     
     // Returns the index of the given comment in the comments array
     def int getIdxOfComment(IASTComment[] comments, String comment) {
         var idx = -1
         
         for (var i = 0; i < comments.length && idx == -1; i++) {
             if(comments.get(i).toString.equals(comment)) {
                 idx = i
             }
         }
         idx
     }
     
}