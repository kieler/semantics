/** @jsx svg */
import { svg } from 'snabbdom-jsx'
import { KStyle, KBackground, KForeground, KFontBold, KFontItalic, KFontName, KFontSize, KInvisibility,
    KHorizontalAlignment, KLineCap, KLineJoin, KLineStyle, KLineWidth, KRotation, KShadow, KTextStrikeout,
    KTextUnderline, KVerticalAlignment, HorizontalAlignment, LineCap, LineJoin, LineStyle,
    VerticalAlignment, KStyleRef, KColoring } from "./kgraph-models"
import { VNode } from "snabbdom/vnode"
import { toSVG } from "sprotty/lib"
import { isNullOrUndefined } from "util"
import { foregroundId, backgroundId, shadowId } from "./views-common"
// import * as snabbdom from 'snabbdom-jsx'
// const JSX = {createElement: snabbdom.svg}


export const K_COLORING = 'KColoringImpl'
export const K_BACKGROUND = 'KBackgroundImpl'
export const K_FOREGROUND = 'KForegroundImpl'
export const K_FONT_BOLD = 'KFontBoldImpl'
export const K_FONT_ITALIC = 'KFontItalicImpl'
export const K_FONT_NAME = 'KFontNameImpl'
export const K_FONT_SIZE = 'KFontSizeImpl'
export const K_HORIZONTAL_ALIGNMENT = 'KHorizontalAlignmentImpl'
export const K_INVISIBILITY = 'KInvisibilityImpl'
export const K_LINE_CAP = 'KLineCapImpl'
export const K_LINE_JOIN = 'KLineJoinImpl'
export const K_LINE_STYLE = 'KLineStyleImpl'
export const K_LINE_WIDTH = 'KLineWidthImpl'
export const K_ROTATION = 'KRotationImpl'
export const K_SHADOW = 'KShadowImpl'
export const K_STYLE_REF = 'KStyleRefImpl'
export const K_TEXT_STRIKEOUT = 'KTextStrikeoutImpl'
export const K_TEXT_UNDERLINE = 'KTextUnderlineImpl'
export const K_VERTICAL_ALIGNMENT = 'KVerticalAlignmentImpl'

// constants for string building
const GRADIENT_UNIT_OBJECT_BOUNDING_BOX = 'objectBoundingBox'
const GRADIENT_TRANSFORM_ROTATE_START = 'rotate('
const GRADIENT_TRANSFORM_ROTATE_END = ')'

/**
 * calculates the renderings for all styles contained in styleList into an object
 * @param styleList The list of all styles that should have their rendering calculated
 * @param parent the containing node of these styles
 */
export function getStyles(styleList: KStyle[], id: string): Styles { // TODO: not all of these are implemented yet
    let styles = new Styles
    if (isNullOrUndefined(styleList)) {
        return styles
    }
    for (let style of styleList) {
        if (style.selection === false) { // TODO: check if element is selected and decide from there
            switch (style.type) {
                case K_COLORING: {
                    console.error('A style can not be a ' + style.type + ' by itself, it needs to be a subclass of it.')
                    break
                }
                case K_BACKGROUND: {
                    styles.kBackground = style as KBackground
                    break
                }
                case K_FOREGROUND: {
                    styles.kForeground = style as KForeground
                    break
                }
                case K_FONT_BOLD: {
                    styles.kFontBold = style as KFontBold
                    break
                }
                case K_FONT_ITALIC: {
                    styles.kFontItalic = style as KFontItalic
                    break
                }
                case K_FONT_NAME: {
                    styles.kFontName = style as KFontName // TODO: have a deeper look at svg fonts
                    break
                }
                case K_FONT_SIZE: {
                    styles.kFontSize = style as KFontSize
                    break
                }
                case K_HORIZONTAL_ALIGNMENT: {
                    styles.kHorizontalAlignment = style as KHorizontalAlignment
                    break
                }
                case K_INVISIBILITY: {
                    styles.kInvisibility = style as KInvisibility
                    break
                }
                case K_LINE_CAP: {
                    styles.kLineCap = style as KLineCap
                    break
                }
                case K_LINE_JOIN: {
                    styles.kLineJoin = style as KLineJoin
                    break
                }
                case K_LINE_STYLE: {
                    styles.kLineStyle = style as KLineStyle
                    break
                }
                case K_LINE_WIDTH: {
                    styles.kLineWidth = style as KLineWidth
                    break
                }
                case K_ROTATION: {
                    console.error('The style ' + style.type + ' is not implemented yet.')
                    styles.kRotation = style as KRotation
                    break
                }
                case K_SHADOW: {
                    styles.kShadow = style as KShadow
                    break
                }
                case K_STYLE_REF: {
                    console.error('The style ' + style.type + ' is not implemented yet.')
                    // style as KStyleRef
                    // special case! TODO: how to handle this? Never seen this in any rendering
                    break
                }
                case K_TEXT_STRIKEOUT: {
                    console.error('The style ' + style.type + ' is not implemented yet.')
                    styles.kTextStrikeout = style as KTextStrikeout
                    break
                }
                case K_TEXT_UNDERLINE: {
                    console.error('The style ' + style.type + ' is not implemented yet.')
                    styles.kTextUnderline = style as KTextUnderline
                    break
                }
                case K_VERTICAL_ALIGNMENT: {
                    styles.kVerticalAlignment = style as KVerticalAlignment
                    break
                }
                default: {
                    console.error('Unexpected Style found while rendering: ' + style.type)
                    break
                }
            }
        }
    }
    return styles
}

/**
 * Default values for most Styles, that are used if no style is given Default values taken from PNodeController.java
 */
export const DEFAULT_FONT_BOLD = false
export const DEFAULT_FONT_ITALIC = false
export const DEFAULT_FONT_NAME = 'sans-serif' // TODO: on windows this is 'arial' (if server or if client is windows?)
export const DEFAULT_FONT_SIZE = 10
export const DEFAULT_HORIZONTAL_ALIGNMENT = HorizontalAlignment.CENTER
export const DEFAULT_INVISIBILITY = false
export const DEFAULT_LINE_CAP = LineCap.CAP_FLAT
export const DEFAULT_LINE_JOIN = LineJoin.JOIN_MITER
export const DEFAULT_MITER_LIMIT = 10
export const DEFAULT_LINE_STYLE = LineStyle.SOLID
export const DEFAULT_LINE_WIDTH = 1
export const DEFAULT_FILL = 'none'
export const DEFAULT_FOREGROUND = 'black'
export const DEFAULT_VERTICAL_ALIGNMENT = VerticalAlignment.CENTER
export const DEFAULT_SHADOW = undefined
export const DEFAULT_SHADOW_DEF = null
export const DEFAULT_CORNER_WIDTH = 0
export const DEFAULT_CORNER_HEIGHT = 0

/**
 * Data class to hold each possible style of any rendering. Defaults each style to null or its default value from PNodeController.java
 */
export class Styles { // TODO: some of these need to change to like KLineStyle instead of LineStyle
    kBackground: KBackground | null
    kForeground: KForeground | null
    kFontBold: KFontBold
    kFontItalic: KFontItalic
    kFontName: KFontName
    kFontSize: KFontSize
    kHorizontalAlignment: KHorizontalAlignment
    kInvisibility: KInvisibility | null
    kLineCap: KLineCap
    kLineJoin: KLineJoin
    kLineStyle: KLineStyle
    kLineWidth: KLineWidth
    kRotation: KRotation | null
    kShadow: KShadow | undefined
    kStyleRef: KStyleRef | null
    kTextStrikeout: KTextStrikeout | null
    kTextUnderline: KTextUnderline | null
    kVerticalAlignment: KVerticalAlignment
    constructor() {
        this.kBackground = null
        this.kForeground = null
        this.kFontBold = {
            bold: DEFAULT_FONT_BOLD
        } as KFontBold
        this.kFontItalic = {
            italic: DEFAULT_FONT_ITALIC
        } as KFontItalic
        this.kFontName = {
            name: DEFAULT_FONT_NAME
        } as KFontName
        this.kFontSize = {
            size: DEFAULT_FONT_SIZE,
            scaleWithZoom: false // TODO: implement this
        } as KFontSize
        this.kHorizontalAlignment = {
            horizontalAlignment: DEFAULT_HORIZONTAL_ALIGNMENT
        } as KHorizontalAlignment
        this.kInvisibility = {
            invisible: DEFAULT_INVISIBILITY
        } as KInvisibility
        this.kLineCap = {
            lineCap: DEFAULT_LINE_CAP
        } as KLineCap
        this.kLineJoin = {
            lineJoin: DEFAULT_LINE_JOIN,
            miterLimit: DEFAULT_MITER_LIMIT
        } as KLineJoin
        this.kLineStyle = {
            lineStyle: DEFAULT_LINE_STYLE,
            dashOffset: 0,
            dashPattern: [0]
        } as KLineStyle
        this.kLineWidth = {
            lineWidth: DEFAULT_LINE_WIDTH
        } as KLineWidth
        this.kRotation = null
        this.kShadow = DEFAULT_SHADOW
        this.kStyleRef = null
        this.kTextStrikeout = null
        this.kTextUnderline = null
        this.kVerticalAlignment = {
            verticalAlignment: DEFAULT_VERTICAL_ALIGNMENT
        }as KVerticalAlignment
    }
}

// ----------------------------- Functions for rendering different KStyles as VNodes in svg --------------------------------------------

export function gradientDef(style: KColoring, id: string): VNode {
    let startColorStop = <stop
        offset = {0}
        style = {{
            'stop-color': toSVG(style.color),
            'stop-opacity': (style.alpha / 255).toString()
        } as React.CSSProperties}
    />

    let stopColorStop = <g/>
    // TODO: does everything need to be defined to generate a gradient?
    if (!isNullOrUndefined(style.targetColor) && !isNullOrUndefined(style.targetAlpha) && !isNullOrUndefined(style.gradientAngle)) {
        stopColorStop = <stop
            offset = {1}
            style = {{
                'stop-color': toSVG(style.targetColor),
                'stop-opacity': (style.targetAlpha / 255).toString()
            } as React.CSSProperties}
        />
    }

    return <defs>
        <linearGradient
            id = {id}
            gradientUnits = {GRADIENT_UNIT_OBJECT_BOUNDING_BOX}
            gradientTransform = {GRADIENT_TRANSFORM_ROTATE_START + style.gradientAngle + GRADIENT_TRANSFORM_ROTATE_END}
            >
            {startColorStop}
            {stopColorStop}
        </linearGradient>
    </defs>
}

// foreground and background both define a color the same way
export function foreground(style: KForeground, id: string): VNode {
    return gradientDef(style, foregroundId(id))
}

export function background(style: KBackground, id: string): VNode {
    return gradientDef(style, backgroundId(id))
}

export function shadowDefinition(style: KShadow, id: string): VNode {
    // stdDev of 1 looks closest to KIELER style shadows, but looks nicer with this blur
    const STD_DEV = 1
    return <defs>
        <filter id = {shadowId(id)}>
            <feDropShadow
                dx = {style.xOffset / 4}
                dy = {style.yOffset / 4}
                stdDeviation = {STD_DEV}
            />
        </filter>
    </defs>
}