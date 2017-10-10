LIBS	=-pthread
ODIR	=build
CC	=/usr/bin/gcc
CFLAGS	=-Wall -Wextra
DEPS	=$(ODIR)/parson.o $(ODIR)/addressing.o $(ODIR)/railPi.o

.PHONY: clean all

all:

clean:
	rm -f $(ODIR)/*.o
	rm -f RailController

$(ODIR)/railway.o: railway.c railway.h $(DEPS) | $(ODIR)
	$(CC) -c -o $@ $< $(CFLAGS)

$(ODIR)/%.o: %.c %.h | $(ODIR)
	$(CC) -c -o $@ $< $(CFLAGS)

$(ODIR):
	mkdir -p $(ODIR)

RailController: RailController.c $(ODIR)/railway.o $(DEPS) Controller.c 
	gcc -o $@ RailController.c $(ODIR)/railway.o $(DEPS) $(CFLAGS) $(LIBS)

