package org.prathyusha;

import org.prathyusha.service.FactoryService;
import org.prathyusha.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        //ShapeService shapeService=ctx.getBean("shapeService",ShapeService.class);
        //shapeService.getCircle();      
       
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
				

		shapeService.getCircle();
       
	}

}
