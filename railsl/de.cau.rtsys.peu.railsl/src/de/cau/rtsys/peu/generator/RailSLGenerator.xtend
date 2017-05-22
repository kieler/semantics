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

	final static val SPEED_SLOW = 45;
	final static val SPEED_FULL = 120;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		
		fsa.generateFile('controller.sct', generateCode(resource))
		

	}
	
	/**
	 * Generates all code required for a model.
	 * 
	 */
	def String generateCode(Resource resource) {
		
		var chart = createSCChart();
		
		/****************************************************************
		 * I N T E R F A C E ********************************************
		 ****************************************************************/
		
		// input bool contacts[48][2];
		val contactsDecl = createDeclaration(ValueType.BOOL)
		contactsDecl.input = true;
		val contacts = createValuedObject("contacts")
		contacts.cardinalities.add(createIntValue(NUM_OF_SEGMENTS))
		contacts.cardinalities.add(createIntValue(2))
		contactsDecl.attach(contacts)
		contactsDecl.annotations.add(createStringAnnotation("Wrapper", "contacts"));
		
		chart.declarations.add(contactsDecl)
		
		// output int tracks[48][2];
		val tracksDecl = createDeclaration(ValueType.INT)
		tracksDecl.output = true;
		val tracks = createValuedObject("tracks")
		tracks.cardinalities.add(createIntValue(NUM_OF_SEGMENTS))
		tracks.cardinalities.add(createIntValue(2))
		tracksDecl.attach(tracks)
		tracksDecl.annotations.add(createStringAnnotation("Wrapper", "tracks"))
		
		chart.declarations.add(tracksDecl)
		
		// output bool points[30];
		val pointsDecl = createDeclaration(ValueType.BOOL)
		pointsDecl.output = true
		val points = createValuedObject("points")
		points.cardinalities.add(createIntValue(NUM_OF_POINTS))
		pointsDecl.attach(points)
		pointsDecl.annotations.add(createStringAnnotation("Wrapper", "points"))
		
		chart.declarations.add(pointsDecl)
		
		// output int signals[48][2];
		val signalsDecl = createDeclaration(ValueType.INT)
		signalsDecl.output = true
		val signals = createValuedObject("signals")
		signals.cardinalities.add(createIntValue(NUM_OF_SEGMENTS))
		signalsDecl.attach(signals)
		signalsDecl.annotations.add(createStringAnnotation("Wrapper","signals"))
		
		chart.declarations.add(signalsDecl)
		
		// output bool lights[24];
		val lightsDecl = createDeclaration(ValueType.BOOL)
		lightsDecl.output = true
		val lights = createValuedObject("lights")
		lights.cardinalities.add(createIntValue(NUM_OF_LIGHTS))
		lightsDecl.attach(lights)
		lightsDecl.annotations.add(createStringAnnotation("Wrapper", "lights"))
		
		chart.declarations.add(lightsDecl)
		
		
		
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
       
        for (segment : lStatement.lights) {
           var nextState = region.createState("_S" + i)
           var transition = currentState.createImmediateTransitionTo(nextState)
           // TODO set effect to lights[lightIndex] = setting 
           // transition.setEffect();
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
       
       for (segment : spStatement.points) {
           var nextState = region.createState("_S" + i)
           var transition = currentState.createImmediateTransitionTo(nextState)
           // TODO set effect to points[pointIndex] = direction 
           // transition.setEffect();
           i++
       }
       
       val done = region.createFinalState("done")
       currentState.createImmediateTransitionTo(done)
	}
	
	/**
     * Transforms an empty state into a track statement state.
     * 
     * This state sets one or multiple tracks to a certain setting.
     */
	def void makeSetTrackStatement(State state, SetTrackStatement stStatement) {
	   state.label = "_" + getStateID() + "_SetTrack"
	   
	   val region = state.createControlflowRegion("Set_tracks_to_" + stStatement.mode)
	   
	   val speed = parseSpeed(stStatement)
	   val direction = parseDirection(stStatement)
	   
	   var currentState = region.createInitialState("init") 
	   var i = 0
	   
	   for (segment : stStatement.segments) {
	       var nextState = region.createState("_S" + i)
	       var transition = currentState.createImmediateTransitionTo(nextState)
	       // TODO set effect to tracks[parseTrackSegment][0] = speed, [1] = direction 
	       // transition.setEffect();
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
	    val contacts = state.getRootState.declarations.filter[valuedObjects.head.name == "contacts"].head.valuedObjects.head
	    
	    // TODO fix this
	    // transition.trigger =
	    
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
	    
	    // TODO fix this
	    // transition.trigger = 
	}
	
	
	/**********************************************************************
	 * O L D   A N D   J A N K Y ******************************************
	 **********************************************************************/
	
	
	/**
	 * Generates code for a single statement.
	 */
	def String compile(Statement statement) {
		if (statement instanceof ContactWaitStatement) {
			return compile(statement as ContactWaitStatement);
		} else if (statement instanceof TimeWaitStatement) {
			return compile(statement as TimeWaitStatement);
		} else if (statement instanceof SetTrackStatement) {
			return compile(statement as SetTrackStatement);
		} else if (statement instanceof SetPointStatement) {
			return compile(statement as SetPointStatement);
		} else if (statement instanceof LightStatement) {
			return compile(statement as LightStatement);
		}
		
	}
	
	/**
	 * Compiles a LightStatement to an SCCharts state.
	 */
	def String compile(LightStatement lStatement) {
		var lights = lStatement.lights;
		var state = lStatement.parseLightMode();
		
		var ID = getStateID();
		
		var result = ">-> _" + ID + "_Light;\n\n"
		result += "state _" + ID + "_Light {\n";
		result += "initial state init\n";
		
		for (var i = 0; i < lights.size(); i++) {
			// range check
			if (lights.get(i) > 23) {
				throw new IllegalArgumentException("Invalid Light Index: " + lights.get(i) + ". Maximum valid index is 23.");
			}
			result += "--> _S" + i + " immediate with /lights[" + lights.get(i) + "] = " + state + ";\n\n";
			result += "state _S" + i + "\n";
		}
		
		result += "--> done immediate;\n\n"
		result += "final state done;\n"
		result += "}" // Transition and closing ';' will be added elsewhere.
		return result;
	}
	
	/**
	 * Compiles a SetPointStatement to an SCCharts state.
	 */
	def String compile(SetPointStatement spStatement) {
		var points = spStatement.points;
		var orientation = parsePointSetting(spStatement);
		
		var ID = getStateID();
		
		var result= ">-> _" + ID + "_SetPoint;\n\n"
		result += "state _" + ID + "_SetPoint {\n";
		result += "initial state init\n";
		
		for (var i = 0; i < points.size(); i++) {
			// range check
			if (points.get(i) > 29) {
				throw new IllegalArgumentException("Invalid Point index: " + points.get(i) + ". Maximum valid index is 29.");
			}
			result += "--> _S" + i + " immediate with /points[" + points.get(i) + "] = " + orientation + ";\n\n"
			result += "state _S" + i + "\n";
		}
		
		result += "--> done immediate;";
		result += "final state done;\n";
		result += "}" // Transition and closing ';' will be added elsewhere.
		return result;
	}
	 
	/**
	 * Compiles a SetTrackStatement to an SCCharts state.
	 * 
	 * TODO: Set signals accordingly
	 */
	def String compile(SetTrackStatement stStatement) {
		var segments = stStatement.segments;
		var direction = stStatement.parseDirection(); 
		var speed = stStatement.parseSpeed();
		
		var ID = getStateID();
		
		var result = ">-> _" + ID + "_SetTrack;\n\n";
		result += "state _" + ID + "_SetTrack {\n";
		result += "initial state init\n"
		
		for (var i = 0; i < segments.size(); i++) {
			var segment = segments.get(i).parseTrackSegment();
			
			result += "--> _S" + i + " immediate with " + 
			"/ tracks[" + segment + "][0] = " + direction + ";";
			result += "tracks[" + segment + "][1] = " + speed + ";\n\n";
			result += "state _S" + i + "\n"
		}
		
		result += "--> done immediate;\n\n";
		result += "final state done;\n"
		result += "}" // Transition and closing ';' will be added elsewhere.
		return result;
	}
	
	/**
	 * Compile a ContactWaitStatement into an SCCharts state.
	 * 
	 * This state references a prototypical state in order to avoid
	 * duplicate code.
	 * 
	 * Due to a current issue, the contact variable has to be copied in each instance.
	 */
	def String compile(ContactWaitStatement cStatement) {
		
		var index = 0;
		if (cStatement.contactIndex == "second") {
			index = 1;
		}
		
		var refState = "ReachContact";
		if (cStatement.event.equals("Pass")) {
			refState = "PassContact";
		}
		
		var track = parseTrackSegment(cStatement.segName);
		
		var ID = getStateID(); 
		
		var result = ">-> _" + ID + "_ContactWaitStatement;\n\n"; // Final transition of previous state
		result += "state _" + ID + "_ContactWaitStatement {\n";
		result += "bool contact;\n"
		result += "during /contact = contacts[" + track + "][" + index + "];\n\n";
		result += "initial state wait references " + refState +"\n";
		result += ">-> done;\n\n"
		result += "final state done;\n"
		result += "}" // Transition and closing ';' will be added elsewhere.
		return result;
	}
	
	/**
	 * Compile a timeWaitStatement into an SCCharts state.
	 * 
	 * This state references a prototypical time wait chart.
	 * Due to a current issue, the variable time has to be introduced with an
	 * additional initial state.
	 */
	def String compile(TimeWaitStatement tStatement) {
		var ID = getStateID();
		
		var result = ">-> _" + ID + "_TimeWait;\n\n"
		result += "state _" + getStateID() + "_TimeWait {\n"
		result += "int time;\n"
		result += "entry /time = " + tStatement.getTime() + ";\n\n"
		result += "initial state wait references WaitTime bind secondsLeft to time\n";
		result += ">-> done;\n"
		result += "}" // Transition and closing ';' will be added elsewhere.
		return result;
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
