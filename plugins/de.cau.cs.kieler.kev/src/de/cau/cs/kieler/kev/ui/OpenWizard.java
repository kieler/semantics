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

package de.cau.cs.kieler.kev.ui;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import org.osgi.framework.Bundle;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.Messages;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;

/**
 * 
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 */
public class OpenWizard extends Wizard {

    /** The actual wizard page that will be shown. */
    private OpenImageWizardPage page;

    /**
     * A map of predefined images (Names) to their URLs. This map will be generated from extensions.
     * It is used for a sorted list of images
     */
    private TreeMap<String, String> imageTreeMap;

    /** Text field for the file url. */
    private Text resourceNameField;

    /** The load at startup checkbox. */
    private Button checkBox;

    /** The actual bundleentry path to the "examples" folder. */
    private String examplePath;

    /**
     * Parent dialog to have access to window controls, e.g. closing the dialog (by double click) in
     * list for example.
     */
    private WizardDialog dialog;

    /** Name of extension point for images. */
    public static final String IMAGE_EXTENSION_POINT_ID = "de.cau.cs.kieler.kev.image";
    /** Entry in preference store for saving the default image. */
    public static final String DEFAULT_IMAGE = "image";
    /** Entry in preference store for saving the load at startup flag. */
    public static final String LOAD_STARTUP = "load_startup";

    /**
     * Opens a mapping file and its corresponding SVG image.
     */
    public OpenWizard() {
        page = new OpenImageWizardPage("Open Image");
        this.addPage(page);
    }

    @Override
    public boolean performFinish() {
        // search for the KEV view
        if (resourceNameField.getText().equals("")) {
            page.setErrorMessage("The textfield must not be empty");
            return false;
        }
        if (!resourceNameField.getText().contains(".mapping")) {
            page.setErrorMessage("Please enter a valid mapping file (*.mapping).");
            return false;
        }
        try {
            // Set the ExecutionManager view active, for initialization
            Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage()
                    .showView("de.cau.cs.kieler.sim.kiem.view");
        } catch (PartInitException e) {
            Activator
                    .reportErrorMessage("Kiem view (ID: de.cau.cs.kieler.sim.kiem.view) "
                    + "can't be initialized!");
        }
        if (resourceNameField.getText().contains("bundleentry://")) {
            // Load the SVG file from bundle resources specified in the mapping file
            String filename = resourceNameField.getText().substring(
                    resourceNameField.getText().lastIndexOf("/") + 1);
            MapAnimations.getInstance().initializeMappingFile(filename, true);
        } else {
            // Load the SVG file from filesystem
            MapAnimations.getInstance().initializeMappingFile(resourceNameField.getText(), false);
        }
        
        savePreferences();
        return true;
    }

    /**
     * Calls performFinish and tries to close the dialog, if it was set before.
     * 
     * @see performFinish()
     * @see setParentDialog(WizardDialog parentDialog)
     */
    public void finishAndDispose() {
        if (performFinish() && this.dialog != null) {
            this.dialog.close();
        }
    }
    /** The parent dialog.
     *   
     */
    public void setParentDialog(final WizardDialog parentDialog) {
        this.dialog = parentDialog;
    }

    private void savePreferences() {
        String path = resourceNameField.getText();
        // If the actual image is an example image from bundle path, we have to save only the
        // filename
        if (path.contains("bundleentry")) {
            while (path.contains("/")) {
                path = path.substring(path.indexOf("/") + 1);
            }
        } // otherwise we save the whole path and file

        IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
        preferenceStore.setValue(OpenWizard.DEFAULT_IMAGE, path);
        preferenceStore.setValue(OpenWizard.LOAD_STARTUP, checkBox.getSelection());
    }

    private class OpenImageWizardPage extends WizardPage implements SelectionListener,
            MouseListener {
        protected OpenImageWizardPage(final String pageName) {
            super(pageName);
            this.setDescription(Messages.DiscriptionOpenImageWizard);
            // this.setErrorMessage("ErrorMessage");
            this
                    .setImageDescriptor(Activator.getDefault().getImageDescriptor(
                            "icons/svg-logo.png"));
            this.setMessage(Messages.MessageOpenImageWizard);
            this.setTitle(Messages.TitleOpenImageWizard);
        }

        public void createControl(final Composite parent) {
            Composite composite = new Composite(parent, SWT.NONE);

            // create layout manager
            GridLayout layout = new GridLayout(1, false);
            layout.marginLeft = 5;
            layout.marginRight = 5;
            layout.marginTop = 5;
            layout.marginBottom = 5;
            layout.verticalSpacing = 10;
            composite.setLayout(layout);

            Label label = new Label(composite, SWT.NONE);
            label.setText("Predefined Example Images");

            // create available images list
            GridData data1 = new GridData(GridData.FILL_BOTH);
            List imagesList = new List(composite, SWT.BORDER | SWT.SINGLE | SWT.H_SCROLL
                    | SWT.V_SCROLL);
            imagesList.setLayoutData(data1);

            checkBox = new Button(composite, SWT.CHECK);
            checkBox.setText("Load default image at startup");

            // Create a new treemap for a sorted list of mapping files
            imageTreeMap = new TreeMap<String, String>();

            // Load images from Plugin "examples" Folder
            Bundle b = Platform.getBundle(Activator.PLUGIN_ID);

            // Set the current bundle path
            if (b.getEntry("examples") != null) {
                examplePath = b.getEntry("examples").toString();
            }

            Enumeration<URL> e = b.findEntries("examples", "*.mapping", false);
            while (e.hasMoreElements()) {
                URL url = (URL) e.nextElement();
                String fileName = url.getPath();
                while (fileName.contains("/")) {
                    fileName = fileName.substring(fileName.indexOf("/") + 1);
                }
                // TreeMap contains two identical strings. It's only used for sorting.
                imageTreeMap.put(fileName, fileName);
            }

            for (String imageName : imageTreeMap.keySet()) {
                imagesList.add(imageName);
            }

            imagesList.addSelectionListener(this);
            imagesList.addMouseListener(this);

            // create File text field
            Composite resourceComposite = new Composite(composite, SWT.BORDER);
            GridData resourceData = new GridData(GridData.FILL_BOTH);
            resourceComposite.setLayoutData(resourceData);
            Layout resourceLayout = new GridLayout(3, false);
            resourceComposite.setLayout(resourceLayout);

            Label resourceLabel = new Label(resourceComposite, SWT.NONE);
            resourceLabel.setText("File URL:");

            resourceNameField = new Text(resourceComposite, SWT.SINGLE | SWT.BORDER);
            System.out.println("size " + resourceNameField.getSize()
                    + resourceNameField.computeSize(SWT.DEFAULT, SWT.DEFAULT));
            GridData data2 = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
            resourceNameField.setLayoutData(data2);
            // write last loaded filename
            IPreferenceStore preferences = Activator.getDefault().getPreferenceStore();
            String last = preferences.getString(DEFAULT_IMAGE);
            if (last != null && !last.trim().equals("")) {
                if (!last.contains("/")) { // It must be an bundleentry
                    resourceNameField.setText(examplePath + last);
                } else { // It must be a file which is located on disk
                    resourceNameField.setText(last);
                }
            }
            checkBox.setSelection(preferences.getBoolean(LOAD_STARTUP));

            Button resourceButton = new Button(resourceComposite, SWT.NONE);
            resourceButton.setText("Browse...");
            resourceButton.addSelectionListener(this);

            // create checkbox
            Composite checkboxComposite = new Composite(composite, SWT.NONE);
            GridData checkboxData = new GridData(GridData.FILL_BOTH);
            checkboxComposite.setLayoutData(checkboxData);
            Layout checkboxLayout = new GridLayout(2, false);
            checkboxComposite.setLayout(checkboxLayout);

            this.setControl(composite);
        }

        // Might be used in the future
        @SuppressWarnings("unused")
        private Map<String, URL> getImageURLs() {
            Map<String, URL> images = new HashMap<String, URL>();
            IConfigurationElement[] configElements = Platform.getExtensionRegistry()
                    .getConfigurationElementsFor(IMAGE_EXTENSION_POINT_ID);
            for (int i = 0; i < configElements.length; i++) {
                try {
                    Bundle bundle = Platform
                            .getBundle(configElements[i].getContributor().getName());
                    Path path = new Path(configElements[i].getAttribute("filename"));
                    URL url = FileLocator.find(bundle, path, Collections.EMPTY_MAP);
                    String name = configElements[i].getAttribute("name");
                    System.out.println("path:" + path + " url:" + url + " name:" + name);
                    if (name == null || name.trim().equals("")) {
                        name = url.getFile();
                    }
                    int suffix = 2; // make sure there are no doubles

                    while (images.containsKey(name)) {
                        name = name + " " + suffix;
                        suffix++;
                    }
                    images.put(name, url);
                } catch (Exception e) {
                    Activator.reportErrorMessage("Exception", e);
                }
            }
            return images;
        }

        public URL openFileDialog() {
            FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getShell());
            String[] extensions = { "*.mapping" };
            dialog.setFilterExtensions(extensions);
            dialog.open();
            String path = dialog.getFilterPath() + File.separator + dialog.getFileName();
            if (path != null && !path.trim().equals("")) {
                try {
                    File file = new File(path);
                    URL url = file.toURI().toURL();
                    return url;
                } catch (MalformedURLException e) {
                    Activator.reportErrorMessage("Invalid file: " + path, e);
                }
            }
            return null;
        }

        /**
         * Handles selection changes in the image List widget. If a different item is selected, the
         * corresponding URL is automatically inserted into the resource file text field.
         */
        public void widgetSelected(final SelectionEvent e) {
            if (e.getSource() instanceof List) { // Item in List was selected
                List list = (List) e.getSource();

                for (int i = 0; i < list.getSelection().length; i++) {
                    String imageName = imageTreeMap.get(list.getSelection()[i]);
                    // only one selected element makes sense
                    if (i == 0) {
                        resourceNameField.setText(examplePath + imageName);
                    }
                }
            } else if (e.getSource() instanceof Button) { // Browse Button was pressed
                System.out.println("Button: " + e);
                URL url = openFileDialog();
                if (url != null) {
                    resourceNameField.setText(url.toString());
                }
            }
        }

        public void widgetDefaultSelected(final SelectionEvent e) { /* nothing */
        }

        public void mouseDoubleClick(final MouseEvent e) {
            finishAndDispose();
        }

        public void mouseDown(final MouseEvent e) { /* nothing */
        }

        public void mouseUp(final MouseEvent e) { /* nothing */
        }

    }

}
