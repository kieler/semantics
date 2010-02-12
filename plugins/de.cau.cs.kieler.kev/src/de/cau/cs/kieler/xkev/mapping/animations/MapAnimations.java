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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.svg.SVGDocument;

import org.json.JSONException;
import org.json.JSONObject;
import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.mapping.Animation;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.SVGElement;
import de.cau.cs.kieler.xkev.mapping.SVGFile;
import de.cau.cs.kieler.xkev.views.EclipseJSVGCanvas;

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
    
    /**
     * The single instance of the EclipseJSVGCanvas.
     */
    private final EclipseJSVGCanvas svgCanvas = EclipseJSVGCanvas.getInstance();

    /**
     * The HashMap with SVG element id's as the keys and a list of animations as values.
     */
    private Map<String, EList<Animation>> svgElementsHashMap = null;

    /**
     * The default constructor.
     */
    public MapAnimations() {
        // We must make sure that the svgCanvas has already been created (xKEV-View must have been
        // initialized first)
        if (svgCanvas == null) {
            Activator.reportInfoMessage("The xKEV-View must be initialized first!");
            return;
        }

    }
    
    /**
     * Creates the MapAnimation instance and loads an mapping file either from Resource (examples/*)
     * isResource=true or from anywhere on the harddisk (isResource=false).
     * 
     * @param filename
     *          The name of the file which should be loaded.
     * @param isResource
     *          True, if the resource is loaded from the KEV-plugin itself.
     *          False, if the the resource is a file on the local filesystem. 
     */
    public MapAnimations(final String filename, final boolean isResource) {
        // We must make sure that the svgCanvas has already been created (xKEV-View must have been
        // initialized first)
        if (svgCanvas == null) {
            Activator.reportInfoMessage("The xKEV-View must be initialized first!");
            return;
        }
        if (isResource) {
            // mappingFile not needed anymore, because we now deal with a HashMap
            // mappingFile = loadFromResource(filename);
            mappingFile = loadFromResource(filename);
        } else {
            // mappingFile = loadFromFile(filename);
            mappingFile = loadFromFile(filename);
        }
    }

    /**
     * Returns the actual JSVGCanvas.
     * 
     * @return svgCanvas
     */
    public EclipseJSVGCanvas getJSVGCanvas() {
        return svgCanvas;
    }

    /**
     * Returns the actual SVGDocument.
     * 
     * @return svgDocument
     */
    public SVGDocument getSVGDocument() {
        return svgCanvas.getSVGDocument();
    }

    
    /**
     * Return the current mapping file of this MapAnimations.
     * @return mappingFile the current mapping fil
     */
    public final SVGFile getMappingFile() {
        return mappingFile;
    }
    
    
    /**
     * Loads an .mapping file from the resource example folder.
     * 
     * @param filename name of the file to load from resource
     * @return current mapping file (SVGFile see ecore model)
     */
    public final SVGFile loadFromResource(final String filename) {
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
            System.out.println(filename);
            resource = resSet.getResource(URI.createPlatformPluginURI(Activator.PLUGIN_ID+"/examples/"+filename, true), true);
            // Get the first model element and cast it to the right type, in my
            // example everything is hierarchical included in this first node
            System.out.println("Size: "+resource.getContents().size());
            svgFile = (SVGFile) resource.getContents().get(0);        
            createHashMap(svgFile);
            if (!svgFile.getFilename().isEmpty()) {
                loadSpecifiedSVGFile(svgFile.getFilename());
            } else {
                Activator.reportInfoMessage("The svg file was't specified in the current mapping file ("+filename+")!");
                EclipseJSVGCanvas.getInstance().setSVGDocument(null);//Because we only want a valid mapping file for animation
            }

        } catch (WrappedException e) {
            // TODO Auto-generated catch block
            System.out.println("File: "+filename+" does not exists in the example folder!");
        }
        return svgFile;
    }

    /**
     * Loads an mapping file from disk.
     * 
     * @param filename name of the file to load from disk
     * @return current mapping file
     */
    public final SVGFile loadFromFile(final String filename) {
        // Initialize the model
        MappingPackage.eINSTANCE.eClass();

        // Register the XMI resource factory for the .mapping extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("mapping", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // EXAMPLE: Resource resource =
        // resSet.getResource(URI.createURI("examples/Trafficlight.mapping"), true);
        Resource resource;
        SVGFile svgFile = null;

        try {
            System.out.println(URI.createURI(filename));
            // Get the resource from anywhere on the harddisk
            resource = resSet.getResource(URI.createURI(filename), true);
            // Get the first model element and cast it to the right type
            svgFile = (SVGFile) resource.getContents().get(0);
            createHashMap(svgFile);            
            
            if (!svgFile.getFilename().isEmpty()) {
                //Filename is absolute
                if (svgFile.getFilename().contains("file:/")) {
                    System.out.println(svgFile.getFilename());
                    loadSpecifiedSVGFile(svgFile.getFilename());
                } else {//Filename is relative
                    String tempPath;
                    tempPath = filename.substring(0,filename.lastIndexOf("/")+1) + svgFile.getFilename();
                    System.out.println(tempPath);
                    loadSpecifiedSVGFile(tempPath);
                }
            } else {
                Activator.reportInfoMessage("The svg file was't specified in the current mapping file ("+filename+")!");
            }
        } catch (WrappedException e) {
            // TODO Auto-generated catch block
            System.out.println("File: " + filename + " does not exists!");
        }
        return svgFile;
    }

    /**
     * Loads the SVG-graphic which is specified in the current mapping file
     *
     * @param filename name of the SVG-graphic to load
     */
    private void loadSpecifiedSVGFile(final String filename) {
        SVGLoadingStatusListener loadingStatusListener = svgCanvas.getSVGLoadingStatusListener();
        URL url = null;
        if (filename.indexOf("resource:") == 0) {
            String path = filename.substring("resource:".length());
            // Get the resource from examples folder
            
            url = FileLocator.find(Activator.getDefault().getBundle(), new Path(path), null);

            if (url != null) {
                System.out.println("Bundleentry: " + url.toExternalForm());
                // setSVGFile(url);
                // KevComposite.getInstance().setSVGFile(url);
                svgCanvas.loadSVGDocument(url.toExternalForm());
                // Sometimes on first load, the fileloading get's cancelled, don't know why and from
                // whom, so try again
                if (loadingStatusListener.getLoadingStatus() == SVGLoadingStatusListener.LOADING_CANCELLED) {
                    // KevComposite.getInstance().paintSVGFile();
                    svgCanvas.loadSVGDocument(url.toExternalForm());
                }
            } else {
                Activator.reportInfoMessage("File not found or file has wrong format: "+filename);
                return;
            }
            // svgCanvas.loadSVGDocument(url.toExternalForm());
        } else {
            try {
                //URL url = new URL("file:/" + filename);
                url = new URL(filename);
                // KevComposite.getInstance().setSVGFile(url);
                svgCanvas.loadSVGDocument(url.toExternalForm());
                // Sometimes on first load, the fileloading get's cancelled, don't know why and from
                // whom so try again
                if (loadingStatusListener.getLoadingStatus() == SVGLoadingStatusListener.LOADING_CANCELLED) {
                    // KevComposite.getInstance().paintSVGFile();
                    svgCanvas.loadSVGDocument(url.toExternalForm());
                }
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                Activator.reportInfoMessage("File not found or file has wrong format: "+filename);
            }
        }
        //Wait until loading was successful or an Errorstatus occurs (status < 2) or timeout has reached (approx. after 5 seconds)
        int timeoutCounter = 1;
        while ((loadingStatusListener.getLoadingStatus() < SVGLoadingStatusListener.LOADING_COMPLETED) && timeoutCounter < 50) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //Thread has been interrupted
            } finally {
                timeoutCounter++;
            }
        }
        if (url != null) {
            //Set the uri of the current svg file (needed for the refresh)
            Activator.getKevView().getComposite().setSVGURI(java.net.URI.create(url.toExternalForm()));
        }
    }

    /**
     * This Method creates a HashMap of SVGElements of the actual Mapping file.
     * 
     */
    private synchronized void createHashMap(final SVGFile mappingFile) {
        this.svgElementsHashMap = new HashMap<String, EList<Animation>>();
        Iterator<SVGElement> elementIterator = mappingFile.getSvgElement().iterator();
        SVGElement svgElement;
        Iterator<Animation> animationIterator;
        while (elementIterator.hasNext()) {
            svgElement = elementIterator.next();
            animationIterator = svgElement.getAnimation().iterator();
            //Now we have to initialize all animations once
            while (animationIterator.hasNext()) {
                animationIterator.next().initialize();
            }
            this.svgElementsHashMap.put(svgElement.getId(), svgElement.getAnimation());
        }
    }

    /**
     * Applies the Animations for all JSON-Keys which exists in the mapping file.
     * 
     * @param jsonObject the actual JSON-object
     */
    public void doAnimations(final JSONObject jsonObject) {
        // Check whether the HashMap has been created
        if (this.svgElementsHashMap == null) {
            System.out.println("HashMap is not initialized!");
            return;
        }
        
        try {
//            System.out.println(jsonObject.toString());
            //Now we have to make the JSONobject flat, so that we can address all key by "." notation.
            JSONObject flatJSONObject = makeItFlat(jsonObject);
//            System.out.println(flatJSONObject.toString());
            //For each svg element id we need to check if all any animation can be applied. 
            Iterator<String> svgElementIDIterator = svgElementsHashMap.keySet().iterator();
            while (svgElementIDIterator.hasNext()) {
                String svgElementID = svgElementIDIterator.next();
//                System.out.println("SVG: " + svgElementID);
                // Get all animations for each SVG element
                Iterator<Animation> animationIterator = svgElementsHashMap.get(svgElementID).iterator();

                while (animationIterator.hasNext()) {
                    // We need to apply all animations for each SVG element
                    animationIterator.next().apply(flatJSONObject, svgElementID);
                }
            }
        } catch (JSONException e) {
            //Something went wrong with the JSONObject.
        }
    }    
    
    
//    /**
//     * Applies the Animations for all JSON-Keys which exists in the mapping file.
//     * 
//     * @param jsonObject
//     */
//    public void doAnimations(final JSONObject jsonObject) {
//        // Check whether the HashMap has been created
//        if (this.svgElementsHashMap == null) {
//            System.out.println("HashMap is not initialized!");
//            return;
//        }
//        
//        try {
////            System.out.println(jsonObject.toString());
//            //Now we have to make the JSONobject flat, so that we can address all key by "." notation.
//            JSONObject flatJSONObject = makeItFlat(jsonObject);
////            System.out.println(flatJSONObject.toString());
//            //For each svg element id we need to check if all any animation can be applied. 
//            Iterator<String> svgElementIDIterator = svgElementsHashMap.keySet().iterator();
//            while (svgElementIDIterator.hasNext()) {
//                String svgElementID = svgElementIDIterator.next();
//                // Get all animations for each SVG element
//                Iterator<RunnableAnimation> animationIterator = svgElementsHashMap.get(svgElementID).iterator();
//
//                RunnableAnimation animation;
//                while (animationIterator.hasNext()) {
//                    animation = animationIterator.next();
//
//                    // We need to apply all animations for each SVG element
//                    if (animation instanceof Colorize) {
//                        Colorize colorizeAnimation = (Colorize) animation;
//                        colorizeAnimation.applyAnimation(flatJSONObject, svgElementID);
//                    } else if (animation instanceof Move) {
//                        Move moveAnimation = (Move) animation;
//                        moveAnimation.applyAnimation(flatJSONObject, svgElementID);
//                    } else if (animation instanceof Text) {
//                        Text textAnimation = (Text) animation;
//                        textAnimation.applyAnimation(flatJSONObject, svgElementID);
//                    } else if (animation instanceof Rotate) {
//                        Rotate rotateAnimation = (Rotate) animation;
//                        rotateAnimation.applyAnimation(flatJSONObject, svgElementID);
//                    } else {
//                        System.out.println("RunnableAnimation " + animation.getClass().getSimpleName()
//                                + " does not exists!");
//                    }
//
//                }
//            }
//            // Now we still need to apply all animations to the SVG document
//            updateSVGGraphik();
//        } catch (JSONException e) {
//            //Something went wrong with the JSONObject.
//        }
//    }
    
    //OLD VERSION DOES ONLY ANIMATIONS IF THE JSON KEY EQUALS THE SVG ELEMENT ID
    //------------------------------------------------------------------------------------------
//    /**
//     * Applies the Animations for all JSON-Keys which exists in the mapping file.
//     * 
//     * @param jsonObject
//     */
//    public void doAnimations(JSONObject jsonObject) {
//        // Check whether the HashMap has been created
//        if (this.svgElementsHashMap == null) {
//            System.out.println("HashMap is not initialized!");
//            return;
//        }
//        
//        try {
//            System.out.println(jsonObject.toString());
//            //Now we have to make the JSONobject flat, so that we can address all key by "." notation.
//            JSONObject flatJSONObject = makeItFlat(jsonObject);
//            System.out.println(flatJSONObject.toString());
//            // Get all JSON-Key-Names from the flatJSONobject
//            String[] keys = JSONObject.getNames(flatJSONObject);
//            for (String key : keys) {
//                // Now we need to check for each JSON-Key if there exists a SVGElement-Tag in the
//                // Mapping-HashMap
//                if (this.svgElementsHashMap.containsKey(key)) {
//                    // Get all animations for each SVG element
//                    Iterator<RunnableAnimation> animationIterator = svgElementsHashMap.get(key).iterator();
//    
//                    RunnableAnimation animation;
//                    while (animationIterator.hasNext()) {
//                        animation = animationIterator.next();
//    
//                        // We need to apply all animations for each SVG element
//                        if (animation instanceof Colorize) {
//                            Colorize colorizeAnimation = (Colorize) animation;
//                            colorizeAnimation.applyAnimation(flatJSONObject, key);
//                        } else if (animation instanceof Move) {
//                            Move moveAnimation = (Move) animation;
//                            moveAnimation.applyAnimation(flatJSONObject, key);
//                        } else if (animation instanceof Textbox) {
//                            Textbox textboxAnimation = (Textbox) animation;
//                            textboxAnimation.applyAnimation(flatJSONObject, key);
//                        } else {
//                            System.out.println("RunnableAnimation " + animation.getClass().getSimpleName()
//                                    + " does not exists!");
//                        }
//    
//                    }
//                }
//            }
//            // Now we still need to apply all animations to the SVG document
//            updateSVGGraphik();
//        } catch (JSONException e) {
//            //Something went wrong with the JSONObject.
//        }
//    }
// --------------------------------------------------------------------------------------------------
    /**
     * This function is intensively used by the mapInputToOutput() method. It simply creates an
     * ArrayList with no duplicates of the inputstring.
     * 
     */
    public ArrayList<String> attributeParser(final String input,
            final boolean isInputAttribute) {
        ArrayList<String> inputArray = new ArrayList<String>();
        HashSet<String> inputSet = new HashSet<String>();
        // Now we begin with the input tokens
        String pattern;
        // Allow all chars, except these ","
        pattern = "[^,]+";
        
        if (input != null) {
            if (Pattern.matches("([^,]+[,])*[^,]+", input)) {
                // Correct brackets for a valid list
                // System.out.println("Korrekte Liste: "+input);//delimeter is , + whitespace
                Scanner inputScanner = new Scanner(input).useDelimiter("\\s*,\\s*");
                while (inputScanner.hasNext()) {
                    // This means a range plus a distance between [number1]:[number2]
                    if (inputScanner.hasNext("[-]?[\\d]+[.]{2,3}[-]?[\\d]+")) {// Test if the
                                                                                      // next input
                                                                                      // matches
                                                                                      // "[-]NUMBER..[.][-]NUMBER"
                        // Now we know, that the inputScanner.next() contains exactly 2 integer values
                        Scanner sc = new Scanner(inputScanner.next()).useDelimiter("[.]+");
                        int leftint = sc.nextInt();
                        int rightint = sc.nextInt();
                        // int min, max;
                        // min = Math.min(leftint, rightint);
                        // max = Math.max(leftint, rightint);
                        //if it is the input attribute, we need all values 
                        if (isInputAttribute) {
                            if (leftint <= rightint) {
                                for (int j = leftint; j <= rightint; j++) {
                                    if (inputSet.add(Integer.toString(j))) {
                                        inputArray.add(Integer.toString(j));
                                    }// Else, the input is already in the Array
                                }
                            } else {// leftint is greater then rightint
                                for (int j = leftint; j >= rightint; j--) {
                                    if (inputSet.add(Integer.toString(j))) {
                                        inputArray.add(Integer.toString(j));
                                    }// Else, the input is already in the Array
                                }
                            }
                        } else {
                            //allow multiple values only if it is not the input
                            inputArray.add(Integer.toString(leftint));
                            inputArray.add(Integer.toString(rightint));
                        }
                    } else {
                        String token = inputScanner.next();
                        if (Pattern.matches(pattern, token)) {
                            // The input can be everything now
                            if (isInputAttribute) {
                                if (inputSet.add(token)) {
                                    inputArray.add(token);
    //                                System.out.println("Genau ein Wert: "+token);
                                }
                            } else {
                                inputArray.add(token);
                            }
                        } else {
                            // Error - wrong Syntax, was not accepted!
    //                        System.out.println("Falsche Syntax: "+token);
                        }
                    }
                }
            } else if (Pattern.matches(pattern, input)) {
                // Valid value (exactly one)
    //            System.out.println("Genau ein Wert: "+input);
                if (isInputAttribute) {
                    if (inputSet.add(input)) {
                        inputArray.add(input);
                    }// Else, the input is already in the Array
                } else {
                    inputArray.add(input);
                }
            } else {
                // Error - wrong Syntax, was not accepted!
    //            System.out.println("Falsche Syntax: "+input);
            }
    //         for (int i=0; i<inputArray.size(); i++) System.out.print(inputArray.get(i)+",");
    //         System.out.println();
        }
        return inputArray;
    }

    /**
     * The short version for the normal case that all values are excepted.
     * @param input
     * @param output
     * @return
     */
//    public ArrayList<HashMap<String, String>> mapInputToOutput(final String input, final String output) {
//        return mapInputToOutput(input, output, false);
//    }

    /**
     * THIS Method is really important and should be used for all animations! This method maps the
     * input values to the corespondig output values. input is always the input from mapping file
     * whereby output can be any value of the special animation to which the input values should be
     * mapped.
     * 
     * Example: input="[1..10,20..30];[40,45,50];900"
     * output=x_range="[200..215,220,225,230,235,240];[1..3];200" PROBLEME MIT DEM PARSEN DES
     * OUTPUTS HIER NOCHMAL SCHAUEN!
     * UPDATE: This method does no parsing at all! it just maps an input arraylist to an outputarraylist 
     * 
     */
    public HashMap<String, String> mapInputToOutput(final ArrayList<String> inputArray, final ArrayList<String> outputArray) {
        ArrayList<HashMap<String, String>> hashMapArray = new ArrayList<HashMap<String, String>>();
//            // For each token we generate an input and output Array
//            // and create a HashMap of it
        HashMap<String, String> hashMap = new HashMap<String, String>();
//            inputArray = generateArrayListFromInput(inTokenizer.nextToken(), false); // The input
//                                                                                     // should
//                                                                                     // always allow
//                                                                                     // all values
//            outputArray = generateArrayListFromInput(outTokenizer.nextToken(), outputIntegerOnly);

        // Do some size calculation
        // Only go on, if we have two arrays which are greater then zero
        int minArraySize = Math.min(inputArray.size(), outputArray.size());
        if (minArraySize > 0) {
            for (int j = 0; j < minArraySize; j++) {
                hashMap.put(inputArray.get(j), outputArray.get(j));
            }
        }
        return hashMap;
    }

    /** NOT USED ANYMORE
     * 
     * The values of the special animation is a single value for each input value separated by ";".
     * 
     * 
     * @param inputValue input string
     * @return stingarray 
     */
    public String[] parseValueString(final String inputValue) {
        // First we need to seperate each value pairs (symbolized by ";")
        // First of all delete all whitespace of inputValue
        ArrayList<String> arrayList = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(inputValue.replaceAll(" ", ""), ";");
        while (tokenizer.hasMoreTokens()) {
            arrayList.add(tokenizer.nextToken());
        }
        // Now the arrayList contains all validValues for each input, separated by ";"
        return arrayList.toArray(new String[arrayList.size()]);
    }

    /** NOT USED ANYMORE
     * Just updates the actual SVGDocument.
     */
    private void updateSVGGraphik() {
        svgCanvas.setSVGDocument(svgCanvas.getSVGDocument());
    }

    
    // ----------------------------------------------------------------------------------------------
    //Should be put later on to the JSON package

    /**
     * Make the input JSONObject flat if there exists a hierarchy. This one should be called instead
     * of the other version of makeItFlat, which has some initial value parameters for recursive
     * computation.
     * 
     * @param inputObject the input JSONObject, which may not be flat
     * @return A JSONObject which has a flat hierarchy 
     * @throws JSONException, is thrown if a conversion fails
     */
    public final JSONObject makeItFlat(final JSONObject inputObject) throws JSONException {
        return makeItFlat(new JSONObject(), "", inputObject);
    }

    /**
     * Computes the flat JSONObject. It's just a helper function.
     * 
     * @param flatOne
     * @param adressKey
     * @param inputObject
     * @return
     * @throws JSONException
     */
    private static JSONObject makeItFlat(JSONObject flatOne, String adressKey,
            JSONObject inputObject) throws JSONException {
        String[] keys = JSONObject.getNames(inputObject);
        if (keys == null) {
            //If there exists no key try it must be an empty json object
            if (!adressKey.isEmpty()) {
                flatOne.put(adressKey, new JSONObject());
            }
        } else {
            for (String key : keys) {
                if (inputObject.optJSONObject(key) == null) {
                    if (adressKey.isEmpty()) {
                        flatOne.put(key, inputObject.optString(key));
                    } else {
                        flatOne.put(adressKey + "." + key, inputObject.optString(key));
                    }
                } else {
                    if (adressKey.isEmpty()) {
                        makeItFlat(flatOne, key, inputObject.optJSONObject(key));
                        //Add the toplevel objects to the result object (that are the svgelement id's)
                        //flatOne.put(key, JSONObject.NULL);
                    } else {
                        makeItFlat(flatOne, adressKey + "." + key, inputObject.optJSONObject(key));
                    }
                }
            }
        }
        //System.out.println(flatOne);
        return flatOne;
    }
}
