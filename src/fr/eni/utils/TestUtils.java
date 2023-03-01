package fr.eni.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestUtils {

	public static void main(String[] args) {
		// Génère le hash SHA-1 de la chaîne MdP, convertit le byte[] en hexString, l'affiche pour vérif 
		// et teste si l'opération inverse (conversion de la hexString vers un byte[]) fonctionne
		String MdP = "Password";
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-1");
			byte[] hash = md.digest(MdP.getBytes());
			String hash2str = UtilsString.byteArrToHexStr(hash);
			
			
			
			byte[] hash2 = UtilsString.hexStrToByteArr(hash2str);
			System.out.println(hash2str);
			if (hash != null && hash2 != null) {				
				int l = hash.length, l2 = hash2.length, i = 0;
				boolean eq = (l == l2);
				while (eq && i < l) {
					eq = eq && (hash[i] == hash2[i]);
					i++;
				}
				System.out.println(eq);
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
