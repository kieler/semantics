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
package de.cau.cs.kieler.kicool.ui

import de.cau.cs.kieler.kicool.KiCoolStandaloneSetup
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.ui.view.CompilerView
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.util.Comparator
import java.util.LinkedList
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog.ItemsFilter
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.ui.internal.Activator

/**
 * @author kolja
 * 
 */
class InstallSystemsHandler extends AbstractHandler {

    static public var CompilerView view = null
    static val injector = KiCoolStandaloneSetup.doSetup
    static val serializer = injector.getInstance(typeof(ISerializer))

    static class SystemDialog extends FilteredItemsSelectionDialog {

        static class SystemDialogItem {
            var System system = null

            new(System s) {
                system = s
            }

            override toString() {
                return system.label + " (id:" + system.id + ")"
            }

            def getSystem() {
                return system
            }
        }

        val LinkedList<SystemDialogItem> systems = newLinkedList
        var LinkedList<SystemDialogItem> selected = newLinkedList

        new(Shell shell) {
            super(shell, true)
            setTitle("Select Systems to install")
            for (s : KiCoolRegistration.getSystemModels.filter(System)) {
                if (!KiCoolRegistration.isTemporarySystem(s.id)) {
                    systems.add(new SystemDialogItem(s))
                }
            }
        }

        override protected Control createExtendedContentArea(Composite parent) {
            return null;
        }

        override protected ItemsFilter createFilter() {
            return new ItemsFilter() {
                override boolean matchItem(Object item) {
                    if (item instanceof SystemDialogItem)
                        return (item as SystemDialogItem).getSystem.id.matches ||
                            (item as SystemDialogItem).getSystem.label.matches
                    return item.toString.matches
                }

                override boolean isConsistentItem(Object item) {
                    return true
                }
            };
        }

        override protected fillContentProvider(AbstractContentProvider contentProvider, ItemsFilter itemsFilter,
            IProgressMonitor progressMonitor) throws CoreException {
            progressMonitor.beginTask("Searching", systems.size())
            for (s : systems) {
                contentProvider.add(s, itemsFilter)
                progressMonitor.worked(1)
            }
            progressMonitor.done()
        }

        static val DIALOG_SETTINGS = "InstyllSystemsSelectionDialog";

        override protected getDialogSettings() {
            var settings = Activator.getDefault().getDialogSettings().getSection(DIALOG_SETTINGS)
            if (settings === null) {
                settings = Activator.getDefault().getDialogSettings().addNewSection(DIALOG_SETTINGS)
            }
            return settings;
        }

        override getElementName(Object item) {
            return item.toString()
        }

        override protected Comparator<Object> getItemsComparator() {
            return new Comparator() {
                override compare(Object arg0, Object arg1) {
                    if (arg0 instanceof SystemDialogItem && arg1 instanceof SystemDialogItem)
                        return (arg0 as SystemDialogItem).getSystem.label.compareTo(
                            (arg1 as SystemDialogItem).getSystem.label)
                    return arg0.toString().compareTo(arg1.toString())
                }
            };
        }

        override protected IStatus validateItem(Object item) {
            return Status.OK_STATUS;
        }

        override handleSelected(StructuredSelection selection) {
            selected.clear
            for (s : selection.toArray()) {
                selected.add(s as SystemDialogItem)
            }
            super.handleSelected(selection)
        }

        def LinkedList<System> getSelectedSystems() {
            val LinkedList<System> list = newLinkedList
            for (s : selected) {
                list.add(s.getSystem())
            }
            return list
        }
    }

    override execute(ExecutionEvent event) throws ExecutionException {

        val dialog = new SystemDialog(HandlerUtil.getActiveWorkbenchWindow(event).getShell())
        dialog.setInitialPattern("de.*")
        dialog.refresh()
        if (dialog.open() == SystemDialog.OK) {
            val window = HandlerUtil.getActiveWorkbenchWindow(event)
            val selection = window.getSelectionService().getSelection() as ISelection;
            if (selection instanceof IStructuredSelection) {
                val element = (selection as IStructuredSelection).getFirstElement();
                var String path = null
                var IProject project = null
                if (element instanceof IProject) {
                    path = (element as IProject).location.makeAbsolute.toString
                    project = (element as IProject)
                } else if (element instanceof IResource) {
                    path = (element as IResource).rawLocation.makeAbsolute.toString
                    project = (element as IResource).getProject()
                }
                if (path !== null) {
                    for (s : dialog.selectedSystems) {
                        val filePath = path + "/" + s.id + ".kico"
                        val newFile = new File(filePath);
                        if (newFile.exists()) {
                            val question = new MessageDialog(HandlerUtil.getActiveWorkbenchWindow(event).getShell(),
                                "File override warning", null,
                                "The file '" + path + "/" + s.id + ".kico" + "' would be overwritten.",
                                MessageDialog.WARNING, 0, #["continue", "skip"]) {
                                override buttonPressed(int buttonId) {
                                    if (buttonId == 0) {
                                        createSystem(filePath, s)
                                    }
                                    close()
                                }
                            }
                            question.open()
                        } else {
                            createSystem(filePath, s)
                        }
                    }
                    if (project !== null) {
                        project.refreshLocal(IResource.DEPTH_INFINITE, null)
                    }
                    if (view !== null) {
                        view.systemSelectionManager.updateSystemList
                    }
                }
            }
        }
        return 0
    }

    private def createSystem(String path, System system) {
        val contend = serializer.serialize(system)
        val writer = new BufferedWriter(new FileWriter(path));
        writer.write(contend);
        writer.close();
    }
}
