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
package de.cau.cs.kieler.scl.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.yakindu.sct.model.stext.STextStandaloneSetup;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.scl.kaom.xtend.SCL2KAOMTransformation;
import de.cau.cs.kieler.scl.scl.Program;

/**
 * The handler to transform SCL code into KAOM netlists.
 * 
 * @author cmot
 * @kieler.design 2013-07-01 proposed cmot
 * @kieler.rating 2013-07-01 proposed yellow
 */

public class SCLModelFileHandler extends AbstractConvertModelHandler {

    /** The injector. */
    private static Injector injector = new STextStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    /** The Constant TRANSFORMATIONCOMMAND. */
    public static final String TRANSFORMATIONCOMMAND = "de.cau.cs.kieler.scl.SCL2KAOMTransformation";

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected String getDiagramEditorID() {
        return "de.cau.cs.kieler.kaom.diagram.part.KaomDiagramEditorID";
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected boolean doOpenEditor(final Object modelObject, final ExecutionEvent event,
            final ISelection selection) {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension() {
        return "kaom";
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        return injector;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = event.getCommand().getId().toString();
        if (commandString.equals(TRANSFORMATIONCOMMAND)) {
            EObject transformed = (new SCL2KAOMTransformation()).transform((Program) model);
            EcoreUtil.resolveAll(transformed);
            return transformed;
        }

        return null;
    }

    // -------------------------------------------------------------------------

}
