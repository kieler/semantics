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
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import com.google.inject.Injector;

import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.yakindu.sccharts.importer.xtend.KIXS2SCC;

public class KixsModelFileHandler extends AbstractModelFileHandler {

        private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();

        public static final String TRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.importer.KIXS2SCCTransformation";

        public KixsModelFileHandler() {
        }

        public String ModelHandlerFileExtension() {
                return "kixs";
        }

        public String ModelHandlerFileExtensionTransformed() {
                return "scc";
        }

        public String ModelHandlerDiagramEditorID() {
                return "de.cau.cs.kieler.yakindu.sccharts.ui.editor.SCChartsDiagramEditor";
        }

        public PreferencesHint ModelHandlerDiagramPreferencesHint() {
                return new PreferencesHint("");
        }

        public boolean ModelHandlerCreateDiagram() {
                return false;
        }

        public boolean ModelHandlerOpenEditor() {
                return false;
        }

        public Injector CreateResourceInjector() {
            return injector;
        }

        public EObject doTransformation(EObject modelObject,
                        String commandString) {
                if (commandString.equals(TRANSFORMATIONCOMMAND)) {
                    EObject transformed = (new KIXS2SCC())
                                    .transform((Region) modelObject);
                    EcoreUtil.resolveAll(transformed);
                    return transformed;
                }

                return null;
        }

        public void doPostProcessing(EObject modelObject) {
        }

}