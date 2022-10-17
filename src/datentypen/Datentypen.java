package datentypen;

import edu.princeton.cs.introcs.StdIn;

public class Datentypen {
	static byte b1;
	static byte b2;
	static short s1;
	static short s2;
	static int i1;
	static int i2;
	static long l1;
	static long l2;
	public static void main(String[] args) {

		b1 = StdIn.readByte();
		s1 = StdIn.readShort();
		i1 = StdIn.readInt();
		l1 = StdIn.readLong();
		
		b2 = b1;
	    b2 = (byte) s1;
	    b2 = (byte) i1;
	    b2 = (byte) l1;
	    s2 = b1;
	    s2 = s1;
	    s2 = (short) i1;
	    s2 = (short) l1;
	    i2 = b1;
	    i2 = s1;
	    i2 = i1;
	    i2 = (int) l1;
	    l2 = b1;
	    l2 = s1;
	    l2 = i1;
	    l2 = l1;
	    // Man kann einen großen Datentypen nicht ohne Weiteres in einen kleineren Datentypen converten.
	    // Folge: Datenverlust oder wie Laura sagen würde: ERROR
		System.out.println(b2);
	}

}
