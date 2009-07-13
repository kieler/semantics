#!/bin/bash

# headless built skript for KEV
# author: Hauke Fuhrmann, haf

ECLIPSE=/home/java/eclipse_3.4

CURRENTDIR=`pwd`
cd checkout/kev
echo "updating from SVN..."
svn up --username tomcat5 --password edcvgz

echo "cleaning old build..."
rm -rf buildDirectory
mkdir buildDirectory
mkdir buildDirectory/features
mkdir buildDirectory/plugins

echo "creating building dir structure..."
mv *.feature buildDirectory/features/
cp -R * buildDirectory/plugins/
cp -R buildDirectory/features/* ./

echo "running PDE build..."
ARGS=" -cp $ECLIPSE/plugins/org.eclipse.equinox.launcher_1.0.100.v20080205.jar"
ARGS=$ARGS" org.eclipse.core.launcher.Main"
ARGS=$ARGS" -application org.eclipse.ant.core.antRunner"
ARGS=$ARGS" -DbaseLocation=$ECLIPSE"
ARGS=$ARGS" -Dbuildfile $ECLIPSE/plugins/org.eclipse.pde.buildorg.eclipse.pde.build_3.4.0.v20080206/scripts/build.xml"
ARGS=$ARGS" -DbuildDirectory=$CURRENTDIR/kev-build"
ARGS=$ARGS" -Dbuilder=$CURRENTDIR/checkout/kev/de.cau.cs.kieler.kev.build"
java $ARGS

cd $CURRENTDIR
