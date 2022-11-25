import java.util.Scanner; // импортируем класс
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите размер массива:");
        int n;
        if(sc.hasNextInt()) {
            n = sc.nextInt();
        }else{
            System.out.print("Вы ввели неккоректные данные. попытайтесь ещё раз позже.");
            return;
        }
        int[] mas = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Ведите новый объект для массива:");
            if(sc.hasNextInt()) {mas[i] = sc.nextInt();}
            else{System.out.print("Вы ввели неккоректные данные. попытайтесь ещё раз позже.");return;}
        }

    }
}