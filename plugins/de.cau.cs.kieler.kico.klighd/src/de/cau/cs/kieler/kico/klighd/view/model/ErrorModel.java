/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.view.model;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.util.StringInputStream;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.krendering.Colors;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KGridPlacementData;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.Trigger;
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.core.krendering.extensions.PositionReferenceX;
import de.cau.cs.kieler.core.krendering.extensions.PositionReferenceY;
import de.cau.cs.kieler.kico.klighd.view.model.action.ShowExceptionAction;

/**
 * Represents errors and exceptions. Displayed as error message with a huge error sign.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class ErrorModel extends MessageModel {

    /** Synthesis Extension. */
    private static final KContainerRenderingExtensions KCRE =
            Guice.createInjector().getInstance(KContainerRenderingExtensions.class);
    private static final KRenderingExtensions KRE =
            Guice.createInjector().getInstance(KRenderingExtensions.class);

    /** The error stack trace. */
    protected final String stacktrace;

    /**
     * Constructs an error model given message.
     * 
     * @param message
     *            error message
     */
    public ErrorModel(final String message) {
        this(message, "Unkown", null);
    }

    /**
     * Constructs an error model given message and details.
     * 
     * @param message
     *            error message
     * @param reason
     *            the reason
     * @param stacktrace
     *            the stacktrace
     */
    public ErrorModel(final String message, final String reason, final String stacktrace) {
        super(message, reason, "de.cau.cs.kieler.kico.klighd", "icons/full/model/error_sign.png", 250);
        // reason
        String reasonToSet = "Unkown";
        if (reason == null) {
            // Parse reason from stacktrace
            if (stacktrace != null && !stacktrace.isEmpty()) {
                int newline = stacktrace.indexOf('\n');
                int startReason = stacktrace.indexOf(':');
                if (newline != -1) {
                    if (startReason != -1 && startReason + 2 < newline) {
                        reasonToSet = stacktrace.substring(startReason + 2, newline);
                    } else {
                        reasonToSet = stacktrace.substring(0, newline);
                    }
                }
            }
        } else {
            reasonToSet = reason;
        }
        this.message = reasonToSet;
        // stacktrace
        String stacktraceToSet = stacktrace;
        // Fix newlines
        // TODO still not working under windows, maybe the error dialog is evil
        if (!Platform.getOS().equals(Platform.OS_WIN32)) {
            // Fix newlines
            String newline = System.getProperty("line.separator");
            if (newline != null) {
                stacktraceToSet = stacktrace.replaceAll("\n", newline);
            }
        }
        this.stacktrace = stacktraceToSet;
    }

    /**
     * Constructs an error model given message and exception.
     * 
     * @param message
     *            error message
     * @param exception
     */
    public ErrorModel(final String message, final Exception exception) {
        this(message, exception.getMessage(), getStackTraceString(exception));
    }

    // -- Utility Functions
    // -------------------------------------------------------------------------

    /**
     * Prints the stack trace of an Exception into String.
     * 
     * @param exception
     *            Exception
     * @return StackTrace as String
     */
    private final static String getStackTraceString(final Exception exception) {
        StringWriter traceReader = new StringWriter();
        exception.printStackTrace(new PrintWriter(traceReader));
        return traceReader.toString();
    }

    // -- Synthesis
    // -------------------------------------------------------------------------

    @Override
    public void customizeMessageSynthesis(final KContainerRendering parent) {
        // red title
        KRE.setForeground(parent.getChildren().get(0), Colors.RED);
        // link to exception if available
        if (stacktrace != null) {
            KText link = KCRE.addText(parent, "[Show Exception]");
            KRE.setForeground(link, Colors.BLUE);
            KRE.setFontSize(link, 9);
            KRE.addAction(link, Trigger.SINGLECLICK, ShowExceptionAction.ID);
            KRE.addAction(link, Trigger.DOUBLECLICK, ShowExceptionAction.ID);
            KGridPlacementData placementData = KRE.setGridPlacementData(link);
            KRE.from(placementData, PositionReferenceX.LEFT, 8, 0, PositionReferenceY.TOP, 4, 0);
            KRE.to(placementData, PositionReferenceX.RIGHT, 8, 0, PositionReferenceY.BOTTOM, 8, 0);
        }
    }

    // -- toString
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        String newline = System.getProperty("line.separator");
        
        if (title != null) {
            text.append(title);
            text.append(newline);
        }
        if (message != null) {
            text.append(message);
            text.append(newline);
        }
        if (stacktrace != null) {
            text.append(stacktrace);
        }
        
        return text.toString();
    }

    // -- Getters
    // -------------------------------------------------------------------------

    /**
     * @return the exception
     */
    public String getStackTrace() {
        return stacktrace;
    }

}
