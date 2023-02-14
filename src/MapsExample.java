import java.sql.SQLOutput;
import java.util.HashMap;

public class MapsExample {
    public static void main(String[] args) {

        // Map
        // 키 - 값  --- 쌍을 요소로 가지는 데이터의 모음, 순서 구분 없음.
        // 키는 중복 불가, 값은 중복 허용

        HashMap map = new HashMap();
        map.put("age", 30);
        map.put("mbti", "INFP");

        System.out.println(map.get("age"));
        System.out.println(map.get("mbti"));

        HashMap<String, String> map_1 = new HashMap<>(); // 이렇게하면 자료형을 한정시킬 수 있음.
        map_1.put("mbti","ESTP");
        System.out.println(map_1.get("mbti"));
    }
}
