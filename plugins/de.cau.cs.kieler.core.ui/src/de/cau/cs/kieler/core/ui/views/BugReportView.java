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
package de.cau.cs.kieler.core.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * @author soh
 */
public class BugReportView extends ViewPart {

    /** The url to the new ticket page. */
    private static final String TRAC_URL = "http://rtsys.informatik.uni-kiel.de/trac/kieler/newticket";

    /** The ID of this view. */
    public static final String ID = "de.cau.cs.kieler.core.ui.bugReportView";

    /**
     * {@inheritDoc}
     */
    @Override
    public void createPartControl(final Composite parent) {
        Browser browser = new Browser(parent, SWT.MOZILLA);
        browser.setUrl(TRAC_URL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFocus() {
    }

}
