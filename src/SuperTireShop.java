import java.sql.SQLException;
import java.util.Scanner;

public class SuperTireShop {


    public static void main(String[] args) {

        PriceListCar car = new PriceListCar();

        CarController newCarType = new CarController();


        System.out.println("Введите название машины");
        newCarType.setNameCar();
        System.out.println("Введите win номер");
        newCarType.setWinnumbers();

        PriceListDao worker = new PriceListDao();

        System.out.println("Задайте тип автомобиля. 1 - Легковой. 2 - Джип. 3 - Грузовой");
        Scanner addList = new Scanner(System.in);
        int inputTypeCar = addList.nextInt();


        try {
            car = worker.getPriceListCar(car, inputTypeCar);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Укажите кол-во колёс");
        newCarType.setNumberWheel();

        System.out.println("Укажите радиус колёс от 13 до 21");
        PriceRadiusWheel wheelRadius = new PriceRadiusWheel();
        int inputWheelRadius = addList.nextInt();

        try {
            wheelRadius = worker.getPriceListWheel(wheelRadius,inputWheelRadius);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ObtainingInformationAboutClients info = new ObtainingInformationAboutClients();
        info.setInfo(newCarType.getWinNumbers(), car.getTypeCar(), wheelRadius.getRadius(), newCarType.getNumberWheel());
        info.getInfo();

        SettlementClass pereobuv = new SettlementClass();
        pereobuv.setTlementClass(car.getPrice(), wheelRadius.getPriceRadius(), newCarType.getNumberWheel());
        pereobuv.getResultCalculate();

        Client client = new Client();
        client.setInfoUsersCar(newCarType.getWinNumbers(), newCarType.getNameCar(), car.getTypeCar(), wheelRadius.getRadius(), newCarType.getNumberWheel());
        client.getInfo();

        worker.getSetInfoCar(newCarType.getWinNumbers(), newCarType.getNameCar(),car, wheelRadius, newCarType);

    }
}
