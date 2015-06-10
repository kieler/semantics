/**
 */
package de.cau.cs.kieler.core.kexpressions.text.kext.impl;

import de.cau.cs.kieler.core.kexpressions.keffects.Effect;

import de.cau.cs.kieler.core.kexpressions.text.kext.AnnotatedExpression;
import de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage;
import de.cau.cs.kieler.core.kexpressions.text.kext.TestEntity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.TestEntityImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.text.kext.impl.TestEntityImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestEntityImpl extends MinimalEObjectImpl.Container implements TestEntity
{
  /**
     * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #getEffect()
     * @generated
     * @ordered
     */
  protected Effect effect;

  /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
  protected AnnotatedExpression expression;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  protected TestEntityImpl()
  {
        super();
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  protected EClass eStaticClass()
  {
        return KextPackage.Literals.TEST_ENTITY;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public Effect getEffect()
  {
        return effect;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public NotificationChain basicSetEffect(Effect newEffect, NotificationChain msgs)
  {
        Effect oldEffect = effect;
        effect = newEffect;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KextPackage.TEST_ENTITY__EFFECT, oldEffect, newEffect);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public void setEffect(Effect newEffect)
  {
        if (newEffect != effect) {
            NotificationChain msgs = null;
            if (effect != null)
                msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KextPackage.TEST_ENTITY__EFFECT, null, msgs);
            if (newEffect != null)
                msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KextPackage.TEST_ENTITY__EFFECT, null, msgs);
            msgs = basicSetEffect(newEffect, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KextPackage.TEST_ENTITY__EFFECT, newEffect, newEffect));
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public AnnotatedExpression getExpression()
  {
        return expression;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public NotificationChain basicSetExpression(AnnotatedExpression newExpression, NotificationChain msgs)
  {
        AnnotatedExpression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KextPackage.TEST_ENTITY__EXPRESSION, oldExpression, newExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public void setExpression(AnnotatedExpression newExpression)
  {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KextPackage.TEST_ENTITY__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KextPackage.TEST_ENTITY__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KextPackage.TEST_ENTITY__EXPRESSION, newExpression, newExpression));
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
        switch (featureID) {
            case KextPackage.TEST_ENTITY__EFFECT:
                return basicSetEffect(null, msgs);
            case KextPackage.TEST_ENTITY__EXPRESSION:
                return basicSetExpression(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
        switch (featureID) {
            case KextPackage.TEST_ENTITY__EFFECT:
                return getEffect();
            case KextPackage.TEST_ENTITY__EXPRESSION:
                return getExpression();
        }
        return super.eGet(featureID, resolve, coreType);
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  public void eSet(int featureID, Object newValue)
  {
        switch (featureID) {
            case KextPackage.TEST_ENTITY__EFFECT:
                setEffect((Effect)newValue);
                return;
            case KextPackage.TEST_ENTITY__EXPRESSION:
                setExpression((AnnotatedExpression)newValue);
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
  public void eUnset(int featureID)
  {
        switch (featureID) {
            case KextPackage.TEST_ENTITY__EFFECT:
                setEffect((Effect)null);
                return;
            case KextPackage.TEST_ENTITY__EXPRESSION:
                setExpression((AnnotatedExpression)null);
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
  public boolean eIsSet(int featureID)
  {
        switch (featureID) {
            case KextPackage.TEST_ENTITY__EFFECT:
                return effect != null;
            case KextPackage.TEST_ENTITY__EXPRESSION:
                return expression != null;
        }
        return super.eIsSet(featureID);
    }

} //TestEntityImpl
