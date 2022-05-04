package data_types;

public class ByteDataType {                      // size = 1 byte (8 bits) --> -128 to 127

	public static void main(String[] args) {
		
		byte myByte1, myByte2;
		myByte1 = 127;
		myByte2 = -48;
		System.out.println("Byte 1: " + myByte1);
		System.out.println("Byte 2: " + myByte2);
		myByte1++;   // Looping back within the range
		System.out.println("Increamented value of myByte1: " + myByte1);
	}

}
