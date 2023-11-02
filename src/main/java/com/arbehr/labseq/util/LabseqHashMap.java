package com.arbehr.labseq.util;

import java.util.HashMap;

public class LabseqHashMap {
    
    private final HashMap<Integer, Integer> labSeqHashMap;

    public LabseqHashMap() {
        this.labSeqHashMap = new HashMap<>();
    }

    public void insert(Integer n, Integer result) {
        this.labSeqHashMap.put(n, result);
    }

    public boolean exist(Integer n) {
        return this.labSeqHashMap.containsKey(n);
    }

    public Integer getResult(Integer n) {
        return this.labSeqHashMap.get(n);
    }
}
