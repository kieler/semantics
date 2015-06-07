/**
 */
package de.cau.cs.kieler.esterel.esterel.provider;


import de.cau.cs.kieler.esterel.esterel.Assignment;
import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;

import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.esterel.esterel.Assignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignmentItemProvider extends StatementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssignmentItemProvider(AdapterFactory adapterFactory) {
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

            addVarPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Var feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVarPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Assignment_var_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Assignment_var_feature", "_UI_Assignment_type"),
                 EsterelPackage.Literals.ASSIGNMENT__VAR,
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
            childrenFeatures.add(EsterelPackage.Literals.ASSIGNMENT__EXPR);
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
     * This returns Assignment.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Assignment"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_Assignment_type");
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

        switch (notification.getFeatureID(Assignment.class)) {
            case EsterelPackage.ASSIGNMENT__EXPR:
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
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 EsterelFactory.eINSTANCE.createTrapExpression()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 EsterelFactory.eINSTANCE.createFunctionExpression()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 EsterelFactory.eINSTANCE.createConstantExpression()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 EsterelFactory.eINSTANCE.createTrapReferenceExpr()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 KExpressionsFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 KExpressionsFactory.eINSTANCE.createComplexExpression()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 KExpressionsFactory.eINSTANCE.createValue()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 KExpressionsFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 KExpressionsFactory.eINSTANCE.createFloatValue()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 KExpressionsFactory.eINSTANCE.createBooleanValue()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

        newChildDescriptors.add
            (createChildParameter
                (EsterelPackage.Literals.ASSIGNMENT__EXPR,
                 KExpressionsFactory.eINSTANCE.createTextExpression()));
    }

}
