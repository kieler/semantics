#!/bin/sh

# TO BE SOURCED ONCE IN .bashrc, once LUSTRE_INSTALL is SET !
# e.g.
# export LUSTRE_INSTALL=/usr/local/tools/lustre

export PATH=$LUSTRE_INSTALL/bin:$PATH
export MANPATH="$MANPATH:$LUSTRE_INSTALL/man"

#extra tools
export ESTEREL="$LUSTRE_INSTALL/esterelv5_21.linux"
export PATH=$PATH:$ESTEREL/bin
export MANPATH=$MANPATH:$ESTEREL/man
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:$ESTEREL/lib
