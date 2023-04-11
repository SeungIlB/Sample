public class Variable {


    //변수 => 데이터가 저장되는 공간.

    // 1. 1개의 변수 => 1개의 값만 할당가능

    // 2. 변수에 저장된 값 => 재할당을 통해 변경 가능

    // 3. 값의 형태에 맞는 자료형 사용

    // 4. 변수명은 소문자로 시작

    // 5. 변수명 맨 앞만 숫자 불가능

    // 6. 변수명 대소문자 구분 , 공백 포함 x

    // 7. 자바 예약어 x
        public static void main(String[] args) {
        int num = 1;
 
        double width = 12.3;

        String content = "Programming";
        // 힙메모리에 변수 값을 저장

        num = 10;

        System.out.println(num);
    }
}
