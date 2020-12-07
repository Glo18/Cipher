package models;

public class Cipher {
    private String mStatement;
    private int mKey;

    public Cipher(String Statement, int Key) {
        mStatement = Statement;
        mKey = Key;
    }
    public String getStatement() {
        return mStatement;
    }
    public int getKey() {
        return mKey;
    }
    public String toEncrypt() {
        mStatement = "b";
        return mStatement;
    }
    public String isEncrypted(String statement, int key) {
        String results = "";
        StringBuffer encrypted = new StringBuffer();

        for (int i = 0; i < statement.length(); i++) {
            int encrypt = statement.charAt(i);
            if (encrypt + key > 122) {
                char encrypts = (char) (encrypt - 26 + key);
                encrypted.append(encrypts);
            }
            else {
                char encrypts = (char) (encrypt + (key % 26));
                encrypted.append(encrypts);
            }
        }
        results +=encrypted;
        return results;
    }
    public String toDecrypt(String statement, int key) {
        String results = "";
        StringBuffer decrypted = new StringBuffer();

        for (int i = 0; i < statement.length(); i++) {
            int decrypt = statement.charAt(i);

            if ((decrypt - key > 71) && (decrypt - key < 97) ) {
                char decrypts = (char) (decrypt + 26 - key);
                decrypted.append(decrypts);
            }
            else {
                char decrypts = (char) (decrypt - (key % 26));
                decrypted.append(decrypts);
            }
        }
        results += decrypted;
        return results;
    }

}