package com.arbehr.labseq;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.arbehr.labseq.services.LabseqService;

@SpringBootTest
class LabseqApplicationTests {

	private final LabseqService labseqService = new LabseqService();

	@Test
	public void testLabSeq() {
		int result = labseqService.calcLabSeq(0);
		assertEquals(0, result);

		result = labseqService.calcLabSeq(1);
		assertEquals(1, result);

		result = labseqService.calcLabSeq(2);
		assertEquals(0, result);

		result = labseqService.calcLabSeq(3);
		assertEquals(1, result);

		result = labseqService.calcLabSeq(4);
		assertEquals(1, result);

		result = labseqService.calcLabSeq(5);
		assertEquals(1, result);

		result = labseqService.calcLabSeq(6);
		assertEquals(1, result);

		result = labseqService.calcLabSeq(7);
		assertEquals(2, result);

		result = labseqService.calcLabSeq(8);
		assertEquals(2, result);

		result = labseqService.calcLabSeq(9);
		assertEquals(2, result);

		result = labseqService.calcLabSeq(10);
		assertEquals(3, result);
	}

	@Test
	void contextLoads() {
	}

}
