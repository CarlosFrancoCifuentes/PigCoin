package edu.pingpong.pigcoin;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BlockChain {
    
    List<Transaction> transactions = new ArrayList<Transaction>();

    public BlockChain(){

    }

    public List<Transaction> getTransactions(){
        return this.transactions;
    }

    public void addOrigin(Transaction transaction){
        getTransactions().add(transaction);
    }

    public void summarize(){
        for(Transaction transaction : getTransactions()){
            System.out.println(transaction.toString());
        }
    }

    public void summarize(int index){
        System.out.println(this.transactions.get(index).toString());
    }

    public double[] loadWallet(PublicKey address){

        double pigCoinsIn = 0d;
        double pigCoinsOut = 0d;

        for (Transaction transaction : transactions){
            if (address.equals(transaction.getpKey_recipient())){
                pigCoinsIn += transaction.getPigCoins();
            }
            if (address.equals(transaction.getpKey_sender())){
                pigCoinsOut += transaction.getPigCoins();
            }
        }

        double[] pigcoins = {pigCoinsIn, pigCoinsOut};
        return pigcoins;
    }
    
    public List<Transaction> loadInputTransactions(PublicKey address){
        List<Transaction> inputTransactions = getTransactions().stream().filter(transactions -> transactions.getpKey_recipient().equals(address)).collect(Collectors.toList());
        return inputTransactions;
    }

    public List<Transaction> loadOutputTransactions(PublicKey address){
        List<Transaction> outputTransactions = getTransactions().stream().filter(transactions -> transactions.getpKey_sender().equals(address)).collect(Collectors.toList());
        return outputTransactions;
    }

    public boolean isSignatureValid(PublicKey pKeySender, String message, byte[] signedTransaction){
        return GenSig.verify(pKeySender, message, signedTransaction);
    }

    public boolean isConsumedCoinValid(double[] consumedCoins){
        
    }

    public void processTransactions(PublicKey sender, PublicKey recipient, double consumedCoins, String signedTransaction){

    }
}
