import java.util.Scanner;

public class CarController {

        private int numberWheel;
        private String nameCar;
        private String winNumbers;


        public void setWinnumbers(){

                Scanner addNameUsers = new Scanner(System.in);
                winNumbers = addNameUsers.nextLine();

        }
        public String getWinNumbers(){
                return winNumbers;
        }

        public String getNameCar(){
                return nameCar;
        }

        public void setNameCar(){

                Scanner addList = new Scanner(System.in);
                nameCar = addList.nextLine();

        }
        public int getNumberWheel(){

                return numberWheel;

        }

        public void setNumberWheel() {

                Scanner addList = new Scanner(System.in);
                int inputNumberWheel = addList.nextInt();
                if (inputNumberWheel >= 1) numberWheel = inputNumberWheel;

        }
}