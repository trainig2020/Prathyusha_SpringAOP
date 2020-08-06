package org.prathyusha.service;

import org.prathyusha.aspect.LoggingAspect;
import org.prathyusha.model.Circle;

public class ShapeServiceProxy extends ShapeService{

	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
     return super.getCircle();
	}
	
	
}
