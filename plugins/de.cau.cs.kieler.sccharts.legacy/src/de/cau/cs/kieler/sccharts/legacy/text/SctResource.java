/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.legacy.text;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.SaveOptions;

import de.cau.cs.kieler.sccharts.legacy.sccharts.Region;
import de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.legacy.sccharts.Scope;
import de.cau.cs.kieler.sccharts.legacy.sccharts.State;

/**
 * A customized {@link LazyLinkingResource}. Modifies the parsed model and fixes some runtime bugs.
 *
 * @author chsch
 * @author als
 */

public class SctResource extends LazyLinkingResource {

    /**
     * Starts model consolidation before {@link LazyLinkingResource#doLinking()}.
     */
    protected void doLinking() {
        consolidateModel();
        super.doLinking();
    }

    /**
     * Registers {@link SaveOptions} and delegates to
     * {@link LazyLinkingResource#doSave(OutputStream, Map)}
     */
    @Override
    public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {

        // there's something strange let me go crazy : options is null no matter
        // what the param in resource.save(...) is ... :-(
        Map<Object, Object> myOptions = new HashMap<Object, Object>();

        SaveOptions.newBuilder().format().noValidation().getOptions().addTo(myOptions);

        super.doSave(outputStream, myOptions);
    }

    /**
     * Eliminates an ugly bug within the calling method
     * {@link org.eclipse.xtext.resource.XtextResource#update(int, int, String)}:<br>
     * If a parsing round fails entirely, the last previously successfully deducted EObject will
     * remain in contents though the parseResult is empty! After the next successful parser run the
     * new EObject will be added to contents regardless the non-emptiness of contents.
     */
    protected void updateInternalState(IParseResult parseResult) {
//        
// NOT SURE IF THIS IS STILL NECESSARY.
//        
//        if (parseResult.getRootASTElement() != null && getContents().size() != 0
//                && !getContents().get(0).equals(parseResult.getRootASTElement())) {
//            unload(getContents().get(0));
//            getContents().remove(0);
//            while (!getContents().isEmpty()) {
//                getContents().remove(0);
//            }
//        }
//        this.getContents().clear();
        super.updateInternalState(parseResult);
    }

    // ---------------------------------------------------------------------------------------

    /**
     * Iterates on the parsed model and delegates to {@link #setupTickSignal(Region)},
     * {@link #setupScopeID(Scope, HashSet)} and {@link #setupPriorities(State)}.
     */
    private void consolidateModel() {

        EObject o = null;
        for (Iterator<EObject> i = this.getAllContents(); i.hasNext();) {
            o = i.next();
            if (SCChartsPackage.eINSTANCE.getScope().isInstance(o)) {
                setupScopeLabel((Scope) o);
            }
            if (SCChartsPackage.eINSTANCE.getState().isInstance(o)) {
                setupPriorities((State) o);
            }
        }
    }
    
    /**
     * Sets implicit scope labels.
     */
    private void setupScopeLabel(Scope scope) {
        if (scope.getLabel() == null) {
            scope.setLabel(scope.getId());
        }
    }

    /**
     * Initializes the transition priority to 1 one exactly 1 transition is present.
     */
    private void setupPriorities(State s) {
        if (s.getOutgoingTransitions().size()==1) {
            s.getOutgoingTransitions().get(0).setPriority(1);
        }
    }

}
