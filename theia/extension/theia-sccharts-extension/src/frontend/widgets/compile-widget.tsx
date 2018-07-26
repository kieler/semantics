import { ReactWidget } from "@theia/core/lib/browser/widgets/react-widget";
import { injectable} from "inversify";
import { Message } from "@theia/core/lib/browser";
import * as React from "react";
import { Constants } from "../../common/constants";

import "../../../src/frontend/widgets/style/compiler-widget.css";
import { SCChartsCommandContribution } from "../language/sccharts-commands";

@injectable()
export class CompileWidget extends ReactWidget {

    protected render(): React.ReactNode {
        const compilationElements: React.ReactNode[] = [];
        Constants.compilations.forEach(compilation => {
            compilationElements.push(<option value={compilation.id} key={compilation.id}>{compilation.name}</option>);
        });
        if (compilationElements.length === 0) {
            compilationElements.push(<option key="NONE" value="NONE">NONE</option>);
        }
        return <React.Fragment>
            {this.renderCompileButton()}
            <select id='compilation-list'>
                {compilationElements}
            </select>
            {this.renderShowButton()}
        </React.Fragment>
    
    }
    constructor(
        protected readonly commands: SCChartsCommandContribution
    ) {
        super();
        this.id = 'compiler-widget'
        this.title.label = 'Compile'
        this.title.iconClass = 'fa fa-play-circle';
        this.title.closable = true
        this.addClass('compiler-widget') // class for index.css
    }

    onActivateRequest(msg: Message): void {
        super.onActivateRequest(msg);
        this.node.focus()
        this.update()
    }

    renderShowButton(): React.ReactNode {

        const showButtons: React.ReactNode[] = [];
        var editor = this.commands.editorManager.currentEditor
        if (!editor) {
            return
        }
        var uri = editor.getTargetUri()
        if (!uri) {
            return
        }
        var snapshots = this.commands.resultMap.get(uri.toString())
        if (!snapshots) {
            return
        }
        snapshots.files.forEach((textDocument, index) => {

            showButtons.push(
                <div id={"showButton" + (index < 10? "0" + index : index)} className='show-button.up show-button'
                title = {textDocument.key} 
                onClick={event => {
                    console.log(("showButton" + index).toString())
                    var classList = (document.getElementById(("showButton" + (index < 10? "0" + index : index)).toString()) as HTMLDivElement).classList
                    if (classList.contains("show-button.up")) {
                        classList.remove("show-button.up")
                        classList.add("show-button.down")
                    } else {
                        classList.remove("show-button.down")
                        classList.add("show-button.up")
                    }

                    if (!uri) {
                        return
                    }
                    this.commands.show(uri.toString(), index)
                }}>
            </div >
            )
        });
        return  <div id="showButtonContainer0" className='buttonContainer flexcontainer'> 
            {showButtons}
        </div>
    }

    onUpdateRequest(msg : Message) {
        this.commands.message("Updating", "info")
        super.onUpdateRequest(msg)
    }

    renderCompileButton() : React.ReactNode {
        return <div id='buttonContainer' className='buttonContainer flexcontainer'> 
            <div id='compileButton' className='compile-button showButton'
                onClick={event => {
                    var selection = document.getElementById("compilation-list") as HTMLSelectElement;
                    this.commands.compile(Constants.compilations[selection.selectedIndex].id).then((bool) => {
                        console.log("returned with " + bool)
                        this.update()
                    })
                }}>
                <div className='fa fa-play-circle'></div>
            </div >
        </div> 
    }
}