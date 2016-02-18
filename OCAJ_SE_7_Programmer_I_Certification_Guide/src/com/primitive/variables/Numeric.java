package com.primitive.variables;

public class Numeric {

	// INTEGERS

	byte _8bitsByte;
	short _16bitsShort;
	int _32bitsInt;
	long _64bitsLong;

	// UNDERSCORES IS PART OF THE LITERAL VALUES

	// int baseDecimal = 100_14230_12;
	int baseOctal = 0123;

	// int baseHexadecimal = 0X1a249_AF;
	// int baseBinaria = 0B100100_1101;
	// long longBaseDecimal = 1223_243_234L;

	// int failInteger = Integer.parseInt("123_23");
	// FAILS TO COMPILE

	public static void main(String[] args) {
		Numeric numeric = new Numeric();

		// 8 bits 2^8 = 256 possibilities RANGE -128 to 127
		numeric._8bitsByte = 127;
		// 16 bits 2^16 = 65536 possibilities RANGE -32768 to 32767
		numeric._16bitsShort = -32768;
		// 32 bits 2^32 = 4294967296 possibilities RANGE -2147483648 to
		// 2147483647
		numeric._32bitsInt = 2147483647;
		// 64 bits 2^64 = 18446744073709551616 possibilities RANGE
		// -9223372036854775808 to 9223372036854775807
		numeric._64bitsLong = 9223372036854775807L;

		// int var1Octal = 0_123;
		// int var2Octal = 012;
		// System.out.println(var1Octal + var2Octal);
		
		int decimal = 123;
		int octal = 04323;
		int hexadecimal = 0x123B;
		int binario = 0b1_1;
		System.out.println(binario);
		
		long num = 10096543350L,num1 = 1L;
		int val = (int)num;
		System.out.println(val);

	}

}
