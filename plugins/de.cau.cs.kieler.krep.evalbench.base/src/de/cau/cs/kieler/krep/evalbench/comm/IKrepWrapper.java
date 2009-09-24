package de.cau.cs.kieler.krep.evalbench.comm;

public interface IKrepWrapper {
       public void terminate();

        public boolean hasOutput() ;
        public byte getOutput() ;

        public void step() ;


        public void send(byte b);

        public void saveEsi(String esiFile);

        public void comment(String comment); 
        
        public String getName();
    }


