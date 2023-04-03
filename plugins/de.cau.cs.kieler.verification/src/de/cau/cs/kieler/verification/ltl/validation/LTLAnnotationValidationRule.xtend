/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification.ltl.validation

import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.AnnotationsPackage
import de.cau.cs.kieler.annotations.Pragma
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.validation.ExternalAnnotationValidationRule
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.verification.ltl.LTLFormulaStandaloneParser
import de.cau.cs.kieler.verification.ltl.LTLFormulaStandaloneSetup
import de.cau.cs.kieler.verification.ltl.lTLFormula.LTLExpression
import java.nio.charset.StandardCharsets
import java.util.ArrayList
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import org.eclipse.xtext.validation.ValidationMessageAcceptor

/**
 * @author als, jep
 */
class LTLAnnotationValidationRule implements ExternalAnnotationValidationRule {

    static val ANNOTATION_NAME = "LTL"

    val IResourceValidator validator = LTLFormulaStandaloneSetup.doSetup().getInstance(IResourceValidator)

    override apply(ValidationMessageAcceptor acceptor, Annotation annotation) {
        if (ANNOTATION_NAME.equals(annotation.name)) {
            if (annotation instanceof StringAnnotation) {
                for (value : annotation.values.indexed) {
                    val idx = value.key
                    val formula = value.value
                    // parse and show errors
                    val res = LTLFormulaStandaloneParser.createLTLResource(formula, StandardCharsets.UTF_8)
                    if (!res.errors.empty) {
                        acceptor.acceptError("Error(s) parsing formula: " + res.errors.map[message].join("\n"),
                            annotation, AnnotationsPackage.eINSTANCE.stringAnnotation_Values, idx, null, null)
                    } else { // if parsing was ok also validate (doing both may duplicate errors)
                        val issues = validator.validate(res, CheckMode.ALL, CancelIndicator.NullImpl)
                        val infos = issues.filter[severity == Severity.INFO]
                        val warinigs = issues.filter[severity == Severity.WARNING]
                        val errors = issues.filter[severity == Severity.ERROR]
                        if (!errors.empty) {
                            acceptor.acceptError(errors.map[message].join("\n"), annotation,
                                AnnotationsPackage.eINSTANCE.stringAnnotation_Values, idx, null, null)
                        } else if (!warinigs.empty) {
                            acceptor.acceptWarning(warinigs.map[message].join("\n"), annotation,
                                AnnotationsPackage.eINSTANCE.stringAnnotation_Values, idx, null, null)
                        } else if (!infos.empty) {
                            acceptor.acceptInfo(infos.map[message].join("\n"), annotation,
                                AnnotationsPackage.eINSTANCE.stringAnnotation_Values, idx, null, null)
                        } else {
                            val wrongVars = checkVariables(annotation, res.parseResult)
                            if (wrongVars.length !== 0) {
                                val msg = wrongVars.length > 1 ? "Variables " + wrongVars.join(", ") +
                                        " do not exist" : "Variable " + wrongVars.get(0) + " does not exist"
                                acceptor.acceptError(msg, annotation,
                                    AnnotationsPackage.eINSTANCE.stringAnnotation_Values, idx, null, null)
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Check whether the variables used in {@code annotation} are declared in its parent. The annotation must be an 
     * LTL annotation.
     * @param annotation The LTL annotation which variables should be checked.
     * @param parseResult The parse result of the annotation value and hence the LTL formula.
     * @return A list of variable names which are used in the LTL formula but are not declared. 
     */
    def ArrayList<String> checkVariables(StringAnnotation annotation, IParseResult parseResult) {
        val wrongVariables = new ArrayList<String>()
        if (annotation.eContainer instanceof State && parseResult.rootASTElement instanceof LTLExpression) {
            val annotationVariables = (annotation.eContainer as State).declarations.flatMap [ decl |
                decl.valuedObjects.map[object|object.name]
            ]
            for (decl : (parseResult.rootASTElement as LTLExpression).declarations) {
                for (variable : decl.valuedObjects) {
                    if (!annotationVariables.contains(variable.name)) {
                        wrongVariables.add(variable.name)
                    }
                }
            }
        }
        return wrongVariables
    }

    override apply(ValidationMessageAcceptor acceptor, Pragma pragma) {
        return
    }

}
