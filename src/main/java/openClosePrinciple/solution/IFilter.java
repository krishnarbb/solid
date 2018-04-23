package openClosePrinciple.solution;

import java.util.List;

public interface IFilter<T> {
	List<T> filter(List<T> items, ISpecification<T> spec);
}
