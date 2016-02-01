/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations.provider;


import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.AnnotationsFactory;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.core.annotations.Annotatable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotatableItemProvider
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
    public AnnotatableItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS);
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
		return getString("_UI_Annotatable_type");
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

		switch (notification.getFeatureID(Annotatable.class)) {
			case AnnotationsPackage.ANNOTATABLE__ANNOTATIONS:
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
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createStringAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createReferenceAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createBooleanAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createIntAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createFloatAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createContainmentAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createImportAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createTypedStringAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createCommentAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
				 AnnotationsFactory.eINSTANCE.createPropertyAnnotation()));
	}

    /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public ResourceLocator getResourceLocator() {
		return AnnotationsEditPlugin.INSTANCE;
	}

}
