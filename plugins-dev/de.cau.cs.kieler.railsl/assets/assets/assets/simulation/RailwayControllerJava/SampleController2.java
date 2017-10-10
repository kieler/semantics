
// ============================================================================ 
// ==     Model Railway Sample Controller JAVA    == (c) C.Motika, Aug 2007  ==
// ============================================================================
 
 /*! \file SampleController2.java
 
  This is a simple test controller that uses the railwayInterfacePackage
  that defines the RailwayInterface class. This connects to the interface 
  program that includes the simulation. The GUI (ModelGUI) is used to control
  the simulation steps by means of starting, pausing, stopping and defining 
  the simulation speed (delay). 
 
  This is a second simple controller that controls a train initially 
  placed on track IC_ST_1.

 */
 
// ============================================================================ 

import railwayInterfacePackage.*;

public class SampleController2 {

	public static void main(String[] args) {
       RailwayInterface RI;

	   try {
  		   RI = new RailwayInterface("127.0.0.1", 2020);
		   
		   //reset simulation and set initial trains
		   //then restart the simulation
		   System.out.println("STARTING.");
		   //RI.ResetSimulation();
		   //RI.SetInitialTrain(RI.IC_ST_1,false);
		   //RI.RestartSimulation();

		   //set track speed to 40 an all tracks w/ primary driving direction
		   RI.SetTrack(RI.IC_ST_1, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetTrack(RI.IC_ST_4, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetTrack(RI.IC_LN_0, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetTrack(RI.IC_LN_1, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetTrack(RI.IC_LN_2, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetTrack(RI.IC_LN_3, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetTrack(RI.IC_LN_4, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetTrack(RI.IC_JCT_0, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetTrack(RI.IC_LN_5, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetTrack(RI.IC_ST_0, RI.MOTORMODE_PRIMARY, 40);
		   RI.SetSignal(RI.IC_ST_1, RI.ALL_SIGNALS, RI.SIGNAL_GREEN);
		   RI.SetSignal(RI.IC_LN_0, RI.ALL_SIGNALS, RI.SIGNAL_GREEN);
		   RI.SetSignal(RI.IC_LN_1, RI.ALL_SIGNALS, RI.SIGNAL_GREEN);
		   RI.SetSignal(RI.IC_LN_2, RI.ALL_SIGNALS, RI.SIGNAL_GREEN);
		   RI.SetSignal(RI.IC_LN_3, RI.ALL_SIGNALS, RI.SIGNAL_GREEN);
		   RI.SetSignal(RI.IC_LN_4, RI.ALL_SIGNALS, RI.SIGNAL_GREEN);

  		   //wait unil first contact on IC_LN_5 is triggered 
		   RI.GetContact(RI.IC_LN_5, 0, true);
		   while ((RI.GetContact(RI.IC_LN_5, 0, true) == 0)
			       &&(RI.RailwayAlive()));
		   System.out.println("Cycle IC_LN_5 A:"+RI.GetSimulationTick());

		   //reduce speed now
		   System.out.println("REDUCING SPEED");
		   RI.SetSignal(RI.IC_LN_5, RI.ALL_SIGNALS, RI.SIGNAL_RED);
		   RI.SetTrack(RI.IC_LN_5, RI.MOTORMODE_PRIMARY, 5);

		   //wait unil second contact on IC_LN_5 is triggered 
		   RI.GetContact(RI.IC_LN_5, 1, true);
		   while ((RI.GetContact(RI.IC_LN_5, 1, true) == 0)
			       &&(RI.RailwayAlive()));
		   System.out.println("Cycle IC_LN_5 B:"+RI.GetSimulationTick());

		   //stop the train
		   System.out.println("STOPPING TRAIN");
		   RI.SetTrack(RI.IC_LN_5, RI.MOTORMODE_BRAKE, 0);

		   //wait 5 seconds
 		   try{Thread.sleep(5000);}catch(Exception e){}
		   System.out.println("CONTINUING TRAIN");

		   //set signal IC_ST_5 to green, IC_ST_1 to red
		   System.out.println("SET SEIGNAL IC_LN_5 TO GREEN.");
		   RI.SetSignal(RI.IC_LN_5, RI.ALL_SIGNALS, RI.SIGNAL_GREEN);
		   RI.SetSignal(RI.IC_ST_1, RI.ALL_SIGNALS, RI.SIGNAL_RED);

           //full speed again
		   RI.SetTrack(RI.IC_LN_5, RI.MOTORMODE_PRIMARY, 40);
   
		   //wait until enigne reaches first contact of IC_ST_1
		   RI.GetContact(RI.IC_ST_1, 0, true);
		   while ((RI.GetContact(RI.IC_ST_1, 0, true) == 0)
			       &&(RI.RailwayAlive()));
		   System.out.println("Cycle IC_ST_1 A:"+RI.GetSimulationTick());
		   
		   //reduce speed now
		   System.out.println("REDUCE SPEED.");
		   RI.SetSignal(RI.ALL_TRACKS, RI.ALL_SIGNALS, RI.SIGNAL_RED);
		   RI.SetTrack(RI.IC_ST_1, RI.MOTORMODE_PRIMARY, 5);
		   
		   //wait until engine reaches second contact of IC_ST_1
		   RI.GetContact(RI.IC_ST_1, 1, true);
		   while ((RI.GetContact(RI.IC_ST_1, 1, true) == 0)
			       &&(RI.RailwayAlive()));
		   System.out.println("Cycle IC_ST_1 B:"+RI.GetSimulationTick());
   	   
		   //stop the train and turn of all tracks
		   System.out.println("STOPPING TRAIN.");
		   RI.SetTrack(RI.ALL_TRACKS, RI.MOTORMODE_OFF, 0);

		   //done
		   System.out.println("FINISHED.");

   } catch (Exception e) {
	   System.out.println("\nNO CONNECTION TO INTERFACE PROGRAM!");
   }
}
}
