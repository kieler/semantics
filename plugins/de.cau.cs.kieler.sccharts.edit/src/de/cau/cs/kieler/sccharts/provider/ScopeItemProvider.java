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
package de.cau.cs.kieler.sccharts.provider;


import de.cau.cs.kieler.core.annotations.provider.AnnotatableItemProvider;

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;

import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsFactory;
import de.cau.cs.kieler.sccharts.SCChartsFactory;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.sccharts.Scope} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScopeItemProvider extends AnnotatableItemProvider {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ScopeItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addReferencedScopePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scope_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scope_id_feature", "_UI_Scope_type"),
				 SCChartsPackage.Literals.SCOPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scope_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scope_label_feature", "_UI_Scope_type"),
				 SCChartsPackage.Literals.SCOPE__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Referenced Scope feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addReferencedScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Scope_referencedScope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scope_referencedScope_feature", "_UI_Scope_type"),
				 SCChartsPackage.Literals.SCOPE__REFERENCED_SCOPE,
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
			childrenFeatures.add(SCChartsPackage.Literals.SCOPE__LOCAL_ACTIONS);
			childrenFeatures.add(SCChartsPackage.Literals.SCOPE__BINDINGS);
			childrenFeatures.add(SCChartsPackage.Literals.SCOPE__DECLARATIONS);
			childrenFeatures.add(SCChartsPackage.Literals.SCOPE__EXPRESSION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		String label = ((Scope)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Scope_type") :
			getString("_UI_Scope_type") + " " + label;
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

		switch (notification.getFeatureID(Scope.class)) {
			case SCChartsPackage.SCOPE__ID:
			case SCChartsPackage.SCOPE__LABEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SCChartsPackage.SCOPE__LOCAL_ACTIONS:
			case SCChartsPackage.SCOPE__BINDINGS:
			case SCChartsPackage.SCOPE__DECLARATIONS:
			case SCChartsPackage.SCOPE__EXPRESSION:
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
				(SCChartsPackage.Literals.SCOPE__LOCAL_ACTIONS,
				 SCChartsFactory.eINSTANCE.createEntryAction()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__LOCAL_ACTIONS,
				 SCChartsFactory.eINSTANCE.createDuringAction()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__LOCAL_ACTIONS,
				 SCChartsFactory.eINSTANCE.createExitAction()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__LOCAL_ACTIONS,
				 SCChartsFactory.eINSTANCE.createSuspendAction()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__LOCAL_ACTIONS,
				 SCChartsFactory.eINSTANCE.createIterateAction()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__LOCAL_ACTIONS,
				 SCChartsFactory.eINSTANCE.createInitAction()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__LOCAL_ACTIONS,
				 SCChartsFactory.eINSTANCE.createFinalAction()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__BINDINGS,
				 SCChartsFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__DECLARATIONS,
				 KExpressionsFactory.eINSTANCE.createDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__DECLARATIONS,
				 KExpressionsFactory.eINSTANCE.createVariableDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__DECLARATIONS,
				 KExpressionsFactory.eINSTANCE.createReferenceDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KEffectsFactory.eINSTANCE.createHostcodeEffect()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KEffectsFactory.eINSTANCE.createFunctionCallEffect()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createFloatValue()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createBoolValue()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createTextExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createCall()));

		newChildDescriptors.add
			(createChildParameter
				(SCChartsPackage.Literals.SCOPE__EXPRESSION,
				 KExpressionsFactory.eINSTANCE.createFunctionCall()));
	}

    /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public ResourceLocator getResourceLocator() {
		return SCChartsEditPlugin.INSTANCE;
	}

}
