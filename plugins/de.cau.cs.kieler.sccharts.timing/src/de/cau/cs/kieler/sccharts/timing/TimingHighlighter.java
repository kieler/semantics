/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.timing;

import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.Set;
import java.util.StringTokenizer;

import com.google.common.collect.HashMultimap;

import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KBackground;
import de.cau.cs.kieler.klighd.krendering.KLineWidth;
import de.cau.cs.kieler.klighd.krendering.KRectangle;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.KText;
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.timing.TimingAnalysis.TimingValueRepresentation;

/**
 * Provides methods to highlight model parts according to timing related information. 
 * @author ima
 *
 */
public class TimingHighlighter {
	
	private KRenderingFactory renderingFactory;
	
	public TimingHighlighter(KRenderingFactory renderingFactory) {
		this.renderingFactory = renderingFactory;
	}

	/**
	 * The method highlightRegion adds red background color to the display of a
	 * region. In this the darkness of the red color increases with increased
	 * the higher the percentage of overall WCET that is attributed to this
	 * region.
	 * 
	 * @param region
	 *            The region to be highlighted.
	 * @param renderingFactory
	 *            A renderingFactory
	 * @param percentage
	 *            The percentage of the region's fractional WCET in relation to
	 *            overall WCET
	 * @param labels
	 *            The set with the timing labels of the regions of the model
	 * @param regionRectangles 
	 *            The mapping that says which region belongs to which rectangle.
	 */
	public void highlightRegion(Region region, int percentage,
			Set<WeakReference<KText>> labels,HashMultimap<Region, 
			WeakReference<KRectangle>> regionRectangles, KRenderingExtensions renderingExtensions) {
		Set<WeakReference<KRectangle>> rectangleRefs = regionRectangles.get(region);
		for (WeakReference<KRectangle> rectangleRef : rectangleRefs) {
			KRectangle regionRectangle = rectangleRef.get();
			KRectangle inner = KRenderingFactory.eINSTANCE.createKRectangle();
			regionRectangle.getChildren().add(0, inner);
			if (percentage > 50) {
				regionRectangle.getStyles().add(renderingFactory.createKForeground()
						.setColor(Colors.RED));
			}
			KBackground background = renderingFactory.createKBackground();
			// in casting percentage, all percentages below zero will be set to
			// 0, thus they will
			// not be marked as hot spots
			int alpha = (int) percentage;
			background.setAlpha(alpha);
			inner.getStyles().add(background.setColor(Colors.RED));
			if (percentage > 50) {
				final KLineWidth lwStyle = KRenderingFactory.eINSTANCE.createKLineWidth();
				lwStyle.setLineWidth(3);
				regionRectangle.getStyles().add(lwStyle);
				// the red numbers on red ground will not be readable well, so
				// change them to black
				for (WeakReference<KText> labelRef : labels) {
					KText label = labelRef.get();
					renderingExtensions.setForegroundColor(label, 0, 0, 0);
				}
			}
		}
	}
	
	/**
	 * The method adapts the timing representation, if it is not in the default
	 * case
	 * 
	 * @param rep
	 *            The timing representation chosen by the user
	 * @param timingResult
	 *            The timing Result, which has one of the formats
	 *            "<number> / <number>" or <number>
	 * @param overallWCET
	 *            The overall WCET needed to calculate percentages
	 */
	public String adaptTimingRepresentation(int megaHertz, int digits, TimingValueRepresentation rep, 
			String timingResult, BigInteger overallWCET) {
		String newTimingResult = "";
        StringTokenizer StringTokenizer = new StringTokenizer(timingResult);
        // If we represent in percentage, the overall timing value should stay
        // untouched, in that
        // case and only that case the String consists of only one number
        if (StringTokenizer.countTokens() > 1) {
            if (rep == TimingValueRepresentation.PERCENT) {
                double overallWCETDouble = overallWCET.doubleValue();
                // if value is small enough, calculate in double
                if ((overallWCETDouble != Double.NEGATIVE_INFINITY)
                        && (overallWCETDouble != Double.POSITIVE_INFINITY)) {
                    double onePercent = overallWCETDouble / 100.0;
                    double firstNumber = Double.parseDouble(StringTokenizer.nextToken());
                    StringTokenizer.nextToken();
                    double secondNumber = Double.parseDouble(StringTokenizer.nextToken());
                    double firstNumberPercent = firstNumber / onePercent;
                    double secondNumberPercent = secondNumber / onePercent;
                    int firstNumberPercentInt = (int)firstNumberPercent;
                    int secondNumberPercentInt = (int)secondNumberPercent;
                    newTimingResult = firstNumberPercentInt + " / " + secondNumberPercentInt;
                } else {
                    BigInteger onePercent = overallWCET.divide(new BigInteger("100"));
                    BigInteger FirstNumber = new BigInteger(StringTokenizer.nextToken());
                    StringTokenizer.nextToken();
                    BigInteger SecondNumber = new BigInteger(StringTokenizer.nextToken());
                    FirstNumber = (FirstNumber.divide(onePercent));
                    SecondNumber = (SecondNumber.divide(onePercent));
                    newTimingResult = FirstNumber.toString() + " / " + SecondNumber.toString();
                }
            }
        } else {
			if (rep == TimingValueRepresentation.PERCENT) {
				newTimingResult = "100";
			}
		}
		if (rep == TimingValueRepresentation.MILLISECONDS) {
			while (StringTokenizer.hasMoreTokens()) {
				String token = StringTokenizer.nextToken();
				if (!token.equals("/")) {
					double cycles = Double.parseDouble(token);
					double timeInMillisecs = (cycles / (megaHertz * 1000.0));
					newTimingResult += (String.format("%." + digits + "f", timeInMillisecs));
				} else {
					newTimingResult += (" " + token + " ");
				}
			}
		}
		return newTimingResult;
	};
	
}
