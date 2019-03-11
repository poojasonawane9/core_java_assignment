
public class ArmstrongOfMultipleNum {

    public static void main(String[] args) {

        int start = 100, end = 999;

        for(int number = start; number < end; number++) {
            int count = 0;
            int sum = 0;
            int checkNumber = number;
            while (checkNumber != 0) {
                checkNumber /= 10;
                count++;
            }
            checkNumber = number;
            while (checkNumber != 0) {
                int remainder = checkNumber % 10;
                sum += Math.pow(remainder, count);
                checkNumber /= 10;
            }
            if (sum == number)
                System.out.print(number + " ");
        }
    }
}
