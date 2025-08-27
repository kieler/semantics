/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package ptolemy.actor.kiel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import ptolemy.actor.TypedAtomicActor;
import ptolemy.actor.TypedIOPort;
import ptolemy.data.ArrayToken;
import ptolemy.data.Token;
import ptolemy.data.RecordToken;
import ptolemy.data.StringToken;
import ptolemy.data.IntToken;
import ptolemy.data.expr.Parameter;
import ptolemy.kernel.CompositeEntity;
import ptolemy.kernel.util.IllegalActionException;
import ptolemy.kernel.util.NameDuplicationException;


//////////////////////////////////////////////////////////////////////////
//// ModelRailwayIO

/**
 * Interacts with the Model Railway (and its simulation) of the Department of Computer Science of
 * Kiel University, Germany. The Model Railway can be found here:
 * http://www.informatik.uni-kiel.de/~railway/ The simulation of the Model Railway can be found
 * here: http://rtsys.informatik.uni-kiel.de/~biblio/downloads/theses/cmot-st.pdf
 * 
 * Input track, point and signal commands as RecordTokens of the following form:
 * port={track2={motormode=1,speed=100}} where motormode can be off(0), primary(1), secondary(2) or
 * brake(3) DEFAULT is primary(1) and speed is a value between 0 .. 100 DEFAULT is 0
 * port={point2={turn=0}} where a turn value of 0 indicates straight and a turn value of 1 indicates
 * turn position DEFAULT is straight(0) port={signal2a={lights=2}} where a means first and b means
 * second in default driving direction of the selected track (here 2) and lights can be off(0),
 * red(1), yellowgreen(2), green(4) DEFAULT is red(1)
 * 
 * Output of this actor are two ArrayTokens contact and occupied that can be used to obtain
 * information about the triggered reed contacts or the occupied track segments with the following
 * meaning of values: contact: not triggered(-1), triggered first(0) and triggered second(1) in
 * default driving direction occupied: not occupied(0) or occupied(1)
 * 
 * @author Christian Motika
 * @version $Id: ModelRailwayIO.java 44783 2009-06-07 16:41:17Z $
 * @since Ptolemy II 0.2
 * @Pt.AcceptedRating Red (cmot)
 * @kieler.ignore (excluded from review process)
 */
public class ModelRailwayIO extends TypedAtomicActor {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 388474308353640810L;

    /**
     * Construct an actor with the given container and name. In addition to invoking the base class
     * constructors, construct the <i>host</i> and <i>port</i> parameters, the <i>speed</i>,
     * <i>point</i> and <i>signal</i> input ports and the <i>contact</i> and <i>occupied</i> output
     * ports. Initialize <i>host</i> to StringToken with value 'localhost', and <i>port</i> to
     * IntToken with value 2000.
     * 
     * @param container
     *            The container.
     * @param name
     *            The name of this actor.
     * @throws NameDuplicationException
     *             If the container already has an actor with this name.
     * @throws IllegalActionException
     *             If the actor cannot be contained by the proposed container.
     */
    public ModelRailwayIO(final CompositeEntity container, final String name)
            throws NameDuplicationException, IllegalActionException {
        super(container, name);

        host = new Parameter(this, "host");
        host.setExpression("'localhost'");
        port = new Parameter(this, "port");
        port.setExpression("2000");

        trigger = new TypedIOPort(this, "trigger", true, false);
        tracks = new TypedIOPort(this, "tracks", true, false);
        points = new TypedIOPort(this, "points", true, false);
        signals = new TypedIOPort(this, "signals", true, false);
        contact = new TypedIOPort(this, "contact", false, true);
        occupied = new TypedIOPort(this, "occupied", false, true);

        _attachText(
                "_iconDescription",
                "<svg> <rect x=\"0.11029591\" y=\"-5.8537886\" width=\"60\" height=\"50\" " 
                + "style=\"fill:white\" id=\"rect4\" /> <rect style=\"fill:blue;stroke:blue\""
                + " width=\"4.3014708\" height=\"7.2794118\" x=\"42.794117\" y=\"27.205883\" "
                + "id=\"rect46\" /> <rect style=\"fill:blue;stroke:blue\" width=\"8.1617651\""
                + " height=\"4.1911764\" x=\"40.808823\" y=\"28.970589\" id=\"rect44\" /> <rect" 
                + " style=\"fill:blue;stroke:blue\" width=\"4.3014708\" height=\"7.2794118\"" 
                + " x=\"26.80147\" y=\"27.095589\" id=\"rect40\" /> <rect " 
                + "style=\"fill:blue;stroke:blue\" width=\"8.1617651\" height=\"4.1911764\" " 
                + "x=\"24.816175\" y=\"28.860294\" id=\"rect38\" /> <rect style=\"fill:black;" 
                + "stroke:black\" width=\"17.678572\" height=\"2.8571427\" x=\"8.8602943\" " 
                + "y=\"8.8550434\" id=\"rect6\" /> <rect style=\"fill:black;stroke:black\" " 
                + "width=\"17.678572\" height=\"2.8571427\" x=\"8.4821415\" y=\"26.357141\"" 
                + " id=\"rect8\" /> <rect style=\"fill:blue;stroke:blue\" width=\"8.1617651\"" 
                + " height=\"4.1911764\" x=\"14.227942\" y=\"28.970589\" id=\"rect30\" /> " 
                + "<rect style=\"fill:black;stroke:black\" width=\"14.642858\" height=\"7.8886552\" " 
                + "x=\"11.875\" y=\"11.575629\" id=\"rect10\" /> <rect style=\"fill:blue;stroke:" 
                + "blue\" width=\"4.3014708\" height=\"7.2794118\" x=\"16.213236\" y=\"27.205883\"" 
                + " id=\"rect32\" /> <rect style=\"fill:black;stroke:black\" width=\"39.642857\"" 
                + " height=\"11.060924\" x=\"11.875\" y=\"18.046219\" id=\"rect12\" /> " 
                + "<rect style=\"fill:black;stroke:black\" width=\"4.7220092\" height=\"9.9465933\"" 
                + " x=\"46.669132\" y=\"8.8365469\" id=\"rect14\" /> " 
                + "<rect style=\"fill:grey;stroke:grey\" width=\"11.454833\" height=\"2.6785715\"" 
                + " x=\"37.284664\" y=\"3.6985292\" id=\"rect16\" /> <rect style=\"fill:" 
                + "darkgrey;stroke:darkgrey\" width=\"10\" height=\"3.3928571\" x=\"41.42857\"" 
                + " y=\"6.0357141\" id=\"rect18\" /> <rect style=\"fill:black;stroke:black\" " 
                + "width=\"3.5714285\" height=\"3.3928571\" x=\"38.597687\" y=\"15.873949\"" 
                + " id=\"rect20\" /> <rect style=\"fill:black;stroke:black\" width=\"2.1428571\"" 
                + " height=\"5\" x=\"51.42857\" y=\"24.178572\" id=\"rect22\" /> <rect" 
                + " style=\"fill:black;stroke:black\" width=\"1.7857143\" height=\"3.2142856\" " 
                + "x=\"53.214287\" y=\"25.964285\" id=\"rect24\" /> <rect " 
                + "style=\"fill:white;stroke:white\" width=\"7.1499014\" height=\"2.938061\"" 
                + " x=\"15.703809\" y=\"13.331933\" id=\"rect26\" /> <rect " 
                + "style=\"fill:blue;stroke:blue\" width=\"6.6176472\" height=\"6.397059\"" 
                + " x=\"15\" y=\"27.647058\" id=\"rect28\" /> <rect style=\"fill:grey;stroke:grey\"" 
                + " width=\"10\" height=\"3.3928571\" x=\"33.051472\" y=\"5.7521009\" id=\"rect34\" " 
                + "/> <rect style=\"fill:blue;stroke:blue\" width=\"6.6176472\" height=\"6.397059\"" 
                + " x=\"25.588234\" y=\"27.536764\" id=\"rect36\" /> <rect " 
                + "style=\"fill:blue;stroke:blue\" width=\"6.6176472\" height=\"6.397059\"" 
                + "x=\"41.580879\" y=\"27.647058\" id=\"rect42\" /></svg>\n");
    }

    // /////////////////////////////////////////////////////////////////
    // // ports and parameters ////

    /**
     * The host and port to make the connection to, i.e., where the Model Railway interface program
     * is running. Often this is set to the string value 'localhost' for the host and 2000 for the
     * port.
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public Parameters
    public Parameter host;

    /**
     * The host and port to make the connection to, i.e., where the Model Railway interface program
     * is running. Often this is set to the string value 'localhost' for the host and 2000 for the
     * port.
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public Parameters
    public Parameter port;

    /**
     * This may trigger the actor in a DE domain.
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public TypedIOPorts
    public TypedIOPort trigger;

    /**
     * Set the speed of some tracks using RecordTokens like port={track5={motormode=1,speed=100}
     * where motormode can be off(0), primary(1), secondary(2) or brake(3) DEFAULT is primary(1) and
     * speed is a value between 0 .. 100 DEFAULT is 0
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public TypedIOPorts
    public TypedIOPort tracks;

    /**
     * Set a point using RecordTokens like port={point21={turn=0}} where a turn value of 0 indicates
     * straight and a turn value of 1 indicates turn position DEFAULT is straight(0).
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public TypedIOPorts
    public TypedIOPort points;

    /**
     * Set a signal using RecordTokens like port={signal2a={lights=2}} where a means first and b
     * second signal in default driving direction of the selected track (here 2) and lights can be
     * off(0), red(1), yellowgreen(2), green(4) DEFAULT is red(1).
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public TypedIOPorts
    public TypedIOPort signals;

    /**
     * This will hold ArrayTokens of reed contact values of not triggered(-1), triggered first(0)
     * and triggered second(1) in default driving direction.
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public TypedIOPorts
    public TypedIOPort contact;

    /** This will hold ArrayTokens of occupied values of not occupied(0) or occupied(1). */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public TypedIOPorts
    public TypedIOPort occupied;

    /** The Constant MAXTRACKS. */
    public static final int MAXTRACKS = 48;

    /** The Constant MAXLIGHTS. */
    public static final int MAXLIGHTS = 30;

    /** The Constant MAXPOINTS. */
    public static final int MAXPOINTS = 29;

    // /////////////////////////////////////////////////////////////////
    // // public methods ////

    /**
     * Collect the trigger Token first, then process possible speed, point or signal commands. After
     * that collect the reed contact values to an ArrayToken. Also do this for the occupied track
     * states.
     * 
     * @throws IllegalActionException
     *             If calling send() or super.fire() throws it.
     */
    public void fire() throws IllegalActionException {
        // dispose trigger Token
        if (trigger.getWidth() > 0) {
            if (trigger.hasToken(0)) {
                trigger.get(0);
            }
        }

        // process track commands
        if (tracks.getWidth() > 0) {
            if (tracks.hasToken(0)) {
                RecordToken token = (RecordToken) tracks.get(0);
                for (int i = 0; i < MAXTRACKS; i++) {
                    try {
                        RecordToken token2 = (RecordToken) token.get("track" + i);
                        if (token2 != null) {
                            int paraMotormode = RailwayInterface.MOTORMODE_PRIMARY; // 1
                            int paraSpeed = 0;
                            try {
                                paraMotormode = ((IntToken) token2.get("motormode")).intValue();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            try {
                                paraSpeed = ((IntToken) token2.get("speed")).intValue();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            railwayInterface.setTrack(i, paraMotormode, paraSpeed);
                            System.out.println("track" + i + " " + paraMotormode + " " + paraSpeed);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                // ALL tracks
                try {
                    RecordToken token2 = (RecordToken) token.get("tracks");
                    if (token2 != null) {
                        int paraMotormode = RailwayInterface.MOTORMODE_PRIMARY; // 1
                        int paraSpeed = 0;
                        try {
                            paraMotormode = ((IntToken) token2.get("motormode")).intValue();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        try {
                            paraSpeed = ((IntToken) token2.get("speed")).intValue();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        railwayInterface.setTrack(-1, paraMotormode, paraSpeed);
                        System.out.println("tracks " + paraMotormode + " " + paraSpeed);
                    }
                } catch (Exception e) {
                    // ignore
                }
            }
        }

        // process point commands
        if (points.getWidth() > 0) {
            if (points.hasToken(0)) {
                RecordToken token = (RecordToken) points.get(0);
                for (int i = 0; i < MAXLIGHTS; i++) {
                    try {
                        RecordToken token2 = (RecordToken) token.get("point" + i);
                        if (token2 != null) {
                            int paraTurn = 0; // RI.POINT_STRAIGHT
                            try {
                                paraTurn = ((IntToken) token2.get("turn")).intValue();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            railwayInterface.setPoint(i, (paraTurn == 1));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                // ALL points
                try {
                    RecordToken token2 = (RecordToken) token.get("points");
                    if (token2 != null) {
                        int paraTurn = 0; // RI.POINT_STRAIGHT
                        try {
                            paraTurn = ((IntToken) token2.get("turn")).intValue();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        railwayInterface.setPoint(-1, (paraTurn == 1));
                    }
                } catch (Exception e) {
                    // ignore
                }
            }
        }

        // process signal commands
        if (signals.getWidth() > 0) {
            if (signals.hasToken(0)) {
                RecordToken token = (RecordToken) signals.get(0);
                for (int i = 0; i < MAXTRACKS; i++) {
                    try {
                        RecordToken token2 = (RecordToken) token.get("signal" + i + "a");
                        if (token2 != null) {
                            int paraLights = RailwayInterface.SIGNAL_RED; // 1
                            try {
                                paraLights = ((IntToken) token2.get("lights")).intValue();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            railwayInterface.setSignal(i, 0, paraLights);
                        }
                    } catch (Exception e) {
                        // ignore
                    }
                }
                for (int i = 1; i < MAXPOINTS; i++) {
                    try {
                        RecordToken token2 = (RecordToken) token.get("point" + i + "b");
                        if (token2 != null) {
                            int paraLights = RailwayInterface.SIGNAL_RED; // 1
                            try {
                                paraLights = ((IntToken) token2.get("lights")).intValue();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            railwayInterface.setSignal(i, 1, paraLights);
                        }
                    } catch (Exception e) {
                        // ignore
                    }
                }
                // ALL signals
                try {
                    RecordToken token2 = (RecordToken) token.get("signals");
                    if (token2 != null) {
                        int paraLights = RailwayInterface.SIGNAL_RED; // 1
                        try {
                            paraLights = ((IntToken) token2.get("lights")).intValue();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        railwayInterface.setSignal(-1, 0, paraLights);
                        railwayInterface.setSignal(-1, 1, paraLights);
                    }
                } catch (Exception e) {
                    // ignore
                }
            }
        }

            // process contact events
            boolean found = true;
            Token[] tokenArray = new Token[MAXTRACKS];
            int maxfound = MAXTRACKS;
            int foundcnt = 0;
            while ((found && !this._stopRequested) && (foundcnt < maxfound)) {
                found = false;
                try {
                    RailwayInterface.Contact scancontact = railwayInterface.scanContact(-1, -1,
                            true);
                    if ((scancontact.tracknum > -1) && (scancontact.tracknum < MAXTRACKS)) {
                        tokenArray[scancontact.tracknum] = new IntToken(scancontact.contactno);
                        found = true;
                        foundcnt++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            for (int track = 0; track < MAXTRACKS; track++) {
                if (tokenArray[track] == null) {
                    tokenArray[track] = new IntToken(-1);
                }
            }
            contact.send(0, new ArrayToken(tokenArray));

            // process occupied events
            found = true;
            tokenArray = new Token[MAXTRACKS];
            maxfound = MAXTRACKS;
            foundcnt = 0;
            int currentTrack = -1; // start w/ track 0 (-1+1=0)
            while ((found && !this._stopRequested) && (foundcnt < maxfound)) {
                found = false;
                try {
                    currentTrack = railwayInterface.scanTrackUsed(currentTrack);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (currentTrack > -1) {
                    tokenArray[currentTrack] = new IntToken(1);
                    found = true;
                    foundcnt++;
                }
            }
            for (int track = 0; track < MAXTRACKS; track++) {
                if (tokenArray[track] == null) {
                    tokenArray[track] = new IntToken(0);
                }
            }
            occupied.send(0, new ArrayToken(tokenArray));

        super.fire();
    }

    /**
     * Set the RailwayInterface and open a TCP connection to the Model Railway interface program w/
     * the given <i>host</i> and <i>port</i> parameters.
     * 
     * @throws IllegalActionException
     *             If the parent class throws it.
     */
    public void initialize() throws IllegalActionException {

        try {
            if (railwayInterface == null) {
                railwayInterface = new RailwayInterface(
                        ((StringToken) host.getToken()).stringValue(),
                        ((IntToken) port.getToken()).intValue());
            }
        } catch (Exception e) {
            IllegalActionException e2 = new IllegalActionException(e.getMessage());
            throw (e2);
        }

        super.initialize();
    }

    /**
     * Terminate the TCP connection of the Model Railway interface. Set RI object to null so that
     * for the next execution a new connection will be made.
     * 
     * @throws IllegalActionException
     *             Not thrown in this base class.
     */
    public void wrapup() throws IllegalActionException {
        railwayInterface.abortTCPConnection();
        railwayInterface = null;
        super.wrapup();
    }

    // /////////////////////////////////////////////////////////////////
    // // private variables ////
    /** The railway interface. */
    private RailwayInterface railwayInterface;

    // ============================================================================
    // == Model Railway Interface - Java Side Part == (c) C.Motika, Aug 2007 ==
    // ============================================================================

    /**
     * This module implements the Java side part of the Model Railway Interface that is intended to
     * fit together with the Simulation and with the real Model Railway Interface (UDP and Ethernet)
     * invented initially by Stephan H�rmann.
     * 
     * The class below defines similar methods to be used in Java programs. An attached
     * SampleController.java shows an example of how to use this class. Each method is described
     * below. Often there are predefined constants that should be used in order to clarify the
     * resulting programming code.
     * 
     * An instance of this class connects over the given host/port to the tcp interface program. The
     * simulation cannot be started by the controller. There fore the GUI program that is also
     * connected to the interface program that includes the simulation is used. It will give the
     * user the possibility to start the simulation with a given delay and force the incrementation
     * of the simulation ticks. On the real model railway the simulation related methods defined by
     * this class will have no meaning and will be ignored.
     * 
     * @author cmot
     */
    public static class RailwayInterface {

        /** The Constant IC_JCT_0. */
        public static final int IC_JCT_0 = 0;

        /** The Constant IC_LN_0. */
        public static final int IC_LN_0 = 1;

        /** The Constant IC_LN_1. */
        public static final int IC_LN_1 = 2;

        /** The Constant IC_LN_2. */
        public static final int IC_LN_2 = 3;

        /** The Constant IC_LN_3. */
        public static final int IC_LN_3 = 4;

        /** The Constant IC_LN_4. */
        public static final int IC_LN_4 = 5;

        /** The Constant IC_LN_5. */
        public static final int IC_LN_5 = 6;

        /** The Constant IC_ST_0. */
        public static final int IC_ST_0 = 7;

        /** The Constant IC_ST_1. */
        public static final int IC_ST_1 = 8;

        /** The Constant IC_ST_2. */
        public static final int IC_ST_2 = 9;

        /** The Constant IC_ST_3. */
        public static final int IC_ST_3 = 10;

        /** The Constant IC_ST_4. */
        public static final int IC_ST_4 = 11;

        /** The Constant IO_LN_0. */
        public static final int IO_LN_0 = 12;

        /** The Constant IO_LN_1. */
        public static final int IO_LN_1 = 13;

        /** The Constant IO_LN_2. */
        public static final int IO_LN_2 = 14;

        /** The Constant KH_LN_0. */
        public static final int KH_LN_0 = 15;

        /** The Constant KH_LN_1. */
        public static final int KH_LN_1 = 16;

        /** The Constant KH_LN_2. */
        public static final int KH_LN_2 = 17;

        /** The Constant KH_LN_3. */
        public static final int KH_LN_3 = 18;

        /** The Constant KH_LN_4. */
        public static final int KH_LN_4 = 19;

        /** The Constant KH_LN_5. */
        public static final int KH_LN_5 = 20;

        /** The Constant KH_LN_6. */
        public static final int KH_LN_6 = 21;

        /** The Constant KH_LN_7. */
        public static final int KH_LN_7 = 22;

        /** The Constant KH_LN_8. */
        public static final int KH_LN_8 = 23;

        /** The Constant KH_ST_0. */
        public static final int KH_ST_0 = 24;

        /** The Constant KH_ST_1. */
        public static final int KH_ST_1 = 25;

        /** The Constant KH_ST_2. */
        public static final int KH_ST_2 = 26;

        /** The Constant KH_ST_3. */
        public static final int KH_ST_3 = 27;

        /** The Constant KH_ST_4. */
        public static final int KH_ST_4 = 28;

        /** The Constant KH_ST_5. */
        public static final int KH_ST_5 = 29;

        /** The Constant KH_ST_6. */
        public static final int KH_ST_6 = 30;

        /** The Constant KIO_LN_0. */
        public static final int KIO_LN_0 = 31;

        /** The Constant KIO_LN_1. */
        public static final int KIO_LN_1 = 32;

        /** The Constant OC_JCT_0. */
        public static final int OC_JCT_0 = 33;

        /** The Constant OC_LN_0. */
        public static final int OC_LN_0 = 34;

        /** The Constant OC_LN_1. */
        public static final int OC_LN_1 = 35;

        /** The Constant OC_LN_2. */
        public static final int OC_LN_2 = 36;

        /** The Constant OC_LN_3. */
        public static final int OC_LN_3 = 37;

        /** The Constant OC_LN_4. */
        public static final int OC_LN_4 = 38;

        /** The Constant OC_LN_5. */
        public static final int OC_LN_5 = 39;

        /** The Constant OC_ST_0. */
        public static final int OC_ST_0 = 40;

        /** The Constant OC_ST_1. */
        public static final int OC_ST_1 = 41;

        /** The Constant OC_ST_2. */
        public static final int OC_ST_2 = 42;

        /** The Constant OC_ST_3. */
        public static final int OC_ST_3 = 43;

        /** The Constant OC_ST_4. */
        public static final int OC_ST_4 = 44;

        /** The Constant OI_LN_0. */
        public static final int OI_LN_0 = 45;

        /** The Constant OI_LN_1. */
        public static final int OI_LN_1 = 46;

        /** The Constant OI_LN_2. */
        public static final int OI_LN_2 = 47;

        /** The Constant MOTORMODE_OFF. */
        public static final int MOTORMODE_OFF = 0;

        /** The Constant MOTORMODE_PRIMARY. */
        public static final int MOTORMODE_PRIMARY = 1;

        /** The Constant MOTORMODE_SECONDARY. */
        public static final int MOTORMODE_SECONDARY = 2;

        /** The Constant MOTORMODE_BRAKE. */
        public static final int MOTORMODE_BRAKE = 3;

        /** The Constant CONTACTEVENT_NONE. */
        public static final int CONTACTEVENT_NONE = 0;

        /** The Constant CONTACTEVENT_FWD. */
        public static final int CONTACTEVENT_FWD = 0;

        /** The Constant CONTACTEVENT_REV. */
        public static final int CONTACTEVENT_REV = 0;

        /** The Constant CONTACTEVENT_UNI. */
        public static final int CONTACTEVENT_UNI = 0;

        /** The Constant SIGNAL_RED. */
        public static final int SIGNAL_RED = 1;

        /** The Constant SIGNAL_YELLOW. */
        public static final int SIGNAL_YELLOW = 2;

        /** The Constant SIGNAL_GREEN. */
        public static final int SIGNAL_GREEN = 4;

        /** The Constant POINT_STRAIGHT. */
        public static final boolean POINT_STRAIGHT = false;

        /** The Constant POINT_TURN. */
        public static final boolean POINT_TURN = true;

        /** The Constant ALL_TRACKS. */
        public static final int ALL_TRACKS = -1;

        /** The Constant ALL_POINTS. */
        public static final int ALL_POINTS = -1;

        /** The Constant ALL_SIGNALS. */
        public static final int ALL_SIGNALS = -1;

        /** The Constant SIGNAL_FIRST. */
        public static final int SIGNAL_FIRST = 0;

        /** The Constant SIGNAL_SECOND. */
        public static final int SIGNAL_SECOND = 1;

        /** The Constant CONTACT_FIST. */
        public static final int CONTACT_FIST = 0;

        /** The Constant CONTACT_SECOND. */
        public static final int CONTACT_SECOND = 1;

        /** The Tcp communication. */
        private TAsyncCom tcpCommunication;

        // //----------------------------------------------------------------------

        /**
         * Instantiates a new railway interface.
         * 
         * @param host
         *            specifies the url/ip of the machine on which the
         * @param port
         *            specifies the port of the machine that the interface
         * @throws IOException
         *             Signals that an I/O exception has occurred.
         */
        public RailwayInterface(final String host, final int port) throws IOException {
            tcpCommunication = new TAsyncCom(host, port);
        }

        // ----------------------------------------------------------------------

        /**
         * Sets the initial train.
         * 
         * @param tracknum
         *            specifies the number (id) of the track - here a class internal constant should
         *            be used (s.a.)
         */
        public void setInitialTrain(final int tracknum) {
            setInitialTrain(tracknum, true);
        }

        /**
         * Sets the initial train.
         * 
         * @param tracknum
         *            specifies the number (id) of the track - here a class internal constant should
         *            be used (s.a.)
         * @param forward
         *            the sets the alignment, forward=default, if false the train will be placed the
         *            other way round THIS PARAMETER IS OPTIONAL
         */
        public void setInitialTrain(final int tracknum, final boolean forward) {
            if (forward) {
                tcpCommunication.send("SETINITIALTRAIN#" + tracknum + "\r\n");
            } else {
                tcpCommunication.send("SETINITIALTRAINEX#" + tracknum + "#1\r\n");
            }
        }

        // ----------------------------------------------------------------------

        /**
         * Clear all initial trains.
         */
        public void resetInitialTrains() {
            tcpCommunication.send("RESETINITIALTRAINS\r\n");
        }

        // ----------------------------------------------------------------------

        /**
         * Stops the TCP interface part of the interface program and force the connection between an
         * instance of this class and the program to be terminated. The interface program will exit
         * its tcp interface thread.
         */
        public void abortInterface() {
            tcpCommunication.send("ABORTINTERFACE\r\n");
            try {
                tcpCommunication.socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * Abort the TCP connection.
         */
        public void abortTCPConnection() {
            try {
                tcpCommunication.socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // ----------------------------------------------------------------------

        /**
         * Stops the GUI interface part of the interface program and force the connection between
         * the GUI and the program to be terminated. The interface program will exit its GUI
         * interface thread.
         */
        public void abortSimulation() {
            tcpCommunication.send("ABORTSIMULATION\r\n");
        }

        // ----------------------------------------------------------------------

        /**
         * This resets the Simulation meaning to clear the initial trains and restart the
         * simulation. (see below)
         */
        public void resetSimulation() {
            tcpCommunication.send("RESETSIMULATION\r\n");
        }

        // ----------------------------------------------------------------------

        /**
         * This restarts the simulation meaning to clear all not consumed contact events and restart
         * the simulation at tick 0.
         */
        public void restartSimulation() {
            tcpCommunication.send("RESTARTSIMULATION\r\n");
        }

        // ----------------------------------------------------------------------

        /**
         * This method returns the current internal tick of the simulation that is included in the
         * TCP interface program an instance of this class is connected to.
         * 
         * @return integer that represents the ticks passed since the simulation was started
         */
        public int getSimulationTick() {
            int tick = -1;
            try {
                tick = new Integer(tcpCommunication.sendAndReceive("GETSIMULATIONTICK\r\n"))
                        .intValue();
            } catch (Exception e) {
                // ignore
            }
            return tick;
        }

        // ----------------------------------------------------------------------

        /**
         * This method will shutdown the real model railway hardware an reset the attached
         * peripherals. In the simulation it is a simple abortion of the simulation.
         */
        public void railwayStopControl() {
            tcpCommunication.send("RAILWAYSTOPCONTROL\r\n");
        }

        // ----------------------------------------------------------------------

        /**
         * In the real world this function will return the status of the controller pheripherals
         * whether an fatal error occurred which prevents the hardware to work correctly. In the
         * simulation it will return true if the GUI is connected and false otherwise.
         * 
         * @return boolean value, true if GUI connected or no error occurred
         */
        public boolean railwayAlive() {
            int value = -1;
            try {
                value = new Integer(tcpCommunication.sendAndReceive("RAILWAYALIVE\r\n")).intValue();
            } catch (Exception e) {
                // ignore
            }
            return (value == 1);
        }

        // ----------------------------------------------------------------------

        /**
         * This method will return the measured speed of a track segment.
         * 
         * @param tracknum
         *            the number (id) of the track - here a class internal constant should be used
         *            (s.a.)
         * @return speed of the track segment
         */
        public int getSpeed(final int tracknum) {
            int value = -1;
            try {
                value = new Integer(
                        tcpCommunication.sendAndReceive("GETSPEED#" + tracknum + "\r\n"))
                        .intValue();
            } catch (Exception e) {
                // ignore
            }
            return value;
        }

        // ----------------------------------------------------------------------

        /**
         * This method will return true if an engine of a train is detected to be on a track
         * segment.
         * 
         * @param tracknum
         *            specifies the number (id) of the track - here a class internal constant should
         *            be used (s.a.)
         * @return true if an engine is located on the tracksegment false otherwise
         */
        public boolean trackUsed(final int tracknum) {
            int value = -1;
            try {
                value = new Integer(tcpCommunication.sendAndReceive("TRACKUSED#" + tracknum
                        + "\r\n")).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // try{Thread.sleep(10);}catch(Exception e){}
            return (value == 1);
        }

        // ----------------------------------------------------------------------

        /**
         * This method will return the next occupied track w.r.t the track number tracknum.
         * 
         * @param tracknum
         *            specifies the number (id) of the track - here a class internal constant should
         *            be used (s.a.)
         * @return true if an engine is located on the tracksegment false otherwise
         */
        public int scanTrackUsed(final int tracknum) {
            int value = -1;
            try {
                value = new Integer(tcpCommunication.sendAndReceive("SCANTRACKUSED#" + tracknum
                        + "\r\n")).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // try{Thread.sleep(10);}catch(Exception e){}
            return value;
        }

        // ----------------------------------------------------------------------

        /**
         * GetContact will return the (buffered) contact event, an integer value that can be
         * compared to the offered CONTACTEVENT_~ constants: CONTACTEVENT_NONE contact was not
         * triggered since last call CONTACTEVENT_FWD contact was triggered in driving direction
         * CONTACTEVENT_REV contact was triggered in reverse driving direction CONTACTEVENT_UNI
         * contact was triggered but a direction can not be provided.
         * 
         * @param tracknum
         *            specifies the number (id) of the track - here a class internal constant should
         *            be used (s.a.)
         * @param contact
         *            specifies the contact of the track segment. 0 for the first contact in default
         *            driving direction and 1 for the seoncd contact in default driving direction.
         *            Use constants CONTACT_FIRST and CONTACT_SECOND
         * @param clear
         *            if clear is true all following buffered not consumed contact events of the
         *            specified/found contact will be cleared
         * @return CONTACTEVENT_NONE, CONTACTEVENT_FWD, CONTACTEVENT_REV or CONTACTEVENT_UNI
         */
        public int getContact(final int tracknum, final int contact, final boolean clear) {
            int value = 0;
            int clearint = 0;
            if (clear) {
                clearint = 1;
            }
            try {
                value = new Integer(tcpCommunication.sendAndReceive("GETCONTACT#" + tracknum + "#"
                        + contact + "#" + clearint + "\r\n")).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // try{Thread.sleep(10);}catch(Exception e){}
            return value;
        }

        // ----------------------------------------------------------------------

        /**
         * ScanContact will return the same contact value as GetContact. Additionally wildcards can
         * be used eigther for tracknum or for contact to find the first matching triggered contact.
         * The contact value is return within a Contact type that also holds the according tracknum
         * and contact
         * 
         * @param tracknum
         *            specifies the number (id) of the track - here a class internal constant should
         *            be used (s.a.) also the wildcard -1 == ALL_TRACKS can be used
         * @param contact
         *            specifies the contact of the track segment. 0 for the first contact in default
         *            driving direction and 1 for the seoncd contact in default driving direction.
         *            Use constants CONTACT_FIRST and
         * @param clear
         *            if clear is true all following buffered not consumed contact events of the
         *            specified/found contact will be cleared
         * @return Contact type consting of tracknum, contactno and contactvalue
         */
        public Contact scanContact(final int tracknum, final int contact, final boolean clear) {
            String value = "";
            int clearint = 0;
            if (clear) {
                clearint = 1;
            }
            try {
                value = tcpCommunication.sendAndReceive("SCANCONTACT#" + tracknum + "#" + contact
                        + "#" + clearint + "\r\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
            Contact returnvalue = new Contact();
            returnvalue.contactvalue = new Integer(value.split("#")[0]).intValue();
            returnvalue.tracknum = new Integer(value.split("#")[1]).intValue();
            returnvalue.contactno = new Integer(value.split("#")[2]).intValue();
            // try{Thread.sleep(10);}catch(Exception e){}
            return returnvalue;
        }

        /**
         * The Class Contact.
         */
        static class Contact {

            /** The tracknum. */
            private int tracknum;

            /** The contactno. */
            private int contactno;

            /** The contactvalue. */
            @SuppressWarnings("unused")
            private int contactvalue;
        }

        // ----------------------------------------------------------------------

        /**
         * This method allows to set the points that can be accessed through their identification
         * numbers 0 - 29. For the turn value also constants exist.
         * 
         * @param pointnum
         *            integer that identifies the switch point (0 - 29) also the wildcard -1 ==
         *            ALL_SIGNALS can be used here
         * @param turn
         *            true if the switch point should be set to branch - use the according constants
         *            POINT_STRAIGHT or POINT_TURN
         */
        public void setPoint(final int pointnum, final boolean turn) {
            int turnint = 0;
            if (turn) {
                turnint = 1;
            }
            tcpCommunication.send("SETPOINT#" + pointnum + "#" + turnint + "\r\n");
        }

        // ----------------------------------------------------------------------

        /**
         * This method allows to control the motormode and the speed of a track segment. The track
         * segment again should be indentified by its designated constant.
         * 
         * @param tracknum
         *            tracknum specifies the number (id) of the track - here a class internal
         *            constant should be used (s.a.) also the wildcard -1 == ALL_TRACKS can be used
         * @param motormode
         *            motormode specifies wether the track segment is set to be forward, backwards,
         *            brake or off. Use the following constants MOTORMODE_PRIMARY,
         *            MOTORMODE_SECONDARY, MOTORMODE_BRAKE, MOTORMODE_OFF
         * @param speed
         *            speed (0 - 100) of the track segment that defines how fast the train is moved
         *            driving there
         */
        public void setTrack(final int tracknum, final int motormode, final int speed) {
            tcpCommunication.send("SETTRACK#" + tracknum + "#" + motormode + "#" + speed + "\r\n");
        }

        // ----------------------------------------------------------------------

        /**
         * This method allows to set the signals of a track segment. Likewise to the contacts there
         * may be two signals connected to one track segment. The signal parameter identifies the
         * first signal in default driving direction as signal 0 and the second in default driving
         * direction as signal 1. The lights parameter can be a cobination (bitwise sum) of the
         * following constants: SIGNAL_OFF, SIGNAL_RED, SIGNAL_YELLOW and SIGNAL_GREEN. In the
         * Simulation SIGNAL_OFF results in red lights, SIGNAL_RED // combinded with SIGNAL_YELLOW
         * or SIGNAL_GREEN will also only result in red lights. The combination
         * SIGNALS_YELLOW+SIGNALS_GREEN or SIGNALS_GREEN only are further possible values for
         * lights.
         * 
         * @param tracknum
         *            specifies the number (id) of the track - here a class internal constant should
         *            be used (s.a.) also the wildcard -1 == ALL_TRACKS can be used
         * @param signal
         *            signal 0 for the first signal in default driving direction and 1 for the
         *            second signal (use the constants SIGNAL_FIRST, SIGNAL_SECOND)
         * @param lights
         *            defines which lights the signal should show (s.a.)
         */
        public void setSignal(final int tracknum, final int signal, final int lights) {
            tcpCommunication.send("SETSIGNAL#" + tracknum + "#" + signal + "#" + lights + "\r\n");
        }

        // ----------------------------------------------------------------------
        /**
         * The Class TAsyncCom.
         */
        public static class TAsyncCom {

            /** The socket. */
            private Socket socket;

            /** The writer. */
            private PrintWriter writer;

            /** The reader. */
            private BufferedReader reader;

            // ------------------------------------------------------------------------

            /**
             * The Constructor sets up a listening port server-socket for every new
             * TAsyncCom-Object. The port has to be unique! Calling Receive later will block until
             * something is received on this port.
             * 
             * @param host
             *            host to connect to
             * @param port
             *            port to connect to
             * @throws IOException
             *             Signals that an I/O exception has occurred.
             */
            public TAsyncCom(final String host, final int port) throws IOException {
                socket = new Socket(host, port);
                writer = new PrintWriter(socket.getOutputStream(), true);
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                return;
            }

            // ------------------------------------------------------------------------

            /**
             * Send() send a String-Command to a specific Host and Port. There also is a second
             * version of Send() which will not just send one String but a StringList of several
             * strings.
             * 
             * @param command
             *            the command
             * @return string answer received from tcp connection
             */
            public synchronized String sendAndReceive(final String command) {
                String result = "";

                try {
                    // send command
                    writer.print(command);
                    writer.flush();

                    // read answer
                    String line = "";
                    line = reader.readLine();
                    if (line != null) {
                        result = line;
                    } // end while
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // System.out.println(Command+" "+Result);
                // System.out.println("----------------------------------");
                return result;
            }

            // ------------------------------------------------------------------------

            /**
             * Send() send a String-Command to a specific Host and Port. There also is a second
             * version of Send() which will not just send one String but a StringList of several
             * strings..
             * 
             * @param command
             *            string command to send over tcp
             */
            public synchronized void send(final String command) {
                // System.out.println("send command"+Command);
                try {
                    // send command
                    writer.print(command);
                    writer.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // System.out.println("command sent. ("+Command+")");
                return;
            }
        }
    }

}
