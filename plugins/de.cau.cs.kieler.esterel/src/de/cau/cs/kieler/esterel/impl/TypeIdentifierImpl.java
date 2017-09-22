/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.TypeDefinition;
import de.cau.cs.kieler.esterel.TypeIdentifier;

import de.cau.cs.kieler.kexpressions.CombineOperator;
import de.cau.cs.kieler.kexpressions.ValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TypeIdentifierImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TypeIdentifierImpl#getIdType <em>Id Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TypeIdentifierImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TypeIdentifierImpl#getEsterelType <em>Esterel Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeIdentifierImpl extends MinimalEObjectImpl.Container implements TypeIdentifier {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final ValueType TYPE_EDEFAULT = ValueType.PURE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ValueType type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdType()
     * @generated
     * @ordered
     */
    protected static final String ID_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdType()
     * @generated
     * @ordered
     */
    protected String idType = ID_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected static final CombineOperator OPERATOR_EDEFAULT = CombineOperator.NONE;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected CombineOperator operator = OPERATOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getEsterelType() <em>Esterel Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEsterelType()
     * @generated
     * @ordered
     */
    protected TypeDefinition esterelType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeIdentifierImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.TYPE_IDENTIFIER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ValueType newType) {
        ValueType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TYPE_IDENTIFIER__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIdType() {
        return idType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdType(String newIdType) {
        String oldIdType = idType;
        idType = newIdType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TYPE_IDENTIFIER__ID_TYPE, oldIdType, idType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombineOperator getOperator() {
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperator(CombineOperator newOperator) {
        CombineOperator oldOperator = operator;
        operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TYPE_IDENTIFIER__OPERATOR, oldOperator, operator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeDefinition getEsterelType() {
        if (esterelType != null && esterelType.eIsProxy()) {
            InternalEObject oldEsterelType = (InternalEObject)esterelType;
            esterelType = (TypeDefinition)eResolveProxy(oldEsterelType);
            if (esterelType != oldEsterelType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.TYPE_IDENTIFIER__ESTEREL_TYPE, oldEsterelType, esterelType));
            }
        }
        return esterelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeDefinition basicGetEsterelType() {
        return esterelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEsterelType(TypeDefinition newEsterelType) {
        TypeDefinition oldEsterelType = esterelType;
        esterelType = newEsterelType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TYPE_IDENTIFIER__ESTEREL_TYPE, oldEsterelType, esterelType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EsterelPackage.TYPE_IDENTIFIER__TYPE:
                return getType();
            case EsterelPackage.TYPE_IDENTIFIER__ID_TYPE:
                return getIdType();
            case EsterelPackage.TYPE_IDENTIFIER__OPERATOR:
                return getOperator();
            case EsterelPackage.TYPE_IDENTIFIER__ESTEREL_TYPE:
                if (resolve) return getEsterelType();
                return basicGetEsterelType();
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
            case EsterelPackage.TYPE_IDENTIFIER__TYPE:
                setType((ValueType)newValue);
                return;
            case EsterelPackage.TYPE_IDENTIFIER__ID_TYPE:
                setIdType((String)newValue);
                return;
            case EsterelPackage.TYPE_IDENTIFIER__OPERATOR:
                setOperator((CombineOperator)newValue);
                return;
            case EsterelPackage.TYPE_IDENTIFIER__ESTEREL_TYPE:
                setEsterelType((TypeDefinition)newValue);
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
            case EsterelPackage.TYPE_IDENTIFIER__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case EsterelPackage.TYPE_IDENTIFIER__ID_TYPE:
                setIdType(ID_TYPE_EDEFAULT);
                return;
            case EsterelPackage.TYPE_IDENTIFIER__OPERATOR:
                setOperator(OPERATOR_EDEFAULT);
                return;
            case EsterelPackage.TYPE_IDENTIFIER__ESTEREL_TYPE:
                setEsterelType((TypeDefinition)null);
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
            case EsterelPackage.TYPE_IDENTIFIER__TYPE:
                return type != TYPE_EDEFAULT;
            case EsterelPackage.TYPE_IDENTIFIER__ID_TYPE:
                return ID_TYPE_EDEFAULT == null ? idType != null : !ID_TYPE_EDEFAULT.equals(idType);
            case EsterelPackage.TYPE_IDENTIFIER__OPERATOR:
                return operator != OPERATOR_EDEFAULT;
            case EsterelPackage.TYPE_IDENTIFIER__ESTEREL_TYPE:
                return esterelType != null;
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
        result.append(" (type: ");
        result.append(type);
        result.append(", idType: ");
        result.append(idType);
        result.append(", operator: ");
        result.append(operator);
        result.append(')');
        return result.toString();
    }

} //TypeIdentifierImpl
