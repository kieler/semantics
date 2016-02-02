/**
 */
package de.cau.cs.kieler.scl.scl.provider;


import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;

import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsFactory;
import de.cau.cs.kieler.scl.scl.Conditional;
import de.cau.cs.kieler.scl.scl.SclFactory;
import de.cau.cs.kieler.scl.scl.SclPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.scl.scl.Conditional} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalItemProvider extends StatementSequenceItemProvider {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConditionalItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SclPackage.Literals.CONDITIONAL__EXPRESSION);
			childrenFeatures.add(SclPackage.Literals.CONDITIONAL__DECLARATIONS);
			childrenFeatures.add(SclPackage.Literals.CONDITIONAL__ELSE_STATEMENTS);
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
	 * This returns Conditional.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Conditional"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		return getString("_UI_Conditional_type");
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

		switch (notification.getFeatureID(Conditional.class)) {
			case SclPackage.CONDITIONAL__EXPRESSION:
			case SclPackage.CONDITIONAL__DECLARATIONS:
			case SclPackage.CONDITIONAL__ELSE_STATEMENTS:
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
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KEffectsFactory.eINSTANCE.createHostcodeEffect()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KEffectsFactory.eINSTANCE.createFunctionCallEffect()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createFloatValue()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createBoolValue()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createTextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createCall()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__DECLARATIONS,
				 KExpressionsFactory.eINSTANCE.createDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__DECLARATIONS,
				 KExpressionsFactory.eINSTANCE.createVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__DECLARATIONS,
				 KExpressionsFactory.eINSTANCE.createReferenceDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__ELSE_STATEMENTS,
				 SclFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__ELSE_STATEMENTS,
				 SclFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add
			(createChildParameter
				(SclPackage.Literals.CONDITIONAL__ELSE_STATEMENTS,
				 SclFactory.eINSTANCE.createInstructionStatement()));
	}

    /**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SclPackage.Literals.STATEMENT_SEQUENCE__STATEMENTS ||
			childFeature == SclPackage.Literals.CONDITIONAL__ELSE_STATEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
