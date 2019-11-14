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


import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.annotations.provider.AnnotatableItemProvider;

import de.cau.cs.kieler.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.kexpressions.kext.KExtFactory;
import de.cau.cs.kieler.kexpressions.kext.KExtPackage;

import de.cau.cs.kieler.sccharts.SCChartsFactory;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;

import de.cau.cs.kieler.scl.SCLFactory;

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

            addNamePropertyDescriptor(object);
            addIncomingLinksPropertyDescriptor(object);
            addLabelPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_NamedObject_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_NamedObject_name_feature", "_UI_NamedObject_type"),
                 AnnotationsPackage.Literals.NAMED_OBJECT__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
                 KEffectsPackage.Literals.LINKABLE__INCOMING_LINKS,
                 true,
                 false,
                 true,
                 null,
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
            childrenFeatures.add(KExtPackage.Literals.DECLARATION_SCOPE__DECLARATIONS);
            childrenFeatures.add(KExpressionsPackage.Literals.SCHEDULABLE__SCHEDULE);
            childrenFeatures.add(KEffectsPackage.Literals.LINKABLE__OUTGOING_LINKS);
            childrenFeatures.add(SCChartsPackage.Literals.SCOPE__ACTIONS);
            childrenFeatures.add(SCChartsPackage.Literals.SCOPE__REFERENCE);
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
        String label = ((Scope)object).getName();
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
            case SCChartsPackage.SCOPE__NAME:
            case SCChartsPackage.SCOPE__LABEL:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SCChartsPackage.SCOPE__DECLARATIONS:
            case SCChartsPackage.SCOPE__SCHEDULE:
            case SCChartsPackage.SCOPE__OUTGOING_LINKS:
            case SCChartsPackage.SCOPE__ACTIONS:
            case SCChartsPackage.SCOPE__REFERENCE:
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
                 KExpressionsFactory.eINSTANCE.createJsonAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (KExtPackage.Literals.DECLARATION_SCOPE__DECLARATIONS,
                 SCChartsFactory.eINSTANCE.createPolicyClassDeclaration()));

        newChildDescriptors.add
            (createChildParameter
                (KExtPackage.Literals.DECLARATION_SCOPE__DECLARATIONS,
                 KExpressionsFactory.eINSTANCE.createVariableDeclaration()));

        newChildDescriptors.add
            (createChildParameter
                (KExtPackage.Literals.DECLARATION_SCOPE__DECLARATIONS,
                 KExpressionsFactory.eINSTANCE.createReferenceDeclaration()));

        newChildDescriptors.add
            (createChildParameter
                (KExtPackage.Literals.DECLARATION_SCOPE__DECLARATIONS,
                 KExpressionsFactory.eINSTANCE.createScheduleDeclaration()));

        newChildDescriptors.add
            (createChildParameter
                (KExtPackage.Literals.DECLARATION_SCOPE__DECLARATIONS,
                 KExpressionsFactory.eINSTANCE.createMethodDeclaration()));

        newChildDescriptors.add
            (createChildParameter
                (KExtPackage.Literals.DECLARATION_SCOPE__DECLARATIONS,
                 KExtFactory.eINSTANCE.createClassDeclaration()));

        newChildDescriptors.add
            (createChildParameter
                (KExtPackage.Literals.DECLARATION_SCOPE__DECLARATIONS,
                 SCLFactory.eINSTANCE.createMethodImplementationDeclaration()));

        newChildDescriptors.add
            (createChildParameter
                (KExpressionsPackage.Literals.SCHEDULABLE__SCHEDULE,
                 KExpressionsFactory.eINSTANCE.createScheduleObjectReference()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.LINKABLE__OUTGOING_LINKS,
                 KEffectsFactory.eINSTANCE.createDataDependency()));

        newChildDescriptors.add
            (createChildParameter
                (KEffectsPackage.Literals.LINKABLE__OUTGOING_LINKS,
                 KEffectsFactory.eINSTANCE.createControlDependency()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.SCOPE__ACTIONS,
                 SCChartsFactory.eINSTANCE.createEntryAction()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.SCOPE__ACTIONS,
                 SCChartsFactory.eINSTANCE.createDuringAction()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.SCOPE__ACTIONS,
                 SCChartsFactory.eINSTANCE.createExitAction()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.SCOPE__ACTIONS,
                 SCChartsFactory.eINSTANCE.createSuspendAction()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.SCOPE__ACTIONS,
                 SCChartsFactory.eINSTANCE.createPrecedingAction()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.SCOPE__ACTIONS,
                 SCChartsFactory.eINSTANCE.createSucceedingAction()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.SCOPE__ACTIONS,
                 SCChartsFactory.eINSTANCE.createPeriodAction()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.SCOPE__REFERENCE,
                 SCChartsFactory.eINSTANCE.createScopeCall()));
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
