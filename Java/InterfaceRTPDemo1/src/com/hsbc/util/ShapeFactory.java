package com.hsbc.util;

import java.util.HashMap;
import java.util.Map;

import com.hsbc.service.Cone;
import com.hsbc.service.Cylinder;
import com.hsbc.service.IShape;
import com.hsbc.service.Sphere;

public class ShapeFactory {
	
	private static Map<String,IShape> smap = new HashMap<>();
	
	static {
		smap.put("cone",Cone.getCone());
		smap.put("cylinder",Cylinder.getCylinder());
		smap.put("sphere", Sphere.getSphere());
	}
	 public static IShape getShape(String shape) {
		 return smap.get(shape);
	 }

}