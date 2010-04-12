/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kiem.automated.ui.extension;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.ui.menus.AbstractContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

import de.cau.cs.kieler.sim.kiem.IKiemToolbarContributor;
import de.cau.cs.kieler.sim.kiem.automated.ui.ui.OpenWizardAction;
import de.cau.cs.kieler.sim.kiem.automated.ui.views.AutomatedEvalView;

/**
 * The toolbar contributor is responsible for providing the wizardAction that is
 * added to the toolbar of the KIEM. It also creates the wizardAction that is
 * added to the toolbar of the view.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class ToolbarContributor extends AbstractContributionFactory implements
        IKiemToolbarContributor {

    /** The automated execution wizardAction. */
    private OpenWizardAction wizardAction;

    // --------------------------------------------------------------------------

    /**
     * Creates a new ToolbarContributor.
     */
    public ToolbarContributor() {
        super("toolbar:de.cau.cs.kieler.sim.kiem.automated.ui.aebView",
                "de.cau.cs.kieler.sim.kiem.automated");
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public ControlContribution[] provideToolbarContributions(final Object info) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Action[] provideToolbarActions(final Object info) {
        Action[] result = new Action[1];
        if (wizardAction == null) {
            wizardAction = new OpenWizardAction();
        }
        result[0] = wizardAction;
        return result;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void createContributionItems(final IServiceLocator serviceLocator,
            final IContributionRoot additions) {
        // for directly adding to the views toolbar
        additions.addContributionItem(AutomatedEvalView.getStepField(), null);
    }

}
