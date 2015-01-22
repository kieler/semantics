/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.core.kexpressions.Declaration;

import de.cau.cs.kieler.scgprios.BasicBlock_P;
import de.cau.cs.kieler.scgprios.Guard_P;
import de.cau.cs.kieler.scgprios.Node_P;
import de.cau.cs.kieler.scgprios.SCGraph_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;
import de.cau.cs.kieler.scgprios.Schedule_P;

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
 * An implementation of the model object '<em><b>SC Graph P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.SCGraph_PImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.SCGraph_PImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.SCGraph_PImpl#getBasicBlocks <em>Basic Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.SCGraph_PImpl#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.SCGraph_PImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.SCGraph_PImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCGraph_PImpl extends AnnotatableImpl implements SCGraph_P {
    /**
     * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodes()
     * @generated
     * @ordered
     */
    protected EList<Node_P> nodes;

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
     * The cached value of the '{@link #getBasicBlocks() <em>Basic Blocks</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBasicBlocks()
     * @generated
     * @ordered
     */
    protected EList<BasicBlock_P> basicBlocks;

    /**
     * The cached value of the '{@link #getSchedules() <em>Schedules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedules()
     * @generated
     * @ordered
     */
    protected EList<Schedule_P> schedules;

    /**
     * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGuards()
     * @generated
     * @ordered
     */
    protected EList<Guard_P> guards;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SCGraph_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.SC_GRAPH_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Node_P> getNodes() {
        if (nodes == null) {
            nodes = new EObjectContainmentEList<Node_P>(Node_P.class, this, ScgpriosPackage.SC_GRAPH_P__NODES);
        }
        return nodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, ScgpriosPackage.SC_GRAPH_P__DECLARATIONS);
        }
        return declarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BasicBlock_P> getBasicBlocks() {
        if (basicBlocks == null) {
            basicBlocks = new EObjectContainmentEList<BasicBlock_P>(BasicBlock_P.class, this, ScgpriosPackage.SC_GRAPH_P__BASIC_BLOCKS);
        }
        return basicBlocks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Schedule_P> getSchedules() {
        if (schedules == null) {
            schedules = new EObjectContainmentEList<Schedule_P>(Schedule_P.class, this, ScgpriosPackage.SC_GRAPH_P__SCHEDULES);
        }
        return schedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Guard_P> getGuards() {
        if (guards == null) {
            guards = new EObjectContainmentEList<Guard_P>(Guard_P.class, this, ScgpriosPackage.SC_GRAPH_P__GUARDS);
        }
        return guards;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.SC_GRAPH_P__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.SC_GRAPH_P__NODES:
                return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
            case ScgpriosPackage.SC_GRAPH_P__DECLARATIONS:
                return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
            case ScgpriosPackage.SC_GRAPH_P__BASIC_BLOCKS:
                return ((InternalEList<?>)getBasicBlocks()).basicRemove(otherEnd, msgs);
            case ScgpriosPackage.SC_GRAPH_P__SCHEDULES:
                return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
            case ScgpriosPackage.SC_GRAPH_P__GUARDS:
                return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
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
            case ScgpriosPackage.SC_GRAPH_P__NODES:
                return getNodes();
            case ScgpriosPackage.SC_GRAPH_P__DECLARATIONS:
                return getDeclarations();
            case ScgpriosPackage.SC_GRAPH_P__BASIC_BLOCKS:
                return getBasicBlocks();
            case ScgpriosPackage.SC_GRAPH_P__SCHEDULES:
                return getSchedules();
            case ScgpriosPackage.SC_GRAPH_P__GUARDS:
                return getGuards();
            case ScgpriosPackage.SC_GRAPH_P__LABEL:
                return getLabel();
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
            case ScgpriosPackage.SC_GRAPH_P__NODES:
                getNodes().clear();
                getNodes().addAll((Collection<? extends Node_P>)newValue);
                return;
            case ScgpriosPackage.SC_GRAPH_P__DECLARATIONS:
                getDeclarations().clear();
                getDeclarations().addAll((Collection<? extends Declaration>)newValue);
                return;
            case ScgpriosPackage.SC_GRAPH_P__BASIC_BLOCKS:
                getBasicBlocks().clear();
                getBasicBlocks().addAll((Collection<? extends BasicBlock_P>)newValue);
                return;
            case ScgpriosPackage.SC_GRAPH_P__SCHEDULES:
                getSchedules().clear();
                getSchedules().addAll((Collection<? extends Schedule_P>)newValue);
                return;
            case ScgpriosPackage.SC_GRAPH_P__GUARDS:
                getGuards().clear();
                getGuards().addAll((Collection<? extends Guard_P>)newValue);
                return;
            case ScgpriosPackage.SC_GRAPH_P__LABEL:
                setLabel((String)newValue);
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
            case ScgpriosPackage.SC_GRAPH_P__NODES:
                getNodes().clear();
                return;
            case ScgpriosPackage.SC_GRAPH_P__DECLARATIONS:
                getDeclarations().clear();
                return;
            case ScgpriosPackage.SC_GRAPH_P__BASIC_BLOCKS:
                getBasicBlocks().clear();
                return;
            case ScgpriosPackage.SC_GRAPH_P__SCHEDULES:
                getSchedules().clear();
                return;
            case ScgpriosPackage.SC_GRAPH_P__GUARDS:
                getGuards().clear();
                return;
            case ScgpriosPackage.SC_GRAPH_P__LABEL:
                setLabel(LABEL_EDEFAULT);
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
            case ScgpriosPackage.SC_GRAPH_P__NODES:
                return nodes != null && !nodes.isEmpty();
            case ScgpriosPackage.SC_GRAPH_P__DECLARATIONS:
                return declarations != null && !declarations.isEmpty();
            case ScgpriosPackage.SC_GRAPH_P__BASIC_BLOCKS:
                return basicBlocks != null && !basicBlocks.isEmpty();
            case ScgpriosPackage.SC_GRAPH_P__SCHEDULES:
                return schedules != null && !schedules.isEmpty();
            case ScgpriosPackage.SC_GRAPH_P__GUARDS:
                return guards != null && !guards.isEmpty();
            case ScgpriosPackage.SC_GRAPH_P__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
        result.append(" (label: ");
        result.append(label);
        result.append(')');
        return result.toString();
    }

} //SCGraph_PImpl
