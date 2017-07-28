/**
 */
package de.cau.cs.kieler.esterel.esterel.provider;


import de.cau.cs.kieler.esterel.esterel.EsterelFactory;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.IfTest;

import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.esterel.esterel.IfTest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfTestItemProvider extends StatementItemProvider {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IfTestItemProvider(AdapterFactory adapterFactory) {
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

			addOptEndPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Opt End feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addOptEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IfTest_optEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IfTest_optEnd_feature", "_UI_IfTest_type"),
				 EsterelPackage.Literals.IF_TEST__OPT_END,
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
			childrenFeatures.add(EsterelPackage.Literals.IF_TEST__EXPR);
			childrenFeatures.add(EsterelPackage.Literals.IF_TEST__THEN_PART);
			childrenFeatures.add(EsterelPackage.Literals.IF_TEST__ELSIF);
			childrenFeatures.add(EsterelPackage.Literals.IF_TEST__ELSE_PART);
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
	 * This returns IfTest.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfTest"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		String label = ((IfTest)object).getOptEnd();
		return label == null || label.length() == 0 ?
			getString("_UI_IfTest_type") :
			getString("_UI_IfTest_type") + " " + label;
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

		switch (notification.getFeatureID(IfTest.class)) {
			case EsterelPackage.IF_TEST__OPT_END:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EsterelPackage.IF_TEST__EXPR:
			case EsterelPackage.IF_TEST__THEN_PART:
			case EsterelPackage.IF_TEST__ELSIF:
			case EsterelPackage.IF_TEST__ELSE_PART:
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
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 EsterelFactory.eINSTANCE.createTrapExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 EsterelFactory.eINSTANCE.createFunctionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 EsterelFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 EsterelFactory.eINSTANCE.createTrapReferenceExpr()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 KExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 KExpressionsFactory.eINSTANCE.createComplexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 KExpressionsFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 KExpressionsFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 KExpressionsFactory.eINSTANCE.createFloatValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 KExpressionsFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__EXPR,
				 KExpressionsFactory.eINSTANCE.createTextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__THEN_PART,
				 EsterelFactory.eINSTANCE.createThenPart()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__ELSIF,
				 EsterelFactory.eINSTANCE.createElsIf()));

		newChildDescriptors.add
			(createChildParameter
				(EsterelPackage.Literals.IF_TEST__ELSE_PART,
				 EsterelFactory.eINSTANCE.createElsePart()));
	}

}
