package com.arbehr.labseq.util;

import java.math.BigInteger;
import java.util.HashMap;

public class LabseqHashMap {
    
    private final HashMap<Integer, BigInteger> labSeqHashMap;

    public LabseqHashMap() {
        this.labSeqHashMap = new HashMap<>();
    }

    public void insert(Integer n, BigInteger result) {
        this.labSeqHashMap.put(n, result);
    }

    public boolean exist(Integer n) {
        return this.labSeqHashMap.containsKey(n);
    }

    public BigInteger getResult(Integer n) {
        return this.labSeqHashMap.get(n);
    }
}
