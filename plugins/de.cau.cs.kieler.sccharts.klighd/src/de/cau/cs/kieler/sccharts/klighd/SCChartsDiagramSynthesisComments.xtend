package de.cau.cs.kieler.sccharts.klighd

class SCChartsDiagramSynthesisComments {
	    public def KNode createCommentNode(CommentAnnotation commentAnnotation) {
        val node = commentAnnotation.createNode()
//        node.addLayoutParam(LayoutOptions::ALGORITHM, "de.cau.cs.kieler.graphviz.dot")
        node.setLayoutOption(LayoutOptions::SPACING, 1f);
//        node.setLayoutOption(Attributes::RANK, Rank::MIN)
        val commentText = commentAnnotation.values.head
        node.addRectangle() => [
            it.associateWith(commentAnnotation)
//            it.setSurroundingSpace(2, 2);
            it.invisible = false;
            it.foreground = "DarkGoldenrod".color
            it.background = "LemonChiffon".color
            it.lineWidth = 0.5f;
            it.addText(commentText).associateWith(commentAnnotation) => [
                if (USE_ADAPTIVEZOOM.booleanValue) it.lowerVisibilityScaleBound = 0.40f;
                it.foreground = "DarkGoldenrod".color
                it.invisible = false;
                it.fontSize = 10
                it.setPointPlacementData(createKPosition(LEFT, 4, 0, TOP, 4, 0), H_LEFT, V_TOP, 4, 4, 0, 0);
                it.suppressSelectability
            ];
        ];
        node    
    }
}