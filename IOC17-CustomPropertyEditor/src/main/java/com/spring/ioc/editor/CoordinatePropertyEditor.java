package com.spring.ioc.editor;

import java.beans.PropertyEditorSupport;

import com.spring.ioc.beans.Coordinate;

public class CoordinatePropertyEditor extends PropertyEditorSupport {
	
		@Override
		public void setAsText(String value) {
			String[] values = value.split(",");
			float xCoordinate = Float.parseFloat(values[0]);
			float yCoordinate = Float.parseFloat(values[1]);
			Coordinate coordinate = new Coordinate();
			coordinate.setxCoordinate(xCoordinate);
			coordinate.setyCoordinate(yCoordinate);
			setValue(coordinate);
		}
}
