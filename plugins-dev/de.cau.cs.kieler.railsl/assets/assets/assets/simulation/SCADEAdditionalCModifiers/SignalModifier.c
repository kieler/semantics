//#include "kcg_imported_functions.h"
#include "kcg_types.h"

void SignalModifier_simulation (signalArray_simulation* arrayIn,
     signalValue_simulation value,
     kcg_int index,
     signalArray_simulation* arrayOut)
{
    memcpy(*arrayOut, *arrayIn, sizeof(signalArray_simulation));
    memcpy(&(*arrayOut)[index], &value, sizeof(signalValue_simulation));
}
