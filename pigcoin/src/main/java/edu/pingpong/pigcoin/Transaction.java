package edu.pingpong.pigcoin;

import java.security.PublicKey;

public class Transaction {
    
    private String hash = null; //Identificador de la transacción en el Blockchain
    private String prev_hash = null; //Identificador de la transacción previa donde se originaron los pigcoins que ahora pretendes gastar
    private PublicKey pKey_sender = null; //Dirección pública de la wallet desde la que se envían los pigcoins. (Clave pública de Wallet)
    private PublicKey pKey_recipient = null; //Dirección pública de la wallet a la que se envían los pigcoins. (Clave pública de Wallet)
    private double pigCoins = 0d; //Cantidad de pigcoins que se envían
    private String message = null; //Mensaje que acompaña la transacción y que escribe el usuario que los envía
    private byte[] signature = null; //Es el mensaje message firmado con la clave privada del usuario que envía la transacción

    public Transaction(){
        //Constructor
    }

    public Transaction(String hash, String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient, double pigcoins, String message) {
        this.hash = hash;
        this.prev_hash = prev_hash;
        this.pKey_sender = pKey_sender;
        this.pKey_recipient = pKey_recipient;
        this.pigCoins = pigcoins;
        this.message = message;
    }
    
    public String getHash(){
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPrev_hash() {
        return prev_hash;
    }

    public void setPrev_hash(String prev_hash) {
        this.prev_hash = prev_hash;
    }

    public PublicKey getpKey_sender() {
        return pKey_sender;
    }

    public void setpKey_sender(PublicKey pKey_sender) {
        this.pKey_sender = pKey_sender;
    }

    public PublicKey getpKey_recipient() {
        return pKey_recipient;
    }

    public void setpKey_recipient(PublicKey pKey_recipient) {
        this.pKey_recipient = pKey_recipient;
    }

    public double getPigCoins() {
        return pigCoins;
    }

    public void setPigCoins(double pigCoins) {
        this.pigCoins = pigCoins;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "\n" + "hash = "+ this.hash + "\n" + 
                "prev_hash = " + this.prev_hash + "\n" +
                "pKey_sender = " + getpKey_sender().hashCode() + "\n" +
                "pKey_recipient = " + getpKey_recipient().hashCode() + "\n" +
                "pigcoins = " + getPigCoins() + "\n" +
                "message = " + getMessage() +  "\n";
    }
}
