/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.annotations.ui.contentassist;

import java.util.Collection;
import java.util.Iterator;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.ui.contentassist.TerminalsProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.util.Strings;

import de.cau.cs.kieler.annotations.Annotation;
import de.cau.cs.kieler.annotations.impl.AnnotationImpl;
import de.cau.cs.kieler.annotations.ui.contentassist.AbstractAnnotationsProposalProvider;
import org.eclipse.elk.core.data.LayoutAlgorithmData;
import org.eclipse.elk.core.data.LayoutMetaDataService;
import org.eclipse.elk.core.data.LayoutOptionData;
import org.eclipse.elk.core.data.LayoutOptionData.Type;
import org.eclipse.elk.core.options.CoreOptions;

/**
 * Custom {@link AbstractAnnotationsProposalProvider} contributing KIELER Layout configuration
 * annotation proposals to Xtext editors encompassing Annotations. It defines custom mappings of
 * keywords and terminals to highlighting configurations.
 * 
 * @author sgu, chsch
 */
public class AnnotationsProposalProvider extends AbstractAnnotationsProposalProvider {

    /**
     * Need this delegate in order to call methods of that class that are also generated
     * into {@link AbstractAnnotationsProposalProvider} (due to some terminal re-definitions).
     */
    @Inject
    private TerminalsProposalProvider delegate;    
    
    // ---------------------------------------------------------
    //  Terminal-specific annotation proposals
    // ---------------------------------------------------------
    
    public void complete_BOOLEAN(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        acceptor.accept(createCompletionProposal("false", "false", getImage(ruleCall), context));
        acceptor.accept(createCompletionProposal("true", "true", getImage(ruleCall), context));
    }
    
    public void complete_ExtendedID(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        delegate.complete_ID(model, ruleCall, context, acceptor);
    }
    
    public void complete_EString(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        delegate.complete_STRING(model, ruleCall, context, acceptor);
    }
    
    public void complete_INT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        delegate.complete_INT(model, ruleCall, context, acceptor);
    }
    
    public void complete_FLOAT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        createFloatProposal(context, acceptor, ruleCall, getAssignedFeature(ruleCall), 1f);
    }
    
    public void complete_STRING(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        delegate.complete_STRING(model, ruleCall, context, acceptor);
    }    
    
    /**
     * This method has been copied from
     * {@link org.eclipse.xtext.common.ui.contentassist.TerminalsProposalProvider}.
     */
    private String getAssignedFeature(RuleCall call) {
        Assignment ass = GrammarUtil.containingAssignment(call);
        if (ass != null) {
                String result = ass.getFeature();
                if (result.equals(result.toLowerCase()))
                        result = Strings.toFirstUpper(result);
                return result;
        }
        return null;
    }

    /**
     * This method has been copied and adapted from
     * {@link org.eclipse.xtext.common.ui.contentassist.TerminalsProposalProvider}.
     */
    private void createFloatProposal(final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor, final RuleCall ruleCall, final String feature, float i) {
        String proposalText = getValueConverter().toString(i, ruleCall.getRule().getName());
        String displayText = proposalText + " - " + ruleCall.getRule().getName();
        if (feature != null)
            displayText = proposalText + " - " + feature;
        ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, null,
                context);
        if (proposal instanceof ConfigurableCompletionProposal) {
            ConfigurableCompletionProposal configurable = (ConfigurableCompletionProposal) proposal;
            configurable.setSelectionStart(configurable.getReplacementOffset());
            configurable.setSelectionLength(proposalText.length());
            configurable.setAutoInsertable(false);
            configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
        }
        acceptor.accept(proposal);
    }
    
    
    // ---------------------------------------------------------
    //  Semantic automatic layout specific annotation proposals
    // ---------------------------------------------------------
    
    /**
     * Computes the annotation key proposals based on available layout options.
     * 
     * @param context Xtext API
     * @param acceptor Xtext API
     * 
     * @author sgu, chsch
     */
    private void nameProposal(final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {
        if (this.kielerLayoutAvailable()) {
            /* declare the plain proposal and get the option list */
            String proposal;
            StyledString.Styler theStyle;
            StyledString displayString;
            ICompletionProposal completeProposal;

            LayoutMetaDataService layoutServices = LayoutMetaDataService.getInstance();
            Collection<LayoutOptionData> optionDataList = layoutServices.getOptionData();
            LayoutOptionData optionData;

            /* create and register the completion proposal for every element in the list */
            for (Iterator<LayoutOptionData> i = optionDataList.iterator(); i.hasNext();) {
                optionData = i.next();
                theStyle = null; // (optionData.isAdvanced()) ? StyledString.COUNTER_STYLER : null;
                displayString = new StyledString(optionData.toString(), theStyle);
                displayString.append(" - " + optionData.getType().toString(),
                        StyledString.QUALIFIER_STYLER);
                proposal = optionData.getId();
                completeProposal = createCompletionProposal(proposal, displayString, null,
                        getPriorityHelper().getDefaultPriority(),
                        "de.cau.cs.kieler." + context.getPrefix(), context);
                acceptor.accept((completeProposal != null) ? completeProposal
                        : createCompletionProposal(proposal, displayString, null, context));
            }
        }
    }

    /**
     * Computes the annotation value proposals based on a foregoing layout parameter.
     * 
     * @param context Xtext API
     * @param acceptor Xtext API
     * 
     * @author sgu, chsch
     */
    private void valueProposal(final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        if (kielerLayoutAvailable()) {
            /* check if the prefix is a KIELER annotation */
            if (context.getCurrentModel() instanceof Annotation
                    && context.getCurrentModel().getClass().equals(AnnotationImpl.class)) {

                String annotationName = ((Annotation) context.getCurrentModel()).getName();
                if (!Strings.isEmpty(annotationName)) {

                    // get the option list
                    LayoutMetaDataService layoutServices = LayoutMetaDataService.getInstance();

                    // find the specific option an display all possible values
                    LayoutOptionData optionData = layoutServices.getOptionData(annotationName);
                    Type theType = (optionData != null) ? optionData.getType() : Type.UNDEFINED;
                    String proposal = null;
                    
                    switch (theType) {
                    // show the available choices for boolean and enumeration/
                    case BOOLEAN:
                    case ENUM:
                    case ENUMSET:
                        for (int j = 0; j < optionData.getChoices().length; j++) {
                            proposal = optionData.getChoices()[j];
                            acceptor.accept(createCompletionProposal(proposal, context));
                        }
                        break;

                    // for string, float, integer and object show the type of the value and give a
                    //  corresponding default value
                     
                    case STRING:
                        if (annotationName.equals(CoreOptions.ALGORITHM.getId())) {
                            String displayString = null;
                            for (LayoutAlgorithmData data : layoutServices.getAlgorithmData()) {
                                proposal = '"' + data.getId() + '"';
                                displayString = data.getName();
                                acceptor.accept(createCompletionProposal(proposal, displayString, null, context));
                            }
                            break;
                        }
                    case DOUBLE:
                    case INT:
                    case OBJECT:

                        // chose the corresponding default value
                        switch (theType) {
                        case STRING:
                            proposal = "\"\"";
                            break;
                        case DOUBLE:
                            proposal = "0.0";
                            break;
                        case INT:
                            proposal = "0";
                            break;
                        case OBJECT:
                            try {
                                proposal = "\""
                                        + optionData.getOptionClass().newInstance().toString()
                                        + "\"";
                            } catch (InstantiationException e) {
                                proposal = "\"\"";
                            } catch (IllegalAccessException e) {
                                proposal = "\"\"";
                            }
                            break;

                        default:
                            break;
                        }
                        acceptor.accept(createCompletionProposal(proposal, optionData.getType()
                                .toString(), null, context));
                        break;

                    default:
                        break;
                    }
                }
            }
        }
    }

    private static boolean kielerLayoutAvailable = false;
    private static boolean kielerLayoutUnavailable = false;

    /**
     * We have to test the presence of the KIELER Infrastructure for Meta Layout (KIML), as we want
     * to keep the dependency to KIML loosely and direct Eclipse to resolve the package dependency
     * dynamically (see optional dependency in MANIFEST.MF).
     */
    private boolean kielerLayoutAvailable() {
        if (kielerLayoutAvailable) {
            return true;
        }
        if (kielerLayoutUnavailable) {
            return false;
        }
        try {
            kielerLayoutAvailable = Class
                    .forName("de.cau.cs.kieler.kiml.ui.service.EclipseLayoutDataService") != null;
            kielerLayoutUnavailable = !kielerLayoutAvailable;
            return kielerLayoutAvailable;
        } catch (ClassNotFoundException e) {
            kielerLayoutUnavailable = true;
            return false;
        }
    }
    
    
    // CHECKSTYLEOFF MethodName

    @Override
    public void completeTagAnnotation_Name(final EObject model, final Assignment assignment,
            final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeTagAnnotation_Name(model, assignment, context, acceptor);

        /* call modified completion */
        nameProposal(context, acceptor);
    }

    @Override
    public void completeKeyStringValueAnnotation_Name(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeKeyStringValueAnnotation_Name(model, assignment, context, acceptor);

        /* call modified completion */
        nameProposal(context, acceptor);
    }

    @Override
    public void completeTypedKeyStringValueAnnotation_Name(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeTypedKeyStringValueAnnotation_Name(model, assignment, context, acceptor);

        /* call modified completion */
        nameProposal(context, acceptor);
    }


    @Override
    public void completeCommentAnnotation_Values(final EObject model, final Assignment assignment,
            final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeCommentAnnotation_Values(model, assignment, context, acceptor);

        /* call modified completion */
        valueProposal(context, acceptor);
    }

    @Override
    public void completeKeyStringValueAnnotation_Values(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeKeyStringValueAnnotation_Values(model, assignment, context, acceptor);

        /* call modified completion */
        valueProposal(context, acceptor);
    }

    @Override
    public void completeTypedKeyStringValueAnnotation_Values(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeTypedKeyStringValueAnnotation_Values(model, assignment, context, acceptor);

        /* call modified completion */
        valueProposal(context, acceptor);
    }
    
    // CHECKSTYLEON MethodName
}
