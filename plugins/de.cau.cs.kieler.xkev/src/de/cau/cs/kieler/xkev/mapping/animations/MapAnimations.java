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
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;


import org.apache.batik.css.engine.value.URIValue;
import org.apache.batik.swing.svg.SVGDocumentLoaderAdapter;
import org.apache.batik.swing.svg.SVGDocumentLoaderListener;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.osgi.framework.Bundle;
import org.w3c.dom.svg.SVGDocument;

import de.cau.cs.kieler.sim.kiem.json.JSONArray;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.helpers.Tools;
import de.cau.cs.kieler.xkev.mapping.Animation;
import de.cau.cs.kieler.xkev.mapping.Colorize;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.Move;
import de.cau.cs.kieler.xkev.mapping.SVGElement;
import de.cau.cs.kieler.xkev.mapping.SVGFile;
import de.cau.cs.kieler.xkev.mapping.Textbox;
import de.cau.cs.kieler.xkev.views.EclipseJSVGCanvas;
import de.cau.cs.kieler.xkev.views.EnvironmentComposite;
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
    //private SVGDocument svgDocument;
    private EclipseJSVGCanvas svgCanvas;
    
    private Map<String, EList<Animation>> svgElementsHashMap = null;
    
    
    public MapAnimations() {
        svgCanvas = (EclipseJSVGCanvas) EnvironmentComposite.getInstance().getSVGCanvas();
    }
    
    /**
     * Creates the MapAnimation instance and loads an mapping file either from Resource (examples/*) isResource=true or
     * from anywhere on the harddisk (isResource=false).
     * 
     * @param filename
     * @param isResource
     */
    
    public MapAnimations(String filename, boolean isResource) {
        //svgCanvas = EclipseJSVGCanvas.getInstance();
        svgCanvas = (EclipseJSVGCanvas) EnvironmentComposite.getInstance().getSVGCanvas();
        if (isResource) {
            //mappingFile not needed anymore, because we now deal with a HashMap
            //mappingFile = loadFromResource(filename);
            loadFromResource(filename);
        } else {
            //mappingFile = loadFromFile(filename);
            loadFromFile(filename);
        }
    }
    
    /**
     * Returns the actual JSVGCanvas.
     * @return svgCanvas
     */
    public EclipseJSVGCanvas getJSVGCanvas() {
        return svgCanvas;
    }
    
    /**
     * Returns the actual SVGDocument.
     * @return svgDocument
     */    
    public SVGDocument getSVGDocument() {
        return svgCanvas.getSVGDocument();
    }
    
    
    /**
     * Loads an .mapping file from the resource example folder.
     * 
     * @param filename
     * @return svgFile which is the mapping file
     */
    //return wird eigenetlich nicht mehr benötigt -> besser als void implementieren?
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
        createHashMap(svgFile);
        if (!svgFile.getFilename().isEmpty()) {
            System.out.println("FILENAME: "+svgFile.getFilename());
            loadSpecifiedSVGFile(svgFile.getFilename());
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
        createHashMap(svgFile);
        loadSpecifiedSVGFile(svgFile.getFilename());
        return svgFile;
    }
    
    private void loadSpecifiedSVGFile(String filename) {
//        System.out.println("Filename: "+filename);
//        //parse the filename to determine weather it is a resource file or an external file
        if (filename.indexOf("resource:") == 0) {
            String path = filename.substring("resource:".length());
            // Get the resource from examples folder
            URL url = FileLocator.find(Activator.getDefault().getBundle(), new Path(path), null);
            
            System.out.println("Bundleentry: "+url.toExternalForm());
            //setSVGFile(url);
            EnvironmentComposite.getInstance().setSVGFile(url);
            //Sometimes on first load, the fileloading get's cancelled, don't know why and from whom 
            EnvironmentComposite.getInstance().paintSVGFile();
            //svgCanvas.loadSVGDocument(url.toExternalForm());
        } else {
            try {
                URL url = new URL("file:/"+filename);
                EnvironmentComposite.getInstance().setSVGFile(url);
                //Sometimes on first load, the fileloading get's cancelled, don't know why and from whom 
                EnvironmentComposite.getInstance().paintSVGFile();
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //Wait until loading was successful (Dirty, but i don't know how to do it better right now)
        while (!EnvironmentComposite.getInstance().SVGDocumentLoadingSuccessful()) ;
    }
    
    
    /**
     * This Method creates a HashMap of SVGElements of the actual Mapping file. 
     * 
     */
    private synchronized void createHashMap(SVGFile mappingFile) {
        this.svgElementsHashMap = new HashMap<String,EList<Animation>>();
        Iterator<SVGElement> elementIterator = mappingFile.getSvgElement().iterator();
        SVGElement svgElement; 
        while (elementIterator.hasNext()) {
            svgElement = elementIterator.next();
            this.svgElementsHashMap.put(svgElement.getId(), svgElement.getAnimation());
        }
    }
    
    
    /**
     * Applies the Animations for all JSON-Keys which exists in the mapping file.
     *     
     * @param jsonObject
     */
    public void doAnimations(JSONObject jsonObject) {
        //Check whether the HashMap has been created
        if (this.svgElementsHashMap == null) {
            System.out.println("HashMap is not initialized!");
            return;
        }
        //Get all JSON-Key-Names from the JSON object
        String[] names = JSONObject.getNames(jsonObject);
        for (String name : names) {
            //Now we need to check for each JSON-Key if there exists a SVGElement-Tag in the Mapping-HashMap
            if (this.svgElementsHashMap.containsKey(name)) {
                //Get all animations for each SVG element
                Iterator<Animation> animationIterator = svgElementsHashMap.get(name).iterator();
                
                Animation animation;
                while (animationIterator.hasNext()) {
                    animation = animationIterator.next();

                    //We need to apply all animations for each SVG element
                    if (animation instanceof Colorize) {
                        Colorize colorizeAnimation = (Colorize) animation;
                        colorizeAnimation.applyAnimation(jsonObject, name);
                    } else if (animation instanceof Move) {
                        Move moveAnimation = (Move) animation;
                        moveAnimation.applyAnimation(jsonObject, name);
                    } else if (animation instanceof Textbox) {
                        Textbox textboxAnimation = (Textbox) animation;
                        textboxAnimation.applyAnimation(jsonObject, name);
                    } else {
                        System.out.println("Animation "+animation.getClass().getSimpleName()+" does not exists!");
                    }
                    
                }
            }
        }
        //Now we still need to apply all animations to the SVG document
        updateSVGGraphik();
    }
    
    /**
     * This function is intensely used by the mapInputToOutput() method.
     * It simply creates an ArrayList with no duplicates of the inputstring.
     * 
     */
    private ArrayList<String> generateArrayListFromInput(String input, boolean integerOnly) {
        ArrayList<String> inputArray = new ArrayList<String>();
        HashSet<String> inputSet = new HashSet<String>();
        //Now we begin with the input tokens
        String pattern;
        if (integerOnly) {
            //Allow only valid integer values.
            pattern = "[-]?[\\d]+"; 
        } else {
            //Allow all chars, except these ".,;[]"
            pattern = "[^.,;\\[\\]]+";
        }
        
        if (Pattern.matches("\\[([^,\\[\\]]+[,])*[^,\\[\\]]+\\]", input)) {
            //Correct brackets for a valid list
//            System.out.println("Korrekte Liste: "+input);
            Scanner inputScanner = new Scanner(input).useDelimiter("[\\[,\\]]");
            while (inputScanner.hasNext()) {
                //This means a range plus a distance between [number1]:[number2]
                if (inputScanner.hasNext("[-]?[\\d]+:[-]?[\\d]+[.]{2,3}[-]?[\\d]+")) {
                    Scanner sc = new Scanner(inputScanner.next()).useDelimiter("[.:]+");
                    //We have exactly three integer values if this pattern matches
                    int first, second, last;
                    first = sc.nextInt();
                    second = sc.nextInt();
                    last = sc.nextInt();
                    if (first < second && last >= second) {
                    //Example: [200:210..220] = three steps (200, 210, 220)
                        for (int i = first; i < last; i += (second-first)) {
                            if (inputSet.add(Integer.toString(i))) {
                                inputArray.add(Integer.toString(i));
                            }//Else, the input is already in the Array
                        }
                    } else if (first > second && last <= second) {
                      //Example: [220:210..210] = two steps (220, 210)    
                        for (int i = first; i > last; i -= (first-second)) {
                            if (inputSet.add(Integer.toString(i))) {
                                inputArray.add(Integer.toString(i));
                            }//Else, the input is already in the Array
                        }
                    } //Others makes no sense
                } else if (inputScanner.hasNext("[-]?[\\d]+[.]{2,3}[-]?[\\d]+")) {//Test if the next input matches "[-]NUMBER..[.][-]NUMBER"
                    //Now we know, that the inputScanner.next() contains exactly 2 integer values
                    Scanner sc = new Scanner(inputScanner.next()).useDelimiter("[.]+");
                    int leftint = sc.nextInt();
                    int rightint = sc.nextInt();
//                    int min, max;
//                    min = Math.min(leftint, rightint);
//                    max = Math.max(leftint, rightint);
                    if (leftint <= rightint) {
                        for (int j = leftint; j <= rightint; j++) {
                            if (inputSet.add(Integer.toString(j))) {
                                inputArray.add(Integer.toString(j));
                            }//Else, the input is already in the Array
                        } 
                    } else {//leftint is greater then rightint
                        for (int j = leftint; j >= rightint; j--) {
                            if (inputSet.add(Integer.toString(j))) {
                                inputArray.add(Integer.toString(j));
                            }//Else, the input is already in the Array
                        }                        
                    }
                } else { 
                    String token = inputScanner.next();
                    if (Pattern.matches(pattern, token)) {
                        //The input can be everything now
                        if (inputSet.add(token)) {
                            inputArray.add(token);
//                            System.out.println("Genau ein Wert: "+token);
                        } 
                    } else {
                        //Error - wrong Syntax, was not accepted!
//                        System.out.println("Falsche Syntax: "+token);
                    }
                }
            }
        } else if (Pattern.matches(pattern, input)) {
            //Valid value (exactly one)
//            System.out.println("Genau ein Wert: "+input);
            if (inputSet.add(input)) {
                inputArray.add(input);
            }//Else, the input is already in the Array
        } else {
            //Error - wrong Syntax, was not accepted!
//            System.out.println("Falsche Syntax: "+input);
        }
        //for (int i=0; i<inputArray.size(); i++) System.out.print(inputArray.get(i)+",");
//        System.out.println();
        return inputArray;
    }
    
    
    /**
     * The short version for the normal case that all values are excepted.
     */
    public ArrayList<HashMap<String,String>> mapInputToOutput(String input, String output) {
        return mapInputToOutput(input, output, false);        
    }
    
        
    /**
     * THIS Method is really important and should be used for all animations!
     * This method maps the input values to the corespondig output values.
     * input is always the input from mapping file whereby output can be any value of the special animation
     * to which the input values should be mapped.
     * 
     * Example: input="[1..10,20..30];[40,45,50];900" output=x_range="[200..215,220,225,230,235,240];[1..3];200"
     * PROBLEME MIT DEM PARSEN DES OUTPUTS HIER NOCHMAL SCHAUEN!
     */
    public ArrayList<HashMap<String,String>> mapInputToOutput(String input, String output, boolean outputIntegerOnly) {
        //First of all, we delete any space in the input an output strings
        String in, out;
        in = input.replace(" ", "");
        out = output.replace(" ", "");
        //At the beginning we want to separate all inputs and outputs specified by ";"
        StringTokenizer inTokenizer = new StringTokenizer(in,";");
        StringTokenizer outTokenizer = new StringTokenizer(out,";");
//        System.out.println("in:"+in+" out:"+out);
//        System.out.println("#in:"+inTokenizer.countTokens()+" #out:"+outTokenizer.countTokens());
//        System.out.println("inTokenizer:");
//        while (inTokenizer.hasMoreTokens()) {
//            System.out.println(inTokenizer.nextToken());
//        }
//        System.out.println("outTokenizer:");
//        while (outTokenizer.hasMoreTokens()) {
//            System.out.println(outTokenizer.nextToken());
//        }
        //Now we need to check whether the number of input tokens is the same as the number of output tokens.
        //If not, we need to compare only to the minimum of both 
        int minTokens = Math.min(inTokenizer.countTokens(), outTokenizer.countTokens());
        ArrayList<HashMap<String,String>> hashMapArray = new ArrayList<HashMap<String,String>>();
        for (int i = 0; i < minTokens; i++) {
            //Now for each token, we create an ArrayList first an parallel to it a HashSet to guarantee that each value
            //exists only once in the ArrayList.
            ArrayList<String> inputArray = new ArrayList<String>();
            ArrayList<String> outputArray = new ArrayList<String>();
            
            //For each token we generate an input and output Array
            //and create a HashMap of it
            HashMap<String,String> hashMap = new HashMap<String,String>(); 
            inputArray = generateArrayListFromInput(inTokenizer.nextToken(), false); //The input should always allow all values
            outputArray = generateArrayListFromInput(outTokenizer.nextToken(), outputIntegerOnly);

            Iterator<String> inputIterator = inputArray.iterator();
            Iterator<String> outputIterator = outputArray.iterator();
            
            //Do some size calculation
            //Only go on, if we have two arrays which are greater then zero
            if (Math.min(inputArray.size(), outputArray.size()) > 0) {
                if (inputArray.size() > outputArray.size()) {
                    //This is the cyclic version
                    while (inputIterator.hasNext()) {
                        //This while loop is necessary for the cyclic mapping
                        for (int j = 0; j < outputArray.size(); j++) {
                            if (inputIterator.hasNext()) {
                                hashMap.put(inputIterator.next(), outputArray.get(j));
                            }
                        }
                    }
                } else if (inputArray.size() == outputArray.size()) {
                    while (inputIterator.hasNext()) {
                        hashMap.put(inputIterator.next(), outputIterator.next());
                    }
                } else {// inputArray.size() < outputArray.size()
                    for (int j = 0; j < inputArray.size(); j++) {
                        hashMap.put(inputArray.get(j), outputArray.get(j));
                    }
                }
            }
            
            //DEBUG-BEGIN
//            System.out.println("hashMapSize: "+hashMap.size());
//            Iterator<String> it = hashMap.keySet().iterator();
//            String key;
//            while (it.hasNext()) {
//                key = it.next();
//                System.out.println("Input: "+i+" Key: "+key+" Value: "+hashMap.get(key));
//            }
            //DEBUG-END
            
            //Now the actual token is successfully saved in the hashMap.
            //So we just need to put it to the HashMap-ArrayList
            hashMapArray.add(hashMap);
        }
        return hashMapArray;   
    }
    
    /**
     * This method compares the inputString from the mapping file with an jsonValue.
     * If the value matches on of the input tokens the f
     * @param inputValue
     * @param jsonValue
     * @return
     */
    
    public boolean[] compareInputStringWithJSONValue(String inputValue, String jsonValue) {
        //First we need to delete spaces and then split the tokens which are separated by ";"
        System.out.println(inputValue);
        System.out.println(inputValue.replace(" ",""));
        StringTokenizer st1 = new StringTokenizer(inputValue.replace(" ",""),";");
        int numberOfTokens = st1.countTokens();
        boolean[] result = new boolean[numberOfTokens];
        
        for (int i = 0; i < numberOfTokens; i++) {
            //Just to be sure that a first the result values are false
            result[i] = false;
            //First we check whether the input contains only numbers and separators.
            String token = st1.nextToken();
            if (Pattern.matches("\\[[-\\d,.]*\\]", token)) {
                int intToken;
                try {
                    intToken = Integer.parseInt(jsonValue);
                    //Parse only numbers and "."
                    StringTokenizer st3 = new StringTokenizer(token, "[,]");
                    while (st3.hasMoreTokens()) {
                        // System.out.println(token);
                        Scanner sc1 = new Scanner(st3.nextToken());
                        while (sc1.hasNext()) {
                            //Check whether the next token has the correct form of: [-]digit..[.][-]digit where "[]" means optional
                            if (sc1.hasNext("[-]?[\\d]+[\\.]{2,3}[-]?[\\d]+")) {
                                Scanner sc2 = new Scanner(sc1.next()).useDelimiter("[.]+");
                                int leftint = sc2.nextInt();
                                int rightint = sc2.nextInt();
                                int min = Math.min(leftint,rightint);
                                int max = Math.max(leftint,rightint);
                                //Check if intToken is between min and max -> valid value
                                if (min <= intToken && intToken <= max) {
                                    result[i] = true;
                                    break;
                                }
                            } else if (sc1.hasNextInt()) {
                                if (intToken == sc1.nextInt()) {
                                    result[i] = true;
                                    break;
                                }
                            } else {
                                sc1.next();
                            }
                        }
                        //the result is already true so we don't have to go on with next value of actual token
                        if (result[i]) {
                            break;
                        }
                    }
                    System.out.println(token);
                } catch (NumberFormatException e) {
                    // TODO Auto-generated catch block
                    //jsonValue was no int, so try the other tokens
                    //not necessary to mention
                }
            //The next Pattern means in can contain any character separated by "," at least 2 values
            } else if (Pattern.matches("\\[([^,]+[,])+[^,]+\\]", token)) {
                StringTokenizer st3 = new StringTokenizer(inputValue, "[,]");
                while (st3.hasMoreTokens()) {
                    if (st3.nextToken().equals(jsonValue)) {
                        result[i] = true;
                        break;
                    }
                }
                System.out.println(token);
            } else {
                if (token.equals(jsonValue)) {
                    result[i] = true;
                }
                System.out.println("Token is a singel value -> "+token);
                
            }
        }
        //Return the result array
        return result;
    }
    
    
    /**
     * NOT NEEDED ANYMORE I GUESS
     * @param inputValue
     * @param animationValue
     * @return
     */
    public boolean[] compareInputStringWithAnimationValues(String inputValue, String animationValue) {
        //First we need to delete spaces and then split the tokens which are separated by ";"
        StringTokenizer st1 = new StringTokenizer(inputValue.replace(" ",""),";");
        StringTokenizer st2 = new StringTokenizer(animationValue.replace(" ",""),";");
//        Scanner sc1 = new Scanner(animationValue.replace(" ", "")).useDelimiter(";");
        Scanner scanner = new Scanner(animationValue.replace(" ", "")).useDelimiter(";");
        //The result array has only the size of the minimum number of input tokens
        boolean[] result = new boolean[Math.min(st1.countTokens(), st2.countTokens())];
        //counter for the result array
        int counter = 0;
        //We can only match the minimum of each input. Optimal was if each input has the same number of tokens.
        for (int i = 0; i < Math.min(st1.countTokens(), st2.countTokens()); i++) {
            //First we check whether the input contains only numbers and separators.
            String token = st1.nextToken();
            if (Pattern.matches("\\[[\\-0-9,\\.]*\\]", token)) {
                //if we are in here, the animationValue must be an integer too
                if (!scanner.hasNextInt()) {
                    //Something was wrong with the mapping file so continue
                    continue;
                }
                int intToken = scanner.nextInt();
                //Parse only numbers and "."
                StringTokenizer st3 = new StringTokenizer(inputValue, "[,]");
                while (st3.hasMoreTokens()) {
                    // System.out.println(token);
                    Scanner sc1 = new Scanner(st3.nextToken());
                    while (sc1.hasNext()) {
                        //Check whether the next token has the correct form of: [-]digit..[.][-]digit where "[]" means optional
                        if (sc1.hasNext("[\\-]*[\\d]+[\\.]{2,3}[\\-]*[\\d]+")) {
                            Scanner sc2 = new Scanner(sc1.next()).useDelimiter("[\\.]+");
                            int leftint = sc2.nextInt();
                            int rightint = sc2.nextInt();
                            int min = Math.min(leftint,rightint);
                            int max = Math.max(leftint,rightint);
                            //Check if intToken is between min and max -> valid value
                            if (min <= intToken && intToken <= max) {
                                result[counter++] = true;
                                break;
                            }
                        } else if (sc1.hasNextInt()) {
                            if (intToken == sc1.nextInt()) {
                                result[counter++] = true;
                            }
                        } else {
                            sc1.next();
                        }
                    }
                }
                //Otherwise the value is not valid
                result[counter++] = false;
                System.out.println(token);
            //The next Pattern means in can contain any character separated by "," at least 2 values
            } else if (Pattern.matches("\\[[.+[,].+]+\\]", token)) {
                System.out.println(token);
            } else {
                System.out.println("Token is a singel value -> "+token);
            }
        }
        //Return the result array
        return result;
    }
    
    /**
     * The values of the special animation is a single value for each input value separated by ";".
     * @param inputValue
     * @return
     */
    public String[] parseValueString(String inputValue) {
        //First we need to seperate each value pairs (symbolized by ";")
        //First of all delete all whitespace of inputValue
        ArrayList<String> arrayList = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(inputValue.replaceAll(" ", ""),";");
        while (tokenizer.hasMoreTokens()) {
            arrayList.add(tokenizer.nextToken());
        }
        //Now the arrayList contains all validValues for each input, separated by ";"
        return arrayList.toArray(new String[arrayList.size()]);
    }

    
    public boolean inputEqualsValue(HashSet<String> hashSet, String value) {
        return hashSet.contains(value);
    }
    
    public HashSet<String> jsonArrayToHashSet(JSONArray jsonArray) {
        HashSet<String> hashSet = new HashSet<String>();
        try {
            for (int i = 0; i < jsonArray.length(); i++) {
                hashSet.add((String) jsonArray.get(i));
            }
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            //This should never happens
        }
        return hashSet;
    }
    
    /** NOT NEEDED ANYMORE I GUESS
     * 
     * @param jsonArray
     * @param accessID
     * @param inputValue
     * @return
     */
/*    public boolean valueMatchesInputArray(JSONArray jsonArray, int accessID, String inputValue) {
       StringTokenizer st = new StringTokenizer(inputValue, "..");
       int min, max;
       if (st.countTokens() == 2) {
           try {
               //Input is a range, so the jsonValue must be an integer value
               int jsonValue = jsonArray.optInt(accessID);
               min = Integer.parseInt(st.nextToken());
               max = Integer.parseInt(st.nextToken());
               if (min <= max) {
                  for (int i=min; i<=max; i++) {
                      if (jsonValue == i) {
                          return true;
                      }
                  }
               } else {
                   for (int i=max; i<=min; i++) {
                       if (jsonValue == i) {
                           return true;
                       }
                   }
               }
           } catch (NumberFormatException e) {
               Activator.reportErrorMessage("NumberFormatException: The value of the \"accessID\" attribute is not a valid integer value!");
           }
       }
       
       //check if the input value is a list of comma separated values
       String jsonValue = jsonArray.optString(accessID);
       st = new StringTokenizer(inputValue,",");
       for (int i=0; i<st.countTokens(); i++) {
           if (jsonValue.equals(st.nextToken())) {
               return true;
           }
       }
       //otherwise it doesn't match!
       return false; 
    }
*/    
    /** NOT NEEDED ANYMORE I GUESS
     * This method parses the Input-Tag value and checks whether the value does match the jsonObject value or not.
     * 
     * @param jsonObject
     * @param jsonKey
     * @param inputValue
     * @return
     */
/*    public boolean valueMatchesInput(JSONObject jsonObject, String jsonKey, String inputValue) {
        String jsonValue;
        //System.out.println("inputValue: "+inputValue);
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
            }//Sehr fraglich, ob das prüfen auf boolesche werte zulässig sein soll! 
            else if (inputValue.contains("==")) {
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
*/    
    
    /** NOT NEEDED ANYMORE I GUESS
     * Returns the the ID of an SVGElement if it exists or "none" if no JSONValue with this ID as a JSON Key was found
     * or null if the value isn't an ID. 
     * 
     * @param jsonObject
     * @param value
     * @return 
     */    
/*    public String valueContainsID(JSONObject jsonObject, String value) {
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
*/ 
    /**
     * Just updates the actual SVGDocument. 
     */
    private void updateSVGGraphik() {
        svgCanvas.setSVGDocument(svgCanvas.getSVGDocument());
    }
    
}
