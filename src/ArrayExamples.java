public class ArrayExamples {
    public static void main(String[] args) {

        // 배열(Arrays)
        // 특정한 자료형을 모아놓은 구조

        int[] price = {1000, 2000, 3000, 4000};

        String[] mbti = {"INFP", "ENFP", "ISTJ", "ESTP"};

//        System.out.println(price[0]);
//        System.out.println(mbti[0]);
//
//        price[1] = 8000; // 배열 내 특정부분 변경
//        System.out.println(price[1]);
//
//        System.out.println(price); // 주소값이 출력됨

        System.out.println(mbti.length);
        for(int i = 0; i < price.length; i++){
            System.out.println(price[i]);
        }
    }
}
