package com.larvalabs.svgandroid.util.constants;

/**
 * @author Nicolas Gramlich
 * @since 12:13:38 - 24.05.2011
 */
public class MathUtils {
	// ===========================================================
	// Constants
	// ===========================================================

	public static final double[] POWERS_OF_10 = new double[128];
	static {
		for (int i = 0; i < POWERS_OF_10.length; i++) {
			POWERS_OF_10[i] = Math.pow(10, i);
		}
	}

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

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}