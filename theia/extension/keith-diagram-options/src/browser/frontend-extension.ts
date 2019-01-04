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

import { ContainerModule, interfaces } from "inversify"
import { bindViewContribution, FrontendApplicationContribution, WidgetFactory } from "@theia/core/lib/browser"
import { DiagramOptionsViewContribution } from "./diagramoptions-view-contribution"
import { DiagramOptionsViewWidget } from "./diagramoptions-view-widget"

export default new ContainerModule((bind: interfaces.Bind) => {
    bindViewContribution(bind, DiagramOptionsViewContribution);
    bind(FrontendApplicationContribution).toService(DiagramOptionsViewContribution);

    bind(WidgetFactory).toDynamicValue(ctx => ({
        id: "diagramoptions-view",
        createWidget: () => ctx.container.get(DiagramOptionsViewWidget)
    }))
    bind(DiagramOptionsViewWidget).toSelf()
})