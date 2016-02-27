package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getValue() {
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		int i = 0;
		for (i = 2; i <= iValue / 2; i++) {
			if (iValue % i != 0)
				return true;
		}

		return false;
	}

	public static boolean isEven(int iValue) {
		return isEven(iValue);
	}

	public static boolean isOdd(int iValue) {
		return isOdd(iValue);
	}

	public static boolean isPrime(int iValue) {
		return isPrime(iValue);
	}

	public static boolean isEven(MyInteger x) {
		return MyInteger.isEven(x.getValue());
	}

	public static boolean isOdd(MyInteger x) {
		return MyInteger.isOdd(x.getValue());
	}

	public static boolean isPrime(MyInteger x) {
		return MyInteger.isPrime(x.getValue());
	}
	 public boolean equals(int n){
	        return iValue == n;
	    }

	    public boolean equals(MyInteger x){
	        return equals(x.getValue());
	    }
}
