import java.util.HashMap;
import java.util.Map;

public class Member {

    private static final long serialVersionUID = 1l;
    private Member[] members;
        
    final private String id;

    public Member(String id) {
        this.id = id;
    }

    public Member[] getFields() {
        return members;
    }

    public boolean equals(Object o) {
        if(!(o instanceof Member) || o == null) return false;
        Member other = (Member) o;
        return this.id.equals(other.id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toBinary() {
        // do serilization
    }

    private static String serialize(Member member, Map<Member, String> memberMap){
        if(memberMap.containsKey(member)) {
            return memberMap.get(member);
        }

        String str = member.toBinary();
        memberMap.put(member, str);

        Member[] members =  member.getFields();
        for(Member m: members) {
            str += serialize(m);
        }
        return str;
    }

    public static String serialize(Member member) {
        return serialize(member, new HashMap<>());
    }


    // In java, classes are not always serilizable, how is the class marked as serilizable? 

    // By implementing the Serializable interface.

    // What is the type (checked or unchecked) of Exception thrown if a class which is not serilizable is being serialized?
    // Explain why the exception is of that type.

    // The errror is runtime, since the compiler will not bother to recursively check all sub-members.

    // Explain the reason behind the serialVersionUID field in java, and add the appropriate field to the Member class.

    // serialVersionUID allows version management of objects writen to streams. Instances with different version id
    // cannot be assigned to one another through serilization.



}
