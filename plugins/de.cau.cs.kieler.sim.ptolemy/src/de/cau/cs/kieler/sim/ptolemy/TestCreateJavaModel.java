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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.sim.ptolemy;

import ptolemy.actor.IOPortEvent;
import ptolemy.actor.IOPortEventListener;
import ptolemy.actor.Manager;
import ptolemy.actor.TypedCompositeActor;
import ptolemy.actor.TypedIORelation;
import ptolemy.actor.lib.Ramp;
import ptolemy.actor.lib.SetVariable;
import ptolemy.actor.lib.io.LineWriter;
import ptolemy.data.BooleanToken;
import ptolemy.data.DoubleToken;
import ptolemy.data.expr.Parameter;
import ptolemy.domains.sr.kernel.SRDirector;
import ptolemy.kernel.Relation;

/**
 * Simple Test class that creates and executes a ptolemy model from pure Java.
 * @author haf
 *
 */
public class TestCreateJavaModel {

    public static void main(String[] args) {
        try {
            // create a simple Ptolemy model from pure Java API
            TypedCompositeActor rootActor = new TypedCompositeActor();
            
            Ramp ramp = new Ramp(rootActor, "ramp");
            LineWriter writer = new LineWriter(rootActor, "writer");
            writer.alwaysFlush.setToken("true");
            Relation r = new TypedIORelation(rootActor, "r");
            ramp.output.link(r);
            writer.input.link(r);
            
            SRDirector director = new SRDirector();
            director.period.setToken("1.0");
            director.synchronizeToRealTime.setToken("true");
            rootActor.setDirector(director);
            
            // create a Manager that controls the execution lifecycle
            Manager manager = new Manager();
            rootActor.setManager(manager);

            // add a listener to get hands on the produced data
            ramp.output.addIOPortEventListener(new IOPortEventListener(){
                public void portEvent(IOPortEvent event) {
                    System.out.println("IOPortEvent Token: " + event.getToken());
                }
            });
            
            // run forest, run!
            manager.initialize();
            ///manager.stop();
            for(int i=0; i<=10; i++){
                manager.iterate();
            }
            manager.wrapup();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
