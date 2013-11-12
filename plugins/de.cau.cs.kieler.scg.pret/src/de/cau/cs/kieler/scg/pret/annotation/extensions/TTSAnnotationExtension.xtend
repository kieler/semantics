/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.pret.annotation.extensions

import static extension de.cau.cs.kieler.core.annotations.AnnotationsUtil.*
import java.util.List
import de.cau.cs.kieler.core.annotations.Annotatable
import de.cau.cs.kieler.core.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.annotations.ReferenceAnnotation
import org.eclipse.emf.ecore.EObject

/**
 * Dedicated annotation extensions for the Time Triggered Scheduling.
 * 
 * @author ima
 * @kieler.design 
 * @kieler.rating 
 */
class TTSAnnotationExtension {
    
    // -------------------------------------------------------------------------
    /* Retrieves the value of the local WCET (how long does this element need at most 
   * to be processed) annotation of an annotatable. Returns null, if no such annotation
   * exists */
    def Integer getLocalWCET(Annotatable annotatable) {
        val String key = "LocalWCET";
        var Integer annotatedValue = annotatable.getInt(key);
        if (annotatedValue != null) {
            return annotatedValue;
        } else
            return null;
    }

    /* Sets the value of the local WCET (WCET of a single SCG element) annotation. */
    def setLocalWCET(Annotatable annotatable, Integer value) {
        val lWcet = AnnotationsFactory::eINSTANCE.createIntAnnotation;
        lWcet.name = "LocalWCET";
        annotatable.annotations.add(lWcet);
    }

    /* Retrieves the WCET annotation value (WCET up to this point). Returns null if 
   * no such annotation exists. */
    def Integer getWCET(Annotatable annotatable) {
        val String key = "WCET";
        var Integer annotatedValue = annotatable.getInt(key);
        if (annotatedValue != null) {
            return annotatedValue;
        } else
            return null;
    }

    /* Sets the WCET annotation value (WCET up to this point.)*/
    def setWCET(Annotatable annotatable, Integer value) {
        val wcet = AnnotationsFactory::eINSTANCE.createIntAnnotation;
        wcet.name = "WCET";
        annotatable.annotations.add(wcet);
    }

    /* Retrieves the Offset value (how much padding time has been used
   * up to this point?). Returns null, if no such annotation exists. */
    def Integer getOffset(Annotatable annotatable) {
        val String key = "Offset";
        var Integer annotatedValue = annotatable.getInt(key);
        if (annotatedValue != null) {
            return annotatedValue;
        } else
            return null;
    }

    /* Sets the Offset value (how much timing padding up to this point?). */
    def setOffset(Annotatable annotatable, Integer value) {
        val offset = AnnotationsFactory::eINSTANCE.createIntAnnotation;
        offset.name = "Offset";
        annotatable.annotations.add(offset);
    }

    /* Retrieves the Branching Vector, which is used for bookkeeping on threads (then = true,
   * else = false) and their position in the forking tree.
   */
    def List<Boolean> getBranchVec(Annotatable annotatable) {
        var List<Boolean> retList = null;
        val String key = "BranchVec";
        val annotation = annotatable.getAnnotation(key);
        if ((annotation != null) && (annotation instanceof ReferenceAnnotation)) {
            val object = (annotation as ReferenceAnnotation).getObject();
            if (object instanceof List<?>) {
                try {
                    retList = (object as List<Boolean>);
                } catch (ClassCastException e) {
                    System.out.println("Branchvector corrupted (wrong list element type)" + e.getMessage());

                    // if the list is not of Boolean type, return null
                    return null;
                }
            }
        }
        return retList;
    }

    /* Sets the Branching Vector (Bookkeeping of branch position in ancestor tree) to
   * branchVec. 
   */
    def setBranchvec(Annotatable annotatable, List<Boolean> branchVec) {
        val refAnn = AnnotationsFactory::eINSTANCE.createReferenceAnnotation;
        refAnn.name = "BranchVec";
        refAnn.setObject(branchVec as EObject);
        annotatable.annotations.add(refAnn);
    }

    /* Adds a new branch value (then (true) or else (false)) to the Branch Vector. */
    def addToBranchvec(Annotatable annotatable, Boolean branch) {
        val String key = "BranchVec";
        val annotation = annotatable.getAnnotation(key);
        if ((annotation != null) && (annotation instanceof ReferenceAnnotation)) {
            val object = (annotation as ReferenceAnnotation).getObject();
            if (object instanceof List<?>) {
                try {
                    var branchVec = (object as List<Boolean>);
                    branchVec.add(branch);
                } catch (ClassCastException e) {
                    System.out.println(
                        "Branchvector corrupted (wrong list element type).
                                           Branchvector has not been updated
                                           for Element:" + e.getMessage() + annotatable.toString());
                    }
                }
            }
        } 
        // -------------------------------------------------------------------------   
    }
    