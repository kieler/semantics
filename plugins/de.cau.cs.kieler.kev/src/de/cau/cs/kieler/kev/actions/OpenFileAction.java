package de.cau.cs.kieler.kev.actions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.kev.helpers.Tools;
import de.cau.cs.kieler.kev.views.EnvironmentView;


public class OpenFileAction extends Action {

	public OpenFileAction() {
		this.setText("Open");
		this.setToolTipText("Open SVG File");
		this.setImageDescriptor(de.cau.cs.kieler.kev.KevPlugin.getImageDescriptor("icons/open.gif"));
	}
	//~/shared/kieler/trunk/kev/de.cau.cs.kieler.kev/examples/elevator.svg
	@Override
	public void run() {
		System.out.println("Open File");
		// find the KEV view
		IViewReference[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences();
		for (int i = 0; i < views.length; i++) {
			IViewPart view = views[i].getView(false);
			if(view.getViewSite().getId().equals(EnvironmentView.ID)){
				FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
				String[] extensions = {"*.svg"};
				dialog.setFilterExtensions(extensions);
				dialog.open();
				String path = dialog.getFilterPath()+File.separator+dialog.getFileName();
				if(path != null && !path.trim().equals("") && !path.equals("/")){
					try {
						File file = new File(path);
						URL url = file.toURI().toURL();
						((EnvironmentView)view).getComposite().setSVGFile(url);
					} catch (MalformedURLException e) {
						Tools.showDialog("Invalid file: "+path, e);
					}
				}
				return;
			}
		}
		Tools.showDialog("Error opening file dialog for KEV: No EnvironmentView found");
	}
}
