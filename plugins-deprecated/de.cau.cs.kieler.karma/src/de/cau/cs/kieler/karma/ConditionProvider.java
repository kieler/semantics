/*
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
 * 
 *****************************************************************************/

package de.cau.cs.kieler.karma;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.Bundle;

import com.google.common.base.Strings;
import com.google.common.collect.Maps;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.karma.conditions.CompoundCondition;
import de.cau.cs.kieler.karma.conditions.FeatureValueCondition;
import de.cau.cs.kieler.karma.conditions.ICondition;
import de.cau.cs.kieler.karma.conditions.ICustomCondition;
import de.cau.cs.kieler.karma.conditions.ListSizeCondition;

/**
 * This class is for parsing the karma extension point and providing the conditions and additional
 * data accordingly.
 * 
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.rating yellow 2012-07-06 review KI-11 by chsch, pkl
 */
public final class ConditionProvider {

    /**
     * HashTable for caching condition pairs so that the ExtensionPoint is parsed only once per edit
     * part.
     */
    private HashMap<String, List<HashMap<String, Object>>> hashTableConditions = Maps.newHashMap();

    /**
     * HashTable for caching the relevant features and feature ids. Not yet used, will probably
     * removed again.
     */
    private HashMap<Integer, EStructuralFeature> hashTableRelevantFeatures = Maps.newHashMap();

    /**
     * Constructor set to private to ensure usage of singleton instance.
     */
    private ConditionProvider() {

    }

    /**
     * Singleton instance.
     */
    private static ConditionProvider instance = new ConditionProvider();

    /**
     * Standard singleton getInstance.
     * 
     * @return the singleton instance
     */
    public static ConditionProvider getInstance() {
        return instance;
    }

    /**
     * extension point id.
     */
    public static final String EXTENSION_POINT_ID = "de.cau.cs.kieler.karma";

    /**
     * Method that will read the extension point and return a list of pairs with a figure and a
     * condition on which the figure should be shown.
     * 
     * @param callingEditPart
     *            the editor for which the returned conditions will be defined
     * @return list of all condition figure pairs that fit the given editor
     */
    public List<HashMap<String, Object>> getPairs(final String callingEditPart) {
        if (hashTableConditions.containsKey(callingEditPart)) {
            //if its cached we are done already
            return hashTableConditions.get(callingEditPart);
        }
        List<HashMap<String, Object>> conditionsList = new LinkedList<HashMap<String, Object>>();
        IConfigurationElement[] configurations = Platform.getExtensionRegistry()
                .getConfigurationElementsFor(EXTENSION_POINT_ID);
        for (IConfigurationElement settings : configurations) {
            if (!settings.getName().equals("configuration")) {
                Status myStatus = new Status(IStatus.ERROR, KarmaPlugin.PLUGIN_ID,
                        "karma extensionpoint could not be read correctly");
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                continue;
            }
            IConfigurationElement[] parts = settings.getChildren("editPart");
            //we need to be an editpart thats supposed to be a target of karma.
            //(registered in the extensionpoint)
            if (checkCompatibleEditParts(parts, callingEditPart)) {
                int prio = 1;
                String prioString = settings.getAttribute("Priority");
                if (prioString != null) {
                    prio = Integer.parseInt(prioString);
                }
                IConfigurationElement[] packages = settings.getChildren("package");
                IConfigurationElement[] conditionsContainer = settings.getChildren("conditions");
                for (IConfigurationElement conditionContainer : conditionsContainer) {
                    IConfigurationElement[] conditions = conditionContainer.getChildren();
                    //read and build all those conditions
                    for (IConfigurationElement condition : conditions) {
                        //our condition element is a hashmap to be flexible in how many 
                        //and what informations to provide.
                        HashMap<String, Object> conditionElement = new HashMap<String, Object>();

                        //set the priority
                        conditionElement.put("prio", prio);

                        //Make an instance of the rendering provider read from the extension and set it.
                        IRenderingProvider renderingProvider = null;
                        try {
                            renderingProvider = (IRenderingProvider) settings
                                    .createExecutableExtension("RenderingProvider");
                        } catch (CoreException e1) {
                            throw new WrappedException(e1);
                        }
                        conditionElement.put("renderingProvider", renderingProvider);

                        //Read the figure, borderitem, layout and figuresize strings and set them.
                        String figureParam = condition.getAttribute("figureParam");
                        if (figureParam == null) {
                            figureParam = "";
                        }
                        conditionElement.put("figureParam", figureParam);

                        String borderItemParam = condition.getAttribute("borderItemParam");
                        if (borderItemParam == null) {
                            borderItemParam = "";
                        }
                        
                        conditionElement.put("borderItemParam", borderItemParam);
                        String layoutParam = condition.getAttribute("layoutParam");
                        if (layoutParam == null) {
                            layoutParam = "";
                        }
                        conditionElement.put("layoutParam", layoutParam);

                        String figureSizeString = condition.getAttribute("figureSize");
                        Pair<Integer, Integer> figureSize = this.parseFigureSize(figureSizeString);
                        conditionElement.put("figureSize", figureSize);
                        
                        //Read and build the actual condition
                        ICondition<EObject> cond = getCondition(condition, packages);
                        if ((cond != null)) {
                            conditionElement.put("condition", cond);
                            conditionsList.add(conditionElement);
                        } else {
                            Status myStatus = new Status(IStatus.ERROR, KarmaPlugin.PLUGIN_ID,
                                    "A failure occured while reading conditions from the " 
                                            + "karma extension point");
                            StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                        }
                    }
                }
            }
        }
        if (!conditionsList.isEmpty()) {
            Collections.sort(conditionsList, new ConditionElementComparator());
            hashTableConditions.put(callingEditPart, conditionsList);
            return conditionsList;
        } else {
            return null;
        }
    }

    /**
     * Method for getting the condition of an configuration element.
     * 
     * @param condition
     *            the configuration element that represents a condition
     * @param packages
     *            The packages that will be searched for features.
     * @return a condition according to the given configuration element. null if failed
     */
    private ICondition<EObject> getCondition(final IConfigurationElement condition,
            final IConfigurationElement[] packages) {
        //if its a FeatureValueCondition we try to get the EStructuralFeature from the packages
        //and try to get the desired value by guessing its type. (atm only supports enum and boolean)
        if (condition.getName().equals("featureValueCondition")) {
            String featureString = condition.getAttribute("feature");
            String typeString = condition.getAttribute("type");
            EStructuralFeature feature = getFeatureFromPackages(packages, featureString, typeString);
            if (feature != null) {
                if (!(hashTableRelevantFeatures.containsKey(feature.getFeatureID()))) {
                    hashTableRelevantFeatures.put(feature.getFeatureID(), feature);
                }
                Object value = getValueByFeature(feature, condition.getAttribute("value"));
                if (value != null) {
                    FeatureValueCondition cond = new FeatureValueCondition(feature, value);
                    return cond;
                } else {
                    Status myStatus = new Status(IStatus.ERROR, KarmaPlugin.PLUGIN_ID,
                            "While reading karma extension point:" 
                                    + " Could not parse value to type of feature.");
                    StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                }
            } else {
                Status myStatus = new Status(IStatus.ERROR, KarmaPlugin.PLUGIN_ID,
                        "While reading karma extension point:" 
                                + " Could not find specified feature.");
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
            }
            //If its a ListSizeCondition try to get the EStructuredFeature from registered packages.
            //Also try to parse the desired size as an int and an operator 
            //(i.e. =< from the input string) 
        } else if (condition.getName().equals("listSizeCondition")) {
            String featureString = condition.getAttribute("feature");
            String typeString = condition.getAttribute("type");
            String sizeString = condition.getAttribute("size");
            int size = this.parseListSize(sizeString).getSecond();
            String operator = this.parseListSize(sizeString).getFirst();
            EStructuralFeature feature = getFeatureFromPackages(packages, featureString, typeString);
            if (feature != null) {
                if (!(hashTableRelevantFeatures.containsKey(feature.getFeatureID()))) {
                    hashTableRelevantFeatures.put(feature.getFeatureID(), feature);
                }
                ListSizeCondition cond = new ListSizeCondition(feature, size, operator);
                return cond;
            } else {
                Status myStatus = new Status(IStatus.ERROR, KarmaPlugin.PLUGIN_ID,
                        "While reading karma extension point:" 
                                + " Could not find specified feature.");
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
            }
            // If its a CompoundCondition do some recursion to get the inner ones.
        } else if (condition.getName().equals("compoundCondition")) {
            IConfigurationElement[] compounds = condition.getChildren();
            LinkedList<ICondition<EObject>> compoundList = new LinkedList<ICondition<EObject>>();
            for (IConfigurationElement compound : compounds) {
                ICondition<EObject> compCond = getCondition(compound, packages);
                if (compCond != null) {
                    compoundList.add(compCond);
                } else {
                    Status myStatus = new Status(IStatus.ERROR, KarmaPlugin.PLUGIN_ID,
                            "While reading karma extension point:" 
                                    + " Could not not build compound.");
                    StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                }
            }
            CompoundCondition<EObject> cond = new CompoundCondition<EObject>(compoundList);
            return cond;
            //If its a custom condition try to instanciate and initialize it.
        } else if (condition.getName().equals("customCondition")) {
            try {
                Object customConditionObject = condition.createExecutableExtension("condition");
                String key = condition.getAttribute("key");
                String value = condition.getAttribute("value");
                if (customConditionObject instanceof ICustomCondition<?>) {
                    @SuppressWarnings("unchecked")
                    ICustomCondition<EObject> customCondition
                            = (ICustomCondition<EObject>) customConditionObject;
                    customCondition.initialize(key, value);
                    return customCondition;
                }
            } catch (CoreException e) {
                throw new WrappedException(e);
            }
        }
        return null;
    }

    /**
     * Parses a value out of a given string according to the type of a given feature.
     * 
     * @param feature
     *            the feature for getting the type
     * @param value
     *            string representation of the value
     * @return the value parsed to the correct type
     */
    private Object getValueByFeature(final EObject feature, final String value) {
        if (feature instanceof EAttributeImpl) {
            EAttributeImpl attr = (EAttributeImpl) feature;
            EClassifier type = attr.getEType();
            if (type instanceof EEnum) {
                EEnum eenum = (EEnum) ((EAttribute) feature).getEType();
                EEnumLiteral literal = eenum.getEEnumLiteral(value);
                return literal.getInstance();
            } else if (type.getName().equals("EBoolean")) {
                return Boolean.parseBoolean(value);
            }
        }
        return null;
    }

    /**
     * Method that searches in packages for a feature.
     * 
     * @param packages
     *            an array of configuration elements that represent the packages
     * @param feature
     *            the name of the feature to be searched
     * @param type
     *            the class type that contains the feature
     * @return a feature if found, else {@code null}
     */
    private static EStructuralFeature getFeatureFromPackages(final IConfigurationElement[] packages,
            final String feature, final String type) {
        for (IConfigurationElement packConfig : packages) {
            Bundle bundle = Platform.getBundle(packConfig.getContributor().getName());
            if (bundle != null) {
                try {
                    Class<?> clazz = bundle.loadClass(packConfig.getAttribute("class"));
                    EPackage pack = getEPackageByClass(clazz);
                    if (pack != null) {
                        EClassifier classifier = pack.getEClassifier(type);
                        if (classifier instanceof EClass) {
                            EStructuralFeature result = ((EClass) classifier).getEStructuralFeature(
                                    feature);
                            if (result != null) {
                                return result;
                            }
                        }
                    }
                } catch (ClassNotFoundException exception) {
                    // ignore exception
                }
            }
        }
        return null;
    }
    
    /**
     * Returns the EPackage instance for the given package class.
     * 
     * @param clazz a package class
     * @return the corresponding package instance, or {@code null} if none is found
     */
    private static EPackage getEPackageByClass(final Class<?> clazz) {
        try {
            // each EPackage class has an 'eINSTANCE' field which holds the implementation instance
            final Field f = clazz.getField("eINSTANCE");
            // retrieve the EPackage instance from the eINSTANCE field
            final EPackage result = (EPackage) f.get(null);
            // register the EPackage instance in the EPackage Registry
            EPackage.Registry.INSTANCE.put(result.getNsURI(), result);
            return result;
        } catch (SecurityException e) {
            return null;
        } catch (NoSuchFieldException e) {
            return null;
        } catch (IllegalArgumentException e) {
            return null;
        } catch (IllegalAccessException e) {
            return null;
        }
    }

    /**
     * Checks whether the calling edit part is included in the registered ones.
     * 
     * @param parts
     *            the registered edit parts
     * @param className
     *            the name of the calling edit part
     * @return true if included else false
     */
    private boolean checkCompatibleEditParts(final IConfigurationElement[] parts,
            final String className) {
        for (IConfigurationElement part : parts) {
            String registeredName = part.getAttribute("editPart");
            if (registeredName.equals(className)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method for parsing the list size string of the extension point to an operator and the number.
     * 
     * @param Input
     *            a string with an operator and number read from the extension point.
     * @return A pair of and operator and an integer.
     */
    private Pair<String, Integer> parseListSize(final String input) {
        Pair<String, Integer> result = null;
        char[] charInput = input.toCharArray();
        boolean isOp = true;
        StringBuffer operator = new StringBuffer();
        StringBuffer numberString = new StringBuffer();
        for (char c : charInput) {
            if (isOp) {
                if ((c == '<') || (c == '>') || (c == '=') || (c == '!')) {
                    operator.append(c);
                } else {
                    isOp = false;
                    numberString.append(c);
                }
            } else {
                numberString.append(c);
            }
        }
        int number = Integer.parseInt(numberString.toString());
        result = new Pair<String, Integer>(operator.toString(), number);
        return result;
    }

    /**
     * Method to parse the height and width out of the string read from the extension.
     * @param input the size string read from the extension.
     * @return a width/height pair of int
     */
    private Pair<Integer, Integer> parseFigureSize(final String input) {
        if (!Strings.isNullOrEmpty(input)) {
            String[] xandy = input.split(",");
            if (xandy.length == 2) {
                try {
                    int x = Integer.parseInt(xandy[0]);
                    int y = Integer.parseInt(xandy[1]);
                    return new Pair<Integer, Integer>(x, y);
                } catch (NumberFormatException e) {
                    throw new WrappedException(e);
                }
            } else {
                Status myStatus = new Status(IStatus.ERROR, KarmaPlugin.PLUGIN_ID,
                        "While reading karma extension point:" 
                                + " wrong format of figure size");
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                throw new RuntimeException("wrong format of figure size");
            }
        } else {
            return new Pair<Integer, Integer>(-1, -1);
        }
    }

    /**
     * 
     * @author ckru
     * 
     *         Comparator for sorting the list of condition extensions by priority.
     * 
     */
    private static class ConditionElementComparator implements Comparator<HashMap<String, Object>> {

        /**
         * Compare by priority.
         */
        public int compare(final HashMap<String, Object> o1, final HashMap<String, Object> o2) {
            if (o1.get("prio") instanceof Integer && o2.get("prio") instanceof Integer) {
                int prio1 = (Integer) o1.get("prio");
                int prio2 = (Integer) o2.get("prio");
            
                if (prio1 == prio2) {
                    return 0;
                } else if (prio1 < prio2) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        }
    }
}
