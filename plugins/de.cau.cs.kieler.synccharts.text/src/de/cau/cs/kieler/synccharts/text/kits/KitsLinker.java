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
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;

import com.google.inject.Inject;

import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

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
//        String uriFragment = null;
        List<EObject> linkedObjects = null;

        /* iterate on all semantic elements of the synccharts model */
        for (EObject obj = null; it.hasNext();) {
            obj = it.next();

            /* restrict to elements with cross references */
            if (SyncchartsPackage.eINSTANCE.getScope().isInstance(obj)
                    || SyncchartsPackage.eINSTANCE.getTransition().isInstance(obj)
                    || SyncchartsPackage.eINSTANCE.getEmission().isInstance(obj)
                    || SyncchartsPackage.eINSTANCE.getAssignment().isInstance(obj)
                    || ExpressionsPackage.eINSTANCE.getValuedObjectReference().isInstance(obj)) {

                /* reveal the dedicated parse tree element */
                final CompositeNode node = NodeUtil.getNodeAdapter(obj).getParserNode();

                /* iterate on the parse tree element's children */
                for (AbstractNode childNode : node.getChildren()) {

                    /* process cross references only */
                    if (childNode.getGrammarElement() instanceof CrossReference) {

                        /* reveal the related EReference to current parse tree reference */
                        EReference eRef = GrammarUtil.getReference(
                                (CrossReference) childNode.getGrammarElement(), obj.eClass());

//                        /* compute the relative path from node to childnode */
//                        uriFragment = getRelativePath("", node, childNode);
//                        
//                        AbstractNode node2 =  getNode(node, uriFragment);
//                        

                        /*
                         * ask the linking service (with hooked scope provider for the addressed
                         * semantic element; list is empty or singleton
                         */
                        linkedObjects = this.linkingService.getLinkedObjects(obj, eRef, childNode);

                        /* if list is not empty setup cross reference */
                        if (linkedObjects.size() != 0) {
                            obj.eSet(eRef, linkedObjects.get(0));
                        } else {
                            String s = this.linkingHelper.getCrossRefNodeAsString(childNode, true);
                            System.out.println(s + " unlinked");
                        }
                    }
                }
            }
        }
    }

    // ------------------------------------------------------------------------------- //

//    /**
//     * computes relative address from currentNode to otherNode. copied from
//     * {@link org.eclipse.xtext.linking.lazy.LazyURIEncoder} (renamed parameters making them more
//     * comprehensible)
//     * 
//     * @param result
//     *            initial fragmentURI
//     * @param currentNode
//     *            current semantic element parse node
//     * @param otherNode
//     *            other node to compute the address from current node to
//     * @return
//     */
//    private String getRelativePath(String result, AbstractNode currentNode, AbstractNode otherNode) {
//        if (currentNode == otherNode)
//            return result;
//        if (EcoreUtil.isAncestor(currentNode, otherNode)) {
//            result = getRelativePath(result, currentNode, otherNode.getParent());
//            result = result.concat("/").concat(
//                    Integer.toString(otherNode.getParent().getChildren().indexOf(otherNode)));
//        } else {
//            result = result.concat("/..");
//            result = getRelativePath(result, currentNode.getParent(), otherNode);
//        }
//        return result;
//    }
//
//    // ------------------------------------------------------------------------------- //
//
//    /**
//     * reveals a parse tree node relative from 'node'. copied from
//     * {@link org.eclipse.xtext.linking.lazy.LazyURIEncoder} (renamed parameters making them more
//     * comprehensible)
//     * 
//     * @param node
//     *            current semantic element parse node
//     * @param path
//     *            relative path to addressed node
//     * @return the addressed parse tree node
//     */
//    private AbstractNode getNode(final AbstractNode node, String path) {
//        final String[] split = path.split("/");
//        AbstractNode result = node;
//        for (String string : split) {
//            String trimmed = string.trim();
//            if (trimmed.length() > 0) {
//                if ("..".equals(trimmed)) {
//                    if (result.getParent() == null)
//                        throw new IllegalStateException("node has no parent");
//                    result = result.getParent();
//                } else {
//                    int index = Integer.parseInt(string);
//                    if (index >= 0) {
//                        result = ((CompositeNode) result).getChildren().get(index);
//                    }
//                }
//            }
//        }
//        return result;
//    }
}
