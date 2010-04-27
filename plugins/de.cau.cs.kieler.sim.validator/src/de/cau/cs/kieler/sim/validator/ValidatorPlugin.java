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

package de.cau.cs.kieler.sim.validator;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.eclipse.core.runtime.Path;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class ValidatorPlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.validator";

    /** The shared instance. */
    private static ValidatorPlugin plugin;

    /** The static kiem properties for both components. */
    private static KiemProperty[] kiemProperties;
    
    /** The asked flag is reset every execution and saves the users opinion. */
    private static boolean asked;

    // -------------------------------------------------------------------------
    
    /**
     * Checks whether asked is true.
     * 
     * @return true, if is asked
     */
    public static boolean isAsked() {
        return asked;
    }

    /**
     * Sets the asked.
     * 
     * @param askedParam
     *            the new asked
     */
    public static void setAsked(boolean askedParam) {
        asked = askedParam;
    }
    
    // -------------------------------------------------------------------------

    /**
     * The constructor of the validator plugin.
     */
    public ValidatorPlugin() {
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the reditorProperty.
     * 
     * @return the editor property
     */
    public static String getEditorProperty() {
        return provideProperties()[0].getValue();
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the editor property.
     * 
     * @param editorPropertyParam
     *            the new editor property
     */
    public static void setEditorProperty(String editorPropertyParam) {
        provideProperties()[0].setValue(editorPropertyParam);
        distributeProperties();
        KiemPlugin.getDefault().updateViewAsync();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the training mode property.
     * 
     * @return the training mode property
     */
    public static boolean getTrainingModeProperty() {
        return provideProperties()[1].getValueAsBoolean();
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the training mode property.
     * 
     * @param trainingModeParam
     *            the new training mode property
     */
    public static void setTrainingModeProperty(boolean trainingModeParam) {
        provideProperties()[1].setValue(trainingModeParam + "");
        distributeProperties();
        KiemPlugin.getDefault().updateViewAsync();
    }

    // -------------------------------------------------------------------------

    /**
     * Distribute properties.
     */
    private static void distributeProperties() {
        for (int c = 0; c < KiemPlugin.getDefault().getDataComponentWrapperList().size(); c++) {
            AbstractDataComponent component = KiemPlugin.getDefault().getDataComponentWrapperList()
                    .get(c).getDataComponent();
            if ((component instanceof InputDataComponent)
                    || (component instanceof OutputDataComponent)) {
                KiemPlugin.getDefault().getDataComponentWrapperList().get(c).setProperties(
                        ValidatorPlugin.provideProperties());
            }
        }
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static ValidatorPlugin getDefault() {
        return plugin;
    }

    // -------------------------------------------------------------------------

    /**
     * Provide properties.
     * 
     * @return the kiem property[]
     */
    public static KiemProperty[] provideProperties() {
        if (kiemProperties == null) {
            kiemProperties = new KiemProperty[2];
            kiemProperties[0] = new KiemProperty("SyncChart Editor", new KiemPropertyTypeEditor(),
                    "");
            kiemProperties[1] = new KiemProperty("Training Mode", false);
        }
        return kiemProperties;
    }

    // -------------------------------------------------------------------------

    public static DiagramEditor getInputEditor() {
        String kiemEditorProperty = ValidatorPlugin.getEditorProperty();
        // ValidatorPlugin.getProperties()[0].getValue();
        DiagramEditor diagramEditor = null;

        // get the active editor as a default case (if property is empty)
        IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage();
        IEditorPart editor = activePage.getActiveEditor();
        if (editor instanceof DiagramEditor) {
            diagramEditor = (DiagramEditor) editor;
        }

        // only check non-empty and valid property (this is optional)
        if (!kiemEditorProperty.equals("")) {
            if (getEditor(kiemEditorProperty) != null) {
                diagramEditor = getEditor(kiemEditorProperty);
            }
        }
        return diagramEditor;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the input model.
     * 
     * @return the input model
     */
    public static String getInputModel() {
        DiagramEditor diagramEditor = ValidatorPlugin.getInputEditor();
        // now extract the file
        View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
        EObject myModel = (EObject) notationElement.getElement();
        URI uri = myModel.eResource().getURI();

        return uri.toPlatformString(false);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the input model e object.
     * 
     * @param diagramEditor
     *            the diagram editor
     * @return the input model e object
     */
    public static EObject getInputModelEObject(DiagramEditor diagramEditor) {
        // now extract the file
        View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
        EObject myModel = (EObject) notationElement.getElement();

        return myModel;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the input resource set.
     * 
     * @return the input resource set
     */
    public static ResourceSet getInputResourceSet() {
        DiagramEditor diagramEditor = ValidatorPlugin.getInputEditor();
        // now extract the file
        View notationElement = ((View) diagramEditor.getDiagramEditPart().getModel());
        EObject myModel = (EObject) notationElement.getElement();
        // URI uri = myModel.eResource().getURI();
        return myModel.eResource().getResourceSet();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the editor.
     * 
     * @param kiemEditorProperty
     *            the kiem editor property
     * @return the editor
     */
    public static DiagramEditor getEditor(String kiemEditorProperty) {
        if ((ValidatorPlugin.getEditorProperty() == null)
                || (ValidatorPlugin.getEditorProperty().length() == 0)) {
            return null;
        }

        StringTokenizer tokenizer = new StringTokenizer(kiemEditorProperty, " ()");
        if (tokenizer.hasMoreTokens()) {
            String fileString = tokenizer.nextToken();
            String editorString = tokenizer.nextToken();

            IEditorReference[] editorRefs = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage().getEditorReferences();
            for (int i = 0; i < editorRefs.length; i++) {
                if (editorRefs[i].getId().equals(editorString)) {
                    IEditorPart editor = editorRefs[i].getEditor(true);
                    if (editor instanceof DiagramEditor) {
                        // test if correct file
                        if (fileString.equals(editor.getTitle())) {
                            return (DiagramEditor) editor;
                            // rootEditPart = ((DiagramEditor) editor)
                            // .getDiagramEditPart();
                            // break;
                        }
                    }
                }
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Open input file.
     * 
     * @param fileString
     *            the file string
     * @return the input stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static InputStream openInputFile(String fileString) throws IOException {
        fileString = new Path(fileString).toOSString();

        if (fileString.contains("bundleentry")) {
            String urlPath = fileString.replaceFirst("bundleentry:/", "bundleentry://");
            URL pathUrl = new URL(urlPath);
            URL url2 = FileLocator.resolve(pathUrl);
            return url2.openStream();
        } else {
            URI fileURI = URI.createPlatformResourceURI(fileString, true);
            // resolve relative workspace paths
            URIConverter uriConverter = new ExtensibleURIConverterImpl();
            return uriConverter.createInputStream(fileURI);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Open output file.
     * 
     * @param fileString
     *            the file string
     * @return the output stream
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static OutputStream openOutputFile(String fileString) throws IOException {
        fileString = new Path(fileString).toOSString();

        if (fileString.contains("bundleentry")) {
            return null;
        } else {
            URI fileURI = URI.createPlatformResourceURI(fileString, true);
            // resolve relative workspace paths
            URIConverter uriConverter = new ExtensibleURIConverterImpl();
            return uriConverter.createOutputStream(fileURI);
        }
    }

    public static OutputStream openOutputFileWithExtension(String extension) {
        // find appropriate name
        String modelFile = ValidatorPlugin.getInputModel();
        String modelFileBase = modelFile.substring(1, modelFile.lastIndexOf("."));
        String fileName = null;
        OutputStream file = null;

        int fileIndex = 1;
        while (true) {
            fileName = modelFileBase + fileIndex + extension;
            if (fileIndex == 1) {
                // this time without index
                fileName = modelFileBase + extension;
            }
            try {
                file = ValidatorPlugin.openOutputFile(fileName);
            } catch (Exception e) {
                // in case of an error file will be null
            }
            if (file != null) {
                break;
            }
            fileIndex++;
        }
        return file;
    }

    /**
     * Exists input file with extension.
     * 
     * @param extension
     *            the extension
     * @param fileIndex
     *            the file index
     * @return true, if successful
     */
    public static boolean existsInputFileWithExtension(String extension, int fileIndex) {
        boolean exists = false;
        InputStream stream = openInputFileWithExtension(extension, fileIndex);
        if (stream != null) {
            exists = true;
            try {
                stream.close();
            } catch (IOException e) {
                // ignore errors, we are just testing the file for existence and not
                // going to read or write
            }
        }
        return exists;
    }

    /**
     * Open input file with extension.
     * 
     * @param extension
     *            the extension
     * @param fileIndex
     *            the file index
     * @return the input stream
     */
    public static InputStream openInputFileWithExtension(String extension, int fileIndex) {
        // find appropriate name
        String modelFile = ValidatorPlugin.getInputModel();
        String modelFileBase = modelFile.substring(1, modelFile.lastIndexOf("."));
        String fileName = null;
        InputStream file = null;

        fileName = modelFileBase + fileIndex + extension;
        if (fileIndex == 1) {
            // this time without index
            fileName = modelFileBase + extension;
        }
        try {
            file = ValidatorPlugin.openInputFile(fileName);
        } catch (Exception e) {
            // in case of an error file will be null
        }
        return file;
    }

    /**
     * Sort.
     * 
     * @param jSONObject
     *            the j son object
     * @return the jSON object
     */
    public static JSONObject sort(JSONObject jSONObject) {
//        return jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> iterator = jSONObject.sortedKeys();
        while (iterator.hasNext()) {
            try {
                String key = iterator.next();
                Object val;
                val = jSONObject.get(key);
                if (val instanceof JSONObject) {
                    val = sort((JSONObject) val);
                }
                jSONObject2.accumulate(key, val);
            } catch (JSONException e) {
                // skip this
            }
        }
        return jSONObject2;
    }
}
