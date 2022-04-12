package com.onebill.penannotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Qualifier
public class SketchPen implements Pen  {

	public void write() {
		System.out.println("Written using SketchPen");
		
	}

}
