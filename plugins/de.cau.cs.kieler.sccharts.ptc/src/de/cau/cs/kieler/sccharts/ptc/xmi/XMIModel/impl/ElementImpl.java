/**
 */
package de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl;

import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Attribute;
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.Element;
import de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.XMIModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.ElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.ElementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.ptc.xmi.XMIModel.impl.ElementImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildren()
     * @generated
     * @ordered
     */
    protected EList<Element> children;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<Attribute> attributes;

    /**
     * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContent()
     * @generated
     * @ordered
     */
    protected static final String CONTENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContent()
     * @generated
     * @ordered
     */
    protected String content = CONTENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMIModelPackage.Literals.ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMIModelPackage.ELEMENT__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Element> getChildren() {
        if (children == null) {
            children = new EObjectResolvingEList<Element>(Element.class, this, XMIModelPackage.ELEMENT__CHILDREN);
        }
        return children;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, XMIModelPackage.ELEMENT__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContent() {
        return content;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContent(String newContent) {
        String oldContent = content;
        content = newContent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMIModelPackage.ELEMENT__CONTENT, oldContent, content));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMIModelPackage.ELEMENT__TYPE:
                return getType();
            case XMIModelPackage.ELEMENT__CHILDREN:
                return getChildren();
            case XMIModelPackage.ELEMENT__ATTRIBUTES:
                return getAttributes();
            case XMIModelPackage.ELEMENT__CONTENT:
                return getContent();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XMIModelPackage.ELEMENT__TYPE:
                setType((String)newValue);
                return;
            case XMIModelPackage.ELEMENT__CHILDREN:
                getChildren().clear();
                getChildren().addAll((Collection<? extends Element>)newValue);
                return;
            case XMIModelPackage.ELEMENT__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
                return;
            case XMIModelPackage.ELEMENT__CONTENT:
                setContent((String)newValue);
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
            case XMIModelPackage.ELEMENT__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case XMIModelPackage.ELEMENT__CHILDREN:
                getChildren().clear();
                return;
            case XMIModelPackage.ELEMENT__ATTRIBUTES:
                getAttributes().clear();
                return;
            case XMIModelPackage.ELEMENT__CONTENT:
                setContent(CONTENT_EDEFAULT);
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
            case XMIModelPackage.ELEMENT__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case XMIModelPackage.ELEMENT__CHILDREN:
                return children != null && !children.isEmpty();
            case XMIModelPackage.ELEMENT__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case XMIModelPackage.ELEMENT__CONTENT:
                return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
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
        result.append(" (Type: ");
        result.append(type);
        result.append(", Content: ");
        result.append(content);
        result.append(')');
        return result.toString();
    }

} //ElementImpl
