<? 

 //=========================================================================== 
 //==    Model Railway Sample Controller PHP      == (c) C.Motika, Aug 2007 ==
 //===========================================================================

 /*! \file SampleController.php
  
  This is a simple test controller that uses the RailwayInterface PHP class
  It connects to the TCP interface program that includes the simulation. The 
  GUI (ModelGUI) is used to control the simulation steps by means of 
  starting, pausing, stopping and defining the simulation speed (delay). 
 
  This simple controller sets/expects an initial train on IC_ST_1 then 
  restarts the simulation at tick 0. Now all tracks are set to primary
  motormode with a speed of 40 while all signals show a green light.
  The train then moves on wihin the Inner Circle until the second contact on
  IC_LN_5 is passed. This triggeres the switch point 20 to be set to turn.
  When the train passes the first contact of IC_ST_1 the speed is reduced to
  5 and all signals are set to red. After reaching the second contact the
  train is stopped and all track segements are shut down. Here the controller
  ends and closes its connection to the interface program.
  
 */
 
 // ==========================================================================

require('RailwayInterfaceClass.php');

 //===========================================================================
 
 
		  $RI = new RailwayInterface("localhost","2020",false);
		  
		  //wait for the gui to be connected
		  while(!($RI->RailwayAlive())){sleep(1);};

 		  $RI->SetPoint(17, RailwayInterface::POINT_TURN);
		  $RI->SetPoint(16, RailwayInterface::POINT_TURN);
		  $RI->SetPoint(0, RailwayInterface::POINT_TURN);
		  $RI->SetPoint(9, RailwayInterface::POINT_TURN);
		  $RI->SetPoint(1, RailwayInterface::POINT_TURN);

		   //set track speed to 40 an all tracks w/ primary driving direction
		   $RI->SetTrack(RailwayInterface::ALL_TRACKS, 
		                 RailwayInterface::MOTORMODE_PRIMARY, 40);
		   $RI->SetSignal(RailwayInterface::ALL_TRACKS, 
		                  RailwayInterface::ALL_SIGNALS, 
		                  RailwayInterface::SIGNAL_GREEN);

		   $RI->SetTrack(RailwayInterface::KIO_LN_0, 
		                 RailwayInterface::MOTORMODE_SECONDARY, 40);
		   $RI->SetTrack(RailwayInterface::KIO_LN_1, 
		                 RailwayInterface::MOTORMODE_SECONDARY, 40);
		   $RI->SetTrack(RailwayInterface::KH_ST_6, 
		                 RailwayInterface::MOTORMODE_SECONDARY, 40);
		   $RI->SetTrack(RailwayInterface::KH_ST_0, 
		                 RailwayInterface::MOTORMODE_SECONDARY, 40);
		   $RI->SetTrack(RailwayInterface::KH_ST_1, 
		                 RailwayInterface::MOTORMODE_SECONDARY, 40);

		   //wait unil second contact on IC_LN_5 is triggered 
		   while (($RI->GetContact(RailwayInterface::IC_LN_5, 1, true) == 0)&&
		         ($RI->RailwayAlive()));;
		   print("Cycle IC_LN_5 B:".$RI->GetSimulationTick()."<br>");
		   
		   //set switch point 20 to turn
		   print("SET SWITCH POINT 20 TO TURN.");
		   $RI->SetPoint(20, RailwayInterface::POINT_TURN);
		   
		   //wait until enigne reaches first contact of IC_ST_3
		   while (($RI->GetContact(RailwayInterface::IC_ST_3, 0, true) == 0)&&
		          ($RI->RailwayAlive()));
		   print("Cycle IC_ST_3 A:".$RI->GetSimulationTick());
		   
		   //reduce speed now
		   print("REDUCE SPEED.");
		   $RI->SetSignal(RailwayInterface::ALL_TRACKS, 
		                  RailwayInterface::ALL_SIGNALS, 
		                  RailwayInterface::SIGNAL_RED);
		   $RI->SetTrack(RailwayInterface::ALL_TRACKS, 
		                 RailwayInterface::MOTORMODE_PRIMARY, 5);
		   
		   //wait until engine reaches second contact of IC_ST_3
		   while (($RI->GetContact(RailwayInterface::IC_ST_3, 1, true) == 0)&&
		          ($RI->RailwayAlive()));
		   print("Cycle IC_ST_3 B:".$RI->GetSimulationTick()."<br>");
   	   
		   //stop the train and turn of all tracks
		   print("STOPPING.");
		   $RI->SetTrack(RailwayInterface::ALL_TRACKS, 
		                 RailwayInterface::MOTORMODE_PRIMARY, 0);

           //wait for the gui to be disconnection to prevent an early ending of
           //the script!
  		   while($RI->RailwayAlive()){usleep(50);};
  		   
  		   $RI->AbortInterface();

		   print("FINISHED.");

//============================================================================
?>
