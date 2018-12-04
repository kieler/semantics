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

import { ContainerModule, interfaces } from 'inversify'
import { KeithContribution} from './keith-contribution'
import { CommandContribution } from '@theia/core/lib/common'
// import { DiagramConfiguration } from 'theia-sprotty/lib'
// import { KeithDiagramConfiguration } from '../keithdiagram/di.config'
// import { DiagramManager, DiagramManagerProvider } from 'theia-sprotty/lib'
// import { KeithDiagramManager } from '../keithdiagram/keith-diagram-manager'
import { BaseWidget, KeybindingContext/*, FrontendApplicationContribution, OpenHandler*/,
    WidgetFactory, bindViewContribution/*, createTreeContainer, TreeWidget */} from '@theia/core/lib/browser'
import { TextWidget } from '../widgets/text-widget'
import { KeithCommandContribution } from './keith-commands'
import '../../src/frontend/widgets/style/index.css'
import { Constants } from "keith-language-extension/lib/frontend/utils"
// import 'sprotty/css/sprotty.css'
// import 'theia-sprotty/css/theia-sprotty.css'
// import { ThemeManager } from '../keithdiagram/theme-manager'
// import { DiagramOptionsViewWidgetFactory, DiagramOptionsViewWidget } from '../diagramoptions/diagramoptions-view-widget'
// import { DiagramOptionsViewService } from '../diagramoptions/diagramoptions-view-service'
// import { DiagramOptionsViewContribution } from '../diagramoptions/diagramoptions-view-contribution'
import { KeithKeybindingContext } from './keith-keybinding-context'
import { CompilerWidget } from '../widgets/compiler-widget'

export default new ContainerModule((bind: interfaces.Bind, unbind: interfaces.Unbind, isBound: interfaces.IsBound, rebind: interfaces.Rebind) => {

    // widgets
    bind(TextWidget).toSelf()
    bind(BaseWidget).toDynamicValue(ctx => ctx.container.get(TextWidget))
    bind(CompilerWidget).toSelf()
    bind(WidgetFactory).toDynamicValue(context => ({
        id: Constants.compilerWidgetId,
        area: "bottom",
        createWidget: () => context.container.get<CompilerWidget>(CompilerWidget)
    })).inSingletonScope()

    bind(CommandContribution).to(KeithCommandContribution)

    // // diagram
    // bind(DiagramConfiguration).to(KeithDiagramConfiguration).inSingletonScope()
    // bind(DiagramManagerProvider).toProvider<DiagramManager>(context => {
    //     return () => {
    //         return new Promise<DiagramManager>((resolve) =>
    //             resolve(context.container.get(KeithDiagramManager))
    //         )
    //     }
    // }).whenTargetNamed('keith-diagram')
    // bind(KeithDiagramManager).toSelf().inSingletonScope()
    // bind(FrontendApplicationContribution).toDynamicValue(context => context.container.get(KeithDiagramManager))
    // bind(OpenHandler).toDynamicValue(context => context.container.get(KeithDiagramManager))

    // bind(ThemeManager).toSelf().inSingletonScope()

    // // Diagram options bindings
    // bindViewContribution(bind, DiagramOptionsViewContribution);
    // bind(FrontendApplicationContribution).toService(DiagramOptionsViewContribution);

    // bind(DiagramOptionsViewWidgetFactory).toFactory(ctx =>
    //     () => createDiagramOptionsViewWidget(ctx.container)
    // )

    // bind(DiagramOptionsViewService).toSelf().inSingletonScope();
    // bind(WidgetFactory).toDynamicValue(context => context.container.get(DiagramOptionsViewService));

    // added for keybinding and commands
    bind(KeithKeybindingContext).toSelf()
    bind(KeybindingContext).toDynamicValue(context => context.container.get(KeithKeybindingContext));

    bindViewContribution(bind, KeithContribution)
})


// function createDiagramOptionsViewWidget(parent: interfaces.Container): DiagramOptionsViewWidget {
//     const child = createTreeContainer(parent);

//     child.unbind(TreeWidget);
//     child.bind(DiagramOptionsViewWidget).toSelf();

//     return child.get(DiagramOptionsViewWidget);
// }