import java.util.Scanner;

public class horoscope {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int day,month;

        System.out.print("Birthday :");
        day = sc.nextInt();

        System.out.print("Month of Birth");
        month = sc.nextInt();

        if(month == 1) {
            if(day >= 1 && day <= 31) {
                if(day < 22) {
                    System.out.println("Capricorn");
                }else {
                    System.out.println("Aquarius"); 
                } 
            } else {
                System.out.println("Day is not Valid");
            }
        }

        else if(month==2) {
            if(day >= 1 && day <=28) {
                if(day < 20) {
                    System.out.println("Aquarius");
                } else {
                    System.out.println("Pisces");
                }
            } else {
                System.out.println("Day is not Valid");
            }
        }

        else if(month==3) {
            if(day >= 1 && day <=31) {
                if(day < 22) {
                    System.out.println("Pisces");
                } else {
                    System.out.println("Aries");
                }
            } else {
                System.out.println("Day is not Valid");
            }
        }

        else if(month==4) {
            if(day >= 1 && day <=30) {
                if(day < 22) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Taurus");
                }
            } else {
                System.out.println("Day is not Valid");
            }
        }

        else if(month==5) {
            if(day >= 1 && day <=30) {
                if(day < 23) {
                    System.out.println("Taurus");
                } else {
                    System.out.println("Gemini");
                }
            } else {
                System.out.println("Day is not Valid");
            }
        }

        else if(month==6) {
            if(day >= 1 && day <=30) {
                if(day < 24) {
                    System.out.println("Gemini");
                } else {
                    System.out.println("Cancer");
                }
            } else {
                System.out.println("Day is not Valid");
            }
        }

        else if(month==7) {
            if(day >= 1 && day <=30) {
                if(day < 24) {
                    System.out.println("Gemini");
                } else {
                    System.out.println("Cancer");
                }
            } else {
                System.out.println("Day is not Valid");
            }
        }

        else if(month==8) {
            
        }

        else if(month==9) {
            
        }

        else if(month==10) {
            
        }

        else if(month==11) {
            
        }

        else if(month==12) {
            
        }
    }
}
