/* An actor that interacts with the Model Railway (and its simulation) of
   the Department of Computer Science of Kiel University, Germany.

   The Model Railway can be found here:
   http://www.informatik.uni-kiel.de/~railway/

   The simulation of the Model Railway can be found here:
   http://rtsys.informatik.uni-kiel.de/~biblio/downloads/theses/cmot-st.pdf

 Copyright (c) 2009 Christian Motika.
 All rights reserved.
 Permission is hereby granted, without written agreement and without
 license or royalty fees, to use, copy, modify, and distribute this
 software and its documentation for any purpose, provided that the above
 copyright notice and the following two paragraphs appear in all copies
 of this software.

 IN NO EVENT SHALL THE AUTHOR BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
 SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OF
 THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF THE AUTHOR HAS BEEN ADVISED
 OF THE POSSIBILITY OF SUCH DAMAGE.

 THE AUTHOR SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT
 LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 A PARTICULAR PURPOSE. THE SOFTWARE PROVIDED HEREUNDER IS ON AN "AS IS"
 BASIS, AND THE AUTHOR HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT,
 UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

 */
package ptolemy.actor.kiel;

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
import java.io.*;
import java.net.*;

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
 */
public class KielerIO extends TypedAtomicActor {
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
     * @exception IllegalActionException
     *                If the actor cannot be contained by the proposed container.
     * @exception NameDuplicationException
     *                If the container already has an actor with this name.
     */
    public KielerIO(CompositeEntity container, String name) throws NameDuplicationException,
            IllegalActionException {
        super(container, name);

        this.sname = new Parameter(this, "signal name");
        this.sname.setExpression("'signalname'");
        present = new Parameter(this, "present");
        present.setExpression("false");
        value = new Parameter(this, "value");
        value.setExpression("1");
        permanent = new Parameter(this, "permanent");
        permanent.setExpression("false");

        signal = new TypedIOPort(this, "signal", false, true);
        trigger = new TypedIOPort(this, "trigger", true, false);

        _attachText("_iconDescription",
        // "<svg><rect x=\"+346\" y=\"+507\" width=\"60\" height=\"50\" style=\"fill:white\" />" +
                // "<rect width=\"42.179585\" height=\"10.368729\" x=\"354.04678\" y=\"511.17493\" style=\"fill:red;stroke:red;stroke:red\" /> <rect width=\"41.273579\" height=\"5.9393687\" x=\"354.55011\" y=\"521.2417\" style=\"fill:red;stroke:red\" /> <rect width=\"39.864239\" height=\"2.0133452\" x=\"355.15411\" y=\"526.97974\" style=\"fill:red;stroke:red\" /> <rect width=\"38.454895\" height=\"2.7180161\" x=\"356.06012\" y=\"528.79175\" style=\"fill:red;stroke:red\" /> <rect width=\"37.146221\" height=\"2.8186834\" x=\"356.7648\" y=\"531.00641\" style=\"fill:red;stroke:red\" /> <rect width=\"34.528873\" height=\"3.4226871\" x=\"357.87213\" y=\"533.42242\" style=\"fill:red;stroke:red\" /> <rect width=\"32.012192\" height=\"2.1140127\" x=\"358.97946\" y=\"536.6438\" style=\"fill:red;stroke:red\" /> <rect width=\"29.294174\" height=\"2.4160144\" x=\"360.69083\" y=\"538.15381\" style=\"fill:red;stroke:red\" /> <rect width=\"25.670153\" height=\"2.9193506\" x=\"362.50284\" y=\"540.26782\" style=\"fill:red;stroke:red\" /> <rect width=\"23.254139\" height=\"2.0133452\" x=\"363.71085\" y=\"542.78448\" style=\"fill:red;stroke:red\" /> <rect width=\"19.932119\" height=\"2.5166817\" x=\"365.0195\" y=\"543.69049\" style=\"fill:red;stroke:red\" /> <rect width=\"16.006096\" height=\"2.3153472\" x=\"367.63687\" y=\"545.70386\" style=\"fill:red;stroke:red\" /> <rect width=\"12.986077\" height=\"2.3153472\" x=\"369.0462\" y=\"547.11316\" style=\"fill:red;stroke:red\" /> <rect width=\"10.469396\" height=\"2.21468\" x=\"369.95221\" y=\"548.52252\" style=\"fill:red;stroke:red\" /> <rect width=\"7.2480431\" height=\"1.6106763\" x=\"371.76422\" y=\"549.93182\" style=\"fill:red;stroke:red\" /> <rect width=\"3.2213526\" height=\"1.4093417\" x=\"373.67688\" y=\"551.34119\" style=\"fill:red;stroke:red\" /> <rect width=\"9.7647247\" height=\"8.9593868\" x=\"356.52753\" y=\"513.99048\" style=\"fill:white;stroke:white\" /> <rect width=\"30.099512\" height=\"8.9593868\" x=\"360.70523\" y=\"519.77875\"  style=\"fill:white;stroke:white\" /> <rect width=\"9.7647247\" height=\"8.9593868\" x=\"370.36929\" y=\"514.04077\"  style=\"fill:white;stroke:white\" /> <rect width=\"8.7647247\" height=\"8.9593868\" x=\"383.8587\" y=\"514.14142\"  style=\"fill:white;stroke:white\" /> <rect width=\"23.858141\" height=\"8.9593868\" x=\"363.42325\" y=\"526.62415\"  style=\"fill:white;stroke:white\" /> <rect width=\"16.207428\" height=\"8.9593868\" x=\"367.04727\" y=\"532.36218\"  style=\"fill:white;stroke:white\" /> <rect width=\"6.1407013\" height=\"8.9593868\" x=\"372.08063\" y=\"537.89893\"  style=\"fill:white;stroke:white\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"366.49359\" y=\"524.25848\"  style=\"fill:black;stroke:black\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"379.58035\" y=\"524.20813\" style=\"fill:black;stroke:black\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"368.60764\" y=\"526.92615\"  style=\"fill:black;stroke:black\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"371.7283\" y=\"527.83215\"  style=\"fill:black;stroke:black\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"375.05032\" y=\"527.9328\"  style=\"fill:black;stroke:black\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"377.16434\" y=\"526.72479\" style=\"fill:black;stroke:black\" />"
                // +
                "<svg><rect width=\"60\" height=\"55\" x=\"+0.11029591\" y=\"-4\" id=\"rect4\" style=\"fill:white;stroke:black\" /><rect width=\"44.179585\" height=\"12.368729\" x=\"8.8751001\" y=\"1.3841918\" id=\"rect5\" style=\"fill:red;stroke:red\" /><rect width=\"42.273579\" height=\"5.9393687\" x=\"9.3784266\" y=\"13.450964\" id=\"rect7\" style=\"fill:red;stroke:red\" /><rect width=\"39.864239\" height=\"2.0133452\" x=\"9.9824305\" y=\"19.189001\" id=\"rect9\" style=\"fill:red;stroke:red\" /><rect width=\"38.454895\" height=\"2.7180161\" x=\"10.888436\" y=\"21.001013\" id=\"rect11\" style=\"fill:red;stroke:red\" /><rect width=\"37.146221\" height=\"2.8186834\" x=\"11.59311\" y=\"23.215673\" id=\"rect13\" style=\"fill:red;stroke:red\" /><rect width=\"34.528873\" height=\"3.4226871\" x=\"12.70044\" y=\"25.631689\" id=\"rect15\" style=\"fill:red;stroke:red\" /><rect width=\"32.012192\" height=\"2.1140127\" x=\"13.807786\" y=\"28.853064\" id=\"rect17\" style=\"fill:red;stroke:red\" /><rect width=\"29.294174\" height=\"2.4160144\" x=\"15.519143\" y=\"30.363073\" id=\"rect19\" style=\"fill:red;stroke:red\" /><rect width=\"25.670153\" height=\"2.9193506\" x=\"17.331154\" y=\"32.477089\" id=\"rect21\" style=\"fill:red;stroke:red\" /><rect width=\"23.254139\" height=\"2.0133452\" x=\"18.539162\" y=\"34.993752\" id=\"rect23\" style=\"fill:red;stroke:red\" /><rect width=\"19.932119\" height=\"2.5166817\" x=\"19.847816\" y=\"35.899757\" id=\"rect25\" style=\"fill:red;stroke:red\" /><rect width=\"16.006096\" height=\"2.3153472\" x=\"22.465187\" y=\"37.913124\" id=\"rect27\" style=\"fill:red;stroke:red\" /><rect width=\"12.986077\" height=\"2.3153472\" x=\"23.874519\" y=\"39.322426\" id=\"rect29\" style=\"fill:red;stroke:red\" /><rect width=\"10.469396\" height=\"2.21468\" x=\"24.780525\" y=\"40.731789\" id=\"rect31\" style=\"fill:red;stroke:red\" /><rect width=\"7.2480431\" height=\"1.6106763\" x=\"26.592537\" y=\"42.14109\" id=\"rect33\" style=\"fill:red;stroke:red\" /><rect width=\"3.2213526\" height=\"1.4093417\" x=\"28.505196\" y=\"43.550453\" id=\"rect35\" style=\"fill:red;stroke:red\" /><rect width=\"9.7647247\" height=\"8.9593868\" x=\"11.355844\" y=\"6.1997433\" id=\"rect37\" style=\"fill:white;stroke:white\" /><rect width=\"30.099512\" height=\"8.9593868\" x=\"15.533547\" y=\"11.988012\" id=\"rect39\" style=\"fill:white;stroke:white\" /><rect width=\"9.7647247\" height=\"8.9593868\" x=\"25.197609\" y=\"6.2500362\" id=\"rect41\" style=\"fill:white;stroke:white\" /><rect width=\"8.7647247\" height=\"8.9593868\" x=\"38.687019\" y=\"6.3506832\" id=\"rect43\" style=\"fill:white;stroke:white\" /><rect width=\"23.858141\" height=\"8.9593868\" x=\"18.251564\" y=\"18.83341\" id=\"rect45\" style=\"fill:white;stroke:white\" /><rect width=\"16.207428\" height=\"8.9593868\" x=\"21.875587\" y=\"24.571447\" id=\"rect47\" style=\"fill:white;stroke:white\" /><rect width=\"6.1407013\" height=\"8.9593868\" x=\"26.908943\" y=\"30.108191\" id=\"rect49\" style=\"fill:white;stroke:white\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"21.321907\" y=\"16.467749\" id=\"rect51\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"34.408669\" y=\"16.417395\" id=\"rect53\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"23.435951\" y=\"19.135412\" id=\"rect55\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"26.556618\" y=\"20.041418\" id=\"rect57\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"29.878639\" y=\"20.142065\" id=\"rect59\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"31.992653\" y=\"18.934057\" id=\"rect61\" style=\"fill:black;stroke:black\" /></svg>"
        // "</svg>"
        // "<svg> <rect x=\"0.11029591\" y=\"-7.8537886e-07\" width=\"60\" height=\"40\" style=\"fill:white\" id=\"rect4\" /> <rect style=\"fill:blue\" width=\"4.3014708\" height=\"7.2794118\" x=\"42.794117\" y=\"27.205883\" id=\"rect46\" /> <rect style=\"fill:blue\" width=\"8.1617651\" height=\"4.1911764\" x=\"40.808823\" y=\"28.970589\" id=\"rect44\" /> <rect style=\"fill:blue\" width=\"4.3014708\" height=\"7.2794118\" x=\"26.80147\" y=\"27.095589\" id=\"rect40\" /> <rect style=\"fill:blue\" width=\"8.1617651\" height=\"4.1911764\" x=\"24.816175\" y=\"28.860294\" id=\"rect38\" /> <rect style=\"fill:black\" width=\"17.678572\" height=\"2.8571427\" x=\"8.8602943\" y=\"8.8550434\" id=\"rect6\" /> <rect style=\"fill:black\" width=\"17.678572\" height=\"2.8571427\" x=\"8.4821415\" y=\"26.357141\" id=\"rect8\" /> <rect style=\"fill:blue\" width=\"8.1617651\" height=\"4.1911764\" x=\"14.227942\" y=\"28.970589\" id=\"rect30\" /> <rect style=\"fill:black\" width=\"14.642858\" height=\"7.8886552\" x=\"11.875\" y=\"11.575629\" id=\"rect10\" /> <rect style=\"fill:blue\" width=\"4.3014708\" height=\"7.2794118\" x=\"16.213236\" y=\"27.205883\" id=\"rect32\" /> <rect style=\"fill:black\" width=\"39.642857\" height=\"11.060924\" x=\"11.875\" y=\"18.046219\" id=\"rect12\" /> <rect style=\"fill:#000000\" width=\"4.7220092\" height=\"9.9465933\" x=\"46.669132\" y=\"8.8365469\" id=\"rect14\" /> <rect style=\"fill:grey\" width=\"11.454833\" height=\"2.6785715\" x=\"37.284664\" y=\"3.6985292\" id=\"rect16\" /> <rect style=\"fill:darkgrey\" width=\"10\" height=\"3.3928571\" x=\"41.42857\" y=\"6.0357141\" id=\"rect18\" /> <rect style=\"fill:black\" width=\"3.5714285\" height=\"3.3928571\" x=\"38.597687\" y=\"14.873949\" id=\"rect20\" /> <rect style=\"fill:black\" width=\"2.1428571\" height=\"5\" x=\"51.42857\" y=\"24.178572\" id=\"rect22\" /> <rect style=\"fill:black\" width=\"1.7857143\" height=\"3.2142856\" x=\"53.214287\" y=\"25.964285\" id=\"rect24\" /> <rect style=\"fill:white\" width=\"9.1499014\" height=\"4.738061\" x=\"14.703809\" y=\"12.331933\" id=\"rect26\" /> <rect style=\"fill:blue\" width=\"6.6176472\" height=\"6.397059\" x=\"15\" y=\"27.647058\" id=\"rect28\" /> <rect style=\"fill:grey\" width=\"10\" height=\"3.3928571\" x=\"33.051472\" y=\"5.7521009\" id=\"rect34\" /> <rect style=\"fill:blue\" width=\"6.6176472\" height=\"6.397059\" x=\"25.588234\" y=\"27.536764\" id=\"rect36\" /> <rect style=\"fill:blue\" width=\"6.6176472\" height=\"6.397059\" x=\"41.580879\" y=\"27.647058\" id=\"rect42\" /></svg>\n"
        );
    }

    // /////////////////////////////////////////////////////////////////
    // // ports and parameters ////

    /**
     * The host and port to make the connection to, i.e., where the Model Railway interface program
     * is running. Often this is set to the string value 'localhost' for the host and 2000 for the
     * port.
     */
    public Parameter present;
    public Parameter sname;
    public Parameter value;
    public Parameter permanent;

    /**
     * This may trigger the actor in a DE domain.
     */
    public TypedIOPort trigger;

    /**
     * Set the speed of some tracks using RecordTokens like port={track5={motormode=1,speed=100}
     * where motormode can be off(0), primary(1), secondary(2) or brake(3) DEFAULT is primary(1) and
     * speed is a value between 0 .. 100 DEFAULT is 0
     */
    public TypedIOPort signal;

    // /////////////////////////////////////////////////////////////////
    // // public methods ////

    /**
     * Collect the trigger Token first, then process possible speed, point or signal commands. After
     * that collect the reed contact values to an ArrayToken. Also do this for the occupied track
     * states.
     * 
     * @exception IllegalActionException
     *                If calling send() or super.fire() throws it.
     */
    public void setValue(int value) {
        this.value.setExpression(value + "");
    }

    public void setPermanent(boolean permanent) {
        if (permanent)
            this.permanent.setExpression("true");
        else
            this.permanent.setExpression("false");
    }

    public void setPresent(boolean present) {
        if (present)
            this.present.setExpression("true");
        else
            this.present.setExpression("false");
    }

    public void setSignalName(String name) {
        this.sname.setExpression("'" + name + "'");
    }

    public String getSignalName() {
        return this.sname.getExpression().toString();
    }

    public int getValue() {
        return Integer.valueOf(this.value.getExpression());
    }

    public void fire() throws IllegalActionException {
        // dispose an optional trigger token
        if (trigger.getWidth() > 0) {
            if (trigger.hasToken(0)) {
                trigger.get(0);
            }
        }

        // if signal is present, send out an integer token with the signal's value
        if (present.getValueAsString().equals("true")) {
            signal.send(0, new IntToken(Integer.valueOf(value.getValueAsString())));
        }
        else {
            //else send clear because signal is absent
            signal.sendClear(0);
        }
        super.fire();
    }

    public boolean postfire() {
        if (present.getValueAsString().equals("true")
                && permanent.getValueAsString().equals("false")) {
            this.setPresent(false);
        }
        return true;
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

    // /////////////////////////////////////////////////////////////////
    // // private variables ////
    // private RailwayInterface RI;

}
