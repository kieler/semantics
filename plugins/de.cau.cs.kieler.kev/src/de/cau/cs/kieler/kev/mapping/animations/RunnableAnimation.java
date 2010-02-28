/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
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

package de.cau.cs.kieler.kev.mapping.animations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.json.JSONObject;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kev.mapping.Animation;

/**
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * @kieler.rating 2010-02-17 proposed yellow
 */
public class RunnableAnimation implements Runnable {

    private JSONObject oldJSONObject, newJSONObject;
    

    
    public RunnableAnimation(JSONObject oldJSONObject, JSONObject newJSONObject) {
        this.oldJSONObject = oldJSONObject;
        this.newJSONObject = newJSONObject;
    }
    
    /**
     * The code for manipulating the SVGDocument.

     */
    public void run() {
        //Here we can put some code for SVGDocument manipulation, 
        //but we don't need it now because we manipulate the tree already within
        //the animations itself.

        JSONObject resultObject;

        Animation animation;
        String jsonKey, jsonValue, svgElementID;

        MapAnimations currentMapAnimation = MapAnimations.getInstance(); 

//        if the lastObject exists, we want to compare the actual jsonOject and the last one to compute the difference between them
        if (oldJSONObject != null) {
            //resultObject = currentMapAnimation.compareDifference(oldJSONObject, newJSONObject);
            resultObject = newJSONObject;
//            System.out.println("Difference: "+resultObject);
        } else {
            resultObject = newJSONObject;
        }
        
        HashSet<String> alreadyAppliedAnimationTypes = new HashSet<String>();
        HashMap<String, ArrayList<Pair<String, Animation>>> defaultKeyToAnimationsMap = currentMapAnimation.getDefaultKeyToAnimationsMap();
        HashMap<String, HashMap<String, ArrayList<Pair<String, Animation>>>> jsonKeyToInputValuesToAnimationsMap = currentMapAnimation.getJsonKeyToInputValuesToAnimationsMap();
        Iterator<String> jsonKeyIterator = resultObject.keys();


        while (jsonKeyIterator.hasNext()) {

            jsonKey = jsonKeyIterator.next();
            jsonValue = resultObject.optString(jsonKey);
            //System.out.println("KEY: "+jsonKey + " Value: "+jsonKeyToInputValuesToAnimationsMap.get(jsonKey));
            if (jsonKeyToInputValuesToAnimationsMap.containsKey(jsonKey)) {
                if (jsonKeyToInputValuesToAnimationsMap.get(jsonKey).containsKey(jsonValue)) {
                    for (Pair<String, Animation> pair : jsonKeyToInputValuesToAnimationsMap.
                            get(jsonKey).get(jsonValue)) {
                        svgElementID = pair.getFirst();
                        animation = pair.getSecond();

                        //                      System.out.println("Type of Animation: "+animation.eClass().getName());
                        alreadyAppliedAnimationTypes.add(animation.eClass().getName()); // It's the type of the animation e.g. Opacity
                        animation.apply(resultObject, svgElementID);
                    }
                } else if (resultObject.optDouble(jsonKey) != Double.NaN) {
                    //                  System.out.println(jsonKeyToInputValuesToAnimationsMap.get(jsonKey).keySet());
                    Iterator<String> ranges = jsonKeyToInputValuesToAnimationsMap.get(jsonKey).keySet().iterator();
                    String range;
                    while (ranges.hasNext()) {
                        range = ranges.next();
                        if (currentMapAnimation.valueMatchesRange(jsonValue, range)) {
                            for (Pair<String, Animation> pair : jsonKeyToInputValuesToAnimationsMap.
                                    get(jsonKey).get(range)) {
                                svgElementID = pair.getFirst();
                                animation = pair.getSecond();
                                //                              System.out.println("Ist im Bereich! -> "+range+ " SVGElementID: "+svgElementID);

                                animation.apply(resultObject, svgElementID);
                                alreadyAppliedAnimationTypes.add(animation.eClass().getName()); // It's the type of the animation e.g. Opacity
                            }
                        }
                    } 
                }
                if (defaultKeyToAnimationsMap.containsKey(jsonKey)) { // Check if an default animation exists
                    // if this matches, we know that the jsonValue is a valid double value
                    //                  System.out.println("Fall 1 -> "+jsonKey+ " Number of Animations: "+defaultKeyToAnimationsMap.get(jsonKey).size() );
                    for (Pair<String, Animation> pair : defaultKeyToAnimationsMap.get(jsonKey)) {
                        svgElementID = pair.getFirst();
                        animation = pair.getSecond();

                        // Apply only these animations, which have not applied before.
                        if (!alreadyAppliedAnimationTypes.contains(animation.eClass().getName())) {
                            animation.apply(resultObject, svgElementID);
                            //                          System.out.println("Für "+animation.eClass().getName()+" wurde kein wert gefunden -> wende Defaultwert an!");
                        }
                    }
                }
            } else if (defaultKeyToAnimationsMap.containsKey(jsonKey)) {
                // if this matches, we know that the jsonValue is a valid double value
                System.out.println("Fall 2 -> Range: "+jsonKey+ " Number of Animations: "+defaultKeyToAnimationsMap.get(jsonKey).size() );
                for (Pair<String, Animation> pair : defaultKeyToAnimationsMap.get(jsonKey)) {
                    svgElementID = pair.getFirst();
                    animation = pair.getSecond();

                    // Apply only these animations, which have not applied before.
                    if (!alreadyAppliedAnimationTypes.contains(animation.eClass().getName())) {
                        animation.apply(resultObject, svgElementID);
                        //                      System.out.println("Für "+animation.eClass().getName()+" wurde kein wert gefunden -> wende Defaultwert an!");
                    }
                }                        
            } 
            //          System.out.println("Applied Animation-Types in this Tick: "+alreadyAppliedAnimationTypes);
            alreadyAppliedAnimationTypes.clear(); // Clear hashset for next json value
        }
    }

}
