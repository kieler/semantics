///*
// * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
// *
// * http://www.informatik.uni-kiel.de/rtsys/kieler/
// * 
// * Copyright 2009 by
// * + Christian-Albrechts-University of Kiel
// *   + Department of Computer Science
// *     + Real-Time and Embedded Systems Group
// * 
// * This code is provided under the terms of the Eclipse Public License (EPL).
// * See the file epl-v10.html for the license text.
// */
//package de.cau.cs.kieler.krep.evalbench.ui.views;
//
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.ui.part.ViewPart;
//
///**
// * A View for logging of arbitrary messages to targets.
// * 
// * @author ctr
// */
//public class MessageView extends ViewPart {
//
//    /** The identifier string for this view. */
//    public static final String VIEW_ID = "de.cau.cs.kieler.krep.evalbench.ui.views.message";
//
//    /** The viewer used to display connection logs. */
//    private static TextViewer viewer;
//
//    private static void setViewer(final TextViewer tViewer) {
//        MessageView.viewer = tViewer;
//    }
//
//    /*
//     * (non-Javadoc)
//     * 
//     * @see
//     * org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets
//     * .Composite)
//     */
//    @Override
//    public void createPartControl(final Composite parent) {
//        // create text viewer
//        setViewer(new TextViewer(parent));
//    }
//
//    /*
//     * (non-Javadoc)
//     * 
//     * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
//     */
//    @Override
//    public void setFocus() {
//        viewer.getControl().setFocus();
//    }
//
//    /*
//     * display message
//     */
//    /**
//     * @param data
//     *            message
//     */
//    public static void print(final String data) {
//        if (viewer != null) {
//            viewer.append(data + "\n");
//        }
//    }
//
//    /**
//     * Gets the text viewer.
//     * 
//     * @return text viewer
//     */
//    public TextViewer getViewer() {
//        return viewer;
//    }
//}
