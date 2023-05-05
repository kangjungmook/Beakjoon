import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //사용자가 수열의 크기와 수열 숫자를 입력
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt(); // N은 수열의 크기
        int [] A = new int[N]; // 크기 N인 배열 A 선언
       
        for (int i = 0 ; i < N; i++) {
              A[i] = sc.nextInt();
          } // 인덱스 0~ N까지 배열의 데이터를 사용자의 입력으로 받아들인다.
       
         Stack<Integer> stack = new Stack<>();
         StringBuffer bf = new StringBuffer();
         
         int num = 1; // 스택에 입력할 수
         boolean result = true; // 화면에 결괏값을 출력을 제어하기 위한 논리값 (true: 수열생성, false : 수열생성불가)
         
         for (int i=0; i < A.length ; i++) {
                int su = A[i]; // su는 배열에 들어있는 수
               
                if(su >= num) {
                    while(su >= num) {
                                        stack.push(num++);        //push() 메소드는 Stack 라이브러리에서 제공
                                        bf.append("+\n");
                                        } //수열 수가 스택 수 num 보다 크거나 같은 경우 push를 반복 진행
                    stack.pop(); //while문 빠져나온 후 pop 진행
                    bf.append("-\n");    
                                }
                else {
                        int p = stack.pop(); // pop으로 나오는 데이터를 저장
                        if(p > su) { // 수열생성이 안되는 경우
                                        System.out.println("NO");
                                        result = false;
                                        break;
                                    }   //수열의 순서와 맞지 않아 'NO'가 출력되는 상황
                        else {  // p == su인 경우, 수열이 생성되는 경우, result = true 유지
                                    bf.append("-\n"); //pop이 수행되었므로 '-'누적
                              }                      
                        }              
                    }  if(result)System.out.println(bf.toString());        //result = true인 경우 bf에 저장된 문자열 출력
                }
         }