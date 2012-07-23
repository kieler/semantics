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
package de.cau.cs.kieler.synccharts.synchronizer.diff;

import org.eclipse.emf.compare.diff.engine.GenericDiffEngine;
import org.eclipse.emf.compare.diff.engine.check.AttributesCheck;
import org.eclipse.emf.compare.diff.engine.check.ReferencesCheck;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class KitsDiffEngine extends GenericDiffEngine {

    /**
     * {@inheritDoc}
     */
    protected AttributesCheck getAttributesChecker() {
        return new KitsAttributesCheck((EcoreUtil.CrossReferencer) this.matchCrossReferencer);
    }
    
    protected ReferencesCheck getReferencesChecker() {
        return new KitsReferencesCheck(matchCrossReferencer);
    }


}
