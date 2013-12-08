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
package de.cau.cs.kieler.scgbb.provider;


import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;

import de.cau.cs.kieler.scg.provider.ScgbbEditPlugin;

import de.cau.cs.kieler.scgbb.ActivationExpression;
import de.cau.cs.kieler.scgbb.ScgbbPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.scgbb.ActivationExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivationExpressionItemProvider
    extends ItemProviderAdapter
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
    public ActivationExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addBasicBlocksPropertyDescriptor(object);
			addGuardPropertyDescriptor(object);
			addEmptyExpressionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Basic Blocks feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addBasicBlocksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivationExpression_basicBlocks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivationExpression_basicBlocks_feature", "_UI_ActivationExpression_type"),
				 ScgbbPackage.Literals.ACTIVATION_EXPRESSION__BASIC_BLOCKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Guard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivationExpression_guard_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivationExpression_guard_feature", "_UI_ActivationExpression_type"),
				 ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

				/**
	 * This adds a property descriptor for the Empty Expressions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmptyExpressionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivationExpression_emptyExpressions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivationExpression_emptyExpressions_feature", "_UI_ActivationExpression_type"),
				 ScgbbPackage.Literals.ACTIVATION_EXPRESSION__EMPTY_EXPRESSIONS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD_EXPRESSION);
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
	 * This returns ActivationExpression.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivationExpression"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		return getString("_UI_ActivationExpression_type");
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

		switch (notification.getFeatureID(ActivationExpression.class)) {
			case ScgbbPackage.ACTIVATION_EXPRESSION__GUARD_EXPRESSION:
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
				(ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD_EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD_EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD_EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD_EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD_EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createFloatValue()));

		newChildDescriptors.add
			(createChildParameter
				(ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD_EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createBoolValue()));

		newChildDescriptors.add
			(createChildParameter
				(ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD_EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD_EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createTextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ScgbbPackage.Literals.ACTIVATION_EXPRESSION__GUARD_EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createDoubleValue()));
	}

    /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public ResourceLocator getResourceLocator() {
		return ScgbbEditPlugin.INSTANCE;
	}

}
