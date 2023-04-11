public class BankAccount {

    // 멤버변수
    private int bankCode;
    private int accountNo;
    private String owner;
    private int balance;
    private boolean isDormant; // 휴면됨
    private int password;

    // 메소드
    public void inquiry(){}
    public void deposit(){}
    public void witdraw(){}
    public void heldInDormant(){}
    public void changePassword(int password){
        this.password = password;
    }
 
    // 생성자
    // 클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치!
    // new 연산자와 함께 사용

    BankAccount(){

    }
    BankAccount(
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            int password,
            boolean isDormant
    ){
        this.bankCode = bankCode;
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.password = password;
        this.isDormant = isDormant;
    }

    // getter, setter 마우스 우클릭, generate에 들어가면 있음
    // getter 멤버변수 인스턴스 값을 조회에 오는 것.
    // setter 변경하는 것
    // getter setter 둘다 되는것
    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
// 비어있는 생성자가 필요한 경우가 있음, 그땐 위에 처럼 만들어 줘야함.

// 접근제어자 - 클래스 혹은 클래스안에 멤버변수, 메서드, 생성자 등에 대한 접근을 제어한다는 뜻
// 멤버 변수에 중요하게 쓰임
// 객체 멤버 변수를 변경할 수 있기 때문에 그걸 못하게.
// private을 붙여줘야함. 동일 클래스 안에서만 사용가능.


// 인터페이스 , interface
// 클래스가 상세한 설계도, 인터페이스는 메서드 이름, 파라미터, 아낙, 타입만 가짐
// 실제로 구현되는건 x
// 인스턴스 생성도 불가능.
// 왜 등장했을까, 기준의 표준화를 달성하기 위한 도구
// 특정한 범주로 묶어서 처리한다음에, 이걸 구현할 클래스에 각 로직에 맞도록 알아서 구성하게 하도록 함.
//
