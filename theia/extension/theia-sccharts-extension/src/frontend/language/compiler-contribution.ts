import { injectable } from "inversify";
import { AbstractViewContribution } from '@theia/core/lib/browser/shell/view-contribution';
import { CompilerWidget } from "./../widgets/compiler-widget";
import { Constants } from "../../common/util";

@injectable()
export class CompilerContribution extends AbstractViewContribution<CompilerWidget> {

    constructor() {
        super({
            widgetId: Constants.compilerWidgetId,
            widgetName: 'Compiler',
            defaultWidgetOptions: {
                area: 'bottom'
            },
            toggleCommandId: 'compiler:toggle',
            toggleKeybinding: Constants.OPEN_COMPILER_WIDGET_KEYBINDING
        });
    }
}