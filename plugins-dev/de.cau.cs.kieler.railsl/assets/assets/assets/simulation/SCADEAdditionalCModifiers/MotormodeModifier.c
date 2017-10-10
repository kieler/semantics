//#include "kcg_imported_functions.h"
#include "kcg_types.h"

void MotormodeModifier_simulation (
     motormodeArray_simulation* arrayIn,
     MotormodeType_simulation value,
     kcg_int index,
     motormodeArray_simulation* arrayOut)
{
    memcpy(*arrayOut, *arrayIn, sizeof(motormodeArray_simulation));
    memcpy(&(*arrayOut)[index], &value, sizeof(MotormodeType_simulation));
}
