/**
 */
package de.cau.cs.kieler.core.kexpressions.provider;


import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.VariableDeclaration;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.core.kexpressions.VariableDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableDeclarationItemProvider extends DeclarationItemProvider {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VariableDeclarationItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addInputPropertyDescriptor(object);
			addOutputPropertyDescriptor(object);
			addStaticPropertyDescriptor(object);
			addSignalPropertyDescriptor(object);
			addConstPropertyDescriptor(object);
			addExternPropertyDescriptor(object);
			addVolatilePropertyDescriptor(object);
			addHostTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableDeclaration_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_type_feature", "_UI_VariableDeclaration_type"),
				 KExpressionsPackage.Literals.VARIABLE_DECLARATION__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Input feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableDeclaration_input_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_input_feature", "_UI_VariableDeclaration_type"),
				 KExpressionsPackage.Literals.VARIABLE_DECLARATION__INPUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Output feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableDeclaration_output_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_output_feature", "_UI_VariableDeclaration_type"),
				 KExpressionsPackage.Literals.VARIABLE_DECLARATION__OUTPUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Static feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addStaticPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableDeclaration_static_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_static_feature", "_UI_VariableDeclaration_type"),
				 KExpressionsPackage.Literals.VARIABLE_DECLARATION__STATIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Signal feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addSignalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableDeclaration_signal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_signal_feature", "_UI_VariableDeclaration_type"),
				 KExpressionsPackage.Literals.VARIABLE_DECLARATION__SIGNAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_VariableDeclaration_const_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_const_feature", "_UI_VariableDeclaration_type"),
				 KExpressionsPackage.Literals.VARIABLE_DECLARATION__CONST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Extern feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addExternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableDeclaration_extern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_extern_feature", "_UI_VariableDeclaration_type"),
				 KExpressionsPackage.Literals.VARIABLE_DECLARATION__EXTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Volatile feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addVolatilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableDeclaration_volatile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_volatile_feature", "_UI_VariableDeclaration_type"),
				 KExpressionsPackage.Literals.VARIABLE_DECLARATION__VOLATILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Host Type feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addHostTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableDeclaration_hostType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_hostType_feature", "_UI_VariableDeclaration_type"),
				 KExpressionsPackage.Literals.VARIABLE_DECLARATION__HOST_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This returns VariableDeclaration.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableDeclaration"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		ValueType labelValue = ((VariableDeclaration)object).getType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_VariableDeclaration_type") :
			getString("_UI_VariableDeclaration_type") + " " + label;
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

		switch (notification.getFeatureID(VariableDeclaration.class)) {
			case KExpressionsPackage.VARIABLE_DECLARATION__TYPE:
			case KExpressionsPackage.VARIABLE_DECLARATION__INPUT:
			case KExpressionsPackage.VARIABLE_DECLARATION__OUTPUT:
			case KExpressionsPackage.VARIABLE_DECLARATION__STATIC:
			case KExpressionsPackage.VARIABLE_DECLARATION__SIGNAL:
			case KExpressionsPackage.VARIABLE_DECLARATION__CONST:
			case KExpressionsPackage.VARIABLE_DECLARATION__EXTERN:
			case KExpressionsPackage.VARIABLE_DECLARATION__VOLATILE:
			case KExpressionsPackage.VARIABLE_DECLARATION__HOST_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
