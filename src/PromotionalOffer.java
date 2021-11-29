/**
 * This is an interface containing 
 * list of all promotional offers to be applied.
 * @author ankita.chhabra
 *
 */
@FunctionalInterface
public interface PromotionalOffer {

	/**
	 * This method verifies if there are three units of A then it will return 130
	 * @return 130 amount
	 */
	public default int threeAs() {
		return 130;
	}
	
	/**
	 * This method verifies if there are two units of B then it will return 45
	 * @return 45 amount
	 */
	public default int twoBs() {
		return 45;
	}
	
	/**
	 * This method verifies if there is a combination of equal units of C and D, then it will combine to make an amount of 30.
	 * @return 30 amount
	 */
	public default int combineCandD() {
		return 30;
	}
	
	/**
	 * If there is any active coupon code to be applied then its can be added in this method.
	 */
	public void addMoreCoupons();
	
}
