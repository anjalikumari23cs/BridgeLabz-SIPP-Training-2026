// 4.Smart Library Membership System (Medium)
// Scenario:
// A library provides memberships:
//  StudentMember
//  FacultyMember
// GuestMember
// Superclass:
// LibraryMember
// Fields:
// String memberName;
// String memberId;
// Method:
// calculateFine(int overdueDays)
// Each membership type calculates fines differently.
// Requirements:
// 1. Store all members in a LibraryMember[] array.
// 2. Create a method to print member details.
// 3. Use dynamic method dispatch to calculate fines.
// 4. Find and display the member whose ID matches a given string.
class LibraryMember {
    String memberName;
    String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }
}

class StudentMember extends LibraryMember {
    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 0.5; // Example fine calculation for students
    }
}

class FacultyMember extends LibraryMember {
    public FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 0.2; // Example fine calculation for faculty
    }
}

class GuestMember extends LibraryMember {
    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1.0; // Example fine calculation for guests
    }
}

public class SmartLibraryManagementSystem {
    public static void main(String[] args) {
        LibraryMember[] members = new LibraryMember[3];
        members[0] = new StudentMember("Alice", "S001");
        members[1] = new FacultyMember("Bob", "F001");
        members[2] = new GuestMember("Charlie", "G001");

        String searchId = "F001";
        for (LibraryMember member : members) {
            if (member.memberId.equals(searchId)) {
                System.out.println("Member found: " + member.memberName + ", ID: " + member.memberId);
                double fine = member.calculateFine(5); // Example overdue days
                System.out.println("Calculated fine for 5 overdue days: $" + fine);
            }
        }
    }
}
