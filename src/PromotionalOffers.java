
public class PromotionalOffers implements PromotionalOffer{
	

	@Override
	public void addMoreCoupons() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * This method calculates the total amount of A after applying promotional offers to units of A
	 * @param unitPriceA
	 * @param unitsA
	 * @return total amount of all units of A
	 */
	public int applyPromotionsToA(int unitPriceA, int unitsA) {
		if(unitsA==3) {
			return this.threeAs();
		}
		else if(unitsA>3) {
			int quotient = unitsA/3;
			int remainder = unitsA%3;
			return quotient*this.threeAs()+remainder*unitPriceA;
		}
		else {
			return unitPriceA*unitsA;
		}
	}
	
	/**
	 * This method calculates the total amount of B after applying promotional offers to units of B
	 * @param unitPriceB
	 * @param unitsB
	 * @return total amount of all units of B
	 */
	public int applyPromotionsToB(int unitPriceB, int unitsB) {
		if(unitsB<2) {
			return unitPriceB*unitsB;
		}
		else if(unitsB==2) {
			return this.twoBs();
		}
		else {
			int quotient = unitsB/2;
			int remainder = unitsB%2;
			return quotient*this.twoBs()+remainder*unitPriceB;
		}
	}
	
	/**
	 * This method calculates the total amount of C and D after applying promotional offers to units of C and D
	 * @param unitPriceC
	 * @param unitPriceD
	 * @param unitsC
	 * @param unitsD
	 * @return total amount of all units of C and D
	 */
	public int applyPromotionsToCandD(int unitPriceC, int unitPriceD, int unitsC, int unitsD) {
		if(unitsC>0 && unitsD >0 && unitsC==unitsD) {
			return unitsC*this.combineCandD();
		}
		else if(unitsC>0 && unitsD >0 && unitsC>unitsD) {
			int remainder = unitPriceC-unitPriceD;
			return unitsD*this.combineCandD()+remainder*unitPriceC;
		}
		else if(unitsC>0 && unitsD >0 && unitsD>unitsC) {
			int remainder = unitPriceD-unitPriceC;
			return unitsC*this.combineCandD()+remainder*unitPriceD;
		}
		else {
			return unitsC*unitPriceC+unitsD*unitPriceD;
		}
	}

}
