package edu.pingpong.pigcoin;

import java.security.KeyPair;
import java.util.Map;

public class PigCoin {

    public static void main( String[] args )
    {
        /**
         * Crea una wallet
         * Genera las claves privada y publica de la wallet 
         */

        System.out.println("\n" + "Ver clave Privada y clave Pública de una wallet" + "\n" + 
                                  "==============================================="        );
                       
        Wallet wallet_1 = new Wallet();
        KeyPair pair = GenSig.generateKeyPair();
        wallet_1.setSK(pair.getPrivate());
        wallet_1.setAddress(pair.getPublic());

        System.out.println("\n Direccion de la Wallet_1: \n" +  wallet_1.getAddress().hashCode());

        /**
         * Crea una segunda wallet, esta vez generando sus claves
         * con un metodo wallet.generateKeyPair() que encapsula
         * el codigo de la anterior historia de usuario
         */

        Wallet wallet_2 = new Wallet();
        wallet_2.generateKeyPair();

        System.out.println("\n Direccion de la Wallet_2: \n" + wallet_2.getAddress().hashCode());
    }
}
