/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.ModuleRenaming;
import de.cau.cs.kieler.esterel.Renamings;
import de.cau.cs.kieler.esterel.Run;

import de.cau.cs.kieler.scl.impl.StatementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RunImpl#getModule <em>Module</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.RunImpl#getRenamings <em>Renamings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunImpl extends StatementImpl implements Run {
    /**
     * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModule()
     * @generated
     * @ordered
     */
    protected ModuleRenaming module;

    /**
     * The cached value of the '{@link #getRenamings() <em>Renamings</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRenamings()
     * @generated
     * @ordered
     */
    protected EList<Renamings> renamings;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RunImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.RUN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModuleRenaming getModule() {
        return module;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModule(ModuleRenaming newModule, NotificationChain msgs) {
        ModuleRenaming oldModule = module;
        module = newModule;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.RUN__MODULE, oldModule, newModule);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModule(ModuleRenaming newModule) {
        if (newModule != module) {
            NotificationChain msgs = null;
            if (module != null)
                msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.RUN__MODULE, null, msgs);
            if (newModule != null)
                msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.RUN__MODULE, null, msgs);
            msgs = basicSetModule(newModule, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.RUN__MODULE, newModule, newModule));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Renamings> getRenamings() {
        if (renamings == null) {
            renamings = new EObjectContainmentEList<Renamings>(Renamings.class, this, EsterelPackage.RUN__RENAMINGS);
        }
        return renamings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.RUN__MODULE:
                return basicSetModule(null, msgs);
            case EsterelPackage.RUN__RENAMINGS:
                return ((InternalEList<?>)getRenamings()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.RUN__MODULE:
                return getModule();
            case EsterelPackage.RUN__RENAMINGS:
                return getRenamings();
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
            case EsterelPackage.RUN__MODULE:
                setModule((ModuleRenaming)newValue);
                return;
            case EsterelPackage.RUN__RENAMINGS:
                getRenamings().clear();
                getRenamings().addAll((Collection<? extends Renamings>)newValue);
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
            case EsterelPackage.RUN__MODULE:
                setModule((ModuleRenaming)null);
                return;
            case EsterelPackage.RUN__RENAMINGS:
                getRenamings().clear();
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
            case EsterelPackage.RUN__MODULE:
                return module != null;
            case EsterelPackage.RUN__RENAMINGS:
                return renamings != null && !renamings.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RunImpl
