package com.arbehr.labseq.services;

import org.springframework.stereotype.Service;

import com.arbehr.labseq.util.LabseqHashMap;

@Service
public class LabseqService {
    
    private final LabseqHashMap labseqHashMap;

    public LabseqService() {
        this.labseqHashMap = new LabseqHashMap();
    }

    public int calcLabSeq(int n) {
        if (labseqHashMap.exist(n)) {
            return labseqHashMap.getResult(n);
        }

        if (n == 0 || n == 2) {
            return 0;
        }
        if (n == 1 || n == 3) {
            return 1;
        }
        
        int result = calcLabSeq(n - 4) + calcLabSeq(n - 3);
        labseqHashMap.insert(n, result);
        
        return result;
    }
}
