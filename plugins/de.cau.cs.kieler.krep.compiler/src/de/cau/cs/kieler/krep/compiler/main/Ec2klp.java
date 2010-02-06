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
package de.cau.cs.kieler.krep.compiler.main;

import java.io.IOException;
import java.io.InputStream;


import de.cau.cs.kieler.krep.compiler.ceq.KlpProgram;
import de.cau.cs.kieler.krep.compiler.ceq.Program;
import de.cau.cs.kieler.krep.compiler.exceptions.ClockException;
import de.cau.cs.kieler.krep.compiler.exceptions.TypeException;
import de.cau.cs.kieler.krep.compiler.lustre.Lustre;
import de.cau.cs.kieler.krep.evalbench.program.ParseException;

/**
 * Compile Lustre ec-file to KLP assembler.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp, tam
 * 
 * @author ctr
 */
public final class Ec2klp {
    /**
     * @param name
     *            name of the program
     * @param ec
     *            input stream with ec code
     * @param useClocks
     *            true to compile for a KLP with hardware clocks
     * @return klp code
     * @throws ParseException
     *             thrown if anything goes wrong during compilation
     */
    public String compile(final String name, final InputStream ec, final boolean useClocks)
            throws ParseException {
        try {
            Lustre lustre;

            lustre = new Lustre(ec);

            lustre.setName(name);

            Program ceq = lustre.getCEQ();

            KlpProgram prog = new KlpProgram(name, ceq);

            prog.propagateConst();

            prog.compile(useClocks, "");
            return prog.toString();
        } catch (IOException e) {
            throw new ParseException(e.getMessage());
        } catch (ClockException e) {
            throw new ParseException(e.getMessage());
        } catch (TypeException e) {
            throw new ParseException(e.getMessage());
        }

    }
}
