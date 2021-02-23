package edu.pingpong.pigcoin;

import java.security.PublicKey;

public class Transaction {
    
    private int hash; //Identificador de la transacción en el Blockchain
    private int prev_hash; //Identificador de la transacción previa donde se originaron los pigcoins que ahora pretendes gastar
    private PublicKey pKey_sender; //Dirección pública de la wallet desde la que se envían los pigcoins. (Clave pública de Wallet)
    private PublicKey pKey_recipient; //Dirección pública de la wallet a la que se envían los pigcoins. (Clave pública de Wallet)
    private int pigCoins; //Cantidad de pigcoins que se envían
    private String message; //Mensaje que acompaña la transacción y que escribe el usuario que los envía
    private byte[] signature; //Es el mensaje message firmado con la clave privada del usuario que envía la transacción

    public Transaction(){
        //Constructor
    }

    

}
