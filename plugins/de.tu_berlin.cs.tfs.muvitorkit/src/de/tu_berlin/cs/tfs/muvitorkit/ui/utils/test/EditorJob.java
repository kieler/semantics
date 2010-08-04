package de.tu_berlin.cs.tfs.muvitorkit.ui.utils.test;

import org.eclipse.core.runtime.jobs.Job;

/**
 * TODO EditorJob: documentation and purpose description
 * 
 * @author Tony Modica
 * 
 */
// OPT Test UIJob for appropriate use
public abstract class EditorJob extends Job {

	final private static String FAMILY = "EditorJobFamily";

	public EditorJob(final String name) {
		super(name);
		setPriority(BUILD);
	}

	@Override
	public boolean belongsTo(final Object family) {
		return family == FAMILY;
	}

	static public void wakeUpAll() {
		Job.getJobManager().wakeUp(FAMILY);
	}

	static public void sleepAll() {
		Job.getJobManager().sleep(FAMILY);
	}

	static public void cancelAll() {
		Job.getJobManager().cancel(FAMILY);
	}

	static public void scheduleAll() {
		for (final Job job : Job.getJobManager().find(FAMILY)) {
			job.schedule();
		}
	}

}
