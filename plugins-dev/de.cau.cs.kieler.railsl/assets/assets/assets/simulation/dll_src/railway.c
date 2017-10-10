//===========================================================================//
//==      R A I L W A Y    S I M U L A T I O N    C - I N T E R F A C E    ==//
//==                                                                       ==//
//==   by Christian Motika, SS 2007, Christian-Albrechts-University Kiel   ==//
//===========================================================================//
//==                                                                       ==//
//==                                     (@@@)     (@@@@@)                 ==//
//==                               (@@)     (@@@@@@@)        (@@@@@@@)     ==//
//==                         (@@@@@@@)   (@@@@@)       (@@@@@@@@@@@)       ==//
//==                    (@@@)     (@@@@@@@)   (@@@@@@)             (@@@)   ==//
//==               (@@@@@@)    (@@@@@@)                (@)                 ==//
//==           (@@@)  (@@@@)           (@@)                                ==//
//==        (@@)              (@@@)                                        ==//
//==       .-.                                                             ==//
//==       ] [    .-.      _    .-----.                                    ==//
//==     ."   """"   """""" """"| .--`                                     ==//
//==    (:--:--:--:--:--:--:--:-| [___    .------------------------.       ==//
//==     |     :  :  :  :  :  : [_9_] |'='|.----------------------.|       ==//
//==    /|.___________________________|___|'--.___.--.___.--.___.-'|       ==//
//==   / ||_.--.______.--.______.--._ |---\'--\-.-/==\-.-/==\-.-/-'/--     ==//
//==  /__;^=(==)======(==)======(==)=^~^^^ ^^^^(-)^^^^(-)^^^^(-)^^^        ==//
//==  ~~~^~~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~ ==//
//==                                                                       ==//
//===========================================================================//

/*! \file railway.c

 The Railway Simulation C-Interface includes the SCADE generated c-code for
 the simulation and offers a similar interface to c-programs that Stephan
 Hoermanns library does to control the real model railway hardware.
 With this simulation c-interface it should be easy to test controller
 software written in c and later compile it for the real model railway
 hardware. Also it should be easy to modify the SCADE model of the simulation
 and re-generate the c-code for it to later compile the new c-code together
 with this interface and any written controller.

 To use the simulation while implementing a controller for the model railway
 system the programmer just has to include the railway.h file.
 It must be made sure that the directory this file lies in is within the
 search path of the compiler.

 To modify the simulation model pay attention to the lines in this code
 marked with words "//SCADE//".

*/

//===========================================================================//

//----------------------------------------------------------------------------
//--                            I N C L U D E S                             --
//----------------------------------------------------------------------------

#include "railway.h"

//----------------------------------------------------------------------------
//--                        G L O B A L     D A T A                         --
//----------------------------------------------------------------------------

int CYCLE = 0;								//!< counts the simulation cycles

//For ThreadSafety : writing to memory and clearing under mutual exclusion
//                   reading anytime not under mutual exclusion
//                   give precedence to writing to not delay simulation steps!
int MEM_ACCESSTOKEN_WRITE_R = 0;  //!< Flag Barrier Sync (writer waiting)
int MEM_ACCESSTOKEN_WRITE_E = 0;  //!< Flag Barrier Sync (writer executing)
int MEM_ACCESSTOKEN_CLEAR_E = 0;  //!< Flag Barrier Sync (clearer executing)




//----------------------------------------------------------------------------
//--        S I M U L A T I O N    M E M O R Y    F U N C T I O N S         --
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
//! add a contact event to the history queue and update the saved direction to
//! the current one
//! writing to contact memory and clearing it has to be ensured to exec under
//! mutual exclusion for thread safety - see source code for more information
//!
//! @param block
//!				integer id (constant) of the block
//!	@param contact
//!				0 for the first one in driving direction, 1 for the second one
//! @param direction
//!				triggered direction (constant) for this event
//!
void MEM_set_new_contact(int block, int contact, int direction)
{
   MEM_ACCESSTOKEN_WRITE_R = 1;             //set token, we want to write
   while (MEM_ACCESSTOKEN_CLEAR_E == 1) {}  //wait until clearing finished
											//(or looped again->we have prec.)
   MEM_ACCESSTOKEN_WRITE_E = 1;             //set token, we are writing
   //MUTUAL EXCLUSION START//
   MEM_ACCESSTOKEN_WRITE_R = 0;             //reset request token

   if (contact == 0) {
      strcat(SIM_memory.block[block].contact0,"X");
      SIM_memory.block[block].dircontact0 = direction;
   }
   else {
      strcat(SIM_memory.block[block].contact1,"X");
      SIM_memory.block[block].dircontact1 = direction;
   }

   //MUTUAL EXCLUSION END//
   MEM_ACCESSTOKEN_WRITE_E = 0;             //reset writing token
}

//----------------------------------------------------------------------------
//! erases the first contact event for a block and a contact number of the
//! according queue
//! writing to contact memory and clearing it has to be ensured to exec under
//! mutual exclusion for thread safety - see source code for more information
//!
//! @param block
//!				integer id (constant) of the block
//!	@param contact
//!				0 for the first one in driving direction, 1 for the second one
//!
void MEM_clear_contact(int block, int contact)
{
   char contacttmp[1024];
   int  c;

   while(1) {
     MEM_ACCESSTOKEN_CLEAR_E = 0;            //reset clearing token
     while (MEM_ACCESSTOKEN_WRITE_E == 1) {} //wait until writing finished
     MEM_ACCESSTOKEN_CLEAR_E = 1;            //set token, we are clearing
	 if (!MEM_ACCESSTOKEN_WRITE_R) break;    //if no writers waiting -> break
	                                         //if writers waiting loop again
											 //(this gives writers precedence)
   }//end while
   //MUTUAL EXCLUSION START//

   if (contact == 0) {
      for (c = 1; c < 1024 ;c++) {
		  contacttmp[c-1] = SIM_memory.block[block].contact0[c];
      }
	  strcpy(SIM_memory.block[block].contact0,contacttmp);
   }
   else {
      for (c = 1; c < 1024 ;c++) {
		  contacttmp[c-1] = SIM_memory.block[block].contact1[c];
      }
	  strcpy(SIM_memory.block[block].contact1,contacttmp);
   }

   //MUTUAL EXCLUSION END//
   MEM_ACCESSTOKEN_CLEAR_E = 0;           //reset clearing token
}

//----------------------------------------------------------------------------
//! returns 1 if there is any contact event queued for the requested contact
//! and 0 otherwise
//!
//! @param block
//!				integer id (constant) of the block
//!	@param contact
//!				0 for the first one in driving direction, 1 for the second one
//! @return
//!				0 if not triggered, 1 if any triggered event found in buffer
//!
int MEM_istriggered_contact(int block, int contact)
{
   int backvalue = 0;
   if (contact == 0) {
      backvalue = ('X' == SIM_memory.block[block].contact0[0]);
   }
   else {
      backvalue = ('X' == SIM_memory.block[block].contact1[0]);
   }
   return backvalue;
}

//-----------------------------------------------------------------------------
//! returns 1 if the there is exact one contact event queued for the requested
//! contact and 0 otherwise
//!
//! @param block
//!				integer id (constant) of the block
//!	@param contact
//!				0 for the first one in driving direction, 1 for the second one
//! @return
//!				1 if exact one event queued, 0 otherwise
//!
int MEM_iscurrent_event(int block, int contact) {
   int backvalue = 0;
   if (contact == 0) {
      backvalue = ('X' != SIM_memory.block[block].contact0[1]);
   }
   else {
      backvalue = ('X' != SIM_memory.block[block].contact1[1]);
   }
   return backvalue;
}

//----------------------------------------------------------------------------
//! returns the saved oder UNI direction for contact if that was triggered,
//! 0 otherwise
//!
//! @param block
//!				integer id (constant) of the block
//!	@param contact
//!				0 for the first one in driving direction, 1 for the second one
//! @return
//!				0 if not triggered, the last saved direction otherwise
//!
int MEM_get_contact(int block, int contact)
{
   if (MEM_istriggered_contact(block,contact)) {
	   if ((contact == 0)&&(MEM_iscurrent_event(block,contact))) {
   	      return SIM_memory.block[block].dircontact0;
	   }
	   else if ((contact == 1)&&(MEM_iscurrent_event(block,contact))) {
		   return SIM_memory.block[block].dircontact1;
	   }
	   else {
		   return UNI; //emulate "no direction saved!"
	   }
   }
   return 0; // 0 == NONE
}

//----------------------------------------------------------------------------
//! erases all contact events for a block and a contact number of the
//! according queue
//!
//! @param block
//!				integer id (constant) of the block
//!	@param contact
//!				0 for the first one in driving direction, 1 for the second one
//!
void MEM_clearall_contact(int block, int contact)
{
   if (contact == 0) {
	  strcpy(SIM_memory.block[block].contact0,"");
   }
   else {
	  strcpy(SIM_memory.block[block].contact1,"");
   }
}

//----------------------------------------------------------------------------
//! erases all contact events for all blocks and resets the whole contact
//! memory
void MEM_reset_contacts()
{
	int c;
	for (c = 0; c < 48; c++) {
       MEM_clearall_contact(c, 0);
	   MEM_clearall_contact(c, 1);
	}
}



//----------------------------------------------------------------------------
//--       D A T A    T Y P E    C O N V E S I O N   F U N C T I O N S      --
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
//! the following function convert integer reprentation of enums from SCADE to
//! the textual representation that the ModelGUI understands
//!
//! @param num
//!				integer representation of SCADE's enum value
//! @return
//!				text representation of SCADE's enum value
//!
char* motormodeText(int num)
{
  if (num == 0) return ("M_OFF__simulation");
  if (num == 1) return ("M_PRIMARY__simulation");
  if (num == 2) return ("M_SECONDARY__simulation");
  if (num == 3) return ("M_BRAKE__simulation");
  return ("M_OFF__simulation");
}

//----------------------------------------------------------------------------
//! the following function convert integer representation of enums from SCADE
//! to the textual representation that the ModelGUI understands
//!
//! @param num
//!				integer representation of SCADE's enum value
//! @return
//!				text representation of SCADE's enum value
//!
char* pointsText(int num)
{
  if (num == 0) return ("P_STRAIGHT__simulation");
  if (num == 1) return ("P_TURN__simulation");
  return ("P_STRAIGHT__simulation");
}

//----------------------------------------------------------------------------
//! the following function convert integer representation of enums from SCADE
//! to the textual representation that the ModelGUI understands
//!
//! @param num
//!				integer representation of SCADE's enum value
//! @return
//!				text representation of SCADE's enum value
//!
char* signalsText(int num)
{
  if (num == 0) return ("S_OFF__simulation");
  if (num == 1) return ("S_RED__simulation");
  if (num == 2) return ("S_YELLOW__simulation");
  if (num == 3) return ("S_GREEN__simulation");
  return ("S_OFF__simulation");
}

//----------------------------------------------------------------------------
//! the following function convert integer representation of enums from SCADE
//! to the textual representation that the ModelGUI understands
//!
//! @param num
//!				integer representation of SCADE's enum value
//! @return
//!				text representation of SCADE's enum value
//!
char* errorText(int num)
{
  if (num == 0) return ("E_OK__simulation");
  if (num == 1) return ("E_FORBIDDEN_SWITCHCROSS_SETTING__simulation");
  if (num == 2) return ("E_WRONG_SWITCHPOINT_DIRECTION__simulation");
  if (num == 3) return ("E_TRACK_OCCUPIED__simulation");
  if (num == 4) return ("E_TRACK_DOUBLE_ENTRY__simulation");
  if (num == 5) return ("E_MOTORMODE_MISMATCH__simulation");
  if (num == 6) return ("E_SPEED_MISMATCH__simulation");
  return ("E_OK__simulation");
}

//----------------------------------------------------------------------------
//! converts a float number to a char
//!
//! @param float_num
//!				number to convert to characters
//! @dest
//!				buffer to write resulting characters to
//!
void myfloattochar(float float_num, char* dest)
{
  //char float_string[4];
  sprintf(dest, "%f", float_num);
  return;// float_string;
}


//----------------------------------------------------------------------------
//--             D L L    A P I   M A I N   F U N C T I O N S               --
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
//! resets the cycles the contact memory the initial trains and the
//! railway hardware and restarts the simulation
void resetSimulation()
{
    resetRailwayHardware();
	restartSimulation();
	resetInitialTrains();
}

//----------------------------------------------------------------------------
//! make a simulation step
void stepSimulation()
{
	int c;
	Simulation_simulation(&SIM_commands, &SIM_c);
    for (c = 0; c < 48; c++) {
		 if (SIM_c.out_controllerFeedbackSensor.contacts[c].
		     c_first.Triggered) {                   //SCADE//
		 	    MEM_set_new_contact(c, 0,
		 	    SIM_c.out_controllerFeedbackSensor.contacts[c].
			    c_first.Direction);                    //SCADE//
		 }
		 if (SIM_c.out_controllerFeedbackSensor.contacts[c].
		     c_second.Triggered) {                  //SCADE//
		     	MEM_set_new_contact(c, 1,
		     	SIM_c.out_controllerFeedbackSensor.contacts[c].
			 	c_first.Direction);                    //SCADE//
		 }
    }//next c
    CYCLE++;
}




//----------------------------------------------------------------------------
//! returns the simulation data
char* getVisualizationData()
{
	  char response[68000], responsetmp[5012];
	  int c;

			   strcpy(response,"((");
			   for (c = 0; c < 48; c++) {                       //SCADE//
			     myfloattochar(SIM_c.displayData.startPosition[c],responsetmp);
                 strcat(response,responsetmp);
                 if (c < 47) strcat(response,",");
               }
               strcat(response,"),(");
               for (c = 0; c < 48; c++) {                       //SCADE//
			     myfloattochar(SIM_c.displayData.endPosition[c],responsetmp);
                 strcat(response,responsetmp);
                 if (c < 47) strcat(response,",");
               }
               strcat(response,"),(");
		       for (c = 0; c < 48; c++) {                       //SCADE//
                 strcat(response,motormodeText(SIM_c.displayData.
					    motormodes[c]));
                 if (c < 47) strcat(response,",");
               }
               strcat(response,"),(");
               for (c = 0; c < 48; c++) {                       //SCADE//
                 strcat(response,errorText(SIM_c.displayData.blockErrors[c]));
                 if (c < 47) strcat(response,",");
               }
               strcat(response,"),(");
               for (c = 0; c < 48; c++) {                       //SCADE//
                 strcat(response,pointsText(SIM_c.displayData.points[c]));
                 if (c < 47) strcat(response,",");
               }
               strcat(response,"),(");
               for (c = 0; c < 48; c++) {                       //SCADE//
                 strcat(response,errorText(SIM_c.displayData.pointErrors[c]));
                 if (c < 47) strcat(response,",");
               }
               strcat(response,"),(");
               for (c = 0; c < 49; c++) {                       //SCADE//
                 strcat(response,signalsText(SIM_c.displayData.signals0[c]));
                 if (c < 48) strcat(response,",");
               }
               strcat(response,"),(");
               for (c = 0; c < 49; c++) {                       //SCADE//
                 strcat(response,signalsText(SIM_c.displayData.signals1[c]));
                 if (c < 48) strcat(response,",");
               }
               strcat(response,"))");
               return response;
}




//----------------------------------------------------------------------------
//! returns the current simulation tick
//!
//! @return
//!				current simulation cycle tick
//!
int getSimulationTick()
{
    return CYCLE;
}

//----------------------------------------------------------------------------
//! set all switch points to straight, all motormodes to off, all speeds to 0
//! and all signal lights to red
void resetRailwayHardware()
{
	int c;

	// init SIM_commands
	SIM_commands = SIM_commands_wrapper.in_controllerCommands;  //SCADE//

    for (c = 0; c < 30; c++) {
      SIM_commands.points[c] = 0; //0:straight, 1:turn          //SCADE//
    }

    for (c = 0; c < 49; c++) {
      SIM_commands.motormodes[c] = 0;//0:off, 1:primary, 2:secondary, 3:brake
                                                                //SCADE//
      SIM_commands.speeds[c]     = 0.0;                         //SCADE//
      SIM_commands.signals0[c]   = 0;//0:off, 1:red, 2:yellow, 3:green //SCADE//
      SIM_commands.signals1[c]   = 0;//0:off, 1:red, 2:yellow, 3:green //SCADE//
    }
}

//----------------------------------------------------------------------------
//! set an initial train for a given block id
//!
//! @param block
//!				integer id (constant) of the block
//!
void setInitialTrain(int block)
{
    SIM_commands.inittrains[block] = 1;                         //SCADE//
}

//----------------------------------------------------------------------------
//! set an initial train for a given block id
//! alignment 0 = default = forward, 1 = backward
//!
//! @param block
//!				integer id (constant) of the block
//! @param alignment
//!				0 means train is in default driving direction
//!				1 means train is in reverse driving direction
//!
void setInitialTrainEx(int block, int alignment)
{
	  if (alignment == 1) {
		   SIM_commands.inittrains[block] = 2;                  //SCADE//
	  }
	  else {
		   SIM_commands.inittrains[block] = 1;                  //SCADE//
	  }
}

//----------------------------------------------------------------------------
//! reset/clears all initial trains (optionally load configuration file)
//!
void resetInitialTrains()
{
  int c;
  for (c = 0; c < 48; c++) {
	  SIM_commands.inittrains[c] = 0;                           //SCADE//
  }
}

//----------------------------------------------------------------------------
//! just restart the simulation by clearing the contact memory and resetting
//! the cycles
void restartSimulation()
{
	CYCLE = 0;
	MEM_reset_contacts();
    Simulation_reset_simulation (&SIM_c);                       //SCADE//
}



//----------------------------------------------------------------------------
//! this function creates a concurrent executed thread that will do all
//! simulation steps and communicate with the ModelGUI. The thread can be
//! stopped by calling abortSimulation().
//!
//! @param port
//!				port that is going to be made available for the ModelGUI to
//!				connect to
//!
void initSimulation()
{
    //inittrains and railway hardware
    resetSimulation();
}



//----------------------------------------------------------------------------
//--            T R A C K    N A M E   C O N V E R S I O N                  --
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
//! convert a trackname or number from char to an integer representation
//!
//! @param trackname
//!				textual representation of the track segment
//! @return
//!				integer representation (constant) of the track segment
//!
int getTrackNum(char* trackname)
{
   if (strcmp(trackname,"IC_JCT_0") == 0) return 0;
   if (strcmp(trackname,"IC_LN_0") == 0) return 1;
   if (strcmp(trackname,"IC_LN_1") == 0) return 2;
   if (strcmp(trackname,"IC_LN_2") == 0) return 3;
   if (strcmp(trackname,"IC_LN_3") == 0) return 4;
   if (strcmp(trackname,"IC_LN_4") == 0) return 5;
   if (strcmp(trackname,"IC_LN_5") == 0) return 6;
   if (strcmp(trackname,"IC_ST_0") == 0) return 7;
   if (strcmp(trackname,"IC_ST_1") == 0) return 8;
   if (strcmp(trackname,"IC_ST_2") == 0) return 9;
   if (strcmp(trackname,"IC_ST_3") == 0) return 10;
   if (strcmp(trackname,"IC_ST_4") == 0) return 11;
   if (strcmp(trackname,"IO_LN_0") == 0) return 12;
   if (strcmp(trackname,"IO_LN_1") == 0) return 13;
   if (strcmp(trackname,"IO_LN_2") == 0) return 14;
   if (strcmp(trackname,"KH_LN_0") == 0) return 15;
   if (strcmp(trackname,"KH_LN_1") == 0) return 16;
   if (strcmp(trackname,"KH_LN_2") == 0) return 17;
   if (strcmp(trackname,"KH_LN_3") == 0) return 18;
   if (strcmp(trackname,"KH_LN_4") == 0) return 19;
   if (strcmp(trackname,"KH_LN_5") == 0) return 20;
   if (strcmp(trackname,"KH_LN_6") == 0) return 21;
   if (strcmp(trackname,"KH_LN_7") == 0) return 22;
   if (strcmp(trackname,"KH_LN_8") == 0) return 23;
   if (strcmp(trackname,"KH_ST_0") == 0) return 24;
   if (strcmp(trackname,"KH_ST_1") == 0) return 25;
   if (strcmp(trackname,"KH_ST_2") == 0) return 26;
   if (strcmp(trackname,"KH_ST_3") == 0) return 27;
   if (strcmp(trackname,"KH_ST_4") == 0) return 28;
   if (strcmp(trackname,"KH_ST_5") == 0) return 29;
   if (strcmp(trackname,"KH_ST_6") == 0) return 30;
   if (strcmp(trackname,"KIO_LN_0") == 0) return 31;
   if (strcmp(trackname,"KIO_LN_1") == 0) return 32;
   if (strcmp(trackname,"OC_JCT_0") == 0) return 33;
   if (strcmp(trackname,"OC_LN_0") == 0) return 34;
   if (strcmp(trackname,"OC_LN_1") == 0) return 35;
   if (strcmp(trackname,"OC_LN_2") == 0) return 36;
   if (strcmp(trackname,"OC_LN_3") == 0) return 37;
   if (strcmp(trackname,"OC_LN_4") == 0) return 38;
   if (strcmp(trackname,"OC_LN_5") == 0) return 39;
   if (strcmp(trackname,"OC_ST_0") == 0) return 40;
   if (strcmp(trackname,"OC_ST_1") == 0) return 41;
   if (strcmp(trackname,"OC_ST_2") == 0) return 42;
   if (strcmp(trackname,"OC_ST_3") == 0) return 43;
   if (strcmp(trackname,"OC_ST_4") == 0) return 44;
   if (strcmp(trackname,"OI_LN_0") == 0) return 45;
   if (strcmp(trackname,"OI_LN_1") == 0) return 46;
   if (strcmp(trackname,"OI_LN_2") == 0) return 47;
   if (strcmp(trackname,"-1") == 0) return -1;
   if (strcmp(trackname,"0") == 0) return 0;
   if (strcmp(trackname,"1") == 0) return 1;
   if (strcmp(trackname,"2") == 0) return 2;
   if (strcmp(trackname,"3") == 0) return 3;
   if (strcmp(trackname,"4") == 0) return 4;
   if (strcmp(trackname,"5") == 0) return 5;
   if (strcmp(trackname,"6") == 0) return 6;
   if (strcmp(trackname,"7") == 0) return 7;
   if (strcmp(trackname,"8") == 0) return 8;
   if (strcmp(trackname,"9") == 0) return 9;
   if (strcmp(trackname,"10") == 0) return 10;
   if (strcmp(trackname,"11") == 0) return 11;
   if (strcmp(trackname,"12") == 0) return 12;
   if (strcmp(trackname,"13") == 0) return 13;
   if (strcmp(trackname,"14") == 0) return 14;
   if (strcmp(trackname,"15") == 0) return 15;
   if (strcmp(trackname,"16") == 0) return 16;
   if (strcmp(trackname,"17") == 0) return 17;
   if (strcmp(trackname,"18") == 0) return 18;
   if (strcmp(trackname,"19") == 0) return 19;
   if (strcmp(trackname,"20") == 0) return 20;
   if (strcmp(trackname,"21") == 0) return 21;
   if (strcmp(trackname,"22") == 0) return 22;
   if (strcmp(trackname,"23") == 0) return 23;
   if (strcmp(trackname,"24") == 0) return 24;
   if (strcmp(trackname,"25") == 0) return 25;
   if (strcmp(trackname,"26") == 0) return 26;
   if (strcmp(trackname,"27") == 0) return 27;
   if (strcmp(trackname,"28") == 0) return 28;
   if (strcmp(trackname,"29") == 0) return 29;
   if (strcmp(trackname,"30") == 0) return 30;
   if (strcmp(trackname,"31") == 0) return 31;
   if (strcmp(trackname,"32") == 0) return 32;
   if (strcmp(trackname,"33") == 0) return 33;
   if (strcmp(trackname,"34") == 0) return 34;
   if (strcmp(trackname,"35") == 0) return 35;
   if (strcmp(trackname,"36") == 0) return 36;
   if (strcmp(trackname,"37") == 0) return 37;
   if (strcmp(trackname,"38") == 0) return 38;
   if (strcmp(trackname,"39") == 0) return 39;
   if (strcmp(trackname,"40") == 0) return 40;
   if (strcmp(trackname,"41") == 0) return 41;
   if (strcmp(trackname,"42") == 0) return 42;
   if (strcmp(trackname,"43") == 0) return 43;
   if (strcmp(trackname,"44") == 0) return 44;
   if (strcmp(trackname,"45") == 0) return 45;
   if (strcmp(trackname,"46") == 0) return 46;
   if (strcmp(trackname,"47") == 0) return 47;
   return -1;
}

//----------------------------------------------------------------------------
//! convert a trackname or number from char to an integer representation
//!
//! @param trackname
//!				textual representation of the track segment
//! @return
//!				integer representation (constant) of the track segment
//!
char* getTrackName(int tracknum)
{
   if (tracknum == 0)  return "IC_JCT_0";
   if (tracknum == 1)  return " IC_LN_0";
   if (tracknum == 2)  return " IC_LN_1";
   if (tracknum == 3)  return " IC_LN_2";
   if (tracknum == 4)  return " IC_LN_3";
   if (tracknum == 5)  return " IC_LN_4";
   if (tracknum == 6)  return " IC_LN_5";
   if (tracknum == 7)  return " IC_ST_0";
   if (tracknum == 8)  return " IC_ST_1";
   if (tracknum == 9)  return " IC_ST_2";
   if (tracknum == 10) return " IC_ST_3";
   if (tracknum == 11) return " IC_ST_4";
   if (tracknum == 12) return " IO_LN_0";
   if (tracknum == 13) return " IO_LN_1";
   if (tracknum == 14) return " IO_LN_2";
   if (tracknum == 15) return " KH_LN_0";
   if (tracknum == 16) return " KH_LN_1";
   if (tracknum == 17) return " KH_LN_2";
   if (tracknum == 18) return " KH_LN_3";
   if (tracknum == 19) return " KH_LN_4";
   if (tracknum == 20) return " KH_LN_5";
   if (tracknum == 21) return " KH_LN_6";
   if (tracknum == 22) return " KH_LN_7";
   if (tracknum == 23) return " KH_LN_8";
   if (tracknum == 24) return " KH_ST_0";
   if (tracknum == 25) return " KH_ST_1";
   if (tracknum == 26) return " KH_ST_2";
   if (tracknum == 27) return " KH_ST_3";
   if (tracknum == 28) return " KH_ST_4";
   if (tracknum == 29) return " KH_ST_5";
   if (tracknum == 30) return " KH_ST_6";
   if (tracknum == 31) return "KIO_LN_0";
   if (tracknum == 32) return "KIO_LN_1";
   if (tracknum == 33) return "OC_JCT_0";
   if (tracknum == 34) return " OC_LN_0";
   if (tracknum == 35) return " OC_LN_1";
   if (tracknum == 36) return " OC_LN_2";
   if (tracknum == 37) return " OC_LN_3";
   if (tracknum == 38) return " OC_LN_4";
   if (tracknum == 39) return " OC_LN_5";
   if (tracknum == 40) return " OC_ST_0";
   if (tracknum == 41) return " OC_ST_1";
   if (tracknum == 42) return " OC_ST_2";
   if (tracknum == 43) return " OC_ST_3";
   if (tracknum == 44) return " OC_ST_4";
   if (tracknum == 45) return " OI_LN_0";
   if (tracknum == 46) return " OI_LN_1";
   if (tracknum == 47) return " OI_LN_2";
   return "";
}


//----------------------------------------------------------------------------
//--                  R A I L W A Y    I N T E R F A C E                    --
//----------------------------------------------------------------------------
// the following functions are abutted to the c library of the model
// railway written by stephan hoermann
// their use is documented in his diploma thesis

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! In this function the GUI port is extracted from the optional config file
//! and the simulation is initialized with that GUI port or with the
//! default one if no configuration file was found. It returns only a
//! dummy railway struct which is not used simulation wide.
//!
struct railway_system *railway_initsystem(struct railway_hardware *hardware)
{
  struct railway_system *railway;
  railway=(struct railway_system *)calloc(1,sizeof(struct railway_system));
  railway->dummy = 1;

  //initialize the simulation here with port read from cfg file or default
  //port
  initSimulation();

  return(railway);
}

//----------------------------------------------------------------------------
//int railway_setlink (struct railway_system *railway, unsigned node,
//					  struct nodelink *link) {
//};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! Just a dummy function with no use for the simulation.
//!
int railway_openlinks_can(struct railway_system *railway, char candevice,
						  char *device)
{
};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! Just a dummy function with no use for the simulation.
//!
int railway_openlinks_udp(struct railway_system *railway,
						  char *hostformat, char *device)
{
};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! Just a dummy function with no use for the simulation.
//!
int railway_startcontrol(struct railway_system *railway,
						 unsigned mincycle, unsigned maxcycle)
{
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! This function aborts the simulation thread and terminates the connection
//! between the ModelGUI and this thread.
//!
int railway_stopcontrol(struct railway_system *railway, int reset)
{
   return 1;
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! Just a dummy function with no use for the simulation.
//!
int railway_closelinks(struct railway_system *railway)
{
	return 1;
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! Just a dummy function with no use for the simulation.
//!
int railway_donesystem(struct railway_system *railway)
{
	return 1;
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! This function will return the status of a connected/disconnected ModelGUI
//!
int railway_alive(struct railway_system *railway)
{
  return 1;
};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
void setlight(struct railway_system *railway, int lightnum, int ONOFF)
{
	// not implemented in simulation //
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int signalexists(struct railway_system *railway, int block, int signal)
{
	// not implemented in simulation //
	return 1;
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
void setsignal(struct railway_system *railway, int block, int signal,
	           int lights)
{
    int color = 0;				//lights == OFF
	int track = 0;
	if (lights == RED)          color = 1;
	if (lights == YELLOW+GREEN) color = 2;
	if (lights == YELLOW)       color = 2;
	if (lights == GREEN)        color = 3;

    if (block == -1) { // catch all
       for (track = 0; track < 49 ; track++ ){
			if ((signal == 0)||(block == -1)) {
				SIM_commands.signals0[track] = color;           //SCADE//
			}
			if ((signal == 1)||(block == -1)) {
				SIM_commands.signals1[track] = color;           //SCADE//
			}
       }//next track
    }
    else {             // differentiate between signals
		if ((signal == 0)||(signal == -1)) {
			SIM_commands.signals0[block] = color;               //SCADE//
		}
		if ((signal == 1)||(signal == -1)) {
			SIM_commands.signals1[block] = color;               //SCADE//
		}
	}//end else
};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
void settrack(struct railway_system *railway, int track, unsigned mode,
              unsigned target)
{
   int targetspeed = target;
   if (targetspeed > SPEED) targetspeed = targetspeed - SPEED;

   if (track == -1) { // catch all
     for (track = 0; track < 48 ; track++ ){
		 //only use 1/3 the speed adapted to the real model railway
		 //modified 22.02.2009
	     SIM_commands.speeds[track] = targetspeed/3;	        //SCADE//
		 SIM_commands.motormodes[track] = mode;                 //SCADE//
     }
   }
   else {  // differentiate between tracks
	 //only use 1/3 the speed adapted to the real model railway
	 //modified 22.02.2009
     SIM_commands.speeds[track] = targetspeed/3;	            //SCADE//
	 SIM_commands.motormodes[track] = mode;                     //SCADE//
   }
};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
unsigned getcontact(struct railway_system *railway, int block,
					int contact, int clear)
{
   unsigned returnvalue = NONE;
   if (contactexists(railway, block, contact)) {
		   returnvalue = MEM_istriggered_contact(block, contact);
		   if (returnvalue != 0) {
			   returnvalue = MEM_get_contact(block, contact);
		   }
   }//end if contact exist
   if (clear) {
		MEM_clearall_contact(block, contact);
	}
   else {
	    MEM_clear_contact(block, contact);
   }
   return returnvalue;
};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
unsigned scancontact(struct railway_system *railway, int *block,
					int *contact, int clear)
{
   int blocktmp, contacttmp;
   unsigned returnvalue;
   
   if ((*block == -1)&&(*contact == -1)){
	   for (blocktmp = 0; blocktmp < 48; blocktmp++) {
		   for (contacttmp = 0; contacttmp < 2; contacttmp++) {
		       if (MEM_get_contact(blocktmp, contacttmp) != NONE) break;
		   }//next contacttmp
	       if (MEM_get_contact(blocktmp, contacttmp) != NONE) break;
	   }//next blocktmp
	   *block = blocktmp;
	   *contact = contacttmp;
   }
   else if (*block == -1){
	   for (blocktmp = 0; blocktmp < 48; blocktmp++) {
           if (MEM_get_contact(blocktmp, *contact) != NONE) break;
	   }//next blocktmp
	   *block = blocktmp;
	   *contact = contacttmp;
   }
   else if (*contact == -1){
	   for (contacttmp = 0; contacttmp < 2; contacttmp++) {
		  if (MEM_get_contact(*block, contacttmp) != NONE) break;
	   }//next contacttmp
	   *block = blocktmp;
	   *contact = contacttmp;
   }

   if ((*block == -1)||(*contact == -1)) {
	   //no contact found
	   return NONE;
   }

   returnvalue = MEM_istriggered_contact(*block, *contact);
   if (returnvalue != 0) {
	   returnvalue = MEM_get_contact(*block, *contact);
   }
   if (clear) {
		MEM_clearall_contact(*block, *contact);
	}
   else {
	    MEM_clear_contact(*block, *contact);
   }
   return returnvalue;
};


//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
void setpoint(struct railway_system *railway, int point, int state)
{
   int track;
   if (point == -1) {
     for (track = 0; track < 48 ; track++ ){
        SIM_commands.points[track] = state;                     //SCADE//
     }
   }
   else
     SIM_commands.points[point] = state;                        //SCADE//
};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int trackused(struct railway_system *railway, int track)
{
   return ((int)SIM_c.out_controllerFeedbackSensor.extTrackData[track].
	        track_occupied);                                    //SCADE//
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int getspeed(struct railway_system *railway, int track)
{
   return ((int)SIM_c.out_controllerFeedbackSensor.extTrackData[track].
	        speed_out);                                         //SCADE//
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
char *getblockname(struct railway_system *railway, int block)
{
  return(getTrackName(block));
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int railway_waitcycle(struct railway_system *railway, unsigned *reference)
{
  int startcycle = CYCLE;

  while (startcycle == CYCLE) usleep(5);
  *reference = CYCLE;
  return(startcycle);
}


//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int railway_newcycle(struct railway_system *railway, unsigned *reference)
{
  unsigned oldref;
  if (!railway_alive(railway)) {
    return(-1);
  }
  oldref=*reference;
  *reference=CYCLE;
  return((*reference!=oldref)?1:0);
}


//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
void setgatesignal(struct railway_system *railway, int signal, int lights)
{
   setsignal(railway, 48, signal, lights);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
unsigned getgatesignal(struct railway_system *railway, int signal)
{
  // not implemented in simulation //
  return(OFF);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int contactexists(struct railway_system *railway, int block, int contact)
{
	if ((block == 0)||
        (block == 7)||
        (block == 11)||
        (block == 24)||
        (block == 30)||
        (block == 33)||
        (block == 40)||
        (block == 44)) {
		 return 0;
	}
	return 1;
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
unsigned getcontactref(struct railway_system *railway, int block, int contact,
		       unsigned *reference, int clear)
{
  // not implemented in simulation //
  return(NONE);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
void clearcontact(struct railway_system *railway, int block, int contact)
{
  MEM_clearall_contact(block, contact);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
unsigned getgatesensor(struct railway_system *railway, int gatesensor,
		       int clear)
{
  // not implemented in simulation //
  return(NONE);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
unsigned scangatesensor(struct railway_system *railway, int *gatesensor,
			int clear)
{
  // not implemented in simulation //
  return(NONE);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
unsigned getgatesensorref(struct railway_system *railway, int gatesensor,
			  unsigned *reference, int clear)
{
  // not implemented in simulation //
  return(NONE);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
void cleargatesensor(struct railway_system *railway, int gatesensor)
{
  // not implemented in simulation //
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
void gettrack(struct railway_system *railway, int block, unsigned *mode,
	      unsigned *target)
{
  // not implemented in simulation //
  if (mode) *mode=OFF;
  if (target) *target=PWM|0;
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int getpoint(struct railway_system *railway, int point)
{
  // not implemented in simulation //
  return(STRAIGHT);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int getlight(struct railway_system *railway, int light)
{
  // not implemented in simulation //
  return(OFF);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
void setgate(struct railway_system *railway, int gate, int state)
{
   if (state == UP)   setsignal(railway, 48, 0, 4); // open == green
   if (state == DOWN) setsignal(railway, 48, 0, 1); // closed == red
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int getgate(struct railway_system *railway, int gate)
{
  // not implemented in simulation //
  return(DOWN);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
void setbell(struct railway_system *railway, int bell, int state)
{
  // not implemented in simulation //
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int getbell(struct railway_system *railway, int bell)
{
  // not implemented in simulation //
  return(OFF);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int trackshutdown(struct railway_system *railway, int block)
{
   return ((int)SIM_c.out_controllerFeedbackSensor.extTrackData[block].
        track_shutdown);                                        //SCADE//
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int tracknewdata(struct railway_system *railway, int block,
		 unsigned *reference)
{
   return ((int)SIM_c.out_controllerFeedbackSensor.extTrackData[block].
        speed_newdata);                                         //SCADE//
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int diagstuckcontact(struct railway_system *railway, int *block,
			    int *contact, int clear)
{
  // not implemented in simulation //
  return(NONE);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int diagfailedcontact(struct railway_system *railway, int *block,
		      int *contact, int *first, int *second, int clear)
{
  // not implemented in simulation //
  return(0);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int diagshutdowntrack(struct railway_system *railway, int *block,
		      int *count, int clear)
{
  // not implemented in simulation //
  return(0);
}

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
int diagresetnode(struct railway_system *railway, int *node,
		  int *mclr, int *wdt, int *bod, int clear)
{
  // not implemented in simulation //
  return(0);
}

//----------------------------------------------------------------------------
