#ifndef RAILPI_H
#define RAILPI_H

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <netdb.h>

//#define DEBUGRAILPI

struct railPi_connector {
  int     socket;
};
typedef struct railPi_connector railPi_connector_t;

railPi_connector_t connectRaspi(size_t number);
char *getRaspiConfig(railPi_connector_t railpi);
void raspiConnectArduino(railPi_connector_t railpi);
void raspiDisconnectArduino(railPi_connector_t railpi);
void setRaspiPoint(railPi_connector_t railpi, char* arduino, unsigned char pointnumber, unsigned char setting);
void setRaspiTrack(railPi_connector_t railpi, char* arduino, unsigned char tracknumber, unsigned char setting1, unsigned char setting2);
unsigned char getRaspiContact(railPi_connector_t railpi, char* arduino, unsigned char contactnumber, unsigned char setting);


#endif
