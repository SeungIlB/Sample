public class PrimitiveType {
    public static void main(String[] args){
        // 정수형 데이터 타입
        // 1. byte (1byte = 8bit): -2^7 ~ 2^7-1(-128 ~ 127)
        // 2. short (2bytes): -2^15 ~ 2^15-1(-32768 ~ 32767)
        // 3. int(4bytes): -2^31 ~ 2^31-1
        // 4. long(8bytes): -2^63 ~ 2^63-1

        // 실수형
        // 1. double (8bytes): 소수점 15자리
        // 2. float (4bytes): 소수점 7자리

        double a = 1.23;
        float b = 9.45f;

        // 문자형
        // char(2bytes)
        // 아스키, 유니코드
        char char_1 = 'a';
        char char_2 = 97; // <- 아스키코드

        System.out.println(char_1);
        System.out.println(char_2);

        // 논리형 -- 참 거짓
        // boolean(1 byte)

        boolean bool_1 = true;
        boolean bool_2 = false;
        boolean bool_3 = (100 < 0);
        // //boolean에 숫자를 넣을수 없음 자바에선 다른 언어 c 같은경우엔 0 - false 1 - true

        System.out.println(bool_1);
        System.out.println(bool_2);
        System.out.println(bool_3);
    }
}
