/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.provider;


import de.cau.cs.kieler.synccharts.ComplexExpression;
import de.cau.cs.kieler.synccharts.OperatorType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.synccharts.ComplexExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexExpressionItemProvider
    extends ExpressionItemProvider
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
    public ComplexExpressionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__SUB_EXPRESSIONS);
			childrenFeatures.add(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__OPERATOR);
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
	 * This returns ComplexExpression.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComplexExpression"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		OperatorType labelValue = ((ComplexExpression)object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ComplexExpression_type") :
			getString("_UI_ComplexExpression_type") + " " + label;
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

		switch (notification.getFeatureID(ComplexExpression.class)) {
			case SyncchartsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			case SyncchartsPackage.COMPLEX_EXPRESSION__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
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
				(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__SUB_EXPRESSIONS,
				 SyncchartsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__SUB_EXPRESSIONS,
				 SyncchartsFactory.eINSTANCE.createComplexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__SUB_EXPRESSIONS,
				 SyncchartsFactory.eINSTANCE.createHostCode()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__SUB_EXPRESSIONS,
				 SyncchartsFactory.eINSTANCE.createSignalReference()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__SUB_EXPRESSIONS,
				 SyncchartsFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__SUB_EXPRESSIONS,
				 SyncchartsFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__SUB_EXPRESSIONS,
				 SyncchartsFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__SUB_EXPRESSIONS,
				 SyncchartsFactory.eINSTANCE.createFloatValue()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__SUB_EXPRESSIONS,
				 SyncchartsFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add
			(createChildParameter
				(SyncchartsPackage.Literals.COMPLEX_EXPRESSION__OPERATOR,
				 OperatorType.EQ));
	}

}
