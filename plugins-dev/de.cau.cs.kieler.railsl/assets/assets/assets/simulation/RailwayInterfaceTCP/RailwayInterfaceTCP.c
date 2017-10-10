//===========================================================================//
//==    R A I L W A Y    S I M U L A T I O N    TCP - I N T E R F A C E    ==//
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
/*! \file RailwayInterfaceTCP.c

 This part of the java interface for the model railway simulation is the
 c part that communicates with JAVA over another TCP port.
 The functions are called by java routines that send a TCPcommand and
 following parameters (0-3, depending on the TCPcommand) and may in some
 cases wait for response data. The data from JAVA is allowed to arrive in
 a stream separated by end-of-line characters while command&parameters are
 separated by the character declared by TCPSEPARATOR.
 If more than one command arrives in a time the first one is consumed and
 handled and then the next ones are.

 The RailwayInterfaceTCP can also be used for controlling the REAL model
 railway. Therefore the #define SIMULATION has to be 0 instead of 1. Make
 sure that the other files like railway.h and kicking.h are made available
 properly. See Stephan H�rmann's diploma thesis for more information about
 compiling a C controller for the real model railway.

*/
//===========================================================================//

#define SIMULATION 1        //!< 1 for simulation, 0 for the real railway
#define DEBUG 0             //!< turn debug mode on or off

#define TCPSEPARATOR '#'  	//!< separates command and parameters
#define CONABORTCNT 10000   //!< specifies number of empty chars

//===========================================================================//

#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <sys/time.h>
#include <string.h>
#include <netdb.h>
#include <pthread.h>

#if SIMULATION == 1
  #include "railway.h"
#endif /* SIMULATION == 1 */
#if SIMULATION == 0
  #include "railway.h"          //adapt path if necessary
  #include "kicking.h"          //adapt path if necessary
#endif /* SIMULATION == 0 */

int INTERFACEALIVE = 0;		    //!< 1 if JAVA or PHP is connected
int ABORTINTERFACE = 0;		    //!< to abort this program
char INTERFACECLIENT[255];	    //!< host of the java/php client connected
int JAVAPORT;                   //!< tcp port for the java/php connection
struct railway_system *railway; //!< railway struct for system access


//redefine function here if for the real railway
#if SIMULATION == 0
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
int tcp_server_send(int fd, char buffer[])
{
    int result;
	result = send(fd, buffer, strlen(buffer), 1);
	return result;
}

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
int tcp_server_receive(int fd, char buffer[], size_t n)
{
    int bytes = 0;
	if (n > 0) bytes = recv(fd, buffer, n-1,0);
	if ((bytes == -1)&&(DEBUG)) perror("Receive failure");
	buffer[bytes] = '\0';
	return bytes;
}

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
int tcp_server_init(int port)
{
    struct sockaddr_in addr;
    int fd, flag;

    fd = socket(AF_INET, SOCK_STREAM, 0);
	flag = 1;
//    result = setsockopt(fd,				/* socket affected */
//                        IPPROTO_TCP,     /* set option at TCP level */
//                        TCP_NODELAY,     /* name of option */
//                        (char *) &flag,  /* the cast is historical cruft */
//                        sizeof(int));    /* length of option value */
    if ((fd == -1)&&(DEBUG)) perror("Could not create socket");

    addr.sin_port = htons(port);
    addr.sin_family = AF_INET;
    addr.sin_addr.s_addr = htonl(INADDR_ANY);

    if ((bind(fd, (struct sockaddr *) &addr, sizeof(addr)) == -1)&&(DEBUG))
		perror("Could not bind socket");

    if ((listen(fd,3) == -1)&&(DEBUG)) perror("Listen to socket failed");

    return fd;
}
#endif /* SIMULATION == 0 */


//----------------------------------------------------------------------------
//! title screen of this tcp simulation interface program
void printTitleScreen() {
  printf("+------------------------------------------------------------------------+\n");
  printf("|  R A I L W A Y    S I M U L A T I O N   J A V A  -  I N T E R F A C E  |\n");
  printf("+------------------------------------------------------------------------+\n");
  printf("|                                                                        |\n");
  printf("|                                     (@@@)     (@@@@@)                  |\n");
  printf("|                               (@@)     (@@@@@@@)        (@@@@@@@)      |\n");
  printf("|                         (@@@@@@@)   (@@@@@)       (@@@@@@@@@@@)        |\n");
  printf("|                    (@@@)     (@@@@@@@)   (@@@@@@)             (@@@)    |\n");
  printf("|               (@@@@@@)    (@@@@@@)                (@)                  |\n");
  printf("|           (@@@)  (@@@@)           (@@)                                 |\n");
  printf("|        (@@)              (@@@)                                         |\n");
  printf("|       .-.                                                              |\n");
  printf("|       ] [    .-.      _    .-----.                                     |\n");
  printf("|     .'   ''''   '''''' ''''| .--`                                      |\n");
  printf("|    (:--:--:--:--:--:--:--:-| [___    .------------------------.        |\n");
  printf("|     |     :  :  :  :  :  : [_9_] |'='|.----------------------.|        |\n");
  printf("|    /|.___________________________|___|'--.___.--.___.--.___.-'|        |\n");
  printf("|   / ||_.--.______.--.______.--._ |---\\'--\\-.-/==\\-.-/==\\-.-/-'/--  |\n");
  printf("|  /__;^=(==)======(==)======(==)=^~^^^ ^^^^(-)^^^^(-)^^^^(-)^^^         |\n");
  printf("|  ~~~^~~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~~  |\n");
  printf("|                                                                        |\n");
  printf("+------------------------------------------------------------------------+\n");
}

//----------------------------------------------------------------------------
//! aborts this program
void abortInterface() {
   ABORTINTERFACE = 1;
}

//----------------------------------------------------------------------------
//! consumes and handles the first command and all parameters and then deletes
//! it from tcpmessage. tcpcommand and tcpvar1...3 will hold the command and
//! parametes afterwards
//!
//!	@param tcpmessage
//!				one ore more tcp messages to parse (input)
//! @tcpcommand
//!				first command operation code (oputput)
//! @tcpvar1
//!				first parameter (oputput)
//! @tcpvar2
//!				second parameter (oputput)
//! @tcpvar3
//!				third parameter (oputput)
//!
void SplitCommand(char* tcpmessage, char* tcpcommand, char* tcpvar1,
				  char* tcpvar2, char* tcpvar3) {

  int c = 0, cc = 0;
  int count = 0;
  char vglchar = ' ';
  for (c = 0; c < strlen(tcpmessage); c++) {
     vglchar = tcpmessage[c];
	 if ((vglchar == TCPSEPARATOR)||(vglchar == '\0')||(vglchar == '\n')) {
		 switch(count) {
			 case 0: {tcpcommand[cc] = '\0'; break;}
			 case 1: {tcpvar1[cc] = '\0'; break;}
			 case 2: {tcpvar2[cc] = '\0'; break;}
			 case 3: {tcpvar3[cc] = '\0'; break;}
	     }//end switch
		 count++; cc = 0;
	 }
	 else if ((vglchar != '\r')&&(vglchar != '\n')) {
		 switch(count) {
			 case 0: {tcpcommand[cc] = vglchar; break;}
			 case 1: {tcpvar1[cc] = vglchar; break;}
			 case 2: {tcpvar2[cc] = vglchar; break;}
			 case 3: {tcpvar3[cc] = vglchar; break;}
	     }//end switch
         cc++;
	 }//end else if
	 if (vglchar == '\n') break;
  }//next c

  //delete first command from tcpmessage
  if (vglchar == '\n') {
	 cc = 0; c++;
     while(1) {
        tcpmessage[cc] = tcpmessage[c];
		if (tcpmessage[c] == '\0') break;
 		c++; cc++;
	}
  }//end if

}

//----------------------------------------------------------------------------
//! this function is intended to be called by initInterface() that creates a
//! separate concurrent thread for the interface communication over TCP.
//! Commands from java/php are processed one after another in an infinite
//! loop. The thread can be stopped by calling abortInterface().
//!
//! @param port
//!			not used anymore
//!
void* InterfaceServer(void* port) {

  struct in_addr addr_sender;
  struct sockaddr_in cli_info;
  int listen_sock, client, cli_size;
  char tcpmessage[1024];
  char tcpcommand[50];
  char tcpvar1[50], tcpvar2[50], tcpvar3[50];
  int  numbytes;
  char response[6800];
  int block, contact, e;
  int conabortcnt = 0;
  int tmpblock, found;

  //start the server
  if (DEBUG) printf("Starting INTERFACE server on port %d ... ",JAVAPORT);
  listen_sock = tcp_server_init(JAVAPORT);
  if (DEBUG) printf("OK\n");
  cli_size = sizeof(cli_info);

  while(1) {

   //wait for connection
   if (DEBUG) printf("Waiting for INTERFACE connection ...");
   client = accept(listen_sock, (struct sockaddr *) &cli_info, &cli_size);

   //copy connection information to INTERFACECLIENT and INTERFACEALIVE
   addr_sender = (struct in_addr)cli_info.sin_addr;
   sprintf(INTERFACECLIENT,"%s", inet_ntoa(addr_sender));
   INTERFACEALIVE = 1;
   if (DEBUG) printf(" INTERFACE CONNECTED\n");

   while (1) {
     if (DEBUG) printf("Waiting for INTERFACE command ...");
	 numbytes = 0;
     numbytes = tcp_server_receive(client, tcpmessage, 1024);
     if (numbytes == -1) break;
	 if (DEBUG) printf("> (%d) '%s'\n",numbytes,tcpmessage);
	 if (numbytes == 0) {
		 conabortcnt++;
		 if (conabortcnt > CONABORTCNT) {
			 break;
		 }
		 continue;
	 }
	 else
		 conabortcnt = 0;

     while (strcmp("",tcpmessage) != 0) {
	  //evaluate tcpmessage
      SplitCommand(tcpmessage, tcpcommand, tcpvar1, tcpvar2, tcpvar3);

	  //SETSIGNALS
	  if (strcmp("SETSIGNAL",tcpcommand) == 0) {
			//              block          signal         lights
  			setsignal(railway, atoi(tcpvar1), atoi(tcpvar2), atoi(tcpvar3));
	  }

	  //SETTRACK
	  if (strcmp("SETTRACK",tcpcommand) == 0) {
			//             track          mode           target
			settrack(railway, atoi(tcpvar1), atoi(tcpvar2), atoi(tcpvar3));
	  }

	  //SETPOINT
	  if (strcmp("SETPOINT",tcpcommand) == 0) {
			//             point          state
			setpoint(railway, atoi(tcpvar1), atoi(tcpvar2));
	  }

	  //GETCONTACT
	  if (strcmp("GETCONTACT",tcpcommand) == 0) {
			//                  block         contact       clear
			e = getcontact(railway,atoi(tcpvar1),atoi(tcpvar2),atoi(tcpvar3));
			sprintf(response, "%d\r\n", e);
			//printf("%d\n", e);
            tcp_server_send(client, response);
	  }

	  //SCANCONTACT
	  if (strcmp("SCANCONTACT",tcpcommand) == 0) {
			block = atoi(tcpvar1);
			contact = atoi(tcpvar2);
			//                    block  contact  clear
			e = scancontact(railway, &block, &contact, atoi(tcpvar3));
			sprintf(response, "%d#%d#%d\r\n", e,block,contact);
            tcp_server_send(client, response);
	  }

	  //SCANTRACKUSED  - !!!NEW!!! not included in orginal c model railway api
	  if (strcmp("SCANTRACKUSED",tcpcommand) == 0) {
			found = 0;
			block = atoi(tcpvar1);
			//                   block
			for (tmpblock = block+1; tmpblock < 48 ; tmpblock++) {
				if (trackused(railway,tmpblock)) {
					sprintf(response, "%d\r\n", tmpblock);
				    	tcp_server_send(client, response);
					found = 1;
					break;
				}
			}//next tmpblock
			if (!found) {
				for (tmpblock = 0; tmpblock < block ; tmpblock++) {
					if (trackused(railway,tmpblock)) {
						sprintf(response, "%d\r\n", tmpblock);
					    	tcp_server_send(client, response);
						found = 1;
						break;
					}
				}//next tmpblock
			}
			if (found == 0) {
				sprintf(response, "-1\r\n");
				tcp_server_send(client, response);
			}
	  }

	  //TRACKUSED
	  if (strcmp("TRACKUSED",tcpcommand) == 0) {
			//                  block
			e = trackused(railway,atoi(tcpvar1));
			sprintf(response, "%d\r\n", e);
            tcp_server_send(client, response);
	  }

	  //GETSPEED
	  if (strcmp("GETSPEED",tcpcommand) == 0) {
			//                  block
			e = getspeed(railway,atoi(tcpvar1));
			sprintf(response, "%d\r\n", e);
            tcp_server_send(client, response);
	  }

	  //RAILWAYALIVE
	  if (strcmp("RAILWAYALIVE",tcpcommand) == 0) {
			e = railway_alive(railway);
			sprintf(response, "%d\r\n", e);
            tcp_server_send(client, response);
	  }

	  //RAILWAYSTOPCONTROL
	  if (strcmp("RAILWAYSTOPCONTROL",tcpcommand) == 0) {
			railway_stopcontrol(railway,0);
	  }

	  //GETSIMULATIONTICK
	  if (strcmp("GETSIMULATIONTICK",tcpcommand) == 0) {
		    e = -1;
#if SIMULATION == 1
			e = getSimulationTick();
#endif /* SIMULATION == 1 */
			sprintf(response, "%d\r\n", e);
            tcp_server_send(client, response);
	  }

	  //RESETSIMULATION
	  if (strcmp("RESETSIMULATION",tcpcommand) == 0) {
#if SIMULATION == 1
			resetSimulation();
#endif /* SIMULATION == 1 */
	  }

	  //RESTARTSIMULATION
	  if (strcmp("RESTARTSIMULATION",tcpcommand) == 0) {
#if SIMULATION == 1
			restartSimulation();
#endif /* SIMULATION == 1 */
	  }

	  //ABORTSIMULATION
	  if (strcmp("ABORTSIMULATION",tcpcommand) == 0) {
#if SIMULATION == 1
			abortSimulation();
#endif /* SIMULATION == 1 */
	  }

	  //ABORTINTERFACE
	  if (strcmp("ABORTINTERFACE",tcpcommand) == 0) {
#if SIMULATION == 1
			abortSimulation();
#endif /* SIMULATION == 1 */
	  }

	  //SETINITIALTRAIN
	  if (strcmp("SETINITIALTRAIN",tcpcommand) == 0) {
			   //             block
#if SIMULATION == 1
			setInitialTrain(atoi(tcpvar1));
#endif /* SIMULATION == 1 */
	  }

	  //SETINITIALTRAINEX
	  if (strcmp("SETINITIALTRAINEX",tcpcommand) == 0) {
			//             block             alignment (0=fwd, 1=bwd)
#if SIMULATION == 1
			setInitialTrainEx(atoi(tcpvar1),atoi(tcpvar2));
#endif /* SIMULATION == 1 */
	  }

	  //RESETINITIALTRAINS
	  if (strcmp("RESETINITIALTRAINS",tcpcommand) == 0) {
#if SIMULATION == 1
			resetInitialTrains();
#endif /* SIMULATION == 1 */
	  }

      if (ABORTINTERFACE) break;
    }
    if (ABORTINTERFACE) break;
   }// hold connection - do forever


   if (DEBUG) printf(" INTERFACE DISCONNECTED\n");
   close(client);
   if (ABORTINTERFACE) break;
   INTERFACEALIVE = 0;

  }//while forever/not aborted

  if (DEBUG) printf("!INTERFACE ABORTED!");
  return NULL;
}

//----------------------------------------------------------------------------
//! this function initializes the interface communication with JAVA/PHP in a
//! concurrent thread that listens on the given port
//!
//! @param port
//!			initialize the interface thread with this tcp/ip port
//!
void initInterface(int port) {
	if (DEBUG) printf("RailwayInterface\n");

    JAVAPORT = port;
    pthread_t interfacethread;
    pthread_create (&interfacethread, NULL, InterfaceServer, NULL);

    //pthread_join (guithread, NULL);
}

//----------------------------------------------------------------------------
//! main routine of this program it starts the simulation and the interface
//! threads. Concurrently the user may stop both by pressing <ESC> at any
//! time.
int main(int argc, char *argv[])
{
  char Key;

#if SIMULATION == 1
  if ((argc < 2)||(atoi(argv[1]) == 0)) {
	  printf("USAGE: RailwayInterfaceTCP TCPport [GUIport]\n"); return(1);
  }
#endif /* SIMULATION == 1 */
#if SIMULATION == 0
  if ((argc < 2)||(atoi(argv[1]) == 0)) {
	  printf("USAGE: RailwayInterfaceTCP TCPport\n"); return(1);
  }
#endif /* SIMULATION == 0 */

#if SIMULATION == 1
  if (argc > 2)
	initSimulation(atoi(argv[2]));
  else {
    railway=railway_initsystem(&kicking);
  }
#endif /* SIMULATION == 1 */
#if SIMULATION == 0
  // initialize the real railway system //
  if ((railway=railway_initsystem(&kicking))==NULL) {
    perror("railway_initsystem");
    exit(EXIT_FAILURE);
  }
  if (railway_openlinks_udp(railway,"node%02i","/dev/ttyS0")<0) {
    railway_donesystem(railway);
    exit(EXIT_FAILURE);
  }
  if (railway_startcontrol(railway,0,0)<0) {
    perror("railway_startcontrol");
    railway_closelinks(railway);
    railway_donesystem(railway);
    exit(EXIT_FAILURE);
  }
  // finished initializing the real system //
#endif /* SIMULATION == 0 */

  initInterface(atoi(argv[1]));

  system("clear");
  system("clear");
  printTitleScreen();
  printf("\nPress <ENTER> to exit the program and abort the interface.\n");
  Key = getc(stdin);

 abortInterface();

#if SIMULATION == 1
  abortSimulation();
#endif /* SIMULATION == 1 */
#if SIMULATION == 0
  /* shut the system down */
  railway_stopcontrol(railway,1);
  railway_closelinks(railway);
  railway_donesystem(railway);
#endif /* SIMULATION == 0 */

  return 0;
}

//----------------------------------------------------------------------------
