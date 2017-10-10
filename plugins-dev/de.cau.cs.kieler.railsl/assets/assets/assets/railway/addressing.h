//===========================================================================//
//==             R T S Y S   M O D E L   R A I L W A Y   A P I             ==//
//==            A D D R E S S I N G   C O N F I G U R A T I O N            ==//
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
#ifndef ADDRESSING_H
#define ADDRESSING_H

// fprintf, printf, perror
#include <stdio.h>
// malloc, atoi
#include <stdlib.h>
// strncmp, strcpy
#include <string.h>
// JSON Parsing
#include "parson.h"

// Constants to manage the maximum available elements of the railway
#define TRACKCOUNT 48
#define CONTACTCOUNT 96
#define POINTCOUNT 30
#define LIGHTCOUNT 24
#define SIGNALCOUNT 96
#define GATECOUNT 2
#define BELLCOUNT 1

// Identification of track segments via enumeration
enum track {
  IC_JCT_0, IC_LN_0, IC_LN_1, IC_LN_2,
  IC_LN_3, IC_LN_4, IC_LN_5, IC_ST_0,
  IC_ST_1, IC_ST_2, IC_ST_3, IC_ST_4,
  IO_LN_0, IO_LN_1, IO_LN_2, KH_LN_0,
  KH_LN_1, KH_LN_2, KH_LN_3, KH_LN_4,
  KH_LN_5, KH_LN_6, KH_LN_7, KH_LN_8,
  KH_ST_0, KH_ST_1, KH_ST_2, KH_ST_3,
  KH_ST_4, KH_ST_5, KH_ST_6, KIO_LN_0,
  KIO_LN_1, OC_JCT_0, OC_LN_0, OC_LN_1,
  OC_LN_2, OC_LN_3, OC_LN_4, OC_LN_5,
  OC_ST_0, OC_ST_1, OC_ST_2, OC_ST_3,
  OC_ST_4, OI_LN_0, OI_LN_1, OI_LN_2
};

// Structure to hold the address of a single component
struct portAddress {
  size_t    railPiNumber;
  char      arduinoSerial[21];
  size_t    componentPort;
};
typedef struct portAddress portAddress_t;

// Addresses for all components
struct railwayPortConfig {
  portAddress_t   tracks[TRACKCOUNT];
  portAddress_t   contacts[CONTACTCOUNT];
  portAddress_t   points[POINTCOUNT];
  portAddress_t   lights[LIGHTCOUNT];
  portAddress_t   signals[SIGNALCOUNT];
  portAddress_t   gates[GATECOUNT];
  portAddress_t   gatesignals[GATECOUNT];
  portAddress_t   gatecontacts[GATECOUNT];
  portAddress_t   bells[BELLCOUNT];
};
typedef struct railwayPortConfig portConfig_t;

void jsonError();
portConfig_t* initAddressSpace();
size_t parseConfigToAddresses(const char* jsonconfig, portConfig_t* addresses, size_t railPi);
ssize_t blockToEnum(const char *block);
void printConfig(portConfig_t* conf);

#endif
