import java.sql.*;

public class PriceListDao {
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "Vaz_2101";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

    private Connection connection;
    private Statement statement;

    public PriceListDao() {

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public PriceListCar getPriceListCar(PriceListCar car, int inputTypeCar) throws SQLException {
        ResultSet liteCar = statement.executeQuery("select *  from pricetypecar " +
                "WHERE id = " +  inputTypeCar);
        while (liteCar.next()) {
            car.setTypeCar(liteCar.getString("nametypecar"));
            car.setPrice(liteCar.getInt("pricetypecar"));
        }
        return car;
    }

    public PriceRadiusWheel getPriceListWheel(PriceRadiusWheel wheelRadius, int inputWheelRadius) throws SQLException {
        ResultSet getWheelInfo = statement.executeQuery("select *  from priceRadiusWheel " +
                "WHERE id = " + inputWheelRadius);
        while (getWheelInfo.next()) {
        wheelRadius.setRadius(getWheelInfo.getInt("radiuswheel"));
        wheelRadius.setPriceRadius(getWheelInfo.getInt("priceradiuswheel"));
        }
        return wheelRadius;
    }
    public void getSetInfoCar(String winNumbers, String nameCar, PriceListCar car , PriceRadiusWheel wheelRadius , CarController carTypeCar) {
        try {
            statement.addBatch(" insert into infocar (win, namecar, typecar, radiuswhell, numberwheel) " +
                    " values  ('" + winNumbers + "', '" + nameCar + "', '" + car.getTypeCar() + "', " + wheelRadius.getRadius() + ", " + carTypeCar.getNumberWheel() +")"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}