import java.util.Scanner;
public class horoscope {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month, day;

        System.out.print("First month, Second day: ");
        month = input.nextInt();
        day = input.nextInt();

        if (month == 3  || month == 4) {
            if (month == 3 && day >= 21) {
                System.out.print("You are Aries");
            } else if (month == 4 && day <= 20) {
                System.out.print("You are Aries");
            }
        }
        if (month == 4  || month == 5) {
            if (month == 3 && day >= 21) {
                System.out.print("You are Taurus");
            } else if (month == 5 && day <= 21) {
                System.out.print("You are Taurus");
            }
        }
        if (month == 5  || month == 6) {
            if (month == 5 && day >= 22) {
                System.out.print("You are Gemini");
            } else if (month == 6 && day <= 22) {
                System.out.print("You are Gemini");
            }
        }
        if (month == 6  || month == 7) {
            if (month == 6 && day >= 23) {
                System.out.print("You are cancer");
            } else if (month == 7 && day <= 22) {
                System.out.print("You are cancer");
            }
        }
        if (month == 7  || month == 8) {
            if (month == 7 && day >= 23) {
                System.out.print("You are Leo");
            } else if (month == 8 && day <= 22) {
                System.out.print("You are Leo");
            }
        }
        if (month == 8  || month == 9) {
            if (month == 8 && day >= 23) {
                System.out.print("You are virgo");
            } else if (month == 9 && day <= 22) {
                System.out.print("You are virgo");
            }
        }
        if (month == 9  || month == 10) {
            if (month == 9 && day >= 23) {
                System.out.print("You are Libra");
            } else if (month == 10 && day <= 22) {
                System.out.print("You are Libra");
            }
        }
        if (month == 10  || month == 11) {
            if (month == 10 && day >= 23) {
                System.out.print("You are scorpio");
            } else if (month == 11 && day <= 21) {
                System.out.print("You are scorpio");
            }
        }
        if (month == 11  || month == 12) {
            if (month == 11 && day >= 22) {
                System.out.print("You are sagittarius");
            } else if (month == 12 && day <= 21) {
                System.out.print("You are sagittarius");
            }
        }
        if (month == 12  || month == 1) {
            if (month == 12 && day >= 22) {
                System.out.print("you are capricorn");
            } else if (month == 1 && day <= 21) {
                System.out.print("you are capricorn");
            }
        }
        if (month == 1  || month == 2) {
            if (month == 1 && day >= 22) {
                System.out.print("you are aquarius");
            } else if (month == 2 && day <= 19) {
                System.out.print("you are aquarius");
            }
        }
        if (month == 2  || month == 3) {
            if (month == 2 && day >= 20) {
                System.out.print("you are pisces");
            } else if (month == 3 && day <= 20) {
                System.out.print("you are pisces");
            }
        }
}
}