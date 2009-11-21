/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by + Christian-Albrechts-University of Kiel + Department of Computer Science +
 * Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL). See the file
 * epl-v10.html for the license text.
 */

package de.cau.cs.kieler.xkev.mapping.animations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMILoadImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLContentHandlerImpl.XMI;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Document;
import org.w3c.dom.svg.SVGDocument;
import org.apache.batik.css.engine.value.Value;
import org.apache.xerces.jaxp.SAXParserFactoryImpl;

import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.mapping.Animation;
import de.cau.cs.kieler.xkev.mapping.Colorize;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.Move;
import de.cau.cs.kieler.xkev.mapping.SVGElement;
import de.cau.cs.kieler.xkev.mapping.SVGFile;
import de.cau.cs.kieler.xkev.mapping.Textbox;
import de.cau.cs.kieler.xkev.views.EclipseJSVGCanvas;
import de.cau.cs.kieler.xkev.views.EnvironmentView;

/**
 * This class connects the mapping-file with the corresponding SVG-file.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * 
 */
public class MapAnimations {

    /**
     * SVGFile is an instance of the created model .mapping file.
     */
    private SVGFile mappingFile;
    private SVGDocument svgDocument;
    private EclipseJSVGCanvas svgCanvas;
    
    
    public MapAnimations() {
        svgCanvas = (EclipseJSVGCanvas) EnvironmentView.INSTANCE.getSVGCanvas();
        svgDocument = EnvironmentView.INSTANCE.getSVGCanvas().getSVGDocument();
//        svgCanvas = getJSVGCanvas();
//        svgDocument = svgCanvas.getSVGDocument();
    }
    
    /**
     * Creates the MapAnimation instance and loads an mapping file either from Resource (examples/*) isResource=true or
     * from anywhere on the harddisk (isResource=false).
     * 
     * @param filename
     * @param isResource
     */
    
    public MapAnimations(String filename, boolean isResource) {
        svgCanvas = (EclipseJSVGCanvas) EnvironmentView.INSTANCE.getSVGCanvas();
        svgDocument = EnvironmentView.INSTANCE.getSVGCanvas().getSVGDocument();
        if (isResource) {
            mappingFile = loadFromResource(filename);
        } else {
            mappingFile = loadFromFile(filename);
        }
    }
    
    public EclipseJSVGCanvas getJSVGCanvas() {
        return svgCanvas;
//        IWorkbenchWindow window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
//        IViewPart view = window.getActivePage().findView(EnvironmentView.ID);
//        if (view != null) {
//            return (EclipseJSVGCanvas) ((EnvironmentView) view).getSVGCanvas();
//        }
//        return null;
    }
    
    public SVGDocument getSVGDocument() {
        return svgDocument;
    }
    
    
    /**
     * Loads an .mapping file from the resource example folder.
     * 
     * @param filename
     * @return
     */
    public SVGFile loadFromResource(String filename) {
        // Initialize the model
        MappingPackage.eINSTANCE.eClass();
        
        // Register the XMI resource factory for the .mapping extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("mapping", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource from examples folder
        Resource resource;
        SVGFile svgFile = null;
        try {
            // Get the resource from examples folder
            resource = resSet.getResource(URI.createPlatformPluginURI(Activator.PLUGIN_ID+"/examples/"+filename, true), true);
            // Get the first model element and cast it to the right type, in my
            // example everything is hierarchical included in this first node
            svgFile = (SVGFile) resource.getContents().get(0);
        } catch (WrappedException e) {
            // TODO Auto-generated catch block
            System.out.println("File: "+filename+" does not exists in the example folder!");
        }
        return svgFile;
    }
    
    /**
     * Loads an .mapping file from disk
     * @param filename
     * @return
     */
    
    public SVGFile loadFromFile(String filename) {
        // Initialize the model
        MappingPackage.eINSTANCE.eClass();
        
        // Register the XMI resource factory for the .mapping extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("mapping", new XMIResourceFactoryImpl());
        
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        //EXAMPLE: Resource resource = resSet.getResource(URI.createURI("examples/Trafficlight.mapping"), true);
        Resource resource;
        SVGFile svgFile = null;
        
        try {
            //Get the resource from anywhere on the harddisk
            resource = resSet.getResource(URI.createFileURI(filename), true);
            // Get the first model element and cast it to the right type
            svgFile = (SVGFile) resource.getContents().get(0);
        } catch (WrappedException e) {
            // TODO Auto-generated catch block
            System.out.println("File: "+filename+" does not exists!");
        }
        return svgFile;
    }
    
    public void doAnimation(JSONObject jsonObject) {
        if (mappingFile != null) {
            
            String[] names = JSONObject.getNames(jsonObject);
            for (String name:names) {
                Iterator<SVGElement> elementIterator = mappingFile.getSvgElement().iterator();
                //As long as we can find some changeable SVGElements we try to apply an animation
                SVGElement svgElement;
                while (elementIterator.hasNext()) {
                    svgElement = elementIterator.next();
                    
                    Iterator<Animation> animationIterator = svgElement.getAnimation().iterator();
                    Animation animation;
                    while (animationIterator.hasNext()) {
                        animation = animationIterator.next();
                        
                        //TODO: Need to check here the type of animation and applying special stuff according to its type
                        // Textbox, move, etc. must be called from here
                        if (animation instanceof Colorize) {
                            Colorize colorizeAnimation = (Colorize) animation;
                            //TODO: Read some attributes and apply animation to svg graphic
                            if (name.equals(svgElement.getId())) {
                                //if the input-tag exists and if it's not empty than do use it, otherwise ignore it
                                if (colorizeAnimation.getInput() != null && !colorizeAnimation.getInput().isEmpty()) {
                                    // TODO: parseInput()-Methode erstellen und entspechende der input-werte reagieren
                                    //only if input values are available do something
                                    if (valueMatchesInput(jsonObject, svgElement.getId(), colorizeAnimation.getInput())) {
                                        //Check whether the jsonValue is an signal word (*.value) or not 
                                        String jsonValue = valueContainsID(jsonObject, colorizeAnimation.getColor());
                                        //jsonValue is only "null" if jsonValue does not contain the signal word (*.value) 
                                        if (jsonValue != null) {
                                            //only update the svg document if the jsonValue isn't empty 
                                            if (!jsonValue.isEmpty()) {
                                                colorizeAnimation.applyAnimation(svgDocument, svgElement.getId(), jsonValue);
                                                System.out.println("SVG-Element: "+svgElement.getId()+" Color: "+jsonValue);
                                            }
                                        } else {
                                            colorizeAnimation.applyAnimation(svgDocument, svgElement.getId(), colorizeAnimation.getColor());
                                            System.out.println("SVG-Element: "+svgElement.getId()+" Color: "+colorizeAnimation.getColor());
                                        }
                                    }
                                }
                            }
                        }
                        if (animation instanceof Move) {
                            Move moveAnimation = (Move) animation;
                            if (name.equals(svgElement.getId())) {
                                //if the input-tag exists and if it's not empty than do use it, otherwise ignore it
                                if (moveAnimation.getInput() != null && !moveAnimation.getInput().isEmpty()) {
                                    // TODO: parseInput()-Methode erstellen und entspechende der input-werte reagieren
                                    //only if input values are available do something
                                    if (valueMatchesInput(jsonObject, svgElement.getId(), moveAnimation.getInput())) {
                                        //Check whether the jsonValue is an signal word (*.value) or not 
                                        String jsonValue_xRange,jsonValue_yRange,xRange,yRange;

                                        jsonValue_xRange = valueContainsID(jsonObject, moveAnimation.getX_range());
                                        jsonValue_yRange = valueContainsID(jsonObject, moveAnimation.getY_range());
                                        
                                        if (jsonValue_xRange != null && !jsonValue_xRange.isEmpty()) {
                                            xRange = jsonValue_xRange;
                                        } else {
                                            xRange = moveAnimation.getX_range();
                                        }
                                        
                                        if (jsonValue_yRange != null && !jsonValue_yRange.isEmpty()) {
                                            yRange = jsonValue_yRange;
                                        } else {
                                            yRange = moveAnimation.getY_range();
                                        }
                                        
                                        moveAnimation.applyAnimation(svgDocument, svgElement.getId(), xRange, yRange);
                                        System.out.println("SVG-Element: "+svgElement.getId()+" xRange: "+xRange+ "yRange: "+yRange);
                                    }
                                }
                            }
                        }
                        if (animation instanceof Textbox) {
                            Textbox textboxAnimation = (Textbox) animation;
                            if (name.equals(svgElement.getId())) {
                                //if the input-tag exists and if it's not empty than do use it, otherwise ignore it
                                if (textboxAnimation.getInput() != null && !textboxAnimation.getInput().isEmpty()) {
                                    // TODO: parseInput()-Methode erstellen und entspechende der input-werte reagieren
                                    //only if input values are available do something
                                    if (valueMatchesInput(jsonObject, svgElement.getId(), textboxAnimation.getInput())) {
                                        //Check whether the jsonValue is an signal word (*.value) or not 
                                        String jsonValue, textValue;

                                        jsonValue = valueContainsID(jsonObject, textboxAnimation.getValue());
                                        
                                        if (jsonValue != null && !jsonValue.isEmpty()) {
                                            textValue = jsonValue;
                                        } else {
                                            textValue = textboxAnimation.getValue();
                                        }
                                        
                                        textboxAnimation.applyAnimation(svgDocument, svgElement.getId(), textValue);
                                        System.out.println("SVG-Element: "+svgElement.getId()+" textValue: "+textValue);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            //svgCanvas.setSVGDocument(svgDocument);
        }
        else {
            System.out.println("Mapping File is missing!");
        }
        
    }
    
    /**
     * This method parses the Input-Tag value and checks whether the value does match the jsonObject value or not.
     * 
     * @param jsonObject
     * @param jsonKey
     * @param inputValue
     * @return
     */
    private boolean valueMatchesInput(JSONObject jsonObject, String jsonKey, String inputValue) {
        String jsonValue;
        System.out.println("inputValue: "+inputValue);
        try {
            jsonValue = (String) jsonObject.get(jsonKey);
            //Do some string parsing here
            if (inputValue.contains("..")) {
                int valueFrom, valueTo;
                valueFrom = Integer.parseInt(inputValue.substring(0,inputValue.indexOf("..")));
                valueTo = Integer.parseInt(inputValue.substring(inputValue.indexOf("..")+2));
                //We need to swap the values if valueFrom is less then valueTo
                if (valueTo < valueFrom) {
                    int temp = valueFrom;
                    valueFrom = valueTo;
                    valueTo = temp;
                }
                for (int i = valueFrom; i<=valueTo; i++) {
                    try {
                        //We need to check whether the value is a real integer value or not
                        Integer.parseInt((String) jsonObject.get(jsonKey));
                        if (i == jsonObject.getInt(jsonKey)) {
                            System.out.println(jsonValue);
                            return true;
                        }
                    } catch (NumberFormatException e) {
                        // TODO Auto-generated catch block
                        //Do nothing, because we just want to go on if jsonValue is an integer
                    }
                }
            } else if (inputValue.contains(",")) {
                String s = new String(inputValue);
                String value;
                while (s.contains(",")) {
                    value = s.substring(0,s.indexOf(","));
                    if (value.equals(jsonValue)) {
                        System.out.println(jsonValue);
                        return true;
                    }
                    s = s.substring(s.indexOf(",")+1);
                }
                //Now we need to check the last value behind the last comma
                if (s.equals(jsonValue)) {
                    System.out.println(jsonValue);
                    return true;
                }                
            } else if (inputValue.contains("==")) {
                String value1,value2,temp;
                value1 = inputValue.substring(0,inputValue.indexOf("=="));
                value2 = inputValue.substring(inputValue.indexOf("==")+2);
                temp = valueContainsID(jsonObject,value1);
                if ( temp != null) {
                    value1 = temp;
                }
                temp = valueContainsID(jsonObject,value2);
                if ( temp != null) {
                    value2 = temp;
                }
                if (value1.equals(value2)) {
                    System.out.println(value1 +" == "+ value2);
                    return true;
                } else System.out.println(value1 +" == "+ value2);               
            } else {
                String value = inputValue;
                if (value.equals(jsonValue)) {
                    System.out.println(jsonValue);
                    return true;
                }
            }
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Value has a wrong format! The input value for [..] requires an valid integer value. Example: [-3..0]");
        }
        return false;
    }
    
    
    /**
     * Returns the the ID of an SVGElement if it exists or "none" if no JSONValue with this ID as a JSON Key was found
     * or null if the value isn't an ID. 
     * 
     * @param jsonObject
     * @param value
     * @return 
     */    
    private String valueContainsID(JSONObject jsonObject, String value) {
        if (value.indexOf(".value") == -1) return null;
        String idpart = value.substring(0, value.indexOf(".value"));
        String[] names = JSONObject.getNames(jsonObject);
        for (String name : names) {
            if (idpart.equals(name)) {
                try {
                    String jsonValue = (String) jsonObject.get(idpart);
                    return jsonValue;
                } catch (JSONException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
        }
        return "";//none
    }
 
    /**
     * Just updates the actual SVGDocument. 
     */
    public void updateSVGGraphik() {
        svgCanvas.setSVGDocument(svgDocument);
    }
    
}
