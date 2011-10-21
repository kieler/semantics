package de.cau.cs.kieler.synccharts.text.kits.formatting;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import de.cau.cs.kieler.core.annotations.formatting.AnnotationsFormatter;
import de.cau.cs.kieler.synccharts.text.actions.formatting.ActionsFormatter;
import de.cau.cs.kieler.synccharts.text.kits.services.KitsGrammarAccess;

/**
 * Custom {@link IFormatter} contributing to Kits serialization.
 * 
 * @author chsch
 */
public class KitsFormatter extends ActionsFormatter {

    @Override
    protected void configureFormatting(FormattingConfig c) {
        KitsGrammarAccess f = (KitsGrammarAccess) getGrammarAccess();
        customConfigureFormatting(c, f);
    }

    /**
     * Method contains actual formatting instructions while GrammarAccess class maybe parameterized
     * allowing the reuse within other Formatters.
     * 
     * @param c
     *            FormattingConfig provided by caller
     * @param f
     *            GrammarAccess provided by caller
     */
    protected void customConfigureFormatting(FormattingConfig c, KitsGrammarAccess f) {
        super.customConfigureFormatting(c, f.getActionsGrammarAccess());
        
        for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")) {
            c.setIndentation(pair.getFirst(), pair.getSecond());
            c.setLinewrap(1).after(pair.getFirst());
            c.setLinewrap(1).before(pair.getSecond());
            c.setLinewrap(1).after(pair.getSecond());
        }

        /*
         * REGIONS
         */

        // Suppress any space between 'region' and ':'
        c.setNoSpace().before(f.getRegionAccess().getColonKeyword_5());
        c.setLinewrap().after(f.getRegionAccess().getColonKeyword_5());
        
        c.setNoSpace().before(f.getRootRegionAccess().getColonKeyword_2_4());
        c.setLinewrap().after(f.getRootRegionAccess().getColonKeyword_2_4());
        
        c.setNoSpace().before(f.getSingleRegionAccess().getColonKeyword_1_4());
        c.setLinewrap().after(f.getSingleRegionAccess().getColonKeyword_1_4());
        
        // this does not work, probably due to the absence of any common tail terminal
        // c.setLinewrap(2).between(f.getSingleRegionRule(), f.getRegionRule());
        // c.setLinewrap(2).between(f.getRegionRule(), f.getRegionRule());


        // works but is wrong in many cases
////        c.setLinewrap(2).before(f.getRegionAccess().getRegionKeyword_2());
//                
//        // does not work! :-(
////        c.setLinewrap(1, 1, 1).between(f.getRegionAccess().getRegionKeyword_2(),
////                f.getRegionAccess().getAnnotationsAssignment_1());
//
//        // does not work!
////        c.setLinewrap(2, 2, 2).between(f.getStateAccess().getRegionsAssignment_6_1_1_2_0(),
////                f.getStateAccess().getRegionsAssignment_6_1_1_2_1());
////
////        c.setLinewrap(2, 2, 2).between(f.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_2_0_0(),
////                f.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_2_1_0());
////        
////        c.setLinewrap(2, 2, 2).between(f.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_2_1_0(),
////                f.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_2_1_0());
        
        /*
         *  STATE
         */
        // does work :-), probably due to the mandatory ';'
        c.setLinewrap(1).after(f.getStateRule());
        
        c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), f.getStateAccess().getIsInitialInitKeyword_1_0_0_0());
        c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0());
        c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), f.getStateAccess().getStateKeyword_3());
        
        c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), f.getRegionAccess().getRegionKeyword_2());
        c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), f.getCOMMENT_ANNOTATIONRule());
        for (Keyword at : f.findKeywords("@")) {
            Grammar g = EcoreUtil2.getContainerOfType(at, Grammar.class);
            if (g != null && g.getName().equals(AnnotationsFormatter.LANGUAGE_NAME)) {
                // i.e. for all pairs of '(' and ')' declared in the Annotations grammar do...
                c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), at);
            }
        }
        
        
        
        
//        c.setLinewrap(2).between(f.getStateAccess().getRegionsAssignment_6_1_1_2_0(), f.getStateAccess().getRegionsAssignment_6_1_1_2_1());
//        c.setLinewrap(2).between(f.getSingleRegionRule(), f.getRegionRule());
        
//      
//        // introduce a line wrap before 'initial' and 'final' but not in between
//        c.setLinewrap().before(f.getStateAccess().getIsInitialInitKeyword_1_0_0_0());
//        c.setLinewrap().before(f.getStateAccess().getIsFinalFinalKeyword_1_0_1_0());
//        c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitKeyword_1_0_0_0(),
//                f.getStateAccess().getIsFinalFinalKeyword_1_0_1_0());
//
//        // introduce a line wrap before 'initial' and 'final' but not in between
//        c.setLinewrap().before(f.getStateAccess().getIsInitialInitKeyword_1_1_1_0());
//        c.setLinewrap().before(f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0());
//        c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitKeyword_1_1_1_0(),
//                f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0());
//        
//        // introduce a line wrap before state type keyword and 'state'
//        c.setLinewrap().before(f.getStateAccess().getTypeStateTypeEnumRuleCall_2_0());
//        c.setLinewrap().before(f.getStateAccess().getStateKeyword_3());
//        
//        // suppress line wraps in between the first line keywords
//        c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitKeyword_1_0_0_0(),
//                f.getStateAccess().getStateKeyword_3());
//        c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitKeyword_1_1_1_0(),
//                f.getStateAccess().getStateKeyword_3());
//        c.setNoLinewrap().between(f.getStateAccess().getIsFinalFinalKeyword_1_0_1_0(),
//                f.getStateAccess().getStateKeyword_3());
//        c.setNoLinewrap().between(f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0(),
//                f.getStateAccess().getStateKeyword_3());
//        
//        c.setNoLinewrap().between(f.getStateAccess().getTypeStateTypeEnumRuleCall_2_0(),
//                f.getStateAccess().getStateKeyword_3());
//
//        
//        // does not work :-(!
//        c.setLinewrap(2, 2, 2).between(f.getRegionAccess().getStatesAssignment_8(),
//                f.getRegionAccess().getStatesAssignment_8().getTerminal());
//
//        
        /*
         * SIGNAL 
         */
        // does work :-)
        c.setLinewrap().after(f.getSignalRule());
//        
//        // an alternative formulation of the formatting instructions
//        c.setLinewrap().before(f.getASignalAccess().getAnnotationsAssignment_0().getTerminal());
//        c.setLinewrap().before(f.getASignalAccess().getIsInputInputKeyword_1_0());
//        c.setLinewrap().before(f.getASignalAccess().getIsOutputOutputKeyword_2_0());
//        c.setLinewrap().before(f.getASignalAccess().getSignalKeyword_3());
//        c.setNoLinewrap().between(f.getASignalAccess().getIsInputInputKeyword_1_0(),
//                f.getASignalAccess().getIsOutputOutputKeyword_2_0());
//        c.setNoLinewrap().between(f.getASignalAccess().getIsInputInputKeyword_1_0(),
//                f.getASignalAccess().getSignalKeyword_3());
//        c.setNoLinewrap().between(f.getASignalAccess().getIsOutputOutputKeyword_2_0(),
//                f.getASignalAccess().getSignalKeyword_3());
//        
//        c.setLinewrap().before(f.getISignalAccess().getAnnotationsAssignment_0().getTerminal());
//        c.setLinewrap().before(f.getISignalAccess().getIsInputInputKeyword_1_0());
//        c.setLinewrap().before(f.getISignalAccess().getIsOutputOutputKeyword_2_0());
//        c.setLinewrap().before(f.getISignalAccess().getSignalKeyword_3());
//        c.setNoLinewrap().between(f.getISignalAccess().getIsInputInputKeyword_1_0(),
//                f.getISignalAccess().getIsOutputOutputKeyword_2_0());
//        c.setNoLinewrap().between(f.getISignalAccess().getIsInputInputKeyword_1_0(),
//                f.getISignalAccess().getSignalKeyword_3());
//        c.setNoLinewrap().between(f.getISignalAccess().getIsOutputOutputKeyword_2_0(),
//                f.getISignalAccess().getSignalKeyword_3());
//
//        
        /*
         * VARIABLE 
         */
        c.setLinewrap().after(f.getVariableRule());
//
//        c.setLinewrap().before(f.getAVariableAccess().getAnnotationsAssignment_0().getTerminal());
//        c.setLinewrap().before(f.getAVariableAccess().getVarKeyword_1());
//        c.setLinewrap().before(f.getIVariableAccess().getAnnotationsAssignment_0().getTerminal());
//        c.setLinewrap().before(f.getIVariableAccess().getVarKeyword_1());
//
//
//        c.setLinewrap().after(f.getActionRule());
//        c.setLinewrap().before(f.getStateAccess().getOnentryKeyword_6_1_1_0_2_0());
//        c.setLinewrap().before(f.getStateAccess().getOninnerKeyword_6_1_1_0_3_0());
//        c.setLinewrap().before(f.getStateAccess().getOnexitKeyword_6_1_1_0_4_0());
//        c.setLinewrap().before(f.getStateAccess().getSuspensionKeyword_6_1_1_0_5_0());
//        
        /*
         * TEXTUAL CODE
         */
        
        c.setLinewrap().after(f.getTextualCodeRule());
        c.setNoSpace().before(f.getTextualCodeAccess().getColonKeyword_3());
        
        
        /*
         * TRANSITION
         */
        
        // let each transition declaration begin on a new line
        c.setLinewrap().before(f.getTransitionRule());
        c.setLinewrap().after(f.getTransitionRule());
        c.setNoLinewrap().before(f.getTransitionAccess().getSolidusKeyword_4_1_0_3_0());
        c.setNoSpace().before(f.getStateAccess().getSemicolonKeyword_8());

    }
}
