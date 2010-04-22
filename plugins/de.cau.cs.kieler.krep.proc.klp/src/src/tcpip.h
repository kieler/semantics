#ifndef TCPIP_H
#define TCPIP_H

#include <stdio.h>
#include <time.h>
#include <unistd.h>
#include <stdlib.h>
#include <termios.h>
#include <netdb.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <string.h>

//extern void reset_input_mode();
//extern void set_input_mode ();
//extern int createSocket();
//extern void sendString(int port, char* buf); 

class tcpip{
private: 
  //char host;
  //unsigned short port;
  
  int client;                    /* Socket descriptor for client */
  struct sockaddr_in serverAddr; /* Local address */
  struct sockaddr_in clientAddr; /* Client address */

public:
  tcpip(char* host, unsigned short port);  //client
  tcpip(unsigned short port);  //server
  
  bool write(char* msg);
  bool write(char msg);
  bool receiveByte(char* msg);
  bool receiveUntil(char* msg, char delim);
  bool receive(char* msg, int len);    

  bool peek();
};

#endif
