public class Client {

    String infoUsers;


    public void setInfoUsersCar(String nameUsers, String car, String typeCar, int radiusWheel, int numberWheel) {

    infoUsers ="Win номер " + nameUsers + " " + car + " " + "Тип авто = " + typeCar + "." + " Радиус колес " +radiusWheel + "." + "Кол-во колёс " + numberWheel + ".";

    }

    public void getInfo(){
        System.out.println(infoUsers);
    }
}
