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
 * A view displaying a simple browser to the new ticket inside the KIELER trac
 * system. This is a temporary solution at best since external bug report
 * tickets are not allowed. There is also a better solution using one of the
 * bugtracker connectors provided by eclipse however I couldn't get any of those
 * to work yet.
 * 
 * @author soh
 * @kieler.rating 2010-06-14 proposed yellow soh
 */
public class BugReportView extends ViewPart {

    /** The url to the new ticket page. */
    // SUPPRESS CHECKSTYLE NEXT LineLength
    private static final String TRAC_URL = "http://rtsys.informatik.uni-kiel.de/trac/kieler/newticket"; //$NON-NLS-1$

    /** The ID of this view. */
    public static final String ID = "de.cau.cs.kieler.core.ui.bugReportView"; //$NON-NLS-1$

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
