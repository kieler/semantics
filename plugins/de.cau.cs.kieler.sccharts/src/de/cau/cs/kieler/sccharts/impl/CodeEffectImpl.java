/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.kexpressions.Declaration;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;
import de.cau.cs.kieler.kexpressions.keffects.Link;
import de.cau.cs.kieler.kexpressions.keffects.Linkable;

import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;
import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

import de.cau.cs.kieler.sccharts.CodeEffect;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

import de.cau.cs.kieler.scl.SCLPackage;
import de.cau.cs.kieler.scl.Scope;
import de.cau.cs.kieler.scl.Statement;
import de.cau.cs.kieler.scl.StatementContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.CodeEffectImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.CodeEffectImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.CodeEffectImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.CodeEffectImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.CodeEffectImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeEffectImpl extends AnnotatableImpl implements CodeEffect {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedule()
     * @generated
     * @ordered
     */
    protected EList<ScheduleObjectReference> schedule;

    /**
     * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingLinks()
     * @generated
     * @ordered
     */
    protected EList<Link> outgoingLinks;

    /**
     * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncomingLinks()
     * @generated
     * @ordered
     */
    protected EList<Link> incomingLinks;

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
     * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatements()
     * @generated
     * @ordered
     */
    protected EList<Statement> statements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CodeEffectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.CODE_EFFECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, SCChartsPackage.CODE_EFFECT__SCHEDULE);
        }
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Link> getOutgoingLinks() {
        if (outgoingLinks == null) {
            outgoingLinks = new EObjectContainmentEList<Link>(Link.class, this, SCChartsPackage.CODE_EFFECT__OUTGOING_LINKS);
        }
        return outgoingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Link> getIncomingLinks() {
        if (incomingLinks == null) {
            incomingLinks = new EObjectWithInverseResolvingEList<Link>(Link.class, this, SCChartsPackage.CODE_EFFECT__INCOMING_LINKS, KEffectsPackage.LINK__TARGET);
        }
        return incomingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, SCChartsPackage.CODE_EFFECT__DECLARATIONS);
        }
        return declarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<Statement>(Statement.class, this, SCChartsPackage.CODE_EFFECT__STATEMENTS);
        }
        return statements;
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
            case SCChartsPackage.CODE_EFFECT__INCOMING_LINKS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
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
            case SCChartsPackage.CODE_EFFECT__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.CODE_EFFECT__OUTGOING_LINKS:
                return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.CODE_EFFECT__INCOMING_LINKS:
                return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.CODE_EFFECT__DECLARATIONS:
                return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.CODE_EFFECT__STATEMENTS:
                return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
            case SCChartsPackage.CODE_EFFECT__SCHEDULE:
                return getSchedule();
            case SCChartsPackage.CODE_EFFECT__OUTGOING_LINKS:
                return getOutgoingLinks();
            case SCChartsPackage.CODE_EFFECT__INCOMING_LINKS:
                return getIncomingLinks();
            case SCChartsPackage.CODE_EFFECT__DECLARATIONS:
                return getDeclarations();
            case SCChartsPackage.CODE_EFFECT__STATEMENTS:
                return getStatements();
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
            case SCChartsPackage.CODE_EFFECT__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case SCChartsPackage.CODE_EFFECT__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                getOutgoingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case SCChartsPackage.CODE_EFFECT__INCOMING_LINKS:
                getIncomingLinks().clear();
                getIncomingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case SCChartsPackage.CODE_EFFECT__DECLARATIONS:
                getDeclarations().clear();
                getDeclarations().addAll((Collection<? extends Declaration>)newValue);
                return;
            case SCChartsPackage.CODE_EFFECT__STATEMENTS:
                getStatements().clear();
                getStatements().addAll((Collection<? extends Statement>)newValue);
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
            case SCChartsPackage.CODE_EFFECT__SCHEDULE:
                getSchedule().clear();
                return;
            case SCChartsPackage.CODE_EFFECT__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                return;
            case SCChartsPackage.CODE_EFFECT__INCOMING_LINKS:
                getIncomingLinks().clear();
                return;
            case SCChartsPackage.CODE_EFFECT__DECLARATIONS:
                getDeclarations().clear();
                return;
            case SCChartsPackage.CODE_EFFECT__STATEMENTS:
                getStatements().clear();
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
            case SCChartsPackage.CODE_EFFECT__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case SCChartsPackage.CODE_EFFECT__OUTGOING_LINKS:
                return outgoingLinks != null && !outgoingLinks.isEmpty();
            case SCChartsPackage.CODE_EFFECT__INCOMING_LINKS:
                return incomingLinks != null && !incomingLinks.isEmpty();
            case SCChartsPackage.CODE_EFFECT__DECLARATIONS:
                return declarations != null && !declarations.isEmpty();
            case SCChartsPackage.CODE_EFFECT__STATEMENTS:
                return statements != null && !statements.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Schedulable.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.CODE_EFFECT__SCHEDULE: return KExpressionsPackage.SCHEDULABLE__SCHEDULE;
                default: return -1;
            }
        }
        if (baseClass == Linkable.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.CODE_EFFECT__OUTGOING_LINKS: return KEffectsPackage.LINKABLE__OUTGOING_LINKS;
                case SCChartsPackage.CODE_EFFECT__INCOMING_LINKS: return KEffectsPackage.LINKABLE__INCOMING_LINKS;
                default: return -1;
            }
        }
        if (baseClass == DeclarationScope.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.CODE_EFFECT__DECLARATIONS: return KExtPackage.DECLARATION_SCOPE__DECLARATIONS;
                default: return -1;
            }
        }
        if (baseClass == StatementContainer.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.CODE_EFFECT__STATEMENTS: return SCLPackage.STATEMENT_CONTAINER__STATEMENTS;
                default: return -1;
            }
        }
        if (baseClass == Scope.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Schedulable.class) {
            switch (baseFeatureID) {
                case KExpressionsPackage.SCHEDULABLE__SCHEDULE: return SCChartsPackage.CODE_EFFECT__SCHEDULE;
                default: return -1;
            }
        }
        if (baseClass == Linkable.class) {
            switch (baseFeatureID) {
                case KEffectsPackage.LINKABLE__OUTGOING_LINKS: return SCChartsPackage.CODE_EFFECT__OUTGOING_LINKS;
                case KEffectsPackage.LINKABLE__INCOMING_LINKS: return SCChartsPackage.CODE_EFFECT__INCOMING_LINKS;
                default: return -1;
            }
        }
        if (baseClass == DeclarationScope.class) {
            switch (baseFeatureID) {
                case KExtPackage.DECLARATION_SCOPE__DECLARATIONS: return SCChartsPackage.CODE_EFFECT__DECLARATIONS;
                default: return -1;
            }
        }
        if (baseClass == StatementContainer.class) {
            switch (baseFeatureID) {
                case SCLPackage.STATEMENT_CONTAINER__STATEMENTS: return SCChartsPackage.CODE_EFFECT__STATEMENTS;
                default: return -1;
            }
        }
        if (baseClass == Scope.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //CodeEffectImpl
