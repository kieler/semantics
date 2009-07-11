package de.cau.cs.kieler.kev.animation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class AnimationJob extends Job {

	int delay;
	
	public AnimationJob() {
		super("KEV Animation Job");
		this.delay = 0;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		System.out.println("Doing some animation");
		this.schedule(delay);	
		return Status.OK_STATUS;
	}
	
	public void setDelay(int delay){
		this.delay = delay;
	}

}
