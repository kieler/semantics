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
package de.cau.cs.kieler.sccharts.extensions

/**
 * @author ssm
 * @kieler.design 2017-10-24 proposed ssm
 * @kieler.rating 2017-10-24 proposed yellow
 *
 */
enum TextFormat { 
    KEYWORD, HIGHLIGHT, TEXT, CONTENT_PLACEHOLDER, SCHEDULE, 
    BREAK // Special format option to create a new row (will ignore actual text)
}