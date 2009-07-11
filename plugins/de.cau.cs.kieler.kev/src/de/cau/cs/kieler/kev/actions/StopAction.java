package de.cau.cs.kieler.kev.actions;

import org.eclipse.jface.action.Action;

import de.cau.cs.kieler.kev.animation.AnimationManager;


public class StopAction extends Action {
	
	public StopAction() {
		this.setText("Stop");
		this.setToolTipText("Stop animation run");
		this.setImageDescriptor(de.cau.cs.kieler.kev.KevPlugin.getImageDescriptor("icons/media-playback-stop-32.png"));
	}
	
	@Override
	public void run() {
		AnimationManager.getInstance().stop();
	}
}
