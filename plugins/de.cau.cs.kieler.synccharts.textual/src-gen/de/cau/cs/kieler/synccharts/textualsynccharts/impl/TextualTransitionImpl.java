/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.textualsynccharts.impl;

import de.cau.cs.kieler.synccharts.impl.TransitionImpl;

import de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition;
import de.cau.cs.kieler.synccharts.textualsynccharts.TextualsyncchartsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.textualsynccharts.impl.TextualTransitionImpl#isMakeFinal <em>Make Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.textualsynccharts.impl.TextualTransitionImpl#isMakeInitial <em>Make Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.textualsynccharts.impl.TextualTransitionImpl#isMakeConditional <em>Make Conditional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualTransitionImpl extends TransitionImpl implements TextualTransition {
    /**
     * The default value of the '{@link #isMakeFinal() <em>Make Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMakeFinal()
     * @generated
     * @ordered
     */
    protected static final boolean MAKE_FINAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMakeFinal() <em>Make Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMakeFinal()
     * @generated
     * @ordered
     */
    protected boolean makeFinal = MAKE_FINAL_EDEFAULT;

    /**
     * The default value of the '{@link #isMakeInitial() <em>Make Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMakeInitial()
     * @generated
     * @ordered
     */
    protected static final boolean MAKE_INITIAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMakeInitial() <em>Make Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMakeInitial()
     * @generated
     * @ordered
     */
    protected boolean makeInitial = MAKE_INITIAL_EDEFAULT;

    /**
     * The default value of the '{@link #isMakeConditional() <em>Make Conditional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMakeConditional()
     * @generated
     * @ordered
     */
    protected static final boolean MAKE_CONDITIONAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMakeConditional() <em>Make Conditional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMakeConditional()
     * @generated
     * @ordered
     */
    protected boolean makeConditional = MAKE_CONDITIONAL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TextualTransitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TextualsyncchartsPackage.Literals.TEXTUAL_TRANSITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMakeFinal() {
        return makeFinal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMakeFinal(boolean newMakeFinal) {
        boolean oldMakeFinal = makeFinal;
        makeFinal = newMakeFinal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_FINAL, oldMakeFinal, makeFinal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMakeInitial() {
        return makeInitial;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMakeInitial(boolean newMakeInitial) {
        boolean oldMakeInitial = makeInitial;
        makeInitial = newMakeInitial;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_INITIAL, oldMakeInitial, makeInitial));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMakeConditional() {
        return makeConditional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMakeConditional(boolean newMakeConditional) {
        boolean oldMakeConditional = makeConditional;
        makeConditional = newMakeConditional;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_CONDITIONAL, oldMakeConditional, makeConditional));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_FINAL:
                return isMakeFinal();
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_INITIAL:
                return isMakeInitial();
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_CONDITIONAL:
                return isMakeConditional();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_FINAL:
                setMakeFinal((Boolean)newValue);
                return;
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_INITIAL:
                setMakeInitial((Boolean)newValue);
                return;
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_CONDITIONAL:
                setMakeConditional((Boolean)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_FINAL:
                setMakeFinal(MAKE_FINAL_EDEFAULT);
                return;
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_INITIAL:
                setMakeInitial(MAKE_INITIAL_EDEFAULT);
                return;
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_CONDITIONAL:
                setMakeConditional(MAKE_CONDITIONAL_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_FINAL:
                return makeFinal != MAKE_FINAL_EDEFAULT;
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_INITIAL:
                return makeInitial != MAKE_INITIAL_EDEFAULT;
            case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_CONDITIONAL:
                return makeConditional != MAKE_CONDITIONAL_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (makeFinal: ");
        result.append(makeFinal);
        result.append(", makeInitial: ");
        result.append(makeInitial);
        result.append(", makeConditional: ");
        result.append(makeConditional);
        result.append(')');
        return result.toString();
    }

} //TextualTransitionImpl
