/*
 * generated by Xtext
 */
package de.cau.cs.kieler.sccharts.text.formatting2;

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.Pragma
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.kext.formatting2.KExtFormatter
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.ScopeCall
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.SuspendAction
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.text.services.SCTXGrammarAccess
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.formatting2.IFormattableDocument

class SCTXFormatter extends KExtFormatter {
	
	@Inject extension SCTXGrammarAccess

	def dispatch void format(SCCharts sccharts, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Pragma pragmas : sccharts.pragmas) {
		    pragmas.append[ setNewLines(1) ]
			format(pragmas, document)
		}
		
		sccharts.regionFor.assignments(SCChartsAccess.importsAssignment_0_1_1).forEach[append[ newLine ]]
        
		for (idxRootState : sccharts.rootStates.indexed) {
			format(idxRootState.value, document)
			if (idxRootState.key < sccharts.rootStates.size - 1) idxRootState.value.append[ newLine ]
		}
	}

	def dispatch void format(State state, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : state.annotations) {
			format(annotations, document)
		}
		
        format(state.reference, document)
		
        state.regionFor.keyword("{")?.prepend[ oneSpace ].append[ newLine ]
        state.regionFor.keywordPairs("{", "}").head?.interior[ indent ]
        state.regionFor.keyword("}")?.prepend[ newLine ]
		
		var EObject lastObject = null
		for (idxDeclaration : state.declarations.indexed) {
			format(idxDeclaration.value, document)
            if (idxDeclaration.key < state.declarations.size - 1) idxDeclaration.value.append[ newLine ]
			lastObject = idxDeclaration.value
		}
		
		if (lastObject !== null && !state.actions.empty) lastObject.append[ newLine ]
		for (idxAction : state.actions.indexed) {
			format(idxAction.value, document);
            if (idxAction.key < state.actions.size - 1) idxAction.value.append[ newLine ]
			lastObject = idxAction.value
		}
		
		if (!state.regions.empty) {
		    if (lastObject !== null) lastObject.append[ setNewLines(2) highPriority ]
		    format(state.regions.head, document)
    		for (Region regions : state.regions.drop(1)) {
      		    switch (regions) {
       	           ControlflowRegion: regions.regionFor.keyword(controlflowRegionAccess.regionKeyword_3).prepend[ setNewLines(2) ]
       	           DataflowRegion: regions.regionFor.keyword(dataflowRegionAccess.dataflowKeyword_3).prepend[ setNewLines(2) ]
       	        }
    			format(regions, document)
    		}
        }
		
		for (Transition outgoingTransitions : state.getOutgoingTransitions()) {
		    outgoingTransitions.prepend[ newLine ]
			format(outgoingTransitions, document)
		}
	}

	def dispatch void format(ScopeCall scopecall, extension IFormattableDocument document) {
	    
        // If there are no spaces, the tokenizer will detect > > as >> (shift) and parsing will fail
        scopecall.regionFor.keyword(scopeCallAccess.lessThanSignKeyword_2_0)?.prepend[ noSpace ]//.append[ noSpace ]
        //scopecall.regionFor.keyword(scopeCallAccess.greaterThanSignKeyword_2_3)?.prepend[ noSpace ]
            
        scopecall.regionFor.keyword(scopeCallAccess.leftParenthesisKeyword_3_0_0)?.prepend[ noSpace ].append[ noSpace ]
        scopecall.regionFor.keyword(scopeCallAccess.rightParenthesisKeyword_3_0_3)?.prepend[ noSpace ]
        
        for (Parameter parameters : scopecall.getParameters()) {
            format(parameters, document);
        }
	}

	def dispatch void format(Transition transition, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Annotation annotations : transition.getAnnotations()) {
			format(annotations, document);
		}
		format(transition.getTrigger(), document);
		for (idxEffect : transition.getEffects().indexed) {
			format(idxEffect.value, document);
			if (idxEffect.key < transition.effects.size - 1) idxEffect.value.append[ noSpace ]
		}
	}

	def dispatch void format(EntryAction entryaction, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(entryaction.getTrigger(), document);
		if (!entryaction.effects.empty) {
            for (idxEffect : entryaction.effects.indexed) {
                format(idxEffect.value, document)
                if (idxEffect.key < entryaction.effects.size - 1) idxEffect.value.append[ noSpace ]
            }
		}
	}

	def dispatch void format(DuringAction duringaction, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(duringaction.getTrigger(), document);
        if (!duringaction.effects.empty) {
            for (idxEffect : duringaction.effects.indexed) {
			    format(idxEffect.value, document)
			    if (idxEffect.key < duringaction.effects.size - 1) idxEffect.value.append[ noSpace ]
			}
		}
	}

	def dispatch void format(ExitAction exitaction, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(exitaction.getTrigger(), document);
        if (!exitaction.effects.empty) {
            for (idxEffect : exitaction.effects.indexed) {
                format(idxEffect.value, document)
                if (idxEffect.key < exitaction.effects.size - 1) idxEffect.value.append[ noSpace ]
            }
		}
	}

	def dispatch void format(SuspendAction suspendaction, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(suspendaction.getTrigger(), document);
	}

	def dispatch void format(ControlflowRegion controlflowregion, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc.
		for (Annotation annotations : controlflowregion.getAnnotations()) {
			format(annotations, document);
		}
	
		controlflowregion.regionFor.keyword(":")?.prepend[ noSpace ]?.append[ newLine ]
        controlflowregion.regionFor.keyword("{")?.prepend[ oneSpace ]?.append[ newLine ]
        controlflowregion.regionFor.keywordPairs("{", "}").head?.interior[ indent ]
        controlflowregion.regionFor.keyword("}")?.prepend[ newLine ]
		
		 
        var EObject lastObject = null
        for (idxDeclaration : controlflowregion.declarations.indexed) {
            format(idxDeclaration.value, document)
            if (idxDeclaration.key < controlflowregion.declarations.size - 1) idxDeclaration.value.append[ newLine ]
            lastObject = idxDeclaration.value
        }
        
        if (lastObject !== null && !controlflowregion.actions.empty) lastObject.append[ newLine ]
        for (idxAction : controlflowregion.actions.indexed) {
            format(idxAction.value, document);
            if (idxAction.key < controlflowregion.actions.size - 1) idxAction.value.append[ newLine ]
            lastObject = idxAction.value
        }
        
		for (state : controlflowregion.getStates.indexed) {

            if (state.key == 0 &&
                controlflowregion.regionFor.keyword("{") !== null &&
                controlflowregion.declarations.empty &&
                controlflowregion.actions.empty
            ) {
                state.value.prepend[ setNewLines(1) ]
            } else {
                state.value.prepend[ setNewLines(2) highPriority ]                
            }
			format(state.value, document);
		}
	}

	def dispatch void format(DataflowRegion dataflowregion, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
        for (Annotation annotations : dataflowregion.getAnnotations()) {
            format(annotations, document);
        }
    
        dataflowregion.regionFor.keyword(dataflowRegionAccess.colonKeyword_6_2).prepend[ noSpace ]
        
        dataflowregion.regionFor.keyword(dataflowRegionAccess.colonKeyword_9_1_0).prepend[ noSpace ].append[ newLine ]
        dataflowregion.regionFor.keyword("{")?.prepend[ oneSpace ]?.append[ newLine ]
        dataflowregion.regionFor.keywordPairs("{", "}").head?.interior[ indent ]
        dataflowregion.regionFor.keyword("}")?.prepend[ newLine ]
         
        var EObject lastObject = null
        for (idxDeclaration : dataflowregion.declarations.indexed) {
            format(idxDeclaration.value, document)
            if (idxDeclaration.key < dataflowregion.declarations.size - 1) idxDeclaration.value.append[ newLine ]
            lastObject = idxDeclaration.value
        }
        
        if (lastObject !== null && !dataflowregion.actions.empty) lastObject.append[ newLine ]
        for (idxAction : dataflowregion.actions.indexed) {
            format(idxAction.value, document);
            if (idxAction.key < dataflowregion.actions.size - 1) idxAction.value.append[ newLine ]
            lastObject = idxAction.value
        }
        
        for (asm : dataflowregion.equations) {
            asm.prepend[ setNewLines(2) highPriority ]
            format(asm, document);
        }        
	}

	override dispatch void format(Assignment assignment, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		
		// Delegate to KEffects formatter
		super._format(assignment, document)
	}
}
