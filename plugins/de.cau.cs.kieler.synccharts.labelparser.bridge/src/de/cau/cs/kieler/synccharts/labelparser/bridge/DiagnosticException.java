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
 * 
 */
package de.cau.cs.kieler.synccharts.labelparser.bridge;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

import de.cau.cs.kieler.core.KielerModelException;

/**
 * A KielerModelException that also contains Diagnostic information. A
 * Diagnostic Object may contain additional information about errors. For
 * Example Xtext creates Diagnostics at parse errors. This might be used to
 * determine concrete causes of errors
 * 
 * @author haf
 * 
 */
public class DiagnosticException extends KielerModelException {

    /**
     * Generated UID, suggested by Eclipse but no Idea what it's good for.
     */
    private static final long serialVersionUID = -6817110138240011322L;

    private List<Diagnostic> myDiagnostics;

    /**
     * Main Constructor.
     * 
     * @param message
     *            An error message to be displayed.
     * @param thecausingModelObject
     *            The model object that has caused the exception.
     * @param diagnostics
     *            A List of Diagnostic objects to be attached to the exception.
     */
    public DiagnosticException(final String message, final Object thecausingModelObject,
            final List<Diagnostic> diagnostics) {
        super(message, thecausingModelObject);
        this.myDiagnostics = diagnostics;
    }

    /**
     * @return the List of Diagnostic elements contained by this Exception.
     */
    public List<Diagnostic> getDiagnostics() {
        return myDiagnostics;
    }

}
