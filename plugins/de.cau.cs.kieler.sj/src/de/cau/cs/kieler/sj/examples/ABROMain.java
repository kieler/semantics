/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sj.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import de.cau.cs.kieler.sj.Signal;
import de.cau.cs.kieler.sj.SignalConverter;
import de.cau.cs.kieler.sj.exceptions.SignalNotDeclaredException;

/**
 * Class that gives you a command line interface for the program {@link ABRO}.
 * By modifying this class you can use it for other examples too.  
 * 
 * @author mhei
 * 
 */
final class ABROMain {

    /**
     * A instance of this class does not make any sense.
     */
    private ABROMain() {
    }

    /**
     * Main for the program ABRO. The method will ask you for input signals for a tick. After a tick
     * the method prints the signals of the program and there current value.
     * 
     * @param args
     *            not used
     * @throws IOException
     *             thrown if the given command line inputs are illegal.
     */
    public static void main(final String[] args) throws IOException {
        // for reading the signal from the terminal
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // creating a new instance of ABRO
        ABRO program = new ABRO();

        System.out.println("The program " + program.getName() + " is running");
        System.out.println("Please enter a list of the present signals for this tick "
                + "seperated by an empty character.\nFor example enter \"a b\"."
                + " Attention your input is case sensitive. \"a\" != \"A\"");

        while (!program.isTerminated()) {

            ArrayList<Signal> inputSignals = new ArrayList<Signal>();
            for (String s : in.readLine().split(" ")) {
                try {
                    inputSignals.add(SignalConverter.string2Signal(program, s));
                } catch (SignalNotDeclaredException e) {
                    System.out.println("ERROR: The signal " + s + " is not part of "
                            + program.getName());
                }
            }

            Signal[] signalArray = program.doTick(inputSignals.toArray(new Signal[inputSignals
                    .size()]));
            System.out.println("Signals after tick");
            for (Signal s : signalArray) {
                System.out.println(s);
            }

            if (!program.isTerminated()) {
                System.out.print("Please enter the signal for the current tick: ");
            }

        }
    }
}
