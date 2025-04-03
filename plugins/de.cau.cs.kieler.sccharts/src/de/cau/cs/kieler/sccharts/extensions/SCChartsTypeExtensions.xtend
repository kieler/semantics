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
package de.cau.cs.kieler.sccharts.extensions

import com.google.common.collect.Iterables
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.GenericParameterDeclaration
import de.cau.cs.kieler.kexpressions.GenericTypeReference
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ThisExpression
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValueTypeReference
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsAccessVisibilityExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsGenericParameterExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.sccharts.BaseStateReference
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.ScopeCall
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.processors.Reference
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension java.lang.String.format

/**
 * @author als
 *
 */
class SCChartsTypeExtensions {
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsGenericParameterExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension KExpressionsAccessVisibilityExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension SCChartsTypeExtensions 
    @Inject extension SCChartsReferenceExtensions
    @Inject extension SCChartsGenericTypeExtensions
    
    def dispatch boolean isValidSubtypeOf(EObject type, EObject base) {
        return type.checkForSubtypeProblem(base) === null
    }
    
    def dispatch String checkForSubtypeProblem(GenericParameterDeclaration decl, Expression exp) {
        val vo = decl.valuedObjects.head
        if (decl.isComplexTypeDeclaration && !decl.isPrimitiveTypeDeclaration) {
            val type = decl.type
            if (type instanceof State) {
                var EObject paramType = null
                if (exp instanceof GenericTypeReference) {
                    paramType = exp.type
                } else if (exp instanceof ValuedObjectReference) {
                    if (exp.isGenericParamter) {
                        paramType = exp.valuedObject.getReferencedScope
                    } else {
                        return "Type mismatch! Generic parameter %s cannot take a reference that is not a type.".format(vo?.name)
                    }
                } else {
                    return "Type mismatch! Generic parameter %s can only take a state type as parameter.".format(vo?.name)
                }
                
                if (paramType instanceof State) {
                    // Special handling because interfaces must match too (is instantiated by type)
                    if (type === paramType || paramType.allInheritedStates.contains(type)) {
                        val interfaceMismatches = paramType.interfaceMismatches(type)
                        if (!interfaceMismatches.empty) {
                            return "State %s in generic parameter for %s in not a valid subtype of %s. There are interface incompatibilities due to the following variables: ".format(paramType.name, vo?.name, type.name, interfaceMismatches.map[name].join(", "))
                        }
                    } else {
                        return "State %s in generic parameter for %s in not a subtype of %s.".format(paramType.name, vo?.name, type.name)
                    }
                } else {
                    return "Cannot infer state type from given parameter for %s.".format(vo?.name)
                }
            }
        } else if (decl.isReferenceDeclaration) {
            val type = decl.type
            if (type instanceof State) {
                var Object paramType = null
                if (exp instanceof ValuedObjectReference) {
                    if (exp.isGenericParamter) {
                        paramType = exp.valuedObject.getReferencedScope
                    } else if (exp.valuedObject.getReferenceDeclaration !== null) {
                        paramType = exp.valuedObject.getReferenceDeclaration.resolveReferencedScope
                    } else if (exp.valuedObject.getClassDeclaration !== null) {
                        paramType = exp.valuedObject.getClassDeclaration.getStringAnnotationValues(Reference.REF_CLASS_ORIGIN)
                    } else {
                        return "Type mismatch! Generic parameter %s can only take a variable of a reference declaration as parameter.".format(vo?.name)
                    }
                } else {
                    return "Type mismatch! Generic parameter %s can only take a variable of a reference declaration as parameter.".format(vo?.name)
                }
                
                if (paramType instanceof State) {
                    if (!type.isValidSubtypeOf(paramType)) {
                        return "State %s in the given reference declaration in generic parameter for %s in not a subtype of %s.".format(paramType.name, vo?.name, type?.name)
                    }
                } else if (paramType instanceof List) {
                    if (!paramType.contains(type.name)) {
                        return "Class of %s is derived from %s but is not a subtype of the generic parameter type %s.".format((exp as ValuedObjectReference).valuedObject?.name, paramType.join(", "), type?.name)
                    }
                } else {
                    return "Cannot infer state type from given parameter for %s.".format(vo?.name)
                }
            } else {
                return "Invalid generic type declaration of %s! Base type %s is not a state.".format(vo?.name, type?.name)
            }
        } else if (decl.isPrimitiveTypeDeclaration) {
             if (exp instanceof ValueTypeReference) {
                val type = decl.valueType
                if (type === ValueType.PRIMITIVE) {
                    if (!KExpressionsTypeExtensions.PRIMITIVES.contains(exp.valueType)) {
                        return "Type mismatch! Generic parameter %s of type %s cannot accept type %s."
                            .format(vo?.name, type?.literal, exp.valueType?.literal)
                    }
                } else if (exp.valueType !== type) {
                    return "Type mismatch! Generic parameter %s of type %s cannot accept type %s."
                        .format(vo?.name,type?.literal, exp.valueType?.literal)
                }
            } else {
                return "Generic parameter %s with primitive type restriction must be bound to a concrete primitive type, not %s."
                        .format(vo?.name, exp.class.simpleName)
            }
        } else {
            val type = decl.valueType
            if (type === ValueType.UNKNOWN) {
                return "Value type of generic parameter %s is not properly declared (%s).".format(vo?.name, type?.literal)
            } else if (exp instanceof Value) {
                val paramType = exp.valueType
                if (paramType !== type) {
                    return "Type mismatch! Generic parameter %s of type %s cannot take literal of type %s.".format(vo?.name, type?.literal, paramType?.literal)
                }
            } else if (exp instanceof ValuedObjectReference) {
                val paramType = if (exp.isVariableReference) {
                    exp.valuedObject.variableDeclaration.type
                } else if (exp.valuedObject.isGenericParamter) {
                    exp.valuedObject.genericParameterDeclaration.valueType
                }
                if (paramType !== type) {
                    return "Type mismatch! Generic parameter %s of type %s cannot take valued object declared with type %s.".format(vo?.name, type?.literal, paramType?.literal)
                }
            } else {
                return "Expressions as generic parameters are currently not allowed (%s).".format(exp.class.simpleName)
            }
        }
        
        return null
    }

    def dispatch String checkForSubtypeProblem(State type, State target) {
        if (type === target || target.allInheritedStates.contains(type)) {
            // ok
            return null
        } else {
            return "State %s is not a subtype of %s.".format(target.name, type.name)
        }
    }
    
    def dispatch String checkForSubtypeProblem(ReferenceDeclaration refDecl, ThisExpression exp) {
        val ref = refDecl.reference
        val thisRootState = exp.nextScope.rootState
        if (ref instanceof State) {
            if (!ref.isValidSubtypeOf(thisRootState)) {
                return "'this' (%s) is not a subtype of %s.".format(thisRootState.name, ref.name)
            }
        } else if (ref instanceof ValuedObjectReference) {
            // TODO handle generics
        }
        
        return null
    }
    
    def dispatch String checkForSubtypeProblem(ReferenceDeclaration refDecl, ValuedObjectReference vor) {
        val decl = vor.valuedObject?.declaration
        if (decl instanceof ReferenceDeclaration) {
            return refDecl.reference.checkForSubtypeProblem(decl.reference)
        } else if (decl instanceof GenericParameterDeclaration) {
            // TODO handle generics
        } else if (decl instanceof ClassDeclaration) {
            if (decl.hasAnnotation(Reference.REF_CLASS_ORIGIN)) {
                val types = decl.getStringAnnotationValues(Reference.REF_CLASS_ORIGIN)
                if (!types.contains(refDecl.reference.asNamedObject?.name)) {
                    return "Cannot substitute reference of type %s by object of types %s".format(refDecl.reference.asNamedObject?.name, decl.getStringAnnotationValues(Reference.REF_CLASS_ORIGIN).join("[", ", ", "]", [it]))
                }
            } else {
                return "Cannot substitute reference of type %s by native class of type %s".format(refDecl.reference.asNamedObject?.name, decl.name)
            }
        } else {
            return "Cannot substitute reference of type %s by valued object of type %s".format(refDecl.reference.asNamedObject?.name, if (decl instanceof VariableDeclaration) decl.type.literal else decl.class.simpleName)
        }
        
        return null
    }

    def dispatch String checkForSubtypeProblem(ReferenceDeclaration refDecl, Value value) {
        if (refDecl.simple) { // primitive ref
            try {
                var ValueType actualType = null
                val genericVO = refDecl.reference as ValuedObject
                val param = value.eContainer as Parameter
                val bindingSubject = param.eContainer
                val genericBindings = if (bindingSubject instanceof ScopeCall) {
                    (bindingSubject.eContainer as Scope).createGenericParameterBindings
                } else if (bindingSubject instanceof ValuedObject) {
                    bindingSubject.createGenericParameterBindings
                }
                val genericBinding = genericBindings.findFirst[targetValuedObject == genericVO]
                if (genericBinding !== null) {
                    val exp = genericBinding.sourceExpression
                    if (exp instanceof ValueTypeReference) {
                        actualType = exp.valueType
                    }
                } else { // Type was not bound directly but somewhere in the inheritance hierarchy
                    var State sccClass = null
                    var EObject container = value.eContainer
                    // Find SCChart that is target by this binding
                    while (sccClass === null && container !== null && !(container instanceof Scope)) {
                        if (container instanceof BaseStateReference) {
                            sccClass = container.target
                        } else if (container instanceof ReferenceDeclaration) {
                            sccClass = container.reference as State
                        }
                        container = container.eContainer
                    }
                    if (sccClass !== null) {
                        val genericState = genericVO.declaration.nextScope
                        val genericIdx = genericState.genericParameterDeclarations.indexOf(genericVO.declaration)
                        val baseRef = sccClass.allInheritedStateReferencesHierachically.findFirst[it.target === genericState]
                        if (baseRef !== null) {
                            val typeArg = baseRef.genericParameters.get(genericIdx).expression
                            // TODO support further indirection
                            if (typeArg instanceof ValueTypeReference) {
                                actualType = typeArg.valueType
                            }
                        }
                    }
                }
                
                if (actualType === null) {
                    return "Cannot determine type of %s".format(refDecl.reference.asNamedObject?.name)
                } else if (actualType !== value.inferTypeStrict) {
                    return "Type of literal value %s does not match generic type argument %s for %s".format(value.inferTypeStrict, actualType, genericVO.name)
                }
                
                return null
            } catch(Exception e) {
                return "Cannot determine type of %s".format(refDecl.reference.asNamedObject?.name)
            }
        } else {
            return "Cannot substitute complex reference type %s with value literal of type %s".format(refDecl.reference.asNamedObject?.name, value.class.simpleName)
        }
    }
 
    def dispatch String checkForSubtypeProblem(EObject type, EObject base) {
        return "Cannot substitute type %s with %s".format(type.class.simpleName, base.class.simpleName)
    }
    
    def dispatch String checkForSubtypeProblem(EObject type, Void base) {
        return null
    }
    def dispatch String checkForSubtypeProblem(Void type, EObject base) {
        return null
    }
    def dispatch String checkForSubtypeProblem(Void type, Void base) {
        return null
    }   
    
    protected def Set<ValuedObject> interfaceMismatches(State subtype, State base) {
        return Sets.difference(
            Iterables.concat(subtype.declarations, subtype.allInheritedDeclarations).filter(VariableDeclaration).filter[input || output].map[valuedObjects].flatten.toSet,
            Iterables.concat(base.declarations, base.allInheritedDeclarations).filter(VariableDeclaration).filter[input || output].map[valuedObjects].flatten.toSet
        )
    }
    
    private def asNamedObject(EObject o) {
        if (o instanceof NamedObject) {
            return o as NamedObject
        }
        return null
    }
}