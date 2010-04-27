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
import org.json.JSONException;
import org.json.JSONObject;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;

public class OutputDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    OutputStream outputStream;
    InputStream inputStream;
    LinkedList<String> data;

    public OutputDataComponent() {
        // TODO Auto-generated constructor stub
    }

    // -------------------------------------------------------------------------

    public void initialize() throws KiemInitializationException {
        if (ValidatorPlugin.getTrainingModeProperty()) {
            boolean alreadyExists = ValidatorPlugin.existsInputFileWithExtension(".vout", 1);
            if (alreadyExists) {
                try {
                    final Shell shell = Display.getCurrent().getShells()[0];
                    boolean b = MessageDialog.openQuestion(shell, "Existing Training File",
                            "There already exists a training data file for model '"
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

            outputStream = ValidatorPlugin.openOutputFileWithExtension(".vout");
            data = new LinkedList<String>();
        } else {
            inputStream = ValidatorPlugin.openInputFileWithExtension(".vout", 1);
            ObjectInputStream is;
            if (inputStream == null) {
                try {
                    final Shell shell = Display.getCurrent().getShells()[0];
                    boolean b = MessageDialog
                            .openQuestion(
                                    shell,
                                    "No Training File",
                                    "No training data file was found for model '"
                                            + ValidatorPlugin.getInputModel()
                                            + "'"
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
                throw new KiemInitializationException("Cannot open training data file.", false,
                        null);
            }
            try {
                is = new ObjectInputStream(inputStream);
                data = (LinkedList<String>) is.readObject();
            } catch (Exception e) {
                throw new KiemInitializationException("Cannot open training data file.", false, e);
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Provide properties.
     * 
     * @return the kiem property[]
     */
    public KiemProperty[] provideProperties() {
        return ValidatorPlugin.provideProperties();
    }

    // -------------------------------------------------------------------------

    public boolean isObserver() {
        return true;
    }

    // -------------------------------------------------------------------------

    public boolean isProducer() {
        return false;
    }

    // -------------------------------------------------------------------------

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
        } else {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new KiemInitializationException("Cannot close file.", false, e);
            }
        }
    }

    // -------------------------------------------------------------------------

    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        JSONObject returnData = null;
        if (ValidatorPlugin.getTrainingModeProperty()) {
            data.add(ValidatorPlugin.sort(jSONObject).toString());
        } else {
            if (data.size() > 0) {
                String compareData = data.get(0);
                jSONObject = ValidatorPlugin.sort(jSONObject);
                if (!jSONObject.toString().equals(compareData)) {
                    throw new KiemExecutionException(
                            "Data validation failed. Current data differs from trained data. \n\n Trained data: \n"
                                    + compareData + " \n\n Current data: \n"
                                    + jSONObject.toString(), true, null);
                }
                data.remove(0);
            } else {
                // suggest to stop
                throw new KiemExecutionException("End of trained trace.", true, false, true, null);
            }
        }
        return returnData;
    }

    // -------------------------------------------------------------------------

    public KiemEvent provideEventOfInterest() {
        int[] events = { KiemEvent.KIEMPROPERTY_CHANGE };
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
