public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    public interface Supplier<T> {
        T get();
    }

    public interface Predicate<T> {
        boolean test(T t);
    }

    public interface Consumer<T> {
        void accept(T t);
    }

    public interface UnaryOperator<T> {
        T apply(T t);
    }

    public interface BinaryOperator<T> {
        T apply(T t1, T t2);
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;


    BinaryOperator<Integer> devide = (x, y) -> x / y;


    UnaryOperator<Integer> pow = x -> x * x;

    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
