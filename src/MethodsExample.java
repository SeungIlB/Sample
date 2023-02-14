public class MethodsExample {
        // 함수(메서드)
        // 어떠한 값이 넘겨지거나 아무 값도 넘겨지지 않았을 때
        // 작업을 수행한 후
        // 반환하거나 호은 반환하지 않고 종료

        public static void main(String[] args) {

            int mod_result = mod(3,3);
            System.out.println(mod_result);

            printNum(10);

            String str = greeting();
            System.out.println(str);

            greeting_2();


        }

        // 1. 입력도 있고, 출력도 있는 경우
    static int mod (int a, int b){
        //어떤 작업을 할건지
        int result = a % b;
        return result;
    }
    // 2. 입력 있고, 출력(반환) 없는 경우

    static void printNum(int a){
        System.out.println(a);
    }
    // 3. 입력 x, 출력 있는 경우

    static String greeting() {
        return "Hello!";
    }

    // 4. 입력 x, 출력 x 경우

    static void greeting_2(){
        System.out.println("Helllo!");
    }
}
