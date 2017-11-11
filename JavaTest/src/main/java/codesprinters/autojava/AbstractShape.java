package codesprinters.autojava;

public abstract class AbstractShape implements Shapes {
	
	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

}
