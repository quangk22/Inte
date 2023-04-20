package advance.dev.dao;

import advance.dev.model.Shape;

public interface IManager {
	void add(Shape shape);
	void remove(Shape shape);
	Shape[] all();
	void sort();
	Shape findMaxChuVi();
}
