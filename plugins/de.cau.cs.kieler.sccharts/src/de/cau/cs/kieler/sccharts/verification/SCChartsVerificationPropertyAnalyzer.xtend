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
package de.cau.cs.kieler.sccharts.verification

import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.sccharts.SCCharts
import java.util.List
import java.util.Optional

/** 
 * @author aas
 */
class SCChartsVerificationPropertyAnalyzer {
    public static val INVARIANT_ANNOTATION_NAME = "Invariant"
    public static val CTL_ANNOTATION_NAME = "CTL"
    public static val LTL_ANNOTATION_NAME = "LTL"
    
    public def List<VerificationProperty> getVerificationProperties(SCCharts model) {
        val properties = <VerificationProperty>newArrayList
        model.eAllContents.filter(StringAnnotation).forEach [ anno |
            getVerificationProperty(anno).ifPresent [ property | 
                properties.add(property)
            ]
        ]
        return properties
    }
    
    private def Optional<VerificationProperty> getVerificationProperty(StringAnnotation anno) {
        val propertyFormula = anno.values.getIfExists(0)
        val propertyName = anno.values.getIfExists(1)
        val propertyType = 
            switch(anno.name) {
                case INVARIANT_ANNOTATION_NAME : VerificationPropertyType.INVARIANT
                case CTL_ANNOTATION_NAME : VerificationPropertyType.CTL
                case LTL_ANNOTATION_NAME : VerificationPropertyType.LTL
            }
        if(propertyFormula !== null && propertyType !== null) {
            return Optional.of(new VerificationProperty(propertyName, propertyFormula, propertyType))
        } else {
            return Optional.empty
        }
    }
    
    private def <T> getIfExists(List<T> list, int index) {
        if(list === null || list.size <= index) {
            return null
        } else {
            return list.get(index)    
        } 
    }
}
