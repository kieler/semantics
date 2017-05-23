/*
 * THIS FILE GENERATES PURE TEXTUAL CODE FOR SCCHARTS. WILL CHANGE TO M2M CONVERSIONS.
 */
package de.cau.rtsys.peu.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.cau.rtsys.peu.railSL.Statement
import de.cau.rtsys.peu.railSL.TimeWaitStatement
import de.cau.rtsys.peu.railSL.Block
import de.cau.rtsys.peu.railSL.ContactWaitStatement
import de.cau.rtsys.peu.railSL.SetTrackStatement
import de.cau.rtsys.peu.railSL.SetPointStatement
import de.cau.rtsys.peu.railSL.LightStatement
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValueExtensions
import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.OperatorType
import java.util.HashMap
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RailSLGenerator extends AbstractGenerator {

    final static val NUM_OF_SEGMENTS = 48
    final static val NUM_OF_POINTS = 30
    final static val NUM_OF_LIGHTS = 24
    
    @Inject
    extension SCChartsExtension

    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension KExpressionsValueExtensions
    
    @Inject
    extension AnnotationsExtensions
    
	static var nextRegionID = 0;
	static var nextStateID = 0;

    static var valObjects = new HashMap<String, ValuedObject>()

	final static val SPEED_SLOW = 45;
	final static val SPEED_FULL = 120;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

        generateHeaders()
        generateSnippets()

		
		// TODO What should happen here? 
		fsa.generateFile('controller.sct', generateCode(resource))

	}
	
	def void generateHeaders() {
	   // TODO implement me!
	}
	
	def void generateSnippets() {
	   // TODO implement me!    
	}
	
	/**
	 * Transforms the model into an SCCharts model
	 */
	def String generateCode(Resource resource) {
		
		var chart = createSCChart();
		
		// I N T E R F A C E
		
		// input bool contacts[48][2];
		val contactsDecl = createDeclaration(ValueType.BOOL)
		contactsDecl.input = true;
		val contacts = createValuedObject("contacts")
		contacts.cardinalities.add(createIntValue(NUM_OF_SEGMENTS))
		contacts.cardinalities.add(createIntValue(2))
		contactsDecl.attach(contacts)
		contactsDecl.annotations.add(createStringAnnotation("Wrapper", "contacts"));
		
		chart.declarations.add(contactsDecl)
		valObjects.put("contacts", contacts)
		
		// output int tracks[48][2];
		val tracksDecl = createDeclaration(ValueType.INT)
		tracksDecl.output = true;
		val tracks = createValuedObject("tracks")
		tracks.cardinalities.add(createIntValue(NUM_OF_SEGMENTS))
		tracks.cardinalities.add(createIntValue(2))
		tracksDecl.attach(tracks)
		tracksDecl.annotations.add(createStringAnnotation("Wrapper", "tracks"))
		
		chart.declarations.add(tracksDecl)
		valObjects.put("tracks", tracks)
		
		// output bool points[30];
		val pointsDecl = createDeclaration(ValueType.BOOL)
		pointsDecl.output = true
		val points = createValuedObject("points")
		points.cardinalities.add(createIntValue(NUM_OF_POINTS))
		pointsDecl.attach(points)
		pointsDecl.annotations.add(createStringAnnotation("Wrapper", "points"))
		
		chart.declarations.add(pointsDecl)
		valObjects.put("points", points)
		
		// output int signals[48][2];
		val signalsDecl = createDeclaration(ValueType.INT)
		signalsDecl.output = true
		val signals = createValuedObject("signals")
		signals.cardinalities.add(createIntValue(NUM_OF_SEGMENTS))
		signalsDecl.attach(signals)
		signalsDecl.annotations.add(createStringAnnotation("Wrapper","signals"))
		
		chart.declarations.add(signalsDecl)
		valObjects.put("signals", signals)
		
		// output bool lights[24];
		val lightsDecl = createDeclaration(ValueType.BOOL)
		lightsDecl.output = true
		val lights = createValuedObject("lights")
		lights.cardinalities.add(createIntValue(NUM_OF_LIGHTS))
		lightsDecl.attach(lights)
		lightsDecl.annotations.add(createStringAnnotation("Wrapper", "lights"))
		
		chart.declarations.add(lightsDecl)
		valObjects.put("lights", lights)
		
		// input bool second;
		val secondDecl = createDeclaration(ValueType.BOOL)
		secondDecl.input = true
		val second = createValuedObject("second")
		secondDecl.attach(second)
		secondDecl.annotations.add(createStringAnnotation("Wrapper", "second"))
		
		chart.declarations.add(secondDecl)
		valObjects.put("second", second);
		
		// STUFF VON STEVEN UND ALEX
		/*
		chart.declarations.add(createDeclaration(ValueType.INT) => [
		    valuedObjects += createValuedObject("foo") => [
		        initialValue = createIntValue(0) 
		    ] 
		])
		*/
		
		for (block : resource.allContents.toIterable.filter(Block)) {
            block.compile(chart)
		}
		
		// TODO
		return "";
		
	}
	
	/**************************************************************************
	 * T R A N S F O R M A T I O N S ******************************************
	 **************************************************************************/
	
	/**
	 * Compiles a block into a region in the given state.
	 * <p>
	 * Blocks are represented by purely sequential regions within the same superstate.
	 * Each statement is translated to a state within the region along with an initial and a
	 * final state. All statements are connected by termination transitions.
	 * 
	 */
	def void compile(Block block, State chart) {
	    
	    var region = chart.createControlflowRegion("Thread " + getRegionID())
        var currentState = region.createInitialState("init") 
        
        for (statement : block.statements) {
            var state = statement.compile(region)
            var transition = currentState.createTransitionTo(state)
            transition.setTypeTermination
            currentState = state
        }
	    
	    val done = region.createFinalState("done")
	    var transition = currentState.createTransitionTo(done)
        transition.setTypeTermination
	}
	
	/**
	 * Generates a state representing a statement.
	 * 
	 * The state will be located within the region passed as an argument.
	 * The state will in itself contain various simple states.
	 * <p>
	 * It is ensured that all states generated by this method will have
	 * an internal final state that will always be reached.
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
	    }
	    
	    return state
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
       
        val lights = valObjects.get("lights")       
       
        for (light : lStatement.lights) {
           var nextState = region.createState("_S" + i)
           var transition = currentState.createImmediateTransitionTo(nextState)
           transition.addEffect(lights.assign(createIntValue(setting)) => [
               indices += createIntValue(light)
           ])
           i++
        }
       
        val done = region.createFinalState("done")
        currentState.createImmediateTransitionTo(done)
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
       
       val points = valObjects.get("points")
       
       for (segment : spStatement.points) {
           var nextState = region.createState("_S" + i)
           var transition = currentState.createImmediateTransitionTo(nextState)
           transition.addEffect(points.assign(createIntValue(direction)) => [
               indices += createIntValue(segment)
           ])
           i++
       }
       
       val done = region.createFinalState("done")
       currentState.createImmediateTransitionTo(done)
	}
	
	/**
     * Transforms an empty state into a track statement state.
     * 
     * This state sets one or multiple tracks to a certain setting.
     * 
     * @TODO Make this set signals as well
     */
	def void makeSetTrackStatement(State state, SetTrackStatement stStatement) {
	   state.label = "_" + getStateID() + "_SetTrack"
	   
	   val region = state.createControlflowRegion("Set_tracks_to_" + stStatement.mode)
	   
	   val speed = parseSpeed(stStatement)
	   val direction = parseDirection(stStatement)
	   
	   var currentState = region.createInitialState("init") 
	   var i = 0
	   
	   val tracks = valObjects.get("tracks")
	   
	   for (segment : stStatement.segments) {
	       var nextState = region.createState("_S" + i)
	       var transition = currentState.createImmediateTransitionTo(nextState)
	       
	       val trackIndex = segment.parseTrackSegment
	       
	       transition.addEffect(tracks.assign(createIntValue(speed)) => [
	           indices += createIntValue(trackIndex)
	           indices += createIntValue(0)
	       ])
	       transition.addEffect(tracks.assign(createIntValue(direction)) => [
	           indices += createIntValue(trackIndex)
	           indices += createIntValue(1)
	       ])
	       i++
	   }
	   
	   val done = region.createFinalState("done")
	   currentState.createImmediateTransitionTo(done)
	   
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
	    val contactIndex = (if (cwStatement.contactIndex.equals("first")) 0 else 1)
	    val delay =(if (cwStatement.event.equals("Reach")) 1 else 2)
	    
	    // Create all required states
	    var region = state.createControlflowRegion(cwStatement.event + "_contact_" + contactIndex + cwStatement.segName);
	    var init = region.createInitialState("init")
	    var done = region.createFinalState("done");
	    var transition = init.createImmediateTransitionTo(done)
	    transition.delay = delay
	    
	    // Get the root state's variable called "contacts", which is a bool array 
	    val contacts = valObjects.get("contacts")
	    
	    transition.trigger = createOperatorExpression(OperatorType.EQ) => [
	        subExpressions += contacts.reference => [
	            indices += createIntValue(contactIndex)
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
	    transition.delay = twStatement.time
	    
	    val second = valObjects.get("second")
	    
	    transition.trigger = createOperatorExpression(OperatorType.EQ) => [
            subExpressions += second.reference
            subExpressions += createBoolValue(true)
        ]
	}
	
	/*****************************************************************************************
	 * H E L P E R   M E T H O D S ***********************************************************
	 *****************************************************************************************/
	 
	def String getStateID() {
		nextStateID++;
		return "" + (nextStateID - 1)
	}
	
	def String getRegionID() {
		nextRegionID++;
		return "" + (nextRegionID - 1);
	}
	
	def int parseLightMode(LightStatement lStatement) {
		if (lStatement.state.equals("on")) {
			return 1;
		} else {
			return 0;
		}
	}
	
	def int parsePointSetting(SetPointStatement spStatement) {
		if (spStatement.orientation.equals("straight")) {
			return 0;
		} else {
			return 1;
		}
	}
	
	def int parseSpeed(SetTrackStatement stStatement) {
		if (stStatement.mode.contains("stop")) {
			return 0;
		} else if (stStatement.mode.contains("slow")) {
			return SPEED_SLOW;
		} else {
			return SPEED_FULL;
		}
	}
	
	/**
	 * Helper method to determine the direction of travel.
	 */
	def int parseDirection (SetTrackStatement stStatement) {
		if (stStatement.mode.contains("reverse")) {
			return 2;
		} else {
			return 1;
		}
	}
	
	/**
	 * Helper method to translate track segment names to integers.
	 * Defined according to the <Railway.h> header file.
	 */
	def int parseTrackSegment(String string) {
		return switch(string) {
			case "IC_JCT_0": 0
			case "IC_LN_0" : 1
			case "IC_LN_1" : 2
			case "IC_LN_2" : 3
			case "IC_LN_3" : 4
			case "IC_LN_4" : 5
			case "IC_LN_5" : 6
			case "IC_ST_0" : 7
			case "IC_ST_1" : 8
			case "IC_ST_2" : 9
			case "IC_ST_3" : 10
			case "IC_ST_4" : 11
			case "IO_LN_0" : 12
			case "IO_LN_1" : 13
			case "IO_LN_2" : 14
			case "KH_LN_0" : 15
			case "KH_LN_1" : 16
			case "KH_LN_2" : 17
			case "KH_LN_3" : 18
			case "KH_LN_4" : 19
			case "KH_LN_5" : 20
			case "KH_LN_6" : 21
			case "KH_LN_7" : 22
			case "KH_LN_8" : 23
			case "KH_ST_0" : 24
			case "KH_ST_1" : 25
			case "KH_ST_2" : 26
			case "KH_ST_3" : 27
			case "KH_ST_4" : 28
			case "KH_ST_5" : 29
			case "KH_ST_6" : 30
			case "KIO_LN_0" : 31
			case "KIO_LN_1" : 32
			case "OC_JCT_0" : 33
			case "OC_LN_0" : 34
			case "OC_LN_1" : 35
			case "OC_LN_2" : 36
			case "OC_LN_3" : 37
			case "OC_LN_4" : 38
			case "OC_LN_5" : 39
			case "OC_ST_0" : 40
			case "OC_ST_1" : 41
			case "OC_ST_2" : 42
			case "OC_ST_3" : 43
			case "OC_ST_4" : 44
			case "OI_LN_0" : 45
			case "OI_LN_1" : 46
			case "OI_LN_2" : 47
			default: -1
		};
	}
	
}
