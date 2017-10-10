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
#include "addressing.h"

// Produce error message and terminate
void jsonError() {
  perror("ERROR while parsing JSON");
  exit(1);
}

// Prepare memory for configuration space
portConfig_t* initAddressSpace() {
  portConfig_t *result = malloc(sizeof(portConfig_t));
  if (result == NULL) {
    // Malloc failed, something went very wrong
    fprintf(stderr, "ERROR: Malloc failed while reserving space for addresses.\n");
  }
  return result;
}

// Take raw string and push all data to
// (already prepared) configuration space
size_t parseConfigToAddresses(const char* jsonconfig, portConfig_t* addresses, size_t railPi) {
  JSON_Value  *root_value;
  JSON_Object *arduinos, *arduino;
  JSON_Array  *configs, *config;
  const char  *arduinoName, *elementname;
  size_t      i, j, limit, elementcount, blockpart;
  ssize_t     number;

  // Do complete json parsing
  root_value = json_parse_string(jsonconfig);
  if (json_type(root_value) != JSONObject)
    jsonError();

  // root should be object with the various arduino configs
  arduinos = json_value_get_object(root_value);
  limit = json_object_get_count(arduinos);

  // Iterate through all supplied arduinos
  for (i = 0; i < limit; ++i) {
    // Grab serial of arduino to request the object after that
    arduinoName = json_object_get_name(arduinos, i);
    arduino = json_object_get_object(arduinos, arduinoName);
    if (arduino == NULL)
      jsonError();

    // TODO Check name versus serial attribute

    // Grab all signals and get the length
    configs = json_object_get_array(arduino,"signals");
    elementcount = json_array_get_count(configs);
    for (j = 0; j < elementcount; ++j) {
      // Grab single entry from signals
      config = json_array_get_array(configs,j);

      // Grab name and identifier from json
      elementname = json_array_get_string(config,0);
      blockpart = json_array_get_number(config,1);

      // Determine type of the element
      if (!strncmp(elementname, "Gate_", 5)) {
        // Gate signal
        number = atoi(elementname+5);
        if (number >= 0 && number < GATECOUNT) {
          // Valid gate found, store information
          addresses->gatesignals[number].railPiNumber = railPi;
          strcpy(addresses->gatesignals[number].arduinoSerial,arduinoName);
          addresses->gatesignals[number].componentPort = j;
        }
      } else {
        // Normal block
        number = blockToEnum(elementname);
        if (number >= 0) {
          // Valid block mapped, store information
          addresses->signals[(number*2)+blockpart].railPiNumber = railPi;
          strcpy(addresses->signals[(number*2)+blockpart].arduinoSerial,arduinoName);
          addresses->signals[(number*2)+blockpart].componentPort = j;
        }
      }
    }

    // Grab all tracks
    configs = json_object_get_array(arduino,"tracks");
    elementcount = json_array_get_count(configs);
    for (j = 0; j < elementcount; ++j) {
      // Grab entry from tracks array
      elementname = json_array_get_string(configs,j);
      // Resolve identification
      number = blockToEnum(elementname);
      if (number >= 0) {
        // Valid element mapped, store information
        addresses->tracks[number].railPiNumber = railPi;
        strcpy(addresses->tracks[number].arduinoSerial,arduinoName);
        addresses->tracks[number].componentPort = j;
      }
    }

    // Grab all points
    configs = json_object_get_array(arduino,"points");
    elementcount = json_array_get_count(configs);
    for (j = 0; j < elementcount; ++j) {
      // Grab entry from points array
      elementname = json_array_get_string(configs,j);

      if (!strncmp(elementname,"L_", 2)) {
        // Lights
        number = atoi(elementname+2);
        if (number >= 0 && number < LIGHTCOUNT) {
          // Valid element mapped, store information
          addresses->lights[number].railPiNumber = railPi;
          strcpy(addresses->lights[number].arduinoSerial,arduinoName);
          addresses->lights[number].componentPort = j;
        }
      } else if (!strncmp(elementname,"PNT_", 4)) {
        // Points
        number = atoi(elementname+4);
        if (number >= 0 && number < POINTCOUNT) {
          // Valid element mapped, store information
          addresses->points[number].railPiNumber = railPi;
          strcpy(addresses->points[number].arduinoSerial,arduinoName);
          addresses->points[number].componentPort = j;
        }
      } else if (!strncmp(elementname,"Gate_", 5)) {
        // Gates
        number = atoi(elementname+5);
        if (number >= 0 && number < GATECOUNT) {
          // Valid element mapped, store information
          addresses->gates[number].railPiNumber = railPi;
          strcpy(addresses->gates[number].arduinoSerial,arduinoName);
          addresses->gates[number].componentPort = j;
        }
      } else if (!strncmp(elementname,"Bell_", 5)) {
        // Bells
        number = atoi(elementname+5);
        if (number >= 0 && number < BELLCOUNT) {
          // Valid element mapped, store information
          addresses->bells[number].railPiNumber = railPi;
          strcpy(addresses->bells[number].arduinoSerial,arduinoName);
          addresses->bells[number].componentPort = j;
        }
      }
    }

    // Grab all contacts
    configs = json_object_get_array(arduino,"contacts");
    elementcount = json_array_get_count(configs);
    for (j = 0; j < elementcount; ++j) {
      // Grab entry from contacts array
      config = json_array_get_array(configs,j);

      elementname = json_array_get_string(config,0);
      blockpart = json_array_get_number(config,1);

      if (!strncmp(elementname, "Gate_", 5)) {
        // Gate contacts
        number = atoi(elementname+5);
        if (number >= 0 && number < GATECOUNT) {
          addresses->gatecontacts[number].railPiNumber = railPi;
          strcpy(addresses->gatecontacts[number].arduinoSerial,arduinoName);
          addresses->gatecontacts[number].componentPort = j;
        }
      } else {
        // Normal block
        number = blockToEnum(elementname);
        if (number >= 0) {
          addresses->contacts[(number*2)+blockpart].railPiNumber = railPi;
          strcpy(addresses->contacts[(number*2)+blockpart].arduinoSerial,arduinoName);
          addresses->contacts[(number*2)+blockpart].componentPort = j;
        }
      }
    }
  }
  return 1;
}

// Parse a string to get the matching identifier
// Needs 14 checks in the worst case
// and 7.6 checks in average
// Returns -1 on invalid block
ssize_t blockToEnum(const char *block) {
  ssize_t result = -1;
  if (!strncmp(block, "IC", 2)) {
    // Part of inner circle
    if (!strncmp(block, "IC_ST", 5)) {
      // Inner circle station
      if (!strncmp(block, "IC_ST_0", 7)) {
        result = IC_ST_0;
      } else if (!strncmp(block, "IC_ST_1", 7)) {
        result = IC_ST_1;
      } else if (!strncmp(block, "IC_ST_2", 7)) {
        result = IC_ST_2;
      } else if (!strncmp(block, "IC_ST_3", 7)) {
        result = IC_ST_3;
      } else if (!strncmp(block, "IC_ST_4", 7)) {
        result = IC_ST_4;
      }
    } else if (!strncmp(block, "IC_LN", 5)) {
      // Inner circle lane
      if (!strncmp(block, "IC_LN_0", 7)) {
        result = IC_LN_0;
      } else if (!strncmp(block, "IC_LN_1", 7)) {
        result = IC_LN_1;
      } else if (!strncmp(block, "IC_LN_2", 7)) {
        result = IC_LN_2;
      } else if (!strncmp(block, "IC_LN_3", 7)) {
        result = IC_LN_3;
      } else if (!strncmp(block, "IC_LN_4", 7)) {
        result = IC_LN_4;
      } else if (!strncmp(block, "IC_LN_5", 7)) {
        result = IC_LN_5;
      }
    } else if (!strncmp(block, "IC_JCT", 6)) {
      // Inner circle junction
      if (!strncmp(block, "IC_JCT_0", 8)) {
        result = IC_JCT_0;
      }
    }
  } else if (!strncmp(block, "OC", 2)) {
    // Part of outer circle
    if (!strncmp(block, "OC_ST", 5)) {
      // Outer circle station
      if (!strncmp(block, "OC_ST_0", 7)) {
        result = OC_ST_0;
      } else if (!strncmp(block, "OC_ST_1", 7)) {
        result = OC_ST_1;
      } else if (!strncmp(block, "OC_ST_2", 7)) {
        result = OC_ST_2;
      } else if (!strncmp(block, "OC_ST_3", 7)) {
        result = OC_ST_3;
      } else if (!strncmp(block, "OC_ST_4", 7)) {
        result = OC_ST_4;
      }
    } else if (!strncmp(block, "OC_LN", 5)) {
      // Outer circle lane
      if (!strncmp(block, "OC_LN_0", 7)) {
        result = OC_LN_0;
      } else if (!strncmp(block, "OC_LN_1", 7)) {
        result = OC_LN_1;
      } else if (!strncmp(block, "OC_LN_2", 7)) {
        result = OC_LN_2;
      } else if (!strncmp(block, "OC_LN_3", 7)) {
        result = OC_LN_3;
      } else if (!strncmp(block, "OC_LN_4", 7)) {
        result = OC_LN_4;
      } else if (!strncmp(block, "OC_LN_5", 7)) {
        result = OC_LN_5;
      }
    } else if (!strncmp(block, "OC_JCT", 6)) {
      // Outer circle junction
      if (!strncmp(block, "OC_JCT_0", 8)) {
        result = OC_JCT_0;
      }
    }
  } else if (!strncmp(block, "KH", 2)) {
    // Part of kicking horse pass
    if (!strncmp(block, "KH_ST", 5)) {
      // Kicking horse station
      if (!strncmp(block, "KH_ST_0", 7)) {
        result = KH_ST_0;
      } else if (!strncmp(block, "KH_ST_1", 7)) {
        result = KH_ST_1;
      } else if (!strncmp(block, "KH_ST_2", 7)) {
        result = KH_ST_2;
      } else if (!strncmp(block, "KH_ST_3", 7)) {
        result = KH_ST_3;
      } else if (!strncmp(block, "KH_ST_4", 7)) {
        result = KH_ST_4;
      } else if (!strncmp(block, "KH_ST_5", 7)) {
        result = KH_ST_5;
      } else if (!strncmp(block, "KH_ST_6", 7)) {
        result = KH_ST_6;
      }
    } else if (!strncmp(block, "KH_LN", 5)) {
      // Kicking horse pass
      if (!strncmp(block, "KH_LN_0", 7)) {
        result = KH_LN_0;
      } else if (!strncmp(block, "KH_LN_1", 7)) {
        result = KH_LN_1;
      } else if (!strncmp(block, "KH_LN_2", 7)) {
        result = KH_LN_2;
      } else if (!strncmp(block, "KH_LN_3", 7)) {
        result = KH_LN_3;
      } else if (!strncmp(block, "KH_LN_4", 7)) {
        result = KH_LN_4;
      } else if (!strncmp(block, "KH_LN_5", 7)) {
        result = KH_LN_5;
      } else if (!strncmp(block, "KH_LN_6", 7)) {
        result = KH_LN_6;
      } else if (!strncmp(block, "KH_LN_7", 7)) {
        result = KH_LN_7;
      } else if (!strncmp(block, "KH_LN_8", 7)) {
        result = KH_LN_8;
      }
    }
  } else if (!strncmp(block, "OI", 2)) {
    // Part of outer to inner turn
    if (!strncmp(block, "OI_LN_0", 7)) {
      result = OI_LN_0;
    } else if (!strncmp(block, "OI_LN_1", 7)) {
      result = OI_LN_1;
    } else if (!strncmp(block, "OI_LN_2", 7)) {
      result = OI_LN_2;
    }
  } else if (!strncmp(block, "IO", 2)) {
    // Part of inner to outer turn
    if (!strncmp(block, "IO_LN_0", 7)) {
      result = IO_LN_0;
    } else if (!strncmp(block, "IO_LN_1", 7)) {
      result = IO_LN_1;
    } else if (!strncmp(block, "IO_LN_2", 7)) {
      result = IO_LN_2;
    }
  } else if (!strncmp(block, "KIO", 3)) {
    // Part of kicking horse entry/exit tracks
    if (!strncmp(block, "KIO_LN_0", 8)) {
      result = KIO_LN_0;
    } else if (!strncmp(block, "KIO_LN_1", 8)) {
      result = KIO_LN_1;
    }
  }
  return result;
}

// Print the complete config in a simple
// output format to debug addressing format
void printConfig(portConfig_t* conf) {
  size_t i;
  printf("Tracks:\n");
  for (i = 0; i < TRACKCOUNT; ++i) {
    printf("  %zu: %zu\t%s\t%zu\n",
      i,
      conf->tracks[i].railPiNumber,
      conf->tracks[i].arduinoSerial,
      conf->tracks[i].componentPort);
  }
  printf("\nContacts:\n");
  for (i = 0; i < CONTACTCOUNT; ++i) {
    printf("  %zu: %zu\t%s\t%zu\n",
      i,
      conf->contacts[i].railPiNumber,
      conf->contacts[i].arduinoSerial,
      conf->contacts[i].componentPort);
  }
  printf("\nPoints:\n");
  for (i = 0; i < POINTCOUNT; ++i) {
    printf("  %zu: %zu\t%s\t%zu\n",
      i,
      conf->points[i].railPiNumber,
      conf->points[i].arduinoSerial,
      conf->points[i].componentPort);
  }
  printf("\nLights:\n");
  for (i = 0; i < LIGHTCOUNT; ++i) {
    printf("  %zu: %zu\t%s\t%zu\n",
      i,
      conf->lights[i].railPiNumber,
      conf->lights[i].arduinoSerial,
      conf->lights[i].componentPort);
  }
  printf("\nSignals:\n");
  for (i = 0; i < SIGNALCOUNT; ++i) {
    printf("  %zu: %zu\t%s\t%zu\n",
      i,
      conf->signals[i].railPiNumber,
      conf->signals[i].arduinoSerial,
      conf->signals[i].componentPort);
  }
  printf("\nGates:\n");
  for (i = 0; i < GATECOUNT; ++i) {
    printf("  %zu: %zu\t%s\t%zu\n",
      i,
      conf->gates[i].railPiNumber,
      conf->gates[i].arduinoSerial,
      conf->gates[i].componentPort);
  }
  printf("\nGatesignals:\n");
  for (i = 0; i < GATECOUNT; ++i) {
    printf("  %zu: %zu\t%s\t%zu\n",
      i,
      conf->gatesignals[i].railPiNumber,
      conf->gatesignals[i].arduinoSerial,
      conf->gatesignals[i].componentPort);
  }
  printf("\nGatecontacts:\n");
  for (i = 0; i < GATECOUNT; ++i) {
    printf("  %zu: %zu\t%s\t%zu\n",
      i,
      conf->gatecontacts[i].railPiNumber,
      conf->gatecontacts[i].arduinoSerial,
      conf->gatecontacts[i].componentPort);
  }
  printf("\nBells:\n");
  for (i = 0; i < BELLCOUNT; ++i) {
    printf("  %zu: %zu\t%s\t%zu\n",
      i,
      conf->bells[i].railPiNumber,
      conf->bells[i].arduinoSerial,
      conf->bells[i].componentPort);
  }
}
