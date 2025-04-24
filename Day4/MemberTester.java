import java.util.ArrayList;

public class MemberTester {
    public static void main(String[] args) {
        System.out.println("------- Q3 Part A Testing --------");
        String[] newNames = {"John", "Amy", "Bertha", "Ronald", "Jessica"};
        ClubMembers club = new ClubMembers();
        club.addMembers(newNames, 2024);
        ArrayList<MemberInfo> members = club.getMemberList();
        for (MemberInfo member : members) {
            System.out.println(member.getName() + "  " + member.getGradYear() + "  " + member.inGoodStanding());
        }
        if (members.get(0).getName().equals("John") && members.get(0).getGradYear() == 2024 && members.get(0).inGoodStanding() &&
                members.get(1).getName().equals("Amy") && members.get(1).getGradYear() == 2024 && members.get(1).inGoodStanding() &&
                members.get(2).getName().equals("Bertha") && members.get(2).getGradYear() == 2024 && members.get(2).inGoodStanding() &&
                members.get(3).getName().equals("Ronald") && members.get(3).getGradYear() == 2024 && members.get(3).inGoodStanding()) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }

        System.out.println("\n------- Q3 Part B Testing --------");
        MemberInfo m1 = new MemberInfo("SMITH, JANE", 2019, false);
        MemberInfo m2 = new MemberInfo("FOX, STEVE", 2018, true);
        MemberInfo m3 = new MemberInfo("XIN, MICHAEL", 2017, false);
        MemberInfo m4 = new MemberInfo("GARCIA, MARIA", 2020, true);
        ArrayList<MemberInfo> testMembers = new ArrayList<MemberInfo>();
        testMembers.add(m1);
        testMembers.add(m2);
        testMembers.add(m3);
        testMembers.add(m4);
        club.setMemberList(testMembers);
        System.out.println("---- members still in list: ----");
        ArrayList<MemberInfo> gradMembers = club.removeMembers(2018);
        members = club.getMemberList();
        for (MemberInfo member : members) {
            System.out.println(member.getName() + "  " + member.getGradYear() + "  " + member.inGoodStanding());
        }
        if (members.get(0).getName().equals("SMITH, JANE") && members.get(0).getGradYear() == 2019 && !members.get(0).inGoodStanding() &&
                members.get(1).getName().equals("GARCIA, MARIA") && members.get(1).getGradYear() == 2020 && members.get(1).inGoodStanding() &&
                members.size() == 2) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
        System.out.println("\n---- returned arraylist of graduated/removed members: ----");
        for (MemberInfo member : gradMembers) {
            System.out.println(member.getName() + "  " + member.getGradYear() + "  " + member.inGoodStanding());
        }
        if (gradMembers.get(0).getName().equals("FOX, STEVE") && gradMembers.get(0).getGradYear() == 2018 && gradMembers.get(0).inGoodStanding() &&
                gradMembers.size() == 1) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
        System.out.println("\n---- second test (no members have grad year) ---- ");
        testMembers = new ArrayList<MemberInfo>();
        testMembers.add(m1);
        testMembers.add(m2);
        testMembers.add(m3);
        testMembers.add(m4);
        club.setMemberList(testMembers);
        gradMembers = club.removeMembers(2016);
        members = club.getMemberList();
        for (MemberInfo member : members) {
            System.out.println(member.getName() + "  " + member.getGradYear() + "  " + member.inGoodStanding());
        }
        if (members.get(0).getName().equals("SMITH, JANE") && members.get(0).getGradYear() == 2019 && !members.get(0).inGoodStanding() &&
                members.get(1).getName().equals("FOX, STEVE") && members.get(1).getGradYear() == 2018 && members.get(1).inGoodStanding() &&
                members.get(2).getName().equals("XIN, MICHAEL") && members.get(2).getGradYear() == 2017 && !members.get(2).inGoodStanding() &&
                members.get(3).getName().equals("GARCIA, MARIA") && members.get(3).getGradYear() == 2020 && members.get(3).inGoodStanding() &&
                members.size() == 4) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
        System.out.println("\n---- returned arraylist of graduated/removed members: ----");
        for (MemberInfo member : gradMembers) {
            System.out.println(member.getName() + "  " + member.getGradYear() + "  " + member.inGoodStanding());
        }
        if (gradMembers.size() == 0) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
    }
}
