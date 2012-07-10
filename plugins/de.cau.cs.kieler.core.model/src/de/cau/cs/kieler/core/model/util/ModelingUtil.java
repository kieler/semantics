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
 */
package de.cau.cs.kieler.core.model.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Utility class with static methods to handle EMF models and GEF EditParts.
 * 
 * @author haf
 */
public final class ModelingUtil {

    /**
     * Private constructor to avoid instantiation.
     */
    private ModelingUtil() {
    }

    /**
     * Get all objects that are direct or indirect children of the given root EObject if they are of
     * the specified type.
     * 
     * @author haf
     * @param eObjectClass
     *            The type of object
     * @param rootObject
     *            The root object
     * @return Collection of found EObject matching the type
     */
    public static Collection<EObject> getAllByType(final EClassifier eObjectClass,
            final EObject rootObject) {
        TreeIterator<Object> iterator = EcoreUtil.getAllContents(rootObject, true);
        Collection<EObject> elements = EcoreUtil.getObjectsByType(iterator2Collection(iterator),
                eObjectClass);
        return elements;
    }

    /**
     * Get all objects that are direct or indirect parents of the given root EObject if they are of
     * the given type.
     * 
     * @author haf
     * @param eObjectClass
     *            The type of object
     * @param rootObject
     *            The root object to start the search
     * @return Collection of found EObject matching the type
     */
    public static Collection<EObject> getAllAncestorsByType(final EClassifier eObjectClass,
            final EObject rootObject) {
        Collection<EObject> ancestors = new ArrayList<EObject>();
        EObject parent = rootObject.eContainer();
        while (parent != null) {
            ancestors.add(parent);
            parent = rootObject.eContainer();
        }
        Collection<EObject> elements = EcoreUtil.getObjectsByType(ancestors, eObjectClass);
        return elements;
    }

    /**
     * Convert an Iterator to a Collection. Useful if some method returns only an iterator but some
     * other method takes a Collection as input to iterate over that collection. However, it has
     * linear runtime and many such transformations should be avoided.
     * 
     * @author haf
     * @param <T>
     *            the base type
     * @param iter
     *            The input Iterator
     * @return A Collection containing all elements of the Iterator.
     */
    public static <T> Collection<T> iterator2Collection(final Iterator<T> iter) {
        ArrayList<T> list = new ArrayList<T>();
        for (; iter.hasNext();) {
            T item = iter.next();
            list.add(item);
        }
        return list;
    }

    /**
     * Translate a KIELER URI to an EMF Fragment URI.
     * 
     * @param kielerUri
     *            The KIELER URI referring an EObject.
     * @param resource
     *            The Resource holding the EObject.
     * @return The Fragment URI for the EObject referred by the given KIELER URI. Null, if EObject
     *         doesn't exists.
     */
    public static String kielerUriToFragmentUri(final String kielerUri, final Resource resource) {
        return kielerUriToFragmentUri(kielerUri, resource, "name");
    }
    
    /**
     * Translate a KIELER URI to an EMF Fragment URI.
     * 
     * @param kielerUri
     *            The KIELER URI referring an EObject.
     * @param resource
     *            The Resource holding the EObject.
     * @param nameProperty
     *            the name of the structural feature that is used to get a name for elements
     * @return The Fragment URI for the EObject referred by the given KIELER URI. Null, if EObject
     *         doesn't exists.
     */
    public static String kielerUriToFragmentUri(final String kielerUri, final Resource resource,
            final String nameProperty) {
        String result = "";

        try {
            if (resource.getEObject(kielerUri) != null) {
                // when EObjects aren't named, the KIELER URI equals the Fragment URI
                return kielerUri;
            }
        } catch (IllegalArgumentException ex) {
            // can be ignored, we then know that we dont have a Fragment URI as KIELER URI
        }

        if (kielerUri.startsWith("//")) {
            // derive a method name from the name property
            String nameMethod = "get" + Character.toUpperCase(nameProperty.charAt(0))
                    + nameProperty.substring(1);
            
            // only one root node present, no translation necessary
            EObject root = resource.getContents().get(0);
            result = "/";
            int lastOccurance = 2;
            int currentOccurance;

            while (kielerUri.indexOf("/", lastOccurance) != -1) {
                // parse KIELER URI and find corresponding EObject on the current level
                result += "/";
                currentOccurance = kielerUri.indexOf("/", lastOccurance);
                String currentUri;

                if (currentOccurance != lastOccurance) {
                    currentUri = kielerUri.substring(lastOccurance, currentOccurance);
                    lastOccurance = currentOccurance;
                } else {
                    // when this is the last referrer, just take the rest
                    currentUri = kielerUri.substring(lastOccurance);
                    lastOccurance = kielerUri.length();
                }
                String currentResult = new String(result);
                for (EObject eo : root.eContents()) {
                    // iterate through the current level and find the NamedObject with the same name
                    try {
                        Object obj = eo.getClass().getMethod(nameMethod).invoke(eo);
                        if (obj instanceof String) {
                            String name = (String) obj;
                            if (name.equals(currentUri.split("\\.")[1])) {
                                result += ((InternalEObject) eo.eContainer()).eURIFragmentSegment(
                                        eo.eContainingFeature(), eo);
                                root = eo;
                                break;
                            }
                        }
                    } catch (Exception exception) {
                        // a lot can go wrong with reflection, so ignore it
                    }
                }
                if (currentResult.equals(result)) {
                    // Element wasn't found, although this was the right level
                    // Return null then
                    return null;
                }
            }
        } else {
            // more than one root node
            throw new UnsupportedOperationException("Can't handle more than one root node yet!");
        }
        return result;
    }

    /**
     * Method to get a (more readable) KIELER URI from a EMF Fragment URI and its resource. Will
     * return the Fragment URI, if EObjects are not NamedObjects. If using NamedObjects, it is
     * required that names on the same level are unique.
     * 
     * @see de.cau.cs.kieler.core.annotations.NamedObject
     * 
     * @param fragmentUri
     *            The Fragment URI from which the KIELER URI is generated (must not be null).
     * @param resource
     *            The resource in which the referred EObject is held.
     * @return A KIELER URI corresponding to the Fragment URI.
     */
    public static String fragmentUriToKielerUri(final String fragmentUri, final Resource resource) {
        return fragmentUriToKielerUri(fragmentUri, resource, "name");
    }
    
    /**
     * Method to get a (more readable) KIELER URI from a EMF Fragment URI and its resource. Will
     * return the Fragment URI, if EObjects are not NamedObjects.
     * 
     * @param fragmentUri
     *            The Fragment URI from which the KIELER URI is generated (must not be null).
     * @param resource
     *            The resource in which the referred EObject is held.
     * @param nameProperty
     *            the name of the structural feature that is used to get a name for elements
     * @return A KIELER URI corresponding to the Fragment URI.
     */
    public static String fragmentUriToKielerUri(final String fragmentUri, final Resource resource,
            final String nameProperty) {
        // derive a method name from the name property
        String nameMethod = "get" + Character.toUpperCase(nameProperty.charAt(0))
                + nameProperty.substring(1);
        InternalEObject ieo = (InternalEObject) resource.getEObject(fragmentUri);
        InternalEObject container = (InternalEObject) ieo.eContainer();

        if (container != null) {
            try {
                Object obj = ieo.getClass().getMethod(nameMethod).invoke(ieo);
                if (obj instanceof String) {
                    String name = (String) obj;
                    return fragmentUriToKielerUri(getFragmentUri(container), resource) + "/" + "@"
                            + ieo.eContainingFeature().getName() + "." + name;
                }
            } catch (Exception exception) {
                // a lot can go wrong with reflection, so ignore it
            }
            return fragmentUriToKielerUri(getFragmentUri(container), resource) + "/"
                    + container.eURIFragmentSegment(ieo.eContainingFeature(), ieo);
        }
        return "/";
    }

    /**
     * Method to get the EMF Fragment URI for a given EObject.
     * 
     * @param eo
     *            The EObject for which the URI is requested (must not be null).
     * @return The full Fragment URI.
     */
    public static String getFragmentUri(final EObject eo) {
        String fragment = "";
        InternalEObject ieo = (InternalEObject) eo;
        InternalEObject container = (InternalEObject) eo.eContainer();

        if (container != null) {
            fragment = getFragmentUri(container) + "/"
                    + container.eURIFragmentSegment(ieo.eContainingFeature(), ieo);
        } else {
            fragment = "/";
        }

        return fragment;
    }

}
