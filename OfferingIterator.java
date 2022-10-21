public class OfferingIterator implements ListIterator{

	OfferingList offeringList;
	int pos=0;

	public OfferingIterator(OfferingList offeringList) {
		this.offeringList=offeringList;
	}

	public boolean hasNext() {
		return pos < offeringList.size() && offeringList.get(pos) != null;
	}

	public Offering next() {
		Offering offering = offeringList.get(pos);
		pos+=1;
		return offering;
	}

	public void moveToHead() {
		pos = 0;
	}

}
