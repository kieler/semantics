@echo off
setlocal
set SIS=%ESTEREL%/lib/sis1_3
set SIS_LIB=%SIS%/sis_lib
set PATH=%SIS%;%PATH%
%SIS%/cygsis %*

endlocal
