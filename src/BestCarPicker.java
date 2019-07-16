import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BestCarPicker {
    //Declarations
    private static final String CARS_FILE = "mtcars.csv";
    private static ArrayList<Car> carsList;
    private static final int BRANCH_COUNT = 2;

    public static void main(String[] args) {
        carsList = new ArrayList<>();

        System.out.println("------------------ Reading cars list csv ------------------");
        //Read cars file and initialize carsList array
        readCSV(CARS_FILE);
        System.out.println("------------------ " + carsList.size() + " cars found ------------------\n");

        int bestCarIndex = findBestCar();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Best car = " + carsList.get(bestCarIndex).toString());
        System.out.println("---------------------------------------------------------------------------------");

    }

    private static int findBestCar(){
        System.out.println("------------------ Looking for best car ------------------");
        ArrayList<Integer> alreadyPicked = new ArrayList<>();
        boolean resultFound = false;
        Random rand = new Random();
        //Picking a random car as starting point
        int bestOption =rand.nextInt(carsList.size());
        alreadyPicked.add(bestOption);
        System.out.println("---------- Picked "+carsList.get(bestOption).getName()+" ("+ carsList.get(bestOption).getGPMW()+")"+ " as best option ----------");

        //Look for better option by comparing with the neighbours
        while (!resultFound && alreadyPicked.size()< carsList.size()){
            int newCarsIndex[] = new int[BRANCH_COUNT];
            //Find new neighbours
            System.out.print("Picked ");
            for(int i=0; i<BRANCH_COUNT;i++){
                do {
                    newCarsIndex[i] = rand.nextInt(carsList.size());
                }while (alreadyPicked.contains(newCarsIndex[i]));
                alreadyPicked.add(newCarsIndex[i]);
                System.out.print(carsList.get(newCarsIndex[i]).getName()+" ("+ carsList.get(newCarsIndex[i]).getGPMW()+") ");
                if(i!=(BRANCH_COUNT-1))
                    System.out.print(", ");
            }
            System.out.println("as neighbours");

            boolean moreOptionsFound = false;

            //Checking if the neighbours values are better than the option picked
            for(int i=0; i<BRANCH_COUNT;i++){
                if(carsList.get(bestOption).getGPMW()<carsList.get(newCarsIndex[i]).getGPMW()){
                    bestOption = newCarsIndex[i];
                    moreOptionsFound = true;
                    System.out.println("---------- Changed "+carsList.get(bestOption).getName()
                            +" ("+ carsList.get(bestOption).getGPMW()+")"+ " to best option ----------");
                }
            }
            //If no neighbours are found with a better value, suggest the last as the best result
            if(!moreOptionsFound){
                resultFound = true;
            }
        }
        return bestOption;
    }

    private static void readCSV(String carsFile) {
        BufferedReader csvReader = null;
        try {
            csvReader = new BufferedReader(new FileReader(CARS_FILE));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String row = "";
        while (true) {
            try {
                if (!((row = csvReader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            carsList.add(new Car(row));
        }
        try {
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
