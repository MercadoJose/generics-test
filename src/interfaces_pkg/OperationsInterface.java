package interfaces_pkg;

public interface OperationsInterface<T> {

    T product(int index1, int index2);
    T maxValue(T collection);
    T minValue(T collection);
    T sum(int index1, int index2);

}
