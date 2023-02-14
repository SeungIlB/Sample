public class DollarAccount extends BankAccount{


    // 오버로딩 Overroading => 부모 클래스에서 상속받은 메서드에서 파라미터를 변경
    // 새로운 메서드 정의!
    void inquiry(double currencyRate) {} // 환율을 고려해 재정의

    // 오버라이딩 => 부모 클래스에서 상속받은 메서드의 내용을 변경
    // 자식 클래스의 상황에 맞게 메서드 변경
    // 중요한 점은 오버라이딩한 된것은 파라미터는 그대로 메서드만 변경 가능
    public void deposit(){}
}
