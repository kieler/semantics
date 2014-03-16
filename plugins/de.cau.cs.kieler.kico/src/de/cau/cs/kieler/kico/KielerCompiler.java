/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * This is the main class of the Kieler Compiler (KiCo) Project that aims to provide an
 * infrastructure for compiling via consecutive modal transformations.
 * 
 * @author cmot
 * @kieler.design 2014-03-13 proposed
 * @kieler.rating 2014-03-13 proposed yellow
 * 
 */
public class KielerCompiler {
    
    /** The Constant DEBUG. */
    public static final boolean DEBUG = !System.getProperty("java.vm.info", "").contains("sharing");
    
    /** The cached transformations. */
    private static HashMap<String, Transformation> transformations = null;

    //-------------------------------------------------------------------------

    private static HashMap<String, Transformation> getTransformations() {
        if (transformations == null) {
            transformations =
                    KiCoPlugin.getDefault().getRegisteredTransformations(false);
        }
        return transformations;
    }
    
    //-------------------------------------------------------------------------


    /**
     * Gets the transformation for a transformationID.
     *
     * @param transformationId the transformation id
     * @return the dependencies
     */
    private static Transformation getTransformation(String transformationID) {
        Transformation transformation = transformations.get(transformationID);
        if (transformation == null) {
            new RuntimeException("Cannot find a transformation with the ID '"+transformationID+"'");
        }
        return transformation;
    }
    
    
    //-------------------------------------------------------------------------

    /**
     * Gets the dependencies for a transformationID.
     *
     * @param transformationId the transformation id
     * @return the dependencies
     */
    private static List<String> getDependencies(String transformationID) {
        Transformation transformation = getTransformation(transformationID);
        if (transformation == null) {
            new RuntimeException("Cannot find a transformation with the ID '"+transformationID+"'");
            return new ArrayList<String>();
        }
        return transformation.getDependencies();
    }
    
    //-------------------------------------------------------------------------
    
    /**
     * Checks if transformationID depending on possiblyDependOnTransformationId (directly or transitively).
     * 
     * Go thru all dependencies and recursively check if transformationID is part of them. 
     *
     * @param transformationID the transformation id
     * @param possiblyDependOnTransformationId the possibly depend on transformation id
     * @return true, if is depending on
     */
    private static boolean isDependingOn(String transformationID, String possiblyDependOnTransformationId) {
        List<String> dependencies = getDependencies(transformationID);
        for (String dependency : dependencies) {
            if (dependency.equals(possiblyDependOnTransformationId)) {
                return true;
            }
            if (isDependingOn(dependency, possiblyDependOnTransformationId)) {
                return true;
            }
        }
        return false;
    }
    
    //-------------------------------------------------------------------------
    
    /**
     * Insert transformationID in the correct order into list of transformationIDs.
     *
     * @param transformationIDs the transformation i ds
     * @param dependencyID the dependency id
     * @return the list
     */
    private static List<String> insertTransformationID(List<String> transformationIDs, String insertTransformationID) {
        // Do not insert if already part
        for(String checkTransformationID : transformationIDs) {
            if (checkTransformationID.equals(insertTransformationID)) {
                return transformationIDs;
            }
        }
        int insertPosition = 0;
        for(int i = transformationIDs.size()-1; i >=0; i--) {
            String checkTransformationID = transformationIDs.get(i);
            if (isDependingOn(insertTransformationID, checkTransformationID)) {
                // We have found a checkTransformationID that the instertTransformationID is depended
                // on so we have to ensure checkTransformationID is done BEFORE instertTransformationID
                // => order insterTransformationID AFTER checkTransformationID (=pos + 1)
                insertPosition = i+1;
                break;
            }
        }
        transformationIDs.add(insertPosition, insertTransformationID);
        return transformationIDs;
    }
    
    //-------------------------------------------------------------------------
    
    /**
     * Expanding dependencies will insert dependend transformation IDs into the transformationIDs
     * list and return this updated list.
     *
     * @param transformationIDs the transformation IDs
     * @return the list
     */
    private static List<String> expandDependencies(String transformationID, List<String> transformationIDs) {
        List<String> dependencies = getDependencies(transformationID);
        for(String dependency : dependencies) {
            insertTransformationID(transformationIDs, dependency);
        }
        return dependencies;
    }
    
    //-------------------------------------------------------------------------
    
    /**
     * Expand dependencies of all transformationIDs. If the transformationID is a GROUP then only
     * consider its dependencies and remove the GROUP transformationID.
     *
     * @param transformationIDs the transformation i ds
     * @return the list
     */
    private static List<String> expandDependencies(List<String> transformationIDs) {
        List<String> returnList = new ArrayList<String>();
        
        for(String transformationID : transformationIDs) {
            Transformation transformation = getTransformation(transformationID);
            List<String> dependencies = getDependencies(transformationID);
            
            if (!(transformation instanceof TransformationGroup)) {
                // Only add if no group
                returnList.add(transformationID);
            }
            // Now add all dependencies
            returnList = expandDependencies(transformationID, returnList);            
        }
        return returnList;
    }    

    //-------------------------------------------------------------------------

    /**
     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
     * transformations. Specify desired transformations with comma separated IDs.
     * 
     * @param transformationIDs
     *            the transformation i ds
     * @param eObject
     *            the e object
     * @return the object
     */
    public static Object compile(final String transformationIDs, final EObject eObject) {
        String[] transformationIDArray = transformationIDs.split(",");
        if (transformationIDArray == null) {
            return null;
        }
        return compile(Arrays.asList(transformationIDArray), eObject);
    }

    //-------------------------------------------------------------------------

    /**
     * Central KIELER Compiler compile method. It can be called in order to call several consecutive
     * transformations. Specify desired transformations as a String List of IDs.
     * 
     * @param transformationID
     *            the transformation id
     * @param eObject
     *            the e object
     * @return the object
     */
    public static Object compile(final List<String> transformationIDs, final EObject eObject) {

        EObject transformedObject = eObject;

        // For debugging ALWAYS update the registered transformations
        transformations =
                KiCoPlugin.getDefault().getRegisteredTransformations(DEBUG);

        List<String> processedTransformationIDs = expandDependencies(transformationIDs);        
        
        for (String processedTransformationID : processedTransformationIDs) {

            Transformation transformation =  getTransformation(processedTransformationID);

            if (transformation != null)
                // If the requested TransformationID
                if (transformation.getId().equals(processedTransformationID)) {
                    // If this is an individual
                    transformedObject = transformation.doTransform(transformedObject);
                }
        }
        return transformedObject;
    }

    //-------------------------------------------------------------------------
    
}
