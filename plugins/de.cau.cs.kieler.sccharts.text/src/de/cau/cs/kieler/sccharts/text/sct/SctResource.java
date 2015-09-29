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
package de.cau.cs.kieler.sccharts.text.sct;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.util.Strings;

import de.cau.cs.kieler.core.kexpressions.CombineOperator;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

/**
 * A customized {@link LazyLinkingResource}. Modifies the parsed model and fixes some runtime bugs.
 *
 * @author chsch
 */

public class SctResource extends LazyLinkingResource {

    /**
     * Delegates to {@link LazyLinkingResource#doLoad(InputStream inputStream, Map<?, ?> options)}
     * for debugging purposes.
     */
    protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
        super.doLoad(inputStream, options);
    }

    /**
     * Delegates do {@link LazyLinkingResource#update(int, int, String)} for debugging purposes.
     */
    public void update(int offset, int replacedTextLength, String newText) {
        super.update(offset, replacedTextLength, newText);
    }

    /**
     * Starts model consolidation after {@link LazyLinkingResource#doLinking()}.
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
        if (parseResult.getRootASTElement() != null && getContents().size() != 0
                && !getContents().get(0).equals(parseResult.getRootASTElement())) {
            unload(getContents().get(0));
            getContents().remove(0);
            while (!getContents().isEmpty()) {
                getContents().remove(0);
            }
        }
        this.getContents().clear();
        super.updateInternalState(parseResult);
    }

    // ---------------------------------------------------------------------------------------

    /**
     * Iterates on the parsed model and delegates to {@link #setupTickSignal(Region)},
     * {@link #setupScopeID(Scope, HashSet)} and {@link #setupPriorities(State)}.
     */
    private void consolidateModel() {

    	// The following is NOT a reasonable solution as editing the resource with a
    	//  Xtext IDocumentEditor will fail due to absence of a related parsetree element
		/*
		if (this.getContents().isEmpty()) {
		     this.getContents().add(scchartsFactory.eINSTANCE.createRegion());
		} */

//        setupTickSignal(((Region) this.getContents().get(0)));

//        HashMap<Scope, HashSet<String>> m = new HashMap<Scope, HashSet<String>>();
        EObject o = null;
        for (Iterator<EObject> i = this.getAllContents(); i.hasNext();) {
            o = i.next();
            if (SCChartsPackage.eINSTANCE.getScope().isInstance(o)) {
                setupScopeLabel((Scope) o);
//                setupScopeID((Scope) o, m);
            }
            if (SCChartsPackage.eINSTANCE.getState().isInstance(o)) {
                setupPriorities((State) o);
            }
//            if (KExpressionsPackage.eINSTANCE.getValuedObject().isInstance(o)) {
//                setupTypes((ValuedObject) o);
//            }
        }
    }

//    /**
//     * Provides the implicit signal 'tick' within the root region. (#1088) Signal is created if it
//     * is not present, yet, i.e. not declared textual.
//     *
//     * @param r
//     *            model root region
//     */
//    private void setupTickSignal(Region r) {
//
//        if (r != null) {
//            for (Signal s : r.getSignals()) {
//                if (s.getName().equals("tick")) {
//                    return;
//                }
//            }
//            Signal tick = ExpressionsFactory.eINSTANCE.createSignal();
//            tick.setName("tick");
//            tick.setType(ValueType.PURE);
//            r.getSignals().add(tick);
//        }
//    }


    private void setupScopeLabel(Scope scope) {
        if (scope.getLabel() == null) {
            scope.setLabel(scope.getId());
        }

    }


//    /**
//     * Consolidates the scope's id. If no Id is present compute one from the label if possible
//     * otherwise assemble it mechanically.
//     */
//    private void setupScopeID(Scope scope, HashMap<Scope, HashSet<String>> allNames) {
//        String newId = null, newId2 = null;
//        HashSet<String> names = null;
//
//        /*
//         * The construct in the up coming lines are in charge of "scoped" id computation. I
//         * accomplish this, the map will be filled with sets containing the already reserved ids,
//         * s.t. every set of ids is related to the children collection of a scope. Eventually, the
//         * scope serves as the corresponding key.
//         */
//        if (scope.eContainer() == null) {
//            // this is for the root region / root state that are not inteneded
//            // to have siblings! Hence, this provides just an alibi set.
//            names = new HashSet<String>();
//
//        } else {
//            names = allNames.get(scope.eContainer());
//            if (names == null) {
//                names = new HashSet<String>();
//                allNames.put((Scope) scope.eContainer(), names);
//            }
//        }
//
//        /* The actual computation of the scope id */
//        if (!scope.eIsSet(scchartsPackage.eINSTANCE.getScope_Id())) {
//            Boolean isState = scchartsPackage.eINSTANCE.getState().isInstance(scope);
//            newId = scope.getLabel();
//
//            if (newId == null || newId.trim().equals("")) {
//                newId = isState ? "state" : "region";
//            } else {
//                newId = newId.replace(' ', '_').replace("@", "_AT_");
//            }
//
//            int n = 0;
//            newId2 = newId;
//            while (names.contains(newId)) {
//                newId = newId2 + Integer.toString(n++);
//            }
//            names.add(newId);
//            scope.setId(newId);
//        }
//    }

    /**
     * Initializes the transition priority to 1 one exactly 1 transition is present.
     */
//     * Sets up transitions priorities if needed. Setup priorities of parsed transitions if the
//     * priority of the first transition is not set. (it's likely this is the only transition).
//     */
    private void setupPriorities(State s) {
        if (s.getOutgoingTransitions().size()==1) {
            s.getOutgoingTransitions().get(0).setPriority(1);
        }
//        if (s.getOutgoingTransitions().size() != 0
//                && !s.getOutgoingTransitions().get(0)
//                        .eIsSet(scchartsPackage.eINSTANCE.getTransition_Priority())) {
//            for (int i = 0; i < s.getOutgoingTransitions().size(); i++) {
//                s.getOutgoingTransitions().get(i).setPriority(i + 1);
//            }
//        }
    }

//    private void setupTypes(ValuedObject v) {
//        //if (!Strings.isEmpty(v.getHostType())) {
//            v.setType(ValueType.HOST);
//        //}
//        if (KExpressionsPackage.eINSTANCE.getValuedObject().isInstance(v)) {
//            //if (!Strings.isEmpty(((ValuedObject) v).getHostCombineOperator())) {
//                ((ValuedObject) v).setCombineOperator(CombineOperator.HOST);
//            //}
//        }
//    }

    // /** copied from TriggerListenerIDs */
    // List<UniqueStringCache> caches = new ArrayList<UniqueStringCache>();
    //
    //
    // /** old stuff.
    // * adapted from TriggerListenerIDs */
    // @SuppressWarnings({ "unchecked", "unused" })
    // private void setupScopeIDsOld() {
    //
    // caches.clear();
    // EObject o = null;
    // for (Iterator<EObject> i = this.getAllContents(); i.hasNext();) {
    // o = i.next();
    // if (o instanceof Scope) {
    // Scope scope = (Scope) o;
    // String newId = scope.getLabel();
    // String prefix = (scope instanceof State)?"_S":"_R";
    //
    // if (newId == null || newId.trim().equals("")) {
    // String anonymousId = getUniqueString(scope, scchartsPackage.eINSTANCE.getScope_Id(),
    // prefix);
    // scope.setId(anonymousId);
    // } else {
    //
    // newId = newId.replaceAll("\\s", "_");
    //
    // // check whether ID is unique
    // boolean scopeIsState = (scope instanceof State);
    //
    // Scope parentScope = scopeIsState ? ((State) scope)
    // .getParentRegion() : ((Region) scope)
    // .getParentState();
    // if (parentScope != null) {
    // EList<Scope> children = (EList<Scope>) (scopeIsState ? ((Region) parentScope)
    // .getStates()
    // : ((State) parentScope).getRegions());
    //
    // for (Scope sibling : children) {
    // String siblingId = sibling.getId();
    // if (sibling != scope && siblingId != null
    // && siblingId.equals(newId)) {
    // // resolve conflict by changing auto
    // // generated
    // // IDs (for
    // // anonymous states)
    // if (sibling.getLabel() == null
    // || sibling.getLabel().trim()
    // .equals("")) {
    // String dummyId = getUniqueString(
    // sibling,
    // scchartsPackage.eINSTANCE
    // .getScope_Id(), "_S");
    // sibling.setId(dummyId);
    // }
    // }
    // }
    // }
    // scope.setId(newId);
    // }
    // }
    // }
    // }
    //
    // /** copied from TriggerListenerIDs */
    // private String getUniqueString(EObject target, EAttribute attribute,
    // String prefix) {
    // EObject parent = target.eContainer();
    // UniqueStringCache cache = null;
    // for (UniqueStringCache c : caches) {
    // if ((parent == null && c.getParent() == null)
    // || (parent != null && c.getParent() != null && c.getParent().equals(parent)
    // && c.getAttribute().equals(attribute))) {
    // cache = c;
    // }
    // }
    // if (cache == null) {
    // cache = new UniqueStringCache(parent, attribute);
    // caches.add(cache);
    // }
    // String temp = scchartsContentUtil.getNewUniqueString(target,
    // attribute, prefix, cache);
    // cache.add(temp);
    // return temp;
    // }

}
