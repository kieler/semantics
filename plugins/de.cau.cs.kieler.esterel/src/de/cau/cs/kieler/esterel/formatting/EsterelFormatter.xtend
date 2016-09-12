/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import de.cau.cs.kieler.esterel.services.EsterelGrammarAccess

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class EsterelFormatter extends AbstractDeclarativeFormatter {

    override protected configureFormatting(FormattingConfig c) {
        val g = getGrammarAccess() as EsterelGrammarAccess;

        // General
        g.findKeywords(",").forEach[c.setNoSpace.before(it)]
        g.findKeywords(";").forEach[c.setNoSpace.before(it)]
        g.findKeywords("?").forEach[c.setNoSpace.after(it)]
        g.findKeywords(";").forEach[c.setLinewrap.after(it)]

        // set no space around all parentheses
        for (p : g.findKeywordPairs("(", ")")) {
            c.setNoSpace.after(p.getFirst)
            c.setNoSpace.before(p.getSecond)
        }

        // Module
        c.setNoSpace.before(g.moduleAccess.colonKeyword_2)
        c.setLinewrap.after(g.moduleAccess.colonKeyword_2)
        c.setLinewrap.before(g.endModuleRule)

        // Local signals
        c.setLinewrap.after(g.localSignalDeclAccess.inKeyword_2)
        c.setLinewrap.before(g.localSignalDeclAccess.endKeyword_4)

        // Sequence
        c.setLinewrap.after(g.sequenceRule)

        // Comments
        c.setLinewrap(2).before(g.getESTEREL_ML_COMMENTRule)
        c.setNoLinewrap.before(g.getESTEREL_SL_COMMENTRule)
        c.setLinewrap.after(g.getESTEREL_SL_COMMENTRule)

        // Paralell
        c.setLinewrap.after(g.blockAccess.leftSquareBracketKeyword_0)
        c.setIndentationIncrement.before(g.blockAccess.statementStatementParserRuleCall_1_0)
        c.setIndentationDecrement.before(g.blockAccess.rightSquareBracketKeyword_2)
        c.setLinewrap.before(g.blockAccess.rightSquareBracketKeyword_2)

        c.setLinewrap.before(g.statementAccess.verticalLineVerticalLineKeyword_1_1_0)
        c.setIndentationDecrement.before(g.statementAccess.verticalLineVerticalLineKeyword_1_1_0)
        c.setIndentationIncrement.after(g.statementAccess.verticalLineVerticalLineKeyword_1_1_0)
        c.setLinewrap.after(g.statementAccess.verticalLineVerticalLineKeyword_1_1_0)

        // if
        c.setLinewrap.before(g.ifTestAccess.endKeyword_5)
        c.setIndentationDecrement.before(g.ifTestAccess.endKeyword_5)
        // present
        c.setLinewrap.before(g.presentAccess.endKeyword_3)
        c.setIndentationDecrement.before(g.presentAccess.endKeyword_3)
        // then
        c.setLinewrap.after(g.thenPartAccess.thenKeyword_0)
        c.setIndentationIncrement.before(g.thenPartAccess.statementStatementParserRuleCall_1_0)
        c.setLinewrap.after(g.thenPartRule)
//        c.setIndentationDecrement.after(g.thenPartRule)
        // elif
        c.setIndentationDecrement.before(g.elsIfAccess.elsifKeyword_0)
        c.setLinewrap.before(g.elsIfAccess.elsifKeyword_0)
        // else
        c.setIndentationDecrement.before(g.elsePartAccess.elseKeyword_0)
        c.setLinewrap.before(g.elsePartAccess.elseKeyword_0)
        c.setLinewrap.after(g.elsePartAccess.elseKeyword_0)
        c.setIndentationIncrement.before(g.elsePartAccess.statementStatementParserRuleCall_1_0)
        c.setLinewrap.after(g.elsePartRule)
//        c.setIndentationDecrement.after(g.elsePartRule)
        // present case
        c.setIndentationIncrement.before(g.presentCaseListAccess.casesPresentCaseParserRuleCall_0_0)
        c.setLinewrap.before(g.presentCaseAccess.caseKeyword_0)
        c.setIndentationDecrement.before(g.presentCaseAccess.caseKeyword_0)
        c.setLinewrap.after(g.presentCaseAccess.doKeyword_2_0)
        c.setIndentationIncrement.before(g.presentCaseAccess.statementStatementParserRuleCall_2_1_0)

        // abort
        c.setLinewrap.after(g.abortAccess.abortKeyword_0)
        c.setIndentationIncrement.after(g.abortAccess.abortKeyword_0)
        c.setIndentationDecrement.before(g.abortAccess.whenKeyword_2)
        c.setLinewrap.before(g.abortAccess.whenKeyword_2)
        // weak abort
        c.setLinewrap.after(g.weakAbortAccess.weakKeyword_1)
        c.setIndentationIncrement.after(g.weakAbortAccess.weakKeyword_1)
        c.setIndentationDecrement.before(g.weakAbortAccess.whenKeyword_4)
        c.setLinewrap.before(g.weakAbortAccess.whenKeyword_4)

        // await
        c.setLinewrap.after(g.awaitAccess.awaitKeyword_0)
        c.setIndentationIncrement.after(g.awaitAccess.awaitKeyword_0)
        c.setIndentationDecrement.before(g.awaitEndRule)
        c.setLinewrap.before(g.awaitEndRule)

        // loop
        c.setLinewrap.after(g.loopAccess.loopKeyword_0)
        c.setIndentationIncrement.after(g.loopAccess.loopKeyword_0)
        c.setIndentationDecrement.before(g.endLoopRule)
        c.setLinewrap.before(g.endLoopRule)
    }

}
