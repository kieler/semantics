//#include "kcg_imported_functions.h"
#include "kcg_types.h"

void ContactPairModifier_simulation (contactArray_simulation* arrayIn,
     contactPair_simulation* value,
     kcg_int index,
     contactArray_simulation* arrayOut)
{
    memcpy(*arrayOut, *arrayIn, sizeof(contactArray_simulation));
    memcpy(&(*arrayOut)[index], value, sizeof(contactPair_simulation));
}
