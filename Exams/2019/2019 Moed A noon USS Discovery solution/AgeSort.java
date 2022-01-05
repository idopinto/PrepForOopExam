package USScandidateSelection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AgeSort implements CadetSort {
	@Override
	public List<Cadet> sortCateds(List<Cadet> candidates) {
		return candidates.stream()												// convert to stream
				.sorted(Comparator.comparing(Cadet::getAge).reversed())			// sort using a reversed comparator
				.collect(Collectors.toList());									// and collect back to a list.
	}
}
