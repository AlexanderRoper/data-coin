package com.cryptoccurency.csc404.datacoin.util;

import java.util.ArrayList;

public interface Wallet {
    /*
     * Wallet class
     */

    // Amount in Wallet
    public void getSeedBalance();

    // Get transaction history
    public ArrayList<String> getPreviousTransactions();

    // Create 256-bit keys
    public String generatePrivateKey();

    public String generatePrivateKey();

    // Store 256-bit keys
    public void storePrivateKey();

    public void storePublicKey();

    // Combined seed words for wallet access
    public void setSeedPhrase(String[] phrases);

    public void checkSeedPhrase(String[] phrases);
}