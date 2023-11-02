package com.arbehr.labseq.controllers;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arbehr.labseq.services.LabseqService;

@RestController
@RequestMapping("/labseq")
public class LabseqController {

    @Autowired
    private LabseqService labSeqService;

    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
    @GetMapping("/{n}")
    public ResponseEntity<String> calculateLabSeq(@PathVariable String n) {
        try {
            int number = Integer.parseInt(n);
            if (number < 0) {
                return new ResponseEntity<>("The number must be any non-negative integer.", HttpStatus.BAD_REQUEST);
            }
            BigInteger result = labSeqService.calcLabSeq(number);
            return new ResponseEntity<>(result.toString(), HttpStatus.OK);
        }
        catch (NumberFormatException ex){
            return new ResponseEntity<>("The number must be any non-negative integer.", HttpStatus.BAD_REQUEST);
        }
        
    }
}
