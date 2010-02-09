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
package de.cau.cs.kieler.sim.kiem.automated.extension;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.ui.menus.AbstractContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

import de.cau.cs.kieler.sim.kiem.IKiemToolbarContributor;
import de.cau.cs.kieler.sim.kiem.automated.execution.AutomationManager;
import de.cau.cs.kieler.sim.kiem.automated.ui.AutomatedExecutionButton;
import de.cau.cs.kieler.sim.kiem.automated.ui.ClearViewButton;

/**
 * The toolbar contributor is responsible for providing the button that is added
 * to the toolbar of the KIEM. It also creates the button that is added to the
 * toolbar of the view.
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public class ToolbarContributor extends AbstractContributionFactory implements
        IKiemToolbarContributor {

    /** The automated execution button. */
    private AutomatedExecutionButton button;

    // --------------------------------------------------------------------------

    /**
     * Creates a new ToolbarContributor.
     */
    public ToolbarContributor() {
        super("toolbar:de.cau.cs.kieler.sim.kiem.automated.aebView",
                "de.cau.cs.kieler.sim.kiem.automated");
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public ControlContribution[] provideToolbarContributions(final Object info) {
        // for the extension point in the KIEM
        ControlContribution[] result = new ControlContribution[1];
        if (button == null) {
            button = new AutomatedExecutionButton("AutomatedExecutionButton0");
        }
        result[0] = button;
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
        additions.addContributionItem(AutomationManager.getInstance()
                .getStepTextField(), null);
        additions.addContributionItem(new ClearViewButton("ClearViewButton1"),
                null);
        additions.addContributionItem(new AutomatedExecutionButton(
                "AutomatedExecutionButton1"), null);
    }
}
