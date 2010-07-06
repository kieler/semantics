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

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

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

    /**
     * Checks whether the selection consists of edit parts in files with the
     * model extension or files with the model extension.
     * 
     * @param evaluationContext
     *            the evaluation context
     */
    @Override
    @SuppressWarnings("restriction")
    public void setEnabled(final Object evaluationContext) {
        if (evaluationContext instanceof EvaluationContext) {
            EvaluationContext evalContext = (EvaluationContext) evaluationContext;

            // get list of selected files
            Object defVar = evalContext.getDefaultVariable();
            if (defVar instanceof Iterable<?>) {
                Iterable<?> iterable = (Iterable<?>) defVar;
                Iterator<?> iter = iterable.iterator();
                while (iter.hasNext()) {
                    Object o = iter.next();
                    IPath path = null;
                    if (o instanceof org.eclipse.core.internal.resources.File) {
                        // selection is an a file
                        path = ((org.eclipse.core.internal.resources.File) o)
                                .getFullPath();
                    } else if (o instanceof EditPart) {
                        EditPart editPart = (EditPart) o;
                        EObject eObj = ((View) editPart.getModel())
                                .getElement();
                        // no model element found for the edit part
                        if (eObj == null) {
                            super.setBaseEnabled(false);
                            return;
                        }
                        Resource res = eObj.eResource();
                        // edit part doesn't belong to a resource
                        if (res == null) {
                            super.setBaseEnabled(false);
                            return;
                        }
                        URI uri = res.getURI();
                        // set the path to the path of the file
                        path = Path.fromOSString(uri.toPlatformString(true));
                    }
                    // check if file has the model extension
                    if (path != null && path.getFileExtension().equals("s")) {
                        super.setBaseEnabled(true);
                        return;
                    }
                }
            }
        }
        super.setBaseEnabled(false);
    }
}
