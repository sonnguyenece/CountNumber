import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number : ");
        int number = scanner.nextInt();
        if (number > 999 || number < 0) {
            System.out.println("Out of range! ");
        } else if (number <= 19) {
            switch (number) {
                case 0:
                    System.out.printf(" %3d is called zero", number);
                    break;
                case 1:
                    System.out.printf(" %3d is called one", number);
                    break;
                case 2:
                    System.out.printf(" %3d is called two", number);
                    break;
                case 3:
                    System.out.printf(" %3d is called three", number);
                    break;
                case 4:
                    System.out.printf(" %3d is called four", number);
                    break;
                case 5:
                    System.out.printf(" %3d is called five", number);
                    break;
                case 6:
                    System.out.printf(" %3d is called six", number);
                    break;
                case 7:
                    System.out.printf(" %3d is called seven", number);
                    break;
                case 8:
                    System.out.printf(" %3d is called eight", number);
                    break;
                case 9:
                    System.out.printf(" %3d is called nine", number);
                    break;
                case 11:
                    System.out.printf(" %3d is called eleven", number);
                    break;
                case 12:
                    System.out.printf(" %3d is called twelve", number);
                    break;
                case 13:
                    System.out.printf(" %3d is called thirteen", number);
                    break;
                case 14:
                    System.out.printf(" %3d is called fourteen", number);
                    break;
                case 15:
                    System.out.printf(" %3d is called fifteen", number);
                    break;
                case 16:
                    System.out.printf(" %3d is called sixteen", number);
                    break;
                case 17:
                    System.out.printf(" %3d is called seventeen", number);
                    break;
                case 18:
                    System.out.printf(" %3d is called eighteen", number);
                    break;
                case 19:
                    System.out.printf(" %3d is called nineteen", number);
                    break;
            }
        } else if (number <= 99) {
            String nameDigit1 = "", nameDigit2 = "";
            int digit1 = number / 10;
            int digit2 = number % 10;
            switch (digit1) {
                case 2:
                    nameDigit1 = "twenty";
                    break;
                case 3:
                    nameDigit1 = "thirty";
                    break;
                case 4:
                    nameDigit1 = "forty";
                    break;
                case 5:
                    nameDigit1 = "fifty";
                    break;
                case 6:
                    nameDigit1 = "sixty";
                    break;
                case 7:
                    nameDigit1 = "seventy";
                    break;
                case 8:
                    nameDigit1 = "eighty";
                    break;
                case 9:
                    nameDigit1 = "ninety";
                    break;
            }
            switch (digit2) {
                case 1:
                    nameDigit2 = "one";
                    break;
                case 2:
                    nameDigit2 = "two";
                    break;
                case 3:
                    nameDigit2 = "three";
                    break;
                case 4:
                    nameDigit2 = "four";
                    break;
                case 5:
                    nameDigit2 = "five";
                    break;
                case 6:
                    nameDigit2 = "six";
                    break;
                case 7:
                    nameDigit2 = "seven";
                    break;
                case 8:
                    nameDigit2 = "eight";
                    break;
                case 9:
                    nameDigit2 = "nine";
                    break;

            }
            System.out.printf("%2d is called : %s %s", number, nameDigit1, nameDigit2);
        } else {
            String nameDigit1 = "", nameDigit2 = "", nameDigit3 = "";
            int digit1 = number / 100;
            int digit2 = (number % 100) / 10;
            int digit3 = (number % 100) % 10;

                switch (digit1) {
                    case 1:
                        nameDigit1 = "a";
                        break;
                    case 2:
                        nameDigit1 = "two";
                        break;
                    case 3:
                        nameDigit1 = "three";
                        break;
                    case 4:
                        nameDigit1 = "four";
                        break;
                    case 5:
                        nameDigit1 = "five";
                        break;
                    case 6:
                        nameDigit1 = "six";
                        break;
                    case 7:
                        nameDigit1 = "seven";
                        break;
                    case 8:
                        nameDigit1 = "eight";
                        break;
                    case 9:
                        nameDigit1 = "nine";
                        break;

                }
                switch (digit2) {
                    case 1:
                        switch (digit3){
                            case 1:
                                nameDigit2="eleven";
                                break;
                            case 2:
                                nameDigit2="twelve";
                                break;
                            case 3:
                                nameDigit2="thirteen";
                                break;
                            case 4:
                                nameDigit2="forteen";
                                break;
                            case 5:
                                nameDigit2="fifteen";
                                break;
                            case 6:
                                nameDigit2="sixteen";
                                break;
                            case 7:
                                nameDigit2="seventeen";
                                break;
                            case 8:
                                nameDigit2="eighteen";
                                break;
                            case 9:
                                nameDigit2="nineteen";
                                break;
                        }
                        digit3=0;
                        break;
                    case 2:
                        nameDigit2 = "twenty";
                        break;
                    case 3:
                        nameDigit2 = "thirty";
                        break;
                    case 4:
                        nameDigit2 = "forty";
                        break;
                    case 5:
                        nameDigit2 = "fifty";
                        break;
                    case 6:
                        nameDigit2 = "sixty";
                        break;
                    case 7:
                        nameDigit2 = "seventy";
                        break;
                    case 8:
                        nameDigit2 = "eighty";
                        break;
                    case 9:
                        nameDigit2 = "ninety";
                        break;
                }
                switch (digit3) {
                    case 1:
                        nameDigit3 = "one";
                        break;
                    case 2:
                        nameDigit3 = "two";
                        break;
                    case 3:
                        nameDigit3 = "three";
                        break;
                    case 4:
                        nameDigit3 = "four";
                        break;
                    case 5:
                        nameDigit3 = "five";
                        break;
                    case 6:
                        nameDigit3 = "six";
                        break;
                    case 7:
                        nameDigit3 = "seven";
                        break;
                    case 8:
                        nameDigit3 = "eight";
                        break;
                    case 9:
                        nameDigit3 = "nine";
                        break;

                }

            System.out.printf("%3d is called : %s hundred and%s %s", number, nameDigit1, nameDigit2, nameDigit3);
        }

    }
}
