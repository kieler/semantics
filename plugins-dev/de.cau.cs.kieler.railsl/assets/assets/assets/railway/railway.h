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
#ifndef RAILWAY_H
#define RAILWAY_H

#include "addressing.h"
#include "railPi.h"

/* Kept for compatibility purpose */
struct railway_hardware {};

/* Main data structure that contains all information and control structures
   needed to operate the system. This structure will be used like a handle for
   all other functions. */
struct railway_system {
  portConfig_t        *addresses;
  railPi_connector_t  railPi[4];
};
typedef struct railway_system railway_system_t;

/* Initialize the control structure to communicate with a given railway system
   described by (hardware). */
struct railway_system *railway_initsystem(struct railway_hardware *hardware);

/* Open all nodelinks required to operate the system with one function
   call. (hostformat) is a printf format string that forms the common base for
   all hostnames. A single %i is allowed in this string and will be expanded
   to the node number (example: "node%02i.rtsys"). (device) is the name of the
   remote serial port. This function will return 0 on success, in case of a
   failure it will print an error message, return -1/errno and close all
   previously opened links. */
int railway_openlinks_udp(struct railway_system *railway, char *hostformat, char *device);

/* Start the system (and the control thread) after all nodelinks have been
   registered. The thread will try to keep the cycle execution time between
   mincycle and maxcycle microseconds. Both values may be set to zero, this
   will cause the thread to execute cycles as fast as possible and to use the
   nodelink's timeouts as an upper limit. Returns 0 on success and -1/errno on
   failure. */
int railway_startcontrol(struct railway_system *railway, unsigned mincycle, unsigned maxcycle);

/* Stop the system (and the control thread), send disconnect commands to all
   nodes and reset them if desired. Be careful with this option: if the the
   system stops uncontrolled, there might be trains standing on points. A
   reset (or restart) in this situation might force such trains off the
   track. Returns 0 on success and -1/errno on failure. */
int railway_stopcontrol(struct railway_system *railway, int reset);

/* Test if the system is alive. The system may shut itself down if there are
   too many communication errors. An application should poll this flag in
   regular intervals and react if the system is not alive any more. */
int railway_alive(struct railway_system *railway);

/* Close all nodelinks that are registered with the control system. The system
   must be stopped for this to work, all successfully closed nodelinks will be
   unregistered (set to NULL) in the linktable. Returns 0 on success and -1 on
   errors, errno is set by the last registered error. */
int railway_closelinks(struct railway_system *railway);

/* Destroy the control structure, free used memory. This function may only be
   called if the system is not running. Nodelinks are not closed, this must be
   done prior to this call by railway_closelinks or at any other time by the
   application itself. */
int railway_donesystem(struct railway_system *railway);


/* ---- high level peripheral access -------------------------------------- */

/* Query if a specific block signal exists */
int signalexists(struct railway_system *railway, int block, int signaln);

/* Set one or more signals to a given color combination.

     (lights)  bitwise or of the constants RED, YELLOW and GREEN
     (block)   is the number of the block containing the signal
     (signal)  the number inside the block (0=beginning, 1=end of the
               block regarding the main direction)

   A value of -1 for (block) and/or (signal) acts as a wildcard and makes it
   possible to set a group of signals with only one command. */
#define RED     4
#define YELLOW  2
#define GREEN   1
void setsignal(struct railway_system *railway, int block, int signaln, int lights);

/* Read the current color combination of a signal.

     (block)   is the number of the block containing the signal
     (signal)  the number inside the block (0=beginning, 1=end of the
               block regarding the main direction)

   A value of -1 for (block) and/or (signal) acts as a wildcard. The function
   will return the state of the first matching signal in this case. */
unsigned getsignal(struct railway_system *railway, int block, int signaln);

/* Set one or more traffic lights at a crossing.

     (signal)    signal number
     (lights)    bitwise or of the constants RED, YELLOW and GREEN

   A value of -1 for (signal) acts as a wildcard and makes it possible to set
   a group of traffic lights with only one command. */
void setgatesignal(struct railway_system *railway, int signaln, int lights);

/* Get the status one traffic light at a crossing.

     (signal)    signal number

   A value of -1 for (signal) acts as a wildcard. The function will return the
   state of the first matching traffic light in this case. */
unsigned getgatesignal(struct railway_system *railway, int signaln);

/* Query if a specific contact exists */
int contactexists(struct railway_system *railway, int block, int contact);

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
#define NONE   0
#define FWD    1
#define REV    2
#define UNI    3
unsigned getcontact(struct railway_system *railway, int block, int contact, int clear);

/* Remove all contact events from the buffer for a given contact pair. It is
   also possible to use -1 as a wildcard for (block) and (contact) to clear
   whole groups of contacts. */
void clearcontact(struct railway_system *railway, int block, int contact);

/* Sensors at the gates of crossings can detect if the gate is open or the
   boom is down, and they are used exactly like the reed contact
   sensors. Whenever the gate is completely closed, the sensor returns a FWD
   reading. If the boom leaves this position, the sensor reports REV. Keep in
   mind that the gate sensors are filtered like contacts and ignore events
   that happen too fast. So the gate must stay open or closed for a short
   period of time before new events can be detected. */
unsigned getgatesensor(struct railway_system *railway, int gatesensor, int clear);
void cleargatesensor(struct railway_system *railway, int gatesensor);

/* Set the state of one or more track drivers.
     (block)   block number of the track
     (mode)    driver mode, one of TOFF,TFWD,TREV,TBRAKE
     (target)  speed setting, bitwise or of one of the constants TPWM or
               TSPEED and a speed value between 0 and 127.
   A value of -1 for (block) acts as a wildcard and makes it possible to set
   all tracks with only one command. */
// #define OFF    0
// #define BRAKE  3
// #define PWM    0
// #define SPEED  128
void settrack(struct railway_system *railway, int track, unsigned mode, unsigned target);

/* Get the state of one track driver. A (block) value of -1 will return the
   state of the first matching track. */
void gettrack(struct railway_system *railway, int track, unsigned *mode, unsigned *target);

/* Set the state of one or more points.
   (point)   the point number
   (state)   new state, STRAIGHT (=0) or BRANCH (!=0)
   A value of -1 for (point) acts as a wildcard and makes it possible to set
   all points with only one command. */
#define STRAIGHT  1
#define BRANCH    0
void setpoint(struct railway_system *railway, int point, int state);

/* Get the state of one point. A (point) value of -1 will return the state of
   the first matching point. */
int getpoint(struct railway_system *railway, int point);

/* Set the state of one or more lights.

   (light)   the light number
   (state)   new state, OFF (=0) or ON (!=0)

   A value of -1 for (light) acts as a wildcard and makes it possible to set
   all lights with only one command. */
#define OFF       0
#define ON        1
void setlight(struct railway_system *railway, int light, int state);

/* Get the state of one light. A (light) value of -1 will return the state of
   the first matching light. */
int getlight(struct railway_system *railway, int light);

/* Set the state of one or more crossing gates.

   (gate)      gate number
   (state)     new state, UP (=0) or DOWN (!=0)

   A value of -1 (gate) acts as a wildcard and makes it possible to set a
   group of gates with only one command. */
#define UP    1
#define DOWN  0
void setgate(struct railway_system *railway, int gate, int state);

/* Get the state of one gate. A value of -1 for (gate) acts as a wildcard. The
   function will return the state of the first matching gate in this case. */
int getgate(struct railway_system *railway, int gate);

/* Set the state of one or more bells.

   (bell)      bell number
   (state)     new state, OFF (=0) or ON (!=0)

   A value of -1 for (bell) acts as a wildcard and makes it possible to set a
   group of bells with only one command. */
void setbell(struct railway_system *railway, int bell, int state);

/* Get the state of one bell. A value of -1 for (bell) acts as a wildcard. The
   function will return the state of the first matching bell in this case. */
int getbell(struct railway_system *railway, int bell);

extern int getTrackNum(char* trackname);
extern char* getTrackName(int tracknum);


#endif
