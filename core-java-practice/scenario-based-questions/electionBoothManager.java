import java.util.*;
public class electionBoothManager {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Election Booth Manager!");
        System.out.println("Please enter the number of voters:");
        int numVoters=sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Voter1,please enter your age to check you eligibility to vote:");
        int age=sc.nextInt();
        sc.nextLine(); // Consume the newline character
        Map<String, Integer> voteCount=new HashMap<>();
        for(int i=0;i<numVoters;i++){
            System.out.println("Voter " + (i+1) + ", please enter your vote (Candidate A, Candidate B, Candidate C):");
            String vote=sc.nextLine();
            voteCount.put(vote, voteCount.getOrDefault(vote, 0) + 1);
        }
        System.out.println("Election Results:");
        for(Map.Entry<String, Integer> entry: voteCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
        sc.close();
    }
}
