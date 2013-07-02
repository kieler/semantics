/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.sccharts.importer.handler;

/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.yakindu.sccharts.importer.xtend.KIXS2SCC;

/**
 * The handler to register the context menu action for transforming KIXS files into SCC files.
 * 
 * @author cmot
 * @kieler.design 2013-06-06 proposed cmot
 * @kieler.rating 2013-06-06 proposed yellow
 */
public class KixsModelFileHandler extends AbstractConvertModelHandler {

    /** The injector. */
    private static Injector injector = new STextStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    /** The Constant TRANSFORMATIONCOMMAND. */
    public static final String TRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.importer.KIXS2SCCTransformation";

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected String getDiagramEditorID() {
        // Surprisingly the following Yakindu-Statechart editor ID is used instead
        // of "de.cau.cs.kieler.yakindu.sccharts.ui.editor.SCChartsDiagramEditor".
        // Yakindu figures out which concrete derived editor to load.
        return StatechartDiagramEditor.ID;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected boolean doOpenEditor(final Object modelObject, final ExecutionEvent event,
            final ISelection selection) {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void doPostProcessing(EObject modelObject) {
        // No post processing
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension() {
        return "scc";
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
            EObject transformed = (new KIXS2SCC()).transform((Region) model);
            EcoreUtil.resolveAll(transformed);
            return transformed;
        }

        return null;
    }

    // -------------------------------------------------------------------------
}
