echo off

echo.
echo Compiling the java controller ...
cd RailwayControllerJava
javac railwayInterfacePackage/*.java -cp railwayInterfacePackage 
javac SampleController2.java -cp .
javac SampleController1.java -cp .
echo.
echo Starting the java controller ...
echo.
java SampleController2 &
cd..
