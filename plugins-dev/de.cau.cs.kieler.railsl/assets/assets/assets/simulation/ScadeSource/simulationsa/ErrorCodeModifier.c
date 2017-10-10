//#include "kcg_imported_functions.h"
#include "kcg_types.h"

void ErrorCodeModifier_simulation (
     errorArray_simulation* arrayIn,
     errorType_simulation value,
     kcg_int index,
     errorArray_simulation* arrayOut)
{
    memcpy(*arrayOut, *arrayIn, sizeof(errorArray_simulation));
    memcpy(&(*arrayOut)[index], &value, sizeof(errorType_simulation));
}
