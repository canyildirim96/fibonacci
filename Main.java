import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
         * Eleman sayısını kullanıcı belirleyen döngülerle bir fibonacci serisi programı yazıyoruz.
         * Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
         * Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
         * yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
         * Fibonacci dizisi, 0'dan başlar ve sonsuza kadar.
         * Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.
         */

      int number;
      Scanner inp = new Scanner(System.in);

        System.out.print("Değer giriniz: ");
        number = inp.nextInt();
        int number1=0, number2=1, result;

        for (int i = 0; i<number; i++){
            result = number1 + number2;
            System.out.print(result + " ");
            number1 = number2;
            number2 = result;
        }

        /*
        for (int i=2; i<=100; i++){
            if (i==2 || i==3 || i==5 || i==7){
                System.out.print(i + " ");
                continue;
            }
            if (i%2 != 0 && i%3 !=0 && i%5!=0 && i%7!=0){
                System.out.print(i + " ");
            }
        }

        */
        /*
        int a=2;
        boolean isPrime = true;
        while (a<=100){
            for (int i = 2; i <10; i++) {
                if (a == i){
                    break;
                }
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
                }
                if (isPrime)
                    System.out.print(a + " ");

                    a++;
                    isPrime = true;
                }
        */

            }
        }




