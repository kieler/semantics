package de.cau.cs.kieler.lustre.validation

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.lustre.lustre.AState
import de.cau.cs.kieler.lustre.lustre.ClockedVariableDeclaration
import de.cau.cs.kieler.lustre.lustre.Equation
import de.cau.cs.kieler.lustre.lustre.ExternalNodeDeclaration
import de.cau.cs.kieler.lustre.lustre.ModelDeclaration
import de.cau.cs.kieler.lustre.lustre.NodeDeclaration
import de.cau.cs.kieler.lustre.lustre.NodeReference
import de.cau.cs.kieler.lustre.lustre.NodeValuedObject
import de.cau.cs.kieler.lustre.lustre.PackBody
import de.cau.cs.kieler.lustre.lustre.PackageDeclaration
import de.cau.cs.kieler.lustre.lustre.PackageEquation
import de.cau.cs.kieler.lustre.lustre.StaticParam
import de.cau.cs.kieler.lustre.lustre.TypeDeclaration
import java.util.HashSet
import java.util.LinkedList
import java.util.Set
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.lustre.extensions.LustreUtilityExtensions

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 * 
 * @author lgr
 */
class LustreValidator extends AbstractLustreValidator {

    static val String DUPLICATE_VARIABLE = "The variable is declared multiple times in this body."
    static val String UNUSED_VARIABLE = "The variable is not defined through any equations."
    static val String NOT_SUPPORTED_FEATURE = "The feature is not supported."
    static val String EQUATION_LIST_PARAM_NUM_MISMATCH = "Left side of equation does not match number of return values of the ReferenceCall."
    static val String CLOCK_EXPRESSION_MISMATCH = "The clocks in this expression are not compatible. "
    static val String OUTPUT_NOT_DEFINED = "The output is not defined through equations."
    static val String MULTIPLE_DEFINITIONS = "The variable is defined multiple times through equations."

    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension LustreUtilityExtensions

    /*
     * Checks for not supported language features.
     */
    @Check
    def checkModelDeclaration(ModelDeclaration modelDeclaration) {
        featureNotSupported(modelDeclaration);
    }

    @Check
    def checkPackageDeclaration(PackageDeclaration packageDeclaration) {
        featureNotSupported(packageDeclaration);
    }

    @Check
    def checkPackageEquation(PackageEquation packageEquation) {
        featureNotSupported(packageEquation);
    }

    @Check
    def checkExternalNodeDeclaration(ExternalNodeDeclaration externalNodeDeclaration) {
        featureNotSupported(externalNodeDeclaration);
    }

    @Check
    def checkTypeDeclaration(TypeDeclaration typeNodeDeclaration) {
        featureNotSupported(typeNodeDeclaration);
    }

    @Check
    def checkStaticParam(StaticParam staticParam) {
        featureNotSupported(staticParam);
    }

    @Check
    def checkNodeReference(NodeReference nodeReference) {
        featureNotSupported(nodeReference);
    }

    /*
     * Check actual language properties.
     */
    @Check
    override void checkPureSignal(VariableDeclaration declaration) {
        // LustreValuedObjects specify the type and their corresponding VariableDeclaration 
        // has the type pure (which is default). This is not an error, so override this method to 
        // ignore this check 
    }

    @Check
    def void checkDuplicateVariable(NodeDeclaration nodeDeclaration) {
        val Set<String> variableNames = newHashSet()
        var superContainer = nodeDeclaration.eContainer

        // Check the constants
        if (superContainer instanceof PackBody) {
            for (constantVariableDeclaration : superContainer.constants) {
                warnVariableExistsOrAddVariableToSet(variableNames, constantVariableDeclaration.valuedObjects)
            }
        }

        // Check the input parameter
        for (parameter : nodeDeclaration.input.parameter) {
            warnVariableExistsOrAddVariableToSet(variableNames, parameter.valuedObjects)
        }

        // Check the output parameter
        for (parameter : nodeDeclaration.output.parameter) {
            warnVariableExistsOrAddVariableToSet(variableNames, parameter.valuedObjects)
        }

        // Check the node constant variables        
        for (constantDeclaration : nodeDeclaration.constants) {
            warnVariableExistsOrAddVariableToSet(variableNames, constantDeclaration.valuedObjects)
        }

        // Check the node variables        
        for (clockedVariableDeclaration : nodeDeclaration.variables) {
            warnVariableExistsOrAddVariableToSet(variableNames, clockedVariableDeclaration.vardecl.valuedObjects)
        }
    }
    
    @Check
    def void checkVariableUnused(NodeDeclaration nodeDeclaration) {
        val Set<ValuedObject> variableNamesDefined = newHashSet()

        // Add all constants and variables used in the node to a set
        for (constantDeclaration : nodeDeclaration.constants) {
            for (ValuedObject constValObj : constantDeclaration.valuedObjects) {
                variableNamesDefined.add(constValObj)
            }
        }
        for (clockedVariableDeclaration : nodeDeclaration.variables) {
            for (ValuedObject valObj : clockedVariableDeclaration.vardecl.valuedObjects) {
                variableNamesDefined.add(valObj)
            }
        }
        
        // Derive all variables defined through equations
        val Set<ValuedObject> variableNamesUsed = getValuedObjectsFromEquations(nodeDeclaration.equations)
        variableNamesUsed.addAll(getValuedObjectsFromAutomatons(nodeDeclaration.automatons))
        
        // For those that are not defined, show a warning
        variableNamesDefined.removeAll(variableNamesUsed)
        
        for (valObj : variableNamesDefined) {
            warning(UNUSED_VARIABLE, valObj, null)
        }
    }

    @Check
    def checkDuplicateNodeName(PackBody packBody) {
        val Set<String> variableNames = newHashSet()

        for (node : packBody.nodes) {
            warnVariableExistsOrAddVariableToSet(variableNames, node.valuedObjects)
        }

    }

    @Check
    def checkClockConsistency(Expression expression) {
        val expressionContainer = expression.eContainer
        if (expressionContainer instanceof Equation) {
            if (expressionContainer.reference !== expression) {
                
                if (expressionContainer.reference !== null) {
                    val referenceDeclaration = expressionContainer.reference.valuedObject.declaration.eContainer
                    var clockExpr = null as ValuedObject;
                    if (referenceDeclaration instanceof ClockedVariableDeclaration) {
                        if (referenceDeclaration.clockExpr instanceof ValuedObjectReference) {
                            clockExpr = (referenceDeclaration.clockExpr as ValuedObjectReference).valuedObject
                        }
                    }
    
                    try {
                        if (!areClocksEqual(clockExpr, expression)) {
                            error(CLOCK_EXPRESSION_MISMATCH, expressionContainer, null)
                        }
                    } catch (IllegalStateException e) {
                        error(CLOCK_EXPRESSION_MISMATCH + "\n" + e.message, expressionContainer, null)
                    }
    
                }
            }
        }
    }
    
    @Check
    def checkCallReferenceReturnCardinalities(Equation equation) {

        val rightExpression = equation.expression
        if (rightExpression instanceof ReferenceCall) {

            val referenceValuedObject = rightExpression.valuedObject
            if (referenceValuedObject instanceof NodeValuedObject) {

                val calledNode = referenceValuedObject.eContainer;
                if (calledNode instanceof NodeDeclaration) {

                    var numReturnValues = 0
                    for (VariableDeclaration varDecl : calledNode.output.parameter) {
                        numReturnValues += varDecl.valuedObjects.size
                    }

                    if (numReturnValues == 1) {
                        if (equation.reference === null) {
                            error(EQUATION_LIST_PARAM_NUM_MISMATCH, equation, null)
                        }
                    } else {
                        if (numReturnValues != equation.references.length) {
                            error(EQUATION_LIST_PARAM_NUM_MISMATCH, equation, null)
                        }
                    }
                }
            }
        }
    }

    @Check
    def checkOutputDefined(NodeDeclaration node) {
        var HashSet<ValuedObject> valuedObjectSet = newHashSet
        
        // Save all variables from assignments
        for (Assignment equation : node.equations) {
            val valObj = equation.reference?.valuedObject
            if (valuedObjectSet.contains(valObj)) {
                warning(MULTIPLE_DEFINITIONS, valObj, null)
            } else if (valObj !== null) {
                valuedObjectSet.add(valObj)
            }
            if (equation instanceof Equation) {
                for (vo : equation.references.filterNull.map[valuedObject].filterNull) {
                    if (valuedObjectSet.contains(vo)) {
                        warning(MULTIPLE_DEFINITIONS, vo, null)
                    } else {
                        valuedObjectSet.add(vo)
                    }
                }
            }
        }

        var currAutomatons = new LinkedList(node.automatons)
        while (!currAutomatons.isEmpty) {
            var automaton = currAutomatons.head
            for (AState state : automaton.states) {
                for (Assignment equation : state.equations) {
                    valuedObjectSet.add(equation.reference.valuedObject)
                    currAutomatons.addAll(state.automatons)
                }
                currAutomatons.addAll(state.automatons)
            }
            currAutomatons.remove(automaton)
        }

        for (VariableDeclaration varDecl : node.output.parameter) {
            for (ValuedObject valObj : varDecl.valuedObjects) {
                if (!valuedObjectSet.contains(valObj)) {
                    warning(OUTPUT_NOT_DEFINED, valObj, null)
                }
            }
        }
    }

    private def warnVariableExistsOrAddVariableToSet(Set<String> set, EList<ValuedObject> valuedObjectList) {
        for (valuedObject : valuedObjectList) {
            val name = valuedObject.name
            if (set.contains(name)) {
                warning(DUPLICATE_VARIABLE, valuedObject, null)
            } else {
                set.add(name)
            }
        }
    }

    private def featureNotSupported(EObject object) {
        error(NOT_SUPPORTED_FEATURE + object.class.toString, object, null);
    }
}
