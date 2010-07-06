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
package de.cau.cs.kieler.s.codegen;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.internal.resources.File;

/**
 * @author soh
 */
public abstract class AbstractCodegenHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        if (event.getApplicationContext() instanceof EvaluationContext) {
            EvaluationContext ctx = (EvaluationContext) event
                    .getApplicationContext();
            Object defVar = ctx.getDefaultVariable();
            if (defVar instanceof List<?>) {
                List<?> list = (List<?>) defVar;

                if (!list.isEmpty() && list.get(0) instanceof File) {
                    createContext((File) list.get(0));
                    return null;
                }
            }
            createContext();
        }
        return null;
    }

    protected abstract void createContext(File selectedFile);

    protected abstract void createContext();
}
