package de.cau.cs.kieler.sccharts.text.sct.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import de.cau.cs.kieler.sccharts.text.actions.formatting.ActionsFormatter;
import de.cau.cs.kieler.sccharts.text.sct.services.SctGrammarAccess;

/**
 * Custom {@link IFormatter} contributing to sct serialization.
 *
 * @author chsch ssm
 */
public class SctFormatter extends ActionsFormatter {

    @Override
    protected void configureFormatting(FormattingConfig c) {
        SctGrammarAccess f = (SctGrammarAccess) getGrammarAccess();
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
    protected void customConfigureFormatting(FormattingConfig c, SctGrammarAccess f) {
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
        c.setLinewrap(2).before(f.getControlflowRegionAccess().getRegionKeyword_2());
//        c.setLinewrap(2).before(f.getTheRootRegionAccess().getRegionKeyword_4_1());
//        c.setLinewrap(2).before(f.getSingleControlflowRegionAccess().getRegionKeyword_1_1());
        c.setNoSpace().before(f.getControlflowRegionAccess().getColonKeyword_5());
        c.setLinewrap().after(f.getControlflowRegionAccess().getColonKeyword_5());
//
//        c.setNoSpace().before(f.getTheRootRegionAccess().getColonKeyword_4_4());
//        c.setLinewrap().after(f.getTheRootRegionAccess().getColonKeyword_4_4());

//        c.setNoSpace().before(f.getSingleControlflowRegionAccess().getColonKeyword_1_4());
//        c.setLinewrap().after(f.getSingleControlflowRegionAccess().getColonKeyword_1_4());
        
//        /*
//         *  STATE
//         */
              c.setLinewrap(2).before(f.getStateAccess().getStateKeyword_3());
              c.setLinewrap(2).before(f.getStateAccess().getFinalFinalKeyword_1_1_0_0());
              c.setLinewrap(2).before(f.getStateAccess().getInitialInitialKeyword_1_0_0_0());

              c.setNoLinewrap().between(f.getStateAccess().getInitialInitialKeyword_1_0_0_0(), f.getStateAccess().getFinalFinalKeyword_1_1_0_0());
              c.setNoLinewrap().between(f.getStateAccess().getInitialInitialKeyword_1_0_0_0(), f.getStateAccess().getStateKeyword_3());
              c.setNoLinewrap().between(f.getStateAccess().getInitialInitialKeyword_1_1_1_0() , f.getStateAccess().getStateKeyword_3());
              c.setNoLinewrap().between(f.getStateAccess().getFinalFinalKeyword_1_1_0_0() , f.getStateAccess().getStateKeyword_3());
              c.setNoLinewrap().between(f.getStateAccess().getFinalFinalKeyword_1_0_1_0() , f.getStateAccess().getStateKeyword_3());

//            /*
//            *  CONNECTOR
//            */
              c.setLinewrap(2).before(f.getStateTypeRule());
              c.setNoLinewrap().between(f.getStateTypeRule(), f.getStateAccess().getStateKeyword_3());

              
              // no linewrap between { and any following keyword!
              c.setLinewrap(1,1,1).after(f.getStateAccess().getLeftCurlyBracketKeyword_6_1_0());
              

        /*
         * SIGNAL
         */
        // does work :-)
//        c.setLinewrap().after(f.getValuedObjectRule());
        c.setLinewrap().after(f.getDeclarationRule());

        /*
         * DECLARATIONS
         */
//        c.setNoSpace().before(f.getValuedObjectAccess().getSemicolonKeyword_9());
        c.setNoSpace().before(f.getDeclarationAccess().getSemicolonKeyword_10());
        

        
        /*
         * TRANSITION
         */

        // let each transition declaration begin on a new line
        c.setLinewrap().before(f.getTransitionRule());
//        c.setNoSpace().before(f.getTransitionAccess().getSemicolonKeyword_3_3_1_0_2_2_0());
//        c.setNoLinewrap().before(f.getTransitionAccess().getSolidusKeyword_3_3_1_0_2_0()); //changed cmot from getSolidusKeyword_4_1_0_3_0());
//        c.setNoLinewrap().before(f.getTransitionAccess().getSemicolonKeyword_3_3_1_0_2_2_0()); //changed cmot from getSolidusKeyword_4_1_0_3_0());
        c.setNoSpace().before(f.getTransitionAccess().getSemicolonKeyword_7_2_2_0());
        c.setNoLinewrap().before(f.getTransitionAccess().getSolidusKeyword_7_2_0()); 
        c.setNoLinewrap().before(f.getTransitionAccess().getSemicolonKeyword_7_2_2_0());
        c.setNoSpace().before(f.getStateAccess().getSemicolonKeyword_8());

    }
}
