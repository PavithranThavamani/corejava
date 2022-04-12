package com.onebill.penannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Primary
public class BallPen implements Pen {

	public void write() {
		System.out.println("Written using BallPen");
		
	}

	
}
