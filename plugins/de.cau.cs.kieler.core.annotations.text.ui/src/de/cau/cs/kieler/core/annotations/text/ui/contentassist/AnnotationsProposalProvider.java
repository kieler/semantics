/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations.text.ui.contentassist;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Strings;

import de.cau.cs.kieler.kiml.LayoutDataService;
import de.cau.cs.kieler.kiml.LayoutOptionData;
import de.cau.cs.kieler.kiml.LayoutOptionData.Type;

import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.impl.AnnotationImpl;

/**
 * Custom {@link AbstractAnnotationsProposalProvider} contributing KIELER Layout configuration
 * annotation proposals to Xtext editors encompassing Annotations. It defines custom mappings of
 * keywords and terminals to highlighting configurations.
 * 
 * @author sgu, chsch
 */
public class AnnotationsProposalProvider extends AbstractAnnotationsProposalProvider {

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

            LayoutDataService layoutServices = LayoutDataService.getInstance();
            Collection<LayoutOptionData<?>> optionDataList = layoutServices.getOptionData();
            LayoutOptionData<?> optionData;

            /* create and register the completion proposal for every element in the list */
            for (Iterator<LayoutOptionData<?>> i = optionDataList.iterator(); i.hasNext();) {
                optionData = i.next();
                theStyle = (optionData.isAdvanced()) ? StyledString.COUNTER_STYLER : null;
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
            /* check if the prefix is an kieler annotation */
            if (context.getCurrentModel() instanceof Annotation
                    && context.getCurrentModel().getClass().equals(AnnotationImpl.class)) {

                String annotationName = ((Annotation) context.getCurrentModel()).getName();
                if (!Strings.isNullOrEmpty(annotationName)) {

                    // get the option list
                    LayoutDataService layoutServices = LayoutDataService.getInstance();

                    // find the specific option an display all possible values
                    LayoutOptionData<?> optionData = layoutServices.getOptionData(annotationName);
                    Type theType = (optionData != null) ? optionData.getType() : Type.UNDEFINED;
                    String proposal = null;
                    
                    switch (theType) {
                    // show the available choices for boolean and enumeration/
                    case BOOLEAN:
                    case REMOTE_ENUM:
                    case ENUM:
                        for (int j = 0; j < optionData.getChoices().length; j++) {
                            proposal = optionData.getChoices()[j];
                            acceptor.accept(createCompletionProposal(proposal, context));
                        }
                        break;

                    // for string, float, integer and object show the type of the value and give a
                    //  corresponding default value
                     
                    case STRING:
                    case FLOAT:
                    case INT:
                    case OBJECT:

                        // chose the corresponding default value
                        switch (theType) {
                        case STRING:
                            proposal = "\"\"";
                            break;
                        case FLOAT:
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
    public void completeKeyBooleanValueAnnotation_Name(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeTagAnnotation_Name(model, assignment, context, acceptor);

        /* call modified completion */
        nameProposal(context, acceptor);
    }

    @Override
    public void completeKeyIntValueAnnotation_Name(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeKeyIntValueAnnotation_Name(model, assignment, context, acceptor);

        /* call modified completion */
        nameProposal(context, acceptor);
    }

    @Override
    public void completeKeyFloatValueAnnotation_Name(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeKeyFloatValueAnnotation_Name(model, assignment, context, acceptor);

        /* call modified completion */
        nameProposal(context, acceptor);
    }

    @Override
    public void completeCommentAnnotation_Value(final EObject model, final Assignment assignment,
            final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeCommentAnnotation_Value(model, assignment, context, acceptor);

        /* call modified completion */
        valueProposal(context, acceptor);
    }

    @Override
    public void completeKeyStringValueAnnotation_Value(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeKeyStringValueAnnotation_Value(model, assignment, context, acceptor);

        /* call modified completion */
        valueProposal(context, acceptor);
    }

    @Override
    public void completeTypedKeyStringValueAnnotation_Value(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeTypedKeyStringValueAnnotation_Value(model, assignment, context, acceptor);

        /* call modified completion */
        valueProposal(context, acceptor);
    }

    @Override
    public void completeKeyBooleanValueAnnotation_Value(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeKeyBooleanValueAnnotation_Value(model, assignment, context, acceptor);

        /* call modified completion */
        valueProposal(context, acceptor);
    }

    @Override
    public void completeKeyIntValueAnnotation_Value(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeKeyIntValueAnnotation_Value(model, assignment, context, acceptor);

        /* call modified completion */
        valueProposal(context, acceptor);
    }

    @Override
    public void completeKeyFloatValueAnnotation_Value(final EObject model,
            final Assignment assignment, final ContentAssistContext context,
            final ICompletionProposalAcceptor acceptor) {

        /* call implementation of superclass */
        super.completeKeyFloatValueAnnotation_Value(model, assignment, context, acceptor);

        /* call modified completion */
        valueProposal(context, acceptor);
    }
    
    // CHECKSTYLEON MethodName
}
