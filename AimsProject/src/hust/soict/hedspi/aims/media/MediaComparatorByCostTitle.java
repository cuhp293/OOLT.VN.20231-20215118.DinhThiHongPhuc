package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		// By cost
		int costCompare = Float.compare(o2.getCost(), o1.getCost()); // return 0 when equal
        if (costCompare != 0) {
            return costCompare;
        } else
        	return o1.getTitle().compareTo(o2.getTitle()); // By title
	}

}
