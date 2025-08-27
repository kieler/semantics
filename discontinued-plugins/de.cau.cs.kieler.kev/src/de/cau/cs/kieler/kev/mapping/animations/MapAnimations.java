/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by + Kiel University + Department of Computer Science +
 * Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL). See the file
 * epl-v10.html for the license text.
 */

package de.cau.cs.kieler.kev.mapping.animations;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.batik.util.RunnableQueue;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.elk.core.util.Pair;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.svg.SVGDocument;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.Animation;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.SVGElement;
import de.cau.cs.kieler.kev.mapping.SVGFile;
import de.cau.cs.kieler.kev.views.EclipseJSVGCanvas;

/**
 * This class connects the mapping-file with the corresponding SVG-file.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * @kieler.rating 2010-02-17 proposed yellow
 * @kieler.ignore deprecated project
 */
public final class MapAnimations {

    /**
     * SVGFile is an instance of the created model .mapping file.
     */
    private SVGFile currentMappingFile = null;

    private String mappingFilePath = null;

    private HashMap<String, HashSet<String>> modifiedKeyMap = new HashMap<String, HashSet<String>>();

    /**
     * The single instance of the EclipseJSVGCanvas.
     */
    private final EclipseJSVGCanvas svgCanvas = EclipseJSVGCanvas.getInstance();

    /**
     * The HashMap with SVG element id's as the keys and a list of animations as values.
     */
    private HashMap<String, EList<Animation>> svgElementsHashMap = null;

    /**
     * The single instance of the MapAnimations class.
     */
    private static MapAnimations INSTANCE = null;

    /**
     * Hashmap with jsonkeys to values to animations
     */
    private HashMap<String, HashMap<String, ArrayList<Pair<String, Animation>>>> jsonKeyToInputValuesToAnimationsMap = null;

    private HashMap<String, ArrayList<Pair<String, Animation>>> keyToAnimationsMap = null;

    /**
     * List with animations which have to be triggered in each step, because no input values were
     * specified
     */
    private HashMap<String, ArrayList<Pair<String, Animation>>> defaultKeyToAnimationsMap = null;

    /**
     * The default constructor.
     */
    private MapAnimations() {
        // We must make sure that the svgCanvas has already been created (xKEV-View must have been
        // initialized first)
        if (svgCanvas == null) {
            Activator.reportInfoMessage("The xKEV-View must be initialized first!");
        }
    }

    public void initializeMappingFile(final String filename, final boolean isResource) {
        mappingFilePath = filename;
        if (isResource) {
            // mappingFile not needed anymore, because we now deal with a HashMap
            // mappingFile = loadFromResource(filename);
            currentMappingFile = loadFromResource(filename);
        } else {
            // mappingFile = loadFromFile(filename);
            currentMappingFile = loadFromFile(filename);
        }
    }

    // /**
    // * Creates the MapAnimation instance and loads an mapping file either from Resource
    // (examples/*)
    // * isResource=true or from anywhere on the harddisk (isResource=false).
    // *
    // * @param filename
    // * The name of the file which should be loaded.
    // * @param isResource
    // * True, if the resource is loaded from the KEV-plugin itself. False, if the the
    // * resource is a file on the local filesystem.
    // */
    // public MapAnimations(final String filename, final boolean isResource) {
    // // We must make sure that the svgCanvas has already been created (xKEV-View must have been
    // // initialized first)
    // if (svgCanvas == null) {
    // Activator.reportInfoMessage("The xKEV-View must be initialized first!");
    // return;
    // }
    // if (isResource) {
    // // mappingFile not needed anymore, because we now deal with a HashMap
    // // mappingFile = loadFromResource(filename);
    // currentMappingFile = loadFromResource(filename);
    // } else {
    // // mappingFile = loadFromFile(filename);
    // currentMappingFile = loadFromFile(filename);
    // }
    // // // Initialize the hashmap with the values of the actual mapping file.
    // // createHashMap(currentMappingFile);
    // }

    public String getMappingFilePath() {
        return mappingFilePath;
    }

    public static synchronized boolean createSingleInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MapAnimations();
            System.out.println("Single instance of MapAnimations was successfully created!");
            return true;
        }
        System.out.println("The single instance of MapAnimations already exists!");
        return false;
    }

    /**
     * Returns the single instance of the EclipseJSVGCanvas.
     * 
     * @return INSTANCE
     */
    public static MapAnimations getInstance() {
        if (INSTANCE == null) {
            if (createSingleInstance()) {
                return INSTANCE;
            }
        }
        return INSTANCE;
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
     * 
     * @return mappingFile the current mapping file
     */
    public final SVGFile getMappingFile() {
        return currentMappingFile;
    }

    /**
     * Loads an .mapping file from the resource example folder.
     * 
     * @param filename
     *            name of the file to load from resource
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
            // System.out.println(filename);
            resource = resSet.getResource(URI.createPlatformPluginURI(Activator.PLUGIN_ID
                    + "/examples/" + filename, true), true);
            // Get the first model element and cast it to the right type, in my
            // example everything is hierarchical included in this first node
            // System.out.println("Size: "+resource.getContents().size());
            svgFile = (SVGFile) resource.getContents().get(0);
            // createHashMap(svgFile);
            if (!svgFile.getFilename().equals("")) {
                loadSpecifiedSVGFile(svgFile.getFilename());
            } else {
                Activator
                        .reportInfoMessage("The svg file was't specified in the current mapping file ("
                                + filename + ")!");
                EclipseJSVGCanvas.getInstance().setSVGDocument(null); // Because we only want a
                // valid
                // mapping file for animation
            }

        } catch (WrappedException e) {
            Activator.reportInfoMessage("File: " + filename + " has a wrong format!");
        }
        return svgFile;
    }

    /**
     * Loads an mapping file from disk.
     * 
     * @param filename
     *            name of the file to load from disk
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
            // System.out.println(URI.createURI(filename));
            // Get the resource from anywhere on the harddisk
            resource = resSet.getResource(URI.createURI(filename), true);
            // Get the first model element and cast it to the right type
            svgFile = (SVGFile) resource.getContents().get(0);
            // createHashMap(svgFile);

            if (!svgFile.getFilename().equals("")) {
                // Filename is absolute
                if (svgFile.getFilename().contains("file:/")
                        || svgFile.getFilename().contains(":/")) {
                    // System.out.println(svgFile.getFilename());
                    loadSpecifiedSVGFile(svgFile.getFilename());
                } else { // Filename is relative
                    String tempPath;
                    tempPath = filename.substring(0, filename.lastIndexOf("/") + 1)
                            + svgFile.getFilename();
                    // System.out.println(tempPath);
                    loadSpecifiedSVGFile(tempPath);
                }
            } else {
                Activator
                        .reportInfoMessage("The svg file was't specified in the current mapping file ("
                                + filename + ")!");
                EclipseJSVGCanvas.getInstance().setSVGDocument(null); // Because we only want a
                // valid
                // mapping file for animation
            }
        } catch (WrappedException e) {
            Activator.reportInfoMessage("File: " + filename + " has a wrong format!");
        }
        return svgFile;
    }

    /**
     * Loads the SVG-graphic which is specified in the current mapping file.
     * 
     * @param filename
     *            name of the SVG-graphic to load
     */
    private void loadSpecifiedSVGFile(final String filename) {
        SVGLoadingStatusListener loadingStatusListener = svgCanvas.getSVGLoadingStatusListener();
        URL url = null;
        if (filename.startsWith("resource:")) {
            String path = filename.substring("resource:".length());
            // Get the resource from examples folder

            url = FileLocator.find(Activator.getDefault().getBundle(), new Path(path), null);
            if (url != null) {
                // System.out.println("Bundleentry: " + url.toExternalForm());
                // setSVGFile(url);
                // KevComposite.getInstance().setSVGFile(url);
                svgCanvas.loadSVGDocument(url.toExternalForm());
            } else {
                Activator.reportInfoMessage("File not found or file has wrong format: " + filename);
                return;
            }
            // svgCanvas.loadSVGDocument(url.toExternalForm());
        } else {
            try {
                URI svgURI = URI.createURI(filename); // createFileURI will not work if prefix
                // "file:/" is there
                // System.out.println(URI.createFileURI(filename).toString());
                // KevComposite.getInstance().setSVGFile(url);
                // svgCanvas.loadSVGDocument(URI.createFileURI(filename).toString());
                // Activator.getKevView().getComposite().setSVGFile(
                // new URL(URI.createFileURI(filename).toString()));

                // svgCanvas.loadSVGDocument(svgURI..toExternalForm());
                Activator.getKevView().getComposite().setSVGFile(
                        new URL(svgURI.toString().replace("resource:examples/", "")));
            } catch (Exception e) {
                Activator.reportInfoMessage("File not found or file has wrong format: " + filename);
            }
        }
        // Wait until loading was successful or an Errorstatus occurs (status < 2) or timeout has
        // reached (approx. after 5 seconds)
        int timeoutCounter = 1;
        while ((loadingStatusListener.getLoadingStatus() < SVGLoadingStatusListener.LOADING_COMPLETED)
                && timeoutCounter < 50) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // Thread has been interrupted
            } finally {
                timeoutCounter++;
            }
        }
        if (url != null) {
            // Set the uri of the current svg file (needed for the refresh)
            Activator.getKevView().getComposite().setSVGURI(
                    java.net.URI.create(url.toExternalForm()));
        }
    }

    /**
     * This Method creates a HashMap of SVGElements of the actual Mapping file.
     * 
     * @param mappingFile
     *            current mapping file for which the hashmap should be created
     * 
     */
    public void createHashMap() {
        // Create a new clonemap with all cloned elements (if exists)
        if (currentMappingFile == null) {
            Activator
                    .reportInfoMessage("Map animation needs to be created first! - No mapping file exists");
            return;
        }
        HashMap<String, ArrayList<String>> cloneMap = new HashMap<String, ArrayList<String>>();

        svgElementsHashMap = new HashMap<String, EList<Animation>>();
        Iterator<SVGElement> elementIterator = currentMappingFile.getSvgElement().iterator();
        SVGElement svgElement;
        String svgElementID;
        Iterator<Animation> animationIterator;
        while (elementIterator.hasNext()) {
            svgElement = elementIterator.next();
            // If an Element already exists in the hashmap, we add a clone of this element to the
            // hashmap and add the new clone name to the clone list
            if (!svgElementsHashMap.containsKey(svgElement.getId())) {
                svgElementID = svgElement.getId();
            } else {
                if (!cloneMap.containsKey(svgElement.getId())) {
                    cloneMap.put(svgElement.getId(), new ArrayList<String>());
                }
                svgElementID = "_" + svgElement.getId() + "_"
                        + (cloneMap.get(svgElement.getId()).size() + 1);
                cloneMap.get(svgElement.getId()).add(svgElementID);
            }
            svgElementsHashMap.put(svgElementID, svgElement.getAnimation());
            animationIterator = svgElement.getAnimation().iterator();
            while (animationIterator.hasNext()) {
                animationIterator.next().initialize(svgElementID);
            }
        }

        // --------------------- Output for Testing -----------------------------------------------
        // System.out.println(svgElementsHashMap.keySet());
        // Iterator<String> it2 =
        // svgElementsHashMap.keySet().iterator();//svgElementsHashMap.keySet().iterator();
        // while (it2.hasNext()) {
        // String name = it2.next();
        // System.out.println("Element Name: " + name +
        // " Number of Animations: "+svgElementsHashMap.get(name).size());
        // //for (String s : svgElementsHashMap.get(name)) System.out.println("clone: "+s);
        // }
        // --------------------- Output for Testing -----------------------------------------------
        // 1) First we need to map each possible JSON key to all effected animations
        Pair<String, Animation> newPair;
        Iterator<String> it = svgElementsHashMap.keySet().iterator();
        HashMap<String, ArrayList<Pair<String, Animation>>> keyToAnimationsMap = new HashMap<String, ArrayList<Pair<String, Animation>>>();
        while (it.hasNext()) {
            Animation animation;
            svgElementID = it.next();
            Iterator<Animation> animations = svgElementsHashMap.get(svgElementID).iterator();
            while (animations.hasNext()) {
                animation = animations.next();
                newPair = new Pair<String, Animation>(svgElementID, animation);
                if (!keyToAnimationsMap.containsKey(animation.getKey())) {
                    keyToAnimationsMap.put(animation.getKey(),
                            new ArrayList<Pair<String, Animation>>());
                }
                keyToAnimationsMap.get(animation.getKey()).add(newPair);
            }
        }
        setKeyToAnimationsMap(keyToAnimationsMap);

        Activator.reportDebugMessage("Hashmap for mapping successfully created!");
    }

    /**
     * This Method creates a HashMap of SVGElements of the actual Mapping file.
     * 
     * @param mappingFile
     *            current mapping file for which the hashmap should be created
     * 
     */
    // public void createHashMap() {
    // // Create a new clonemap with all cloned elements (if exists)
    // if (currentMappingFile == null) {
    // Activator.reportInfoMessage("Map animation needs to be created first! - No mapping file exists");
    // return;
    // }
    // HashMap<String, ArrayList<String>> cloneMap = new HashMap<String, ArrayList<String>>();
    //        
    // svgElementsHashMap = new HashMap<String, EList<Animation>>();
    // Iterator<SVGElement> elementIterator = currentMappingFile.getSvgElement().iterator();
    // SVGElement svgElement;
    // String svgElementID;
    // Iterator<Animation> animationIterator;
    // while (elementIterator.hasNext()) {
    // svgElement = elementIterator.next();
    // // If an Element already exists in the hashmap, we add a clone of this element to the
    // // hashmap and add the new clone name to the clone list
    // if (!svgElementsHashMap.containsKey(svgElement.getId())) {
    // svgElementID = svgElement.getId();
    // } else {
    // if (!cloneMap.containsKey(svgElement.getId())) {
    // cloneMap.put(svgElement.getId(), new ArrayList<String>());
    // }
    // svgElementID = "_" + svgElement.getId() + "_" + (cloneMap.get(svgElement.getId()).size() +
    // 1);
    // cloneMap.get(svgElement.getId()).add(svgElementID);
    // }
    // svgElementsHashMap.put(svgElementID, svgElement.getAnimation());
    // animationIterator = svgElement.getAnimation().iterator();
    // while (animationIterator.hasNext()) {
    // animationIterator.next().initialize(svgElementID);
    // }
    // }
    //
    // // --------------------- Output for Testing -----------------------------------------------
    // // System.out.println(svgElementsHashMap.keySet());
    // // Iterator<String> it2 =
    // svgElementsHashMap.keySet().iterator();//svgElementsHashMap.keySet().iterator();
    // // while (it2.hasNext()) {
    // // String name = it2.next();
    // // System.out.println("Element Name: " + name +
    // " Number of Animations: "+svgElementsHashMap.get(name).size());
    // // //for (String s : svgElementsHashMap.get(name)) System.out.println("clone: "+s);
    // // }
    // // --------------------- Output for Testing -----------------------------------------------
    // // 1) First we need to map each possible JSON key to all effected animations
    // Pair<String, Animation> newPair;
    // Iterator<String> it = svgElementsHashMap.keySet().iterator();
    // HashMap<String, ArrayList<Pair<String, Animation>>> keyToAnimationsMap = new HashMap<String,
    // ArrayList<Pair<String, Animation>>>();
    // setDefaultKeyToAnimationsMap(new HashMap<String, ArrayList<Pair<String, Animation>>>());
    // while (it.hasNext()) {
    // Animation animation;
    // svgElementID = it.next();
    // Iterator<Animation> animations = svgElementsHashMap.get(svgElementID).iterator();
    // while (animations.hasNext()) {
    // animation = animations.next();
    // newPair = new Pair<String, Animation>(svgElementID, animation);
    // if (animation.getInput() == null || animation.getInput().equals("")) {
    // // Save all animations to an extra list which have no input value
    // if (!getDefaultKeyToAnimationsMap().containsKey(animation.getKey())) {
    // getDefaultKeyToAnimationsMap().put(animation.getKey(), new ArrayList<Pair<String,
    // Animation>>());
    // }
    // getDefaultKeyToAnimationsMap().get(animation.getKey()).add(newPair);
    // } else {
    // if (!keyToAnimationsMap.containsKey(animation.getKey())) {
    // keyToAnimationsMap.put(animation.getKey(), new ArrayList<Pair<String, Animation>>());
    // }
    // keyToAnimationsMap.get(animation.getKey()).add(newPair);
    // }
    // }
    // }
    // // --------------------- Output for Testing -----------------------------------------------
    // // System.out.println(defaultKeyToAnimationsMap.keySet());
    // // Iterator<String> it1 =
    // defaultKeyToAnimationsMap.keySet().iterator();//svgElementsHashMap.keySet().iterator();
    // // while (it1.hasNext()) {
    // // String name = it1.next();
    // // System.out.println("defaultKey Name: " + name +
    // " Number of Animations: "+defaultKeyToAnimationsMap.get(name).size());
    // // //for (String s : svgElementsHashMap.get(name)) System.out.println("clone: "+s);
    // // }
    // // System.out.println(keyToAnimationsMap.keySet());
    // // Iterator<String> it2 =
    // keyToAnimationsMap.keySet().iterator();//svgElementsHashMap.keySet().iterator();
    // // while (it2.hasNext()) {
    // // String name = it2.next();
    // // System.out.println("Key Name: " + name +
    // " Number of Animations: "+keyToAnimationsMap.get(name).size());
    // // //for (String s : svgElementsHashMap.get(name)) System.out.println("clone: "+s);
    // // }
    // // --------------------- Output for Testing -----------------------------------------------
    //
    // // Now all possible JSON keys need to be mapped to possible input values and afterwards to
    // all possible animations
    // setJsonKeyToInputValuesToAnimationsMap(new HashMap<String, HashMap<String,
    // ArrayList<Pair<String, Animation>>>>());
    // HashMap<String, ArrayList<Pair<String, Animation>>> inputValuesToAnimationsMap;
    // //2), 3) create a inputValuesToAnimationsMap for each JSON key
    // it = keyToAnimationsMap.keySet().iterator();
    // while (it.hasNext()) {
    // String jsonKey = it.next();
    // inputValuesToAnimationsMap = new HashMap<String, ArrayList<Pair<String, Animation>>>();
    // for (Pair<String, Animation> oldPair : keyToAnimationsMap.get(jsonKey)) {
    // for (String inputString : parser(oldPair.getSecond().getInput())) { // Get the animation
    // (second value of the pair)
    // if (!inputValuesToAnimationsMap.containsKey(inputString)) {
    // inputValuesToAnimationsMap.put(inputString, new ArrayList<Pair<String, Animation>>());
    // }
    // //newPair = new Pair<String, Animation>(oldPair.getFirst(), oldPair.getSecond());
    // inputValuesToAnimationsMap.get(inputString).add(oldPair);
    // }
    // }
    //        
    // //4)
    // getJsonKeyToInputValuesToAnimationsMap().put(jsonKey, inputValuesToAnimationsMap);
    // // System.out.println("Input values for Key: " + jsonKey + " " +
    // inputValuesToAnimationsMap.keySet());
    // }
    // //
    // System.out.println("Number of SVG-Elements (including clones): "+svgElementsHashMap.keySet().size());
    // // System.out.println("Number of Keys: "+keyToAnimationsMap.keySet().size());
    // //
    // System.out.println("Number of Keys (final List): "+jsonKeyToInputValuesToAnimationsMap.keySet().size());
    //        
    // //bis hier scheint auch alles ok zu sein -top!!!
    // // TESTING ONLY
    // // String key, value;
    // // key = "text-KH_ST_6";
    // // value = "E_OK__simulation";
    // //
    // // for (Pair pair : jsonKeyToInputValuesToAnimationsMap.get(key).get(value)) {
    // //
    // System.out.println("Alles Animationen die zu <KEY,VALUE> ausgef�hrt werden sollen: <"+key+","+value+"> <-> <"+pair.getFirst()+","+pair.getSecond()+">");
    // // }
    // // System.out.println(animateAlways.keySet());
    // Activator.reportDebugMessage("Hashmap for mapping successfully created!");
    //        
    //
    //        
    // }

    private JSONObject oldJSONObject = null;

    /**
     * Applies the Animations for all JSON-Keys which exists in the mapping file.
     * 
     * @param jsonObject
     *            the actual JSON-object
     */
    public void doAnimations(final JSONObject jsonObject) {
        // Check whether the HashMap has been created
        if (svgElementsHashMap != null) {
            RunnableQueue runnableQueue = EclipseJSVGCanvas.getInstance().getUpdateManager()
                    .getUpdateRunnableQueue();
            JSONObject newJSONObject;
            try {
                // System.out.println("Old object: "+oldJSONObject);
                newJSONObject = makeItFlat(jsonObject);
                RunnableAnimation runnableAnimation = new RunnableAnimation(oldJSONObject,
                        newJSONObject);
                oldJSONObject = newJSONObject;
                // System.out.println("New object: "+newJSONObject);

                runnableQueue.invokeLater(runnableAnimation);
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            Activator.reportErrorMessage("Hashmap is not initialized! -> "
                    + "Mapping-File may have a wrong format");
        }
    }

    // public void doAnimations(final JSONObject jsonObject) {
    // // Check whether the HashMap has been created
    // if (svgElementsHashMap != null) {
    // try {
    // // Now we have to make the JSONobject flat, so that we can address all key by "."
    // // notation.
    // JSONObject resultObject, flatJSONObject;
    // flatJSONObject = makeItFlat(jsonObject);
    //                
    // HashSet<String> alreadyAppliedAnimationTypes = new HashSet<String>();
    //                
    // // if the lastObject exists, we want to compare the actual jsonOject and the last one to
    // compute the difference between them
    // // if (lastObject != null) {
    // // resultObject = compareDifference(lastObject, flatJSONObject);
    // // } else {
    // // resultObject = flatJSONObject;
    // // }
    //                
    // // lastObject = flatJSONObject;
    // resultObject = flatJSONObject;
    //               
    // Iterator<String> jsonKeyIterator;
    // jsonKeyIterator = resultObject.keys();
    // String jsonKey, jsonValue, svgElementID;
    // Animation animation;
    //                
    //                
    //                
    //
    // RunnableQueue runnableQueue =
    // EclipseJSVGCanvas.getInstance().getUpdateManager().getUpdateRunnableQueue();
    // if (runnableQueue.getQueueState() == RunnableQueue.RUNNING) {
    // runnableQueue.suspendExecution(true);
    // }
    //
    // int aniCounter = 0;
    // while (jsonKeyIterator.hasNext()) {
    //                    
    //                    
    //                    
    //                
    // jsonKey = jsonKeyIterator.next();
    // jsonValue = resultObject.optString(jsonKey);
    // //System.out.println("KEY: "+jsonKey +
    // " Value: "+jsonKeyToInputValuesToAnimationsMap.get(jsonKey));
    // if (getJsonKeyToInputValuesToAnimationsMap().containsKey(jsonKey)) {
    // if (getJsonKeyToInputValuesToAnimationsMap().get(jsonKey).containsKey(jsonValue)) {
    // for (Pair<String, Animation> pair : getJsonKeyToInputValuesToAnimationsMap().
    // get(jsonKey).get(resultObject.opt(jsonKey))) {
    // svgElementID = pair.getFirst();
    // animation = pair.getSecond();
    //                                
    // // System.out.println("Type of Animation: "+animation.eClass().getName());
    // alreadyAppliedAnimationTypes.add(animation.eClass().getName()); // It's the type of the
    // animation e.g. Opacity
    // animation.apply(flatJSONObject, svgElementID);
    // aniCounter++;
    // }
    // } else if (resultObject.optDouble(jsonKey) != Double.NaN) {
    // // System.out.println(jsonKeyToInputValuesToAnimationsMap.get(jsonKey).keySet());
    // Iterator<String> ranges =
    // getJsonKeyToInputValuesToAnimationsMap().get(jsonKey).keySet().iterator();
    // String range;
    // while (ranges.hasNext()) {
    // range = ranges.next();
    // if (valueMatchesRange(resultObject.optString(jsonKey), range)) {
    // for (Pair<String, Animation> pair : getJsonKeyToInputValuesToAnimationsMap().
    // get(jsonKey).get(range)) {
    // svgElementID = pair.getFirst();
    // animation = pair.getSecond();
    // // System.out.println("Ist im Bereich! -> "+range+ " SVGElementID: "+svgElementID);
    //                                        
    // animation.apply(flatJSONObject, svgElementID);
    // alreadyAppliedAnimationTypes.add(animation.eClass().getName()); // It's the type of the
    // animation e.g. Opacity
    // aniCounter++;
    // }
    // }
    // }
    // }
    // if (getDefaultKeyToAnimationsMap().containsKey(jsonKey)) { // Check if an default animation
    // exists
    // // if this matches, we know that the jsonValue is a valid double value
    // // System.out.println("Fall 1 -> "+jsonKey+
    // " Number of Animations: "+defaultKeyToAnimationsMap.get(jsonKey).size() );
    // for (Pair<String, Animation> pair : getDefaultKeyToAnimationsMap().get(jsonKey)) {
    // svgElementID = pair.getFirst();
    // animation = pair.getSecond();
    //
    // // Apply only these animations, which have not applied before.
    // if (!alreadyAppliedAnimationTypes.contains(animation.eClass().getName())) {
    // animation.apply(flatJSONObject, svgElementID);
    // //
    // System.out.println("F�r "+animation.eClass().getName()+" wurde kein wert gefunden -> wende Defaultwert an!");
    // aniCounter++;
    // }
    // }
    // }
    // } else if (getDefaultKeyToAnimationsMap().containsKey(jsonKey)) {
    // // if this matches, we know that the jsonValue is a valid double value
    // System.out.println("Fall 2 -> Range: "+jsonKey+
    // " Number of Animations: "+getDefaultKeyToAnimationsMap().get(jsonKey).size() );
    // for (Pair<String, Animation> pair : getDefaultKeyToAnimationsMap().get(jsonKey)) {
    // svgElementID = pair.getFirst();
    // animation = pair.getSecond();
    //
    // // Apply only these animations, which have not applied before.
    // if (!alreadyAppliedAnimationTypes.contains(animation.eClass().getName())) {
    // animation.apply(flatJSONObject, svgElementID);
    // //
    // System.out.println("F�r "+animation.eClass().getName()+" wurde kein wert gefunden -> wende Defaultwert an!");
    // aniCounter++;
    // }
    // }
    // }
    // // System.out.println("Applied Animation-Types in this Tick: "+alreadyAppliedAnimationTypes);
    // alreadyAppliedAnimationTypes.clear(); // Clear hashset for next json value
    //
    // }
    // System.out.println("Es wurden "+aniCounter+ " Animationen in diesem Tick ausgef�hrt!");
    // if (runnableQueue.getQueueState() == RunnableQueue.SUSPENDED) {
    // runnableQueue.invokeLater(new RunnableAnimation());
    // runnableQueue.resumeExecution();
    // }
    //
    //                
    // } catch (JSONException e) {
    // // Something went wrong with the JSONObject.
    // }
    // } else {
    // Activator
    // .reportErrorMessage("Hashmap is not initialized! -> "
    // + "Mapping-File may have a wrong format");
    // }
    // }

    public boolean valueMatchesRange(String value, String range) {
        // if (range.matches("[-]?\\d+[.]{2,3}[-]?\\d+") && !value.equals("")) {
        if (range.matches("[-]?\\d+([.]\\d+)?[.]{2,3}[-]?\\d+([.]\\d+)?") && !value.equals("")) {
            Scanner s = new Scanner(range).useDelimiter("[.]{2,3}").useLocale(Locale.US);
            double leftValue, rightValue, currentValue;
            leftValue = s.nextDouble();
            rightValue = s.nextDouble();
            currentValue = Double.parseDouble(value);
            if (currentValue >= Math.min(leftValue, rightValue)
                    && currentValue <= Math.max(leftValue, rightValue)) {
                return true;
            }
        }
        return false;
    }

    // OLD VERSION FOR BACKUP
    // /**
    // * Applies the Animations for all JSON-Keys which exists in the mapping file.
    // *
    // * @param jsonObject
    // * the actual JSON-object
    // */
    // public void doAnimations(final JSONObject jsonObject) {
    // // Check whether the HashMap has been created
    // if (svgElementsHashMap != null) {
    // try {
    // // System.out.println(jsonObject.toString());
    // // Now we have to make the JSONobject flat, so that we can address all key by "."
    // // notation.
    // JSONObject flatJSONObject = makeItFlat(jsonObject);
    // // System.out.println(flatJSONObject.toString());
    // // For each svg element id we need to check if all any animation can be applied.
    // Iterator<String> svgElementIDIterator = svgElementsHashMap.keySet().iterator();
    //
    // // Get the Batik UpdateManager for scheduling.
    // UpdateManager updateManager = EclipseJSVGCanvas.getInstance().getUpdateManager();
    //
    // if (updateManager != null) {
    // RunnableQueue runnableQueue = updateManager.getUpdateRunnableQueue();
    // // We need to stop the RunnableQueue for SVGDocument manipulation
    // runnableQueue.suspendExecution(true);
    // // true = wait till suspended, false = go on
    //
    // while (svgElementIDIterator.hasNext()) {
    // String svgElementID = svgElementIDIterator.next();
    // // System.out.println("SVG: " + svgElementID);
    // // Get all animations for each SVG element
    // Iterator<Animation> animationIterator = svgElementsHashMap
    // .get(svgElementID).iterator();
    //
    // // We need to apply all animations for each SVG element, before updating the
    // // EclipseJSVGCanvas
    // while (animationIterator.hasNext()) {
    // animationIterator.next().apply(flatJSONObject, svgElementID);
    // }
    // }
    // // Schedule a new Batik thread for redrawing the canvas and resume
    // // scheduling afterwards.
    // runnableQueue.invokeLater(new RunnableAnimation());
    // runnableQueue.resumeExecution();
    //
    // }
    // } catch (JSONException e) {
    // // Something went wrong with the JSONObject.
    // }
    // } else {
    // Activator
    // .reportErrorMessage("Hashmap is not initialized! -> "
    // + "Mapping-File may have a wrong format");
    // }
    // }

    /**
     * Scans a string of comma separated values and simple puts them into an array.
     */
    public ArrayList<String> parser(final String input) {
        ArrayList<String> valueList = new ArrayList<String>();
        // Deletes all whitespace characters
        String inputWithoutWhitespace = input.replaceAll("\\s", "");
        String[] values = inputWithoutWhitespace.split(",");
        for(String v : values) {
            valueList.add(v);
        }
        return valueList;
    }

    /**
     * This function is intensively used by the mapInputToOutput() method. It simply creates an
     * ArrayList with no duplicates of the inputstring.
     * 
     * @return An ArrayList with all parsed values
     * @param input
     *            String to parse
     * @param isInputAttribute
     *            true means save all input values of a range. Example: true = 1..5 => 1,2,3,4,5 |
     *            false = 1..5 => 1,5
     * 
     */
    public ArrayList<String> attributeParser(final String input, final boolean isInputAttribute) {
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
                Scanner inputScanner = new Scanner(input).useDelimiter("\\s*[,]\\s*");
                while (inputScanner.hasNext()) {
                    // This means a range plus a distance between [number1]:[number2]
                    if (inputScanner.hasNext("[-]?[\\d]+[.]{2,3}[-]?[\\d]+")) { // Test if the
                        // next input
                        // matches
                        // "[-]NUMBER..[.][-]NUMBER"
                        // Now we know, that the inputScanner.next() contains exactly 2 integer
                        // values
                        Scanner sc = new Scanner(inputScanner.next()).useDelimiter("[.]+");
                        int leftint = sc.nextInt();
                        int rightint = sc.nextInt();
                        // int min, max;
                        // min = Math.min(leftint, rightint);
                        // max = Math.max(leftint, rightint);
                        // if it is the input attribute, we need all values
                        if (isInputAttribute) {
                            if (leftint <= rightint) {
                                for (int j = leftint; j <= rightint; j++) {
                                    if (inputSet.add(Integer.toString(j))) {
                                        inputArray.add(Integer.toString(j));
                                    } // Else, the input is already in the Array
                                }
                            } else { // leftint is greater then rightint
                                for (int j = leftint; j >= rightint; j--) {
                                    if (inputSet.add(Integer.toString(j))) {
                                        inputArray.add(Integer.toString(j));
                                    } // Else, the input is already in the Array
                                }
                            }
                        } else {
                            // allow multiple values only if it is not the input
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
                                    // System.out.println("Genau ein Wert: "+token);
                                }
                            } else {
                                inputArray.add(token);
                            }
                        } else {
                            // Error - wrong Syntax, was not accepted!
                            Activator.reportErrorMessage("Input has wrong syntax: " + token);

                        }
                    }
                }
            } else if (Pattern.matches(pattern, input)) {
                // Valid value (exactly one)
                // System.out.println("Genau ein Wert: "+input);
                if (isInputAttribute) {
                    if (inputSet.add(input)) {
                        inputArray.add(input);
                    } // Else, the input is already in the Array
                } else {
                    inputArray.add(input);
                }
            } else {
                // Error - wrong Syntax, was not accepted!
                // System.out.println("Falsche Syntax: "+input);
                Activator.reportErrorMessage("Input has wrong syntax: " + input);
            }
        }
        return inputArray;
    }

    /**
     * THIS Method is really important and should be used for all animations! This method maps the
     * input values to the corespondig output values. input is always the input from mapping file
     * whereby output can be any value of the special animation to which the input values should be
     * mapped.
     * 
     * Example: input="1..10,20..30,40,45,50,900"
     * output=x_range="[200..215,220,225,230,235,240];[1..3];200" PROBLEME MIT DEM PARSEN DES
     * OUTPUTS HIER NOCHMAL SCHAUEN! UPDATE: This method does no parsing at all! it just maps an
     * input arraylist to an outputarraylist
     * 
     * @param inputArray
     *            the array with all valid input values
     * @param outputArray
     *            the array with the animation specific values to which the input values should be
     *            mapped
     * @return hashMap a hashmap with input values as the key and output values as the value
     */
    public HashMap<String, String> mapInputToOutput(final ArrayList<String> inputArray,
            final ArrayList<String> outputArray) {
        HashMap<String, String> hashMap = new HashMap<String, String>();

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

    // ----------------------------------------------------------------------------------------------
    // Should be put later on to the JSON package

    @SuppressWarnings("unchecked")
    public JSONObject compareDifference(JSONObject oldJSONObject, JSONObject newJSONObject) {
        JSONObject resultJSONObject = new JSONObject();
        Iterator<String> newKeyIterator;

        newKeyIterator = newJSONObject.keys();
        String jsonKey;
        try {
            while (newKeyIterator.hasNext()) {
                jsonKey = newKeyIterator.next();
                // if key exists in old JSON object we need to compaare the old and new value.
                if (oldJSONObject.has(jsonKey)) {
                    if (newJSONObject.optString(jsonKey).equals(oldJSONObject.optString(jsonKey))) {
                        // resultJSONObject.put(jsonKey, newJSONObject.get(jsonKey));
                        continue; // Only go on if the newvalue already exists and equals the old
                        // value
                    }
                }// else {
                // resultJSONObject.put(jsonKey, newJSONObject.get(jsonKey));
                // }
                // otherwise add it to the result object!
                resultJSONObject.put(jsonKey, newJSONObject.get(jsonKey));
            }
        } catch (JSONException e) {
            Activator.reportDebugMessage("Something went wrong comparing the two JSONObjects: "
                    + oldJSONObject.toString() + " and " + newJSONObject.toString());
        }
        // System.out.println("Result: "+resultJSONObject.toString());

        return resultJSONObject;
    }

    /**
     * Make the input JSONObject flat if there exists a hierarchy. This one should be called instead
     * of the other version of makeItFlat, which has some initial value parameters for recursive
     * computation.
     * 
     * @param inputObject
     *            the input JSONObject, which may not be flat
     * @return A JSONObject which has a flat hierarchy
     * @throws JSONException
     *             , is thrown if a conversion fails
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
    private static JSONObject makeItFlat(final JSONObject flatOne, final String adressKey,
            final JSONObject inputObject) throws JSONException {
        String[] keys = JSONObject.getNames(inputObject);
        if (keys == null) {
            // If there exists no key try it must be an empty json object
            if (!adressKey.equals("")) {
                flatOne.put(adressKey, new JSONObject());
            }
        } else {
            for (String key : keys) {
                if (inputObject.optJSONObject(key) == null) {
                    if (adressKey.equals("")) {
                        flatOne.put(key, inputObject.optString(key));
                    } else {
                        flatOne.put(adressKey + "." + key, inputObject.optString(key));
                    }
                } else {
                    if (adressKey.equals("")) {
                        makeItFlat(flatOne, key, inputObject.optJSONObject(key));
                        // Add the toplevel objects to the result object (that are the svgelement
                        // id's)
                        // flatOne.put(key, JSONObject.NULL);
                    } else {
                        makeItFlat(flatOne, adressKey + "." + key, inputObject.optJSONObject(key));
                    }
                }
            }
        }
        // System.out.println(flatOne);
        return flatOne;
    }

    /**
     * @param jsonKeyToInputValuesToAnimationsMap
     *            the jsonKeyToInputValuesToAnimationsMap to set
     */
    public void setJsonKeyToInputValuesToAnimationsMap(
            HashMap<String, HashMap<String, ArrayList<Pair<String, Animation>>>> jsonKeyToInputValuesToAnimationsMap) {
        this.jsonKeyToInputValuesToAnimationsMap = jsonKeyToInputValuesToAnimationsMap;
    }

    /**
     * @return the jsonKeyToInputValuesToAnimationsMap
     */
    public HashMap<String, HashMap<String, ArrayList<Pair<String, Animation>>>> getJsonKeyToInputValuesToAnimationsMap() {
        return jsonKeyToInputValuesToAnimationsMap;
    }

    /**
     * @param defaultKeyToAnimationsMap
     *            the defaultKeyToAnimationsMap to set
     */
    public void setDefaultKeyToAnimationsMap(
            HashMap<String, ArrayList<Pair<String, Animation>>> defaultKeyToAnimationsMap) {
        this.defaultKeyToAnimationsMap = defaultKeyToAnimationsMap;
    }

    /**
     * @return the defaultKeyToAnimationsMap
     */
    public HashMap<String, ArrayList<Pair<String, Animation>>> getDefaultKeyToAnimationsMap() {
        return defaultKeyToAnimationsMap;
    }

    public void setKeyToAnimationsMap(
            HashMap<String, ArrayList<Pair<String, Animation>>> keyToAnimationsMap) {
        this.keyToAnimationsMap = keyToAnimationsMap;
    }

    public HashMap<String, ArrayList<Pair<String, Animation>>> getKeyToAnimationsMap() {
        return this.keyToAnimationsMap;
    }

    public HashMap<String, HashSet<String>> getModifiedKeyMap() {
        return this.modifiedKeyMap;
    }

    /**
     * Maps the current JSON value from an input range to an output range
     * 
     * @param jsonValue
     * @param input
     * @param output
     * @return
     */
    public final String computeRangeValue(String inputValue, String inputRange, String outputRange) {
        // System.out.println(inputValue + ", " + inputRange+ ", "+ outputRange);

        double value;
        // just to be sure that we have two valid range-values -> for float values
        // "[-]?\\d+([.]\\d+)?[.]{2,3}[-]?\\d+([.]\\d+)?"
        // Only integer values are allowed
        // if (inputRange.matches("[-]?\\d+[.]{2,3}[-]?\\d+") &&
        // outputRange.matches("[-]?\\d+[.]{2,3}[-]?\\d+")) {
        if (inputRange.matches("[-]?\\d+([.]\\d+)?[.]{2,3}[-]?\\d+([.]\\d+)?")
                && outputRange.matches("[-]?\\d+([.]\\d+)?[.]{2,3}[-]?\\d+([.]\\d+)?")) {
            double leftInput, rightInput, leftOutput, rightOutput, diffInput, diffOutput, stepDistance, rangeValue;

            Scanner s = new Scanner(inputRange).useDelimiter("[.]{2,3}").useLocale(Locale.US);
            leftInput = s.nextDouble();
            rightInput = s.nextDouble();

            s = new Scanner(outputRange).useDelimiter("[.]{2,3}").useLocale(Locale.US);
            leftOutput = s.nextDouble();
            rightOutput = s.nextDouble();

            rangeValue = 0;
            try {
                value = Double.parseDouble(inputValue);
                rangeValue = 0;

                // Test the four cases
                if (leftInput <= rightInput && leftOutput <= rightOutput) {
                    // case 1
                    diffInput = rightInput - leftInput;
                    diffOutput = rightOutput - leftOutput;

                    stepDistance = diffOutput / diffInput;
                    rangeValue = value - leftInput;
                    rangeValue *= stepDistance;
                    rangeValue += leftOutput;
                } else if (leftInput <= rightInput && leftOutput > rightOutput) {
                    // case 2
                    diffInput = rightInput - leftInput;
                    diffOutput = leftOutput - rightOutput;

                    stepDistance = diffOutput / diffInput;
                    rangeValue = value - leftInput;
                    rangeValue *= stepDistance;
                    rangeValue = leftOutput - rangeValue;
                } else if (leftInput > rightInput && leftOutput <= rightOutput) {
                    // case 3
                    diffInput = leftInput - rightInput;
                    diffOutput = rightOutput - leftOutput;

                    stepDistance = diffOutput / diffInput;
                    rangeValue = leftInput - value;
                    rangeValue *= stepDistance;
                    rangeValue += leftOutput;
                } else if (leftInput > rightInput && leftOutput > rightOutput) {
                    // case 4
                    diffInput = leftInput - rightInput;
                    diffOutput = leftOutput - rightOutput;

                    stepDistance = diffOutput / diffInput;
                    rangeValue = leftInput - value;
                    rangeValue *= stepDistance;
                    rangeValue = leftOutput - rangeValue;
                }

            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                System.out
                        .println("InputValue has wrong number format - it should be a valid double-value");
            }
            return Double.toString(rangeValue);
        } else if (inputRange.matches("[-]?\\d+([.]\\d+)?")
                && outputRange.matches("[-]?\\d+([.]\\d+)?[.]{2,3}[-]?\\d+([.]\\d+)?")) {
            Scanner s = new Scanner(outputRange).useDelimiter("[.]{2,3}").useLocale(Locale.US);
            return Double.toString(s.nextDouble());// If a single value has an output range get the
            // first value form range
        } else if (outputRange.matches("[-]?\\d+([.]\\d+)?")) {
            // It is a single value so return it
            return outputRange;
        } else {
            return "";// That's the default value, if the value is not a valid float
        }

    }

    /**
     * Tests if a value matches the input string of an animation.
     * 
     * @param jsonValue
     * @param inputValue
     * @return
     */
    public boolean jsonValueMatchesInputValue(String jsonValue, String inputValue) {
        ArrayList<String> inputValues = this.parser(inputValue);
        for (String value : inputValues) {
            if (jsonValue.equals(value) || this.valueMatchesRange(jsonValue, value)) {
                return true;
            }
        }
        return false;
    }

}
