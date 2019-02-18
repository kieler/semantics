#!/bin/csh

# TO BE SOURCED ONCE IN .chrc, once LUSTRE_INSTALL is SET !
# e.g.
# setenv LUSTRE_INSTALL /usr/local/tools/lustre

setenv PATH $LUSTRE_INSTALL/bin:$PATH
setenv MANPATH "${MANPATH}:$LUSTRE_INSTALL/man"

#extra tools
setenv ESTEREL "$LUSTRE_INSTALL/esterelv5_21.linux"
setenv PATH ${PATH}:$ESTEREL/bin
setenv MANPATH ${MANPATH}:$ESTEREL/man
setenv LD_LIBRARY_PATH ${LD_LIBRARY_PATH}:$ESTEREL/lib
