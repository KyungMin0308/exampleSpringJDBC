package com.kyungmin.exampleSpringJDBC.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kyungmin.exampleSpringJDBC.dao.OfferDao;
import com.kyungmin.exampleSpringJDBC.model.Offer;

public class MainApp {

	public static void main(String[] args) {
		//Spring Container 생성
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/kyungmin/exampleSpringJDBC/conf/beans.xml");
		
		//offerDao Bean 가져오기
		OfferDao offerDao = (OfferDao) context.getBean("offerDao");
		
		//Read
		System.out.println("Row count: " + offerDao.getRowCount()); //전체 개수
		
		List<Offer> offerList = offerDao.getAllOffer(); //전체 offer
		for(Offer o: offerList)
			System.out.println(o);
		
		//Create(Insert)
		Offer offer = new Offer();
		offer.setName("charile");
		offer.setEmail("charile@naver.com");
		offer.setText("Create method test");
		
		if(offerDao.insert(offer))
			System.out.println("insert success.");
		else
			System.out.println("insert fail.");
		
		//Update
		offer = offerDao.getOffer("charile");
		offer.setName("trudy");
		
		if(offerDao.update(offer))
			System.out.println("update success.");
		else
			System.out.println("update fail.");
		
		//Delete
		offer = offerDao.getOffer("trudy");
		System.out.println(offer);
		
		if(offerDao.delete(offer.getId()))
			System.out.println("delete success.");
		else
			System.out.println("delete fail.");
		
		context.close();

	}

}
