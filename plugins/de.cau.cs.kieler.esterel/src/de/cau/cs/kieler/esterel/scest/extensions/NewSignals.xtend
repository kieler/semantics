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
package de.cau.cs.kieler.esterel.scest.extensions

import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * This class contains all new valued objects which are needed to transform valued signals.
 * 
 * EXAMPLE TRANSFORMATION:
 * 
 * signal s := s_init : combine TYPE with f in
 *      p
 * end
 * 
 * ==>
 * 
 *  {    bool s, s_set, term;
 *       TYPE s_cur, s_val = s_init;
 *       fork
 *          l: 
 *           s = false; 
 *           s_set = false;
 *           if (!s_set) 
 *              s_cur = f_neutral;
 *           if (s) 
 *              s_val = s_cur;
 *            if (!term) { 
 *              pause; 
 *              goto l 
 *           }
 *       par
 *           p; 
 *           term = true
 *       join
 *   }
 * 
 * For 'f' == '+' the neutral element 'f_neutral' is 0.
 * 
 * @author mrb
 *
 */
class NewSignals {
    
    var ValuedObject s
    var ValuedObject s_set
    var ValuedObject s_cur
    var ValuedObject s_val
    
    new (ValuedObject s, ValuedObject s_set, ValuedObject s_cur, ValuedObject s_val) {
        this.s = s
        this.s_set = s_set
        this.s_cur = s_cur
        this.s_val = s_val
    }
    
    new (ValuedObject s) {
        this.s = s
    }
    
    def getS() {
        s
    }
    
    def getS_set() {
        s_set
    }
    
    def getS_cur() {
        s_cur
    }
    
    def getS_val() {
        s_val
    }
    
    def setS(ValuedObject temp) {
        s = temp
    }
    
    def setS_set(ValuedObject temp) {
        s_set = temp
    }
    
    def setS_cur(ValuedObject temp) {
        s_cur = temp
    }
    
    def setS_val(ValuedObject temp) {
        s_val = temp
    }
}