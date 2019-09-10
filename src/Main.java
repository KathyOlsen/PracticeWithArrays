import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        //1&2. Create array to hold numbers 1-10; loop through and sum numbers in array and print total.
        int[] numbers = new int[10];
        int sum = 0;
        for(int i = 0; i < 10; i++){
            numbers[i] = (i+1);
            sum += numbers[i];
        }
        System.out.println(sum);

        //3. Create array to hold 10 user input numbers and print total sum.
        int[] numbers2 = new int[10];
        int number = 0;
        int sum2 = 0;
        System.out.println("I will ask you to enter 10 numbers.");
        for(int i = 0; i<10; i++){
            System.out.println("Please enter a number: ");
            number = key.nextInt();
            key.nextLine();
            numbers[i] = number;
            sum2 += numbers[i];
        }
        System.out.println("Your numbers total: " + sum2);

        //4. Create an array to hold 10 user input numbers and print the average.
        //using numbers2 array of user inputs from preceding exercise
        //using sum 2 from preceding exercise
        int average = sum2 / numbers.length;
        System.out.println("The average of your numbers is: " + average);
        System.out.println();

        //5. Create an array to hold 3 names and print the names.
        String[] names = new String[3];
        String name;
        String listNames = "";
        System.out.println("I will ask you for three names.");
        for(int i =0; i<3; i++){
            System.out.println("Please enter name " + (i+1) + ":");
            name = key.nextLine();
            names[i] = name;
            listNames += names[i];
            listNames += " ";
        }
        System.out.println("The names you entered are: " + listNames);

        //6. Create an array of set values; print index numbers of those values = 5.
        int[] values = {2,5,9,0,2,1,8,5,4};
        System.out.println("The value 5 is found at the following index numbers:  ");
        for(int i = 0; i < values.length; i++){
            if (values[i] == 5){
                System.out.println(i + "  ");
            }
        }
        System.out.println();

        //7. Declare an array of numbers 1-10 and print the numbers backwards.
        int[] numbers3 = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 9; i >=0; i--){
            System.out.print(numbers3[i] + " ");
        }
        System.out.println();

        //8. Create and loop through given array of chars and replace letter "t" with "hello".
        String[] letters = {"w","t","y","h","k"};
        for(int i = 0; i < letters.length; i++){
            if (letters[i] == "t"){
                letters[i] = "hello";
            }
            System.out.print(letters[i] + " ");
        }
        System.out.println();

        //9. Given 2 arrays, print out all matching pairs.
        int[] array1 = {1,7,6,5,9};
        int[] array2 = {2,7,6,3,4};
        System.out.println("The arrays match at the following index numbers and values: ");
        for(int i = 0; i < array1.length; i++){
            if(array1[i] == array2[i]){
                System.out.println(i + ": (" + array1[i] + "," + array2[i] + ")");
            }
        }
    }
}
