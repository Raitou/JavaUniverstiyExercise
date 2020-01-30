public interface AccountSecurity{
	public static final int MINIMUM_CHARACTERS = 8;
	public static final String DEFAULT_USER = "jlandales";
	public static final String DEFAULT_PASS = "Pa$$w0rd";
	public abstract boolean isUpper();
	public abstract boolean isLower();
	public abstract boolean isSpecial();
	public abstract boolean isNumber();
	public abstract boolean isEmptyUser();
	public abstract boolean isEmptyPass();
	public abstract boolean isGreater();
}