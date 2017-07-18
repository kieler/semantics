/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */

package de.cau.cs.kieler.railsl.compilation

import de.cau.cs.kieler.kitt.tracing.Traceable
import org.eclipse.emf.ecore.EObject
import java.util.Set
import com.google.common.collect.Sets
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import com.google.inject.Inject
import de.cau.cs.kieler.railsl.railSL.Program
import de.cau.cs.kieler.railsl.RailSLFeatures

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.OperatorType
import java.util.HashMap
import de.cau.cs.kieler.kexpressions.ValuedObject
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.railsl.railSL.Block
import de.cau.cs.kieler.railsl.railSL.Statement
import de.cau.cs.kieler.railsl.railSL.TimeWaitStatement
import de.cau.cs.kieler.railsl.railSL.ContactWaitStatement
import de.cau.cs.kieler.railsl.railSL.SetTrackStatement
import de.cau.cs.kieler.railsl.railSL.SetPointStatement
import de.cau.cs.kieler.railsl.railSL.LightStatement
import de.cau.cs.kieler.railsl.railSL.ConditionalStatement
import de.cau.cs.kieler.railsl.railSL.CrossingStatement
import de.cau.cs.kieler.railsl.extensions.RailSLExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions

/**
 * Transforms a RailSL model to an SCChart.
 * 
 * @author Philip Eumann (peu) - stu121235@mail.uni-kiel.de
 * 
 */
class RailSLTransformation extends AbstractProductionTransformation implements Traceable {

    override getProducedFeatureId() {
        return "REFERENCE"
    }

    override getId() {
        return "RailSLTransformation"
    }

    override Set<String> getRequiredFeatureIds() {
        return Sets.newHashSet(RailSLFeatures.BASIC_ID)
    }

    override transform(EObject eObject) {
        return (eObject as Program).railSLtoSCChart
    }

    /*************************************************************************
     * I N J E C T I O N S ***************************************************
     *************************************************************************/
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension RailSLExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions

    /*************************************************************************
     * F I E L D S ***********************************************************
     *************************************************************************/
    /**
     * The speed value for slow driving
     */
    public static val SPEED_SLOW = 45;

    /**
     * The speed value for full speed driving
     */
    public static val SPEED_FULL = 120;

    /**
     * Maps variable names in the top-level SCChart to their corresponding @code{ValuedObjects}.
     */
    static var valObjects = new HashMap<String, ValuedObject>()

    /**
     * The number of segments that exist in the railway installation.
     */
    public static val NUM_OF_SEGMENTS = 48

    /**
     * The number of points that exist in the railway installation.
     */
    public static val NUM_OF_POINTS = 30

    /**
     * The number of lights that exist in the railway installation.
     */
    public static val NUM_OF_LIGHTS = 24

    /**
     * Helper variable to count region IDs
     */
    static var nextRegionID = 0;

    /**
     * Helper variable to count state IDs
     */
    static var nextStateID = 0;

    /**************************************************************************
     * T R A N S F O R M A T I O N S ******************************************
     **************************************************************************/
    /**
     * Transforms an instance of the RailSL metamodel to an instance of the SCCharts metamodel.
     */
    def State railSLtoSCChart(Program model) {

        return generateSCChart(model.blocks)
    }

    /**
     * Transforms the model into an SCCharts model
     */
    def State generateSCChart(List<Block> blocks) {

        var chart = createState

        // I N T E R F A C E
        // input bool contacts[48][2];
        val contactsDecl = createBoolDeclaration
        contactsDecl.input = true;
        val contacts = createValuedObject("contacts")
        contacts.cardinalities.add(createIntValue(NUM_OF_SEGMENTS))
        contacts.cardinalities.add(createIntValue(2))
        contactsDecl.attach(contacts)
        contactsDecl.annotations.add(createStringAnnotation("Wrapper", "contacts"));

        chart.declarations.add(contactsDecl)
        valObjects.put("contacts", contacts)

        // output int tracks[48][2];
        val tracksDecl = createIntDeclaration
        tracksDecl.output = true;
        val tracks = createValuedObject("tracks")
        tracks.cardinalities.add(createIntValue(NUM_OF_SEGMENTS))
        tracks.cardinalities.add(createIntValue(2))
        tracksDecl.attach(tracks)
        tracksDecl.annotations.add(createStringAnnotation("Wrapper", "tracks"))

        chart.declarations.add(tracksDecl)
        valObjects.put("tracks", tracks)

        // output bool points[30];
        val pointsDecl = createBoolDeclaration
        pointsDecl.output = true
        val points = createValuedObject("points")
        points.cardinalities.add(createIntValue(NUM_OF_POINTS))
        pointsDecl.attach(points)
        pointsDecl.annotations.add(createStringAnnotation("Wrapper", "points"))

        chart.declarations.add(pointsDecl)
        valObjects.put("points", points)

        // output int signals[48][2];
        val signalsDecl = createIntDeclaration
        signalsDecl.output = true
        val signals = createValuedObject("signals")
        signals.cardinalities.add(createIntValue(NUM_OF_SEGMENTS))
        signals.cardinalities.add(createIntValue(2))
        signalsDecl.attach(signals)
        signalsDecl.annotations.add(createStringAnnotation("Wrapper", "signals"))

        chart.declarations.add(signalsDecl)
        valObjects.put("signals", signals)

        // output bool lights[24];
        val lightsDecl = createBoolDeclaration
        lightsDecl.output = true
        val lights = createValuedObject("lights")
        lights.cardinalities.add(createIntValue(NUM_OF_LIGHTS))
        lightsDecl.attach(lights)
        lightsDecl.annotations.add(createStringAnnotation("Wrapper", "lights"))

        chart.declarations.add(lightsDecl)
        valObjects.put("lights", lights)

        // input bool second;
        val secondDecl = createBoolDeclaration
        secondDecl.input = true
        val second = createValuedObject("second")
        secondDecl.attach(second)
        secondDecl.annotations.add(createStringAnnotation("Wrapper", "second"))

        chart.declarations.add(secondDecl)
        valObjects.put("second", second);

        // output bool crossing
        val crossingDecl = createBoolDeclaration
        crossingDecl.output = true
        val crossing = createValuedObject("crossing")
        crossingDecl.attach(crossing)
        crossingDecl.annotations.add(createStringAnnotation("Wrapper", "crossing"))

        chart.declarations.add(crossingDecl)
        valObjects.put("crossing", crossing);

        // A C T U A L   D I A G R A M   S Y N T H E S I S
        nextRegionID = 0
        for (block : blocks) {
            nextStateID = 0
            block.compile(chart)
        }

        return chart;
    }

    /**
     * Compiles a block into a region in the given state.
     * <p>
     * Blocks are represented by purely sequential regions within the same superstate.
     * Each statement is translated to a state within the region along with an initial and a
     * final state. All statements are connected by termination transitions.
     * <p>
     * After each statement, one tick passes with no actions taken.
     */
    def void compile(Block block, State chart) {

        var region = chart.createControlflowRegion("Thread " + getRegionID())
        var currentState = region.createInitialState("init")

        // For each statement, create a state representing the behaviour of the statement
        for (statement : block.statements) {
            var state = statement.compile(region)
            if (currentState != region.initialState) {
                // Add tick boundary
                var connectorState = region.createState("");
                var termTransition = currentState.createTransitionTo(connectorState)
                connectorState.createTransitionTo(state)
                termTransition.setTypeTermination
            } else {
                // Add immediate transition from initial state to next state
                var transition = currentState.createTransitionTo(state)
                transition.setImmediate
            }

            currentState = state
        }

        // Create the last state of the region and connect it to
        // the previous state with a normal termination transition 
        var state = region.createState("")
        var term = currentState.createTransitionTo(state)
        term.setTypeTermination
        currentState = state

        if (block.end.equals("End.")) {
            // Create final state
            val done = region.createFinalState("done")
            currentState.createTransitionTo(done)
        } else {
            // Loop back to initial state
            currentState.createTransitionTo(region.initialState)
        }
    }

    /**
     * Generates a state representing a statement.
     * 
     * The state will be located within the region passed as an argument.
     * The state will in itself contain various simple states.
     */
    def State compile(Statement statement, ControlflowRegion region) {

        var state = region.createState("");

        if (statement instanceof TimeWaitStatement) {
            state.makeTimeWaitStatement(statement as TimeWaitStatement)
        } else if (statement instanceof ContactWaitStatement) {
            state.makeContactWaitStatement(statement as ContactWaitStatement)
        } else if (statement instanceof SetTrackStatement) {
            state.makeSetTrackStatement(statement as SetTrackStatement)
        } else if (statement instanceof SetPointStatement) {
            state.makeSetPointStatement(statement as SetPointStatement)
        } else if (statement instanceof LightStatement) {
            state.makeLightStatement(statement as LightStatement)
        } else if (statement instanceof ConditionalStatement) {
            state.makeConditionalStatement(statement as ConditionalStatement)
        } else {
            state.makeCrossingStatement(statement as CrossingStatement)
        }

        return state
    }

    def void makeCrossingStatement(State state, CrossingStatement cStatement) {
        state.label = "_" + getStateID() + "_Crossing"
        val region = state.createControlflowRegion(cStatement.mode + " crossing")
        var init = region.createInitialState("init")
        var done = region.createFinalState("done")
        var transition = init.createImmediateTransitionTo(done)

        // Fetch variable crossing from root SCChart
        val crossing = valObjects.get("crossing")

        transition.addEffect(
            crossing.createAssignment(createBoolValue(cStatement.parseCrossingSetting))
        )
    }

    /**
     * Transforms an empty state into a ConditionalStatement.
     * 
     * Each line is represented by its own state with internal behavior.
     */
    def void makeConditionalStatement(State state, ConditionalStatement cStatement) {
        state.label = "_" + getStateID() + "_Conditional"
        var i = 0;

        // Fetch variable contacts from root SCChart
        val contacts = valObjects.get("contacts")
        var expressions = new ArrayList<Expression>()

        val region = state.createControlflowRegion("")
        region.createInitialState("init")
        region.createFinalState("done")

        // create trigger expressions for each statement
        for (line : cStatement.lines) {
            val contactIndex = if(line.contact.equals("first")) 0 else 1
            val trackIndex = line.segName.parseTrackSegment

            expressions.add(i, createOperatorExpression(OperatorType.EQ) => [
                subExpressions += contacts.reference => [
                    indices += createIntValue(trackIndex)
                    indices += createIntValue(contactIndex)
                ]
                subExpressions += createBoolValue(true)
            ])
            i++
        }

        // create states for each line and connect them accordingly
        var j = 0
        for (line : cStatement.lines) {
            var currentState = region.createState("Alternative " + j)
            line.block.compile(currentState)
            val trans = region.initialState.createImmediateTransitionTo(currentState)
            trans.trigger = expressions.get(j)
            trans.specificPriority = j + 1
            val termTrans = currentState.createTransitionTo(region.allFinalStates.head)
            termTrans.setTypeTermination
            termTrans.setNotImmediate
            j++
        }
    }

    /**
     * Transforms an empty state into a light statement state.
     * 
     * This state sets one or multiple lights to a certain setting.
     */
    def void makeLightStatement(State state, LightStatement lStatement) {
        state.label = "_" + getStateID() + "_Light"

        val region = state.createControlflowRegion("Set_lights_to_" + lStatement.state)
        val setting = parseLightMode(lStatement)
        var currentState = region.createInitialState("init")
        var i = 0

        // Fetch variable lights from root SCChart
        val lights = valObjects.get("lights")

        // Create a state for each light to be set and connect them with immediate transitions
        // Each transition will trigger one field of the array to be set
        for (light : lStatement.lights) {
            var nextState = region.createState("_S" + i)
            var transition = currentState.createImmediateTransitionTo(nextState)
            transition.addEffect(lights.createAssignment(createIntValue(setting)) => [
                indices += createIntValue(light)
            ])
            currentState = nextState
            i++
        }
        currentState.final = true

    }

    /**
     * Transforms an empty state into a point statement state.
     * 
     * This state sets one or multiple points to a certain setting.
     */
    def void makeSetPointStatement(State state, SetPointStatement spStatement) {
        state.label = "_" + getStateID() + "_SetPoint"

        val region = state.createControlflowRegion("Set_points_to_" + spStatement.orientation)
        val direction = parsePointSetting(spStatement)
        var currentState = region.createInitialState("init")
        var i = 0

        // Fetch variable points from root SCChart
        val points = valObjects.get("points")

        // Create a state for each segment to be set and connect them with immediate transitions
        // Each transition will trigger one row of the array to be set
        for (segment : spStatement.points) {
            var nextState = region.createState("_S" + i)
            var transition = currentState.createImmediateTransitionTo(nextState)
            transition.addEffect(points.createAssignment(createIntValue(direction)) => [
                indices += createIntValue(segment)
            ])
            currentState = nextState
            i++
        }
        currentState.final = true
    }

    /**
     * Transforms an empty state into a track statement state.
     * 
     * This state sets one or multiple tracks to a certain setting.
     * It will also update their signals accordingly.
     */
    def void makeSetTrackStatement(State state, SetTrackStatement stStatement) {
        state.label = "_" + getStateID() + "_SetTrack"

        val region = state.createControlflowRegion("Set_tracks_to_" + stStatement.mode)
        val speed = parseSpeed(stStatement)
        val direction = parseDirection(stStatement)
        var currentState = region.createInitialState("init")
        var i = 0

        // Fetch variables tracks and signals from root SCChart
        val tracks = valObjects.get("tracks")
        val signals = valObjects.get("signals")

        // Create a state for each segment to be set and connect them with immediate transitions
        // Each transition will trigger one field of each of the arrays to be set
        for (segment : stStatement.segments) {
            var nextState = region.createState("_S" + i)
            var transition = currentState.createImmediateTransitionTo(nextState)

            val trackIndex = segment.parseTrackSegment

            val signalValue = if (speed == SPEED_FULL) {
                    4 // green signal
                } else if (speed == SPEED_SLOW) {
                    2 // yellow signal
                } else {
                    1 // red signal
                }

            // Set the track speed and direction
            transition.addEffect(tracks.createAssignment(createIntValue(speed)) => [
                indices += createIntValue(trackIndex)
                indices += createIntValue(0)
            ])
            transition.addEffect(tracks.createAssignment(createIntValue(direction)) => [
                indices += createIntValue(trackIndex)
                indices += createIntValue(1)
            ])

            // Set the signals accordingly
            transition.addEffect(signals.createAssignment(createIntValue(signalValue)) => [
                indices += createIntValue(trackIndex)
                indices += createIntValue(direction)
            ])
            transition.addEffect(signals.createAssignment(createIntValue(0)) => [
                indices += createIntValue(trackIndex)
                indices += createIntValue(if(direction == 0) 1 else 0)
            ])
            currentState = nextState
            i++
        }
        currentState.final = true
    }

    /**
     * Transforms an empty state into a contact wait statement state.
     * 
     * This state will terminate once a certain contact event has occured.
     */
    def void makeContactWaitStatement(State state, ContactWaitStatement cwStatement) {
        state.label = "_" + getStateID() + "_ContactWait"

        // Parse information from statement object 
        val trackIndex = cwStatement.segName.parseTrackSegment
        val contactIndex = (if(cwStatement.contactIndex.equals("first")) 0 else 1)
        val delay = (if(cwStatement.event.equals("Reach")) 1 else 2)

        // Create all required states
        var region = state.createControlflowRegion(cwStatement.event + "_contact_" + contactIndex +
            cwStatement.segName);
        var init = region.createInitialState("init")
        var done = region.createFinalState("done");
        var transition = init.createImmediateTransitionTo(done)
        transition.triggerDelay = delay

        // Fetch variable contacts from root SCChart
        val contacts = valObjects.get("contacts")

        // Set the transition trigger to check for the contact 
        transition.trigger = createOperatorExpression(OperatorType.EQ) => [
            subExpressions += contacts.reference => [
                indices += createIntValue(trackIndex)
                indices += createIntValue(contactIndex)
            ]
            subExpressions += createBoolValue(true)
        ]
    }

    /**
     * Transforms an empty state into a time wait statement state.
     * 
     * This state will terminate once a certain amount of time has passed.
     */
    def void makeTimeWaitStatement(State state, TimeWaitStatement twStatement) {
        state.label = "_" + getStateID() + "_TimeWait"
        var region = state.createControlflowRegion("Wait " + twStatement.time)
        var init = region.createInitialState("init")
        var done = region.createFinalState("done")
        var transition = init.createImmediateTransitionTo(done)
        transition.triggerDelay = twStatement.time

        // Fetch variable second from root SCChart
        val second = valObjects.get("second")

        transition.trigger = createOperatorExpression(OperatorType.EQ) => [
            subExpressions += second.reference
            subExpressions += createBoolValue(true)
        ]
    }

    /**
     * Helper method providing unique state IDs
     */
    def String getStateID() {
        nextStateID++;
        return "" + (nextStateID - 1)
    }

    /**
     * Helper method providing unique region IDs
     */
    def String getRegionID() {
        nextRegionID++;
        return "" + (nextRegionID - 1);
    }

}
