#include <jni.h>
#include "klp_jni.h"
#include <stdio.h>

//#include "mem.h"
#include "klp_strl.h"
#include "klp_class.h"


char out = 0x0;
bool tx = false;

softklp klp;

void softklp::O_ExecError(){
  printf("KLP: Internal Error\n");
}

void softklp::O_LVerify(){
  printf("KLP: verify\n");
}

void softklp::O_LTick(){
  printf("KLP: Tick\n");
}

void softklp::O_LWrite(){
  printf("KLP: write\n");
}

void softklp::O_LInfo(){
  printf("KLP: info\n");
}

void softklp::O_TX(unsigned int i){
  tx = true;
  out=i; 
}

//void softklp::O_TickWarn(){
//}

JNIEXPORT jbyte JNICALL Java_de_cau_cs_kieler_krep_evalbench_comm_KlpWrapper_klp_1step
(JNIEnv *env, jclass, jstring msg){
  out = 0x0;
  tx = false;
  //getInstr(klp);
  klp.run();
  //writeROM(klp);
  msg = env->NewStringUTF("perform step\n");
  return tx;
}

JNIEXPORT jbyte JNICALL Java_de_cau_cs_kieler_krep_evalbench_comm_KlpWrapper_klp_1recv
(JNIEnv *, jclass, jstring){
  return out;
}

JNIEXPORT void JNICALL Java_de_cau_cs_kieler_krep_evalbench_comm_KlpWrapper_klp_1reset
(JNIEnv *env, jclass, jstring msg){
  klp.reset();
  klp.run();
  msg = env->NewStringUTF("reset\n");
}

JNIEXPORT void JNICALL Java_de_cau_cs_kieler_krep_evalbench_comm_KlpWrapper_klp_1send
(JNIEnv *env, jclass, jbyte val, jstring msg){
  char c[32];
  sprintf(c, "RX(0x%x)\n", val & 0xFF);
  msg = env->NewStringUTF(c);
  klp.I_RX(val); 
}
