package USScandidateSelection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CadetSorter implements CadetSort {
	private Comparator<? super Cadet> mySortingFunc;
	
	public CadetSorter(Comparator<? super Cadet> mySortingFunc) {
		this.mySortingFunc = mySortingFunc;
		
	}
	
	@Override
	public List<Cadet> sortCateds(List<Cadet> candidates) {
		return candidates.stream()                  // Convert list to stream
				.sorted(mySortingFunc)				// sort by custom sorting functor
				.collect(Collectors.toList());      // and collect back to a list.
	}
}
