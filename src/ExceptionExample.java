import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {

        // 예외(Exceptions) 실행단계에서 발생하는 에러 중 하나
        // 예상되는 에러를 미리 파악해서 자바에서 유형화 해서 갖고 있음

//        int a = 10;
//        int b = 0;
//
//        int c = a / b; // 코드상의 문제는 없지만 0으로 나눌 수 없다는걸 자바도 앎. 따라서 시스템 자체에서 에러가 뜨게 됨

        ArrayList arrayList = new ArrayList(3);
//        arrayList.get(10); // Index 10 out of bounds for length 0 ---> 자료구조에서 범위에 벗어나서 에러가뜸.

        try {
            //arrayList.get(10);
            int a = 10;
            int b = 0;
            int c = a / b;
        }catch(IndexOutOfBoundsException ioe){
            System.out.println("IndexOutOfBoundsException 에러발생"); // 이건 안쓰는게 더 좋다함.
        }catch(IllegalArgumentException iae){
            System.out.println("IllegalArgumentException 에러발생");
        } catch(Exception e){
            System.out.println("Exception 발생");
        } finally{
            System.out.println("finally");
        }


    }
}
