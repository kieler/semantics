/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.deprecated;

import de.cau.cs.kieler.core.annotations.Annotatable
import de.cau.cs.kieler.core.annotations.AnnotationsPackage
import de.cau.cs.kieler.core.annotations.BooleanAnnotation
import de.cau.cs.kieler.core.annotations.FloatAnnotation
import de.cau.cs.kieler.core.annotations.IntAnnotation
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.kgraph.KNode

import de.cau.cs.kieler.kiml.LayoutMetaDataService
import de.cau.cs.kieler.kiml.LayoutOptionData
import de.cau.cs.kieler.kiml.LayoutOptionData$Type
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout

/**
 * @author chsch
 */
class AnnotationsExtensions {
    
    private static val AnnotationsPackage annotationsPackage = AnnotationsPackage::eINSTANCE;

    /**
     * Helper transferring Annotations to shapes or the diagram.
     * 
     * @author chsch
     */
    def void transferAnnotationsOf(KNode node, Annotatable a) {
        val service = LayoutMetaDataService::instance;
        a.annotations.filter[!it.name.nullOrEmpty].forEach[
            val LayoutOptionData data =
                (service.getOptionData(it.name)?:
                service.getOptionDataBySuffix(it.name)) as LayoutOptionData;
            
            if (data != null) {
                node.getData(typeof(KShapeLayout)).setProperty(data, switch(it.eClass) {
                    case annotationsPackage.booleanAnnotation:
                      (it as BooleanAnnotation).value
                    case annotationsPackage.intAnnotation: {
                      val value = (it as IntAnnotation).value;
                      if (data.type == LayoutOptionData$Type::FLOAT) new Float(value) else value
                    }
                    case annotationsPackage.floatAnnotation:
                     (it as FloatAnnotation).value
                    case annotationsPackage.stringAnnotation:
                     data.parseValue((it as StringAnnotation).value)
                    default:
                     null
                });
            }
        ];
    }
    
}