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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * This class represents a transformation group.
 * 
 * @author cmot
 * @kieler.design 2014-03-11 proposed
 * @kieler.rating 2014-03-11 proposed yellow
 * 
 */
public class TransformationGroup extends Transformation {

    /** The alternative flag, initially it is false. */
    private boolean alternatives = false;
    

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public EObject transform(EObject eObject, KielerCompilerContext context) {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is alternative.
     * 
     * @return true, if is alternative
     */
    public boolean isAlternatives() {
        return alternatives;
    }
    

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> getDependencies() {
        return super.getDependencies();
//        throw new RuntimeException(
//                "getDependencies() should not be called on a TransformationGroup. You"
//                        + "must call getDependencies(List<String> prioritizedTransformationIDs).");
    }

    // -------------------------------------------------------------------------
    
    public boolean isDisabled(String transformationID, List<String> disabledTransformationIDs) {
       for (String disabled : disabledTransformationIDs) {
           if (disabled.equals(transformationID)) {
               return true;
           }
       }
       return false;
    }
    
    

    /**
     * Gets the selected dependencies. For alternative groups return the first match of dependencies
     * found in prioritizedTransformationIDs, if any. If no match or
     * prioritizedTransformationIDs is null then return the first element of dependencies. A group
     * may never have an empty list here.
     * 
     * @param selectedTransformationIDs
     *            the prioritized transformationIDs
     * @return the dependencies
     */
    public String getSelectedDependency(List<String> selectedTransformationIDs, List<String> disabledTransformationIDs, List<String> priorizedTransformationIDs) {
        if (!alternatives) {
            return super.getDependencies().get(0);
        } else {
            // return the first transformation only (that is not disabled!)
            List<String> dependencies = super.getDependencies();
            if (selectedTransformationIDs == null || selectedTransformationIDs.size() == 0) {
                for (String dependency : dependencies) {
                    System.out.println("### Check" + dependency);
                    if (!isDisabled(dependency, disabledTransformationIDs)) {
                        System.out.println("### NOT DISABLED -> RETURN " + dependency);
                        return dependency;
                    }
                }
                // IF we do not find any enabled, return null
                return null;
            } else {
                // try to find one of the transformations listed in dependencies in
                // prioritizedTransformationIDs
                // and return the a list with only the first one
                for (String selectedDependency : selectedTransformationIDs) {
                    for (String dependency : dependencies) {
                        boolean isDisabled  = isDisabled(dependency, disabledTransformationIDs);
                        if (dependency.equals(selectedDependency) && !isDisabled) {
                            return dependency;
                        }
                    }

                }
                for (String prioDependency : priorizedTransformationIDs) {
                    for (String dependency : dependencies) {
                        boolean isDisabled  = isDisabled(dependency, disabledTransformationIDs);
                        if (dependency.equals(prioDependency) && !isDisabled) {
                            return dependency;
                        }
                    }

                }
                // If nothing was found, also stick to the default and return the first element (that is enabled)
                for (String dependency : dependencies) {
                    boolean isDisabled  = isDisabled(dependency, disabledTransformationIDs);
                    if (!isDisabled) {
                        return dependency;
                    }
                }
                return null; // THIS PROBABLY IS INCICATES AN ERRONOUS SELECTION
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the alternative.
     * 
     * @param alternative
     *            the new alternative
     */
    public void setAlternatives(boolean alternatives) {
        this.alternatives = alternatives;
    }


    // -------------------------------------------------------------------------
}
