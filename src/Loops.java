public class Loops {
    public static void main(String[] args) {

        // 반복문
        // 1. for
        // for(초기화 된 변수; 조건식; 증감식)
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // 2. while

        int j = 1;

        while(j < 10){
            j++;
            System.out.println(j);
        }

        // 3. do while
        // 무조건 한번은 실행한다.

        int b = 0;

        do{
            System.out.println(b);
            b--;
        }while(b > 0);
    }
}
