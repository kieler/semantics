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
package de.cau.cs.kieler.sccharts.ui.text.quickfix

import com.google.inject.Inject
import org.eclipse.xtext.ui.editor.quickfix.Fix
import de.cau.cs.kieler.sccharts.text.validation.SCTXValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import de.cau.cs.kieler.annotations.PragmaStringAnnotation
import de.cau.cs.kieler.annotations.AnnotationsFactory
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions

/**
 * @author ssm
 * @kieler.design 2017-07-27 proposed 
 * @kieler.rating 2017-07-27 proposed yellow 
 *
 */
class SCTXQuickfixProvider extends de.cau.cs.kieler.kexpressions.ui.kext.quickfix.KExtQuickfixProvider {

    
    @Inject extension SCChartsCoreExtensions
    
   @Fix(SCTXValidator.CHECK_VIOLATION_STATES_REQUIRE_ENFORCER_DIRECTOR)
   def void setEnforcerDirector(Issue issue, IssueResolutionAcceptor acceptor) {
        acceptor.accept(issue, "Set Enforcer director", "Use the Enforcer director for the SCCharts.",
                null, new ISemanticModification() {
                    override void apply(EObject element, IModificationContext context)
                            throws Exception {
                            
                                if (element instanceof Scope) {
                                    val scc = element.getSCCharts
                                    scc.pragmas.removeIf[ it instanceof PragmaStringAnnotation &&
                                                              (it as PragmaStringAnnotation).name.equals(SCTXValidator.DIRECTOR) ]
                                    scc.pragmas += AnnotationsFactory.eINSTANCE.createStringPragma => [
                                        name = SCTXValidator.DIRECTOR
                                        values += SCTXValidator.ENFORCER
                                    ]
                                }
                            
                            return;
                        }
                    }
        );
    }    
}
