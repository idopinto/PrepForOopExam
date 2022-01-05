
import java.util.*;
import USScandidateSelection.*;

public class MainClass {

	public static void main(String[] args) {

		List<Cadet> cadets = teleportCadets();
		List<Cadet> futureEngineers = getMyFutureEngineers(cadets);		// get engineers
		cadets.removeAll(futureEngineers);								// then remove those selected from candidates
		List<Cadet> futureSecurity = getMyFutureSecurity(cadets);		// and get security from rest

		// finally - print the selected candidates for both lists.
		System.out.println("Your future engineers sir:");
		for (Cadet c : futureEngineers){
			System.out.println(c);
		}
		System.out.println("Your future Security sir:");
		for (Cadet c : futureSecurity){
			System.out.println(c);
		}


	}
	private static List<Cadet> getMyFutureEngineers(List<Cadet> candidates) {
		// Option 1: specific filters, specific order
		// return (new AgeSort().sortCateds(new EngineerSelector().getCadets(candidates))).subList(0,5);
		// Option 2: generic parameterized filter, specific order
		// return (new AgeSort().sortCateds(
		//		new CadetSelector(
		//				new HashSet<>(Arrays.asList("WD", "EPR", "DR", "AR")),165,true)
		//				.getCadets(candidates)).subList(0,5));
		
		// Option 3: generic filter, generic sorter
		Comparator<Cadet> myComparator = Comparator.comparing(Cadet::getAge).reversed();
		return (new CadetSorter(myComparator).sortCateds(new CadetSelector(
						new HashSet<>(Arrays.asList("WD", "EPR", "DR", "AR")),165,true)
						.getCadets(candidates)).subList(0,5));
		
	}
	private static List<Cadet> getMyFutureSecurity(List<Cadet> candidates) {
		// Option 1: specific filters, specific order
		// return (new PopSort().sortCateds(new SecuritySelector().getCadets(candidates))).subList(0,5);
		
		// Option 2: generic parameterized filter, specific order
		// return (new AgeSort().sortCateds(
		// 		new CadetSelector(
		//				new HashSet<>(Arrays.asList("PW", "BD", "VDG")),190,false)
		//				.getCadets(candidates)).subList(0,5));
		
		// Option 3: generic filter, generic sorter
		Comparator<Cadet> myComparator = (c1,c2)-> c2.getClassMates().size() - c1.getClassMates().size();
		return (new CadetSorter(myComparator).sortCateds(new CadetSelector(
						new HashSet<>(Arrays.asList("PW", "BD", "VDG")),190,false)
						.getCadets(candidates)).subList(0,5));
	}
	
	
	/**
	 * Generate some candidates for selections!
	 * @return	a list of candidates from which to select.
	 */
	private static List<Cadet> teleportCadets() {
		LinkedList<Cadet> cadets = new LinkedList<>();
		cadets.add(new Cadet("Kirk", 160, 34));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.getLast().addClassMates(cadets);
		cadets.add(new Cadet("Spock", 180, 75));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.getLast().addSkills(Arrays.asList("WD", "EPR", "DR", "AR"));
		cadets.getLast().addClassMates(cadets);
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.getLast().addSkills(Arrays.asList("WD", "EPR", "DR", "AR"));
		cadets.add(new Cadet("Sulu", 165, 27));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.getLast().addClassMates(cadets);
		cadets.add(new Cadet("Ohura", 156, 24));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.add(new Cadet("Worf", 185, 30));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.getLast().addClassMates(cadets);
		cadets.add(new Cadet("Jordy", 170, 28));
		cadets.getLast().addSkills(Arrays.asList("WD", "EPR", "DR", "AR"));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.add(new Cadet("Data", 185, 3));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.getLast().addSkills(Arrays.asList("WD", "EPR", "DR", "AR"));
		cadets.add(new Cadet("Picard", 175, 30));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.add(new Cadet("John", 183, 32));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.add(new Cadet("Borg1", 165, 100));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.getLast().addSkills(Arrays.asList("WD", "EPR", "DR", "AR"));
		cadets.add(new Cadet("Borg2", 165, 101));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.getLast().addSkills(Arrays.asList("WD", "EPR", "DR", "AR"));
		cadets.add(new Cadet("Borg3", 165, 102));
		cadets.getLast().addSkills(Arrays.asList("PW", "BD", "VDG"));
		cadets.getLast().addSkills(Arrays.asList("WD", "EPR", "DR", "AR"));
		return cadets;

	}
}
