package com.example.demo.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

  public static String md5Hash(String str) {
    try {
      MessageDigest m = MessageDigest.getInstance("MD5");
      m.reset();
      m.update(str.getBytes());
      byte[] digest = m.digest();
      BigInteger bigInt = new BigInteger(1, digest);
      StringBuilder hashtext = new StringBuilder(bigInt.toString(16));
      // Now we need to zero pad it if you actually want the full 32 chars.
      while (hashtext.length() < 32) {
        hashtext.insert(0, "0");
      }
      return hashtext.toString();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
      return str;
    }
  }
}
