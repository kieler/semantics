#include "railPi.h"

railPi_connector_t connectRaspi(size_t number) {
  int                 portno      = 20010 + number;
  struct sockaddr_in  serv_addr;
  struct hostent      *server;
  railPi_connector_t  *result;

  // Reserve space for railpi connector
  result = malloc(sizeof(railPi_connector_t));

  #ifdef DEBUGRAILPI
    printf("Connecting socket %zu\n", number);
  #endif
  // Create IPv4 TCP socket
  result->socket = socket(AF_INET, SOCK_STREAM, 0);
  if (result->socket < 0)
    perror("ERROR opening socket");

  // Get railPi nodes via hostname 'railway'
  server = gethostbyname("134.245.42.135");
  if (server == NULL) {
    fprintf(stderr, "ERROR, no such host\n");
    exit(0);
  }

  // Clear server address buffer
  memset((char *) &serv_addr, 0, sizeof(serv_addr));

  // Prepare hostname and connection
  serv_addr.sin_family = AF_INET;
  memmove((char *) &serv_addr.sin_addr.s_addr, (char *) server->h_addr, server->h_length);
  serv_addr.sin_port = htons(portno);

  // Connect prepared socket
  if (connect(result->socket, (struct sockaddr *) &serv_addr, sizeof(serv_addr)) < 0)
    perror("ERROR connecting");

  struct timeval tv;

  tv.tv_sec = 1;  /* 1 Secs Timeout */
  tv.tv_usec = 0;  // Not init'ing this can cause strange errors

  setsockopt(result->socket, SOL_SOCKET, SO_RCVTIMEO, (char *)&tv,sizeof(struct timeval));


  return *result;
}

char *getRaspiConfig(railPi_connector_t railpi) {
  ssize_t n;
  char *buffer;
  buffer = malloc(sizeof(char) * 4097);
  memset(buffer, 0, 4097);
  sprintf(buffer,"\x42\x02");

  n = send(railpi.socket, buffer, 3, 0);
  if (n < 0)
    perror("ERROR writing to socket");

  memset(buffer, 0, 4097);
  do {
    n = recv(railpi.socket, buffer, 1, 0);
    if (n < 0)
      perror("ERROR reading from socket");
  } while (buffer[0] != 0x45);

  n = recv(railpi.socket, buffer, 4097, 0);
  if (n < 0)
      perror("ERROR reading from socket");

  return buffer;
}

void raspiConnectArduino(railPi_connector_t railpi){
  #ifdef DEBUGRAILPI
    printf("Connecting arduinos\n");
  #endif

  // Prepare write buffer
  char *buf = malloc(sizeof(char) * 3);

  buf[0] = 0x42;
  buf[1] = 0x01;
  buf[2] = 0x00;

  // Send data to railpi
  ssize_t n = send(railpi.socket,buf, 3, 0);
  if (n < 0)
    perror("ERROR writing to socket");
}

void raspiDisconnectArduino(railPi_connector_t railpi){
  #ifdef DEBUGRAILPI
    printf("Connecting arduinos\n");
  #endif

  // Prepare write buffer
  char *buf = malloc(sizeof(char) * 3);

  buf[0] = 0x42;
  buf[1] = 0x07;
  buf[2] = 0x00;

  // Send data to railpi
  ssize_t n = send(railpi.socket,buf, 3, 0);
  if (n < 0)
    perror("ERROR writing to socket");
}


void setRaspiPoint(
  railPi_connector_t railpi,
  char* arduino,
  unsigned char pointnumber,
  unsigned char setting) {
  size_t i;

  #ifdef DEBUGRAILPI
    printf("Setting Point\n");
  #endif

  // Prepare write buffer
  char *buf = malloc(sizeof(char) * 25);

  buf[0] = 0x42;
  buf[1] = 0x04;
  for (i = 0; i < 20; ++i) {
    buf[i+2] = arduino[i];
  }
  buf[22] = ~pointnumber;
  buf[23] = ~setting;
  buf[24] = 0x00;

  // Send data to railpi
  ssize_t n = send(railpi.socket,buf, 25, 0);
  if (n < 0)
    perror("ERROR writing to socket");
}


void setRaspiSignal(
  railPi_connector_t railpi,
  char* arduino,
  unsigned char signalnumber,
  unsigned char setting) {
  size_t i;

  #ifdef DEBUGRAILPI
    printf("Setting Signal\n");
  #endif

  // Prepare write buffer
  char *buf = malloc(sizeof(char) * 25);

  buf[0] = 0x42;
  buf[1] = 0x03;
  for (i = 0; i < 20; ++i) {
    buf[i+2] = arduino[i];
  }
  buf[22] = ~signalnumber;
  buf[23] = ~setting;
  buf[24] = 0x00;

  // Send data to railpi
  ssize_t n = send(railpi.socket,buf, 25, 0);
  if (n < 0)
    perror("ERROR writing to socket");
}

void setRaspiTrack(
  railPi_connector_t railpi,
  char* arduino,
  unsigned char tracknumber,
  unsigned char setting1,
  unsigned char setting2) {
  size_t i;

  #ifdef DEBUGRAILPI
    printf("Setting Track\n");
  #endif

  // Prepare write buffer
  char *buf = malloc(sizeof(char) * 26);

  buf[0] = 0x42;
  buf[1] = 0x05;
  for (i = 0; i < 20; ++i) {
    buf[i+2] = arduino[i];
  }
  buf[22] = ~tracknumber;
  buf[23] = ~setting1;
  buf[24] = ~setting2;
  buf[25] = 0x00;

  // Send data to railpi
  ssize_t n = send(railpi.socket, buf, 26, 0);
  if (n < 0)
    perror("ERROR writing to socket");
}

unsigned char getRaspiContact(
  railPi_connector_t railpi,
  char* arduino,
  unsigned char contactnumber,
  unsigned char setting) {
  size_t i;
  unsigned char result;

  // Prepare write buffer
  char *buf = malloc(sizeof(char) * 25);

  buf[0] = 0x42;
  buf[1] = 0x06;
  for (i = 0; i < 20; ++i) {
    buf[i+2] = arduino[i];
  }
  buf[22] = ~contactnumber;
  buf[23] = ~setting;
  buf[24] = 0x00;

  // Send data to railpi
  ssize_t n = send(railpi.socket,buf, 25, 0);
  if (n < 0)
    perror("ERROR writing to socket");

  // Read response from socket
  memset(buf, 0, 25);
  // Drop all stuff before contact intro
  do {
    n = recv(railpi.socket, buf, 1, 0);
    if (n < 0)
      perror("ERROR reading from socket");
  } while (buf[0] != 0x43);

  // Get real value
  n = recv(railpi.socket, &result, 1, 0);
  if (n < 0)
    perror("ERROR reading from socket");

  n = recv(railpi.socket, buf, 1, 0);
  if (n < 0)
    perror("ERROR reading from socket");
  if (buf[0] != 0x44) {
    fprintf(stderr, "Something went wrong with the response to the contact request\n");
  }

  if (result != 255) {
    printf("Got contact on Arduino %s, port %hhu. Result %hhu\n",arduino, contactnumber, ~result);
  }
  return ~result;
}
