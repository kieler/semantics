/**
 */
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;
import de.cau.cs.kieler.core.kexpressions.Declaration;
import de.cau.cs.kieler.scg.BasicBlock;
import de.cau.cs.kieler.scg.Guard;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.ScgPackage;
import de.cau.cs.kieler.scg.Schedule;
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
 * An implementation of the model object '<em><b>SC Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SCGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SCGraphImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SCGraphImpl#getBasicBlocks <em>Basic Blocks</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SCGraphImpl#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SCGraphImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SCGraphImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCGraphImpl extends AnnotatableImpl implements SCGraph {
    /**
     * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodes()
     * @generated
     * @ordered
     */
    protected EList<Node> nodes;

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
    protected EList<BasicBlock> basicBlocks;

    /**
     * The cached value of the '{@link #getSchedules() <em>Schedules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedules()
     * @generated
     * @ordered
     */
    protected EList<Schedule> schedules;

    /**
     * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGuards()
     * @generated
     * @ordered
     */
    protected EList<Guard> guards;

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
    protected SCGraphImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgPackage.Literals.SC_GRAPH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Node> getNodes() {
        if (nodes == null) {
            nodes = new EObjectContainmentEList<Node>(Node.class, this, ScgPackage.SC_GRAPH__NODES);
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
            declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, ScgPackage.SC_GRAPH__DECLARATIONS);
        }
        return declarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<BasicBlock> getBasicBlocks() {
        if (basicBlocks == null) {
            basicBlocks = new EObjectContainmentEList<BasicBlock>(BasicBlock.class, this, ScgPackage.SC_GRAPH__BASIC_BLOCKS);
        }
        return basicBlocks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Schedule> getSchedules() {
        if (schedules == null) {
            schedules = new EObjectContainmentEList<Schedule>(Schedule.class, this, ScgPackage.SC_GRAPH__SCHEDULES);
        }
        return schedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Guard> getGuards() {
        if (guards == null) {
            guards = new EObjectContainmentEList<Guard>(Guard.class, this, ScgPackage.SC_GRAPH__GUARDS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.SC_GRAPH__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgPackage.SC_GRAPH__NODES:
                return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
            case ScgPackage.SC_GRAPH__DECLARATIONS:
                return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
            case ScgPackage.SC_GRAPH__BASIC_BLOCKS:
                return ((InternalEList<?>)getBasicBlocks()).basicRemove(otherEnd, msgs);
            case ScgPackage.SC_GRAPH__SCHEDULES:
                return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
            case ScgPackage.SC_GRAPH__GUARDS:
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
            case ScgPackage.SC_GRAPH__NODES:
                return getNodes();
            case ScgPackage.SC_GRAPH__DECLARATIONS:
                return getDeclarations();
            case ScgPackage.SC_GRAPH__BASIC_BLOCKS:
                return getBasicBlocks();
            case ScgPackage.SC_GRAPH__SCHEDULES:
                return getSchedules();
            case ScgPackage.SC_GRAPH__GUARDS:
                return getGuards();
            case ScgPackage.SC_GRAPH__LABEL:
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
            case ScgPackage.SC_GRAPH__NODES:
                getNodes().clear();
                getNodes().addAll((Collection<? extends Node>)newValue);
                return;
            case ScgPackage.SC_GRAPH__DECLARATIONS:
                getDeclarations().clear();
                getDeclarations().addAll((Collection<? extends Declaration>)newValue);
                return;
            case ScgPackage.SC_GRAPH__BASIC_BLOCKS:
                getBasicBlocks().clear();
                getBasicBlocks().addAll((Collection<? extends BasicBlock>)newValue);
                return;
            case ScgPackage.SC_GRAPH__SCHEDULES:
                getSchedules().clear();
                getSchedules().addAll((Collection<? extends Schedule>)newValue);
                return;
            case ScgPackage.SC_GRAPH__GUARDS:
                getGuards().clear();
                getGuards().addAll((Collection<? extends Guard>)newValue);
                return;
            case ScgPackage.SC_GRAPH__LABEL:
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
            case ScgPackage.SC_GRAPH__NODES:
                getNodes().clear();
                return;
            case ScgPackage.SC_GRAPH__DECLARATIONS:
                getDeclarations().clear();
                return;
            case ScgPackage.SC_GRAPH__BASIC_BLOCKS:
                getBasicBlocks().clear();
                return;
            case ScgPackage.SC_GRAPH__SCHEDULES:
                getSchedules().clear();
                return;
            case ScgPackage.SC_GRAPH__GUARDS:
                getGuards().clear();
                return;
            case ScgPackage.SC_GRAPH__LABEL:
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
            case ScgPackage.SC_GRAPH__NODES:
                return nodes != null && !nodes.isEmpty();
            case ScgPackage.SC_GRAPH__DECLARATIONS:
                return declarations != null && !declarations.isEmpty();
            case ScgPackage.SC_GRAPH__BASIC_BLOCKS:
                return basicBlocks != null && !basicBlocks.isEmpty();
            case ScgPackage.SC_GRAPH__SCHEDULES:
                return schedules != null && !schedules.isEmpty();
            case ScgPackage.SC_GRAPH__GUARDS:
                return guards != null && !guards.isEmpty();
            case ScgPackage.SC_GRAPH__LABEL:
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

} //SCGraphImpl
