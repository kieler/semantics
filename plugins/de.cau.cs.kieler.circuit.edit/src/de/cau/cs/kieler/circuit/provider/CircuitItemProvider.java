/**
 */
package de.cau.cs.kieler.circuit.provider;


import de.cau.cs.kieler.circuit.Circuit;
import de.cau.cs.kieler.circuit.CircuitFactory;
import de.cau.cs.kieler.circuit.CircuitPackage;

import de.cau.cs.kieler.core.annotations.provider.NamedObjectItemProvider;

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
 * This is the item provider adapter for a {@link de.cau.cs.kieler.circuit.Circuit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CircuitItemProvider extends NamedObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitItemProvider(AdapterFactory adapterFactory) {
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

			addIncomingLinksPropertyDescriptor(object);
			addOutgoingLinksPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Incoming Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Linkable_incomingLinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Linkable_incomingLinks_feature", "_UI_Linkable_type"),
				 CircuitPackage.Literals.LINKABLE__INCOMING_LINKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Linkable_outgoingLinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Linkable_outgoingLinks_feature", "_UI_Linkable_type"),
				 CircuitPackage.Literals.LINKABLE__OUTGOING_LINKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_Linkable_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Linkable_id_feature", "_UI_Linkable_type"),
				 CircuitPackage.Literals.LINKABLE__ID,
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
			childrenFeatures.add(CircuitPackage.Literals.CIRCUIT__CIRCUITS);
			childrenFeatures.add(CircuitPackage.Literals.CIRCUIT__LINKS);
			childrenFeatures.add(CircuitPackage.Literals.CIRCUIT__NODES);
			childrenFeatures.add(CircuitPackage.Literals.CIRCUIT__PORTS);
			childrenFeatures.add(CircuitPackage.Literals.CIRCUIT__RELATIONS);
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
	 * This returns Circuit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Circuit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Circuit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Circuit_type") :
			getString("_UI_Circuit_type") + " " + label;
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

		switch (notification.getFeatureID(Circuit.class)) {
			case CircuitPackage.CIRCUIT__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CircuitPackage.CIRCUIT__CIRCUITS:
			case CircuitPackage.CIRCUIT__LINKS:
			case CircuitPackage.CIRCUIT__NODES:
			case CircuitPackage.CIRCUIT__PORTS:
			case CircuitPackage.CIRCUIT__RELATIONS:
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
				(CircuitPackage.Literals.CIRCUIT__CIRCUITS,
				 CircuitFactory.eINSTANCE.createCircuit()));

		newChildDescriptors.add
			(createChildParameter
				(CircuitPackage.Literals.CIRCUIT__LINKS,
				 CircuitFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(CircuitPackage.Literals.CIRCUIT__NODES,
				 CircuitFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(CircuitPackage.Literals.CIRCUIT__PORTS,
				 CircuitFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(CircuitPackage.Literals.CIRCUIT__RELATIONS,
				 CircuitFactory.eINSTANCE.createRelation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Circuit2EditPlugin.INSTANCE;
	}

}
