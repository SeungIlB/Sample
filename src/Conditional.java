public class Conditional {
    public static void main(String[] args) {

//        int a = 1;
//        int b = 100;
//
//        if(a != b){
//            System.out.println("a != b");

        int a = 1;

        switch(a + 1){
            case 11:
                System.out.println("a + 1 == 11");
                break;
            case 9:
                System.out.println("a + 1 == 9");
                break;
            case 10:
                System.out.printf("a + 1 == 10");
                break;
            default:
                System.out.println("default");


        }
    }
}
