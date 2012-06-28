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
import ptolemy.data.IntToken;
import ptolemy.data.expr.Parameter;
import ptolemy.kernel.CompositeEntity;
import ptolemy.kernel.util.IllegalActionException;
import ptolemy.kernel.util.NameDuplicationException;

//////////////////////////////////////////////////////////////////////////
//// KielerIO

/**
 * KielerIO Actor for simulating SyncCharts with Ptolemy II.
 * 
 * @author Christian Motika
 * @Pt.AcceptedRating Red (cmot)
 */
public class KielerIO extends TypedAtomicActor {

    /** serial version UID. */
    private static final long serialVersionUID = -3181830589443018196L;

    /**
     * Construct an actor with the given container and name.
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
    public KielerIO(final CompositeEntity container, final String name)
            throws NameDuplicationException, IllegalActionException {
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

        _attachText(
                "_iconDescription",
                "<svg><rect width=\"60\" height=\"55\" x=\"+0.11029591\" y=\"-4\" id=\"rect4\""
                        + " style=\"fill:white;stroke:black\" /><rect width=\"44.179585\""
                        + " height=\"12.368729\""
                        + " x=\"8.8751001\" y=\"1.3841918\" id=\"rect5\" style=\"fill:red;"
                        + "stroke:red\" /><rect"
                        + " width=\"42.273579\" height=\"5.9393687\" x=\"9.3784266\""
                        + " y=\"13.450964\" id=\"rect7\""
                        + " style=\"fill:red;stroke:red\" /><rect width=\"39.864239\" "
                        + "height=\"2.0133452\" "
                        + "x=\"9.9824305\" y=\"19.189001\" id=\"rect9\" style=\"fill:red"
                        + ";stroke:red\" /><rect"
                        + " width=\"38.454895\" height=\"2.7180161\" x=\"10.888436\" "
                        + "y=\"21.001013\" id=\"rect11\""
                        + " style=\"fill:red;stroke:red\" /><rect width=\"37.146221\" "
                        + "height=\"2.8186834\""
                        + " x=\"11.59311\" y=\"23.215673\" id=\"rect13\" style=\"fill:red;stroke:red\" "
                        + "/><rect width=\"34.528873\" height=\"3.4226871\" x=\"12.70044\""
                        + " y=\"25.631689\""
                        + " id=\"rect15\" style=\"fill:red;stroke:red\" /><rect width=\"32.012192\""
                        + " height=\"2.1140127\" x=\"13.807786\" y=\"28.853064\" id=\"rect17\" "
                        + "style=\"fill:red;stroke:red\" /><rect width=\"29.294174\""
                        + " height=\"2.4160144\""
                        + " x=\"15.519143\" y=\"30.363073\" id=\"rect19\" "
                        + "style=\"fill:red;stroke:red\" />"
                        + "<rect width=\"25.670153\" height=\"2.9193506\""
                        + " x=\"17.331154\" y=\"32.477089\""
                        + " id=\"rect21\" style=\"fill:red;stroke:red\" /><rect width=\"23.254139\" "
                        + "height=\"2.0133452\" x=\"18.539162\" y=\"34.993752\" id=\"rect23\""
                        + " style=\"fill:red;stroke:red\" /><rect width=\"19.932119\""
                        + " height=\"2.5166817\""
                        + " x=\"19.847816\" y=\"35.899757\" id=\"rect25\" "
                        + "style=\"fill:red;stroke:red\" />"
                        + "<rect width=\"16.006096\" height=\"2.3153472\""
                        + " x=\"22.465187\" y=\"37.913124\""
                        + " id=\"rect27\" style=\"fill:red;stroke:red\" /><rect width=\"12.986077\""
                        + " height=\"2.3153472\" x=\"23.874519\" y=\"39.322426\" id=\"rect29\" "
                        + "style=\"fill:red;stroke:red\" /><rect width=\"10.469396\" height=\"2.21468\""
                        + " x=\"24.780525\" y=\"40.731789\" id=\"rect31\" style=\"fill:red;stroke:red\""
                        + " /><rect width=\"7.2480431\" height=\"1.6106763\""
                        + " x=\"26.592537\" y=\"42.14109\""
                        + " id=\"rect33\" style=\"fill:red;stroke:red\" /><rect width=\"3.2213526\" "
                        + "height=\"1.4093417\" x=\"28.505196\" y=\"43.550453\" id=\"rect35\""
                        + " style=\"fill:red;stroke:red\" /><rect "
                        + "width=\"9.7647247\" height=\"8.9593868\""
                        + " x=\"11.355844\" y=\"6.1997433\" id=\"rect37\" "
                        + "style=\"fill:white;stroke:white\""
                        + " /><rect width=\"30.099512\" height=\"8.9593868\""
                        + " x=\"15.533547\" y=\"11.988012\" "
                        + "id=\"rect39\" style=\"fill:white;stroke:white\" /><rect width=\"9.7647247\""
                        + " height=\"8.9593868\" x=\"25.197609\" y=\"6.2500362\" id=\"rect41\" "
                        + "style=\"fill:white;stroke:white\" /><rect width="
                        + "\"8.7647247\" height=\"8.9593868\""
                        + " x=\"38.687019\" y=\"6.3506832\" id=\"rect43\""
                        + " style=\"fill:white;stroke:white\" "
                        + "/><rect width=\"23.858141\" height=\"8.9593868\""
                        + " x=\"18.251564\" y=\"18.83341\""
                        + " id=\"rect45\" style=\"fill:white;stroke:white\" /><rect width=\"16.207428\""
                        + " height=\"8.9593868\" x=\"21.875587\" y=\"24.571447\" id=\"rect47\" "
                        + "style=\"fill:white;stroke:white\" /><rect width="
                        + "\"6.1407013\" height=\"8.9593868\""
                        + " x=\"26.908943\" y=\"30.108191\" id=\"rect49\" "
                        + "style=\"fill:white;stroke:white\""
                        + " /><rect width=\"4.0266905\" height=\"3.7246888\""
                        + " x=\"21.321907\" y=\"16.467749\""
                        + " id=\"rect51\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\""
                        + " height=\"3.7246888\" x=\"34.408669\" y=\"16.417395\" id=\"rect53\" style=\""
                        + "fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\""
                        + " x=\"23.435951\" y=\"19.135412\" id=\"rect55\" "
                        + "style=\"fill:black;stroke:black\""
                        + " /><rect width=\"4.0266905\" height=\"3.7246888\""
                        + " x=\"26.556618\" y=\"20.041418\""
                        + " id=\"rect57\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\""
                        + " height=\"3.7246888\" x=\"29.878639\" y=\"20.142065\" "
                        + "id=\"rect59\" style=\"fill"
                        + ":black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\""
                        + " x=\"31.992653\" y=\"18.934057\" id=\"rect61\" "
                        + "style=\"fill:black;stroke:black\"" + " /></svg>");
    }

    // /////////////////////////////////////////////////////////////////
    // // ports and parameters ////

    /** The present. */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public Parameters
    public Parameter present;

    /** The sname. */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public Parameters
    public Parameter sname;

    /** The value. */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public Parameters
    public Parameter value;

    /** The permanent. */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public Parameters
    public Parameter permanent;

    /**
     * This may trigger the actor in a DE domain.
     */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public TypedIOPorts
    public TypedIOPort trigger;

    /** The signal. */
    // SUPPRESS CHECKSTYLE NEXT Visibility Modifier - Ptolemy needs public TypedIOPorts
    public TypedIOPort signal;

    // /////////////////////////////////////////////////////////////////
    // // public methods ////

    /**
     * Sets the value.
     * 
     * @param value
     *            the new value
     */
    public void setValue(final int value) {
        this.value.setExpression(value + "");
    }

    /**
     * Sets the permanent.
     * 
     * @param permanent
     *            the new permanent
     */
    public void setPermanent(final boolean permanent) {
        if (permanent) {
            this.permanent.setExpression("true");
        } else {
            this.permanent.setExpression("false");
        }
    }

    /**
     * Sets the present.
     * 
     * @param present
     *            the new present
     */
    public void setPresent(final boolean present) {
        if (present) {
            this.present.setExpression("true");
        } else {
            this.present.setExpression("false");
        }
    }

    /**
     * Sets the signal name.
     * 
     * @param name
     *            the new signal name
     */
    public void setSignalName(final String name) {
        this.sname.setExpression("'" + name + "'");
    }

    /**
     * Gets the signal name.
     * 
     * @return the signal name
     */
    public String getSignalName() {
        return this.sname.getExpression().toString();
    }

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public int getValue() {
        return Integer.valueOf(this.value.getExpression());
    }

    /**
     * {@inheritDoc}
     */
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
        } else {
            // else send clear because signal is absent
            signal.sendClear(0);
        }
        super.fire();
    }

    /**
     * {@inheritDoc}
     */
    public boolean postfire() {
        if (present.getValueAsString().equals("true")
                && permanent.getValueAsString().equals("false")) {
            this.setPresent(false);
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws IllegalActionException {
        super.initialize();
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws IllegalActionException {
        super.wrapup();
    }

    // /////////////////////////////////////////////////////////////////
    // // private variables ////

}
