/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.klighd.scg;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import de.cau.cs.kieler.core.kivi.AbstractCombination;

import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.effects.KlighdCloseDiagramEffect;
import de.cau.cs.kieler.klighd.effects.KlighdDiagramEffect;
import de.cau.cs.kieler.klighd.effects.KlighdUpdateDiagramEffect;
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy;
// SUPPRESS CHECKSTYLE NEXT LineLength
import de.cau.cs.kieler.klighd.xtext.triggers.XtextBasedEditorActivationChangeTrigger.XtextModelChangeState;
// SUPPRESS CHECKSTYLE NEXT LineLength
import de.cau.cs.kieler.klighd.xtext.triggers.XtextBasedEditorActivationChangeTrigger.XtextModelChangeState.EventType;

/**
 * 
 * Combination to trigger SCG drawing effect.
 * 
 * @author ssm
 *
 */

public class SCGDiagramSynthesisCombination extends AbstractCombination {

    /**
     * The execute method revealed and invoked by KIVi.
     * 
     * @param state
     *            A {@link de.cau.cs.kieler.core.kivi.ITriggerState} carrying the necessary
     *            information.
     */
    public void execute(final XtextModelChangeState state) {
        String id = state.getEditorInputPath().toPortableString().replace(":", "");
          // the replacement is needed since the secondary view ids seem to be required
          //  to be free of ':', which will be violated on windows determining them this way. 
        
        // Don't show SCG's of sequential SCL's.
        if (id.contains(".tick.scl")) { return; }
        
        if (state.getEventType().equals(EventType.CLOSED)) {
            this.schedule(new KlighdCloseDiagramEffect(id));
        } else {
            XtextResource resource = state.getResource();
            if (resource == null || IterableExtensions.isNullOrEmpty(resource.getContents())) {
                return;
            }
            KlighdDiagramEffect e = new KlighdUpdateDiagramEffect(id, state.getEditorInputPath().lastSegment(),
                    resource.getContents().get(0), state.getEditor());
            e.setProperty(LightDiagramServices.REQUESTED_UPDATE_STRATEGY, SimpleUpdateStrategy.ID);

            this.schedule(e);
        }
    }
}
