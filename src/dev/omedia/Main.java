package dev.omedia;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PositiveNegativeZero.checkNumber(0);
        SpeedConverter.printConversion(95.75);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(EqualSumChecker.hasEqualSum(1,1,1));
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(AreaCalculator.area(5.0));
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        IntEqualityPrinter.printEqual(1, 2, 3);
        System.out.println(PlayingCat.isCatPlaying(true, 44));
        NumberInWord.printNumberInWord(3);
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(SumOddRange.sumOdd(13, 13));
        System.out.println(NumberPalindrome.isPalindrome(121));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(SharedDigit.hasSharedDigit(12,13));
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        FactorPrinter.printFactors(32);
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
        System.out.println(PerfectNumber.isPerfectNumber(6));
        NumberToWords.numberToWords(100);
        System.out.println(FlourPacker.canPack(0,5,5));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
//        InputCalculator.inputThenPrintSumAndAverage();
        DiagonalStar.printSquareStar(5);
    }
}

class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23) return false;
        if(barking && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }
        return false;
    }
}

class LeapYear {
    public static boolean isLeapYear(int year){
        if(!(year >= 1 && year<= 9999)) return false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }
}

class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        int intX = (int) (x * 1000);
        int intY = (int) (y * 1000);

        if(intX == intY) return true;

        return false;
    }
}

class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c){
        if(a + b == c) return true;

        return false;
    }
}

class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c){
        if((a >= 13 && a <=19) || (b >= 13 && b <=19) || (c >= 13 && c <=19)) return true;

        return false;
    }

    public static boolean isTeen(int a){
        if(a >= 13 && a <=19) return true;

        return false;
    }
}

class AreaCalculator {
    public static double area(double radius){
        if(radius < 0) return -1.0;
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0) return -1.0;

        return x * y;
    }
}

class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else {
            long hours = minutes / 60;
            long days = hours /24;
            int years = (int) days/365;
            int reminderDays = (int) days % 365;
            System.out.println(minutes + " min = "+ years + " y and "+reminderDays + " d");
        }
    }
}

class IntEqualityPrinter {
    public static void printEqual(int a, int b, int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        }else if (a == b && a == c){
            System.out.println("All numbers are equal");
        }else if(a != b && a != c && b != c){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
}

class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if(temperature>=25 && temperature <= 45){
                return true;
            }
            return false;
        }else {
            if(temperature>=25 && temperature<=35){
                return true;
            }
            return false;
        }
    }
}

class NumberInWord {
    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}

class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) return false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999) return -1;
        switch(month){
            case 1:
                return 31;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return 0;
        }
    }
}
class SumOddRange {
    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }
        if(number % 2 != 0){
            return true;
        }else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        if(end < start || start <= 0 || end <= 0) return -1;
        int sum = 0;
        for(int i = start; i<= end; i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }
}

class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int num = Math.abs(number);
        int reverse = 0;
        while(num > 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        return reverse == Math.abs(number);
    }
}

class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0) return -1;
        int lastDigit = number % 10;
        int firstDigit = number % 10;
        while(number / 10 > 0){
            firstDigit = number / 10;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }
}

class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0) return -1;
        int sum = 0;
        while(number > 0){
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }
}

class SharedDigit {
    public static boolean hasSharedDigit(int x, int y){
        if(x < 10 || x > 99 || y < 10 || y > 99) return false;
        int originalY = y;
        while(x > 0){
            int xLastDigit = x % 10;
            while(y > 0){
                int yLastDigit = y % 10;
                if(xLastDigit == yLastDigit) return true;
                y /= 10;
            }
            y = originalY;
            x /= 10;
        }
        return false;
    }
}

class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){

            int aLastDigit = a % 10;
            int bLastDigit = b % 10;
            int cLastDigit = c % 10;
            if(aLastDigit == bLastDigit || aLastDigit == cLastDigit || bLastDigit == cLastDigit){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    public static boolean isValid(int x){
        if(x < 10 || x > 1000) return false;

        return true;
    }
}

class FactorPrinter {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        } else {
            for(int i=1; i<=number; i++){
                if(number % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}

class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10) return -1;
        int greatest = 0;
        for(int i = 1; i <= first; i++){
            if(first % i == 0 && second % i == 0){
                if(i > greatest){
                    greatest = i;
                }
            };
        }
        return greatest;

    }
}

class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number < 1) return false;
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0) sum+= i;
        }
        if(sum == number) return true;
        return false;
    }
}

class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }else {
            int count = getDigitCount(number);
            int reversedNum = reverse(number);
            for(int i=count; i>0 ; i--){
                int lastDigit = reversedNum % 10;
                switch(lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                }
                reversedNum /= 10;
            }
        }
    }
    public static int reverse(int number){
        boolean isNegative = false;
        if(number < 0){
            isNegative = true;
        }
        number = Math.abs(number);
        int count = getDigitCount(number);
        int reverseNum = 0;
        for(int i=count; i>0 ; i--){
            int lastNum = number % 10;
            reverseNum = reverseNum * 10 + lastNum;
            number /= 10;
        }
        if(isNegative) return -reverseNum;
        return reverseNum;
    }

    public static int getDigitCount(int number){
        if(number < 0) return -1;
        if(number == 0) return 1;
        int count = 0;
        while(number != 0){
            count += 1;
            number /= 10;
        }
        return count;
    }
}

class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;
        while(goal > 0){
            if(goal % 5 == 0 && bigCount > 0){
                goal -= 5;
                bigCount--;
            }else if(smallCount > 0){
                goal--;
                smallCount--;
            }else{
                break;
            }
        }
        if(goal == 0) return true;
        return false;

    }
}

class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1) return -1;
        int largestPrime = 0;
        for(int i=2; i<=number; i++){
            boolean isPrime = true;
            if(number % i == 0){
                for(int j=2; j<i; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }
}

class DiagonalStar {
    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        }else {

            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();

            for (int i = 2; i <= number - 1; i++) {
                for (int j = 1; j <= number; j++) {
                    System.out.print(((j == 1) || (j == number) || (j == i) || (j == number - i + 1)) ? "*" : " ");
                }
                System.out.println();
            }

            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
        }
    }

}

class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int input;
        int count = 1;
        int sum = 0;
        long avg = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                input = scanner.nextInt();
                sum += input;
                avg = Math.round((double)sum / count);
                count++;
            }catch (InputMismatchException e){
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = "+avg);
    }
}

class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0|| extraBuckets < 0) return -1;
        int neededAmount = (int) Math.ceil((width * height) / areaPerBucket);
        return neededAmount - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        return (int) Math.ceil((width * height) / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(area / areaPerBucket);
    }
}