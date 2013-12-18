/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 
/**
  * Annotation extensions for the timing display in SCCharts.
  * 
  * @author ima
  * @kieler.design
  * @kieler.rating
  */
package de.cau.cs.kieler.sccharts.tsccharts.annotation.extensions

import static extension de.cau.cs.kieler.core.annotations.AnnotationsUtil.*
import de.cau.cs.kieler.core.annotations.Annotatable
import de.cau.cs.kieler.core.annotations.AnnotationsFactory

class TSCChartsAnnotationExtension {
    /*
 * Retrieves the annotated flat WCRT (without timing for children(regions: child regions) value of this 
 * Element. Returns null, if no such Annotation exists.
 */
    def Integer getTimeFlat(Annotatable annotatable) {
        val String key = "TimeFlat";
        var Integer annotatedValue = annotatable.getInt(key);
        return annotatedValue;
    }

    /*
 * Sets the annotated flat (without timing for children) WCRT value of this element.
 */
    def setTimeFlat(Annotatable annotatable, Integer value) {
        val tFlat = AnnotationsFactory::eINSTANCE.createIntAnnotation;
        tFlat.name = "TimeFlat";
        annotatable.annotations.add(tFlat);
    }

    /*
 * Retrieves the annotated hierarchical WCRT (with timing for children(regions: child regions) value of 
 * this Element. Returns null, if no such Annotation exists.
 */
    def Integer getTimeHierachical(Annotatable annotatable) {
        val String key = "TimeHierarchical";
        var Integer annotatedValue = annotatable.getInt(key);
        return annotatedValue;
    }

    /*
 * Sets the annotated hierarchical (with timing for children) WCRT value of this element.
 */
    def setTimeHierarchical(Annotatable annotatable, Integer value) {
        val tDeep = AnnotationsFactory::eINSTANCE.createIntAnnotation;
        tDeep.name = "TimeHierarchical";
        annotatable.annotations.add(tDeep);
    }

    /*
 * Retrieves the timing domain Annotation (The execution time for this element will be added to this 
 * domain)
 */
    def String getTimeDomain(Annotatable annotatable) {
        val String key = "TimeDomain";
        var String annotatedValue = annotatable.getString(key);
        return annotatedValue;
    }

    /*
 * Sets the timing domain Annotation
 */
    def setTimeDomain(Annotatable annotatable, String tag) {
        val tDomain = AnnotationsFactory::eINSTANCE.createIntAnnotation;
        tDomain.name = "TimeDomain";
        annotatable.annotations.add(tDomain);
    }

}
