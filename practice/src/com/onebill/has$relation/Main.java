package com.onebill.has$relation;

public class Main {

	public static void main(String[] args) {
		
		Battery battery = new Battery();
		battery.brand = "Dell";
		battery.capacity = 20000;
		
		Rom rom = new Rom();
		rom.type = "DDR4";
		rom.size = 16;
		rom.clockSpeed = 2.4;
		
		Screen screen = new Screen();
		screen.brand = "Samsung";
		screen.resolution = 1380;
		screen.size = 64;
		
		Laptop laptop = new Laptop();
		laptop.brand = "Mac" ;
		laptop.price = 100000;
		laptop.rom = rom;
		laptop.screen = screen;
		laptop.battery = battery;
//		System.out.println(battery);
//		System.out.println(rom);
//		System.out.println(screen);
		System.out.println(laptop);
		
		
	}
}
