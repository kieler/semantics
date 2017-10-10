
// ============================================================================ 
// ==     Model Railway Sample Controller JAVA    == (c) C.Motika, Aug 2007  ==
// ============================================================================
 
 /*! \file SampleController.java
 
  This is a simple test controller that uses the railwayInterfacePackage
  that defines the RailwayInterface class. This connects to the interface 
  program that includes the simulation. The GUI (ModelGUI) is used to control
  the simulation steps by means of starting, pausing, stopping and defining 
  the simulation speed (delay). 
 
  This simple controller sets an initial train on IC_ST_1 then restarts the
  simulation at tick 0. Now all tracks are set to primary motormode with a
  speed of 40 while all signals show a green light.
  The train then moves on wihin the Inner Circle until the second contact on
  IC_LN_5 is passed. This triggeres the switch point 20 to be set to turn.
  When the train passes the first contact of IC_ST_1 the speed is reduced to
  5 and all signals are set to red. After reaching the second contact the
  train is stopped and all track segements are shut down. Here the controller
  ends and closes its connection to the interface program.

 */
 
// ============================================================================ 

import railwayInterfacePackage.*;

public class SampleController {

	public static void main(String[] args) {
       RailwayInterface RI;

	   try {
  		   RI = new RailwayInterface("localhost", 2020);
		   
		   //reset simulation and set initial trains
		   //then restart the simulation
		   System.out.println("STARTING.");
		   //RI.ResetSimulation();
		   //RI.SetInitialTrain(RI.IC_ST_1,false);
		   //RI.RestartSimulation();

		   //set some points
		   RI.SetPoint(17, RI.POINT_TURN);
		   RI.SetPoint(16, RI.POINT_TURN);
		   RI.SetPoint(0, RI.POINT_TURN);
		   RI.SetPoint(9, RI.POINT_TURN);
		   RI.SetPoint(1, RI.POINT_TURN);

		   //set track speed to 40 an all tracks w/ primary driving direction
		   RI.SetTrack(RI.ALL_TRACKS, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetSignal(RI.ALL_TRACKS, RI.ALL_SIGNALS, RI.SIGNAL_GREEN);
  
		   //wait unil second contact on IC_LN_5 is triggered 
		   while ((RI.GetContact(RI.IC_LN_5, 1, true) == 0)
			       &&(RI.RailwayAlive()));
		   while (RI.GetContact(RI.IC_LN_5, 1, true) == 0);
		   System.out.println("Cycle IC_LN_5 B:"+RI.GetSimulationTick());
		   
		   //set switch point 20 to turn
		   System.out.println("SET SWITCH POINT 20 TO TURN.");
		   RI.SetPoint(20, RI.POINT_TURN);
		   
		   //wait until enigne reaches first contact of IC_ST_3
		   while ((RI.GetContact(RI.IC_ST_3, 0, true) == 0)
			       &&(RI.RailwayAlive()));
		   System.out.println("Cycle IC_ST_3 A:"+RI.GetSimulationTick());
		   
		   //reduce speed now
		   System.out.println("REDUCE SPEED.");
		   RI.SetSignal(RI.ALL_TRACKS, RI.ALL_SIGNALS, RI.SIGNAL_RED);
		   RI.SetTrack(RI.ALL_TRACKS, RI.MOTORMODE_PRIMARY, 5);
		   
		   //wait until engine reaches second contact of IC_ST_3
		   while ((RI.GetContact(RI.IC_ST_3, 1, true) == 0)
			       &&(RI.RailwayAlive()));
		   System.out.println("Cycle IC_ST_3 B:"+RI.GetSimulationTick());
   	   
		   //stop the train and turn of all tracks
		   System.out.println("STOPPING.");
		   RI.SetTrack(RI.ALL_TRACKS, RI.MOTORMODE_OFF, 0);

		   //done
		   System.out.println("FINISHED.");

   } catch (Exception e) {
	   System.out.println("\nNO CONNECTION TO INTERFACE PROGRAM!");
   }
}
}
