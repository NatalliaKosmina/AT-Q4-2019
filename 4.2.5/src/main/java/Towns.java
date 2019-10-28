import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Towns {
    public static void main(String[] args) throws IOException {
        System.out.println("Для начала игры введите название любого города. Для завершения введите слово exit.");

        Scanner input = new Scanner(System.in);
        String randomTown = input.nextLine();

        List<String> citiesArray = new ArrayList<String>();
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("F:\\Java\\AT-Q4-2019\\_425\\src\\main\\resources\\files\\cities2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            citiesArray.add(line);
        }
        bufferedReader.close();

        while (!randomTown.equals("exit")) {
            System.out.println("Очередь компьютера:");


            boolean cityExist = true;
            String tempCity = "";
            for (int i = 0; i < citiesArray.size(); i++) {

                char firstSymbol = compareSymbols(randomTown, citiesArray.get(i));
                if (firstSymbol != '0') {
                    cityExist = false;
                    System.out.println(citiesArray.get(i));
                    tempCity = citiesArray.get(i);
                    citiesArray.remove(i);
                    break;
                }
            }

            if (cityExist) {
                System.out.println("Компьютер не нашел слово. Вы выиграли!");
                System.exit(0);
            }

            char tempCompareResult = compareSymbols(tempCity, randomTown);
            while (tempCompareResult == '0') {
                System.out.println("Вы должны ввести город на букву " + tempCity.charAt(tempCity.length() - 1));
                randomTown = input.nextLine();
                if(randomTown.equals("exit")){
                    System.exit(0);
                }
                tempCompareResult = compareSymbols(tempCity, randomTown);
            }
        }
    }

    public static char compareSymbols(String firstWord, String secondWord) {
        char result = '0';
        char first = Character.toUpperCase(secondWord.charAt(0));
        char second = Character.toUpperCase(firstWord.charAt(firstWord.length() - 1));

        if (second == 'Ь'){
            second = Character.toUpperCase(firstWord.charAt(firstWord.length() - 2));

        }
        if (second == first) {
            result = first;
        }
        return Character.toUpperCase(result);
    }
}
