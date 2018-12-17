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
import { bindViewContribution, FrontendApplicationContribution, WidgetFactory, createTreeContainer, TreeWidget } from "@theia/core/lib/browser"
import { DiagramOptionsViewContribution } from "./diagramoptions-view-contribution"
import { DiagramOptionsViewWidgetFactory, DiagramOptionsViewWidget } from "./diagramoptions-view-widget"
import { DiagramOptionsViewService } from "./diagramoptions-view-service"

export default new ContainerModule((bind: interfaces.Bind) => {
    bindViewContribution(bind, DiagramOptionsViewContribution);
    bind(FrontendApplicationContribution).toService(DiagramOptionsViewContribution);

    bind(DiagramOptionsViewWidgetFactory).toFactory(ctx =>
        () => createDiagramOptionsViewWidget(ctx.container)
    )

    bind(DiagramOptionsViewService).toSelf().inSingletonScope();
    bind(WidgetFactory).toDynamicValue(context => context.container.get(DiagramOptionsViewService));
})

function createDiagramOptionsViewWidget(parent: interfaces.Container): DiagramOptionsViewWidget {
    const child = createTreeContainer(parent);

    child.unbind(TreeWidget);
    child.bind(DiagramOptionsViewWidget).toSelf();

    return child.get(DiagramOptionsViewWidget);
}