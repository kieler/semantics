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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.ISelection;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;

import com.google.inject.Injector;

import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.yakindu.sccharts.importer.xtend.KIXS2SCC;

/**
 * The handler to register the contect menu action for transforming KIXS files into SCC files.
 * 
 * @author cmot
 * @kieler.design 2013-06-06 proposed cmot
 * @kieler.rating 2013-06-06 proposed yellow
 */
public class KixsModelFileHandler extends AbstractModelFileHandler {

        /** The injector. */
        private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();

        /** The Constant TRANSFORMATIONCOMMAND. */
        public static final String TRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.importer.KIXS2SCCTransformation";

        // -------------------------------------------------------------------------
        
        /**
         * Instantiates a new kixs model file handler.
         */
        public KixsModelFileHandler() {
            // Nothig to do for the constructor
        }

        // -------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public String ModelHandlerFileExtension() {
                return "kixs";
        }

        // -------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public String ModelHandlerFileExtensionTransformed() {
                return "scc";
        }

        // -------------------------------------------------------------------------
        
        /**
         * {@inheritDoc}
         */
        public String ModelHandlerDiagramEditorID() {
           // Surprisingly the following Yakindu-Statechart editor ID is used instead
           // of "de.cau.cs.kieler.yakindu.sccharts.ui.editor.SCChartsDiagramEditor".
           // Yakindu figures out which concrete derived editor to load.
           return StatechartDiagramEditor.ID;
        }

        // -------------------------------------------------------------------------
        
        /**
         * {@inheritDoc}
         */
        public PreferencesHint ModelHandlerDiagramPreferencesHint() {
                return new PreferencesHint("");
        }

        // -------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public boolean ModelHandlerCreateDiagram() {
                return true;
        }

        // -------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public boolean ModelHandlerOpenEditor() {
                return true;
        }

        // -------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public Injector CreateResourceInjector() {
            return injector;
        }

        // -------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        @Override
        public Object doTransformation(EObject modelObject,
                        String commandString, ISelection selection) {
                if (commandString.equals(TRANSFORMATIONCOMMAND)) {
                    EObject transformed = (new KIXS2SCC())
                                    .transform((Region) modelObject);
                    EcoreUtil.resolveAll(transformed);
                    return transformed;
                }

                return null;
        }

        // -------------------------------------------------------------------------

        /**
         * {@inheritDoc}
         */
        public void doPostProcessing(EObject modelObject) {
            // No post processing
        }

        // -------------------------------------------------------------------------
}