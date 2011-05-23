package com.larvalabs.svgandroid.util;

import org.xml.sax.Attributes;

import com.larvalabs.svgandroid.SVGParser;
import com.larvalabs.svgandroid.gradient.Gradient;
import com.larvalabs.svgandroid.gradient.LinearGradient;
import com.larvalabs.svgandroid.gradient.RadialGradient;

import android.graphics.Matrix;

/**
 * @author Nicolas Gramlich
 * @since 23:35:48 - 22.05.2011
 */
public class GradientParser {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public static Gradient parse(final Attributes pAttributes, final boolean pLinear) {
		final String id = SAXHelper.getStringAttribute(pAttributes, "id");
		if(id == null) {
			return null;
		}
		final Matrix matrix = TransformParser.parseTransform(SAXHelper.getStringAttribute(pAttributes, "gradientTransform"));
		String xlink = SAXHelper.getStringAttribute(pAttributes, "href");
		if (xlink != null) {
			if (xlink.startsWith("#")) {
				xlink = xlink.substring(1);
			}
		}

		if (pLinear) {
			final float x1 = SVGParser.getFloatAttribute(pAttributes, "x1", 0f);
			final float x2 = SVGParser.getFloatAttribute(pAttributes, "x2", 0f);
			final float y1 = SVGParser.getFloatAttribute(pAttributes, "y1", 0f);
			final float y2 = SVGParser.getFloatAttribute(pAttributes, "y2", 0f);
			return new LinearGradient(id, x1, x2, y1, y2, matrix, xlink);
		} else {
			final float centerX = SVGParser.getFloatAttribute(pAttributes, "cx", 0f);
			final float centerY = SVGParser.getFloatAttribute(pAttributes, "cy", 0f);
			final float radius = SVGParser.getFloatAttribute(pAttributes, "r", 0f);
			return new RadialGradient(id, centerX, centerY, radius, matrix, xlink);
		}
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}