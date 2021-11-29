/**
 * This is a DTO class containing list of all skus
 * @author ankita.chhabra
 *
 */

public class UnitPrices {

	private int skuA;
	private int skuB;
	private int skuC;
	private int skuD;
	public int getSkuA() {
		return skuA;
	}
	public void setSkuA(int skuA) {
		this.skuA = skuA;
	}
	public int getSkuB() {
		return skuB;
	}
	public void setSkuB(int skuB) {
		this.skuB = skuB;
	}
	public int getSkuC() {
		return skuC;
	}
	public void setSkuC(int skuC) {
		this.skuC = skuC;
	}
	public int getSkuD() {
		return skuD;
	}
	public void setSkuD(int skuD) {
		this.skuD = skuD;
	}
	public UnitPrices(int skuA, int skuB, int skuC, int skuD) {
		this.skuA = skuA;
		this.skuB = skuB;
		this.skuC = skuC;
		this.skuD = skuD;
	}
	
	
}
