/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scgdep.util;

import de.cau.cs.kieler.core.annotations.Annotatable;

import de.cau.cs.kieler.scg.Link;

import de.cau.cs.kieler.scgdep.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.scgdep.ScgdepPackage
 * @generated
 */
public class ScgdepSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ScgdepPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScgdepSwitch() {
        if (modelPackage == null) {
            modelPackage = ScgdepPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ScgdepPackage.DEPENDENCY: {
                Dependency dependency = (Dependency)theEObject;
                T result = caseDependency(dependency);
                if (result == null) result = caseLink(dependency);
                if (result == null) result = caseAnnotatable(dependency);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgdepPackage.ABSOLUTE_WRITE_READ: {
                AbsoluteWrite_Read absoluteWrite_Read = (AbsoluteWrite_Read)theEObject;
                T result = caseAbsoluteWrite_Read(absoluteWrite_Read);
                if (result == null) result = caseDependency(absoluteWrite_Read);
                if (result == null) result = caseLink(absoluteWrite_Read);
                if (result == null) result = caseAnnotatable(absoluteWrite_Read);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgdepPackage.RELATIVE_WRITE_READ: {
                RelativeWrite_Read relativeWrite_Read = (RelativeWrite_Read)theEObject;
                T result = caseRelativeWrite_Read(relativeWrite_Read);
                if (result == null) result = caseDependency(relativeWrite_Read);
                if (result == null) result = caseLink(relativeWrite_Read);
                if (result == null) result = caseAnnotatable(relativeWrite_Read);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgdepPackage.ABSOLUTE_WRITE_RELATIVE_WRITE: {
                AbsoluteWrite_RelativeWrite absoluteWrite_RelativeWrite = (AbsoluteWrite_RelativeWrite)theEObject;
                T result = caseAbsoluteWrite_RelativeWrite(absoluteWrite_RelativeWrite);
                if (result == null) result = caseDependency(absoluteWrite_RelativeWrite);
                if (result == null) result = caseLink(absoluteWrite_RelativeWrite);
                if (result == null) result = caseAnnotatable(absoluteWrite_RelativeWrite);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ScgdepPackage.WRITE_WRITE: {
                Write_Write write_Write = (Write_Write)theEObject;
                T result = caseWrite_Write(write_Write);
                if (result == null) result = caseDependency(write_Write);
                if (result == null) result = caseLink(write_Write);
                if (result == null) result = caseAnnotatable(write_Write);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDependency(Dependency object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Absolute Write Read</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Absolute Write Read</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbsoluteWrite_Read(AbsoluteWrite_Read object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relative Write Read</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relative Write Read</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelativeWrite_Read(RelativeWrite_Read object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Absolute Write Relative Write</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Absolute Write Relative Write</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbsoluteWrite_RelativeWrite(AbsoluteWrite_RelativeWrite object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Write Write</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Write Write</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWrite_Write(Write_Write object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotatable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotatable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotatable(Annotatable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Link</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLink(Link object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ScgdepSwitch
