//#include "kcg_imported_functions.h"
#include "kcg_types.h"

void ExtDataModifier_simulation (
     trackExtDataArray_simulation* arrayIn,
     trackExtData_simulation *value,
     kcg_int index,
     trackExtDataArray_simulation* arrayOut)
{
    //int c = 0;
    //sizeof(trackExtDataArray_simulation);
    //memcpy(&arrayOut, &arrayIn, sizeof(trackExtDataArray_simulation));
    memcpy(*arrayOut, *arrayIn, sizeof(trackExtDataArray_simulation));
    //for (c = 0; c < 48; c++) {
    //  memcpy(&(*arrayOut)[c], &(*arrayIn)[c], sizeof(trackExtData_simulation));
    //}
    //memcpy(&(*arrayOut)[index], &((*arrayIn)[index]), sizeof(trackExtData_simulation));
    memcpy(&(*arrayOut)[index], value, sizeof(trackExtData_simulation));
}
