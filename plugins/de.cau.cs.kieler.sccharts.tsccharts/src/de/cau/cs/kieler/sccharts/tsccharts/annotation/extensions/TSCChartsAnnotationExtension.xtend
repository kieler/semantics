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
        tFlat.setValue(value);
        annotatable.annotations.add(tFlat);
    }

    /*
 * Adds the given value to the flat WCRT value of the annotatable. If no according annotation is present,
 * a new annotation with the given value is created.
 */
    def addToTimeFlat(Annotatable annotatable, Integer value) {
        val String key = "TimeFlat";
        var Integer annotatedValue = annotatable.getInt(key);
        var Integer newValue;
        if (annotatedValue == null) {
            newValue = value;
        } else {
            newValue = value + annotatedValue;
        }
        setTimeFlat(annotatable, newValue);
    }

    /*
 * Retrieves the annotated hierarchical WCRT (with timing for children(regions: child regions) value of 
 * this Element. Returns null, if no such Annotation exists.
 */
    def Integer getTimeHierarchical(Annotatable annotatable) {
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
        tDeep.setValue(value);
        annotatable.annotations.add(tDeep);
    }

    /*
 * Adds the given value to the hierarchical WCRT value of the annotatable. If no according annotation is present,
 * a new annotation with the given value is created.
 */
    def addToTimeHierarchical(Annotatable annotatable, Integer value) {
        val String key = "TimeHierarchical";
        var Integer annotatedValue = annotatable.getInt(key);
        var Integer newValue;
        if (annotatedValue == null) {
            newValue = value;
        } else {
            newValue = value + annotatedValue;
        }
        setTimeHierarchical(annotatable, newValue);
    }

    /*
 * Retrieves the timing domain Annotation (The execution time for this element will be added to this 
 * domain)
 */
    def Integer getTimeDomainFlat(Annotatable annotatable) {
        val String key = "TimeDomainFlat";
        var Integer annotatedValue = annotatable.getInt(key);
        return annotatedValue;
    }

    /*
 * Sets the timing domain Annotation
 */
    def setTimeDomainFlat(Annotatable annotatable, Integer tag) {
        val tDomain = AnnotationsFactory::eINSTANCE.createIntAnnotation;
        tDomain.name = "TimeDomainFlat";
        tDomain.setValue(tag);
        annotatable.annotations.add(tDomain);
    }

  /*
 * Retrieves the timing domain Annotation (The execution time for this element will be added to this 
 * domain)
 */
    def Integer getTimeDomainHierarchical(Annotatable annotatable) {
        val String key = "TimeDomainFlat";
        var Integer annotatedValue = annotatable.getInt(key);
        return annotatedValue;
    }

    /*
 * Sets the timing domain Annotation
 */
    def setTimeDomainHierarchical(Annotatable annotatable, Integer tag) {
        val tDomain = AnnotationsFactory::eINSTANCE.createIntAnnotation;
        tDomain.name = "TimeDomainFlat";
        tDomain.setValue(tag);
        annotatable.annotations.add(tDomain);
    }

}
