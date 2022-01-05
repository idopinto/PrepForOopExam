package USScandidateSelection;
import java.util.*;

public class Cadet {
    private final String name;
    private int age;
    private int height;
    private List<Cadet> classMates = new ArrayList<>();
    private List<String> skills = new ArrayList<>();
    
    public Cadet(String name, int height, int age) {
        this.name   = name;
        this.height = height;
        this.age = age;
    }
    public void addClassMates(List<Cadet> classMates) {
    	this.classMates.addAll(classMates);
    }
    public void addSkills(List<String> skills) {
        this.skills.addAll(skills);
    }
    public int getAge(){return this.age;}
    public String getName() { return this.name; }
    public int getHeight() { return this.height; }
    public List<Cadet> getClassMates() { return new ArrayList<>(classMates); }
    public List<String> getSkills() { return new ArrayList<>(skills); }
    
    @Override
    public String toString() {
    	return String.format("Name: %s, age: %d, height: %d, skills: %d, classMates: %d\n", name, age, height, skills.size(), classMates.size());
    }
}
