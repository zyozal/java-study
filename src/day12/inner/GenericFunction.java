package day12.inner;

public interface GenericFunction<X, Y> {
    //  X를 주면 Y를 추출해줄게
    Y apply(X x);
}
