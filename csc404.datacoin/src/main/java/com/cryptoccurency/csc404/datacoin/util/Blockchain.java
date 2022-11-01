package com.cryptoccurency.csc404.datacoin.util;

import java.util.ArrayList;

public interface Blockchain {
    /*
     * BlockChain class
     */
    //Blockchain constructor.

    //Get blockchain from json
    public ArrayList<Block> getBlockchain();

    //Add block to existing chain
    public void addBlock();

    @Override
    public int hashCode();

    @Override
    public boolean equals(Object obj);

}
