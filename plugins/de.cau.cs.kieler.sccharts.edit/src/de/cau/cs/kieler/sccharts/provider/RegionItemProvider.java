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


import de.cau.cs.kieler.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory;

import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsFactory;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

import de.cau.cs.kieler.scl.SCLFactory;

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
 * This is the item provider adapter for a {@link de.cau.cs.kieler.sccharts.Region} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RegionItemProvider extends ScopeItemProvider {
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
    public RegionItemProvider(AdapterFactory adapterFactory) {
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

            addOverridePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Override feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOverridePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Region_override_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Region_override_feature", "_UI_Region_type"),
                 SCChartsPackage.Literals.REGION__OVERRIDE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
            childrenFeatures.add(SCChartsPackage.Literals.REGION__COUNTER_VARIABLE);
            childrenFeatures.add(SCChartsPackage.Literals.REGION__FOR_START);
            childrenFeatures.add(SCChartsPackage.Literals.REGION__FOR_END);
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
     * This returns Region.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Region"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Region)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Region_type") :
            getString("_UI_Region_type") + " " + label;
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

        switch (notification.getFeatureID(Region.class)) {
            case SCChartsPackage.REGION__OVERRIDE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case SCChartsPackage.REGION__COUNTER_VARIABLE:
            case SCChartsPackage.REGION__FOR_START:
            case SCChartsPackage.REGION__FOR_END:
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
                (SCChartsPackage.Literals.REGION__COUNTER_VARIABLE,
                 KExpressionsFactory.eINSTANCE.createValuedObject()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 SCChartsFactory.eINSTANCE.createScopeCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KEffectsFactory.eINSTANCE.createHostcodeEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KEffectsFactory.eINSTANCE.createReferenceCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KEffectsFactory.eINSTANCE.createFunctionCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KEffectsFactory.eINSTANCE.createPrintCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KEffectsFactory.eINSTANCE.createRandomizeCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createFloatValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createBoolValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createStringValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createVectorValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createIgnoreValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createJsonObjectValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createJsonArrayValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createNullValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createTextExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createScheduleObjectReference()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createReferenceCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createFunctionCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createPrintCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createRandomCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 KExpressionsFactory.eINSTANCE.createRandomizeCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_START,
                 SCLFactory.eINSTANCE.createModuleCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 SCChartsFactory.eINSTANCE.createScopeCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KEffectsFactory.eINSTANCE.createHostcodeEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KEffectsFactory.eINSTANCE.createReferenceCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KEffectsFactory.eINSTANCE.createFunctionCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KEffectsFactory.eINSTANCE.createPrintCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KEffectsFactory.eINSTANCE.createRandomizeCallEffect()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createValuedObjectReference()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createIntValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createFloatValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createBoolValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createStringValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createVectorValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createIgnoreValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createJsonObjectValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createJsonArrayValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createNullValue()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createOperatorExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createTextExpression()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createScheduleObjectReference()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createReferenceCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createFunctionCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createPrintCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createRandomCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 KExpressionsFactory.eINSTANCE.createRandomizeCall()));

        newChildDescriptors.add
            (createChildParameter
                (SCChartsPackage.Literals.REGION__FOR_END,
                 SCLFactory.eINSTANCE.createModuleCall()));
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
            childFeature == KExpressionsPackage.Literals.SCHEDULABLE__SCHEDULE ||
            childFeature == SCChartsPackage.Literals.REGION__FOR_START ||
            childFeature == SCChartsPackage.Literals.REGION__FOR_END ||
            childFeature == SCChartsPackage.Literals.SCOPE__REFERENCE;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
