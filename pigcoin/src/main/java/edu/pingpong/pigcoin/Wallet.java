package edu.pingpong.pigcoin;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Wallet extends GenSig{
    
    public PublicKey address; //Dirección pública o clave pública de la wallet (enviar y recibir pigcoins)
    private PrivateKey sKey; //Conocida solamente por el propietario de la wallet. Para firmar las transacciones y para que el blockchain pueda validar que son auténticas.
    private double total_input; //Total de pigcoins que han sido recibidos desde el comienzo del blockchain.
    private double total_output; //Total de pigcoins enviados desde el comienzo del blockchain.
    private double balance; //PigCoins que posee este usuario. PigCoins recibidos - enviados. No puede ser negativo
    private List<Transaction> inputTransactions; //Transacciones con destino a esta wallet.
    private List<Transaction> outputTransactions; //Transacciones con origen de esta wallet.

    public Wallet(){
        //Constructor
    }

    public PublicKey getAddress() {
        return this.address;
    }

    public void setAddress(PublicKey address) {
        this.address = address;
    }

    public void setSK(PrivateKey sKey) {
        this.sKey = sKey;
    }

    public PrivateKey getSKey(PrivateKey sKey){
        return this.sKey;
    }

    public void generateKeyPair(){
        
        KeyPair keyPair = GenSig.generateKeyPair();
        this.setSK(keyPair.getPrivate());
        this.setAddress(keyPair.getPublic());
    }

}
