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

import org.eclipse.emf.compare.diff.engine.IMatchManager;
import org.eclipse.emf.compare.diff.engine.check.AttributesCheck;
import org.eclipse.emf.ecore.EAttribute;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * A customized {@link AttributesCheck} that masks the 'label' of actions, e.g. for transitions.
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class KitsAttributesCheck extends AttributesCheck {

    /**
     * {@inheritDoc}.
     * @param manager a referencer
     */
    public KitsAttributesCheck(final IMatchManager manager) {
        super(manager);
}

    @Override
    protected boolean shouldBeIgnored(final EAttribute attribute) {
        if (SyncchartsPackage.eINSTANCE.getAction_Label().equals(attribute)) {
            return true;
        }
        return super.shouldBeIgnored(attribute);
    }

}
