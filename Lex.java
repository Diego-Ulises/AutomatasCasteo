public class Lex {
	
	private int tipo; // 0-byte,1-boolean,2-char,3-short,4-int,5-long,6-float,7-double
	private int valInt;
	private float valFloat;
	private char valChar;
	private byte valByte;
	private short valShort;
	private long valLong;
	private double valDouble;

	Lex() {
		this.valChar = '\0';
		this.valInt = 0;
		this.valFloat = 0;
		this.valByte=0;
		this.valShort=0;
		this.valLong=0;
		this.valDouble=0;
	}

	Lex(int v) {
		this.valInt = v;
		this.tipo = 4;
	}

	Lex(float v) {
		this.valFloat = v;
		this.tipo = 6;
	}

	Lex(char v) {
		this.valChar = v;
		this.tipo = 2;
	}
	
	Lex(byte v) {
		this.valByte = v;
		this.tipo = 2;
	}
	
	Lex(short v) {
		this.valShort = v;
		this.tipo = 2;
	}

	Lex(long v) {
		this.valLong = v;
		this.tipo = 2;
	}

	Lex(double v) {
		this.valDouble = v;
		this.tipo = 2;
	}
	public int getValInt() {
		return valInt;
	}

	public float getValFloat() {
		return valFloat;
	}

	public char getValChar() {
		return valChar;
	}

	public byte getValByte() {
		return valByte;
	}

	public short getValShort() {
		return valShort;
	}

	public long getValLong() {
		return valLong;
	}

	public double getValDouble() {
		return valDouble;
	}

	public int getTipo() {
		return tipo;
	}

	public void setValInt(int v) {
		this.valInt = v;
	}

	public void setValFloat(float v) {
		this.valFloat = v;
	}

	public void setValChar(char v) {
		this.valChar = v;
	}

	public void setValByte(byte v) {
		this.valByte = v;
	}

	public void setValShort(short v) {
		this.valShort = v;
	}

	public void setValLong(long v) {
		this.valLong = v;
	}

	public void setValDouble(double v) {
		this.valDouble = v;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}