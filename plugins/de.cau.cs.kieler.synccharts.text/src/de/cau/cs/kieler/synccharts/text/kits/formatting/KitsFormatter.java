package de.cau.cs.kieler.synccharts.text.kits.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

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

        c.setNoSpace().before(f.getRegionAccess().getColonKeyword_4());
        c.setLinewrap().after(f.getRegionAccess().getColonKeyword_4());
        
        c.setNoSpace().before(f.getRootRegionAccess().getColonKeyword_2_3());
        c.setLinewrap().after(f.getRootRegionAccess().getColonKeyword_2_3());
        
        c.setNoSpace().before(f.getSingleRegionAccess().getColonKeyword_1_3());
        c.setLinewrap().after(f.getSingleRegionAccess().getColonKeyword_1_3());
        
//        c.setNoLinewrap().before(f.getRootRegionAccess().getStatesStateParserRuleCall_4_0());
        c.setNoLinewrap().before(f.getRootRegionAccess().getStatesAssignment_5());
        
        
        // does not work!
        c.setLinewrap(2).before(f.getRegionRule());
        c.setLinewrap(2, 2, 2).before(f.getRegionRule());
        
        // works but is wrong in many cases
        c.setLinewrap(2).before(f.getRegionAccess().getRegionKeyword_1());
                
        // does not work! :-(
        c.setLinewrap(1, 1, 1).between(f.getRegionAccess().getRegionKeyword_1(),
                f.getRegionAccess().getAnnotationsAssignment_0());

        // does not work!
        c.setLinewrap(2, 2, 2).between(f.getStateAccess().getRegionsAssignment_6_1_1_1_0(),
                f.getStateAccess().getRegionsAssignment_6_1_1_1_1());

        c.setLinewrap(2, 2, 2).between(f.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0(),
                f.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0());
        
        c.setLinewrap(2, 2, 2).between(f.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0(),
                f.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0());
        
        /*
         *  STATE
         */
        
        c.setLinewrap().before(f.getStateAccess().getIsInitialInitKeyword_1_0_0_0());
        c.setLinewrap().before(f.getStateAccess().getIsFinalFinalKeyword_1_0_1_0());
        c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitKeyword_1_0_0_0(),
                f.getStateAccess().getIsFinalFinalKeyword_1_0_1_0());

        c.setLinewrap().before(f.getStateAccess().getIsInitialInitKeyword_1_1_1_0());
        c.setLinewrap().before(f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0());
        c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitKeyword_1_1_1_0(),
                f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0());
        
        c.setLinewrap().before(f.getStateAccess().getTypeStateTypeEnumRuleCall_2_0());

        c.setLinewrap().before(f.getStateAccess().getStateKeyword_3());
        
        c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitKeyword_1_0_0_0(),
                f.getStateAccess().getStateKeyword_3());
        c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitKeyword_1_1_1_0(),
                f.getStateAccess().getStateKeyword_3());
        c.setNoLinewrap().between(f.getStateAccess().getIsFinalFinalKeyword_1_0_1_0(),
                f.getStateAccess().getStateKeyword_3());
        c.setNoLinewrap().between(f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0(),
                f.getStateAccess().getStateKeyword_3());
        
        c.setNoLinewrap().between(f.getStateAccess().getTypeStateTypeEnumRuleCall_2_0(),
                f.getStateAccess().getStateKeyword_3());

        
        // does not work!
        c.setLinewrap(2, 2, 2).between(f.getRegionAccess().getStatesAssignment_7(),
                f.getRegionAccess().getStatesAssignment_7());
        
        
        
        c.setLinewrap().after(f.getSignalRule());
        // c.setLinewrap().after(f.getSignalAccess().getSemicolonKeyword_7());

        c.setLinewrap().after(f.getVariableRule());
        // c.setLinewrap().after(f.getVariableAccess().getSemicolonKeyword_4());

        c.setLinewrap().after(f.getTextualCodeRule());
        c.setNoSpace().before(f.getTextualCodeAccess().getColonKeyword_3());
        
        // let each transition declaration begin on a new line
        // unfortunately, the first declaration doesn't work as intended
        // c.setLinewrap().before(f.getTransitionRule());
        c.setLinewrap().before(f.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0());
        c.setLinewrap().before(f.getTransitionRule());
    }
}
