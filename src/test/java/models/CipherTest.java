package models;

import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void newCipher_instantiatesCorrectly() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals(true, testCipher instanceof Cipher);
    }

    @Test
    public void newCipher_readsAString_a() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals("a", testCipher.getStatement());
    }

    @Test
    public void newCipher_readsKey_2() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals(2, testCipher.getKey());
    }
    @Test
    public void newCipher_substituteLetter_b() {
        Cipher testCipher = new Cipher("a", 2);
        assertEquals("b", testCipher.toEncrypt());
    }
    @Test
    public void newCipher_substituteLetterByKey_c(){
        Cipher testCipher = new Cipher("a", 2);
        assertEquals("c",testCipher.isEncrypted("a", 2));
    }
    @Test
    public void newCipher_substituteMultipleLettersByKeys_cde(){
        Cipher testCipher = new Cipher("cde", 2);
        assertEquals("abc",testCipher.toDecrypt("cde",2));
    }
    @Test
    public void newCipher_encryptAStringByKey_ab(){
        Cipher testCipher = new Cipher("yz", 2);
        assertEquals("ab",testCipher.isEncrypted("yz",2));
    }
    @Test
    public void newCipher_decryptAStringByKey_yz(){
        Cipher testCipher = new Cipher("ab", 2);
        assertEquals("yz",testCipher.toDecrypt( "ab",2));
    }
}