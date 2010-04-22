LIB = kep
SRC = .
# Assumptions:
#   $(SRC) contains subfolder $(SRC)/src/
#   $(SRC) can be used to deposit binaries (objects),i.e is writable

SRCs = $(wildcard $(SRC)/src/*.c)

COPTS = -O2 -I.




.SECONDEXPANSION:

#compiling sources
$(SRC)/%.o: $$(subst .o,.c, $$(subst solaris,src,$$(subst linux64,src,$$(subst linux32,src,$$(subst osx64,src,$$(subst osx32,src,$$(subst win64,src,$$(subst win32,src,$$@))))))))
	mkdir -p $(@D)
	$(CC) $(COPTS) $(JAVA_INC) -c -o $@ $<
	
#linking all the stuff
$(LIB_DIR)/%: $$(subst .c,.o, $$(subst src,$$(*D),$(SRCs)))
	mkdir -p .$(@D)
	$(CC) $(COPTS) $(JAVA_INC) $(LOPTS) $(JAVA_LIB) -o ./$@ $^


# run this target on calendar (it's a cross compiler)
win32: CC = /opt/mingw-w32/bin/i686-w64-mingw32-gcc -m32
win32: JAVA_INC = -I/System/Library/Frameworks/JavaVM.framework/Headers
win32: LOPTS = -shared -static-libgcc -static-libstdc++
win32: JAVA_LIB =
win32: $(LIB_DIR)/$$@/$(LIB).dll

# run this target on calendar (it's a cross compiler)
win64: CC = /opt/mingw-w64/bin/x86_64-w64-mingw32-gcc -m64
win64: JAVA_INC = -I/System/Library/Frameworks/JavaVM.framework/Headers
win64: LOPTS = -shared -static-libgcc -static-libstdc++
win64: JAVA_LIB =
win64: $(LIB_DIR)/$$@/$(LIB).dll

# run this target on calendar
osx32: CC = gcc -m32
osx32: JAVA_INC = -I/System/Library/Frameworks/JavaVM.framework/Headers
osx32: LOPTS = -dynamiclib -static-libgcc -static-libstdc++ -mmacosx-version-min=10.5
osx32: JAVA_LIB = -framework JavaVM
osx32: $(LIB_DIR)/$$@/lib$(LIB).jnilib $?

# run this target on calendar
osx64: CC = gcc -m64
osx64: JAVA_INC = -I/System/Library/Frameworks/JavaVM.framework/Headers
osx64: LOPTS = -dynamiclib -static-libgcc -static-libstdc++ -mmacosx-version-min=10.5
osx64: JAVA_LIB = -framework JavaVM
osx64: $(LIB_DIR)/$$@/lib$(LIB).jnilib $?

# run this target on epoch
linux32: CC = gcc -fPIC -m32
linux32: JAVA_INC = -I/usr/lib/jvm/java-6-openjdk/include -I/usr/lib/jvm/java-6-openjdk/include/linux
linux32: LOPTS = -shared -static-libgcc
linux32: JAVA_LIB =
linux32: $(LIB_DIR)/$$@/lib$(LIB).so $?

# run this target on hudson
linux64: CC = gcc -fPIC -m64
linux64: JAVA_INC = -I/usr/lib/jvm/java-6-sun/include -I/usr/lib/jvm/java-6-sun/include/linux
linux64: LOPTS = -shared -static-libgcc
linux64: JAVA_LIB =
linux64: $(LIB_DIR)/$$@/lib$(LIB).so $?

# run this target on sauron
solaris: CC = gcc -fPIC
solaris: JAVA_INC = -I/usr/java/include -I/usr/java/include/solaris
solaris: LOPTS = -shared -mimpure-text
solaris: JAVA_LIB = 
solaris: $(LIB_DIR)/$$@/lib$(LIB).so $?


copy:
	if test -e $(SRC)/linux32; then \
	cp $(SRC)/linux32/* ../../de.cau.cs.kieler.krep.proc.kep.linux.x86/; fi
	if test -e $(SRC)/linux64; then \
	cp $(SRC)/linux64/* ../../de.cau.cs.kieler.krep.proc.kep.linux.x86_64/; fi
	if test -e $(SRC)/win32; then \
	cp $(SRC)/win32/* ../../de.cau.cs.kieler.krep.proc.kep.win32.x86/; fi
	if test -e $(SRC)/win64; then \
	cp $(SRC)/win64/* ../../de.cau.cs.kieler.krep.proc.kep.win32.x86_64/; fi
	if test -e $(SRC)/osx32; then \
	cp $(SRC)/osx32/* ../../de.cau.cs.kieler.krep.proc.kep.macosx.x86/; fi
	if test -e $(SRC)/osx64; then \
	cp $(SRC)/osx64/* ../../de.cau.cs.kieler.krep.proc.kep.macosx.x86_64/; fi 
	if test -e $(SRC)/solaris; \
	then \cp $(SRC)/solaris/* ../../de.cau.cs.kieler.krep.proc.kep.solaris.sparc/; fi

