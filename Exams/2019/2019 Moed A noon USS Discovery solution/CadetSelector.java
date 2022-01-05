package USScandidateSelection;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CadetSelector implements CadetSelection {
	private final Set<String> qualifyingSkills; // = new HashSet<>(Arrays.asList("WD", "EPR", "DR", "AR"));
	private final int qualifyingHeight; // = 165;
	private final boolean greaterThan;
	
	public CadetSelector(Set<String> qualifyingSkills, int qualifyingHeight, boolean greaterThan){
		this.qualifyingHeight = qualifyingHeight;
		this.qualifyingSkills = qualifyingSkills;
		this.greaterThan = greaterThan;
	}
	@Override
	public List<Cadet> getCadets(List<Cadet> candidates) {
		return candidates.stream()												// convert to stream
				.filter(c -> c.getSkills().containsAll(qualifyingSkills))   	// filter by skills
				.filter(greaterThan ? 											// if this is a greater than filter:
						c -> c.getHeight() >= qualifyingHeight 				//filter using greater than.
						:														// else:
						c -> c.getHeight() <= qualifyingHeight)               // filter by less than.
				.collect(Collectors.toList());									// and collect back to list
	}
}
