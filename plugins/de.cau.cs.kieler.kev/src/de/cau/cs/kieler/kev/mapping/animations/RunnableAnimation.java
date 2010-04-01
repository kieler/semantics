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
    @SuppressWarnings("unchecked")
    public void run() {

        Animation animation;
        String jsonKey, newJSONValue, oldJSONValue, svgElementID;

        MapAnimations currentMapAnimation = MapAnimations.getInstance(); 
        //Reset the modified Keyset before applying the animations - otherwise we get strange effects
        currentMapAnimation.getModifiedKeyMap().clear();
        if (oldJSONObject == null) {
            oldJSONObject = new JSONObject();
        }
        
        HashMap<String, ArrayList<Pair<String, Animation>>> keyToAnimationsMap = currentMapAnimation.getKeyToAnimationsMap();
        Iterator<String> jsonKeyIterator = newJSONObject.keys();
        
        while (jsonKeyIterator.hasNext()) {

            jsonKey = jsonKeyIterator.next();
            newJSONValue = newJSONObject.optString(jsonKey);
            oldJSONValue = oldJSONObject.optString(jsonKey);
            
            //ONLY APPLY IF THE JSON-VALUE HAS CHANGED OR THE FIRST CHAR IS THE $-Operator
            if (!newJSONValue.equals(oldJSONValue) || oldJSONValue.indexOf("$") == 0) {
                //System.out.println("KEY: "+jsonKey + " Value: "+jsonKeyToInputValuesToAnimationsMap.get(jsonKey));
                if (keyToAnimationsMap.containsKey(jsonKey)) {
                    
                    for (Pair<String, Animation> pair : keyToAnimationsMap.get(jsonKey)) {
                        svgElementID = pair.getFirst();
                        animation = pair.getSecond();


                        //Test if the current Value matches the input of the animation or is empty
                        if (animation.getInput().equals("") || currentMapAnimation.jsonValueMatchesInputValue(newJSONValue, animation.getInput())) {
                            if (currentMapAnimation.getModifiedKeyMap().containsKey(svgElementID)) {
                                if (currentMapAnimation.getModifiedKeyMap().get(svgElementID).add(animation.eClass().getName())) {
                                    //System.out.println(animation.eClass().getName()+ " -> "+svgElementID+ " input: "+animation.getInput());
                                    animation.apply(newJSONObject, svgElementID);
                                }
                            } else {
                                animation.apply(newJSONObject, svgElementID);
                                currentMapAnimation.getModifiedKeyMap().put(svgElementID, new HashSet<String>());
                                currentMapAnimation.getModifiedKeyMap().get(svgElementID).add(animation.eClass().getName());
                            }
                        }
                        //System.out.println(animation.eClass().getName()+ " -> "+svgElementID+ " input: "+animation.getInput());
                    }
                }
            }

        }
    }

}
