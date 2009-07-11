package de.cau.cs.kieler.kev.animation;

import java.util.EventListener;


public abstract interface SimulationListener extends EventListener {

	public abstract void simulationStepped(SimulationEvent evt);
	public abstract void simulationStarted(SimulationEvent evt);
	public abstract void simulationStopped(SimulationEvent evt);

}
