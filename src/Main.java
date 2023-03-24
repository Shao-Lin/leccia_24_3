import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int S = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            int a = scanner.nextInt();
            list.add(a);
        }
        Collections.sort(list);
        int counter = 0;
        for(int i = 0; i < N; i++){
            S = S - list.get(i);
            if(S >= 0) {
                counter++;
            }else
                break;
        }
        System.out.println(counter);
    }
}