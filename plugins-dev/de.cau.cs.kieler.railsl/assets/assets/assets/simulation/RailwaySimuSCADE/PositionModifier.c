//#include "kcg_imported_functions.h"
#include "kcg_types.h"

void PositionModifier_simulation (positionArray_simulation* arrayIn,
     positionType_simulation value,
     kcg_int index,
     positionArray_simulation* arrayOut)
{
    memcpy(*arrayOut, *arrayIn, sizeof(positionArray_simulation));
    memcpy(&(*arrayOut)[index], &value, sizeof(positionType_simulation));
}
