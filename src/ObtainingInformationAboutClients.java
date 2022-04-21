public class ObtainingInformationAboutClients {
    String info;

    public void setInfo(String car, String typeCar, int radiusWheel, int numberWheel) {

    info = car + " " + "Тип авто = " + typeCar + "." + " Радиус колес " +radiusWheel + "." + "Кол-во колёс " + numberWheel + ".";

    }
    public void getInfo(){
        System.out.println(info);
    }

}