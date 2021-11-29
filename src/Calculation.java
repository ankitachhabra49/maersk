/**
 * This class calculates the total amount of all units of all sku ids
 * @author ankita.chhabra
 *
 */
public class Calculation {

	/**
	 * This method calculates the total amount of all units of all sku ids
	 * @param unitsA
	 * @param unitsB
	 * @param unitsC
	 * @param unitsD
	 * @return total amount of all skuIds after applying promotions to all sku ids
	 */
	public int calculateAmount(int unitsA, int unitsB, int unitsC, int unitsD) {
		UnitPrices unitPrices=new UnitPrices(50, 30, 20, 15);
		PromotionalOffers prOffers = new PromotionalOffers();
		int amount = 0;
		amount = prOffers.applyPromotionsToA(unitPrices.getSkuA(), unitsA);
		amount = amount + prOffers.applyPromotionsToB(unitPrices.getSkuB(), unitsB);
		amount = amount + prOffers.applyPromotionsToCandD(unitPrices.getSkuC(), unitPrices.getSkuD(), unitsC, unitsD);
		return amount;
		
	}
}
