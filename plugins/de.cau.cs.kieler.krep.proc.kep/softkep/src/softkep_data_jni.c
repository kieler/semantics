#include <stdio.h>   /* Standard input/output definitions */
#include <jni.h>
#include "kep_jni.h"
#include "softkep_strl.h" /* strl */
 
#define TRUE 1
#define FALSE 0
       
char c;
int  success;  
int received = TRUE;

int tx =FALSE;
char out = 0x0;

void softkep_O_tick_warn (void){
}

void softkep_O_tx_data (char_type c){
  tx=TRUE;
  if (c>=0 && c<=9) out=c+48; 
  if (c> 9 && c<36) out=c+55; 
}

void softkep_O_no_rx_error (void){
}

void softkep_O_tx_busy (void){
}

void softkep_O_no_tx_error (void){
}

void softkep_O_ExtOut(int i){
}

JNIEXPORT jbyte JNICALL Java_de_cau_cs_kieler_krep_evalbench_comm_KepWrapper_kep_1step
(JNIEnv * env, jclass cl, jstring msg){
  out = 0x0;
  tx = FALSE;
  softkep();
  return tx;
}

JNIEXPORT jbyte JNICALL Java_de_cau_cs_kieler_krep_evalbench_comm_KepWrapper_kep_1recv
(JNIEnv *env, jclass cl , jstring msg){
  if(!received){
    received = TRUE;
  }
  return out;
}

JNIEXPORT void JNICALL Java_de_cau_cs_kieler_krep_evalbench_comm_KepWrapper_kep_1reset
(JNIEnv * env, jclass cl, jstring msg){
  softkep_reset();
}

JNIEXPORT void JNICALL Java_de_cau_cs_kieler_krep_evalbench_comm_KepWrapper_kep_1send
(JNIEnv * env, jclass cl, jbyte val, jstring msg){
  char c=0;
  if (val>64 && val<91) {
    c=val-55; 
  } else if (val>47 && val<58) {
    c=val-48; 
  }
  if(received){
    received=FALSE;
  }
  softkep_I_rx_raw_data(c); 
}
