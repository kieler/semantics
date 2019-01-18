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
package de.cau.cs.kieler.sccharts.processors.tabels

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.keffects.Effect
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author stu114663
 *
 */
abstract class TableBuilder implements ITableBuilder {
    @Inject 
    var ExpressionSerializer exprS
    @Inject 
    var EffectSerializer effeS
    
    static final String EFFECT_SPLITTER = ";"
    
    @Accessors
    SCCharts model
    @Accessors
    List<List<String>> table
    
    def String trigger2String(Expression trigger) {
        if (trigger !== null) {
            // TODO turn Expression to String
            return exprS.serialize(trigger).toString
        } else {
            return ""
        }
    }
    
    def String effects2String(List<Effect> effects) {
        if (!effects.nullOrEmpty) {
            val StringBuilder esb = new StringBuilder
            
            esb.append(effeS.serialize(effects.get(0)).toString)
            for (var int i = 1; i < effects.size; i++) {
                val effect = effects.get(i)
                esb.append(EFFECT_SPLITTER)
                esb.append(effeS.serialize(effect).toString)
        	}
        	
        	return esb.toString
        } else {
        	return ""
        }
    }
}