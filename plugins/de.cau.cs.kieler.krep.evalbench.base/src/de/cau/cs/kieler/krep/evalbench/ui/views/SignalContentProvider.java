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
//import org.eclipse.jface.viewers.IStructuredContentProvider;
//import org.eclipse.jface.viewers.Viewer;
//
//import de.cau.cs.kieler.krep.evalbench.comm.Signal;
//
///**
// * Content provider used for the embedded table viewer in the input and output views.
// * 
// * @author msp
// */
//public class SignalContentProvider implements IStructuredContentProvider {
//
//    /**
//     * {@inheritDoc}
//     * 
//     */
//    public Object[] getElements(final Object inputElement) {
//        if (inputElement instanceof Signal[]) {
//            return (Signal[]) inputElement;
//        } else {
//            return null;
//        }
//    }
//
//    /**
//     * {@inheritDoc}
//     * 
//     */
//    public void dispose() {
//        // Nothing to do
//    }
//
//    /**
//     * {@inheritDoc}
//     * 
//     */
//    public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
//        // Nothing to do
//    }
//
//}
