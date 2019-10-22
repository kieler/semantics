/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view

import de.cau.cs.kieler.kicool.KiCoolStandaloneSetup
import de.cau.cs.kieler.kicool.System
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.ui.DefaultSystemAssociation
import de.cau.cs.kieler.kicool.ui.klighd.ModelReaderUtil
import java.util.ArrayList
import java.util.Date
import java.util.Map
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.jface.action.ControlContribution
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.events.SelectionListener
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control

import static extension de.cau.cs.kieler.kicool.util.KiCoolUtils.*
import org.eclipse.swt.widgets.Display
import java.util.Comparator

/**
 * The SystemSelectionManager keeps track of available systems and reacts to user input regarding selected systems. 
 * 
 * @author ssm, als
 * @kieler.design 2017-02-24 proposed
 * @kieler.rating 2017-02-24 proposed yellow 
 */
class SystemSelectionManager implements SelectionListener {

    public static val TEMPORARY_SYSTEM_PREFIX = "TMP "
    public static val PROJECT_SYSTEM_PREFIX = "PROJECT "
    
    static val Comparator<Class<?>> TYPE_SORTER = new Comparator<Class<?>>() {
        override compare(Class<?> o1, Class<?> o2) {
            if(o1 === null)
                return 1
            if( o2 === null )
                return -1
            if( o2 == o1 )
                return 0
            if (o1.isAssignableFrom(o2)) {
                return 1
            } else if (o2.isAssignableFrom(o1)) {
                return -1
            } else {
                return 0
            }
        }
    }

    private val index = new ArrayList<SystemSelectionEntry>(KiCoolRegistration.getSystemModels.size + 10)
    private var CompilerView view
    private var Class<?> modelClassFilter
    private var Combo combo;
    private val ControlContribution comboContrib = new ControlContribution("Systems") {

        override protected createControl(Composite parent) {
            combo = new Combo(parent, SWT.DROP_DOWN.bitwiseOr(SWT.READ_ONLY))
            combo.addSelectionListener(SystemSelectionManager.this)
            return combo
        }

        override protected int computeWidth(Control control) {
            // This is only performed once
            updateSystemList(false, false)
            val width = super.computeWidth(control)
            updateSystemList(true, false)
            return width
        }

    }
    
    var IProject currentProject
    val projectSystemFinder = new Job("KiCo: Looking for compilation systems in projects") {
        
        override protected run(IProgressMonitor monitor) {
            if (currentProject !== null) {
                currentProject.members.processProjectFiles(monitor)
            }
            return Status.OK_STATUS
        }
    }
    
    new(CompilerView view) {
        this.view = view
    }

    def getContribution() {
        updateSystemList()
        return comboContrib
    }

    def updateSystemList() {
        updateSystemList(true, false)
    }
    
    /**
     * als: This function significantly slows down boot if large projects are open (models repository).
     * Thus should only be used in job!
     */
    private def void processProjectFiles(IResource[] files, IProgressMonitor monitor) {
        val injector = KiCoolStandaloneSetup.doSetup
        monitor?.beginTask("Checking project: ", IProgressMonitor.UNKNOWN)
        for (file : files) {
            if (monitor?.canceled || !file.exists) {
                return
            }
            if (file instanceof IContainer) {
                monitor?.subTask(file.fullPath.toString)
                (file as IContainer).members.processProjectFiles(monitor)
            } else if (file.getName().endsWith(".kico")) {
                monitor?.subTask("Loading system from " + file.fullPath)
                try {
                    val ResourceSet rs = injector.getInstance(typeof(ResourceSet))
                    val resource = rs.getResource(URI.createFileURI(file.location.toOSString), true)
                    val newSystem = resource.getContents().head
                    if (newSystem instanceof System) {
                        val system = newSystem as System
                        if (system.hasInput(modelClassFilter)) {
                            system.id = system.id + "." + new Date().time
                            KiCoolRegistration.registerTemporarySystem(system)
                            val entry = new SystemSelectionEntry(system, file.rawLocation.makeAbsolute.toString)
                            Display.getDefault().asyncExec(new Runnable() {
                                override run() {
                                    entry.addSystem
                                }
                            })
                        }
                    }
                } catch (Exception e) {
                    (new Exception("Could not load project related system: " + file, e)).printStackTrace
                }

            }
        }
    }
    
    private def removeSystem(String id) {
        val i = index.indexOf(id.systemEntryById)
        if (id.systemEntryById?.path !== null)
            KiCoolRegistration.removeTemporarySystem(id)
        if (i >= 0) {
            try {
                combo.remove(i)
                index.remove(i)
            } catch (Exception _) {
            }
        }
    }
    
    private def removeProjectSystem(String path) {
        systemEntryByFile(path)?.id?.removeSystem
    }

    private def selected(SystemSelectionEntry entry) {
        if (index.size == 0 || combo.selectionIndex < 0 )
            return false
        return index.get(combo.selectionIndex).id == entry.id ||
            (index.get(combo.selectionIndex).path !== null && index.get(combo.selectionIndex) == entry.path)
    }

    private def addSystem(SystemSelectionEntry entry) {
        val selected = entry.selected
        var position = 0
        for (e : index) {
            if (e.isLowerAs(entry, modelClassFilter)) {
                combo.add(entry.showName, position)
                index.add(position, entry)
                if (selected) {
                    combo.select(position)
                    view.editPartSystemManager.activeSystem = entry.id
                }
                return
            }
            position += 1
        }
        combo.add(entry.showName)
        index.add(entry)
        if (selected) {
            combo.select(position)
            view.editPartSystemManager.activeSystem = entry.id
        }
    }

    private def updateSystemList(boolean filter, boolean updateView) {
        // determine the path of the system file if the selected system is a project system
        var activeSystem = view.editPartSystemManager.activeSystemId

        if(combo === null || combo.disposed) return;
        if (projectSystemFinder.state == Job.RUNNING) {
            projectSystemFinder.cancel
        }
        combo.removeAll
        for (e : index) {
            if (e.path != null)
                KiCoolRegistration.removeTemporarySystem(e.id)
        }
        index.clear
        
        while( index.size > 0 )
            index.get( 0 ).id.removeSystem

        val model = if(filter) ModelReaderUtil.readModelFromEditor(view.editPartSystemManager.activeEditor)
        if (model !== null && model.class !== modelClassFilter) {
            modelClassFilter = model.class
        }
        val systems = newLinkedList
        systems.addAll(KiCoolRegistration.getSystemModels.filter(System))

        for (system : systems.filter[!filter || hasInput(modelClassFilter)].filter [
            public || (view !== null && view.showPrivateSystemsToggle !== null && view.showPrivateSystemsToggle.checked)
        ].filter[!developer || (view !== null && view.developerToggle !== null && view.developerToggle.checked)]) {
            new SystemSelectionEntry(system, null).addSystem
        }

        val editor = CompilerViewPartListener.getActiveEditor();
        if (editor !== null) {
            val input = editor.getEditorInput();

            var IProject project = input.getAdapter(IProject);
            if (project === null) {
                val resource = input.getAdapter(IResource);
                if (resource !== null) {
                    project = resource.getProject();
                }
            }
            if(project !== null) {
                currentProject = project
                if (projectSystemFinder.state !== Job.RUNNING) {
                    projectSystemFinder.schedule(10)
                }
            }
        }

        // Base default
        var defaultIndex = 0

        // Default via extension point
        val defaultSystemID = DefaultSystemAssociation.getDefaultSystem(
            view.editPartSystemManager.activeEditor?.editorSite?.id)
        if (defaultSystemID !== null) {
            val idx = index.indexOf(defaultSystemID.systemEntryById)
            if (idx >= 0) {
                defaultIndex = idx
            }
        }

        // Previously selected
        if (activeSystem !== null && index.contains(activeSystem)) {
            defaultIndex = index.indexOf(activeSystem.systemEntryById)
        } else if (index.size > defaultIndex) {
            view.editPartSystemManager.activeSystem = index.get(defaultIndex)?.id
        }

        combo.setTextLimit(36)
        combo.select(defaultIndex)
        combo.pack()
        if(updateView) view.updateToolbar() // Prevent infinite invocation loops
    }

    def System getSelectedSystem() {
        if (!combo.isDisposed && combo.selectionIndex != -1) {
            val systemId = getSelectedSystemId
            if (systemId !== null) {
                return KiCoolRegistration.getSystemById(systemId)
            }
        }
        return null
    }

    def String getSelectedSystemId() {
        if (combo.selectionIndex < 0) {
            return null
        }
        return index.get(combo.selectionIndex).id
    }

    def setTemporarySystem(System system) {
        try {
            KiCoolRegistration.registerTemporarySystem(system)
        } catch (Exception e) {
            MessageDialog.openError(null, "Cannot register temporary system", e.message);
            e.printStackTrace
        }
        updateSystemList
        view.updateToolbar
    }

    def getProjectSystemFilePath(String id) {
        id.systemEntryById.path
    }

    override widgetDefaultSelected(SelectionEvent e) {
    }

    override widgetSelected(SelectionEvent e) {
        if (combo.selectionIndex != -1) {
            val id = index.get(combo.selectionIndex)?.id
            if (!id.nullOrEmpty) {
                view.editPartSystemManager.setActiveSystem(id)
                view.editPartSystemManager.intermediateSelection = null
                view.updateView
            }
        }
    }

    def widgetSelectFirst(boolean updateView) {
        val id = index.size > 0 ? index.get(0).id : null
        if (!id.nullOrEmpty) {
            // Workaround: show always the identity system.
            view.editPartSystemManager.setActiveSystem("de.cau.cs.kieler.kicool.identity")
            view.editPartSystemManager.intermediateSelection = null
            if(updateView) view.updateView
        }
    }

    private def <K, V> getKey(Map<K, V> map, V v) {
        for (entry : map.entrySet()) {
            if (entry.value == v)
                return entry.key
        }
        return null
    }

    private def systemEntryById(String id) {
        for (e : index) {
            if (e.id == id)
                return e
        }
        return null
    }

    private def systemEntryByFile(String path) {
        for (e : index) {
            if (e.path == path && e.path !== null)
                return e
        }
        return null
    }

    private static class SystemSelectionEntry {
        private var System system;
        private var String path;
        private var String showName;

        new(System system, String path) {
            this.system = system
            this.path = path
            showName = system.label
            if (showName.nullOrEmpty)
                showName = system.id
            if (path != null)
                showName = PROJECT_SYSTEM_PREFIX + showName
            else if (KiCoolRegistration.isTemporarySystem(system.id))
                showName = TEMPORARY_SYSTEM_PREFIX + showName
        }

        def isLowerAs(SystemSelectionEntry e, Class<?> classFilter) {
            if (classFilter !== null) {
                if( TYPE_SORTER.compare(system.findInputClass, e.system.findInputClass) > 0 )
                    return true
                if( TYPE_SORTER.compare(system.findInputClass, e.system.findInputClass) == 0 )
                    return showName.compareTo(e.showName) > 0
                return false
            }
            return showName.compareTo(e.showName) > 0
        }

        def getShowName() {
            return showName
        }

        def getId() {
            return system.id
        }

        def getPath() {
            return path
        }
    }
}
