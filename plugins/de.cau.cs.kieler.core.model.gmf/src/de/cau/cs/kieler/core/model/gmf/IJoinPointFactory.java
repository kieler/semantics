/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.gmf;

import org.eclipse.draw2d.IFigure;

/**
 * 
 * Implementations of this interfaces allow a generation of a new join point decoration.
 * This is necessary because join points have an unspecified number of occurrences and hence
 * can't be prepared beforehand.
 * 
 * @author ckru
 *
 */
public interface IJoinPointFactory {

	/**
	 * Generate a new instance of a join point decoration figure.
	 * @return the join point decoration.
	 */
	IFigure getNewJoinPointDecorator();
	
}
