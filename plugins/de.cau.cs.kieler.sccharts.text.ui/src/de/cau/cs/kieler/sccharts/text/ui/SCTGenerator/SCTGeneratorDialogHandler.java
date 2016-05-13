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
package de.cau.cs.kieler.sccharts.text.ui.SCTGenerator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;

import com.google.inject.Injector;

import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;

/**
 * @author ssm
 *
 */
public class SCTGeneratorDialogHandler extends AbstractHandler {

    public static final String SCT_GENERATOR_OPENDIALOG =
            "de.cau.cs.kieler.sccharts.text.ui.SCTGenerator.openDialog";

    private static Injector injector = new SctStandaloneSetup()
        .createInjectorAndDoEMFRegistration();    
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        String commandString = event.getCommand().getId().toString();
        
        if (commandString.equals(SCT_GENERATOR_OPENDIALOG)) {
            SCTGeneratorDialog dialog = new SCTGeneratorDialog(null);
            if (dialog.open() != Window.OK)return null;
        } 
        return null;
    }


}
