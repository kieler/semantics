/*
 * Copyright (C) 2017 TypeFox and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 */
/** @jsx svg */
import { svg } from 'snabbdom-jsx'
import { RenderingContext, IView/*, setAttr*/ } from "sprotty/lib"
import { VNode } from "snabbdom/vnode"
import { KNode, KPort, KLabel, KEdge} from "./kgraph-models"
import { getRendering } from "./views-rendering"
// import * as snabbdom from 'snabbdom-jsx'
// const JSX = {createElement: snabbdom.svg}



export class KNodeView implements IView {
    render(node: KNode, context: RenderingContext): VNode {
        // reset this property, if the diagram is drawn a second time
        node.areChildrenRendered = false
        let rendering = getRendering(node.data, node, context as any) // TODO: 'as any' is not very nice, but KGraphRenderingContext cannot be used here (two undefined members)
        if (node.id === "$root") {
            // the root node should not be rendered, only its children should.
            return <g>
                {context.renderChildren(node)}
            </g>
        }
        if (rendering === null) {
            return <g>
                {context.renderChildren(node)}
            </g>
        }
        if (node.areChildrenRendered) {
            return <g>
                {rendering}
            </g>
        } else {
            // TODO: sometimes the children should be rendered, although there is no child area (kgt without explicit childArea)
            // and sometimes the children should not be rendered, when there is no child area (collapsed renderings of sct) (not tested yet)
            // how should that be handled?
            return <g>
                {rendering}
                {context.renderChildren(node)}
            </g>
        }
    }
}

export class KPortView implements IView {
    render(port: KPort, context: RenderingContext): VNode {
        port.areChildrenRendered = false
        let rendering = getRendering(port.data, port, context as any)
        if (rendering === null) {
            rendering = createDefaultPortRendering(port)
            return <g>
                {rendering}
                {context.renderChildren(port)}
            </g>
        }
        if (port.areChildrenRendered) {
            return <g>
                {rendering}
            </g>
        } else {
            return <g>
                {rendering}
                {context.renderChildren(port)}
            </g>
        }
    }
}

/**
 * This creates the default rendering of a port. This is a special case, because KPorts don't get a default rendering attached
 * during synthesis. Should be removed, once ports have their rendering attached and are not treated as a special case anymore.
 */
function createDefaultPortRendering(port: KPort): VNode {
    return <g>
        <rect
            x = {0}
            y = {0}
            width = {port.size.width}
            height = {port.size.height}
            stroke = 'black'
            fill = 'black'
        />
    </g>
}

export class KLabelView implements IView {
    render(label: KLabel, context: RenderingContext): VNode {
        label.areChildrenRendered = false
        let rendering = getRendering(label.data, label, context as any)
        if (rendering === null) {
            return <g>
                {context.renderChildren(label)}
            </g>
        }
        if (label.areChildrenRendered) {
            return <g>
                {rendering}
            </g>
        } else {
            return <g>
                {rendering}
                {context.renderChildren(label)}
            </g>
        }
    }
}

export class KEdgeView implements IView {
    render(edge: KEdge, context: RenderingContext): VNode {
        edge.areChildrenRendered = false
        let rendering = getRendering(edge.data, edge, context as any)
        if (rendering === null) {
            return <g>
                {context.renderChildren(edge)}
            </g>
        }
        if (edge.areChildrenRendered) {
            return <g>
                {rendering}
            </g>
        } else {
            return <g>
                {rendering}
                {context.renderChildren(edge)}
            </g>
        }
    }
}
