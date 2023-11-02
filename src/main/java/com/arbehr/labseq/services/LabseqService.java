package com.arbehr.labseq.services;

import java.math.BigInteger;

import org.springframework.stereotype.Service;

import com.arbehr.labseq.util.LabseqHashMap;

@Service
public class LabseqService {
    
    private final LabseqHashMap labseqHashMap;

    public LabseqService() {
        this.labseqHashMap = new LabseqHashMap();
    }

    public BigInteger calcLabSeq(int n) {
        if (labseqHashMap.exist(n)) {
            return labseqHashMap.getResult(n);
        }

        if (n == 0 || n == 2) {
            return new BigInteger("0");
        }
        if (n == 1 || n == 3) {
            return new BigInteger("1");
        }
        
        BigInteger result = calcLabSeq(n - 4).add(calcLabSeq(n - 3));
        labseqHashMap.insert(n, result);
        
        return result;
    }
}
