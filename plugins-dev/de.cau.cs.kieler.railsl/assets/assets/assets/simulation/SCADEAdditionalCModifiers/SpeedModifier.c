//#include "kcg_imported_functions.h"
#include "kcg_types.h"

void SpeedModifier_simulation (speedArray_simulation *arrayIn,
     speedValue_simulation speedvalue,
     kcg_int index,
     speedArray_simulation *arrayOut)
{
   int len = sizeof(speedArray_simulation)/sizeof(kcg_real);
   int i = 0;
   //memcpy(*arrayOut, *arrayIn sizeof(speedArray_simulation));
   for (i = 0; i < len; i++) {
     if (i != index)
       (*arrayOut)[i] = (*arrayIn)[i];
     else
       (*arrayOut)[i] = speedvalue;
   }
   //memcpy(&(arrayOut)[index], &value, sizeof(speedValue_simulation));
}
