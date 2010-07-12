/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Artifact;
import uml.Manifestation;
import uml.Operation;
import uml.Property;
import uml.Type;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ArtifactImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link uml.impl.ArtifactImpl#getNestedArtifact <em>Nested Artifact</em>}</li>
 *   <li>{@link uml.impl.ArtifactImpl#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link uml.impl.ArtifactImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.impl.ArtifactImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends ClassifierImpl implements Artifact {
    /**
     * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileName()
     * @generated
     * @ordered
     */
    protected static final String FILE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileName()
     * @generated
     * @ordered
     */
    protected String fileName = FILE_NAME_EDEFAULT;

    /**
     * This is true if the File Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fileNameESet;

    /**
     * The cached value of the '{@link #getNestedArtifact() <em>Nested Artifact</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNestedArtifact()
     * @generated
     * @ordered
     */
    protected EList<Artifact> nestedArtifact;

    /**
     * The cached value of the '{@link #getManifestation() <em>Manifestation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManifestation()
     * @generated
     * @ordered
     */
    protected EList<Manifestation> manifestation;

    /**
     * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedOperation()
     * @generated
     * @ordered
     */
    protected EList<Operation> ownedOperation;

    /**
     * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedAttribute()
     * @generated
     * @ordered
     */
    protected EList<Property> ownedAttribute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArtifactImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getArtifact();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFileName(String newFileName) {
        String oldFileName = fileName;
        fileName = newFileName;
        boolean oldFileNameESet = fileNameESet;
        fileNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ARTIFACT__FILE_NAME, oldFileName, fileName, !oldFileNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFileName() {
        String oldFileName = fileName;
        boolean oldFileNameESet = fileNameESet;
        fileName = FILE_NAME_EDEFAULT;
        fileNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.ARTIFACT__FILE_NAME, oldFileName, FILE_NAME_EDEFAULT, oldFileNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFileName() {
        return fileNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Artifact> getNestedArtifact() {
        if (nestedArtifact == null) {
            nestedArtifact = new EObjectContainmentEList<Artifact>(Artifact.class, this, UmlPackage.ARTIFACT__NESTED_ARTIFACT);
        }
        return nestedArtifact;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Manifestation> getManifestation() {
        if (manifestation == null) {
            manifestation = new EObjectContainmentEList<Manifestation>(Manifestation.class, this, UmlPackage.ARTIFACT__MANIFESTATION);
        }
        return manifestation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getOwnedOperation() {
        if (ownedOperation == null) {
            ownedOperation = new EObjectContainmentEList<Operation>(Operation.class, this, UmlPackage.ARTIFACT__OWNED_OPERATION);
        }
        return ownedOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getOwnedAttribute() {
        if (ownedAttribute == null) {
            ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, UmlPackage.ARTIFACT__OWNED_ATTRIBUTE);
        }
        return ownedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation createOwnedOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes, Type returnType) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createOwnedAttribute(String name, Type type, int lower, int upper) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.ARTIFACT__NESTED_ARTIFACT:
                return ((InternalEList<?>)getNestedArtifact()).basicRemove(otherEnd, msgs);
            case UmlPackage.ARTIFACT__MANIFESTATION:
                return ((InternalEList<?>)getManifestation()).basicRemove(otherEnd, msgs);
            case UmlPackage.ARTIFACT__OWNED_OPERATION:
                return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
            case UmlPackage.ARTIFACT__OWNED_ATTRIBUTE:
                return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.ARTIFACT__FILE_NAME:
                return getFileName();
            case UmlPackage.ARTIFACT__NESTED_ARTIFACT:
                return getNestedArtifact();
            case UmlPackage.ARTIFACT__MANIFESTATION:
                return getManifestation();
            case UmlPackage.ARTIFACT__OWNED_OPERATION:
                return getOwnedOperation();
            case UmlPackage.ARTIFACT__OWNED_ATTRIBUTE:
                return getOwnedAttribute();
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
            case UmlPackage.ARTIFACT__FILE_NAME:
                setFileName((String)newValue);
                return;
            case UmlPackage.ARTIFACT__NESTED_ARTIFACT:
                getNestedArtifact().clear();
                getNestedArtifact().addAll((Collection<? extends Artifact>)newValue);
                return;
            case UmlPackage.ARTIFACT__MANIFESTATION:
                getManifestation().clear();
                getManifestation().addAll((Collection<? extends Manifestation>)newValue);
                return;
            case UmlPackage.ARTIFACT__OWNED_OPERATION:
                getOwnedOperation().clear();
                getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
                return;
            case UmlPackage.ARTIFACT__OWNED_ATTRIBUTE:
                getOwnedAttribute().clear();
                getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
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
            case UmlPackage.ARTIFACT__FILE_NAME:
                unsetFileName();
                return;
            case UmlPackage.ARTIFACT__NESTED_ARTIFACT:
                getNestedArtifact().clear();
                return;
            case UmlPackage.ARTIFACT__MANIFESTATION:
                getManifestation().clear();
                return;
            case UmlPackage.ARTIFACT__OWNED_OPERATION:
                getOwnedOperation().clear();
                return;
            case UmlPackage.ARTIFACT__OWNED_ATTRIBUTE:
                getOwnedAttribute().clear();
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
            case UmlPackage.ARTIFACT__FILE_NAME:
                return isSetFileName();
            case UmlPackage.ARTIFACT__NESTED_ARTIFACT:
                return nestedArtifact != null && !nestedArtifact.isEmpty();
            case UmlPackage.ARTIFACT__MANIFESTATION:
                return manifestation != null && !manifestation.isEmpty();
            case UmlPackage.ARTIFACT__OWNED_OPERATION:
                return ownedOperation != null && !ownedOperation.isEmpty();
            case UmlPackage.ARTIFACT__OWNED_ATTRIBUTE:
                return ownedAttribute != null && !ownedAttribute.isEmpty();
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
        result.append(" (fileName: ");
        if (fileNameESet) result.append(fileName); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ArtifactImpl
