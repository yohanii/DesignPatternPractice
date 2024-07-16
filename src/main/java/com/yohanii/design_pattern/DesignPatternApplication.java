package com.yohanii.design_pattern;

import com.yohanii.design_pattern.singleton.ARepository;
import com.yohanii.design_pattern.singleton.BRepository;
import com.yohanii.design_pattern.singleton.DBUtils;
import com.yohanii.design_pattern.strategy.DiscountService;
import com.yohanii.design_pattern.strategy.FixedDiscountStrategy;
import com.yohanii.design_pattern.strategy.PercentDiscountStrategy;
import com.yohanii.design_pattern.strategy.UnionDiscountStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DesignPatternApplication.class, args);

		//singleton check
		ARepository aRepository = new ARepository();
		BRepository bRepository = new BRepository();

		DBUtils dbA = aRepository.getDb();
		DBUtils dbB = bRepository.getDb();

		log.info("dbA : " + dbA);
		log.info("dbB : " + dbB);
		log.info("dbA == dbB : " + (dbA == dbB));

		//strategy check
		DiscountService discountService = new DiscountService(new UnionDiscountStrategy());
		discountService.setPrice(10000);
		discountService.print();
	}

}
