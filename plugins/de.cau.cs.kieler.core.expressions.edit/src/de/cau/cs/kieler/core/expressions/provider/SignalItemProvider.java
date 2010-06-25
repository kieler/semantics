/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions.provider;


import de.cau.cs.kieler.core.expressions.ExpressionsFactory;
import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.core.expressions.Signal;

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
 * This is the item provider adapter for a {@link de.cau.cs.kieler.core.expressions.Signal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SignalItemProvider
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
    public SignalItemProvider(AdapterFactory adapterFactory) {
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

            addIsInputPropertyDescriptor(object);
            addIsOutputPropertyDescriptor(object);
            addCombineOperatorPropertyDescriptor(object);
            addHostCombineOperatorPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Is Input feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsInputPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Signal_isInput_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Signal_isInput_feature", "_UI_Signal_type"),
                 ExpressionsPackage.Literals.SIGNAL__IS_INPUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Is Output feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsOutputPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Signal_isOutput_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Signal_isOutput_feature", "_UI_Signal_type"),
                 ExpressionsPackage.Literals.SIGNAL__IS_OUTPUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Combine Operator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCombineOperatorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Signal_combineOperator_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Signal_combineOperator_feature", "_UI_Signal_type"),
                 ExpressionsPackage.Literals.SIGNAL__COMBINE_OPERATOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Host Combine Operator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHostCombineOperatorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Signal_hostCombineOperator_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Signal_hostCombineOperator_feature", "_UI_Signal_type"),
                 ExpressionsPackage.Literals.SIGNAL__HOST_COMBINE_OPERATOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            childrenFeatures.add(ExpressionsPackage.Literals.SIGNAL__VALUE);
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
     * This returns Signal.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Signal"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Signal)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Signal_type") :
            getString("_UI_Signal_type") + " " + label;
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

        switch (notification.getFeatureID(Signal.class)) {
            case ExpressionsPackage.SIGNAL__IS_INPUT:
            case ExpressionsPackage.SIGNAL__IS_OUTPUT:
            case ExpressionsPackage.SIGNAL__COMBINE_OPERATOR:
            case ExpressionsPackage.SIGNAL__HOST_COMBINE_OPERATOR:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ExpressionsPackage.SIGNAL__VALUE:
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
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createComplexExpression()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createTextualCode()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createValuedObject()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createSignal()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createSignalReference()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createVariableReference()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createValue()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createFloatValue()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createBooleanValue()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createOperatorExpression()));

        newChildDescriptors.add
            (createChildParameter
                (ExpressionsPackage.Literals.SIGNAL__VALUE,
                 ExpressionsFactory.eINSTANCE.createTextExpression()));
    }

}
