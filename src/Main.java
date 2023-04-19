public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);

    }
}

//https://github.com/Dmitros1980/core.liamda1.git

/* Программа не работает из-за того что b=0,в математике на ноль делить нельзя,если
 b!=0 то программа будет работать.А решить эту ошибку можно способом который предупредит что
  b=0.
 */
//godd







