package de.cau.cs.kieler.sccharts.text.sct.formatting;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import de.cau.cs.kieler.core.annotations.text.formatting.AnnotationsFormatter;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.text.actions.formatting.ActionsFormatter;
import de.cau.cs.kieler.sccharts.text.sct.services.SctGrammarAccess;

/**
 * Custom {@link IFormatter} contributing to sct serialization.
 *
 * @author chsch
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
        c.setNoSpace().before(f.getRegionAccess().getColonKeyword_5());
        c.setLinewrap().after(f.getRegionAccess().getColonKeyword_5());

        c.setNoSpace().before(f.getRootRegionAccess().getColonKeyword_2_4());
        c.setLinewrap().after(f.getRootRegionAccess().getColonKeyword_2_4());

        c.setNoSpace().before(f.getSingleRegionAccess().getColonKeyword_1_4());
        c.setLinewrap().after(f.getSingleRegionAccess().getColonKeyword_1_4());

//        /*
//         *  STATE
//         */
        //EcoreUtil2.
//        // does work :-), probably due to the mandatory ';'
          //if (((Grammar) f.getStateRule().eContainer()). .getParentState() != null) {
              c.setLinewrap(2).before(f.getStateAccess().getStateKeyword_3());
              c.setLinewrap(2).before(f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0());
              c.setLinewrap(2).before(f.getStateAccess().getIsInitialInitialKeyword_1_0_0_0());

              c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitialKeyword_1_0_0_0(), f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0());
              c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitialKeyword_1_0_0_0(), f.getStateAccess().getStateKeyword_3());
              c.setNoLinewrap().between(f.getStateAccess().getIsInitialInitialKeyword_1_1_1_0() , f.getStateAccess().getStateKeyword_3());
              c.setNoLinewrap().between(f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0() , f.getStateAccess().getStateKeyword_3());
              c.setNoLinewrap().between(f.getStateAccess().getIsFinalFinalKeyword_1_0_1_0() , f.getStateAccess().getStateKeyword_3());
          //}
          //c.setLinewrap(2).after(f.getStateAccess().getSemicolonKeyword_8());
//
//        c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), f.getStateAccess().getIsInitialInitKeyword_1_0_0_0());
//        c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), f.getStateAccess().getIsFinalFinalKeyword_1_1_0_0());
//        //c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), f.getStateAccess().getStateKeyword_3());
//
//        c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), f.getRegionAccess().getRegionKeyword_2());
//        c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), f.getCOMMENT_ANNOTATIONRule());
//        for (Keyword at : f.findKeywords("@")) {
//            Grammar g = EcoreUtil2.getContainerOfType(at, Grammar.class);
//            if (g != null && g.getName().equals(AnnotationsFormatter.LANGUAGE_NAME)) {
//                // i.e. for all pairs of '(' and ')' declared in the Annotations grammar do...
//                c.setLinewrap(2).between(f.getStateAccess().getSemicolonKeyword_8(), at);
//            }
//        }


        /*
         * SIGNAL
         */
        // does work :-)
        c.setLinewrap().after(f.getValuedObjectRule());

        /*
         * TEXTUAL CODE
         */

        c.setLinewrap().after(f.getTextualCodeRule());
        c.setNoSpace().before(f.getTextualCodeAccess().getColonKeyword_2());

        
        /*
         * DECLARATIONS
         */
        c.setNoSpace().before(f.getValuedObjectAccess().getSemicolonKeyword_9());
        

        /*
         * ACTIONS
         */
        c.setLinewrap().after(f.getEntryActionRule());
        c.setLinewrap().after(f.getDuringActionRule());
        c.setLinewrap().after(f.getExitActionRule());
        c.setLinewrap().after(f.getSuspendActionRule());
        c.setNoSpace().before(f.getEntryActionAccess().getSemicolonKeyword_4());
        c.setNoSpace().before(f.getDuringActionAccess().getSemicolonKeyword_5());
        c.setNoSpace().before(f.getExitActionAccess().getSemicolonKeyword_4());
        c.setNoSpace().before(f.getSuspendActionAccess().getSemicolonKeyword_4());
        
        /*
         * TRANSITION
         */

        // let each transition declaration begin on a new line
        c.setLinewrap().before(f.getTransitionRule());
        c.setNoSpace().before(f.getTransitionAccess().getSemicolonKeyword_4_2_1_0_2_2_0());
        c.setNoLinewrap().before(f.getTransitionAccess().getSolidusKeyword_4_2_1_0_2_0()); //changed cmot from getSolidusKeyword_4_1_0_3_0());
        c.setNoLinewrap().before(f.getTransitionAccess().getSemicolonKeyword_4_2_1_0_2_2_0()); //changed cmot from getSolidusKeyword_4_1_0_3_0());
        c.setNoSpace().before(f.getStateAccess().getSemicolonKeyword_8());

    }
}
