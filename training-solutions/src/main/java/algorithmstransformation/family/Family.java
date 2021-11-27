package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> familyMemberList;

    public Family() {
        familyMemberList = new ArrayList<>();
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMemberList.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name) {
        List<Integer> ages = new ArrayList<>();
        for (FamilyMember member : familyMemberList) {
            if (member.getName().indexOf(name) > 0) {
                ages.add(member.getAge());
            }
        }
        return ages;
    }
}
