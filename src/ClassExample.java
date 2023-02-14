public class ClassExample {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        //bankAccount.password = 123456; // 멤버변수에 접근제어 private가 붙어있어서 변경 불가능.
        //System.out.println(bankAccount.password);

        bankAccount.changePassword(123456);
        //System.out.println(bankAccount.password); // 단순히 조회하는 것도 안됨.
        // 값을 조회하고 수정하기 위해 특별한 함수를 정의해야함
        // 정의를 하면
        System.out.println(bankAccount.getPassword());
        // 이렇게 하면 됨.
    }
}
