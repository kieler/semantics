/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
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
package de.cau.cs.kieler.kev;

import org.eclipse.osgi.util.NLS;

/**
 * A data storage class for messages used by the KEV-plugin. 
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * 
 */
public final class Messages extends NLS {
    
    /**
     * The name of the this package.
     */
    public static final String BUNDLE_NAME = "de.cau.cs.kieler.kev.messages"; //$NON-NLS-1$
    
    /** ID of the extension point. */
    public static String extensionPointID;
    /** The name of the view. */
    public static String ViewTitle;

    // Actions
    /** The name of the open file wizard action. */
    public static String ActionOpenFileWizard;
    /** The hint for the open file wizard. */
    public static String ActionHintOpenFileWizard;
    /** The name of the refresh action. */
    public static String ActionRefresh;
    /** The hint displayed for the refresh action. */
    public static String ActionHintRefresh;

    // Discriptions
    /** The discription for the open image wizard. */
    public static String DiscriptionOpenImageWizard;

    // Messages
    public static String MessageOpenImageWizard;

    // Titles
    public static String TitleOpenImageWizard;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
