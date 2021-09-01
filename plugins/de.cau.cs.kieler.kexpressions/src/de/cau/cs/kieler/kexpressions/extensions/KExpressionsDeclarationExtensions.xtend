/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kexpressions.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ExternString
import de.cau.cs.kieler.kexpressions.FloatValue
import de.cau.cs.kieler.kexpressions.IntValue
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ScheduleDeclaration
import de.cau.cs.kieler.kexpressions.StringValue
import de.cau.cs.kieler.kexpressions.Value
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.KExtFactory
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 * @kieler.design 2015-08-19 proposed 
 * @kieler.rating 2015-08-19 proposed yellow
 */
class KExpressionsDeclarationExtensions {
    
    @Inject extension EcoreUtilExtensions
    @Inject extension AnnotationsExtensions
    
    def dispatch Declaration createDeclaration(VariableDeclaration declaration) {
        declaration.createVariableDeclaration
    }
    
    def dispatch Declaration createDeclaration(ReferenceDeclaration declaration) {
        declaration.createReferenceDeclaration
    }
    
    def dispatch Declaration createDeclaration(ScheduleDeclaration declaration) {
        declaration.createScheduleDeclaration
    }
    
    def dispatch Declaration createDeclaration(ClassDeclaration declaration) {
        declaration.createClassDeclaration(true)
    }
    
    def dispatch Declaration createDeclaration(MethodDeclaration declaration) {
        declaration.createMethodDeclaration(true)
    }
    
    /**
     * @deprecated
     */
    def VariableDeclaration createDeclaration() {
        createVariableDeclaration
    }   
    
    def VariableDeclaration createVariableDeclaration() {
        KExpressionsFactory::eINSTANCE.createVariableDeclaration
    }
    
    def ClassDeclaration createClassDeclaration() {
        KExtFactory::eINSTANCE.createClassDeclaration => [type = ValueType.CLASS]
    } 
    
    def MethodDeclaration createMethodDeclaration() {
        KExpressionsFactory::eINSTANCE.createMethodDeclaration
    }
        
    def VariableDeclaration createVariableDeclaration(ValueType valueType) {
        KExpressionsFactory::eINSTANCE.createVariableDeclaration => [
            type = valueType
        ]
    }   
    
    
    def VariableDeclaration createSignalDeclaration() {
        val decl = createVariableDeclaration(ValueType::PURE)
        decl.signal = true
        decl
    }    
    
    def VariableDeclaration createIntDeclaration() {
        createVariableDeclaration(ValueType::INT)
    }    

    def VariableDeclaration createBoolDeclaration() {
        createVariableDeclaration(ValueType::BOOL)
    }    

    def VariableDeclaration createFloatDeclaration() {
        createVariableDeclaration(ValueType::FLOAT)
    }    

    def VariableDeclaration createStringDeclaration() {
        createVariableDeclaration(ValueType::STRING)
    }    
    
    def VariableDeclaration createVariableDeclaration(VariableDeclaration declaration) {
        (createVariableDeclaration as VariableDeclaration) => [
            type = declaration.type
            input = declaration.input
            output = declaration.output
            signal = declaration.signal
            static = declaration.static
            const = declaration.const
            extern = declaration.extern
            volatile = declaration.volatile
            hostType = declaration.hostType
            access = declaration.access
        ]
    }
    
    def ClassDeclaration createClassDeclaration(ClassDeclaration declaration, boolean deep) {
        return (createClassDeclaration as ClassDeclaration) => [
            name = declaration.name
            
            type = declaration.type
            input = declaration.input
            output = declaration.output
            signal = declaration.signal
            static = declaration.static
            const = declaration.const
            extern = declaration.extern
            volatile = declaration.volatile
            hostType = declaration.hostType
            host = declaration.host
            access = declaration.access
            
            if (deep) {
                declarations += declaration.declarations.copyDeclarations
            }
        ]
    }
    
    def MethodDeclaration createMethodDeclaration(MethodDeclaration declaration, boolean deep) {
        return (createMethodDeclaration as MethodDeclaration) => [
            access = declaration.access
            returnType = declaration.returnType
            
            if (deep) {
                parameterDeclarations += declaration.parameterDeclarations.copyDeclarations
            }
        ]
    } 
    
    def dispatch Declaration createDeclaration(Value value) {
        if (value instanceof IntValue) createIntDeclaration
        else if (value instanceof BoolValue) createBoolDeclaration
        else if (value instanceof FloatValue) createFloatDeclaration
        else if (value instanceof StringValue) createStringDeclaration
        else createDeclaration
    }
    
    def VariableDeclaration applyAttributes(VariableDeclaration declaration, VariableDeclaration declarationWithAttributes) {
        declaration => [
            input = declarationWithAttributes.input
            output = declarationWithAttributes.output
            static = declarationWithAttributes.static
            const = declarationWithAttributes.const
            extern = declarationWithAttributes.extern
            type = declarationWithAttributes.type
            access = declarationWithAttributes.access
        ]
    }
    
    def ReferenceDeclaration createReferenceDeclaration() {
        KExpressionsFactory::eINSTANCE.createReferenceDeclaration
    } 
    
    def ReferenceDeclaration createReferenceDeclaration(ReferenceDeclaration declaration) {
        (createReferenceDeclaration as ReferenceDeclaration) => [ d |
            d.reference = declaration.reference
            d.access = declaration.access
            d.genericParameters += declaration.genericParameters.map[copy]
            declaration.extern.forEach[
                d.extern += it.createExternString
            ]
        ]
    }
    
    def createExternString(String code) {
        KExpressionsFactory.eINSTANCE.createExternString => [
            it.code = code
        ]
    }
    
    def createExternString(ExternString externString) {
        createExternString(externString.code) => [ e |
            externString.annotations.forEach[
                e.annotations += it.copy
            ]
        ]
    }
    
    def ScheduleDeclaration createScheduleDeclaration() {
        KExpressionsFactory::eINSTANCE.createScheduleDeclaration
    }
    
    def ScheduleDeclaration createScheduleDeclaration(ScheduleDeclaration declaration) {
        createScheduleDeclaration => [ d |
            d.name = declaration.name
            d.global = declaration.global
            declaration.priorities.forEach[
                d.priorities.add(it)
            ]            
        ]
    }
        
        
    def void delete(Declaration declaration) {
        declaration.valuedObjects.immutableCopy.forEach[ remove ]
        declaration.remove
    }
    
    def List<Declaration> copyDeclarations(List<Declaration> declaratins) {
        return declaratins.copyDeclarations(null, null)
    }
    
    /**
     * Mappings are old -> new
     */
    def List<Declaration> copyDeclarations(List<Declaration> declaratins, Map<ValuedObject, ValuedObject> voMapping, Map<Declaration, Declaration> declMapping) {
        val newDecls = newArrayList
        for (decl : declaratins) {
            val newDecl = if (decl instanceof ClassDeclaration) {
                createClassDeclaration(decl, false)
            } else if (decl instanceof MethodDeclaration) {
                createMethodDeclaration(decl, false)
            } else {
                createDeclaration(decl)
            }
            newDecls += newDecl
            if (declMapping !== null) declMapping.put(decl, newDecl)
            
            decl.copyAnnotations(newDecl)
            
            if (newDecl instanceof ClassDeclaration) {
                newDecl.declarations += (decl as ClassDeclaration).declarations.copyDeclarations(voMapping, declMapping)
            } else if (newDecl instanceof MethodDeclaration) {
                newDecl.parameterDeclarations += (decl as MethodDeclaration).parameterDeclarations.copyDeclarations(voMapping, declMapping)
            }
            
            for (vo : decl.valuedObjects) {
                val newVO = vo.copy
                if (voMapping !== null) voMapping.put(vo, newVO)
                newDecl.valuedObjects += newVO
            }
        }
        return newDecls
    }   
    
    def List<VariableDeclaration> getVariableDeclarations(EObject eObject) {
        <VariableDeclaration> newArrayList => [ list |
            eObject.eContents.filter(VariableDeclaration).forEach[ list += it ]
        ]
    }  
    
    def List<ReferenceDeclaration> getReferenceDeclarations(EObject eObject) {
        <ReferenceDeclaration> newArrayList => [ list |
            eObject.eContents.filter(ReferenceDeclaration).forEach[ list += it ]
        ]
    }
    
    def List<MethodDeclaration> getMethodDeclarations(EObject eObject) {
        <MethodDeclaration> newArrayList => [ list |
            eObject.eContents.filter(MethodDeclaration).forEach[ list += it ]
        ]
    } 
    
    def Iterable<Declaration> excludeMethods(Iterable<Declaration> iter) {
        return iter.filter[!(it instanceof MethodDeclaration)]
    }
    
//    def ReferenceDeclaration getReferenceDeclaration(ValuedObject valuedObject) {
//        valuedObject.eContainer as ReferenceDeclaration
//    }   
 
    def Declaration checkAndCleanup(Declaration declaration) {
        if (declaration.valuedObjects.nullOrEmpty) { 
            declaration.remove
        }
        declaration
    }

    def getInnerValuedObjects(ClassDeclaration decl) {
        return decl.declarations.map[valuedObjects].flatten
    }

    def getAllNestedValuedObjects(ClassDeclaration decl) {
        return decl.innerValuedObjects + decl.declarations.filter(ClassDeclaration).map[innerValuedObjects].flatten
    }

    def getEnclosingClass(Declaration decl) {
        val parent = decl.eContainer
        if (parent instanceof ClassDeclaration) {
            return parent
        }
        return null
    }

    def isStruct(Declaration decl) {
        if (decl instanceof ClassDeclaration) {
            return decl.type === ValueType.STRUCT
        }
        return false
    }
    
    def isClass(Declaration decl) {
        if (decl instanceof ClassDeclaration) {
            return decl.type === ValueType.STRUCT || decl.type === ValueType.CLASS
        }
        return false
    }
    
    def isEnum(Declaration decl) {
        if (decl instanceof ClassDeclaration) {
            return decl.type === ValueType.ENUM
        }
        return false
    }
    
}