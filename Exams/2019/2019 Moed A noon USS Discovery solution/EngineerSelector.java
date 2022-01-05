package USScandidateSelection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EngineerSelector implements CadetSelection {
	private final Set<String> qualifyingSkills = new HashSet<>(Arrays.asList("WD", "EPR", "DR", "AR"));
	private final int qualifyingHeight = 165;
	
	@Override
	public List<Cadet> getCadets(List<Cadet> candidates) {
		return candidates.stream()												// convert to stream
				.filter(c -> c.getSkills().containsAll(qualifyingSkills))   	// filter by skills
				.filter(c -> c.getHeight() >= qualifyingHeight)               // filter by height
				.collect(Collectors.toList());									// and collect back to list
	}
}
