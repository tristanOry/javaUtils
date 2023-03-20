package fr.eni.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Utilities for String manipulation. Conversion from or to byte[], cutting in sized strings... 
 * @author tory
 *
 */
public class UtilsString {
	/**
	 * 
	 * @param data byte[]
	 * @return the conversion of data into an hex string (like hashes)
	 */
	public static String byteArrToHexStr(byte[] data) {
		StringBuilder sb = new StringBuilder();
		for (byte b: data) {
			sb.append(String.format("%02X", b));
		}
		return sb.toString();
	}
	 
	/**
	 * 
	 * @param str
	 * @param n
	 * @return a List of Strings who are sized to n chars, except the last who can be smaller
	 *  
	 */
	public static List<String> stripStrBySize(String str, int n){
		List<String> result = new ArrayList<>();
		int l = str.length();
		for (int i = 0; i < l; i += n ) {
			result.add(str.substring(i, Math.min(n + i, l)));
		}
		return result;
	}
	
	/**
	 * 
	 * @param str
	 * @return the byte[] corresponding to the hex string str
	 */	
	public static byte[] hexStrToByteArr(String str) {
		List<Byte> result = new ArrayList<>();
		
		byte[] bResult = new byte[result.size()];
		 stripStrBySize(str, 2).forEach(d -> {
			result.add((byte) Integer.parseInt(d, 16));
		});

		int i = 0;
		for (byte r: result) {
			bResult[i] =  r;
			i++;
		}
		return bResult;
	}
	
	/**
	 * 
	 * @param str
	 * @return the ascii string representing hexa characters 
	 */
	public static String hexStrToStr(String str) {
		StringBuffer sb = new StringBuffer();
		stripStrBySize(str, 2).forEach(s -> {
			sb.append((char) Integer.parseInt(s, 16));
		});
		return sb.toString();
	}
	
}
