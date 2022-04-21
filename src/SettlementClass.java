public class SettlementClass {

    private int result;
    public void setTlementClass(int price, int radiusWheel, int numberWheel) {

    result = price + radiusWheel * numberWheel;

    }

    public void getResultCalculate(){

        System.out.println(result);

    }

}
