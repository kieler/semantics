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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.kivi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;

import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kivi.AbstractCombination;
import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.model.triggers.DiagramTrigger.DiagramState;
import de.cau.cs.kieler.core.model.xtend.m2m.XtendTransformationContext;
import de.cau.cs.kieler.core.model.xtend.m2m.XtendTransformationEffect;
import de.cau.cs.kieler.kiml.kivi.LayoutEffect;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * 
 * This combination is used for creating a default state on empty synccharts regions.
 * 
 * @author ckru
 * 
 */
public class GenerateDefaultCombination extends AbstractCombination implements ResourceSetListener {

    private String absolutePath = null;

    private SyncchartsDiagramEditor lastEditor = null;

    /**
     * Constructor, will create a copy of the transformation file and save it to the resources plugin.
     * Reason for this is that it normally would be packed to the jar along with the classes and thus
     * would not exist as a real file on the filesystem. The xtend transformation framework however
     * only works with real files.
     */
    public GenerateDefaultCombination() {
        InputStream inStream;
        StringBuffer contentBuffer = new StringBuffer();
        URL url = Activator.getDefault().getBundle().getEntry("/transformations/feature.ext");
        try {
            inStream = url.openStream();

            while (inStream.available() > 0) {
                contentBuffer.append((char) inStream.read());
            }
            IPath path = ResourcesPlugin.getPlugin().getStateLocation();
            // Transformation file name:

            path = path.append("Synccharts");
            // Add extension:
            path = path.addFileExtension(".ext");

            File file = new File(path.toOSString());
            if (file != null) {
                FileOutputStream out = null;
                try {
                    out = new FileOutputStream(file);
                    if (out != null) {
                        if (!file.exists()) {
                            if (!file.createNewFile()) {
                                // error
                            }
                        }

                        out.write(contentBuffer.toString().getBytes());
                        out.flush();
                        out.close();
                    }
                } catch (FileNotFoundException fne) {
                    fne.printStackTrace();
                } catch (SecurityException sece) {
                    sece.printStackTrace();
                } finally {
                    if (out != null) {
                        out.close();
                    }
                }
                // Set delete on exit flag, so the files will be cleaned
                // when exiting
                // eclipse
                file.deleteOnExit();
                absolutePath = file.getAbsolutePath();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void execute(final DiagramState diagram) {
        if (diagram.getDiagramPart() instanceof SyncchartsDiagramEditor) {
            SyncchartsDiagramEditor sde = (SyncchartsDiagramEditor) diagram.getDiagramPart();
            lastEditor = sde;
            EObject object = diagram.getSemanticModel();
            Region r = (Region) object;
            try {
                sde.getEditingDomain().addResourceSetListener(this);
            } catch (NullPointerException npe) {
                // we can't register ourself now. Nothing to do about it, try again later
            }
            EList<State> states = r.getStates();
            EList<Signal> signals = r.getSignals();
            if (states.isEmpty() && signals.isEmpty()) {
                if (absolutePath != null) {
                    Object[] mapping = { r };
                    TransformationDescriptor descriptor = new TransformationDescriptor(
                            "createDefault", mapping);
                    String[] packages = { "de.cau.cs.kieler.synccharts.SyncchartsPackage" };

                    XtendTransformationContext context = new XtendTransformationContext(
                            absolutePath, packages, null, sde.getEditingDomain());
                    XtendTransformationEffect effect = new XtendTransformationEffect(context,
                            descriptor);
                    LayoutEffect layout = new LayoutEffect(sde, r, false);
                    effect.schedule();
                    layout.schedule();
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public NotificationFilter getFilter() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Command transactionAboutToCommit(final ResourceSetChangeEvent event)
            throws RollbackException {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void resourceSetChanged(final ResourceSetChangeEvent event) {
        LayoutEffect layout = null;
        XtendTransformationEffect effect = null;
        for (Notification n : event.getNotifications()) {
            if ((n.getEventType() == Notification.REMOVE) && (n.getNotifier() instanceof Region)) {
                Region r = ((Region) n.getNotifier());
                EList<State> states = r.getStates();
                EList<Signal> signals = r.getSignals();
                if (r.getParentState() == null) {
                    if (states.isEmpty() && signals.isEmpty()) {
                        if (absolutePath != null) {
                            Object[] mapping = { r };
                            TransformationDescriptor descriptor = new TransformationDescriptor(
                                    "createDefault", mapping);
                            String[] packages = { "de.cau.cs.kieler.synccharts.SyncchartsPackage" };

                            XtendTransformationContext context = new XtendTransformationContext(
                                    absolutePath, packages, null, event.getEditingDomain());
                            effect = new XtendTransformationEffect(context, descriptor);
                            layout = new LayoutEffect(lastEditor, r, false);
                        }
                    }
                } else {
                    if (states.isEmpty() && signals.isEmpty()) {
                        if (absolutePath != null) {
                            Object[] mapping = { r };
                            TransformationDescriptor descriptor = new TransformationDescriptor(
                                    "addInitialState", mapping);
                            String[] packages = { "de.cau.cs.kieler.synccharts.SyncchartsPackage" };

                            XtendTransformationContext context = new XtendTransformationContext(
                                    absolutePath, packages, null, event.getEditingDomain());
                            effect = new XtendTransformationEffect(context, descriptor);
                            layout = new LayoutEffect(lastEditor, r, false);
                        }
                    }
                }
            }
        }
        if (effect != null && layout != null) {
            effect.schedule();
            layout.schedule();
        }

    }

    /**
     * {@inheritDoc}
     */
    public boolean isAggregatePrecommitListener() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isPrecommitOnly() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isPostcommitOnly() {
        return true;
    }

}
