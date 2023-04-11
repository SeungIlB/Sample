public class TypeCasting {
    public static void main(String[] args) {

        // 형변환
        // byte < short < int < long <<< float < double

        // 강제 형변환(명시적 형변환)
        int a = 128;

        short b = (short) a;

        byte c = (byte) a;

        System.out.println(c); // byte에서 오버플로우가 일어남.
        //자동 형변환
        short x = 10;
        int y =  x;

        System.out.println(x);
        System.out.println(y);

        int m = 80;
        double n = m;
        System.out.println(m);
        System.out.println(n);
 


    }
}
