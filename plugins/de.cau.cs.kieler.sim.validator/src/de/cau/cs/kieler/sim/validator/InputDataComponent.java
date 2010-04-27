package de.cau.cs.kieler.sim.validator;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.LinkedList;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.json.JSONException;
import org.json.JSONObject;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

public class InputDataComponent extends JSONObjectDataComponent implements IJSONObjectDataComponent {

    OutputStream outputStream;
    InputStream inputStream;
    LinkedList<String> data;

    public InputDataComponent() {
        // TODO Auto-generated constructor stub
    }

    public void initialize() throws KiemInitializationException {
        if (ValidatorPlugin.getTrainingModeProperty()) {
            boolean alreadyExists = ValidatorPlugin.existsInputFileWithExtension(".vin", 1);
            if (alreadyExists) {
                try {
                    final Shell shell = Display.getCurrent().getShells()[0];
                    boolean b = MessageDialog.openQuestion(shell, "Existing Training File", "There already exists a training data file for model '"
                            + ValidatorPlugin.getInputModel() + "'"
                            + ". Do you want to switch the training mode off now?");
                    if (b) {
                        ValidatorPlugin.setTrainingModeProperty(false);
                        // call initialize again
                        initialize();
                        return;
                    }
                } catch (Exception e) {
                    // hide error if no GUI
                }
            }
            
            outputStream = ValidatorPlugin.openOutputFileWithExtension(".vin");
            data = new LinkedList<String>();
        } else {
            inputStream = ValidatorPlugin.openInputFileWithExtension(".vin", 1);
            ObjectInputStream is;
            if (inputStream == null) {
                try {
                    final Shell shell = Display.getCurrent().getShells()[0];
                    boolean b = MessageDialog.openQuestion(shell, "No Training File", "No training data file was found for model '"
                            + ValidatorPlugin.getInputModel() + "'"
                            + ". Do you want to switch the validation to traning mode first?");
                    if (b) {
                        ValidatorPlugin.setTrainingModeProperty(true);
                        // call initialize again
                        initialize();
                        return;
                    }
                } catch (Exception e) {
                    // hide error if no GUI
                }
            }
            if (inputStream == null) {
                throw new KiemInitializationException("Cannot open training data file.", false, null);
            }
            try {
                is = new ObjectInputStream(inputStream);
                data = (LinkedList<String>) is.readObject();
            } catch (Exception e) {
                throw new KiemInitializationException("Cannot open training data file.", false, e);
            }
        }
    }

    /**
     * Provide properties.
     * 
     * @return the kiem property[]
     */
    public KiemProperty[] provideProperties() {
        return ValidatorPlugin.provideProperties();
    }

    public boolean isObserver() {
        return ValidatorPlugin.getTrainingModeProperty();
    }

    public boolean isProducer() {
        return !ValidatorPlugin.getTrainingModeProperty();
    }

    public void wrapup() throws KiemInitializationException {
        if (ValidatorPlugin.getTrainingModeProperty()) {
            if (outputStream != null) {
                try {
                    ObjectOutputStream os = new ObjectOutputStream(outputStream);
                    os.writeObject(data);
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e) {
                    throw new KiemInitializationException("Cannot close file.", false, e);
                }
            }
            // turn Training Mode off for the next run
            //ValidatorPlugin.setTrainingModeProperty(false);
        } else {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new KiemInitializationException("Cannot close file.", false, e);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent#isDeltaObserver()
     */
    public boolean isDeltaObserver() {
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent#step(org.json.JSONObject)
     */
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        JSONObject returnData = null;
        if (ValidatorPlugin.getTrainingModeProperty()) {
            data.add(jSONObject.toString());
        } else {
            if (data.size() > 0) {
                try {
                    returnData = new JSONObject(data.get(0));
                } catch (JSONException e) {
                    throw new KiemExecutionException("Cannot read data from file.", false, e);
                }
                data.remove(0);
            }
        }
        return returnData;
    }

    // -------------------------------------------------------------------------

    public KiemEvent provideEventOfInterest() {
        int[] events = {KiemEvent.KIEMPROPERTY_CHANGE};
        KiemEvent event = new KiemEvent(events); 
        return event;
    }

    // -------------------------------------------------------------------------

    public void notifyEvent(final KiemEvent event) {
        String editor = this.getProperties()[0].getValue();
        boolean training = this.getProperties()[1].getValueAsBoolean();
        ValidatorPlugin.setEditorProperty(editor);
        ValidatorPlugin.setTrainingModeProperty(training);
    }

}
