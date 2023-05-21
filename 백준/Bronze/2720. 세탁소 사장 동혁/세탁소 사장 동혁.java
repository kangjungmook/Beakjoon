import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        int T = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        int[] arr = new int[T];

        for(int i = 0; i < T; i++)
            arr[i] = Integer.parseInt(br.readLine());

        int[] numArray = { 25, 10, 5, 1 };
        int[][] answer = new int[T][4];

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i] % numArray[j] < arr[i]) {
                    answer[i][j] = arr[i] / numArray[j];
                    arr[i] = arr[i] % numArray[j];
                } else
                    answer[i][j] = 0;
            }
        }

        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < answer[0].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }

}