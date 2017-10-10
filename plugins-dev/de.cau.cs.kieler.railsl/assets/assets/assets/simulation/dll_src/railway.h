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
//==  ~~~^~~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~  ==//
//==                                                                       ==//
//===========================================================================//

/*! \file railway.h

 The Railway Simulation C-Interface includes the SCADE generated c-code for
 the simulation and offers a similar interface to c-programs that Steffan
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

#ifndef _RAILWAYSIMU_H_
#define _RAILWAYSIMU_H_

//----------------------------------------------------------------------------
//--                            I N C L U D E S                             --
//----------------------------------------------------------------------------

//include system headers
#include <stdio.h>
#include <sys/types.h>
#include <sys/time.h>
#include <string.h>
#include <unistd.h>
//#include <netdb.h>
#include <stdlib.h>

#include "../RailwaySimuSCADE/Simulation_simulation.h" //SCADE//


//----------------------------------------------------------------------------
//--                        G L O B A L     D A T A                         --
//----------------------------------------------------------------------------


//some makro definitions for the log / debug text output

//! the struct simulation_comtact that represents one reed contact pair
//! and can hold a history of 20 contact events for each contact with the
//! direction only from the last one
typedef struct {
	char contact0[20];
	char contact1[20];
	int  dircontact0;
	int  dircontact1;
} simulation_contact;

//! the struct simulation_memory that holds the reed contact information for
//! all 48 track segments until they are consumed
typedef struct {
  simulation_contact block[47];
} simulation_memory;

//! the above struct is used for SIM_memory
simulation_memory SIM_memory;

//! SCADE variable declarations for a cycle
outC_Simulation_simulation SIM_c;					//!< all outcoming data //SCADE//
controllerCommands_simulation SIM_commands;	        //!< all incoming data  //SCADE//
inC_Simulation_simulation SIM_commands_wrapper;                             //SCADE//


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
void MEM_set_new_contact(int block, int contact, int direction);

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
int MEM_istriggered_contact(int block, int contact);

//----------------------------------------------------------------------------
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
int MEM_iscurrent_event(int block, int contact);

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
int MEM_get_contact(int block, int contact);

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
void MEM_clear_contact(int block, int contact);

//----------------------------------------------------------------------------
//! erases all contact events for a block and a contact number of the
//! according queue
//!
//! @param block
//!				integer id (constant) of the block
//!	@param contact
//!				0 for the first one in driving direction, 1 for the second one
//!
void MEM_clearall_contact(int block, int contact);

//----------------------------------------------------------------------------
//! erases all contact events for all blocks and resets the whole contact
//! memory
void MEM_reset_contacts();

//----------------------------------------------------------------------------
//--        G U I - T C P / I P - S E R V E R    F U N C T I O N S          --
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
//! sends the character buffer to an opened socket
//!
//! @param fd
//!				file pointer to (prior) opened socket
//! @param buffer
//!				text characters to send over open socket
//! @return
//!				1 if successful, 0 otherwise
//!
int tcp_server_send(int fd, char buffer[]);

//----------------------------------------------------------------------------
//! blocking receive to an opened socket
//!
//! @param fd
//!				file pointer to (prior) opened socket
//! @param buffer
//!				text characters received over open socket
//! @param n
//!				number of text characters to receive
//! @return
//!				number of bytes received
//!
int tcp_server_receive(int fd, char buffer[], size_t n);

//----------------------------------------------------------------------------
//! tries to open a server socket on a given port. the socket id to use with
//! the above functions will be returned
//!
//! @param port
//!				tcp port to listen for
//! @return
//!				file pointer to opened socket for use with send/receive
//!				functions
//!
int tcp_server_init(int port);

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
char* motormodeText(int num);

//----------------------------------------------------------------------------
//! the following function convert integer reprentation of enums from SCADE to
//! the textual representation that the ModelGUI understands
//!
//! @param num
//!				integer representation of SCADE's enum value
//! @return
//!				text representation of SCADE's enum value
//!
char* pointsText(int num);

//----------------------------------------------------------------------------
//! the following function convert integer reprentation of enums from SCADE to
//! the textual representation that the ModelGUI understands
//!
//! @param num
//!				integer representation of SCADE's enum value
//! @return
//!				text representation of SCADE's enum value
//!
char* signalsText(int num);

//----------------------------------------------------------------------------
//! the following function convert integer reprentation of enums from SCADE to
//! the textual representation that the ModelGUI understands
//!
//! @param num
//!				integer representation of SCADE's enum value
//! @return
//!				text representation of SCADE's enum value
//!
char* errorText(int num);

//----------------------------------------------------------------------------
//! converts a float number to a char
//!
//! @param float_num
//!				number to convert to characters
//! @dest
//!				buffer to write resulting characters to
//!
void myfloattochar(float float_num, char* dest);

//----------------------------------------------------------------------------
//--             D L L    A P I   M A I N   F U N C T I O N S               --
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
//! make a simulation step
extern void stepSimulation();

//----------------------------------------------------------------------------
//! returns the simulation data
extern char* getVisualizationData();

//----------------------------------------------------------------------------
//! returns the current simulation tick
//!
//! @return
//!				current simulation cycle tick
//!
extern int getSimulationTick();

//----------------------------------------------------------------------------
//! set all switch points to straight, all motormodes to off, all speeds to 0
//! and all signal lights to red
extern void resetRailwayHardware();

//----------------------------------------------------------------------------
//! set an initial train for a given block id
//!
//! @param block
//!				integer id (constant) of the block
//!
extern void setInitialTrain(int block);

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
extern void setInitialTrainEx(int block, int alignment);

//----------------------------------------------------------------------------
//! reset/clears all initial trains
//!
extern void resetInitialTrains();

//----------------------------------------------------------------------------
//! resets the cycles the contact memory the initial trains and the
//! railway hardware and restarts the simulation
extern void resetSimulation();

//----------------------------------------------------------------------------
//! just restart the simulation by clearing the contact memory and resetting
//! the cycles
extern void restartSimulation();

//----------------------------------------------------------------------------
//! this function creates a concurrent executed thread that will do all
//! simulation steps and communicate with the ModelGUI. The thread can be
//! stopped by calling abortSimulation().
//!
//! @param port
//!				port that is going to be made available for the ModelGUI to
//!				connect to
//!
extern void initSimulation();


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
extern int getTrackNum(char* trackname);

//----------------------------------------------------------------------------
//! convert a trackname or number from char to an integer representation
//!
//! @param trackname
//!				textual representation of the track segment
//! @return
//!				integer representation (constant) of the track segment
//!
extern char* getTrackName(int tracknum);


//----------------------------------------------------------------------------
//--                  R A I L W A Y    I N T E R F A C E                    --
//----------------------------------------------------------------------------
// the following functions are abutted to the c library of the model
// railway written by stephan hoermann
// their use is documented in his diploma thesis

#define OFF 0     //!< see s. hoermann diploma thesis
#define RED 1     //!< see s. hoermann diploma thesis
#define YELLOW 2  //!< see s. hoermann diploma thesis
#define GREEN 4   //!< see s. hoermann diploma thesis

#define ON  1     //!< see s. hoermann diploma thesis
#define OFF 0     //!< see s. hoermann diploma thesis
#define FWD 1     //!< see s. hoermann diploma thesis
#define REV 2     //!< see s. hoermann diploma thesis
#define BRAKE 3   //!< see s. hoermann diploma thesis
#define PWM 0     //!< see s. hoermann diploma thesis
#define SPEED 128 //!< see s. hoermann diploma thesis

#define DOWN 0    //!< see s. hoermann diploma thesis
#define UP 1      //!< see s. hoermann diploma thesis

#define NONE 0    //!< see s. hoermann diploma thesis
#define UNI 3     //!< see s. hoermann diploma thesis

#define STRAIGHT 0   //!< see s. hoermann diploma thesis
#define BRANCH 1     //!< see s. hoermann diploma thesis

#define IC_JCT_0 0   //!< track segment constant
#define IC_LN_0 1    //!< track segment constant
#define IC_LN_1 2    //!< track segment constant
#define IC_LN_2 3    //!< track segment constant
#define IC_LN_3 4    //!< track segment constant
#define IC_LN_4 5    //!< track segment constant
#define IC_LN_5 6    //!< track segment constant
#define IC_ST_0 7    //!< track segment constant
#define IC_ST_1 8    //!< track segment constant
#define IC_ST_2 9    //!< track segment constant
#define IC_ST_3 10   //!< track segment constant
#define IC_ST_4 11   //!< track segment constant
#define IO_LN_0 12   //!< track segment constant
#define IO_LN_1 13   //!< track segment constant
#define IO_LN_2 14   //!< track segment constant
#define KH_LN_0 15   //!< track segment constant
#define KH_LN_1 16   //!< track segment constant
#define KH_LN_2 17   //!< track segment constant
#define KH_LN_3 18   //!< track segment constant
#define KH_LN_4 19   //!< track segment constant
#define KH_LN_5 20   //!< track segment constant
#define KH_LN_6 21   //!< track segment constant
#define KH_LN_7 22   //!< track segment constant
#define KH_LN_8 23   //!< track segment constant
#define KH_ST_0 24   //!< track segment constant
#define KH_ST_1 25   //!< track segment constant
#define KH_ST_2 26   //!< track segment constant
#define KH_ST_3 27   //!< track segment constant
#define KH_ST_4 28   //!< track segment constant
#define KH_ST_5 29   //!< track segment constant
#define KH_ST_6 30   //!< track segment constant
#define KIO_LN_0 31  //!< track segment constant
#define KIO_LN_1 32  //!< track segment constant
#define OC_JCT_0 33  //!< track segment constant
#define OC_LN_0 34   //!< track segment constant
#define OC_LN_1 35   //!< track segment constant
#define OC_LN_2 36   //!< track segment constant
#define OC_LN_3 37   //!< track segment constant
#define OC_LN_4 38   //!< track segment constant
#define OC_LN_5 39   //!< track segment constant
#define OC_ST_0 40   //!< track segment constant
#define OC_ST_1 41   //!< track segment constant
#define OC_ST_2 42   //!< track segment constant
#define OC_ST_3 43   //!< track segment constant
#define OC_ST_4 44   //!< track segment constant
#define OI_LN_0 45   //!< track segment constant
#define OI_LN_1 46   //!< track segment constant
#define OI_LN_2 47   //!< track segment constant


//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
struct railway_hardware kicking;

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
struct railway_system {
  int dummy;
};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
struct railway_hardware {
};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! In this function the GUI port is extracted from the optional config file
//! and the simulation is initialized with that GUI port or with the
//! default one if no configuration file was found. It returns only a
//! dummy railway struct which is not used simulation wide.
//!
extern struct railway_system *railway_initsystem(struct railway_hardware
													*hardware);

//----------------------------------------------------------------------------
//int railway_setlink (struct railway_system *railway, unsigned node,
//					  struct nodelink *link) {
//};

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! Just a dummy function with no use for the simulation.
//!
extern int railway_openlinks_can(struct railway_system *railway,
								char candevice,  char *device);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! Just a dummy function with no use for the simulation.
//!
extern int railway_openlinks_udp(struct railway_system *railway,
						  char *hostformat, char *device);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! Just a dummy function with no use for the simulation.
//!
extern int railway_startcontrol(struct railway_system *railway,
						 unsigned mincycle, unsigned maxcycle);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! This function aborts the simulation thread and terminates the connection
//! between the ModelGUI and this thread.
//!
extern int railway_stopcontrol(struct railway_system *railway, int reset);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! Just a dummy function with no use for the simulation.
//!
extern int railway_closelinks(struct railway_system *railway);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! Just a dummy function with no use for the simulation.
//!
extern int railway_donesystem(struct railway_system *railway);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
//! This function will return the status of a connected/disconnected ModelGUI
//!
extern int railway_alive(struct railway_system *railway);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern void setlight(struct railway_system *railway, int lightnum, int ONOFF);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int signalexists(struct railway_system *railway, int block, int signal);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern void setsignal(struct railway_system *railway, int block, int signal,
	           int lights);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern void settrack(struct railway_system *railway, int track, unsigned mode,
              unsigned target);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern unsigned getcontact(struct railway_system *railway, int block,
					int contact, int clear);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern unsigned scancontact(struct railway_system *railway, int *block,
					int *contact, int clear);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern void setpoint(struct railway_system *railway, int point, int state);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int trackused(struct railway_system *railway, int track);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int getspeed(struct railway_system *railway, int track);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern char *getblockname(struct railway_system *railway, int block);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int railway_waitcycle(struct railway_system *railway,
							unsigned *reference);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int railway_newcycle(struct railway_system *railway,
							unsigned *reference);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern void setgatesignal(struct railway_system *railway, int signal,
						int lights);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern unsigned getgatesignal(struct railway_system *railway, int signal);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int contactexists(struct railway_system *railway, int block,
						int contact);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern unsigned getcontactref(struct railway_system *railway, int block,
				int contact, unsigned *reference, int clear);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern void clearcontact(struct railway_system *railway, int block,
						int contact);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern unsigned getgatesensor(struct railway_system *railway, int gatesensor,
		       int clear);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern unsigned scangatesensor(struct railway_system *railway, int *gatesensor,
			int clear);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern unsigned getgatesensorref(struct railway_system *railway,
				int gatesensor,  unsigned *reference, int clear);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern void cleargatesensor(struct railway_system *railway, int gatesensor);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern void gettrack(struct railway_system *railway, int block, unsigned *mode,
	      unsigned *target);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int getpoint(struct railway_system *railway, int point);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int getlight(struct railway_system *railway, int light);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern void setgate(struct railway_system *railway, int gate, int state);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int getgate(struct railway_system *railway, int gate);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern void setbell(struct railway_system *railway, int bell, int state);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int getbell(struct railway_system *railway, int bell);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int trackshutdown(struct railway_system *railway, int block);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int tracknewdata(struct railway_system *railway, int block,
		 unsigned *reference);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int diagstuckcontact(struct railway_system *railway, int *block,
			    int *contact, int clear);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int diagfailedcontact(struct railway_system *railway, int *block,
		      int *contact, int *first, int *second, int clear);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int diagshutdowntrack(struct railway_system *railway, int *block,
		      int *count, int clear);

//----------------------------------------------------------------------------
//! see s. hoermann diploma thesis
//!
extern int diagresetnode(struct railway_system *railway, int *node,
		  int *mclr, int *wdt, int *bod, int clear);

//----------------------------------------------------------------------------

#endif /* _RAILWAYSIMU_H_ */
