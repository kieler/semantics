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
import { KiCoolContribution} from './kicool-contribution'
import { BaseWidget, KeybindingContext,
    WidgetFactory, bindViewContribution, FrontendApplicationContribution, createTreeContainer, TreeWidget} from '@theia/core/lib/browser'
import { TextWidget } from './text-widget'
import '../../src/browser/style/index.css'
import { KiCoolKeybindingContext } from './kicool-keybinding-context'
import { CompilerWidget, KiCoolViewWidgetFactory } from './compiler-widget'
import { KiCoolViewService } from './kicool-view-service';

export default new ContainerModule((bind: interfaces.Bind, unbind: interfaces.Unbind, isBound: interfaces.IsBound, rebind: interfaces.Rebind) => {

    // widgets
    bind(TextWidget).toSelf()
    bind(BaseWidget).toDynamicValue(ctx => ctx.container.get(TextWidget))

    // added for keybinding and commands
    bind(KiCoolKeybindingContext).toSelf()
    bind(KeybindingContext).toDynamicValue(context => context.container.get(KiCoolKeybindingContext));

    bindViewContribution(bind, KiCoolContribution)
    bind(FrontendApplicationContribution).toService(KiCoolContribution);

    bind(KiCoolViewWidgetFactory).toFactory(ctx =>
        () => createKiCoolViewWidget(ctx.container)
    )
    bind(KiCoolViewService).toSelf().inSingletonScope();
    bind(WidgetFactory).toDynamicValue(context => context.container.get(KiCoolViewService));

})

function createKiCoolViewWidget(parent: interfaces.Container): CompilerWidget {
const child = createTreeContainer(parent);

child.unbind(TreeWidget);
child.bind(CompilerWidget).toSelf();

return child.get(CompilerWidget);
}