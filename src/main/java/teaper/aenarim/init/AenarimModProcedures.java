
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package teaper.aenarim.init;

import teaper.aenarim.procedures.FlintKnifeBlockDestroyedWithToolProcedure;
import teaper.aenarim.procedures.FlintHatchetItemIsCraftedProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class AenarimModProcedures {
	public static void load() {
		new FlintKnifeBlockDestroyedWithToolProcedure();
		new FlintHatchetItemIsCraftedProcedure();
	}
}
