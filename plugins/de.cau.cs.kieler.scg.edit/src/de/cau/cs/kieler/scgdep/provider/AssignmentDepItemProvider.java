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
package de.cau.cs.kieler.scgdep.provider;


import de.cau.cs.kieler.scg.ScgFactory;
import de.cau.cs.kieler.scg.ScgPackage;

import de.cau.cs.kieler.scg.provider.AssignmentItemProvider;

import de.cau.cs.kieler.scgdep.AssignmentDep;
import de.cau.cs.kieler.scgdep.ScgdepFactory;
import de.cau.cs.kieler.scgdep.ScgdepPackage;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.scgdep.AssignmentDep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignmentDepItemProvider
    extends AssignmentItemProvider
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
    public AssignmentDepItemProvider(AdapterFactory adapterFactory) {
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
            childrenFeatures.add(ScgdepPackage.Literals.NODE_DEP__DEPENDENCIES);
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
     * This returns AssignmentDep.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/AssignmentDep"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        AssignmentDep assignmentDep = (AssignmentDep)object;
        return getString("_UI_AssignmentDep_type") + " " + assignmentDep.isIsInitial();
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

        switch (notification.getFeatureID(AssignmentDep.class)) {
            case ScgdepPackage.ASSIGNMENT_DEP__DEPENDENCIES:
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
                (ScgdepPackage.Literals.NODE_DEP__DEPENDENCIES,
                 ScgdepFactory.eINSTANCE.createDependency()));

        newChildDescriptors.add
            (createChildParameter
                (ScgdepPackage.Literals.NODE_DEP__DEPENDENCIES,
                 ScgdepFactory.eINSTANCE.createAbsoluteWrite_Read()));

        newChildDescriptors.add
            (createChildParameter
                (ScgdepPackage.Literals.NODE_DEP__DEPENDENCIES,
                 ScgdepFactory.eINSTANCE.createRelativeWrite_Read()));

        newChildDescriptors.add
            (createChildParameter
                (ScgdepPackage.Literals.NODE_DEP__DEPENDENCIES,
                 ScgdepFactory.eINSTANCE.createAbsoluteWrite_RelativeWrite()));

        newChildDescriptors.add
            (createChildParameter
                (ScgdepPackage.Literals.NODE_DEP__DEPENDENCIES,
                 ScgdepFactory.eINSTANCE.createWrite_Write()));

        newChildDescriptors.add
            (createChildParameter
                (ScgdepPackage.Literals.NODE_DEP__DEPENDENCIES,
                 ScgFactory.eINSTANCE.createLink()));

        newChildDescriptors.add
            (createChildParameter
                (ScgdepPackage.Literals.NODE_DEP__DEPENDENCIES,
                 ScgFactory.eINSTANCE.createControlFlow()));
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
            childFeature == ScgPackage.Literals.ASSIGNMENT__NEXT ||
            childFeature == ScgdepPackage.Literals.NODE_DEP__DEPENDENCIES ||
            childFeature == ScgPackage.Literals.ASSIGNMENT__ASSIGNMENT ||
            childFeature == ScgPackage.Literals.ASSIGNMENT__INDICES;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ScgdepEditPlugin.INSTANCE;
    }

}
