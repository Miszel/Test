package task41;

public interface Promotion {

    boolean isApplicable(Cart cart);

    float apply(Order order);
}
