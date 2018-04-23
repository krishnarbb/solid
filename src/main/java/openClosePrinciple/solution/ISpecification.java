package openClosePrinciple.solution;

public interface ISpecification<T> {
	boolean isSatisfies(T item);
}
