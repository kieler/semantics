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

        // let the parallel operator be the single element on its line
        for (Keyword keyword : f.findKeywords("||")) {
            c.setLinewrap().before(keyword);
            c.setLinewrap().after(keyword);
        }

        // let the parallel operator be the single element on its line
        for (Keyword keyword : f.findKeywords(";")) {
            c.setNoSpace().before(keyword);
        }

        // c.setLinewrap().after(f.getStringAnnotationRule());
        // c.setLinewrap().after(f.getCOMMENT_ANNOTATIONRule());

        c.setNoLinewrap().before(f.getRootRegionRule());
        
        // why does this not work as intended :-(
        c.setLinewrap(2).before(f.getRegionRule());
        c.setLinewrap(2).before(f.getSingleRegionRule());

        c.setNoSpace().before(f.getRegionAccess().getColonKeyword_4());
        c.setLinewrap().after(f.getRegionAccess().getColonKeyword_4());

        c.setNoSpace().before(f.getRootRegionAccess().getColonKeyword_2_3());
        c.setLinewrap().after(f.getRootRegionAccess().getColonKeyword_2_3());
        
        c.setNoSpace().before(f.getSingleRegionAccess().getColonKeyword_1_3());
        c.setLinewrap().after(f.getSingleRegionAccess().getColonKeyword_1_3());

        // have a blank between states
        // unfortunately, the first declaration doesn't work as intended
        c.setLinewrap(2).after(f.getStateRule());
        c.setLinewrap(1).before(f.getStateRule());
        c.setLinewrap(1).before(f.getStateAccess().getRightCurlyBracketKeyword_6_1_2());

        c.setLinewrap().after(f.getSignalRule());
        // c.setLinewrap().after(f.getSignalAccess().getSemicolonKeyword_7());

        c.setLinewrap().after(f.getVariableRule());
        // c.setLinewrap().after(f.getVariableAccess().getSemicolonKeyword_4());

        // let each transition declaration begin on a new line
        // unfortunately, the first declaration doesn't work as intended
        // c.setLinewrap().before(f.getTransitionRule());
        c.setLinewrap().before(f.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0());
        c.setLinewrap().before(f.getTransitionRule());
        c.setLinewrap(2).after(f.getTransitionRule());

        // let the priority statement be compressed, i.e. <1> not < 1 >
        c.setNoSpace().after(f.getTransitionAccess().getLessThanSignKeyword_3_0());
        c.setNoSpace().before(f.getTransitionAccess().getGreaterThanSignKeyword_3_2());
        
        c.setLinewrap().after(f.getActionRule());
    }
}
