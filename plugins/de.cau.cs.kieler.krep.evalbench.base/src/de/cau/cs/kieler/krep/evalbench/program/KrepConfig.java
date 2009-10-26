/******************************************************************************
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
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program;

/**
 * @author ctr configuration of the Kiel Reactive Processor
 * 
 */
public class KrepConfig implements Config {

    private final int cores;

    private final int io;

    private final int regs;

    private final int irom;

    private static final int WORD_SIZE = 32;
    
    /**
     * @param cores
     *            number of cores (for KRP)
     * @param io
     *            (number of IO signals)
     * @param regs
     *            (number of registers)
     * @param irom
     *            (size of instruction ROM)
     */
    public KrepConfig(final int cores, final int io, final int regs,
            final int irom) {

        this.cores = cores;
        this.io = io;
        this.regs = regs;
        this.irom = irom;
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
