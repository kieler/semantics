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
package de.cau.cs.kieler.kicool.formatting

import de.cau.cs.kieler.kicool.formatting.KiCoolFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig

/**
 * @author ssm
 * @kieler.design 2017-06-15 proposed
 * @kieler.rating 2017-06-15 proposed yellow 
 */
class KiCoolFormatterX extends KiCoolFormatter {
    
    override configureFormatting(FormattingConfig c) {
        super.configureFormatting(c)
        val f = getGrammarAccess() as de.cau.cs.kieler.kicool.services.KiCoolGrammarAccess
        
//        c.setLinewrap().before(f.getSystemAccess().getMetricsMetricParserRuleCall_7_0());
    }
    
}