import java.util.Scanner;

public class Main {


    public static void zad1_1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zad1_1:\nPodaj numer dnia tygodnia: ");
        int dzienTygodnia = scan.nextInt();
        String dzien = "";
        switch (dzienTygodnia) {
            case 1:
                dzien = "Poniedziałek";
                break;
            case 2:
                dzien = "Wtorek";
                break;
            case 3:
                dzien = "Środa";
                break;
            case 4:
                dzien = "Czwartek";
                break;
            case 5:
                dzien = "Piątek";
                break;
            case 6:
                dzien = "Sobota";
                break;
            case 7:
                dzien = "Niedziela";
                break;
            default:
                dzien = "niepoprawny numer dnia tygodnia";
        }
        System.out.println("Jest to: " + dzien);
    }

    public static void zad1_2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zad1_2:\nPodaj nazwe miesiąca:");
        String miesiac = scan.nextLine();
        String poraRoku = "";
        switch (miesiac) {
            case "marzec":
            case "kwiecień":
            case "maj":
                poraRoku = "wiosna";
                break;
            case "czerwiec":
            case "lipiec":
            case "sierpień":
                poraRoku = "lato";
                break;
            case "wrzesień":
            case "październik":
            case "listopad":
                poraRoku = "jesień";
                break;
            case "grudzień":
            case "styczen":
            case "luty":
                poraRoku = "zima";
                break;
            default:
                poraRoku = "niepoprawna nazwa miesiąca";
        }
        System.out.println("Jest to: " + poraRoku);
    }

    public static void zad1_3() {
        boolean popr = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Zad1_3:\nPodaj pierwszą liczbę:");
        int a = scan.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = scan.nextInt();
        System.out.println("Podaj znak działania (+, -, /, *");
        char znak = scan.next().charAt(0);
        int wynik = 0;
        switch (znak) {
            case '+':
                wynik = a + b;
                break;
            case '-':
                wynik = a - b;
                break;
            case '/':
                wynik = a / b;
                break;
            case '*':
                wynik = a * b;
                break;
            default:
                System.out.println("Niepoprawny znak działania");
                popr = false;
                break;
        }
        if (popr) {
            System.out.println("Wynik to: " + wynik);
        }
    }

    public static void zad2_1() {
        int[] tab = new int[3];
        tab[0] = 1;
        tab[1] = 3;
        tab[2] = 6;
        System.out.println("Zad2_1:");
        for (int i = 0; i < 3; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void zad2_2() {
        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        tab1[0] = 3;
        tab1[1] = 89;
        tab1[2] = 237;
        tab1[3] = 67;
        tab1[4] = 34;
        tab1[5] = 486;
        tab1[6] = 426;
        tab1[7] = 12;
        tab1[8] = 5;
        tab1[9] = 4;

        for (int i = 0; i < 10; i++) {
            tab2[9 - i] = tab1[i];
        }
        System.out.println("Zad2_2:\nTablica 1:\tTablica 2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(tab1[i] + "\t\t\t" + tab2[i]);
        }
    }

    public static void zad2_3() {
        System.out.println("Zad2_3:\nPodaj liczbę do sprawdzenia:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        boolean jest = true;
        int i = 1;
        while (jest && (i < a - 1)) {
            i++;
            if ((a % i) == 0) {
                jest = false;
                System.out.println("To nie jest liczba pierwsza.");
            }
        }
        if (jest) {
            System.out.println("Jest to liczba pierwsza.");
        }

    }

    public static void zad2_4() {
        System.out.println("Zad2_4:");
        int[][] tab = new int[10][10];
        for (int i = 0; i < 10; i++) {
            String linijka = "";
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    tab[i][j] = j + 1;
                }
                if (j == 0) {
                    tab[i][j] = i + 1;
                }
                if (i > 0 && j > 0) {
                    tab[i][j] = tab[0][j] * tab[i][0];
                }
                linijka += tab[i][j] + "\t";
            }
            System.out.println(linijka);


        }

    }

    public static void zad2_5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zad2_5:\nPodaj wysokosc choinki:");
        int wysokosc = scan.nextInt();
        for (int i = 1; i <= wysokosc; i++) {
            String linijka = "";
            for (int j = wysokosc; j > i; j--) {
                linijka += " ";
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                linijka += "*";
            }
            System.out.println(linijka);
        }
    }

    public static void main(String[] args) {
        zad1_1();
        System.out.println("");
        zad1_2();
        System.out.println("");
        zad1_3();
        System.out.println("");
        zad2_1();
        System.out.println("");
        zad2_2();
        System.out.println("");
        zad2_3();
        System.out.println("");
        zad2_4();
        System.out.println("");
        zad2_5();
    }
}
