package de.cau.cs.kieler.sim.modelrailway;

import java.io.IOException;
import java.net.URL;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;

import org.json.JSONException;
import org.json.JSONObject;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeBool;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeWorkspaceFile;

public class DataComponent extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	int startPosition[];
	int endPosition[];
	String motorModes[];
	String blockErrors[];
	String points[];
	String pointErrors[];
	String signals0[];
	String signals1[];

	// -------------------------------------------------------------------------

	public interface Railway extends Library {
		Railway INSTANCE = (Railway) Native.loadLibrary(DataComponent
				.getLibLocation(), Railway.class);

		static final int OFF = 0;
		static final int RED = 1;
		static final int YELLOW = 2;
		static final int GREEN = 4;

		static final int ON = 1;
		static final int FWD = 1;
		static final int REV = 2;
		static final int BRAKE = 3;
		static final int PWM = 0;
		static final int SPEED = 128;

		static final int DOWN = 0;
		static final int UP = 1;

		static final int NONE = 0;
		static final int UNI = 3;

		static final int STRAIGHT = 0;
		static final int BRANCH = 1;

		void initSimulation();

		void stepSimulation();

		String getVisualizationData();

		void setInitialTrain(int block);

		int getTrackNum(String trackname);

		String getTrackName(int tracknum);

		void settrack(int invalid, int track, int mode, int target);

		void setsignal(int invalid, int track, int signal, int lights);

		void setpoint(int invalid, int point, int state);

		int getSimulationTick();

		int getcontact(int invalid, int block, int contact, int clear);

		// int scancontact(int invalid, int *block, int *contact, int clear);

		int trackused(int invalid, int track);

		int getspeed(int invalid, int track);

		void clearcontact(int invalid, int block, int contact);
	}

	public static String getLibLocation() {
		try {
//			URL url = Activator.getDefault().getBundle().getResource(
//			"/lib/railway.dll");
			String path = ""; 
//				(org.eclipse.core.runtime.FileLocator
//					.toFileURL(url)).toString();
			if (Platform.isWindows()) {
				if (Platform.is64Bit()) {
					path = ""
							+ (org.eclipse.core.runtime.FileLocator
									.toFileURL(Activator.getDefault()
											.getBundle().getResource(
													"/lib/railway.dll64")))
									.toString();
				} else {
					path = ""
							+ (org.eclipse.core.runtime.FileLocator
									.toFileURL(Activator.getDefault()
											.getBundle().getResource(
													"/lib/railway.dll")))
									.toString();
				}
			} else if (Platform.isLinux()) {
				if (Platform.is64Bit()) {
					path = "/"
							+ (org.eclipse.core.runtime.FileLocator
									.toFileURL(Activator.getDefault()
											.getBundle().getResource(
													"/lib/railway.so64")))
									.toString();
				} else {
					path = "/"
							+ (org.eclipse.core.runtime.FileLocator
									.toFileURL(Activator.getDefault()
											.getBundle().getResource(
													"/lib/railway.so")))
									.toString();
				}
			} else if (Platform.isMac()) {
				if (Platform.is64Bit()) {
					path = "/"
							+ (org.eclipse.core.runtime.FileLocator
									.toFileURL(Activator.getDefault()
											.getBundle().getResource(
													"/lib/railway.dylib64")))
									.toString();
				} else {
					path = "/"
							+ (org.eclipse.core.runtime.FileLocator
									.toFileURL(Activator.getDefault()
											.getBundle().getResource(
													"/lib/railway.dylib")))
									.toString();
				}
			} else if (Platform.isSolaris()) {
				path = "/"
					+ (org.eclipse.core.runtime.FileLocator
							.toFileURL(Activator.getDefault()
									.getBundle().getResource(
											"/lib/railway.solaris")))
							.toString();
			}
			path = path.replaceFirst("file:/", "");
			System.out.println(path);
			return path;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	// -------------------------------------------------------------------------

	String removeParentheses(String text) throws Exception {
		String outText = "";
		int pCounter = 0;
		for (int c = 0; c < text.length(); c++) {
			String character = text.substring(c, c + 1);
			if (character.equals("(")) {
				pCounter++;
			} else if (character.equals(")")) {
				pCounter--;
			} else {
				outText += character;
			}
		}// next c
		if (pCounter != 0)
			throw new Exception(
					"Simulation data syntax parentheses check failed. Maybe the data connection is broken or this is an encoding or simulation problem!");
		return outText;
	}

	// -------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent#step(org.json.JSONObject
	 * )
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent#step(org.json.JSONObject
	 * )
	 */
	public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
		try {
			// speeds and signals
			for (int track = 0; track < 48; track++) {
				String keySpeed = "SetSpeed_"
						+ DataComponent.getTrackName(track);
				if (jSONObject.has(keySpeed)) {
					Object object = jSONObject.get(keySpeed);
					// if not a signal, we just consider the speed value as-is
					if (object instanceof Integer) {
						int value = ((Integer) object);
						Railway.INSTANCE.settrack(0, track, 1, value);
					}
					// if we have a signal, consider present=50 and absent=0
					if (object instanceof JSONObject) {
						if (JSONSignalValues.isPresent(object)) {
							Railway.INSTANCE
									.settrack(0, track, Railway.FWD, 50);
						} else if (JSONSignalValues.isSignalValue(object)) {
							Railway.INSTANCE.settrack(0, track, Railway.FWD, 0);
						}
					}
				}
				String keySignal0 = "SetSignal0_"
						+ DataComponent.getTrackName(track);
				if (jSONObject.has(keySignal0)) {
					Object object = jSONObject.get(keySignal0);
					// if not a signal, we just consider the color value as-is
					if (object instanceof Integer) {
						int value = ((Integer) object);
						Railway.INSTANCE.setsignal(0, track, 0, value);
					}
					// if we have a signal, consider present=green and
					// absent=red
					if (object instanceof JSONObject) {
						if (JSONSignalValues.isPresent(object)) {
							Railway.INSTANCE.setsignal(0, track, 0,
									Railway.GREEN);
						} else if (JSONSignalValues.isSignalValue(object)) {
							Railway.INSTANCE
									.setsignal(0, track, 0, Railway.RED);
						}
					}
				}
				String keySignal1 = "SetSignal1_"
						+ DataComponent.getTrackName(track);
				if (jSONObject.has(keySignal1)) {
					Object object = jSONObject.get(keySignal1);
					// if not a signal, we just consider the color value as-is
					if (object instanceof Integer) {
						int value = ((Integer) object);
						Railway.INSTANCE.setsignal(0, track, 1, value);
					}
					// if we have a signal, consider present=green and
					// absent=red
					if (object instanceof JSONObject) {
						if (JSONSignalValues.isPresent(object)) {
							Railway.INSTANCE.setsignal(0, track, 1,
									Railway.GREEN);
						} else if (JSONSignalValues.isSignalValue(object)) {
							Railway.INSTANCE
									.setsignal(0, track, 1, Railway.RED);
						}
					}
				}
				// points
				for (int point = 0; point < 29; point++) {
					String keyPoint = "SetPoint_" + point;
					if (jSONObject.has(keyPoint)) {
						Object object = jSONObject.get(keyPoint);
						// if not a signal, we just consider the branch value
						// as-is
						if (object instanceof Integer) {
							int value = ((Integer) object);
							Railway.INSTANCE.setpoint(0, point, value);
						}
						// if we have a signal, consider present=branch and
						// absent=straight
						if (object instanceof JSONObject) {
							if (JSONSignalValues.isPresent(object)) {
								Railway.INSTANCE.setpoint(0, point,
										Railway.BRANCH);
							} else if (JSONSignalValues.isSignalValue(object)) {
								Railway.INSTANCE.setpoint(0, point,
										Railway.STRAIGHT);
							}
						}
					}
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}

		// --------------------- C A L C U L A T I O N -------------------- //
		// make simulation step
		Railway.INSTANCE.stepSimulation();

		// ------------------- V I S U A L I Z A T I O N ------------------- //
		// get unparsed simulation data
		String simuData = Railway.INSTANCE.getVisualizationData();
		try {
			simuData = removeParentheses(simuData);
		} catch (Exception e) {
			throw new KiemExecutionException(
					"ModelRailway simulation cannot make a step.", false, e);
		}
		// at this point no parentheses are left in the data string
		// we can split-up the string by its colons
		String[] simuDataArray = simuData.split(",");

		// no distribute data to simulation data structure
		int offset;
		int c;
		offset = 0;
		for (c = 0; c < 48; c++) {
			startPosition[c] = (int) java.lang.Math.floor(Float
					.parseFloat(simuDataArray[c + offset]));
		}
		offset += 48;
		for (c = 0; c < 48; c++) {
			endPosition[c] = (int) java.lang.Math.floor(Float
					.parseFloat(simuDataArray[c + offset]));
		}
		offset += 48;
		for (c = 0; c < 48; c++) {
			motorModes[c] = simuDataArray[c + offset];
		}
		offset += 48;
		for (c = 0; c < 48; c++) {
			blockErrors[c] = simuDataArray[c + offset];
		}
		offset += 48;
		for (c = 0; c < 48; c++) {
			points[c] = simuDataArray[c + offset];
		}
		offset += 48;
		for (c = 0; c < 48; c++) {
			pointErrors[c] = simuDataArray[c + offset];
		}
		offset += 48;
		for (c = 0; c < 48; c++) {
			signals0[c] = simuDataArray[c + offset];
		}
		offset += 49;
		for (c = 0; c < 48; c++) {
			signals1[c] = simuDataArray[c + offset];
		}

		System.out.println(this.flatten(points));

		// now synthesize xkev values
		JSONObject railwayData = new JSONObject();

		try {
			for (c = 0; c < 48; c++) {
				String trackID = Railway.INSTANCE.getTrackName(c).trim();
				railwayData.accumulate("engine-" + trackID,
						this.startPosition[c]);
				railwayData.accumulate("trailer-" + trackID,
						this.endPosition[c]);
				railwayData.accumulate("track-" + trackID, this.motorModes[c]);
				railwayData.accumulate("text-" + trackID, this.blockErrors[c]);
				railwayData.accumulate("signal0-" + trackID, this.signals0[c]);
				railwayData.accumulate("signal1-" + trackID, this.signals1[c]);
			}
			for (int point = 0; point < 29; point++) {
				railwayData.accumulate("point-" + point, this.points[point]);
				railwayData.accumulate("point-text-" + point,
						this.pointErrors[point]);
			}

		} catch (Exception e) {
			throw new KiemExecutionException(
					"ModelRailway simulation cannot make a step.", false, e);
		}

		// ---------------------- C O N T R O L L E R --------------------- //
		try {
			for (int track = 0; track < 47; track++) {
				String trackID = Railway.INSTANCE.getTrackName(track).trim();
				int contact0 = Railway.INSTANCE.getcontact(0, track, 0, 1);
				int contact1 = Railway.INSTANCE.getcontact(0, track, 1, 1);
				int occupied = Railway.INSTANCE.trackused(0, track);

				railwayData.accumulate("EventContact0_" + trackID,
						JSONSignalValues.newValue("", contact0 == 1));
				railwayData.accumulate("EventContact1_" + trackID,
						JSONSignalValues.newValue("", contact1 == 1));
				railwayData.accumulate("EventOccupied_" + trackID,
						JSONSignalValues.newValue("", occupied == 1));
			}
		} catch (Exception e) {
			throw new KiemExecutionException(
					"ModelRailway simulation cannot make a step.", false, e);
		}

		return railwayData;
	}

	// -------------------------------------------------------------------------

	public String flatten(String[] text) {
		String outText = "";
		for (int c = 0; c < text.length; c++) {
			if (outText != "") {
				outText += ",";
			}
			outText += text[c];
		}
		return outText;
	}

	public String flatten(int[] numbers) {
		String outText = "";
		for (int c = 0; c < numbers.length; c++) {
			if (outText != "") {
				outText += ",";
			}
			outText += numbers[c];
		}
		return outText;
	}

	// -------------------------------------------------------------------------

	public void initialize() throws KiemInitializationException {
		// set data structure (for temporary parsing of simulation data)
		startPosition = new int[48];
		endPosition = new int[48];
		motorModes = new String[48];
		blockErrors = new String[48];
		points = new String[48];
		pointErrors = new String[48];
		signals0 = new String[49];
		signals1 = new String[49];

		// reset the simulation
		Railway.INSTANCE.initSimulation();

		// set initial trains according to the properties
		for (int track = 0; track < 48; track++) {
			if (this.getProperties()[track].getType() instanceof KiemPropertyTypeBool) {
				if (KiemPropertyTypeBool
						.getValueAsBoolean(this.getProperties()[track])) {
					Railway.INSTANCE.setInitialTrain(track);
				}
			}
		}
	}

	// -------------------------------------------------------------------------

	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	// -------------------------------------------------------------------------

	public boolean isProducer() {
		// TODO Auto-generated method stub
		return true;
	}

	// -------------------------------------------------------------------------

	public void wrapup() throws KiemInitializationException {
		// TODO Auto-generated method stub

	}

	// -------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.cau.cs.kieler.sim.kiem.extension.DataComponent#provideProperties()
	 */
	@Override
	public KiemProperty[] provideProperties() {
		KiemProperty[] properties = new KiemProperty[48];
		for (int c = 0; c < 48; c++) {
			try {
				String trackName = Railway.INSTANCE.getTrackName(c).trim();
				properties[c] = new KiemProperty(trackName, false);
			} catch (Exception e) {
				// ignore
			}

		}
		return properties;
	}

	// -------------------------------------------------------------------------

	static String getTrackName(int trackId) {
		return (Railway.INSTANCE.getTrackName(trackId).trim());
	}

	// -------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * 
	 * @seede.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent#
	 * provideInitialVariables()
	 */
	@Override
	public JSONObject provideInitialVariables() {
		JSONObject returnObj = new JSONObject();
		try {
			// speeds
			for (int track = 0; track < 48; track++) {
				returnObj.accumulate("SetSpeed_"
						+ DataComponent.getTrackName(track), 0);
			}
			// points
			for (int point = 0; point < 27; point++) {
				returnObj.accumulate("SetPoint_" + point, 0);
			}
			// signals
			for (int track = 0; track < 48; track++) {
				returnObj.accumulate("SetSignal0_"
						+ DataComponent.getTrackName(track), 0);
				returnObj.accumulate("SetSignal1_"
						+ DataComponent.getTrackName(track), 0);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return returnObj;
	}

	// -------------------------------------------------------------------------

}
