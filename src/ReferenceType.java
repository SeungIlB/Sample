public class ReferenceType {
    public static void main(String[] args){

        // 참조형
        // 참조형 데이터의 값 => 힙 메모리 영역에 생성
        // 변수에 대입되는 값 => 힙 메모리 영역의 주소값

        String a = new String("Hello!");
        System.out.println(a);

        String b = "Hello!";
        String c = "Hello!";
        if (a == b){
            System.out.println("a == b");
            //a와 b가 같은 주소를 가르킨다면 실행 --> 다른 주소값을 갖는다는걸 알 수 있음.

        }
        if (b == c){
            System.out.println("b == c");
            //b와 c가 같은 주소를 가르킨다면 실행 --> 리터럴 방식으로 문자열을 구성해서 대입하면 기존 힙메모리에 동일한 값이 있으면 새롭게 만드는게아니라 기존걸 가져옴.
            //따라서 b와 c는 같은 주소값을 갖게됨.
        }
    }
} 
