//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creating array

        int[] numbers = {5, 12, 54, 1, 78};
        int result = differenceMaxMin(numbers);
        System.out.println(result);
        int[] result2 = smallestSecondSmallest(numbers);
        System.out.println("The smallest is: " + result2[0]);
        System.out.println("The second smallest is: " + result2[1]);
        double result3 = mathCalculate();
        System.out.println(result3);


    }

    public static int differenceMaxMin(int[] arr) {
        //int return a integer
        //arr the parameter of array that receive

        int max = arr[0];
        //the first value of the array is assigned
        int min = arr[0];
        //the same that before

        for (int i = 1; i < arr.length; i++) {
            //is the same if we do i = 0 and length - 1
            //and, we used the first element at the var

            if (arr[i] > max) {
                max = arr[i];
                //in the first loop, we have max = 5 so we need i be the next element
                //i = 12
                //while arr[i] is larger than max, wil done the first condition
            }
            if (arr[i] < min) {
                min = arr[i];
                //get inside when i = 1 (position 3) so, 1 < 5 (position 0)
                // so, min = 1 (position 3) because is smallest
            }
        }
        return max - min;
        //just the difference of 78 - 1 (max and min)
    }

    public static int[] smallestSecondSmallest(int[] arr) {

        int first = arr[0];
        //first position
        int second = arr[1];
        //second position

        if (second < first) {
            int temp = first;
            first = second;
            second = temp;

        }


        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second) {
                second = arr[i];
            }

        }
        return new int[]{first, second};

    }

    public static double mathCalculate() {
        int numberX = 5;
        int numberY = 8;
        double result = 1;

        result = (numberX * numberX) + (double)Math.pow((4.0 * numberY / 5 - numberX), 2);
        return result;
    }

}
