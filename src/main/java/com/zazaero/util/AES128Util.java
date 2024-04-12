package com.zazaero.util;

import org.springframework.stereotype.Component;

import java.util.Base64;
import java.util.Objects;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Component
public class AES128Util {

    private static final String initVector = "rkddl402";
    private static String secretKey;
    public String encrypt_new(String text, String opt) {

        if(Objects.equals(opt, "SESS")) {
            secretKey = "%ie84h->MRComtf!7ro@&9f8";
        } else {
            secretKey = "1*10Q{f2MRComt!7ros.&9f8";
        }

        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(secretKey.getBytes("UTF-8"),"AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(text.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public static String decrypt(String text, String opt) {

        if(Objects.equals(opt, "SESS")) {
            secretKey = "%ie84h->MRComtf!7ro@&9f8";
        } else {
            secretKey = "1*10Q{f2MRComt!7ros.&9f8";
        }
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(secretKey.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(Base64.getDecoder().decode(text));
            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
