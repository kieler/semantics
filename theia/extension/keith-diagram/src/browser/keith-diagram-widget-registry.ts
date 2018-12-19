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

import { injectable } from "inversify";
import { DiagramWidgetRegistry/*, DiagramWidget*/ } from "theia-sprotty/lib";
import URI from "@theia/core/lib/common/uri";

const DIAGRAM: string = "keith#"

 @injectable()
 export class KeithDiagramWidgetRegistry extends DiagramWidgetRegistry {
    protected getKey(uri: URI, diagramType: string) {
        // The widget's ID is now only dependent on the diagram type
        return DIAGRAM + diagramType
    }

    public id(): string {
        return 'widget-diagram'
    }
 }
