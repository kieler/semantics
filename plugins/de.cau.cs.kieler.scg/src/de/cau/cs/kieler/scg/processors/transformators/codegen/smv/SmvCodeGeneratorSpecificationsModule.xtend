/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.verification.VerificationProperty
import java.util.Comparator
import de.cau.cs.kieler.sccharts.verification.VerificationPropertyType

/**
 * @author aas
 * 
 */
class SmvCodeGeneratorSpecificationsModule extends SmvCodeGeneratorModuleBase {

    public static def String toSmvExpression(String kexpression) {
        return kexpression.replace("==", "=").replace("&&", "&").replace("||", "|")
                          .replace("false", "FALSE").replace("true", "TRUE")
    }
    
    override getName() {
        return class.simpleName;
    }

    override generateInit() {
    }
    
    override generate() {
        val verificationProperties = (parent as SmvCodeGeneratorModule).verificationProperties
        if(verificationProperties.isNullOrEmpty) {
            return
        }
        // In SMV the internal specifications are numbered CTL first then LTL, then invariants
        verificationProperties.sort(new SmvPropertyComparator())
        val indexMap = <VerificationProperty, Integer>newHashMap()
        var index = 0
        for(property : verificationProperties) {
            val specName = property.getSmvSpecName
            appendIndentedLine('''«specName»''')
            incIndentationLevel
            appendIndentedLine('''«property.formula.toSmvExpression»;''')
            decIndentationLevel
            indexMap.put(property, index)
            index++
        }
        processorInstance.environment.setProperty(Environment.INDEX_MAP_OF_SMV_SPECS, indexMap)
    }
    
    override generateDone() {
    }
    
    private def String getSmvSpecName(VerificationProperty property) {
        switch(property.type) {
            case INVARIANT : return "INVARSPEC"
            case LTL : return "LTLSPEC"
            case CTL : return "CTLSPEC"
            default : throw new Exception("Cannot translate VerificationProperty '"+property+"' to SMV code")
        }
    }
    
    private static class SmvPropertyComparator implements Comparator<VerificationProperty> {
        override compare(VerificationProperty o1, VerificationProperty o2) {
            if(o1.weight < o2.weight) {
                return -1
            } else if(o1.weight > o2.weight) {
                return 1
            } else {
                return 0    
            } 
        }
        
        private def int getWeight(VerificationProperty o) {
            // In NuSMV and nuXmv CTL specs come first, then LTL specs, and then invariants
            switch(o.type) {
                case VerificationPropertyType.CTL : return 0
                case VerificationPropertyType.LTL : return 1
                case VerificationPropertyType.INVARIANT : return 2
            }
        }
    }
}
