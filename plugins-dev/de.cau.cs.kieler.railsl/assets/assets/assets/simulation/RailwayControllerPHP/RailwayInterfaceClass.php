<?

 // ========================================================================== 
 // ==  Model Railway Interface - PHP Side Part   == (c) C.Motika, Aug 2007 ==
 // ==========================================================================
 
 /*! \file RailwayInterfaceClass.php
 
  This module implements the PHP side part of the Model Railway Interface
  that is intended to fit together with the Simulation and with the real Model
  Railway Interface (UDP and Ethernet) invented initially by Stephan Hörmann. 
 
  The class below defines similar methods to be used in PHP scripts. An
  attached SampleController.php shows an example of how to use this class.
  Each method is described below. Often there are predefined constants that
  should be used in order to clearify the resulting programming code.
  
  An instance of this class connects over the given host/port to the tcp
  interface program. The simulation cannot be started by the controller. There
  fore the GUI program that is also connected to the interface program that
  includes the simulation is used. It will give the user the possibility to
  start the simulation with a given delay and force the incrementation of
  the simulation ticks. On the real model railway the simulation related
  methods defined by this class will have no meaning and will be ignored.

  *** THIS IS ONLY EXPERIMENTAL ***
 
  Please note that you have to take care of that the PHP script won't end 
  before the Model Railway is in a safe position. Therefore you'll have to 
  wait for some more (absolute or relative) ticks, wait for the
  disconnection of the ModelGUI e.g.. 
  You also need to configure PHP and your Webserver itself the right way not 
  to shutdown the script even if it runs longer.

 */
 
 // ==========================================================================

class RailwayInterface {

 var $connection;

 	  const IC_JCT_0 = 0;            //!< track segment constant
	  const IC_LN_0 = 1;             //!< track segment constant
	  const IC_LN_1 = 2;             //!< track segment constant
	  const IC_LN_2 = 3;             //!< track segment constant
	  const IC_LN_3 = 4;             //!< track segment constant
	  const IC_LN_4 = 5;             //!< track segment constant
	  const IC_LN_5 = 6;             //!< track segment constant
	  const IC_ST_0 = 7;             //!< track segment constant
	  const IC_ST_1 = 8;             //!< track segment constant
	  const IC_ST_2 = 9;             //!< track segment constant
	  const IC_ST_3 = 10;            //!< track segment constant
	  const IC_ST_4 = 11;            //!< track segment constant
	  const IO_LN_0 = 12;            //!< track segment constant
	  const IO_LN_1 = 13;            //!< track segment constant
	  const IO_LN_2 = 14;            //!< track segment constant
	  const KH_LN_0 = 15;            //!< track segment constant
	  const KH_LN_1 = 16;            //!< track segment constant
	  const KH_LN_2 = 17;            //!< track segment constant
	  const KH_LN_3 = 18;            //!< track segment constant
	  const KH_LN_4 = 19;            //!< track segment constant
	  const KH_LN_5 = 20;            //!< track segment constant
	  const KH_LN_6 = 21;            //!< track segment constant
	  const KH_LN_7 = 22;            //!< track segment constant 
	  const KH_LN_8 = 23;            //!< track segment constant
	  const KH_ST_0 = 24;            //!< track segment constant 
	  const KH_ST_1 = 25;            //!< track segment constant
	  const KH_ST_2 = 26;            //!< track segment constant
	  const KH_ST_3 = 27;            //!< track segment constant
	  const KH_ST_4 = 28;            //!< track segment constant
	  const KH_ST_5 = 29;            //!< track segment constant
	  const KH_ST_6 = 30;            //!< track segment constant
	  const KIO_LN_0 = 31;           //!< track segment constant
	  const KIO_LN_1 = 32;           //!< track segment constant
	  const OC_JCT_0 = 33;           //!< track segment constant
	  const OC_LN_0 = 34;            //!< track segment constant
	  const OC_LN_1 = 35;            //!< track segment constant
	  const OC_LN_2 = 36;            //!< track segment constant
	  const OC_LN_3 = 37;            //!< track segment constant
	  const OC_LN_4 = 38;            //!< track segment constant
	  const OC_LN_5 = 39;            //!< track segment constant
	  const OC_ST_0 = 40;            //!< track segment constant
	  const OC_ST_1 = 41;            //!< track segment constant
	  const OC_ST_2 = 42;            //!< track segment constant
	  const OC_ST_3 = 43;            //!< track segment constant
	  const OC_ST_4 = 44;            //!< track segment constant
	  const OI_LN_0 = 45;            //!< track segment constant
	  const OI_LN_1 = 46;            //!< track segment constant
	  const OI_LN_2 = 47;            //!< track segment constant
	  
	  const MOTORMODE_OFF = 0;       //!< motormode constant
	  const MOTORMODE_PRIMARY = 1;   //!< motormode constant
	  const MOTORMODE_SECONDARY = 2; //!< motormode constant
	  const MOTORMODE_BRAKE = 3;     //!< motormode constant
	  
	  const CONTACTEVENT_NONE = 0;   //!< contact event constant
	  const CONTACTEVENT_FWD = 0;    //!< contact event constant
	  const CONTACTEVENT_REV = 0;    //!< contact event constant
	  const CONTACTEVENT_UNI = 0;    //!< contact event constant
	  
	  const SIGNAL_RED = 1;          //!< signal light constant
	  const SIGNAL_YELLOW = 2;       //!< signal light constant
	  const SIGNAL_GREEN = 4;        //!< signal light constant
	  
	  const POINT_STRAIGHT = false;  //!< point state constant
	  const POINT_TURN = true;       //!< point state constant
	  
	  const ALL_TRACKS = -1;         //!< catch all tracks constant
	  const ALL_POINTS = -1;         //!< catch all points constant
	  const ALL_SIGNALS = -1;        //!< catch all signals constant
	  
	  const SIGNAL_FIRST = 0;        //!< signal select constant
	  const SIGNAL_SECOND = 1;       //!< signal select constant
	  
	  const CONTACT_FIST = 0;       //!< contact select constant
	  const CONTACT_SECOND = 1;     //!< contact select constant

	  //----------------------------------------------------------------------
	  //! Helperfunction: Sends a command over TCP
	  //!
	  //! @param command
	  //!           command to be send over tcp
	  //!
	  function Send($command) {
		  print("COMMAND:".$command."<br>");
		  fputs($this->$connection,$command);
		  flush($this->$connection);
	  }

      //----------------------------------------------------------------------
	  //! Helperfunction: Sends a command over TCP and Receives the Answer
	  //!
	  //! @param command
	  //!           command to be send over tcp
	  //! @return
	  //!           received answer from tcp interface program
	  //!
	  function SendAndReceive($command) {
		  fputs($this->$connection,$command);
		  flush($this->$connection);
		  $returnvalue = fgets($this->$connection,1024);
		  return $returnvalue;
	  }

	  //----------------------------------------------------------------------
      //----------------------------------------------------------------------

      //----------------------------------------------------------------------
      //! Constructor of this class.
	  //! 
      //! @param host 
	  //!			specifies the url/ip of the machine on which the
      //!			interface program runs on
      //! @param port 
	  //!			specifies the port of the machine that the interface 
      //!           program runs on
      //! @param persistent
      //!           open a connection that will be kept open after the ending
      //!           of the script
      //! @return 
	  //!			an instance of this class
      //!
	  function RailwayInterface($host, $port, $persistent) { 
	     if ($persistent) 
	        $this->$connection = pfsockopen($host,$port);
	 	else 
	        $this->$connection = fsockopen($host,$port);
	  }
	
      //----------------------------------------------------------------------
      //! Set initial trains.
	  //!
      //! @param tracknum
	  //!			specifies the number (id) of the track - here a 
      //!           class internal constant should be used (s.a.)
      //! @param forward
	  //!			sets the alignment, forward=default, if false
      //!           the train will be placed the other way round
      //!           THIS PARAMETER IS OPTIONAL
      //!
	  function SetInitialTrainEx($tracknum, $forward) {
		  if ($forward) 
			  $this->Send("SETINITIALTRAIN#".$tracknum."\r\n");
		  else
			  $this->Send("SETINITIALTRAINEX#".$tracknum."#1\r\n");
	  }
      function SetInitialTrain($tracknum) {
		 SetInitialTrainEx($tracknum, true);
	  }
	  

      //----------------------------------------------------------------------
	  //! Clear all initial trains.
      //!
	  function ResetInitialTrains() {
		  $this->Send("RESETINITIALTRAINS\r\n");
	  }
      
      //----------------------------------------------------------------------
	  //! Stops the TCP interface part of the interface program and force the 
	  //! connection between an instance of this class and the program to be
	  //! terminated.
	  //! The interface program will exit its tcp interface thread.
      //!
	  function AbortInterface() {
		  $this->Send("ABORTINTERFACE\r\n");
	  }

      //----------------------------------------------------------------------
	  //! Stops the GUI interface part of the interface program and force the 
	  //! connection between the GUI and the program to be terminated.
	  //! The interface program will exit its GUI interface thread.
      //!
	  function AbortSimulation() {
		  $this->Send("ABORTSIMULATION\r\n");
	  }

      //----------------------------------------------------------------------
	  //! This resets the Simulation meaning to clear the initial trains and
	  //! restart the simulation. (see below)
      //!
	  function ResetSimulation() {
		  $this->Send("RESETSIMULATION\r\n");
	  }

      //----------------------------------------------------------------------
	  //! This restarts the simulation meaning to clear all not consumed 
	  //! contact events and restart the simulation at tick 0.
      //!
	  function RestartSimulation() {
		  $this->Send("RESTARTSIMULATION\r\n");
	  }

      //----------------------------------------------------------------------
	  //! This method returns the current internal tick of the simulation
	  //! that is included in the TCP interface program an instance of this 
	  //! class is connected to
	  //!
	  //! @return 
	  //!			integer that represents the ticks <verstrichene> since
	  //!			the simulation was started
      //!
	  function GetSimulationTick() {
		  $tick = -1;
		  $tick = ($this->SendAndReceive("GETSIMULATIONTICK\r\n"))+1-1;
		  return $tick;
	  }

      //----------------------------------------------------------------------
	  //! This method will shutdown the real model railway hardware an reset
	  //! the attached peripherals. In the simulation it is a simple abortion
	  //! of the simulation
      //!
	  function RailwayStopControl() {
		  $this->Send("RAILWAYSTOPCONTROL\r\n");
	  }

      //----------------------------------------------------------------------
	  //! In the real world this function will return the status of the 
	  //! controller pheripherals wether an fatal error occured which prevents
	  //! the hardware to work corretly. In the simulation it will return true
	  //! if the GUI is connected and false otherwise.
	  //!
	  //! @return 
	  //!			boolean value, true if GUI connected or no error occured
      //!
	  function RailwayAlive() {
		  $value = -1;
		  $value = ($this->SendAndReceive("RAILWAYALIVE\r\n"))+1-1;
		  return ($value == 1);
	  }
	  
      //----------------------------------------------------------------------
	  //! This method will return the measured speed of a track segment.
	  //!
      //! @param tracknum
	  //!			specifies the number (id) of the track - here a 
      //!           class internal constant should be used (s.a.)
	  //! @return
	  //!			speed of the track segment
      //!
	  function GetSpeed($tracknum) {
		  $value = -1;
		  $value = ($this->SendAndReceive("GETSPEED#".$tracknum."\r\n"))+1-1;
		  return $value;
	  }

      //----------------------------------------------------------------------
	  //! This method will return true if an engine of a train is detected to
	  //! be on a track segment.
	  //!
      //! @param tracknum 
	  //!			specifies the number (id) of the track - here a 
      //!           class internal constant should be used (s.a.)
	  //! @return 
	  //!			true if an engine is located on the tracksegment
	  //!			false otherwise
      //!
	  function TrackUsed($tracknum) {
		  $value = -1;
		  $value = ($this->SendAndReceive("TRACKUSED#".$tracknum."\r\n"))+1-1;
		  return ($value == 1);
	  }
	  
      //----------------------------------------------------------------------
      //! GetContact will return the (buffered) contact event, an integer 
	  //! value that can be compared to the offered CONTACTEVENT_~ constants:
	  //! CONTACTEVENT_NONE contact was not triggered since last call
	  //! CONTACTEVENT_FWD contact was triggered in driving direction
	  //! CONTACTEVENT_REV contact was triggered in reverse driving direction
	  //! CONTACTEVENT_UNI contact was triggered but a direction can
	  //!                  not be provided
	  //!
	  //! @param tracknum 
	  //!			specifies the number (id) of the track - here a 
      //!           class internal constant should be used (s.a.)
	  //! @param contact 
	  //!			specifies the contact of the track segment. 0 for
	  //!           the first contact in default driving direction and
	  //!           1 for the seoncd contact in default driving 
	  //!           direction. Use constants CONTACT_FIRST and 
	  //!           CONTACT_SECOND
	  //! @param clear 
	  //!			if clear is true all following buffered not consumed 
	  //!           contact events of the specified/found contact will be
	  //!           cleared
	  //! @return 
	  //!			CONTACTEVENT_NONE, CONTACTEVENT_FWD, CONTACTEVENT_REV
	  //!			or CONTACTEVENT_UNI
	  //!                   
	  function GetContact($tracknum, $contact, $clear) {
		  $value = 0;
		  $clearint = 0;
		  if ($clear) $clearint = 1;
    	  $value = ($this->SendAndReceive("GETCONTACT#".$tracknum."#"
					  .$contact."#".$clearint."\r\n"))+1-1;
		  usleep(50);
		  return $value;
	  }

	  //----------------------------------------------------------------------
      //! ScanContact will return the same contact value as GetContact.
      //! Additionally wildcards can be used eigther for tracknum or for
	  //! contact to find the first matching triggered contact. The contact
	  //! value is return within a Contact type that also holds the according
	  //! tracknum and contact
	  //!
	  //! @param tracknum
	  //!			specifies the number (id) of the track - here a 
      //!           class internal constant should be used (s.a.)
	  //!           also the wildcard -1 == ALL_TRACKS can be used
	  //! @param contact 
	  //!			specifies the contact of the track segment. 0 for
	  //!           the first contact in default driving direction and
	  //!           1 for the seoncd contact in default driving 
	  //!           direction. Use constants CONTACT_FIRST and 
	  //!           CONTACT_SECOND
	  //! @param clear
	  //!			if clear is true all following buffered not consumed 
	  //!           contact events of the specified/found contact will be
	  //!           cleared
	  //! @return 
	  //!			Contact type consting of tracknum, contactno and 
	  //!			contactvalue
      //!
	  function ScanContact($tracknum, $contact, $clear) {
		  $value = "";
		  $clearint = 0;
		  if ($clear) $clearint = 1;
	      $value = $this->SendAndReceive("SCANCONTACT#".$tracknum."#".
						  $contact."#".$clearint."\r\n");
		  usleep(50);
		  return $value;
	  }
	  
      //----------------------------------------------------------------------
	  //! This method allows to set the points that can be accessed through 
	  //! their identification numbers 0 - 29. For the turn value also 
	  //! constants exist.
	  //!
	  //! @param pointnum
	  //!			integer that identifies the switch point (0 - 29)
	  //!           also the wildcard -1 == ALL_SIGNALS can be used here
	  //! @param turn
	  //!			true if the switch point should be set to branch - use
	  //!           the according constants POINT_STRAIGHT or POINT_TURN
      //!
	  function SetPoint($pointnum, $turn) {
		  $turnint = 0;
		  if ($turn) $turnint = 1;
		  $this->Send("SETPOINT#".$pointnum."#".$turnint."\r\n");
	  }

      //----------------------------------------------------------------------
	  //! This method allows to control the motormode and the speed of a track
	  //! segment. The track segment again should be indentified by its
	  //! designated constant.
	  //!
	  //! @param tracknum 
	  //!			specifies the number (id) of the track - here a 
      //!           class internal constant should be used (s.a.)
	  //!           also the wildcard -1 == ALL_TRACKS can be used
	  //! @param motormode 
	  //!			specifies wether the track segment is set to
	  //!           be forward, backwards, brake or off. Use the 
	  //!  			following constants MOTORMODE_PRIMARY, 
	  //! 			MOTORMODE_SECONDARY, MOTORMODE_BRAKE, MOTORMODE_OFF
	  //! @param speed 
	  //!			speed (0 - 100) of the track segment that defines how
	  //!           fast the train is moved driving there
      //!
	  function SetTrack($tracknum, $motormode, $speed) {
		  $this->Send("SETTRACK#".$tracknum."#".$motormode."#".$speed."\r\n");
	  }
	  
      //----------------------------------------------------------------------
	  //! This method allows to set the signals of a track segment. Likewise
	  //! to the contacts there may be two signals connected to one track
	  //! segment.
	  //! The signal parameter identifies the first signal in default driving
	  //! direction as signal 0 and the second in default driving direction as
	  //! signal 1. The lights parameter can be a cobination (bitwise sum) of 
	  //! the following constants: 
	  //! SIGNAL_OFF, SIGNAL_RED, SIGNAL_YELLOW and SIGNAL_GREEN.
	  //! In the Simulation SIGNAL_OFF results in red lights, SIGNAL_RED 
	  //! combinded with SIGNAL_YELLOW or SIGNAL_GREEN will also only result
	  //! in red lights. The combination SIGNALS_YELLOW+SIGNALS_GREEN or 
	  //! SIGNALS_GREEN only are further possible values for lights.
	  //!
	  //! @param tracknum 
	  //!			specifies the number (id) of the track - here a 
      //!           class internal constant should be used (s.a.)
	  //!           also the wildcard -1 == ALL_TRACKS can be used
	  //! @param signal 
	  //!			0 for the first signal in default driving direction 
	  //!			and 1 for the second signal (use the constants 
	  //!			SIGNAL_FIRST, SIGNAL_SECOND)
	  //! @param signal 
	  //!			defines which lights the signal should show (s.a.)
      //!
	  function SetSignal($tracknum, $signal, $lights) {
		   $this->Send("SETSIGNAL#".$tracknum."#".$signal."#".$lights."\r\n");
	  }
	  

 //----------------------------------------------
 //----------------------------------------------


}//end class
//============================================================================
//============================================================================

?>