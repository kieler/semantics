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
import { DiagramWidgetOptions, DiagramWidget } from "theia-sprotty/lib";
import URI from "@theia/core/lib/common/uri";
import { ModelSource } from "sprotty/lib";

export type KeithDiagramWidgetFactory = (options: DiagramWidgetOptions) => KeithDiagramWidget
export const KeithDiagramWidgetFactory = Symbol('KeithDiagramWidgetFactory')

export class KeithDiagramWidget extends DiagramWidget {
    public currentUri: URI
    public currentModelSource: ModelSource

    constructor(options: DiagramWidgetOptions) {
        super(options)
    }
}