//#include "kcg_imported_functions.h"
#include "kcg_types.h"

void PointModifier_simulation (pointArray_simulation* arrayIn,
     PointStatus_simulation value,
     kcg_int index,
     pointArray_simulation* arrayOut)
{
    memcpy(*arrayOut, *arrayIn, sizeof(pointArray_simulation));
    memcpy(&(*arrayOut)[index], &value, sizeof(PointStatus_simulation));
}
