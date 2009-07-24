/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.ui;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;

public class ImageBlender {

	public static Image CombineImage(Image image1, Image image2) {
		Image returnImage = new Image(image2.getDevice(),
				new Rectangle(0, 0, 32, 16));
		GC gc = new GC(returnImage);
		gc.drawImage(image2, 0, 0);
		gc.drawImage(image2, 16, 0);
		gc.dispose();
		return returnImage;
	}
	
}
