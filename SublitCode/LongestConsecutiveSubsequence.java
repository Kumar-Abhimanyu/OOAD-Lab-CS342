package SublitCode;
import java.util.*;
public class LongestConsecutiveSubsequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for(int i = 0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println(SubsequenceFinder(numbers));
    }

    public static int SubsequenceFinder(int a[]){
        Set<Integer> answer = new HashSet<Integer>();
        for(int i : a){
            answer.add(i);
        }
        int max = 0;
        for(int i : a){
            if(!answer.contains(i-1)){
                int currLength = 1;
                while(answer.contains(i+currLength)){
                    currLength++;
                }
                max = Math.max(max,currLength);
            }
        }
        return max;
    }
}