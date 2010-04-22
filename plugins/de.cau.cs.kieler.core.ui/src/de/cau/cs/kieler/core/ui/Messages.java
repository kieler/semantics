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
package de.cau.cs.kieler.core.ui;

import org.eclipse.osgi.util.NLS;

/**
 * Messages class for internationalization.
 *
 * @author msp
 */
public final class Messages extends NLS {
    
    private static final String BUNDLE_NAME
            = "de.cau.cs.kieler.core.ui.messages"; //$NON-NLS-1$

    // CHECKSTYLEOFF JavadocVariable
    // CHECKSTYLEOFF VisibilityModifier
    // CHECKSTYLEOFF StaticVariableName
    public static String GenericErrorHandler_OutOfMemoryError;
    public static String GenericErrorHandler_StackOverflowError;
    public static String GenericErrorHandler_VirtualMachineError;
    public static String GenericErrorHandler_SWTError;
    public static String GenericErrorHandler_FatalError;
    public static String GenericErrorHandler_FatalRecursiveError;
    public static String GenericErrorHandler_FatalErrorTitle;
    public static String GenericErrorHandler_ExceptionHandled;
    public static String GenericErrorHandler_InternalErrorNoArg;
    public static String GenericErrorHandler_InternalErrorOneArg;
    public static String ModelErrorHandler_MarkerError;
    public static String ModelErrorHandler_MarkerCreationError;
    public static String DoubleFieldEditor_doubleBounds;
    public static String ExperimentalDialog_experimentalFeature;
    public static String ExperimentalDialog_regarded;
    public static String ExperimentalDialog_using;
    public static String ExperimentalDialog_Warning;
    public static String TextViewer_2;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
    
}
