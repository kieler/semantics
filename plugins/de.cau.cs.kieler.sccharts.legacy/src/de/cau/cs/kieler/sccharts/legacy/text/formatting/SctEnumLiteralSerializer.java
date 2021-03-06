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
package de.cau.cs.kieler.sccharts.legacy.text.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.parsetree.reconstr.impl.EnumLiteralSerializer;
import org.eclipse.xtext.parsetree.reconstr.impl.ValueSerializer;

import com.google.inject.Inject;

import de.cau.cs.kieler.sccharts.legacy.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.legacy.text.SctTransientValueService;

/**
 * Customized {@link IEnumLiteralSerializer}. Realizes the mapping of special terminal symbols to
 * model content. Here, it serves just to drop default values of enumerations.
 *
 * @author chsch ssm
 */
public class SctEnumLiteralSerializer extends EnumLiteralSerializer {

    @Inject
    ITransientValueService transientValueService;

    /**
     * Decides whether a feature value of an EObject is valid to be serialized. In case the
     * assignment of a valuedObject type is processed delegate to {@link SctTransientValueService},
     * delegate to {@link ValueSerializer} otherwise.
     */
    public boolean isValid(EObject context, RuleCall ruleCall, Object value,
            IErrorAcceptor errorAcceptor) {

        // if we have a valuedObject under consideration and are processing the call of a
        // parser rule called from an assignment to a feature of the valuedObject
        // here: ... type = ValueType ... ,i.e. the call of the ValueType rule
        if (KExpressionsPackage.eINSTANCE.getValuedObject().isInstance(context)
                && XtextPackage.eINSTANCE.getAssignment().isInstance(ruleCall.eContainer())) {

            Assignment a = (Assignment) ruleCall.eContainer();

            // if the feature the assignment is made to is the 'type' feature
// TODO: Is this still relevant?
//            if (a.getFeature()
//                    .equals(KExpressionsPackage.eINSTANCE.getValuedObject_Type().getName())) {

                // ask the transientValueService;
                // note that the return inverse value semantics!
//                return !transientValueService.isTransient(context,
//                        KExpressionsPackage.eINSTANCE.getValuedObject_Type(), -1);
//            }
        }

        // if we have a valuedObject under consideration and are processing the call of a
        // parser rule called from an assignment to a feature of the valuedObject
        // here: ... combineOperator = CombineOperator ... ,i.e. the call of the CombineOperator
        // rule
        if (KExpressionsPackage.eINSTANCE.getValuedObject().isInstance(context)
                && XtextPackage.eINSTANCE.getAssignment().isInstance(ruleCall.eContainer())) {

            Assignment a = (Assignment) ruleCall.eContainer();

            // if the feature the assignment is made to is the 'type' feature
            if (a.getFeature().equals(
                    KExpressionsPackage.eINSTANCE.getValuedObject_CombineOperator().getName())) {

                // ask the transientValueService;
                // note that the return inverse value semantics!
                return !transientValueService.isTransient(context,
                        KExpressionsPackage.eINSTANCE.getValuedObject_CombineOperator(), -1);
            }
        }

        // if we have a state under consideration and are processing the call of a
        // parser rule called from an assignment to a feature of the state
        // here: ... type = StateType ... ,i.e. the call of the StateType rule
        if (SCChartsPackage.eINSTANCE.getState().isInstance(context)
                && XtextPackage.eINSTANCE.getAssignment().isInstance(ruleCall.eContainer())) {

            Assignment a = (Assignment) ruleCall.eContainer();

            // if the feature the assignment is made to is the 'type' feature
            if (a.getFeature().equals(SCChartsPackage.eINSTANCE.getState_Type().getName())) {

                // ask the transientValueService;
                // note that the return inverse value semantics!
                return !transientValueService.isTransient(context,
                        SCChartsPackage.eINSTANCE.getState_Type(), -1);
            }
        }

        return super.isValid(context, ruleCall, value, errorAcceptor);
    }
}
