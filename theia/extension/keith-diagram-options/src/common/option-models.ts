/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 *
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */

export interface SynthesisOption {
    name: string
    type: TransformationOptionType
    initialValue: any
    values: any[]
    currentValue: any
    category?: SynthesisOption
}

export interface RangeOption extends SynthesisOption {
    range: Range
    stepSize: number
}

export interface Range {
    first: number
    second: number
}

export enum TransformationOptionType {
    CHECK = 0,
    CHOICE = 1,
    RANGE = 2,
    SEPARATOR = 3,
    CATEGORY = 4
}