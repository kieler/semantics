/*
 * generated by Xtext
 */
package de.cau.cs.kieler.lustre.formatting2;

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.lustre.lustre.AState
import de.cau.cs.kieler.lustre.lustre.ATransition
import de.cau.cs.kieler.lustre.lustre.AnAction
import de.cau.cs.kieler.lustre.lustre.Assertion
import de.cau.cs.kieler.lustre.lustre.Automaton
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.services.LustreGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class LustreFormatter extends AbstractFormatter2 {
    
    @Inject extension LustreGrammarAccess

    def dispatch void format(LustreProgram program, extension IFormattableDocument document) {
        for (constant : program.constants) {
            format(constant, document)
        }
        for (type : program.types) {
            format(type, document)
        }
        for (extern : program.externals) {
            format(extern, document)
        }
        for (nodes : program.nodes) {
            format(nodes, document)
        }
    }
    
    def dispatch void format(NodeDeclaration node, extension IFormattableDocument document) {
        node.regionFor.keyword(nodeDeclarationAccess.leftParenthesisKeyword_4_0_0).append[noSpace]
        node.regionFor.keyword(nodeDeclarationAccess.leftParenthesisKeyword_6_0_0).append[noSpace]
        node.regionFor.keyword(nodeDeclarationAccess.rightParenthesisKeyword_4_0_3).prepend[noSpace]
        node.regionFor.keyword(nodeDeclarationAccess.rightParenthesisKeyword_6_0_3).prepend[noSpace]
        
        node.regionFor.keyword("const").prepend[newLine]
        node.regionFor.keyword("var").prepend[newLine]
        
        for (varDecl : node.constants+node.variables) {
            format(varDecl, document)
        }
        node.regionFor.keyword(nodeDeclarationAccess.constKeyword_8_0_0).prepend[newLine]
        node.regionFor.keyword(nodeDeclarationAccess.semicolonKeyword_7).prepend[noSpace].append[newLine]
        node.regionFor.keyword(nodeDeclarationAccess.semicolonKeyword_8_0_2_0).prepend[noSpace].append[space = " "]
        node.regionFor.keyword(nodeDeclarationAccess.semicolonKeyword_8_1_2_0).prepend[noSpace].append[newLine]
        node.regionFor.keyword(nodeDeclarationAccess.semicolonKeyword_8_1_3).prepend[noSpace].append[newLine]
        
        
        
        
        node.regionFor.keyword("let").prepend[newLine].append[newLine]
        node.regionFor.keywordPairs("let", "tel").head?.interior[indent]
        node.regionFor.keyword("tel").prepend[newLine]
        
        for (equation : node.equations) {
            format(equation, document)
        }
        for (emission : node.emissions) {
            format(emission, document)
        }
        for (assertion : node.assertions) {
            format(assertion, document)
        }
        for (automaton : node.automatons) {
            format(automaton, document)
        }
    }
    
    def dispatch void format(Equation equation, extension IFormattableDocument document) {
        equation.regionFor.keyword(equationAccess.semicolonKeyword_4).prepend[noSpace].append[newLine]
    }
    
    def dispatch void format(Emission emission, extension IFormattableDocument document) {
        emission.regionFor.keyword(emissionAccess.semicolonKeyword_2).prepend[noSpace].append[newLine]
    }
    
    def dispatch void format(Assertion assertion, extension IFormattableDocument document) {
        assertion.regionFor.keyword(assertionAccess.semicolonKeyword_3).prepend[noSpace].append[newLine]
    }
    
    def dispatch void format(Automaton automaton, extension IFormattableDocument document) {
        for (state : automaton.states) {
            format(state, document)
        }
        
        automaton.regionFor.keyword(automatonAccess.returnsKeyword_4).prepend[newLine]
        automaton.regionFor.keywordPairs(automatonAccess.automatonKeyword_0, automatonAccess.returnsKeyword_4).head?.interior[indent]
        automaton.regionFor.keyword(automatonAccess.semicolonKeyword_6).prepend[noSpace].append[newLine]
    }
    
    def dispatch void format(AState state, extension IFormattableDocument document) {
        state.regionFor.keyword(AStateAccess.stateKeyword_1).prepend[newLine]
        state.regionFor.keyword(AStateAccess.telKeyword_4_2).append[newLine]
        for (transition : state.transitions) {
            format(transition, document)
        }
    }
    
    def dispatch void format(ATransition transition, extension IFormattableDocument document) {
        transition.regionFor.keyword(ATransitionAccess.untilKeyword_1_0).prepend[newLine]
        transition.regionFor.keyword(ATransitionAccess.strongUnlessKeyword_1_1_0).prepend[newLine]
//        transition.regionFor.keywordPairs(AStateAccess.stateKeyword_1, anActionAccess.semicolonKeyword_4).head.interior[indent]
    }
    
    def dispatch void format(AnAction action, extension IFormattableDocument document) {
        action.regionFor.keyword(anActionAccess.restartKeyword_2_0).prepend[newLine]
        action.regionFor.keyword(anActionAccess.historyResumeKeyword_2_1_0).prepend[newLine]
        action.regionFor.keyword(anActionAccess.semicolonKeyword_4).prepend[noSpace].append[newLine]
    }
    
    
}