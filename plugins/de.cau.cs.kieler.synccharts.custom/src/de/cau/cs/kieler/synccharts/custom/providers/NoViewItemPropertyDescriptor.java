/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 */
package de.cau.cs.kieler.synccharts.custom.providers;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * A specialized ItemPropertyDescriptor that has a manipulated list of choice values used in any
 * combo selection box. This list will have all objects of type View removed, because their toString
 * methods reveal very long String representations and the user will usually not reference a view in
 * a State.
 * 
 * @author haf
 * @kieler.ignore (excluded from review process)
 */
public class NoViewItemPropertyDescriptor extends ItemPropertyDescriptor {

    /**
     * {@inheritDoc} Modification: remove all elements of instance View. This avoids very long
     * toString representations in the combo box cell editor, as the views usually have very long
     * such representations.
     */
    @Override
    public Collection<?> getChoiceOfValues(final Object object) {
        Collection<?> list = super.getChoiceOfValues(object);
        Collection<Object> removeList = new LinkedList<Object>();
        for (Object choice : list) {
            if (choice instanceof EObject
                && ((EObject) choice).eClass().getEPackage() == NotationPackage.eINSTANCE) {
                removeList.add(choice);
            }
        }
        // second iteration to avoid concurrent modification exception
        for (Object toRemove : removeList) {
            list.remove(toRemove);
        }
        return list;
    }

    /*
     * The original class has a very long list of constructors. Unfortunately we have to override
     * all of them to keep the original API.
     */
    // CHECKSTYLEOFF Final Parameters
    // CHECKSTYLEOFF Method Javadoc
    // CHECKSTYLEOFF Maximum Parameters

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EStructuralFeature feature) {
        super(adapterFactory, displayName, description, feature);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EReference[] parentReferences) {
        super(adapterFactory, displayName, description, parentReferences);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EStructuralFeature feature) {
        super(adapterFactory, resourceLocator, displayName, description, feature);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EStructuralFeature feature, boolean isSettable) {
        super(adapterFactory, displayName, description, feature, isSettable);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EReference[] parentReferences) {
        super(adapterFactory, resourceLocator, displayName, description, parentReferences);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EReference[] parentReferences, boolean isSettable) {
        super(adapterFactory, displayName, description, parentReferences, isSettable);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EStructuralFeature feature, boolean isSettable) {
        super(adapterFactory, resourceLocator, displayName, description, feature, isSettable);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EStructuralFeature feature, boolean isSettable, Object staticImage) {
        super(adapterFactory, displayName, description, feature, isSettable, staticImage);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EStructuralFeature feature, boolean isSettable, String category) {
        super(adapterFactory, displayName, description, feature, isSettable, category);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EReference[] parentReferences, boolean isSettable) {
        super(adapterFactory, resourceLocator, displayName, description, parentReferences,
            isSettable);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EReference[] parentReferences, boolean isSettable, String category) {
        super(adapterFactory, displayName, description, parentReferences, isSettable, category);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EStructuralFeature feature, boolean isSettable, Object staticImage) {
        super(adapterFactory, resourceLocator, displayName, description, feature, isSettable,
            staticImage);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EStructuralFeature feature, boolean isSettable, String category) {
        super(adapterFactory, resourceLocator, displayName, description, feature, isSettable,
            category);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EStructuralFeature feature, boolean isSettable, Object staticImage,
        String category) {
        super(adapterFactory, displayName, description, feature, isSettable, staticImage, category);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EStructuralFeature feature, boolean isSettable, String category,
        String[] filterFlags) {
        super(adapterFactory, displayName, description, feature, isSettable, category, filterFlags);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EReference[] parentReferences, boolean isSettable, String category) {
        super(adapterFactory, resourceLocator, displayName, description, parentReferences,
            isSettable, category);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EReference[] parentReferences, boolean isSettable, String category,
        String[] filterFlags) {
        super(adapterFactory, displayName, description, parentReferences, isSettable, category,
            filterFlags);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EStructuralFeature feature, boolean isSettable, Object staticImage, String category) {
        super(adapterFactory, resourceLocator, displayName, description, feature, isSettable,
            staticImage, category);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EStructuralFeature feature, boolean isSettable, String category, String[] filterFlags) {
        super(adapterFactory, resourceLocator, displayName, description, feature, isSettable,
            category, filterFlags);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory, String displayName,
        String description, EStructuralFeature feature, boolean isSettable, Object staticImage,
        String category, String[] filterFlags) {
        super(adapterFactory, displayName, description, feature, isSettable, staticImage, category,
            filterFlags);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EReference[] parentReferences, boolean isSettable, String category, String[] filterFlags) {
        super(adapterFactory, resourceLocator, displayName, description, parentReferences,
            isSettable, category, filterFlags);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EStructuralFeature feature, boolean isSettable, Object staticImage, String category,
        String[] filterFlags) {
        super(adapterFactory, resourceLocator, displayName, description, feature, isSettable,
            staticImage, category, filterFlags);
    }

    public NoViewItemPropertyDescriptor(AdapterFactory adapterFactory,
        ResourceLocator resourceLocator, String displayName, String description,
        EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices,
        Object staticImage, String category, String[] filterFlags) {
        super(adapterFactory, resourceLocator, displayName, description, feature, isSettable,
            multiLine, sortChoices, staticImage, category, filterFlags);
    }

}
