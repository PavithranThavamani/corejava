package com.onebill.penannotations;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class InkPen implements Pen  {

	public void write() {
		System.out.println("Written using InkPen");
		
	}

	
}
