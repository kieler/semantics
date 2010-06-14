/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.provider;


import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Variable;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.synccharts.Variable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableItemProvider
	extends ValuedObjectItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addParentScopePropertyDescriptor(object);
			addConstPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Variable_parentScope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Variable_parentScope_feature", "_UI_Variable_type"),
				 SyncchartsPackage.Literals.VARIABLE__PARENT_SCOPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Const feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Variable_const_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Variable_const_feature", "_UI_Variable_type"),
				 SyncchartsPackage.Literals.VARIABLE__CONST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SyncchartsPackage.Literals.VARIABLE__VALUE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Variable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Variable"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Variable)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Variable_type") :
			getString("_UI_Variable_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Variable.class)) {
			case SyncchartsPackage.VARIABLE__CONST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SyncchartsPackage.VARIABLE__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createComplexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createEmission()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createTextualCode()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createValuedObject()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createSignalReference()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createFloatValue()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.VARIABLE__VALUE,
				 SyncchartsFactory.eINSTANCE.createOperatorExpression()));
	}

}
