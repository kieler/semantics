package de.cau.cs.kieler.esterel.eso;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.esterel.EsterelStandaloneSetup;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.esterel.kexpressions.Input;
import de.cau.cs.kieler.esterel.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.esterel.kexpressions.Signal;
import de.cau.cs.kieler.esterel.xtend.InterfaceDeclarationFix;

/**
 * The abstract handler for Esterel file formats strl.
 * 
 * @author cmot
 * @kieler.design 2015-06-15 proposed cmot
 * @kieler.rating 2015-06-15 proposed yellow
 */
public class EsterelModelFileHandler extends AbstractConvertModelHandler {

    /** The Constant title of the dlg window. */
    public static final String title = "Generate Random Inputs";

    /** The Constant msg of the dlg window. */
    public static final String msg =
            "Enter the number of ticks and traces (separated by comma) for which random inputs will be generated:";

    /** The Constant defaultValue represents the default number of ticks. */
    public static final String defaultValue = "1000,1";

    /** The Constant S_TRANSFORMATION. */
    public static final String S_TRANSFORMATION =
            "de.cau.cs.kieler.sccharts.commands.STransformation";

    /** Create an injector to load the transformation via guice. */
    private static Injector injector = new EsterelStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new sC charts model file handler.
     */
    public EsterelModelFileHandler() {
        super();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        Object transformed = null;

        String dlgValue = showInputDialog(title, msg, "" + defaultValue);

        int ticks = 0;
        int traces = 1;
        try {
            if (dlgValue.contains(",")) {
                String dlgValues[] = dlgValue.split(",");
                traces = Integer.parseInt(dlgValues[1].trim());
                dlgValue = dlgValues[0];
            }
            ticks = Integer.parseInt(dlgValue);
        } catch (Exception e) {
            // fallback are ticks=0, traces=1
        }

        Program program = (Program) model;
        if (program.getModules().size() == 0) {
            return "ERROR: No module in Esterel program.";
        }

        // Cannot be done before because otherwise the new model cannot be serialized
        // Do this on a copy to not destroy original program;
        // Make Esterel Interface declaration consistent
        InterfaceDeclarationFix interfaceDeclarationFix =
                Guice.createInjector().getInstance(InterfaceDeclarationFix.class);
        Program fixedTransformedProgram = (Program) EcoreUtil.copy(program);
        interfaceDeclarationFix.fix(fixedTransformedProgram);

        Module module = fixedTransformedProgram.getModules().get(0);

        StringBuilder builder = new StringBuilder();

        for (int trace = 0; trace < traces; trace++) {
            builder.append("! reset;\n");
            for (int tick = 0; tick < ticks; tick++) {

                for (InterfaceSignalDecl declaration : module.getInterface().getIntSignalDecls()) {
                    for (Signal signal : declaration.getSignals()) {
                        if (declaration instanceof Input) {
                            String type = signal.getType().getLiteral();
                            
                            boolean present = (Math.random() * 2 > 1);

                            String value = null;
                            // get random value
                            if (type.equals("int")) {
                                value = ((int) (1000 - (Math.random() * 2000))) + "";
                            } else if (type.equals("bool")) {
                                if (Math.random() * 2 > 1) {
                                    value = "true";
                                } else {
                                    value = "false";
                                }
                            } else if (type.equals("pure")) {
                                if (Math.random() * 2 > 1) {
                                    value = "PRESENT";
                                }
                            } else if (type.equals("double")) {
                                value = (1000 - (Math.random() * 2000)) + "";
                            }

                            String name = signal.getName();

                            // signals
                            if (value != null && present) {
                                if (type.equals("pure")) {
                                    builder.append(name + " ");
                                } else {
                                    builder.append(name + "(" + value + ") ");
                                }
                            }
                        }// input
                    }
                }// declaration
                builder.append("\n% Output: \n;\n");

            }// tick
        }

        transformed = builder.toString();

        return transformed;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String getDiagramEditorID() {
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected boolean doOpenEditor(final Object modelObject, final ExecutionEvent event,
            final ISelection selection) {
        return false;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
        return "eso";
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        // Force AbstractConvertModelHandler to use XMIResource (instead of Xtext Resources)
        return injector;
    }

    // -------------------------------------------------------------------------

    /**
     * Show an input dialog with the message, a default value and a specific title.
     * 
     * @param title
     *            the title of the dialog
     * @param message
     *            the message to present
     * @param defaultValue
     *            the default value
     * 
     * @return the string value entered or null if aborted
     */
    String inputDialogReturnValue = null;

    private String showInputDialog(final String title, final String message,
            final String defaultValue) {
        inputDialogReturnValue = null;
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                final Shell shell = Display.getCurrent().getShells()[0];
                InputDialog dlg = new InputDialog(shell, title, message, defaultValue, null);
                dlg.open();
                if (dlg.getReturnCode() == InputDialog.OK) {
                    inputDialogReturnValue = dlg.getValue();
                }
            }
        });
        return inputDialogReturnValue;
    }

    // -------------------------------------------------------------------------
}
