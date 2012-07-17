/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package ptolemy.actor.kiel;

import ptolemy.actor.TypedAtomicActor;
import ptolemy.actor.TypedIOPort;
import ptolemy.data.RecordToken;
import ptolemy.kernel.CompositeEntity;
import ptolemy.kernel.util.IllegalActionException;
import ptolemy.kernel.util.NameDuplicationException;

//////////////////////////////////////////////////////////////////////////
//// ModelRailwayMerge

/**
 * Merges one or more RecordTokens which normally contain action commands for the Model Railway (or
 * its simulation). This is needed because there is only at most one ModelRailwayIO Actor as an
 * interface but several concurrent threads may which to set commands (e.g., setting signals, track
 * speeds or switch points). The merging is done in a non-strict fashion, meaning that not all
 * inputs (of the multiport) must be present. Only present ones are merged. If there are no inputs,
 * no tokens will be sent out in this tick. This actor is designed to work in the SR domain. It will
 * give precedence to later connected thread-Actors, meaning they can override previous commands in
 * that tick (if two or more Actors send the same command). This guarantees the I/O-equivalence
 * betweeen this and the generated c-code implementation.
 * 
 * @author Christian Motika
 * @version $Id: ModelRailwayMerge.java 44783 2009-07-01 16:41:17Z $
 * @since Ptolemy II 0.2
 * @Pt.AcceptedRating Red (cmot)
 */
public class ModelRailwayMerge extends TypedAtomicActor {

    private static final long serialVersionUID = -9020218510188527454L;

    /**
     * Instantiates a new model railway merge.
     *
     * @param container the container
     * @param name the name
     * @throws NameDuplicationException the name duplication exception
     * @throws IllegalActionException the illegal action exception
     */
    public ModelRailwayMerge(final CompositeEntity container, final String name)
            throws NameDuplicationException, IllegalActionException {
        super(container, name);

        output = new TypedIOPort(this, "output", false, true);
        input = new TypedIOPort(this, "input", true, false);
        input.setMultiport(true);

        _attachText("_iconDescription",
                 "<svg> <rect width=\"43\" height=\"28\" x=\"-0.11029591\" y=\"0\" id=\"rect4\" " 
                + "style=\"fill:white;stroke:black\" /> <rect width=\"0\" height=\"0.44023773\" " 
                + "x=\"22.562183\" y=\"16.57275\" id=\"rect2446\" style=\"fill:white;stroke:white\"" 
                + " /> <rect width=\"15.298261\" height=\"4.0721989\" x=\"21.180027\" y=\"13.175986\"" 
                + " id=\"rect2448\" style=\"fill:black;stroke:black\" /> <rect width=\"7.2639222\"" 
                + " height=\"3.7420206\" x=\"21.180027\" y=\"9.4339657\" id=\"rect2450\" " 
                + "style=\"fill:black;stroke:black\" /> <rect width=\"2.6414261\" height=\"5.2828526\"" 
                + " x=\"32.516151\" y=\"7.8931332\" id=\"rect2452\" style=\"fill:black;stroke:black\"" 
                + " /> <rect width=\"3.7420206\" height=\"1.6508914\" x=\"23.051037\" y=\"10.75468\"" 
                + " id=\"rect2454\" style=\"fill:white;stroke:white\" /> <rect width=\"2.8615451\"" 
                + " height=\"1.7609509\" x=\"34.497219\" y=\"15.432205\" id=\"rect2456\" " 
                + "style=\"fill:black;stroke:black\" /> <rect width=\"3.3017828\" height=\"0.88047546\"" 
                + " x=\"34.8274\" y=\"16.20262\" id=\"rect2458\" style=\"fill:black;stroke:black\" " 
                + "/> <rect width=\"2.4213076\" height=\"3.9621394\" x=\"22.940977\" y=\"15.487234\"" 
                + " id=\"rect2460\" style=\"fill:blue;stroke:blue\" /> <rect width=\"3.9621396\" " 
                + "height=\"2.5313668\" x=\"22.170565\" y=\"16.09256\" id=\"rect2462\" " 
                + "style=\"fill:blue;stroke:blue\" /> <rect width=\"2.4213076\" height=\"3.9621394\"" 
                + " x=\"27.563473\" y=\"15.487234\" id=\"rect2464\" style=\"fill:blue;stroke:blue\"" 
                + " /> <rect width=\"3.9621396\" height=\"2.5313668\" x=\"26.79306\" y=\"16.20262\"" 
                + " id=\"rect2466\" style=\"fill:blue;stroke:blue\" /> <rect width=\"2.4213076\" " 
                + "height=\"3.9621394\" x=\"33.50668\" y=\"15.487233\" id=\"rect2468\" " 
                + "style=\"fill:blue;stroke:blue\" /> <rect width=\"3.9621396\" height=\"2.5313668\"" 
                + " x=\"32.736267\" y=\"16.202618\" id=\"rect2470\" style=\"fill:blue;stroke:blue\"" 
                + " /> <rect width=\"15.425652\" height=\"0.77041584\" x=\"1.9185004\" y=\"14.44492\"" 
                + " id=\"rect2472\" style=\"fill:black;stroke:black\" /> <rect width=\"0.72881877\" " 
                + "height=\"2.0789964\" x=\"15.867452\" y=\"13.906754\" id=\"rect2474\"" 
                + " style=\"fill:black;stroke:black\" /> <rect width=\"1.4307727\" " 
                + "height=\"1.4307728\" x=\"15.571504\" y=\"14.160671\" id=\"rect2476\" " 
                + "style=\"fill:black;stroke:black\" /> <rect width=\"0.57282907\" " 
                + "height=\"2.5313668\" x=\"15.542905\" y=\"13.642005\" id=\"rect2478\"" 
               + " style=\"fill:black;stroke:black\" /> <rect width=\"0.57282907\" " 
               + "height=\"0.36310935\" x=\"17.313391\" y=\"14.702736\" id=\"rect2480\" " 
               + "style=\"fill:black;stroke:black\" /> <rect width=\"15.425652\"" 
                + " height=\"0.77041584\" x=\"1.8948382\" y=\"21.478294\" id=\"rect2437\" " 
                + "style=\"fill:black;stroke:black\" /> <rect width=\"0.72881877\" " 
                + "height=\"2.0789964\" x=\"15.843789\" y=\"20.940128\" id=\"rect2439\" " 
                + "style=\"fill:black;stroke:black\" /> <rect width=\"1.4307727\" " 
                + "height=\"1.4307728\" x=\"15.547841\" y=\"21.194046\" id=\"rect2441\" " 
                + "style=\"fill:black;stroke:black\" /> <rect width=\"0.57282907\" height=\"2.5313668\"" 
                + " x=\"15.519242\" y=\"20.675381\" id=\"rect2443\" style=\"fill:black;stroke:black\"" 
                + " /> <rect width=\"0.57282907\" height=\"0.36310935\" x=\"17.289728\" y=\"21.736111\"" 
                + " id=\"rect2445\" style=\"fill:black;stroke:black\" /> <rect width=\"15.425652\"" 
                + " height=\"0.77041584\" x=\"1.9468316\" y=\"6.7122402\" id=\"rect2447\" " 
                + "style=\"fill:black;stroke:black\" /> <rect width=\"0.72881877\" " 
                + "height=\"2.0789964\" x=\"15.895782\" y=\"6.1740751\" id=\"rect2449\" " 
                + "style=\"fill:black;stroke:black\" /> <rect width=\"1.4307727\" " 
                + "height=\"1.4307728\" x=\"15.599834\" y=\"6.4279919\" id=\"rect2451\"" 
                + " style=\"fill:black;stroke:black\" /> <rect width=\"0.57282907\" " 
                + "height=\"2.5313668\" x=\"15.571236\" y=\"5.9093256\" id=\"rect2453\"" 
                + " style=\"fill:black;stroke:black\" /> <rect width=\"0.57282907\" " 
                + "height=\"0.36310935\" x=\"17.341722\" y=\"6.9700565\" id=\"rect2455\"" 
                + " style=\"fill:black;stroke:black\" /></svg>"
        );
    }

    // /////////////////////////////////////////////////////////////////
    // // ports and parameters ////

    /**
     * This is a multiport of type RecordToken that will be merged.
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public TypedIOPorts
    public TypedIOPort input;

    /**
     * This will contain all merged RecordTokens, if there are any.
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public TypedIOPorts
    public TypedIOPort output;

    // /////////////////////////////////////////////////////////////////
    // // public methods ////

    /**
     * Collect all tokens from the inputs, if there are any (non-strict). Do this starting w/ the
     * last input so that we give precedence to later input ports (meaning that they can override
     * actions whithin a (macro) tick).
     * 
     * @exception IllegalActionException
     *                If calling send() or super.fire() throws it.
     */
    public void fire() throws IllegalActionException {

        RecordToken outToken = new RecordToken();
        boolean anyInput = false;

        // check for tokens to merge

        // examples:
        // {signals = {lights = 4}}
        // {track0 = {speed = 100}, track1 = {speed = 100}, track10 = {speed = 100}, track11 =
        // {speed = 100}, track2 = {speed = 100}, track3 = {speed = 100}, track4 = {speed = 100},
        // track5 = {speed = 100}, track6 = {speed = 100}, track7 = {speed = 100}}
        // {point20 = {turn = 1}, point24 = {turn = 1}}

        for (int i = input.getWidth() - 1; i >= 0; i--) {
            if (input.hasToken(i)) {
                RecordToken inToken = (RecordToken) input.get(i);
                anyInput = true;
                // earlier tokens will be given precedence
                outToken = RecordToken.merge(outToken, inToken);
            }
        }

        // send out accumulated token
        if (anyInput) {
            output.send(0, outToken);
        }

        super.fire();
    }

    /**
     * Set the RailwayInterface and open a TCP connection to the Model Railway interface program w/
     * the given <i>host</i> and <i>port</i> parameters.
     * 
     * @exception IllegalActionException
     *                If the parent class throws it.
     */
    public void initialize() throws IllegalActionException {
        super.initialize();
    }

    /**
     * Terminate the TCP connection of the Model Railway interface. Set RI object to null so that
     * for the next execution a new connection will be made.
     * 
     * @exception IllegalActionException
     *                Not thrown in this base class.
     */
    public void wrapup() throws IllegalActionException {
        super.wrapup();
    }
}
