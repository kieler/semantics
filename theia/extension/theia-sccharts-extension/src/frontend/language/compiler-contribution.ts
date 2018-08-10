import { injectable } from "inversify";
import { AbstractViewContribution } from '@theia/core/lib/browser/shell/view-contribution';
import { CompileWidget } from "./../widgets/compile-widget";
import { Constants } from "../../common/constants";

@injectable()
export class CompilerContribution extends AbstractViewContribution<CompileWidget> {

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