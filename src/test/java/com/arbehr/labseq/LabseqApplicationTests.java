package com.arbehr.labseq;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.arbehr.labseq.services.LabseqService;

@SpringBootTest
class LabseqApplicationTests {

	private final LabseqService labseqService = new LabseqService();

	@Test
	public void testLabSeq() {
		BigInteger result = labseqService.calcLabSeq(0);
		assertEquals(new BigInteger("0"), result);

		result = labseqService.calcLabSeq(1);
		assertEquals(new BigInteger("1"), result);

		result = labseqService.calcLabSeq(2);
		assertEquals(new BigInteger("0"), result);

		result = labseqService.calcLabSeq(3);
		assertEquals(new BigInteger("1"), result);

		result = labseqService.calcLabSeq(4);
		assertEquals(new BigInteger("1"), result);

		result = labseqService.calcLabSeq(5);
		assertEquals(new BigInteger("1"), result);

		result = labseqService.calcLabSeq(6);
		assertEquals(new BigInteger("1"), result);

		result = labseqService.calcLabSeq(7);
		assertEquals(new BigInteger("2"), result);

		result = labseqService.calcLabSeq(8);
		assertEquals(new BigInteger("2"), result);

		result = labseqService.calcLabSeq(9);
		assertEquals(new BigInteger("2"), result);

		result = labseqService.calcLabSeq(10);
		assertEquals(new BigInteger("3"), result);
	}

	@Test
	void contextLoads() {
	}

}
