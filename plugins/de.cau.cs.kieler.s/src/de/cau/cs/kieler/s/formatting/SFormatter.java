/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.s.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class implements a custom formatting description for S.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting on how and when to
 * use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 * 
 */
public class SFormatter extends AbstractDeclarativeFormatter {

    @Override
    protected void configureFormatting(FormattingConfig c) {
        de.cau.cs.kieler.s.services.SGrammarAccess f = (de.cau.cs.kieler.s.services.SGrammarAccess) getGrammarAccess();
        
        // Linebreaks after Program
        c.setLinewrap(2).after(f.getProgramAccess().getRightParenthesisKeyword_5());
        
        // Indentation for Signal, Input, Output declaration parts
        //c.setIndentationIncrement().after(f.getProgramAccess().getSignalsKeyword_7_0());
        //c.setIndentationDecrement().before(f.getProgramAccess().getSemicolonKeyword_5_3());
        //c.setIndentationIncrement().after(f.getProgramAccess().getInputsKeyword_5_0());
        //c.setIndentationDecrement().before(f.getProgramAccess().getSemicolonKeyword_6_3());
        //c.setIndentationIncrement().after(f.getProgramAccess().getOutputsKeyword_6_0());
        //c.setIndentationDecrement().before(f.getProgramAccess().getSemicolonKeyword_7_3());

        // Each Signal, Input, Output declaration part in a new line
//        c.setLinewrap(1).before(f.getValuedObjectRule());
        c.setLinewrap().after(f.getDeclarationAccess().getSemicolonKeyword_4());
        
        // Put ";" in a new line, one line separates Sig/In/Out parts
        //c.setLinewrap(1).after(f.getProgramAccess().getSignalsKeyword_7_0());
        //c.setLinewrap(1).after(f.getProgramAccess().getInputsKeyword_5_0());
        //c.setLinewrap(1).after(f.getProgramAccess().getOutputsKeyword_6_0());
        //c.setLinewrap(1).before(f.getProgramAccess().getSemicolonKeyword_5_3());
        //c.setLinewrap(1).before(f.getProgramAccess().getSemicolonKeyword_6_3());
        //c.setLinewrap(1).before(f.getProgramAccess().getSemicolonKeyword_7_3());
        //c.setLinewrap(2).after(f.getProgramAccess().getSemicolonKeyword_5_3());
        //c.setLinewrap(2).after(f.getProgramAccess().getSemicolonKeyword_6_3());
        //c.setLinewrap(2).after(f.getProgramAccess().getSemicolonKeyword_7_3());
        //c.setLinewrap(1).after(f.getProgramAccess().getSemicolonKeyword_5_2());
        
        // Linebreaks after STATE 
        c.setIndentation(f.getStateAccess().getLeftCurlyBracketKeyword_5(), 
        		         f.getStateAccess().getRightCurlyBracketKeyword_8());
        c.setLinewrap().after(f.getStateAccess().getLeftCurlyBracketKeyword_5());
        c.setLinewrap().before(f.getStateAccess().getRightCurlyBracketKeyword_8());
        c.setLinewrap(2).before(f.getStateAccess().getStateKeyword_1());

        // Linebreaks after Instructions
        c.setLinewrap(1).before(f.getInstructionRule());

        // Indentation for Instructions
//        c.setIndentationIncrement().before(f.getInstructionRule());
//        c.setIndentationDecrement().after(f.getInstructionRule());

        // Indentation { } for IF Instruction
        c.setIndentation(f.getIfAccess().getLeftCurlyBracketKeyword_5(), 
                         f.getIfAccess().getRightCurlyBracketKeyword_7());
        //c.setLinewrap().after(f.getIfAccess().getLeftCurlyBracketKeyword_5());
        c.setLinewrap().before(f.getIfAccess().getRightCurlyBracketKeyword_7());
        
        
        
        // No spae before ( for state and instructions
//        c.setNoSpace().before(f.getAbortAccess().getLeftParenthesisKeyword_2());
        c.setNoSpace().before(f.getEmitAccess().getLeftParenthesisKeyword_1());
        c.setNoSpace().before(f.getEmitAccess().getLeftParenthesisKeyword_3_0());
//        c.setNoSpace().before(f.getJoinAccess().getLeftParenthesisKeyword_2());
//        c.setNoSpace().before(f.getPauseAccess().getLeftParenthesisKeyword_2());
//        c.setNoSpace().before(f.getTermAccess().getLeftParenthesisKeyword_2());
//        c.setNoSpace().before(f.getHaltAccess().getLeftParenthesisKeyword_2());
        c.setNoSpace().before(f.getTransAccess().getLeftParenthesisKeyword_1());
        c.setNoSpace().before(f.getForkAccess().getLeftParenthesisKeyword_1());
        c.setNoSpace().before(f.getPrioAccess().getLeftParenthesisKeyword_1());
        
        // No space behind ( and before ) for state identifier and instruction
        c.setNoSpace().after(f.getProgramAccess().getLeftParenthesisKeyword_3());
        c.setNoSpace().before(f.getProgramAccess().getRightParenthesisKeyword_5());
        
        c.setNoSpace().after(f.getStateAccess().getLeftParenthesisKeyword_2());
        c.setNoSpace().before(f.getStateAccess().getRightParenthesisKeyword_4());
        
//        c.setNoSpace().after(f.getPauseAccess().getLeftParenthesisKeyword_2());
//        c.setNoSpace().before(f.getPauseAccess().getRightParenthesisKeyword_4());

        c.setNoSpace().after(f.getEmitAccess().getLeftParenthesisKeyword_1());
        c.setNoSpace().after(f.getEmitAccess().getLeftParenthesisKeyword_3_0());
        c.setNoSpace().before(f.getEmitAccess().getRightParenthesisKeyword_3_2());
        c.setNoSpace().before(f.getEmitAccess().getRightParenthesisKeyword_5());

        c.setNoSpace().after(f.getIfAccess().getLeftParenthesisKeyword_1());
        c.setNoSpace().before(f.getIfAccess().getRightParenthesisKeyword_4());

//        c.setNoSpace().after(f.getJoinAccess().getLeftParenthesisKeyword_2());
//        c.setNoSpace().before(f.getJoinAccess().getRightParenthesisKeyword_4());
//
//        c.setNoSpace().after(f.getTermAccess().getLeftParenthesisKeyword_2());
//        c.setNoSpace().before(f.getTermAccess().getRightParenthesisKeyword_4());

//        c.setNoSpace().after(f.getHaltAccess().getLeftParenthesisKeyword_2());
//        c.setNoSpace().before(f.getHaltAccess().getRightParenthesisKeyword_4());

        c.setNoSpace().after(f.getTransAccess().getLeftParenthesisKeyword_1());
        c.setNoSpace().before(f.getTransAccess().getRightParenthesisKeyword_3());


        c.setNoSpace().after(f.getForkAccess().getLeftParenthesisKeyword_1());
        c.setNoSpace().before(f.getForkAccess().getRightParenthesisKeyword_5());
        c.setNoSpace().before(f.getForkAccess().getCommaKeyword_3());

        // No space before ; separating instructions
        c.setNoSpace().before(f.getStateAccess().getSemicolonKeyword_7_1());
        c.setNoSpace().before(f.getIfAccess().getSemicolonKeyword_6_1());
        
        // No space in prio instructions
        c.setNoSpace().after(f.getPrioAccess().getLeftParenthesisKeyword_1());
        c.setNoSpace().before(f.getPrioAccess().getRightParenthesisKeyword_4());

        /*
         * DECLARATIONS
         */
        c.setNoSpace().before(f.getDeclarationAccess().getSemicolonKeyword_4());
    
    }
}
