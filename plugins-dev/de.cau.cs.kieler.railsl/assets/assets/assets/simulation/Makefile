################################################################################
##        M A K E F I L E - R A I L W A Y S I M U - (c) C. Motika, 2007       ##
################################################################################

#http://www.gnu.org/software/make/manual/make.html#Automatic-Variables

### the source folder of the orginal SCADE generated C code
# SCADEPROJECTFOLDER = /cygdrive/u/RAILWAY/common/rwmodel/simulationsa/Simulation
# SCADEPROJECTFOLDER = /home/haf/rail/simulationsa/Simulation
SCADEPROJECTFOLDER = ScadeSource/simulationsa/
SCADEPROFILE = Simulation

### this is the folder where railway.c (from simulation) is located in
FOLDERSCADE = RailwaySimuSCADE
FOLDERSIMU = SimulationInterface

### all files for gcc with .c or .o prefix
SCADEFILES  = $(wildcard $(FOLDERSCADE)/*.c)
SCADEFILESO = $(patsubst %.c,bin/%.o, $(SCADEFILES))

SIMUFILES  = $(wildcard $(FOLDERSIMU)/*.c)
SIMUFILESO = $(patsubst %.c,%.o, $(SIMUFILES))

### compiler options for gcc
CC = gcc
# removed -O2
COPTS = -IInclude
SIMUOPTS = -I$(FOLDERSIMU)
LIBS = -pthread
### !!! use -mno-cygwin for older cygwin installations !!! ### i686-pc-cygwin
DLL32 = -mno-cygwin -D_REENTRANT -D_GNU_SOURCE -D__int64="long long" -D_JNI_IMPLEMENTATION -shared -Wl,--kill-at -L /lib/mingw64
DLL64 = -mno-cygwin -m64 -D_REENTRANT -D_GNU_SOURCE -D__int64="long long" -D_JNI_IMPLEMENTATION -D_UNICODE:::MINGW64:-lws2_32 -lgdi32 -shared -Wl,--kill-at -L /lib/mingw

.PHONY: ? help clean realclean usage all copyrebuild rebuildall rebuild RailwayControllerC.bin SampleController.bin APIDemo.bin RailController.bin

?: help
help: usage
usage:
	@echo "+-------------------| Simulation Makefile |-----------------------+"
	@echo "|                                                                 |"
	@echo "|  make all          Build all                                    |"
	@echo "|  make clean        Remove temp files                            |"
	@echo "|  make realclean    clean+clear simulation folder                |"
	@echo "|  make rebuild      clean + build all                            |"
	@echo "|  make rebuildall   clean + build all                            |"
	@echo "|  make COPYFILES    Copy SCADE files from SCADEPROJECTFOLDER     |"
	@echo "|  make copyrebuild  COPYFILES+clean+rebuild                      |"
	@echo "|  make dll          Build dynamic link library for Win32 (cross) |"
	@echo "|  make dll64        Build dynamic link library for Win64 (cross) |"
	@echo "|  make dylib        Build dynamic link library for MacOSX32      |"
	@echo "|  make dylib64      Build dynamic link library for MacOSX64      |"
	@echo "|  make so           Build dynamic link library for Linux32       |"
	@echo "|  make so64         Build dynamic link library for Linux64       |"
	@echo "|  make solaris      Build dynamic link library for SolarisSparc  |"
	@echo "|                                                                 |"
	@echo "+-----------------------------------------------------------------+"

copyrebuild: COPYFILES rebuild
rebuildall: rebuild
rebuild: clean all
all: SampleController.bin

### copy files from the scade folder to the generatedsimulation source folder
### the also copy files from the project folder (imported operators)
COPYFILES:
	@echo "+-----------------------------+"
	@echo "| COPYING ORGINAL SCADE FILES |"
	@echo "+-----------------------------+"
	cp -f -r $(SCADEPROJECTFOLDER)/$(SCADEPROFILE)/*.c $(FOLDERSCADE)
	cp -f -r $(SCADEPROJECTFOLDER)/$(SCADEPROFILE)/*.h $(FOLDERSCADE)
	cp -f -r $(SCADEPROJECTFOLDER)/*.c $(FOLDERSCADE)
	cp -f -r $(SCADEPROJECTFOLDER)/*.h $(FOLDERSCADE)

# use actual file to prevent rebuild on each invocation
# this needs extra dependencies to triger this output
sim_info: $(FOLDERSCADE)/*.c
	@echo "+----------------------------------+"
	@echo "| COMPILING RAILWAY SIMULATION ... |"
	@echo "+----------------------------------+"
	@touch sim_info

bin/$(FOLDERSCADE)/%.o: sim_info $(FOLDERSCADE)/%.c
	@mkdir -p $(shell dirname $@)
	$(CC) $(COPTS) -c -o $@ $(FOLDERSCADE)/$*.c

dll/railway.%: dll_src/railway.c $(SCADEFILESO)
	@echo "+------------------------+"
	@echo "| LINKING railway.$* ... |"
	@echo "+------------------------+"
	$(CC) $(COPTS) $(LOPTS) -o dll/railway.$* $?

dll: CC = /home/chsch/OGDF/gcc32 -m32
dll: LOPTS = -shared
dll: clean dll/railway.dll

dll64: CC = /home/chsch/OGDF/gcc64 -m64
dll64: LOPTS = -shared
dll64: clean dll/railway.dll64

dylib: CC = gcc -m32
dylib: LOPTS = -dynamiclib -mmacosx-version-min=10.5
dylib: clean dll/railway.dylib

dylib64: CC = gcc -m64
dylib64: LOPTS = -dynamiclib -mmacosx-version-min=10.5
dylib64: clean dll/railway.dylib64

so: CC = gcc -fPIC -m32
so: LOPTS = -shared
so: clean dll/railway.so

so64: CC = gcc -fPIC -m64
so64: LOPTS = -shared
so64: clean dll/railway.so64

solaris: CC = gcc -fPIC
solaris: LOPTS = -shared -mimpure-text
solaris: clean dll/railway.solaris

RailwayInterfaceTCP.bin: RailwayInterfaceTCP/linuxconio.o $(SCADEFILESO) $(SIMUFILESO)
	@echo "+------------------------------------+"
	@echo "| LINKING RAILWAY INTERFACE NOW ... |"
	@echo "+------------------------------------+"
	$(CC) $(COPTS) $(LIBS) -s -o Executables/RailwayInterfaceTCP RailwayInterfaceTCP/RailwayInterfaceTCP.c $?

RailwayControllerC.bin: Executables/RailwayControllerSample
Executables/RailwayControllerSample: RailwayInterfaceTCP/linuxconio.o $(SCADEFILESO) $(SIMUFILESO)
	@echo "+----------------------------------------------+"
	@echo "| LINKING RAILWAY CONTROLLER C SAMPLE NOW ...  |"
	@echo "+----------------------------------------------+"
	$(CC) $(COPTS) $(LIBS) -s -o Executables/RailwayControllerSample RailwayControllerC/RailwayControllerSample.c $?

SampleController.bin: Executables/SampleController
Executables/SampleController: RailwayControllerC/Controller.c 
Executables/SampleController: RailwayControllerC/SampleController.c RailwayInterfaceTCP/linuxconio.o $(SCADEFILESO) $(SIMUFILESO)
	@echo "+--------------------------------------------+"
	@echo "| LINKING SAMPLE CONTROLLER C SAMPLE NOW ... |"
	@echo "+--------------------------------------------+"
	$(CC) $(COPTS) $(LIBS) -s -o Executables/SampleController RailwayControllerC/SampleController.c RailwayInterfaceTCP/linuxconio.o $(SCADEFILESO) $(SIMUFILESO)

APIDemo.bin: Executables/APIDemo
Executables/APIDemo: RailwayInterfaceTCP/linuxconio.o $(SCADEFILESO) $(SIMUFILESO)
	@echo "+-----------------------------------+"
	@echo "| LINKING API DEMO C SAMPLE NOW ... |"
	@echo "+-----------------------------------+"
	$(CC) $(COPTS) $(LIBS) -s -o Executables/APIDemo RailwayControllerC/apidemo.c $?

RailController.bin: Executables/RailController
Executables/RailController: RailwayInterfaceTCP/linuxconio.o $(SCADEFILESO) $(SIMUFILESO)
	@echo "+--------------------------------+"
	@echo "| LINKING RailController NOW ... |"
	@echo "+--------------------------------+"
	$(CC) $(COPTS) $(LIBS) -s -o Executables/RailController RailwayControllerC/RailController.c $?

clean:
	@echo "+------------------------------------------------------------------+"
	@echo "| DELETING OBJECT FILES, BACKUP FILES AND EXECUTABLE FILES NOW ... |"
	@echo "+------------------------------------------------------------------+"
	rm -f -r ./RailwaySimuSCADE/*.o
	rm -f -r ./RailwayInterfaceTCP/*.o
	rm -f -r ./RailwayControllerC/*.o
	rm -f -r ./RailwaySimuSCADE/*.bak
	rm -f -r ./RailwayInterfaceTCP/*.bak
	rm -f -r ./RailwayControllerC/*.bak
	rm -f -r ./Executables/*.exe
	rm -f -r ./SimulationInterface/*.o
	rm -f -r ./dll/*
	rm -f -r ./bin/
	rm -f  ./sim_info

realclean: clean
	@echo "+---------------------------------------------+"
	@echo "| DELETING ALL CONTENT FROM SIMULATION FOLDER |"
	@echo "+---------------------------------------------+"
	mv ./RailwaySimuSCADE/railway.c ./RailwaySimuSCADE/railway_c.bak
	mv ./RailwaySimuSCADE/railway.h ./RailwaySimuSCADE/railway_h.bak
	rm -f -r ./RailwaySimuSCADE/*.c
	rm -f -r ./RailwaySimuSCADE/*.h
	rm -f  ./sim_info
	mv ./RailwaySimuSCADE/railway_c.bak ./RailwaySimuSCADE/railway.c
	mv ./RailwaySimuSCADE/railway_h.bak ./RailwaySimuSCADE/railway.h
