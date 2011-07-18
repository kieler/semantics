/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.text.kits;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.linking.impl.AbstractCleaningLinker;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.google.inject.Inject;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * A customized Xtext linker linking textual syncchart models.
 * It doesn't create proxies but setups cross references and their EOpposites immediately.
 * 
 * @author chsch
 */

public class KitsLinker extends AbstractCleaningLinker {

    @Inject
    private ILinkingService linkingService;

    @Inject
    private LinkingHelper linkingHelper;

    protected void doLinkModel(EObject model, IDiagnosticConsumer diagnosticsConsumer) {

        Iterator<EObject> it = model.eAllContents();
        List<EObject> linkedObjects = null;

        /* iterate on all semantic elements of the synccharts model */
        for (EObject obj = null; it.hasNext();) {
            obj = it.next();

            /* restrict to elements with cross references */
            if (SyncchartsPackage.eINSTANCE.getScope().isInstance(obj)
                    || SyncchartsPackage.eINSTANCE.getTransition().isInstance(obj)
                    || SyncchartsPackage.eINSTANCE.getEmission().isInstance(obj)
                    || SyncchartsPackage.eINSTANCE.getAssignment().isInstance(obj)
                    || KExpressionsPackage.eINSTANCE.getValuedObjectReference().isInstance(obj)) {

                /* reveal the dedicated parse tree element */
                final ICompositeNode node = NodeModelUtils.getNode(obj);

                /* iterate on the parse tree element's children */
                for (INode childNode : node.getChildren()) {

                    /* process cross references only */
                    if (childNode.getGrammarElement() instanceof CrossReference) {

                        /* reveal the related EReference to current parse tree reference */
                        EReference eRef = GrammarUtil.getReference(
                                (CrossReference) childNode.getGrammarElement(), obj.eClass());

                        /*
                         * ask the linking service (with hooked scope provider) for the addressed
                         * semantic element; list is empty or singleton
                         */
                        linkedObjects = this.linkingService.getLinkedObjects(obj, eRef, childNode);

                        /* if list is not empty setup cross reference */
                        if (linkedObjects.size() != 0) {
                            obj.eSet(eRef, linkedObjects.get(0));
							// } else {
							// String s = this.linkingHelper
                            //         .getCrossRefNodeAsString(childNode, true);
							// System.out.println(s + " unlinked");
                        }
                    }
                }
                
                if (SyncchartsPackage.eINSTANCE.getState().isInstance(obj)) {
                    State state = (State) obj;
                    for (Transition t : new ArrayList<Transition>(state.getIncomingTransitions())) {
                        if (t.eContainer() == null) {
                            state.getIncomingTransitions().remove(t);
                        }
                    }
                }
            }
        }
    }
}
