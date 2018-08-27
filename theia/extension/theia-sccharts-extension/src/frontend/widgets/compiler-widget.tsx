import { ReactWidget } from "@theia/core/lib/browser/widgets/react-widget";
import { injectable, LazyServiceIdentifer, inject } from "inversify";
import { Message, StatefulWidget } from "@theia/core/lib/browser";
import * as React from "react";
import { Constants, CompilerConfiguration, CompilationSystems } from "../../common/util";

import "../../../src/frontend/widgets/style/compiler-widget.css";
import "../../../src/frontend/widgets/style/index.css";
import { KeithContribution } from "../language/keith-contribution";

@injectable()
export class CompilerWidget extends ReactWidget implements StatefulWidget {
    
    systems : CompilationSystems[]
    configuration : CompilerConfiguration
    // TODO send LS values on startup with selection items or save them in preferences?
    
    storeState(): object {
        throw new Error("Method not implemented.");
    }
    restoreState(oldState: object): void {
        throw new Error("Method not implemented.");
    }
    render(): React.ReactNode {
        const compilationElements: React.ReactNode[] = [];
        this.systems.forEach(system => {
            compilationElements.push(<option value={system.id} key={system.id}>{system.label}</option>);
        });
        return <React.Fragment>
            <div id="compilation-panel">
                {this.renderCompileButton()}
                <select id='compilation-list'>
                    {compilationElements}
                </select>
                {this.renderPrivateButton()}
                {this.renderInplaceButton()}
                {this.renderTracingButton()}
                {this.renderDebugEnvButton()}
                {this.renderDevButton()}
                {this.renderFlattenSystemViewButton()}
                {this.renderForwardResultButton()}
                {this.renderVisualLayoutButton()}
                {this.renderAutoCompileButton()}
            </div>
            {this.renderShowButtons()}
        </React.Fragment>
    }
    constructor(
        @inject(new LazyServiceIdentifer(() => KeithContribution)) protected readonly commands: KeithContribution
    ) {
        super();
        this.id = Constants.compilerWidgetId
        this.title.label = 'Compile'
        this.title.iconClass = 'fa fa-play-circle';
        this.title.closable = true
        this.addClass(Constants.compilerWidgetId) // class for index.css
        this.configuration = {
            isCheckedAutoCompileToggle : false,
            isCheckedCompileInplaceToggle : false,
            isCheckedCompileTracingToggle : false,
            isCheckedDebugEnvironmentModelsToggle : false,
            isCheckedDeveloperToggle : false,
            isCheckedFlattenSystemViewToggle : false,
            isCheckedForwardResultToggle : false,
            isCheckedShowPrivateSystemsToggle : false,
            isCheckedVisualLayoutFeedbackToggle : false

        }
        this.systems = [{id : "NONE", label : "NONE"}]
        this.node.draggable = false
        this.setHidden(true)
    }

    onActivateRequest(msg: Message): void {
        super.onActivateRequest(msg);
        this.setHidden(false)
        this.update()
    }

    renderShowButtons(): React.ReactNode {

        const showButtons: React.ReactNode[] = [];
        var uri = this.commands.getStringUriOfCurrentEditor()
        if (!uri) {
            return
        }
        var snapshots = this.commands.resultMap.get(uri)
        if (!snapshots) {
            return
        }
        snapshots.files.forEach((snapshot, index) => {

            showButtons.push(
                <div key={index} id={"showButton" + (index < 10 ? "0" + index : index)} className={'show-button'.concat((snapshot.errors.length > 0) ? ' error' : 
                    (snapshot.warnings.length > 0) ? ' warn' : (snapshot.infos.length > 0 ) ? ' info' : '')}
                    title={snapshot.name}
                    onClick={event => {
                        if (!uri) {
                            return
                        }
                        this.commands.show(uri.toString(), index)
                    }}>
                    {snapshot.snapshotIndex == 0 ? snapshot.name : ""}
                </div >
            )
        });
        return <div id="showButtonContainer0" className='buttonContainer'>
            {showButtons}
        </div>
    }

    renderCompileButton(): React.ReactNode {
        return <div id='compile-button' title="Compile"
            onClick={event => {
                this.compileSelectedCompilationSystem()
            }}>
            <div className='fa fa-play-circle'> </div>
        </div>
    }
    
    renderPrivateButton(): React.ReactNode {
        return <div title="Show private Systems" key="private-button" id='compile-button'
            onClick={event => {
                this.commands.updatePreferences(!this.configuration.isCheckedShowPrivateSystemsToggle, "private", true).then(() => {
                    this.update()
                })
            }}>
            <div className={this.configuration.isCheckedShowPrivateSystemsToggle ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }
    
    renderInplaceButton(): React.ReactNode {
        return <div title="Inplace" key="inplace-button" id='compile-button'
            onClick={event => {
                this.commands.updatePreferences(!this.configuration.isCheckedCompileInplaceToggle, "inplace", true).then(() => {
                    this.update()
                })
            }}>
            <div className={this.configuration.isCheckedCompileInplaceToggle ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }
    
    renderTracingButton(): React.ReactNode {
        return <div title="Tracing" key="tracing-button" id='compile-button'
            onClick={event => {
                this.commands.updatePreferences(!this.configuration.isCheckedCompileTracingToggle, "tracing", true).then(() => {
                    this.update()
                })
            }}>
            <div className={this.configuration.isCheckedCompileTracingToggle ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }
    
    renderDebugEnvButton(): React.ReactNode {
        return <div title="Debug environment models" key="debug-env-button" id='compile-button'
            onClick={event => {
                this.commands.updatePreferences(!this.configuration.isCheckedDebugEnvironmentModelsToggle, "debug-env", true).then(() => {
                    this.update()
                })
            }}>
            <div className={this.configuration.isCheckedDebugEnvironmentModelsToggle ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }
    
    renderDevButton(): React.ReactNode {
        return <div title="Developer" key="developer-button" id='compile-button'
            onClick={event => {
                this.commands.updatePreferences(!this.configuration.isCheckedDeveloperToggle, "developer", true).then(() => {
                    this.update()
                })
            }}>
            <div className={this.configuration.isCheckedDeveloperToggle ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }
    
    renderFlattenSystemViewButton(): React.ReactNode {
        return <div title="Flatten system view" key="flatten-system-button" id='compile-button'
            onClick={event => {
                this.commands.updatePreferences(!this.configuration.isCheckedFlattenSystemViewToggle, "flatten-system", true).then(() => {
                    this.update()
                })
            }}>
            <div className={this.configuration.isCheckedFlattenSystemViewToggle ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }
    
    renderForwardResultButton(): React.ReactNode {
        return <div title="Forward result" key="forward-result-button" id='compile-button'
            onClick={event => {
                this.commands.updatePreferences(!this.configuration.isCheckedForwardResultToggle, "forward-result", true).then(() => {
                    this.update()
                })
            }}>
            <div className={this.configuration.isCheckedForwardResultToggle ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }
    
    renderVisualLayoutButton(): React.ReactNode {
        return <div title="Visual Layout" key="visual-layout-button" id='compile-button'
            onClick={event => {
                this.commands.updatePreferences(!this.configuration.isCheckedVisualLayoutFeedbackToggle, "visual-layout", true).then(() => {
                    this.update()
                })
            }}>
            <div className={this.configuration.isCheckedVisualLayoutFeedbackToggle ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }
    
    renderAutoCompileButton(): React.ReactNode {
        return <div title="Auto compile" key="auto-compile-button" id='compile-button'
            onClick={event => {
                this.configuration.isCheckedAutoCompileToggle = !this.configuration.isCheckedAutoCompileToggle
                this.commands.shouldAutoCompile = this.configuration.isCheckedAutoCompileToggle
            }}>
            <div className={this.configuration.isCheckedAutoCompileToggle ? 'fa fa-toggle-on' : 'fa fa-toggle-off'}> </div>
        </div>
    }

    onUpdateRequest(msg: Message): void {
        this.commands.requestSystemDescribtions().then(() => {
            super.onUpdateRequest(msg)
            this.render()
        })
    }

    onCloseRequest(msg: Message): void {
        super.onCloseRequest(msg)
        this.setHidden(true)
    }

    public compileSelectedCompilationSystem(): void {
        var selection = document.getElementById("compilation-list") as HTMLSelectElement;
        if (this.systems.length > 0) {
            this.commands.compile(this.systems[selection.selectedIndex].id)
        } else {
            this.commands.compile("")
        }
    }
}