import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setMemberList(ArrayList<MemberInfo> newList) {
        memberList = newList;
    }

    public void addMembers(String[] names, int gradYear) {
        // TYPE UP YOUR PART A CODE HERE
        // then test with MemberTester
		for (int i = 0; i < names.length; i++) {
			MemberInfo member = new MemberInfo(names[i], gradYear, true);
			memberList.add(member);
		}
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        // TYPE UP YOUR PART B CODE HERE
        // then test with MemberTester
		ArrayList<MemberInfo> removeList = new ArrayList<MemberInfo>();
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).getGradYear() <= year) {
				if (memberList.get(i).inGoodStanding()) {
					removeList.add(memberList.get(i));
				}
				memberList.remove(i);
				i--;
			}
		}
		return removeList;
    }
}
