/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.Assignment
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration

/**
 * @author ssm
 *
 */
class KiCoolProposalProviderX extends KiCoolProposalProvider {
    
    override completeProcessor_Id(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

        val prefix = context.prefix
        if (!"".equals(prefix)) { 
            for(processor : KiCoolRegistration.getProcessorIds) {
                if (processor.contains(prefix)) {
                    val proposal = doCreateProposal(processor, null, null, getPriorityHelper.getDefaultPriority, context)
                    acceptor.accept(proposal)
                }
            }
        }
    }
    
}