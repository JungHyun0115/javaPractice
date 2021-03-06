package practice_0612;

import java.util.InputMismatchException;
import java.util.Scanner;
 
/**
 * 2016.01.25 예외처리
 *
 */
public class InputMissmatchExceptionTest {
 
    public void start() {
 
        System.out.println("정수를 입력하세요! ");
        
        Scanner input = new Scanner( System.in );
        
        int number = 0;
        
        // 사용자가 정수를 입력할 때까지 반복한다.
        while(true) { 
            
            // 일단 에러가 날지 안날지 모르지만 일단 시도해본다.
            try { 
                
                // 예외가 발생할 가능성이 있는 코드들...
                number = input.nextInt(); 
                //문자를 입력해도 되는거 아닌가?
                //예외가 발생하면 밑에 줄 무시하고 바로 catch로 간다.
                break;
            }
            // try 내부의 코드가 InputMismatchException 을 던진다면,
            // 예외를 받아온다.
            // catch가 실행되는 동안은 프로그램이 종료되지 않는다.
            catch ( InputMismatchException ime ) {
                
                // Scanner의 버그를 해결하기 위한 코드
                input = new Scanner( System.in ); 
                System.out.println("잘못 입력했습니다. 정수만 입력할 수 있어요.");
                
                // 쓰면 안되는 코드
                // 예외의 구체적인 정보를 알고 싶을 때 쓴다.
                // 구체적인 정보를 알고 난 뒤에는 반드시 지워야 한다.
                //ime.printStackTrace();
                
                // 애용해야하는 코드
                // 어떤 예외가 어떻게 발생했는지 간략히 알려준다.
                System.out.println(
                        ime.getClass().getName() + " 예외가 " + ime.getMessage() + " 때문에 발생했습니다. ");
            }
        }
        
        
        System.out.println("당신이 입력한 정수는 " + number + " 입니다.");
        
    }
 
    public static void main(String[] args) {
        InputMissmatchExceptionTest test = new InputMissmatchExceptionTest();
        test.start();
 
    }
}


