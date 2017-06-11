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
package de.cau.cs.kieler.kvis.ui.views

import de.cau.cs.kieler.kvis.animations.AnimationHandler
import de.cau.cs.kieler.kvis.kvis.Visualization
import de.cau.cs.kieler.kvis.ui.animations.ColorAnimation
import de.cau.cs.kieler.kvis.ui.svg.KVisCanvas
import de.cau.cs.kieler.prom.common.ModelImporter
import de.cau.cs.kieler.simulation.core.DataPool
import java.util.List
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jface.action.Action
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.part.ViewPart
import de.cau.cs.kieler.kvis.ui.svg.EclipseJSVGCanvas

/**
 * @author aas
 * 
 */
class KVisView extends ViewPart {

    public static val VIEW_ID = "de.cau.cs.kieler.simulation.ui.dataPoolView"

    public static val KVIS_FILE_EXTENSION = "kvis"

    public static var KVisView instance

    private KVisCanvas canvas

    private val List<AnimationHandler> animationHandlers = newArrayList()

    private var IFile lastFile

    /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
    override createPartControl(Composite parent) {
        // Remember the instance
        instance = this

        // Create canvas
        createCanvas(parent)

        // Create menu and toolbars.
        createMenu()
        createToolbar()
    }

    /**
     * Dispose and clear reference to singleton instance.
     */
    override dispose() {
        super.dispose()
        instance = null
    }

    /**
     * {@inheritDoc}
     */
    override setFocus() {
    }

    private def void loadFile(IFile file) {
        if (!file.fileExtension.toLowerCase.equals(KVIS_FILE_EXTENSION)) {
            System.err.println("Selection is not a kvis file.")
            return;
        }

        lastFile = file

        val model = ModelImporter.load(file)
        if (model != null) {
            if (model instanceof Visualization) {
                val project = file.project
                val imagePath = model.image
                val imageFile = project.getFile(imagePath)
                canvas.setSVGFile(imageFile)

                // Load animations
                animationHandlers.clear()
                for (element : model.elements) {
                    for (animation : element.animations) {
                        if (animation.type == "color") {
                            val colorAnimation = new ColorAnimation(element.name, animation)
                            animationHandlers.add(colorAnimation)
                        }
                    }
                }
            }
        }
    }

    public def void reload() {
        if (lastFile != null)
            loadFile(lastFile)
    }

    private def void createCanvas(Composite parent) {
        canvas = new KVisCanvas(parent, SWT.NONE, false)
    }

    private def void createMenu() {
        val mgr = getViewSite().getActionBars().getMenuManager();
    }

    private def void createToolbar() {
        val mgr = getViewSite().getActionBars().getToolBarManager();
        mgr.add(new Action("Open KVis File") {
            override run() {
                val rootElement = ResourcesPlugin.getWorkspace().getRoot()

                val dialog = new ResourceSelectionDialog(canvas.shell, rootElement, "")
                dialog.open()

                val results = dialog.result
                if (results != null && results.size > 0) {
                    val result = results.get(0) as IResource
                    if (result.type == IResource.FILE) {
                        loadFile(result as IFile)
                    }
                }
            }
        })
    }

    public def void update(DataPool pool) {
        // Make all changes to the svg in the update manager.
        // Otherwise the svg canvas is not updated properly.
        canvas.svgCanvas.getUpdateManager().getUpdateRunnableQueue().invokeLater(new Runnable() {
            override run() {
                for (animation : animationHandlers) {
                    animation.apply(pool)
                }
            }
        })
    }
}
