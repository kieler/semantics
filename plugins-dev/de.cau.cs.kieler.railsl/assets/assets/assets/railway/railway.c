//===========================================================================//
//==             R T S Y S   M O D E L   R A I L W A Y   A P I             ==//
//==                   R A I L W A Y   I N T E R F A C E                   ==//
//==                                                                       ==//
//==   by Nis Börge Wechselberg, Christian-Albrechts-University Kiel       ==//
//==                                                                       ==//
//==   Artwork by:                                                         ==//
//==   by Christian Motika, SS 2014, Christian-Albrechts-University Kiel   ==//
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
#include "railway.h"

/* Initialize the control structure to communicate with a given railway system
   described by (hardware). */
struct railway_system *railway_initsystem(
  __attribute__ ((unused)) struct railway_hardware *hardware) {
  struct railway_system *railway = malloc(sizeof(railway_system_t));
  railway->addresses = initAddressSpace();

  return railway;
}

/* Open all nodelinks required to operate the system with one function
   call. (hostformat) is a printf format string that forms the common base for
   all hostnames. A single %i is allowed in this string and will be expanded
   to the node number (example: "node%02i.rtsys"). (device) is the name of the
   remote serial port. This function will return 0 on success, in case of a
   failure it will print an error message, return -1/errno and close all
   previously opened links. */
int railway_openlinks_udp(
    __attribute__ ((unused)) struct railway_system *railway,
    __attribute__ ((unused)) char *hostformat,
    __attribute__ ((unused)) char *device) {
  size_t i;
  char *config;

  for (i = 0; i < 4; ++i) {
    railway->railPi[i] = connectRaspi(i);
    config = getRaspiConfig(railway->railPi[i]);
    // printf("%s\n",config);
    parseConfigToAddresses(config,railway->addresses, i);
  }

  return 0;
}

/* Start the system (and the control thread) after all nodelinks have been
   registered. The thread will try to keep the cycle execution time between
   mincycle and maxcycle microseconds. Both values may be set to zero, this
   will cause the thread to execute cycles as fast as possible and to use the
   nodelink's timeouts as an upper limit. Returns 0 on success and -1/errno on
   failure. */
int railway_startcontrol(
    __attribute__ ((unused)) struct railway_system *railway,
    __attribute__ ((unused)) unsigned mincycle,
    __attribute__ ((unused)) unsigned maxcycle){
 size_t i;

  for (i = 0; i < 4; ++i) {
    raspiConnectArduino(railway->railPi[i]);
  }

  return 0;
}

/* Stop the system (and the control thread), send disconnect commands to all
   nodes and reset them if desired. Be careful with this option: if the the
   system stops uncontrolled, there might be trains standing on points. A
   reset (or restart) in this situation might force such trains off the
   track. Returns 0 on success and -1/errno on failure. */
int railway_stopcontrol(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int reset){
 size_t i;

  for (i = 0; i < 4; ++i) {
    raspiDisconnectArduino(railway->railPi[i]);
  }

  return 0;
}

/* Test if the system is alive. The system may shut itself down if there are
   too many communication errors. An application should poll this flag in
   regular intervals and react if the system is not alive any more. */
int railway_alive(
  __attribute__ ((unused)) struct railway_system *railway) {
  // TODO STUB
  return 1;
}

/* Close all nodelinks that are registered with the control system. The system
   must be stopped for this to work, all successfully closed nodelinks will be
   unregistered (set to NULL) in the linktable. Returns 0 on success and -1 on
   errors, errno is set by the last registered error. */
int railway_closelinks(
  __attribute__ ((unused)) struct railway_system *railway){
  size_t i;

  for (i = 0; i < 4; ++i) {
    close(railway->railPi[i].socket);
  }

  return 0;
}

/* Destroy the control structure, free used memory. This function may only be
   called if the system is not running. Nodelinks are not closed, this must be
   done prior to this call by railway_closelinks or at any other time by the
   application itself. */
int railway_donesystem(
  __attribute__ ((unused)) struct railway_system *railway){
  return 0;
}

/* Query if a specific block signal exists */
int signalexists(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int block,
  __attribute__ ((unused)) int signaln) {
  portAddress_t address = railway->addresses->signals[2*block + (signaln & 0x01)];
  return (strlen(address.arduinoSerial) > 0);
}

/* Set one or more signals to a given color combination.

     (lights)  bitwise or of the constants RED, YELLOW and GREEN
     (block)   is the number of the block containing the signal
     (signal)  the number inside the block (0=beginning, 1=end of the
               block regarding the main direction)

   A value of -1 for (block) and/or (signal) acts as a wildcard and makes it
   possible to set a group of signals with only one command. */
void setsignal(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int block,
  __attribute__ ((unused)) int signaln,
  __attribute__ ((unused)) int lights) {
  portAddress_t address = railway->addresses->signals[2*block + (signaln & 0x01)];

  if (signalexists(railway,block,signaln)) {
  setRaspiSignal(railway->railPi[address.railPiNumber],
                address.arduinoSerial,
                address.componentPort,
                lights);
	}
}

/* Read the current color combination of a signal.

     (block)   is the number of the block containing the signal
     (signal)  the number inside the block (0=beginning, 1=end of the
               block regarding the main direction)

   A value of -1 for (block) and/or (signal) acts as a wildcard. The function
   will return the state of the first matching signal in this case. */
unsigned getsignal(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int block,
  __attribute__ ((unused)) int signaln) {
  // TODO STUB
  return 0;
}

/* Set one or more traffic lights at a crossing.

     (signal)    signal number
     (lights)    bitwise or of the constants RED, YELLOW and GREEN

   A value of -1 for (signal) acts as a wildcard and makes it possible to set
   a group of traffic lights with only one command. */
void setgatesignal(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int signaln,
  __attribute__ ((unused)) int lights) {

}

/* Get the status one traffic light at a crossing.

     (signal)    signal number

   A value of -1 for (signal) acts as a wildcard. The function will return the
   state of the first matching traffic light in this case. */
unsigned getgatesignal(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int signaln) {
  return 0;
}

/* Query if a specific contact exists */
int contactexists(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int block,
  __attribute__ ((unused)) int contact) {
  portAddress_t address = railway->addresses->contacts[2*block + (contact & 0x01)];

  return (strlen(address.arduinoSerial) > 0);
}

/* Read the status of one contact pair in the system.

   (block)    block  number containing the signal
   (contact)  contact number inside the block (0=beginning, 1=end of the
              block regarding the main direction)
   (clear)    a nonzero value will remove the contact event from the buffer
              after reading

   Return values are NONE, FWD, REV or UNI as described below.

     NONE - not triggered
     FWD  - a train has passed the contact while driving forward
     REV  - dito, but with reverse direction
     UNI  - triggered, but the direction could not be detected (caused by
            unidirectional sensors, reed contact failures and too long
      polling intervals, see below)

   It is possible to use a value of -1 for (block) and/or (contact), the
   function will scan all contacts for an event in this case and return the
   first match. It doesn't make much sense to do this with function getcontact
   because it cannot return the location of the contact. Use the otherwise
   identical scancontact for such cases, which will set the call by reference
   parameters to the contact location.

   The function getcontactref works mostly like getcontact, but it uses a user
   supplied reference to determine which events are new. This allows an
   alternate control flow to parse events that the main program has already
   processed and cleared. The reference must be initialized to zero and will
   be updated by any call to this function. The caller should be aware that
   the history of directions is only one level deep. Events that are older
   will be reported as UNI instead of FWD or REV. */
unsigned getcontact(struct railway_system *railway, int block, int contact, int clear) {
  portAddress_t address = railway->addresses->contacts[2*block + (contact & 0x01)];

	if (contactexists(railway,block,contact)) {
		//printf("Requesting contact %i, %i\n",block,contact);
		return getRaspiContact( railway->railPi[address.railPiNumber],
                          address.arduinoSerial,
                          address.componentPort,
                          clear);
	} else {
		return 0;
	}
}

/* Remove all contact events from the buffer for a given contact pair. It is
   also possible to use -1 as a wildcard for (block) and (contact) to clear
   whole groups of contacts. */
void clearcontact(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int block,
  __attribute__ ((unused)) int contact) {
  // TODO STUB
}

/* Sensors at the gates of crossings can detect if the gate is open or the
   boom is down, and they are used exactly like the reed contact
   sensors. Whenever the gate is completely closed, the sensor returns a FWD
   reading. If the boom leaves this position, the sensor reports REV. Keep in
   mind that the gate sensors are filtered like contacts and ignore events
   that happen too fast. So the gate must stay open or closed for a short
   period of time before new events can be detected. */
unsigned getgatesensor(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int gatesensor,
  __attribute__ ((unused)) int clear) {
  return 0;
}

void cleargatesensor(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int gatesensor) {
  // TODO STUB
}

/* Set the state of one or more track drivers.
     (block)   block number of the track
     (mode)    driver mode, one of TOFF,TFWD,TREV,TBRAKE
     (target)  speed setting, bitwise or of one of the constants TPWM or
               TSPEED and a speed value between 0 and 127.
   A value of -1 for (block) acts as a wildcard and makes it possible to set
   all tracks with only one command. */
void settrack(struct railway_system *railway, int track, unsigned mode, unsigned target) {
  portAddress_t address = railway->addresses->tracks[track];
  setRaspiTrack(railway->railPi[address.railPiNumber],
                address.arduinoSerial,
                address.componentPort,
                mode,
                target*2);
}

/* Get the state of one track driver. A (block) value of -1 will return the
   state of the first matching track. */
void gettrack(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int track,
  __attribute__ ((unused)) unsigned *mode,
  __attribute__ ((unused)) unsigned *target) {
  // TODO STUB
}

/* Set the state of one or more points.
   (point)   the point number
   (state)   new state, STRAIGHT (=0) or BRANCH (!=0)
   A value of -1 for (point) acts as a wildcard and makes it possible to set
   all points with only one command. */
void setpoint(struct railway_system *railway, int point, int state) {
  portAddress_t address = railway->addresses->points[point];
  setRaspiPoint(railway->railPi[address.railPiNumber],
                address.arduinoSerial,
                address.componentPort,
                state);
}

/* Get the state of one point. A (point) value of -1 will return the state of
   the first matching point. */
int getpoint(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int point) {
  // TODO STUB
  return 0;
}

/* Set the state of one or more lights.

   (light)   the light number
   (state)   new state, OFF (=0) or ON (!=0)

   A value of -1 for (light) acts as a wildcard and makes it possible to set
   all lights with only one command. */
void setlight(struct railway_system *railway, int light, int state) {
  portAddress_t address = railway->addresses->lights[light];
  setRaspiPoint(railway->railPi[address.railPiNumber],
                address.arduinoSerial,
                address.componentPort,
                state);
}

/* Get the state of one light. A (light) value of -1 will return the state of
   the first matching light. */
int getlight(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int light) {
  // TODO STUB
  return 0;
}

/* Set the state of one or more crossing gates.

   (gate)      gate number
   (state)     new state, UP (=0) or DOWN (!=0)

   A value of -1 (gate) acts as a wildcard and makes it possible to set a
   group of gates with only one command. */
void setgate(struct railway_system *railway, int gate, int state) {
  portAddress_t address = railway->addresses->gates[gate];
  setRaspiPoint(railway->railPi[address.railPiNumber],
                address.arduinoSerial,
                address.componentPort,
                state);
}

/* Get the state of one gate. A value of -1 for (gate) acts as a wildcard. The
   function will return the state of the first matching gate in this case. */
int getgate(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int gate) {
  // TODO STUB
  return 0;
}

/* Set the state of one or more bells.

   (bell)      bell number
   (state)     new state, OFF (=0) or ON (!=0)

   A value of -1 for (bell) acts as a wildcard and makes it possible to set a
   group of bells with only one command. */
void setbell(struct railway_system *railway, int bell, int state) {
  portAddress_t address = railway->addresses->bells[bell];
  setRaspiPoint(railway->railPi[address.railPiNumber],
                address.arduinoSerial,
                address.componentPort,
                state);
}

/* Get the state of one bell. A value of -1 for (bell) acts as a wildcard. The
   function will return the state of the first matching bell in this case. */
int getbell(
  __attribute__ ((unused)) struct railway_system *railway,
  __attribute__ ((unused)) int bell) {
  // TODO STUB
  return 0;
}

// Copyed and extended from Simulation interface:
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
   if (strcmp(trackname,"I1") == 0) return 8;
   if (strcmp(trackname,"I2") == 0) return 9;
   if (strcmp(trackname,"I3") == 0) return 10;
   if (strcmp(trackname,"K1") == 0) return 25;
   if (strcmp(trackname,"K2") == 0) return 26;
   if (strcmp(trackname,"K3") == 0) return 27;
   if (strcmp(trackname,"K4") == 0) return 28;
   if (strcmp(trackname,"K5") == 0) return 29;
   if (strcmp(trackname,"O1") == 0) return 41;
   if (strcmp(trackname,"O2") == 0) return 42;
   if (strcmp(trackname,"O3") == 0) return 43;
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
