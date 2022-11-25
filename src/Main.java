import java.util.Scanner; // импортируем класс
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0, temp;
        System.out.print("Ведите новый объект для массива:");
        if(sc.hasNextInt()) {temp = sc.nextInt();
        }else{System.out.print("Вы ввели неккоректные данные. попытайтесь ещё раз позже.");return;
        }
        int s=0;int min=0, max=0;
        min = temp;max = temp;
        System.out.print("Введите новое число для заполнения массива");
        System.out.print("\nили введите любой не-циферный символ чтобы прекратить:");
        while(sc.hasNextInt()){
            temp = sc.nextInt();
            System.out.print("Введите новое число для заполнения массива");
            System.out.print("\nили введите любой не-циферный символ чтобы прекратить:");
            s+=temp;n++;
            if(temp>max){max = temp;
            }else if (temp<min){min = temp;
            }
        }
        System.out.print("Сумма членов массива:");
        System.out.print(s);
        System.out.print("\nМинимум массива:");
        System.out.print(min);
        System.out.print("\nМаксимум массива:");
        System.out.print(max);
    }
}