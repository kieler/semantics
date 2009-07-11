package de.cau.cs.kieler.kev.actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

import de.cau.cs.kieler.kev.animation.AnimationManager;


public class StartAction extends Action {

	public StartAction() {
		this.setText("Start");
		this.setToolTipText("Start animation run");
		this.setImageDescriptor(de.cau.cs.kieler.kev.KevPlugin.getImageDescriptor("icons/media-playback-start-32.png"));
	}
	
	@Override
	public void run() {
		AnimationManager.getInstance().start();
	}
	
}
