/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package textualsynccharts.impl;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.impl.TransitionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import textualsynccharts.TextualState;
import textualsynccharts.TextualTransition;
import textualsynccharts.TextualsyncchartsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link textualsynccharts.impl.TextualTransitionImpl#getTargetStateProxy <em>Target State Proxy</em>}</li>
 *   <li>{@link textualsynccharts.impl.TextualTransitionImpl#isMakeFinal <em>Make Final</em>}</li>
 *   <li>{@link textualsynccharts.impl.TextualTransitionImpl#isMakeConditional <em>Make Conditional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualTransitionImpl extends TransitionImpl implements TextualTransition {
    /**
	 * The default value of the '{@link #getTargetStateProxy() <em>Target State Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTargetStateProxy()
	 * @generated
	 * @ordered
	 */
    protected static final String TARGET_STATE_PROXY_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getTargetStateProxy() <em>Target State Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTargetStateProxy()
	 * @generated
	 * @ordered
	 */
    protected String targetStateProxy = TARGET_STATE_PROXY_EDEFAULT;

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
    public String getTargetStateProxy() {
		return targetStateProxy;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTargetStateProxy(String newTargetStateProxy) {
		String oldTargetStateProxy = targetStateProxy;
		targetStateProxy = newTargetStateProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualsyncchartsPackage.TEXTUAL_TRANSITION__TARGET_STATE_PROXY, oldTargetStateProxy, targetStateProxy));
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
			case TextualsyncchartsPackage.TEXTUAL_TRANSITION__TARGET_STATE_PROXY:
				return getTargetStateProxy();
			case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_FINAL:
				return isMakeFinal();
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
			case TextualsyncchartsPackage.TEXTUAL_TRANSITION__TARGET_STATE_PROXY:
				setTargetStateProxy((String)newValue);
				return;
			case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_FINAL:
				setMakeFinal((Boolean)newValue);
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
			case TextualsyncchartsPackage.TEXTUAL_TRANSITION__TARGET_STATE_PROXY:
				setTargetStateProxy(TARGET_STATE_PROXY_EDEFAULT);
				return;
			case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_FINAL:
				setMakeFinal(MAKE_FINAL_EDEFAULT);
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
			case TextualsyncchartsPackage.TEXTUAL_TRANSITION__TARGET_STATE_PROXY:
				return TARGET_STATE_PROXY_EDEFAULT == null ? targetStateProxy != null : !TARGET_STATE_PROXY_EDEFAULT.equals(targetStateProxy);
			case TextualsyncchartsPackage.TEXTUAL_TRANSITION__MAKE_FINAL:
				return makeFinal != MAKE_FINAL_EDEFAULT;
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
		result.append(" (targetStateProxy: ");
		result.append(targetStateProxy);
		result.append(", makeFinal: ");
		result.append(makeFinal);
		result.append(", makeConditional: ");
		result.append(makeConditional);
		result.append(')');
		return result.toString();
	}

} //TextualTransitionImpl
