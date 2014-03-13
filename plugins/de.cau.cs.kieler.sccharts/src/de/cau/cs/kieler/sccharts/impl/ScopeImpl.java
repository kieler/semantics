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
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.core.kexpressions.TextExpression;
import de.cau.cs.kieler.core.kexpressions.Declaration;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.sccharts.Action;
import de.cau.cs.kieler.sccharts.LocalAction;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.Substitution;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getLocalActions <em>Local Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getBodyReference <em>Body Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getBodyContents <em>Body Contents</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getBodyText <em>Body Text</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getRenamings <em>Renamings</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ScopeImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ScopeImpl extends AnnotatableImpl implements Scope {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The cached value of the '{@link #getLocalActions() <em>Local Actions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalActions()
     * @generated
     * @ordered
     */
    protected EList<LocalAction> localActions;

    /**
     * The cached value of the '{@link #getBodyReference() <em>Body Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBodyReference()
     * @generated
     * @ordered
     */
    protected EObject bodyReference;

    /**
     * The cached value of the '{@link #getBodyContents() <em>Body Contents</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBodyContents()
     * @generated
     * @ordered
     */
    protected EObject bodyContents;

    /**
     * The cached value of the '{@link #getBodyText() <em>Body Text</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBodyText()
     * @generated
     * @ordered
     */
    protected EList<TextExpression> bodyText;

    /**
     * The cached value of the '{@link #getRenamings() <em>Renamings</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRenamings()
     * @generated
     * @ordered
     */
    protected EList<Substitution> renamings;

    /**
     * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeclarations()
     * @generated
     * @ordered
     */
    protected EList<Declaration> declarations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScopeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.SCOPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LocalAction> getLocalActions() {
        if (localActions == null) {
            localActions = new EObjectContainmentEList<LocalAction>(LocalAction.class, this, SCChartsPackage.SCOPE__LOCAL_ACTIONS);
        }
        return localActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getBodyReference() {
        if (bodyReference != null && bodyReference.eIsProxy()) {
            InternalEObject oldBodyReference = (InternalEObject)bodyReference;
            bodyReference = eResolveProxy(oldBodyReference);
            if (bodyReference != oldBodyReference) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.SCOPE__BODY_REFERENCE, oldBodyReference, bodyReference));
            }
        }
        return bodyReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetBodyReference() {
        return bodyReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBodyReference(EObject newBodyReference) {
        EObject oldBodyReference = bodyReference;
        bodyReference = newBodyReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__BODY_REFERENCE, oldBodyReference, bodyReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getBodyContents() {
        return bodyContents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBodyContents(EObject newBodyContents, NotificationChain msgs) {
        EObject oldBodyContents = bodyContents;
        bodyContents = newBodyContents;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__BODY_CONTENTS, oldBodyContents, newBodyContents);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBodyContents(EObject newBodyContents) {
        if (newBodyContents != bodyContents) {
            NotificationChain msgs = null;
            if (bodyContents != null)
                msgs = ((InternalEObject)bodyContents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.SCOPE__BODY_CONTENTS, null, msgs);
            if (newBodyContents != null)
                msgs = ((InternalEObject)newBodyContents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.SCOPE__BODY_CONTENTS, null, msgs);
            msgs = basicSetBodyContents(newBodyContents, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.SCOPE__BODY_CONTENTS, newBodyContents, newBodyContents));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TextExpression> getBodyText() {
        if (bodyText == null) {
            bodyText = new EObjectContainmentEList<TextExpression>(TextExpression.class, this, SCChartsPackage.SCOPE__BODY_TEXT);
        }
        return bodyText;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Substitution> getRenamings() {
        if (renamings == null) {
            renamings = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, SCChartsPackage.SCOPE__RENAMINGS, SCChartsPackage.SUBSTITUTION__PARENT_SCOPE);
        }
        return renamings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, SCChartsPackage.SCOPE__DECLARATIONS);
        }
        return declarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.SCOPE__RENAMINGS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRenamings()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
                return ((InternalEList<?>)getLocalActions()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.SCOPE__BODY_CONTENTS:
                return basicSetBodyContents(null, msgs);
            case SCChartsPackage.SCOPE__BODY_TEXT:
                return ((InternalEList<?>)getBodyText()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.SCOPE__RENAMINGS:
                return ((InternalEList<?>)getRenamings()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.SCOPE__DECLARATIONS:
                return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
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
            case SCChartsPackage.SCOPE__ID:
                return getId();
            case SCChartsPackage.SCOPE__LABEL:
                return getLabel();
            case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
                return getLocalActions();
            case SCChartsPackage.SCOPE__BODY_REFERENCE:
                if (resolve) return getBodyReference();
                return basicGetBodyReference();
            case SCChartsPackage.SCOPE__BODY_CONTENTS:
                return getBodyContents();
            case SCChartsPackage.SCOPE__BODY_TEXT:
                return getBodyText();
            case SCChartsPackage.SCOPE__RENAMINGS:
                return getRenamings();
            case SCChartsPackage.SCOPE__DECLARATIONS:
                return getDeclarations();
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
            case SCChartsPackage.SCOPE__ID:
                setId((String)newValue);
                return;
            case SCChartsPackage.SCOPE__LABEL:
                setLabel((String)newValue);
                return;
            case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
                getLocalActions().clear();
                getLocalActions().addAll((Collection<? extends LocalAction>)newValue);
                return;
            case SCChartsPackage.SCOPE__BODY_REFERENCE:
                setBodyReference((EObject)newValue);
                return;
            case SCChartsPackage.SCOPE__BODY_CONTENTS:
                setBodyContents((EObject)newValue);
                return;
            case SCChartsPackage.SCOPE__BODY_TEXT:
                getBodyText().clear();
                getBodyText().addAll((Collection<? extends TextExpression>)newValue);
                return;
            case SCChartsPackage.SCOPE__RENAMINGS:
                getRenamings().clear();
                getRenamings().addAll((Collection<? extends Substitution>)newValue);
                return;
            case SCChartsPackage.SCOPE__DECLARATIONS:
                getDeclarations().clear();
                getDeclarations().addAll((Collection<? extends Declaration>)newValue);
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
            case SCChartsPackage.SCOPE__ID:
                setId(ID_EDEFAULT);
                return;
            case SCChartsPackage.SCOPE__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
                getLocalActions().clear();
                return;
            case SCChartsPackage.SCOPE__BODY_REFERENCE:
                setBodyReference((EObject)null);
                return;
            case SCChartsPackage.SCOPE__BODY_CONTENTS:
                setBodyContents((EObject)null);
                return;
            case SCChartsPackage.SCOPE__BODY_TEXT:
                getBodyText().clear();
                return;
            case SCChartsPackage.SCOPE__RENAMINGS:
                getRenamings().clear();
                return;
            case SCChartsPackage.SCOPE__DECLARATIONS:
                getDeclarations().clear();
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
            case SCChartsPackage.SCOPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case SCChartsPackage.SCOPE__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
                return localActions != null && !localActions.isEmpty();
            case SCChartsPackage.SCOPE__BODY_REFERENCE:
                return bodyReference != null;
            case SCChartsPackage.SCOPE__BODY_CONTENTS:
                return bodyContents != null;
            case SCChartsPackage.SCOPE__BODY_TEXT:
                return bodyText != null && !bodyText.isEmpty();
            case SCChartsPackage.SCOPE__RENAMINGS:
                return renamings != null && !renamings.isEmpty();
            case SCChartsPackage.SCOPE__DECLARATIONS:
                return declarations != null && !declarations.isEmpty();
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
        result.append(" (id: ");
        result.append(id);
        result.append(", label: ");
        result.append(label);
        result.append(')');
        return result.toString();
    }

} //ScopeImpl
