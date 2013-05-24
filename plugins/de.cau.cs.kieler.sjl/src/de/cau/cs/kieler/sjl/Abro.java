package de.cau.cs.kieler.sjl;

import java.io.IOException;

import de.cau.cs.kieler.sjl.SJLProgram;

import de.cau.cs.kieler.sjl.Abro.State;
import static de.cau.cs.kieler.sjl.Abro.State.*;

/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

/**
 * @author cmot
 * 
 */
public class Abro extends SJLProgram<State> {

    enum State {
        ABOEntry, ABO, AB, WaitA, WaitB, ABMain, ABOMain 
    }

    public boolean a = false;
    public boolean b = false;
    public boolean r = false;
    public boolean o = false;

    public Abro() {
        super(ABOEntry, 4, 4);
    }

    @Override
    public final void tick() {

        while (!isTickDone()) {
            switch (state()) {
            case ABOEntry:
                pauseB(ABO);
                break;
                
            case ABO:
                fork(AB, 1);
                gotoB(ABOMain);
                break;

            case AB:
                fork(WaitA, 2);
                fork(WaitB, 3);
                gotoB(ABMain);
                break;

            case WaitA:
                if (a) {
                    termB();
                } else {
                    pauseB(WaitA);
                }
                break;

            case WaitB:
                if (b) {
                    termB();
                } else {
                    pauseB(WaitB);
                }
                break;

            case ABMain:
                if (!join()) {
                    pauseB(ABMain);
                }
                else {
                    o = true;
                    termB();
                }
                break;

            case ABOMain:
                if (r) {
                    transB(ABOEntry);
                } else {
                    pauseB(ABOMain);
                }
                break;
            }
        }
    } 
    
    // ------------------------------------------------------------------------
    
    public static void main(final String[] args) {
        java.io.DataInputStream in = 
                new java.io.DataInputStream(System.in);

        Abro abro = new Abro();
        for (int tick = 0; tick < 20; tick++) {
            
            // Set input signals
            String input;
            abro.a = false;
            abro.b = false;
            abro.r = false;
            try {
                input = in.readLine().toLowerCase();
                if (input.contains("a")) {
                    abro.a = true;
                }
                if (input.contains("b")) {
                    abro.b = true;
                }
                if (input.contains("r")) {
                    abro.r = true;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            // Rest output signals
            abro.o = false;
            
            
            // Do tick
            abro.doTick();
            
            // Inspect output signals
            if (abro.o) {
                System.out.println("o");
            }
            
            if(abro.isTerminated()) {
                break;
            }
        }
    }

}
