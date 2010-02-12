package de.cau.cs.kieler.kev.extension.dataobserver;

import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeBool;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeChoice;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeWorkspaceFile;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

//import de.cau.cs.kieler.kev.mapping.animations.SVGLoadingStatusListener;

public class Backhoe extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	private boolean resetSignals = true;

	private boolean extendLegs = false;
	private boolean retractLegs = false;

	private boolean alarm = false;
	private boolean done = false;
	private boolean cancelled = false;

	private int legs = 0;
	private int boom = 0;
	private int stick = 0;
	private int bucket = 0;

	private static final int legsMAX = 50;
	private static final int legsMIN = 0;
	private static final int legsDEF = 0;

	private static final int boomMAX = 100;
	private static final int boomMIN = 0;
	private static final int boomDEF = 100;

	private static final int stickMAX = 100;
	private static final int stickMIN = 0;
	private static final int stickDEF = 100;

	private static final int bucketMAX = 100;
	private static final int bucketMIN = 0;
	private static final int bucketDEF = 100;

	private static final double boomWIDTH = 177.37;
	private static final double boomHEIGHT = 62.48;
	private static final double stickWIDTH = 135.16;
	private static final double stickHEIGHT = 26.63;
	private static final double bucketWIDTH = 69.09;
	private static final double bucketHEIGHT = 39.57;

	private MapAnimations mapAnimation;

	public Backhoe() {
		// TODO Auto-generated constructor stub
	}

	public double deg2bog(double width, double angle) {
		return (angle * Math.PI) / 180;
	}

	public int diffX(double width, int angle) {
		double rad = width / 2;
		double val = (int) (rad * Math.cos(deg2bog(width, angle)));
		return (int) (width - val);
	}

	public int diffY(double width, int angle) {
		double rad = width / 2;
		int val = (int) (rad * Math.sin(deg2bog(width, angle)));
		return val;
	}

	public void repaint() {
		try {
			JSONObject jSONObject = new JSONObject();

			// repaint the lamps
			if (alarm) {
				jSONObject.put("alarm", "on");
			} else {
				jSONObject.put("alarm", "off");
			}
			if (done) {
				jSONObject.put("done", "on");
			} else {
				jSONObject.put("done", "off");
			}
			if (cancelled) {
				jSONObject.put("cancelled", "on");
			} else {
				jSONObject.put("cancelled", "off");
			}

			JSONObject coordinatesLegs = new JSONObject();
			JSONObject coordinatesBoom = new JSONObject();
			JSONObject coordinatesStick = new JSONObject();
			JSONObject coordinatesBucket = new JSONObject();

			coordinatesLegs.accumulate("x", 0);
			coordinatesLegs.accumulate("y", legs);

			int boomX = diffX(Backhoe.boomWIDTH, boom);
			int boomY = diffY(Backhoe.boomWIDTH, boom);
			int diffBoomX = 105 - boomX;
			int diffBoomY = (int) (58 - (Backhoe.boomHEIGHT - boomY));

			coordinatesBoom.accumulate("x", diffBoomX);
			coordinatesBoom.accumulate("y", diffBoomY);
			coordinatesBoom.accumulate("r", boom);

			// stick drives with boom => angle = boom + stick
			int stickX = diffX(Backhoe.stickWIDTH, boom + stick);
			int stickY = diffY(Backhoe.stickWIDTH, boom + stick);
			int diffStickX = 60 - stickX;
			int diffStickY = (int) (25 - (Backhoe.stickHEIGHT - stickY));

			diffStickX = (int) (diffStickX - (2 * boomX) + 200);
			diffStickY = (int) (diffStickY + (2 * boomY));

			coordinatesStick.accumulate("x", diffStickX);
			coordinatesStick.accumulate("y", diffStickY);
			coordinatesStick.accumulate("r", boom + stick);

			// bucket drives with boom and stick => angle = boom + stick +
			// bucket
			int bucketX = diffX(Backhoe.bucketWIDTH, boom + stick + bucket);
			int bucketY = diffY(Backhoe.bucketWIDTH, boom + stick + bucket);
			int diffBucketX = 28 - bucketX;
			int diffBucketY = (int) (42 - (Backhoe.bucketHEIGHT - bucketY));

			diffBucketX = (int) (diffBucketX - (2 * boomX) - (2 * stickX) + 340);
			diffBucketY = (int) (diffBucketY + (2 * boomY) + (2 * stickY));

			coordinatesBucket.accumulate("x", diffBucketX);
			coordinatesBucket.accumulate("y", diffBucketY);
			coordinatesBucket.accumulate("r", boom + stick + bucket);

			// jSONObject.put("legs", coordinatesLegs);
			// jSONObject.put("boom", coordinatesBoom);
			// jSONObject.put("stick", coordinatesStick);
			// jSONObject.put("bucket", coordinatesBucket);

			jSONObject.put("legs", legs);
			jSONObject.put("boom", boom);
			jSONObject.put("stick", stick);
			jSONObject.put("bucket", bucket);

			mapAnimation.doAnimations(jSONObject);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public JSONObject enforceValidValues() {
		JSONObject returnObj = new JSONObject();
		if (legs >= Backhoe.legsMAX) {
			try {
				returnObj.accumulate("LEGS_OUT", JSONSignalValues
						.newValue(true));
			} catch (Exception e) {
			}
			legs = Backhoe.legsMAX;
		} else {
			try {
				returnObj.accumulate("LEGS_OUT", JSONSignalValues
						.newValue(false));
			} catch (Exception e) {
			}
		}
		if (legs <= Backhoe.legsMIN) {
			try {
				returnObj
						.accumulate("LEGS_IN", JSONSignalValues.newValue(true));
			} catch (Exception e) {
			}
			legs = Backhoe.legsMIN;
		} else {
			try {
				returnObj.accumulate("LEGS_IN", JSONSignalValues
						.newValue(false));
			} catch (Exception e) {
			}
		}

		if (boom >= Backhoe.boomMAX) {
			try {
				returnObj.accumulate("BOOM_OUT", JSONSignalValues
						.newValue(true));
			} catch (Exception e) {
			}
			boom = Backhoe.boomMAX;
		} else {
			try {
				returnObj.accumulate("BOOM_OUT", JSONSignalValues
						.newValue(false));
			} catch (Exception e) {
			}
		}
		if (boom <= Backhoe.boomMIN) {
			try {
				returnObj
						.accumulate("BOOM_IN", JSONSignalValues.newValue(true));
			} catch (Exception e) {
			}
			boom = Backhoe.boomMIN;
		} else {
			try {
				returnObj.accumulate("BOOM_IN", JSONSignalValues
						.newValue(false));
			} catch (Exception e) {
			}
		}

		if (stick >= Backhoe.stickMAX) {
			try {
				returnObj.accumulate("STICK_IN", JSONSignalValues
						.newValue(true));
			} catch (Exception e) {
			}
			stick = Backhoe.stickMAX;
		} else {
			try {
				returnObj.accumulate("STICK_IN", JSONSignalValues
						.newValue(false));
			} catch (Exception e) {
			}
		}
		if (stick <= Backhoe.stickMIN) {
			try {
				returnObj.accumulate("STICK_OUT", JSONSignalValues
						.newValue(true));
			} catch (Exception e) {
			}
			stick = Backhoe.stickMIN;
		} else {
			try {
				returnObj.accumulate("STICK_OUT", JSONSignalValues
						.newValue(false));
			} catch (Exception e) {
			}
		}

		if (bucket >= Backhoe.bucketMAX) {
			try {
				returnObj.accumulate("BUCKET_IN", JSONSignalValues
						.newValue(true));
			} catch (Exception e) {
			}
			bucket = Backhoe.bucketMAX;
		} else {
			try {
				returnObj.accumulate("BUCKET_IN", JSONSignalValues
						.newValue(false));
			} catch (Exception e) {
			}
		}
		if (bucket <= Backhoe.bucketMIN) {
			try {
				returnObj.accumulate("BUCKET_OUT", JSONSignalValues
						.newValue(true));
			} catch (Exception e) {
			}
			bucket = Backhoe.bucketMIN;
		} else {
			try {
				returnObj.accumulate("BUCKET_OUT", JSONSignalValues
						.newValue(false));
			} catch (Exception e) {
			}
		}
		return returnObj;
	}

	public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
		JSONObject returnObj = enforceValidValues();

		try {
			if (jSONObject.has("LEGS_EXTEND")
					&& (JSONSignalValues.isPresent(jSONObject
							.get("LEGS_EXTEND")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("LEGS_EXTEND", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				extendLegs = true;
				retractLegs = false;
			}
			if (jSONObject.has("LEGS_RETRACT")
					&& (JSONSignalValues.isPresent(jSONObject
							.get("LEGS_RETRACT")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("LEGS_RETRACT", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				retractLegs = true;
				extendLegs = false;
			}
			if (jSONObject.has("LEGS_STOP")
					&& (JSONSignalValues.isPresent(jSONObject.get("LEGS_STOP")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("LEGS_STOP", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				retractLegs = false;
				extendLegs = false;
			}
			if (jSONObject.has("BOOM_PULL")
					&& (JSONSignalValues.isPresent(jSONObject.get("BOOM_PULL")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("BOOM_PULL", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				boom++;
			}
			if (jSONObject.has("BOOM_PUSH")
					&& (JSONSignalValues.isPresent(jSONObject.get("BOOM_PUSH")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("BOOM_PUSH", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				boom--;
			}
			if (jSONObject.has("STICK_PULL")
					&& (JSONSignalValues
							.isPresent(jSONObject.get("STICK_PULL")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("STICK_PULL", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				stick++;
			}
			if (jSONObject.has("STICK_PUSH")
					&& (JSONSignalValues
							.isPresent(jSONObject.get("STICK_PUSH")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("STICK_PUSH", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				stick--;
			}
			if (jSONObject.has("BUCKET_PULL")
					&& (JSONSignalValues.isPresent(jSONObject
							.get("BUCKET_PULL")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("BUCKET_PULL", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				bucket++;
			}
			if (jSONObject.has("BUCKET_PUSH")
					&& (JSONSignalValues.isPresent(jSONObject
							.get("BUCKET_PUSH")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("BUCKET_PUSH", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				bucket--;
			}

			if (jSONObject.has("ALARM_LAMP")
					&& (JSONSignalValues
							.isPresent(jSONObject.get("ALARM_LAMP")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("ALARM_LAMP", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				alarm = true;
			} else {
				alarm = false;
			}
			if (jSONObject.has("DONE_LAMP")
					&& (JSONSignalValues.isPresent(jSONObject.get("DONE_LAMP")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("DONE_LAMP", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				done = true;
			} else {
				done = false;
			}
			if (jSONObject.has("CANCEL_LAMP")
					&& (JSONSignalValues.isPresent(jSONObject
							.get("CANCEL_LAMP")))) {
				if (resetSignals) {
					try {
						returnObj.accumulate("CANCEL_LAMP", JSONSignalValues
								.newValue(false));
					} catch (Exception e) {
					}
				}
				cancelled = true;
			} else {
				cancelled = false;
			}

		} catch (JSONException e) {
			e.printStackTrace();
		}

		if (extendLegs) {
			legs++;
		}
		if (retractLegs) {
			legs--;
		}

		enforceValidValues();
		repaint();
		return returnObj;
	}

	public void initialize() throws KiemInitializationException {
		resetSignals = this.getProperties()[0].getValue().equals("true");
		legs = Backhoe.legsDEF;
		boom = Backhoe.boomDEF;
		stick = Backhoe.stickDEF;
		bucket = Backhoe.bucketDEF;
		extendLegs = false;
		retractLegs = false;
		alarm = false;
		done = false;
		cancelled = false;
		mapAnimation = Activator.getCurrentMapAnimation();
		repaint();
	}

	public boolean isObserver() {
		return true;
	}

	public boolean isProducer() {
		return true;
	}

	@Override
	public JSONObject provideInitialVariables() {
		JSONObject returnObj = new JSONObject();
		try {
			returnObj.accumulate("BOOM_PUSH", JSONSignalValues.newValue(false));
			returnObj.accumulate("BOOM_PULL", JSONSignalValues.newValue(false));
			returnObj
					.accumulate("STICK_PUSH", JSONSignalValues.newValue(false));
			returnObj
					.accumulate("STICK_PULL", JSONSignalValues.newValue(false));
			returnObj.accumulate("BUCKET_PULL", JSONSignalValues
					.newValue(false));
			returnObj.accumulate("BUCKET_PUSH", JSONSignalValues
					.newValue(false));
			returnObj.accumulate("LEGS_EXTEND", JSONSignalValues
					.newValue(false));
			returnObj.accumulate("LEGS_RETRACT", JSONSignalValues
					.newValue(false));
			returnObj.accumulate("LEGS_STOP", JSONSignalValues.newValue(false));
			returnObj
					.accumulate("ALARM_LAMP", JSONSignalValues.newValue(false));
			returnObj.accumulate("DONE_LAMP", JSONSignalValues.newValue(false));
			returnObj.accumulate("CANCEL_LAMP", JSONSignalValues
					.newValue(false));
			returnObj.accumulate("BOOM_IN", JSONSignalValues.newValue(false));
			returnObj.accumulate("BOOM_OUT", JSONSignalValues.newValue(false));
			returnObj.accumulate("STICK_IN", JSONSignalValues.newValue(false));
			returnObj.accumulate("STICK_OUT", JSONSignalValues.newValue(false));
			returnObj.accumulate("BUCKET_IN", JSONSignalValues.newValue(false));
			returnObj
					.accumulate("BUCKET_OUT", JSONSignalValues.newValue(false));
			returnObj.accumulate("LEGS_IN", JSONSignalValues.newValue(false));
			returnObj.accumulate("LEGS_OUT", JSONSignalValues.newValue(false));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return returnObj;
	}

	@Override
	public KiemProperty[] provideProperties() {
		// CHECKSTYLEOFF MagicNumber
		// Rationale: only 5 example properties
		KiemProperty[] properties = new KiemProperty[1];
		properties[0] = new KiemProperty("Reset Signals", true);
		// CHECKSTYLEON MagicNumber
		return properties;
	}

	public void wrapup() throws KiemInitializationException {
		legs = Backhoe.legsDEF;
		boom = Backhoe.boomDEF;
		stick = Backhoe.stickDEF;
		bucket = Backhoe.bucketDEF;
		extendLegs = false;
		retractLegs = false;
		alarm = false;
		done = false;
		cancelled = false;
		repaint();
	}

}
