package tp_algo_base_java;

public class Tp4 {
	public static void dix() {
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
	}

	public static void nPremiersEntiers(int n) {
		for (int i=0; i<n; i++) {
			System.out.println(i);
		}
	}

	public static void nPremiersCarres(int n) {
		for (int i=0; i<n; i++) {
			System.out.println(i*i);
		}
	}

	public static void nPremiersPairs(int n) {
		for (int i=0; i<n; i++) {
			if (i%2==0) System.out.println(i*i);
		}
	}

	public static void nPremiersImpairs(int n) {
		for (int i=0; i<n; i++) {
			if (i%2==1) System.out.println(i*i);
		}
	}

	public static void dixFoisCoucou() {
		for (int i=0; i<10; i++) {
			System.out.println("Coucou !");
		}
	}

	public static void nFoisCoucou(int n) {
		for (int i=0; i<n; i++) {
			System.out.println("Coucou !");
		}
	}

	public static int sommeNPremiersEntiers(int n) {
		int res=0;
		for (int i=0; i<n; i++) {
			res = res + i;
		}
		return res;
	}

	public static int sommeNPremiersCarres(int n) {
		int res=0;
		for (int i=0; i<n; i++) {
			res = res + i*i;
		}
		return res;
	}

	public static int sommeNPremiersPairs(int n) {
		int res=0;
		for (int i=0; i<n; i++) {
			if (i%2==0) res = res + i;
		}
		return res;
	}

	public static int sommeNPremiersImpairs(int n) {
		int res=0;
		for (int i=0; i<n; i++) {
			if (i%2==1) res = res + i;
		}
		return res;
	}

	public static int sommeNPremiersPairsCarres(int n) {
		int res=0;
		for (int i=0; i<n; i++) {
			if (i%2==0) res = res + i*i;
		}
		return res;
	}

	public static int toto(int n) {
		int res=0;
		for (int i=0; i<n; i++) {
			if (i%3==0) res = res + i;
		}
		return res;
	}

	public static int toto2(int n, int k) {
		int res=0;
		for (int i=0; i<n; i++) {
			if (i%k==0) res = res + i;
		}
		return res;
	}

	public static void main(String[] args) {
		//dix();
		nPremiersEntiers(11);
		nPremiersCarres(11);
		nPremiersPairs(11);
		nPremiersImpairs(11);
		dixFoisCoucou();
		nFoisCoucou(11);
		System.out.println(sommeNPremiersEntiers(11));
		System.out.println(sommeNPremiersCarres(11));
		System.out.println(sommeNPremiersPairs(11));
		System.out.println(sommeNPremiersImpairs(11));
		System.out.println(sommeNPremiersPairsCarres(11));
		System.out.println(toto(10));
		System.out.println(toto2(11, 5));
	}

}
