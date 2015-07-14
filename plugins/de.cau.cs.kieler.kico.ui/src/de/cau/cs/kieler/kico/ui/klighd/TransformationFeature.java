/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.ui.klighd;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;

import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.features.Feature;
import de.cau.cs.kieler.kico.internal.Transformation;

/**
 * This is a wrapper class so that transformations can be used seamles as Features in the diagram
 * synth.
 * 
 * @author cmot
 * 
 */
public class TransformationFeature extends Feature {

    private Transformation transformation;

    // -------------------------------------------------------------------------

    public TransformationFeature(Transformation transformation) {
        this.transformation = transformation;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String getId() {
        return transformation.getId();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return transformation.getName();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the real transformation hidden behind this feature.
     * 
     * @return the transformation
     */
    public Transformation getTransformation() {
        return transformation;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the handling transformation which in this wrapper case is the transformation we wrap.
     * 
     * @return the handling transformation
     */
    public Set<Transformation> getExpandingTransformations() {
        return Sets.newHashSet(transformation);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the list of transformations that declare not being able to handle this feature.
     * 
     * @return the not handling transformations
     */
    public Set<Transformation> getNotHandlingTransformations(boolean ignoreInherited) {
        Feature linkedFeature = transformation.getExpandsFeature();
        HashSet<Transformation> returnSet = new HashSet<Transformation>();
        for (Transformation transformation : KielerCompiler.getTransformations()) {
            for (Feature transformationNotHandlingFeature : transformation
                    .getNotHandlesFeatures(ignoreInherited)) {
                if (transformationNotHandlingFeature == linkedFeature) {
                    returnSet.add(transformation);
                }
            }
        }
        return returnSet;
    }

}
