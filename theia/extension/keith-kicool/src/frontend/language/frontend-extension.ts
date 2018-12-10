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
import { CommandContribution } from '@theia/core/lib/common'
import { BaseWidget, KeybindingContext,
    WidgetFactory, bindViewContribution} from '@theia/core/lib/browser'
import { TextWidget } from '../widgets/text-widget'
import { KeithCommandContribution } from './keith-commands'
import '../../src/frontend/widgets/style/index.css'
import { Constants } from "keith-language/lib/frontend/utils"
import { KiCoolKeybindingContext } from './kicool-keybinding-context'
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

    // added for keybinding and commands
    bind(KiCoolKeybindingContext).toSelf()
    bind(KeybindingContext).toDynamicValue(context => context.container.get(KiCoolKeybindingContext));

    bindViewContribution(bind, KiCoolContribution)
})