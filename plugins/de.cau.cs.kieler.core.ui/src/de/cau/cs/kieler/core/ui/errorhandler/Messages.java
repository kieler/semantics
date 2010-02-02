package de.cau.cs.kieler.core.ui.errorhandler;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "de.cau.cs.kieler.core.ui.errorhandler.messages"; //$NON-NLS-1$
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
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
