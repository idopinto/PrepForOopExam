package USScandidateSelection;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PopSort implements CadetSort {
	@Override
	public List<Cadet> sortCateds(List<Cadet> candidates) {
		return candidates.stream()                  				// Convert list to stream
				.sorted(Collections.reverseOrder    				// sort, in reverse order
						(Comparator.comparing(      				// using an on the fly generated comparator created using:
								cadet -> cadet.getClassMates().size()   // the classMates.size() method per cadet
						)))
				.collect(Collectors.toList());      				// and collect back to a list.
		
		/*  more elegant formatting:
		return candidates.stream()
				.sorted(Collections.reverseOrder(Comparator.comparing(cadet -> cadet.getClassMates().size())))
				.collect(Collectors.toList());
		*/
	}
}
