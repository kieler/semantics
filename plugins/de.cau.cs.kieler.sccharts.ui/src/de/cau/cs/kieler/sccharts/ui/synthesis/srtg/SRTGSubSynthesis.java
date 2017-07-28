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
package de.cau.cs.kieler.sccharts.ui.synthesis.srtg;

import org.eclipse.emf.ecore.EObject;


import de.cau.cs.kieler.klighd.kgraph.KGraphElement;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.sccharts.ui.synthesis.AbstractSubSynthesis;
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.ISynthesisHooks;

/**
 * Abstract class for partial syntheses, delegating helper methods.
 * 
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
public abstract class SRTGSubSynthesis<I extends EObject, O extends KGraphElement> 
    extends AbstractSubSynthesis<I, O>{

    protected ISynthesisHooks getHooks() {
        return null;
    }
}
