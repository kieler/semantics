import { injectable } from "inversify";
import { AbstractViewContribution } from '@theia/core/lib/browser/shell/view-contribution';
import { CompileWidget } from "./../widgets/compile-widget";

@injectable()
export class CompilerContribution extends AbstractViewContribution<CompileWidget> {

    constructor() {
        super({
            widgetId: "compile-widget",
            widgetName: 'Compiler',
            defaultWidgetOptions: {
                area: 'bottom'
            },
            toggleCommandId: 'compiler:toggle',
            toggleKeybinding: 'ctrlcmd+alt+c'
        });
    }

}