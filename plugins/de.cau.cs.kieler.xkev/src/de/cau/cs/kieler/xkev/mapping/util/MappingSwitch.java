/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.util;

import de.cau.cs.kieler.xkev.mapping.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see de.cau.cs.kieler.xkev.mapping.MappingPackage
 * @generated
 */
public class MappingSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MappingPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappingSwitch() {
        if (modelPackage == null) {
            modelPackage = MappingPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case MappingPackage.SVG_FILE: {
                SVGFile svgFile = (SVGFile)theEObject;
                T result = caseSVGFile(svgFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MappingPackage.SVG_ELEMENT: {
                SVGElement svgElement = (SVGElement)theEObject;
                T result = caseSVGElement(svgElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MappingPackage.ANIMATION: {
                Animation animation = (Animation)theEObject;
                T result = caseAnimation(animation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MappingPackage.MOVE_PATH: {
                MovePath movePath = (MovePath)theEObject;
                T result = caseMovePath(movePath);
                if (result == null) result = caseAnimation(movePath);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MappingPackage.ROTATE: {
                Rotate rotate = (Rotate)theEObject;
                T result = caseRotate(rotate);
                if (result == null) result = caseAnimation(rotate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MappingPackage.MOVE: {
                Move move = (Move)theEObject;
                T result = caseMove(move);
                if (result == null) result = caseAnimation(move);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MappingPackage.COLORIZE: {
                Colorize colorize = (Colorize)theEObject;
                T result = caseColorize(colorize);
                if (result == null) result = caseAnimation(colorize);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case MappingPackage.TEXT: {
                Text text = (Text)theEObject;
                T result = caseText(text);
                if (result == null) result = caseAnimation(text);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SVG File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SVG File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSVGFile(SVGFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SVG Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SVG Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSVGElement(SVGElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RunnableAnimation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RunnableAnimation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnimation(Animation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Move Path</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Move Path</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMovePath(MovePath object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rotate</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rotate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRotate(Rotate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Move</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMove(Move object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Colorize</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Colorize</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColorize(Colorize object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseText(Text object) {
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
    public T defaultCase(EObject object) {
        return null;
    }

} //MappingSwitch
