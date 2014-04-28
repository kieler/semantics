/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd;

import java.util.List;

/**
 * This is a Wrapper for a list of KiCoModelWrapper because KLighD does not support diagram
 * synthesis on Lists properly.
 * 
 * @author als
 * 
 */
public class KiCoModelChain {

    public List<KiCoModelWrapper> models;
}
