#!/bin/bash

export LUSTRE_INSTALL=$1

export PATH=$LUSTRE_INSTALL/bin:$PATH
export PATH=$2/bin:$PATH

$3 $4 $5
