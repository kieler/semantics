/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 
package de.cau.cs.kieler.kivis.ui.svg

import de.cau.cs.kieler.simulation.core.SimulationManager
import java.awt.event.ActionEvent
import java.awt.event.InputEvent
import java.awt.event.KeyEvent
import java.awt.event.MouseEvent
import javax.swing.AbstractAction
import javax.swing.InputMap
import javax.swing.JComponent
import javax.swing.KeyStroke
import org.apache.batik.swing.JSVGCanvas
import org.apache.batik.swing.JSVGCanvas.ResetTransformAction
import org.apache.batik.swing.JSVGCanvas.ScrollDownAction
import org.apache.batik.swing.JSVGCanvas.ScrollLeftAction
import org.apache.batik.swing.JSVGCanvas.ScrollRightAction
import org.apache.batik.swing.JSVGCanvas.ScrollUpAction
import org.apache.batik.swing.JSVGCanvas.ZoomAction
import org.apache.batik.swing.gvt.AbstractImageZoomInteractor
import org.apache.batik.swing.gvt.AbstractPanInteractor
import org.apache.batik.swing.gvt.AbstractResetTransformInteractor
import org.apache.batik.swing.svg.SVGDocumentLoader
import org.apache.batik.swing.svg.SVGDocumentLoaderListener
import org.apache.batik.swing.svg.SVGUserAgent
import org.apache.batik.util.ParsedURL

/** 
 * Modifies the regular JSVGCanvas in such a way that the EclipseDocumentLoader class gets used
 * instead of the standard DocumentLoader.
 * Also uses simpler key bindings to control the SVG canvas.
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * @author aas
 * @kieler.rating 2010-02-17 proposed yellow
 * @kieler.ignore deprecated project
 */
final class EclipseJSVGCanvas extends JSVGCanvas {

    /**
     * The key for the Action to perform a macro tick.
     */
    public val String STEP_MACRO_TICK_ACTION = "StepMacroTick";
    
    /**
     * The key for the Action to play / pause the simulation.
     */
    public val String PLAY_SIMULATION_ACTION = "PlaySimulation";

    /** 
     * @param userAgent The user agent
     * @param eventsEnabled Determines if the SVG document should listen for events
     * @param selectableText Determines if text in the SVG document can be selected
     */
    new(SVGUserAgent userAgent, boolean eventsEnabled, boolean selectableText) {
        super(userAgent, eventsEnabled, selectableText)
        // Change mouse interaction to work without modifiers
        changeInteractors()
    }
    
    /**
     * Changes the default interactors (e.g. which key bindings are used to rotate / zoom / move the image)
     * of the JSVGCanvas.
     */
    private def void changeInteractors() {
        // The scheme to change an interactor is as follows: remove old, create new, add new 
        
        // Image Zoom Interactor
        // Binding: Right Mouse Button, but no modifier
        interactors.remove(imageZoomInteractor)
        imageZoomInteractor = new AbstractImageZoomInteractor() {
            override startInteraction(InputEvent ie) {
                val mods = ie.modifiers
                return ie.ID == MouseEvent.MOUSE_PRESSED
                    && mods.hasBit(InputEvent.BUTTON3_MASK)
                    && !mods.hasBit(InputEvent.SHIFT_MASK)
                    && !mods.hasBit(InputEvent.CTRL_MASK)
            }
        }
        interactors.add(imageZoomInteractor)
        
        // Move Image Interactor
        // Binding: Left Mouse Button or Middle Mouse Button, but no modifier
        // (In Inkscape one can move the image using the Middle Mouse Button, thus this is more consistent)
        interactors.remove(panInteractor)
        panInteractor = new AbstractPanInteractor() {
            override startInteraction(InputEvent ie) {
                val mods = ie.modifiers
                return ie.ID == MouseEvent.MOUSE_PRESSED
                    && (mods.hasBit(InputEvent.BUTTON1_MASK) || mods.hasBit(InputEvent.BUTTON2_MASK))
                    && !mods.hasBit(InputEvent.SHIFT_MASK)
                    && !mods.hasBit(InputEvent.CTRL_MASK)
            }
        }
        interactors.add(panInteractor)
        
        // Reset Perspective Interactor
        // Binding: CTRL + RIGHT Mouse Button
        interactors.remove(resetTransformInteractor)
        resetTransformInteractor = new AbstractResetTransformInteractor() {
            override startInteraction(InputEvent ie) {
                val mods = ie.modifiers
                return ie.ID == MouseEvent.MOUSE_PRESSED
                    && mods.hasBit(InputEvent.BUTTON3_MASK)
                    && mods.hasBit(InputEvent.CTRL_MASK)
            }
        }
        interactors.add(resetTransformInteractor)
    }

    /**
     * {@inheritDoc}
     */
    override installKeyboardActions() {
        var InputMap inputMap = getInputMap(JComponent.WHEN_FOCUSED)
        var KeyStroke key
        // RIGHT ARROW: step simulation 
        key = KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0);
        inputMap.put(key, STEP_MACRO_TICK_ACTION);
        // CTRL + ARROW: scroll
        key = KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, KeyEvent.CTRL_MASK);
        inputMap.put(key, SCROLL_RIGHT_ACTION);
        key = KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, KeyEvent.CTRL_MASK);
        inputMap.put(key, SCROLL_LEFT_ACTION);
        key = KeyStroke.getKeyStroke(KeyEvent.VK_UP, KeyEvent.CTRL_MASK);
        inputMap.put(key, SCROLL_UP_ACTION);
        key = KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, KeyEvent.CTRL_MASK);
        inputMap.put(key, SCROLL_DOWN_ACTION);
        // SHIFT + ARROW: fast scroll
        key = KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, KeyEvent.SHIFT_MASK);
        inputMap.put(key, FAST_SCROLL_RIGHT_ACTION);
        key = KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, KeyEvent.SHIFT_MASK);
        inputMap.put(key, FAST_SCROLL_LEFT_ACTION);
        key = KeyStroke.getKeyStroke(KeyEvent.VK_UP, KeyEvent.SHIFT_MASK);
        inputMap.put(key, FAST_SCROLL_UP_ACTION);
        key = KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, KeyEvent.SHIFT_MASK);
        inputMap.put(key, FAST_SCROLL_DOWN_ACTION);
        // I: Zoom In
        key = KeyStroke.getKeyStroke(KeyEvent.VK_I, 0);
        inputMap.put(key, ZOOM_IN_ACTION);
        // O: Zoom Out
        key = KeyStroke.getKeyStroke(KeyEvent.VK_O, 0);
        inputMap.put(key, ZOOM_OUT_ACTION);
        // ESCAPE:  Reset perspective
        key = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
        inputMap.put(key, RESET_TRANSFORM_ACTION);
    }

    /**
     * {@inheritDoc}
     */
    override installActions() {
        val actionMap = getActionMap();

        // Simulation actions
        val stepMacroTickAction = new AbstractAction() {
            override actionPerformed(ActionEvent evt) {
                if (gvtRoot == null) {
                    return;
                }
                SimulationManager.instance?.stepMacroTick
            }
        }
        val playSimulationAction = new AbstractAction() {
            override actionPerformed(ActionEvent evt) {
                if (gvtRoot == null) {
                    return;
                }
                val sim = SimulationManager.instance
                if(sim != null) {
                    if(sim.isPlaying) {
                        sim.pause
                    } else {
                        sim.play
                    }
                }
            }
        }
        actionMap.put(STEP_MACRO_TICK_ACTION, stepMacroTickAction)
        actionMap.put(PLAY_SIMULATION_ACTION, playSimulationAction)
        // Scroll
        actionMap.put(SCROLL_RIGHT_ACTION, new ScrollRightAction(10));
        actionMap.put(SCROLL_LEFT_ACTION, new ScrollLeftAction(10));
        actionMap.put(SCROLL_UP_ACTION, new ScrollUpAction(10));
        actionMap.put(SCROLL_DOWN_ACTION, new ScrollDownAction(10));
        // Fast scroll
        actionMap.put(FAST_SCROLL_RIGHT_ACTION, new ScrollRightAction(30));
        actionMap.put(FAST_SCROLL_LEFT_ACTION, new ScrollLeftAction(30));
        actionMap.put(FAST_SCROLL_UP_ACTION, new ScrollUpAction(30));
        actionMap.put(FAST_SCROLL_DOWN_ACTION, new ScrollDownAction(30));
        // Zoom
        actionMap.put(ZOOM_IN_ACTION, new ZoomAction(2));
        actionMap.put(ZOOM_OUT_ACTION, new ZoomAction(0.5));
        // Reset perspective
        actionMap.put(RESET_TRANSFORM_ACTION, new ResetTransformAction());
    }

    /**
     * Checks wether the bit is set in the bitmask.
     */
    private def boolean hasBit(int bitmask, int bit) {
        return bitmask.bitwiseAnd(bit) != 0
    }
    
    /** 
     * Loads the SVGDoument from the given url.
     * @param url The url that should be loaded.
     */
    override void loadSVGDocument(String url) {
        var String oldURI = null
        if (svgDocument !== null) {
            oldURI = svgDocument.getURL()
        }
        val ParsedURL newURI = new ParsedURL(oldURI, url)
        var String url2 = newURI.toString()
        fragmentIdentifier = newURI.getRef()
        loader = new EclipseDocumentLoader(userAgent)
        nextDocumentLoader = new SVGDocumentLoader(url2, loader)
        nextDocumentLoader.setPriority(Thread.MIN_PRIORITY)
        var iter = svgDocumentLoaderListeners.iterator()
        while (iter.hasNext()) {
            nextDocumentLoader.addSVGDocumentLoaderListener(iter.next as SVGDocumentLoaderListener)
        }
        startDocumentLoader()
    }
    
    /** 
     * Starts a loading thread.
     */
    def private void startDocumentLoader() {
        documentLoader = nextDocumentLoader
        nextDocumentLoader = null
        documentLoader.start()
    }
}
