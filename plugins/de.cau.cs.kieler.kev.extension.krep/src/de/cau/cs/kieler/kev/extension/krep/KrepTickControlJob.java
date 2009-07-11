package de.cau.cs.kieler.kev.extension.krep;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;



public class KrepTickControlJob extends Job {

	KrepTickManager tickManager;
	boolean paused = false;
	int delay = 0;
	long time;
	
	public KrepTickControlJob(String name, KrepTickManager tickManager) {
		super(name);
		this.tickManager = tickManager;
		time = System.currentTimeMillis();
	}
	
	public void setDelay(int delay){
		this.delay = delay;
	}
	
	public void setPaused(boolean isPaused){
		paused = isPaused;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		System.out.println("tick");
		tickManager.triggerTick();
		
		long passedTime = System.currentTimeMillis() - time;
		time = System.currentTimeMillis();
		long currentDelay = delay;
		if(passedTime > delay)
			currentDelay = 0;
		else
			currentDelay = delay - passedTime;
		
		if(paused == false)
			this.schedule(currentDelay);	
		return Status.OK_STATUS;
	}

}
