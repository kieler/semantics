package de.cau.cs.kieler.xkev.ui;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.Messages;
import de.cau.cs.kieler.xkev.helpers.Tools;
import de.cau.cs.kieler.xkev.views.EnvironmentView;


public class OpenImageWizard extends Wizard {

	/** The actual wizard page that will be shown. */
	OpenImageWizardPage page;
	/** A map of predefined images (Names) to their URLs. This map will be generated from extensions */
	Map<String,URL> imageUrlMap;
    /** Text field for the file url */
	Text resourceNameField;
	/** Checkbox to remember the file */
	Button rememberCheckbox;
	/** Parent dialog to have access to window controls, e.g. closing the dialog (by double click in List for example */ 
	WizardDialog dialog;
	
	
	public final static String IMAGE_EXTENSION_POINT_ID = "de.cau.cs.kieler.kev.image";
	public final static String DEFAULT_IMAGE = "image";
	public final static String LOAD_STARTUP = "load_startup";
	
	public OpenImageWizard() {
		page = new OpenImageWizardPage("Open Image");
		this.addPage(page);
	}
	
	@Override
	public boolean performFinish() {
		// search for the KEV view	
		IViewReference[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences();
		boolean viewFlag = false;
		for (int i = 0; i < views.length; i++) {
			IViewPart view = views[i].getView(false);
			try{
				if (view != null && view.getViewSite().getId().equals(EnvironmentView.ID)) {
				viewFlag = true;
				if (resourceNameField.getText().isEmpty()) {
					page.setErrorMessage("The textfield must not be empty");
					return false;
				}
				// now try to load the selected image resource
				URL url;
				try {
					url = new URL(resourceNameField.getText());
					File f = new File(url.toURI().getPath());
					if (!f.isFile()) {
						page.setErrorMessage("Please enter a valid svg file");
						return false;
					}
					((EnvironmentView)view).getComposite().setSVGFile(url);
					savePreferences();
					return true;
				} catch (MalformedURLException e) {
					page.setErrorMessage("The selected file URL is not valid: "+e.getMessage());
				}}
			} catch (Exception e) {/*nothing, something wrong with actual view, so proceed with loop */}
		}
		//Print error only if KEV view couldn't be found
		if (!viewFlag) page.setErrorMessage("Could not find KEV view...");
		return false;
	}
	
	/**
	 * Calls performFinish and tries to close the dialog, if it was set before.
	 * @see performFinish()
	 * @see setParentDialog(WizardDialog parentDialog)
	 */
	public void finishAndDispose(){
		if(performFinish() == true && this.dialog != null){
			this.dialog.close();
		}
	}
	
	public void setParentDialog(WizardDialog parentDialog){
		this.dialog = parentDialog;
	}

	private void savePreferences(){
		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		preferenceStore.setValue(OpenImageWizard.DEFAULT_IMAGE, resourceNameField.getText());
		preferenceStore.setValue(LOAD_STARTUP, rememberCheckbox.getSelection());
	}
	
	private class OpenImageWizardPage extends WizardPage implements SelectionListener, MouseListener{
		protected OpenImageWizardPage(String pageName) {
			super(pageName);
			this.setDescription(Messages.DiscriptionOpenImageWizard);
			//this.setErrorMessage("ErrorMessage");
			this.setImageDescriptor(Activator.getDefault().getImageDescriptor("icons/svg-logo.png"));
			this.setMessage(Messages.MessageOpenImageWizard);
			this.setTitle(Messages.TitleOpenImageWizard);
		}
		public void createControl(Composite parent) {
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
			List imagesList = new List(composite, SWT.BORDER | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
			imagesList.setLayoutData(data1);
			imageUrlMap = getImageURLs();
			for (String imageName : imageUrlMap.keySet()) {
				imagesList.add(imageName);				
			}
			imagesList.addSelectionListener(this);
			imagesList.addMouseListener(this);

			// create File text field
			Composite resourceComposite = new Composite(composite, SWT.BORDER);
			GridData resourceData = new GridData(GridData.FILL_BOTH);
			resourceComposite.setLayoutData(resourceData);
			Layout resourceLayout = new GridLayout(3,false);
			resourceComposite.setLayout(resourceLayout);
			
			Label resourceLabel = new Label(resourceComposite, SWT.NONE);
			resourceLabel.setText("File URL:");
			
			resourceNameField = new Text(resourceComposite, SWT.SINGLE | SWT.BORDER);
			System.out.println("size "+resourceNameField.getSize()+resourceNameField.computeSize(SWT.DEFAULT, SWT.DEFAULT));
			GridData data2 = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
			resourceNameField.setLayoutData(data2);
			// write last loaded filename
			IPreferenceStore preferences = Activator.getDefault().getPreferenceStore();
			String last = preferences.getString(DEFAULT_IMAGE);
			if(last != null && !last.trim().equals(""))
				resourceNameField.setText(last);
			
			Button resourceButton = new Button(resourceComposite, SWT.NONE);
			resourceButton.setText("Browse...");
			resourceButton.addSelectionListener(this);
			
			// create checkbox
			Composite checkboxComposite = new Composite(composite, SWT.NONE);
			GridData checkboxData = new GridData(GridData.FILL_BOTH);
			checkboxComposite.setLayoutData(checkboxData);
			Layout checkboxLayout = new GridLayout(2,false);
			checkboxComposite.setLayout(checkboxLayout);
			
			Label checkboxLabel = new Label(checkboxComposite, SWT.NONE);
			checkboxLabel.setText(Messages.CheckboxRememberLastFile);
			rememberCheckbox = new Button(checkboxComposite, SWT.CHECK);
			
			// guess the last state of the checkbox
			if(preferences.getBoolean(LOAD_STARTUP) == true){
				rememberCheckbox.setSelection(true);
			}
			
			this.setControl(composite);
		}
		
		private Map<String,URL> getImageURLs(){
			Map<String,URL> images = new HashMap<String,URL>();
			IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(IMAGE_EXTENSION_POINT_ID);
			for (int i = 0; i < configElements.length; i++) {
				try{
					Bundle bundle = Platform.getBundle(configElements[i].getContributor().getName());
					Path path = new Path(configElements[i].getAttribute("filename"));
					URL url = FileLocator.find(bundle, path, Collections.EMPTY_MAP);
					String name = configElements[i].getAttribute("name");
					System.out.println("path:"+path+" url:"+url+" name:"+name);
					if(name == null || name.trim().equals(""))
						name = url.getFile();
					int suffix = 2; // make sure there are no doubles
					while(images.containsKey(name)){
						name = name + " " + suffix;
						suffix++;
					}
					images.put(name, url);
				}catch(Exception e){
					Tools.showDialog(e);
				}
			}
			return images;
		}
		
		public URL openFileDialog(){
			FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			String[] extensions = {"*.svg"};
			dialog.setFilterExtensions(extensions);
			dialog.open();
			String path = dialog.getFilterPath()+File.separator+dialog.getFileName();
			if(path != null && !path.trim().equals("")){
				try {
					File file = new File(path);
					URL url = file.toURI().toURL();
					return url;
				} catch (MalformedURLException e) {
					Tools.showDialog("Invalid file: "+path, e);
				}
			}
			return null;
		}
		
		boolean init = true;
		/**
		 * Handles selection changes in the image List widget. If a different
		 * item is selected, the corresponding URL is automatically inserted
		 * into the resource file text field.
		 */
		public void widgetSelected(SelectionEvent e) {
			if (e.getSource() instanceof List){ // Item in List was selected
				List list = (List)e.getSource();
				// bad trick to avoid a default selection of item 0 at the beginning
				if (init) {
					init = false;
					list.deselectAll();
					return;
				}
				for (int i = 0; i < list.getSelection().length; i++) {
					URL url = imageUrlMap.get(list.getSelection()[i]);
					String URLstring = url.toString();
					// only one selected element makes sense
					if(i == 0){
						resourceNameField.setText(URLstring);
					}
				}	
			}else
			if (e.getSource() instanceof Button){ // Browse Button was pressed
				System.out.println("Button: "+e);
				URL url = openFileDialog();
				if(url != null){
					resourceNameField.setText(url.toString());
				}
			}
		}
		public void widgetDefaultSelected(SelectionEvent e) {/*nothing*/}
		public void mouseDoubleClick(MouseEvent e) {
			finishAndDispose();
		}
		public void mouseDown(MouseEvent e) {/*nothing*/}
		public void mouseUp(MouseEvent e) {/*nothing*/}
		
	}
	
}
