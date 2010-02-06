/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.krep.evalbench.program;

/**
 * Holds the actual configuration of a Kiel Reactive Processor.
 * 
 * @kieler.rating 2010-01-28 proposed yellow ctr
 * 
 * @author ctr 
 * 
 */
public class KlpConfig implements IConfig {

    private final int cores;

    private final int io;

    private final int regs;

    private final int irom;

    private static final int WORD_SIZE = 32;
    
    /**
     * @param ncores
     *            number of cores (for KRP)
     * @param nio
     *            (number of IO signals)
     * @param nregs
     *            (number of registers)
     * @param nirom
     *            (size of instruction ROM)
     */
    public KlpConfig(final int ncores, final int nio, final int nregs,
            final int nirom) {

        this.cores = ncores;
        this.io = nio;
        this.regs = nregs;
        this.irom = nirom;
    }

    /**
     * @return length of one word
     */
    public int getLWord() {
        return WORD_SIZE;
    }

    /**
     * @return number of cores
     */
    public int getCores() {
        return cores;
    }

    /**
     * @return number of IO signals
     */
    public int getIo() {
        return io;
    }

    /**
     * @return number of registers
     */
    public int getRegs() {
        return regs;
    }

    /**
     * @return size of the instruction ROM
     */
    public int getIrom() {
        return irom;
    }

    /**
     * @return whether the processor is a Kiel Esterel processor
     */
    public boolean isKEP() {
        return false;
    }

    /**
     * @return whether the processor is a Kiel Lustre processor
     */
    public boolean isKLP() {
        return true;
    }

}
