package com.cryptoccurency.csc404.datacoin.util;

import java.util.ArrayList;

public interface Block {
        /*
        * Block class will be rewritten in Block, Block header
        * format described in fctional design and
        */
	//Block Constructor.

	//Calculate new hash based on blocks contents
	public String calculateHash();

	//Increases nonce value until hash target is reached.
	public void mineBlock(int difficulty);

	//There will be a transaction class

	//Add transactions to this block
	public boolean addTransaction(String transaction);

	public String getHash();

	public void setHash(String hash);

	public String getPreviousHash();

	public void setPreviousHash(String previousHash);

	public String getMerkleRoot();

	public void setMerkleRoot(String merkleRoot);

	public ArrayList<String> getTransactions();

	public void setTransactions(ArrayList<String> transactions);

	public long getTimeStamp();

	public void setTimeStamp(long timeStamp);

	public int getNonce();

	public void setNonce(int nonce);

	@Override
	public int hashCode();

	@Override
	public boolean equals(Object obj);

}
