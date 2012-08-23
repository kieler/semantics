/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.synchronizer.match;

import org.eclipse.emf.compare.match.engine.GenericMatchEngine;

/**
 * Customized {@link org.eclipse.emf.compare.match.engine.IMatchEngine IMatchEngine} registering
 * customized filter and checker.
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class KitsMatchEngine extends GenericMatchEngine {

//    private KitsSimilarityChecker checker = null;

    /**
     * Constructor.
     */
    public KitsMatchEngine() {
        super();
        this.filter = new KitsFilter();
    }

    /**
     * {@inheritDoc}
     */
    public void reset() {
        super.reset();
        this.filter = new KitsFilter();
    }

    // /**
    // * {@inheritDoc}
    // */
    // protected AbstractSimilarityChecker prepareChecker() {
    // return checker;
    // }
    //
    // /**
    // * {@inheritDoc}
    // */
    // public MatchModel contentMatch(EObject leftObject, EObject rightObject, Map<String, Object>
    // optionMap) {
    // checker = new KitsSimilarityChecker(filter, super.prepareChecker(), leftObject, rightObject);
    // return super.contentMatch(leftObject, rightObject, optionMap);
    // }

}
