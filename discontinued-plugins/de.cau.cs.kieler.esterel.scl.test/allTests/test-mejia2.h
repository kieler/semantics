#ifndef MAIN
#ifndef _TEST_MEJIA2_H
#  define _TEST_MEJIA2_H

/*

  Nonsense definitions to make it compile

*/

#  define POSITIVE 1
#  define NEGATIVE 0
#  define NB_TRAMES_STATION 2
#  define ADRESSES 3
#  define LONG_MIN 5
#  define DD 6
#  define DF 7
#  define IDLE 8
#  define RIEN 9
#  define ERR 10
#  define DIFFUSION 11
#  define LONG_MAX 12
#  define T1 13
#  define T2 14
#  define QUELLE_TRAME(x,y,z) ((x) + (y) + (z))
#  define LONG_TRAME(x) ( (x) + 1 )
#  define DONNEE_TRAME(x, y) ((x) + (y))


/* Sensor value */

#define STATION_S_ID() sid
int sid = 15;

#endif
#endif
