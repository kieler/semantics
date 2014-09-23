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
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.scg.ScgPackage;
import de.cau.cs.kieler.scg.Schedule;
import de.cau.cs.kieler.scg.SchedulingBlock;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.ScheduleImpl#getSchedulingBlocks <em>Scheduling Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduleImpl extends MinimalEObjectImpl.Container implements Schedule {
    /**
	 * The cached value of the '{@link #getSchedulingBlocks() <em>Scheduling Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSchedulingBlocks()
	 * @generated
	 * @ordered
	 */
    protected EList<SchedulingBlock> schedulingBlocks;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ScheduleImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgPackage.Literals.SCHEDULE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SchedulingBlock> getSchedulingBlocks() {
		if (schedulingBlocks == null) {
			schedulingBlocks = new EObjectResolvingEList<SchedulingBlock>(SchedulingBlock.class, this, ScgPackage.SCHEDULE__SCHEDULING_BLOCKS);
		}
		return schedulingBlocks;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScgPackage.SCHEDULE__SCHEDULING_BLOCKS:
				return getSchedulingBlocks();
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
			case ScgPackage.SCHEDULE__SCHEDULING_BLOCKS:
				getSchedulingBlocks().clear();
				getSchedulingBlocks().addAll((Collection<? extends SchedulingBlock>)newValue);
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
			case ScgPackage.SCHEDULE__SCHEDULING_BLOCKS:
				getSchedulingBlocks().clear();
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
			case ScgPackage.SCHEDULE__SCHEDULING_BLOCKS:
				return schedulingBlocks != null && !schedulingBlocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScheduleImpl
