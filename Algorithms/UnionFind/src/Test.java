
public class Test {

	public static void main(String[] args) {
		QuickUnionWUF uf = new QuickUnionWUF(10);
		uf.union(6, 9);
		uf.union(2, 7);
		uf.union(4, 0);
		uf.union(8, 7);
		uf.union(1, 2);
		uf.union(6, 4);
		uf.union(2, 3);
		uf.union(0, 3);
		uf.union(3, 5);
		uf.getAr();
		
	}

}
