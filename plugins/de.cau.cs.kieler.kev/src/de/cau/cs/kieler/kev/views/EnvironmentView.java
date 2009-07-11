package de.cau.cs.kieler.kev.views;


import java.net.MalformedURLException;
import java.net.URL;

import org.apache.batik.swing.JSVGCanvas;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

import de.cau.cs.kieler.kev.KevPlugin;
import de.cau.cs.kieler.kev.Messages;
import de.cau.cs.kieler.kev.actions.DelayTextField;
import de.cau.cs.kieler.kev.actions.OpenFileAction;
import de.cau.cs.kieler.kev.actions.OpenImageWizardAction;
import de.cau.cs.kieler.kev.actions.StartAction;
import de.cau.cs.kieler.kev.actions.StepAction;
import de.cau.cs.kieler.kev.actions.StopAction;
import de.cau.cs.kieler.kev.animation.AnimationManager;
import de.cau.cs.kieler.kev.helpers.Tools;
import de.cau.cs.kieler.kev.ui.OpenImageWizard;


public class EnvironmentView extends ViewPart {
	
	private Action openWizardAction;
	private Action openAction;
	private Action refreshAction;
	private Action startAction;
	private Action stopAction;
	private Action stepAction;
	private ControlContribution delayTextField;
		
	private EnvironmentComposite svg;
	private AnimationManager animationManager;
	
	public static final String ID = "de.cau.cs.kieler.kev.views.EnvironmentView";
	
	/**
	 * The constructor.
	 */
	public EnvironmentView() {
	}
	
	/**
	 * This is a callback that will allow us to create the viewer and
	 * initialize it.
	 */
	public void createPartControl(Composite parent) {		
		parent.setLayout(new FillLayout());
				
		svg = new EnvironmentComposite(parent,SWT.NONE,false);
		animationManager = new AnimationManager(this);
		getViewSite().getPage().addSelectionListener(svg);
		//getViewSite().getPage().addSelectionListener(animationManager);
		// listen to the event that rendering was finished
		svg.getSvgCanvas().addGVTTreeRendererListener(animationManager);
		
		parent.layout();
		makeActions();
		contributeToActionBars();
		
		// load default image if available
		IPreferenceStore preferenceStore = KevPlugin.getDefault().getPreferenceStore();
		String defaultFile = preferenceStore.getString(OpenImageWizard.DEFAULT_IMAGE);
		boolean load = preferenceStore.getBoolean(OpenImageWizard.LOAD_STARTUP);
		if(     (defaultFile != null) && 
		        ( !defaultFile.trim().equals("") ) && 
		        load)
			try {
				svg.setSVGFile(new URL(defaultFile));
			} catch (MalformedURLException e) {
				Tools.showDialog("Could not load default image file: ", e);
			}
	}

/*	
	private void setStatusText(String txt) {
		setStatusText(txt,false);
	}
	
	private void setStatusText(String txt, boolean error) {
		Display d = Display.getDefault();
		if (d != null) {
			final String status = txt;
			final boolean ferror = error;
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IActionBars actionBars = getViewSite().getActionBars();
					if (actionBars != null) {
						IStatusLineManager statusLineManager = actionBars.getStatusLineManager();
						if (statusLineManager != null) {
							if (ferror) {
								statusLineManager.setErrorMessage(BatikUIPlugin.getDefault().getImage(BatikUIPlugin.IMG_BATIK_16),status);
							} else {
								statusLineManager.setMessage(status);
							}
						}
					}
				}
			});
		}
	}
*/

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(openWizardAction);
		manager.add(openAction);
		manager.add(refreshAction);
		manager.add(startAction);
		manager.add(stopAction);
		manager.add(stepAction);
				
//		manager.add(printAction);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(openWizardAction);
		manager.add(openAction);
		manager.add(refreshAction);
		manager.add(startAction);
		manager.add(stopAction);
		manager.add(stepAction);
		manager.add(delayTextField);
		
//		manager.add(printAction);
	}

	private void makeActions() {
		refreshAction = new Action() {
			public void run() {
				svg.paintSVGFile();
			}
		};
		refreshAction.setText(Messages.Refresh);
		refreshAction.setToolTipText(Messages.ReloadSVGImage);
		refreshAction.setImageDescriptor(KevPlugin.getDefault().getImageDescriptor("icons/refresh.gif"));

		openWizardAction = new OpenImageWizardAction();
		openAction = new OpenFileAction();
		startAction = new StartAction();
		stopAction = new StopAction();
		stepAction = new StepAction();
		delayTextField = new DelayTextField();
		
//		printAction = new PrintAction(svg);
//		printAction.setImageDescriptor(BatikUIPlugin.getDefault().getImageDescriptor(BatikUIPlugin.IMG_PRINT));
	}

	public void setFocus() {
		svg.setFocus();
	}

	public void dispose() {
		getViewSite().getPage().removeSelectionListener(svg);
		svg.dispose();
		super.dispose();
	}
	
	public EnvironmentComposite getComposite(){
		return svg;
	}
	
	public JSVGCanvas getSVGCanvas(){
		return svg.getSvgCanvas();
	}
		
}