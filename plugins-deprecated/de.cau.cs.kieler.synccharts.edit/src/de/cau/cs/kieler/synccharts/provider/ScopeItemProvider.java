/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.provider;


import de.cau.cs.kieler.core.annotations.AnnotationsFactory;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

import de.cau.cs.kieler.core.annotations.provider.AnnotatableItemProvider;

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;

import de.cau.cs.kieler.synccharts.Scope;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import de.cau.cs.kieler.synccharts.custom.providers.NoViewItemPropertyDescriptor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.cau.cs.kieler.synccharts.Scope} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScopeItemProvider
    extends AnnotatableItemProvider
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

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
            addBodyReferencePropertyDescriptor(object);
            addInterfaceDeclarationPropertyDescriptor(object);
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
        itemPropertyDescriptors.add(createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Scope_id_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Scope_id_feature", "_UI_Scope_type"),
                 SyncchartsPackage.Literals.SCOPE__ID,
                 false,
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
        itemPropertyDescriptors.add(createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Scope_label_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Scope_label_feature", "_UI_Scope_type"),
                 SyncchartsPackage.Literals.SCOPE__LABEL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Body Reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBodyReferencePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new NoViewItemPropertyDescriptor
        
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Scope_bodyReference_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Scope_bodyReference_feature", "_UI_Scope_type"),
                 SyncchartsPackage.Literals.SCOPE__BODY_REFERENCE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Interface Declaration feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInterfaceDeclarationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Scope_interfaceDeclaration_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Scope_interfaceDeclaration_feature", "_UI_Scope_type"),
                 SyncchartsPackage.Literals.SCOPE__INTERFACE_DECLARATION,
                 true,
                 true,
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
            childrenFeatures.add(SyncchartsPackage.Literals.SCOPE__SIGNALS);
            childrenFeatures.add(SyncchartsPackage.Literals.SCOPE__VARIABLES);
            childrenFeatures.add(SyncchartsPackage.Literals.SCOPE__SUSPENSION_TRIGGER);
            childrenFeatures.add(SyncchartsPackage.Literals.SCOPE__EXIT_ACTIONS);
            childrenFeatures.add(SyncchartsPackage.Literals.SCOPE__INNER_ACTIONS);
            childrenFeatures.add(SyncchartsPackage.Literals.SCOPE__ENTRY_ACTIONS);
            childrenFeatures.add(SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS);
            childrenFeatures.add(SyncchartsPackage.Literals.SCOPE__BODY_TEXT);
            childrenFeatures.add(SyncchartsPackage.Literals.SCOPE__RENAMINGS);
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
            case SyncchartsPackage.SCOPE__ID:
            case SyncchartsPackage.SCOPE__LABEL:
            case SyncchartsPackage.SCOPE__INTERFACE_DECLARATION:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SyncchartsPackage.SCOPE__SIGNALS:
            case SyncchartsPackage.SCOPE__VARIABLES:
            case SyncchartsPackage.SCOPE__SUSPENSION_TRIGGER:
            case SyncchartsPackage.SCOPE__EXIT_ACTIONS:
            case SyncchartsPackage.SCOPE__INNER_ACTIONS:
            case SyncchartsPackage.SCOPE__ENTRY_ACTIONS:
            case SyncchartsPackage.SCOPE__BODY_CONTENTS:
            case SyncchartsPackage.SCOPE__BODY_TEXT:
            case SyncchartsPackage.SCOPE__RENAMINGS:
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
                (SyncchartsPackage.Literals.SCOPE__SIGNALS,
                 KExpressionsFactory.eINSTANCE.createSignal()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__SIGNALS,
                 KExpressionsFactory.eINSTANCE.createISignal()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__VARIABLES,
                 KExpressionsFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__VARIABLES,
                 KExpressionsFactory.eINSTANCE.createIVariable()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__SUSPENSION_TRIGGER,
                 SyncchartsFactory.eINSTANCE.createAction()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__SUSPENSION_TRIGGER,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__EXIT_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createAction()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__EXIT_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__INNER_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createAction()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__INNER_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__ENTRY_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createAction()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__ENTRY_ACTIONS,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createAction()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createAssignment()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createEmission()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createRegion()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createSubstitution()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createState()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createTransition()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 SyncchartsFactory.eINSTANCE.createTextEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 AnnotationsFactory.eINSTANCE.createAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 AnnotationsFactory.eINSTANCE.createStringAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 AnnotationsFactory.eINSTANCE.createReferenceAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 AnnotationsFactory.eINSTANCE.createBooleanAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 AnnotationsFactory.eINSTANCE.createIntAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 AnnotationsFactory.eINSTANCE.createFloatAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 AnnotationsFactory.eINSTANCE.createContainmentAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 AnnotationsFactory.eINSTANCE.createImportAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 AnnotationsFactory.eINSTANCE.createTypedStringAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEAttribute()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEAnnotation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEClass()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEDataType()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEEnum()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEEnumLiteral()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEFactory()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEObject()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEOperation()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEPackage()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEParameter()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEReference()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createEGenericType()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 EcoreFactory.eINSTANCE.createETypeParameter()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createComplexExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createTextualCode()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createValuedObject()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createSignal()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createVariable()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createValue()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createFloatValue()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createBooleanValue()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createTextExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createInterfaceDeclaration()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createInterfaceSignalDecl()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createISignal()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createChannelDescription()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createTypeIdentifier()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createInterfaceVariableDecl()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createVariableDecl()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createIVariable()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createInput()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createOutput()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createInputOutput()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS,
                 KExpressionsFactory.eINSTANCE.createReturn()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_TEXT,
                 SyncchartsFactory.eINSTANCE.createTextEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_TEXT,
                 KExpressionsFactory.eINSTANCE.createTextualCode()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__BODY_TEXT,
                 KExpressionsFactory.eINSTANCE.createTextExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SyncchartsPackage.Literals.SCOPE__RENAMINGS,
                 SyncchartsFactory.eINSTANCE.createSubstitution()));
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
            childFeature == AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS ||
            childFeature == SyncchartsPackage.Literals.SCOPE__BODY_CONTENTS ||
            childFeature == SyncchartsPackage.Literals.SCOPE__SIGNALS ||
            childFeature == SyncchartsPackage.Literals.SCOPE__VARIABLES ||
            childFeature == SyncchartsPackage.Literals.SCOPE__SUSPENSION_TRIGGER ||
            childFeature == SyncchartsPackage.Literals.SCOPE__EXIT_ACTIONS ||
            childFeature == SyncchartsPackage.Literals.SCOPE__INNER_ACTIONS ||
            childFeature == SyncchartsPackage.Literals.SCOPE__ENTRY_ACTIONS ||
            childFeature == SyncchartsPackage.Literals.SCOPE__RENAMINGS ||
            childFeature == SyncchartsPackage.Literals.SCOPE__BODY_TEXT;

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
        return SyncchartsEditPlugin.INSTANCE;
    }

}
