package main.server;

import java.util.ArrayList;

import pojos.Cpu;
import pojos.Hardware;
import pojos.Leds;
import pojos.Ssd;
import pojos.VideoCard;

public class Mocker {

	public static ArrayList<Hardware> getHardwareList(){
		
		VideoCard vga1 = new VideoCard(
				"GTX 750 Ti",
				"NVidia",
				950F,
				2,
				1.085F,
				128,
				"PCyes");
		
		VideoCard vga2 = new VideoCard(
				"GTX 3060 Ti",
				"NVidia",
				9000F,
				8,
				5.085F,
				256,
				"Asus");
		
		Cpu cpu1 = new Cpu(
				"Intel Core i7-7700K",
				"Intel",
				1000,
				3.6F,
				16,
				7,
				16);
		
		Leds led1 = new Leds(
				"Led FPS plus",
				"Leds+",
				500,
				10,
				5,
				2);
		
		Ssd ssd1 = new Ssd(
				"Samsung EVO",
				"Samsung",
				400,
				240F,
				500F,
				400F,
				10000000,
				false);
		
		ArrayList<Hardware> array = new ArrayList<>();
		array.add(led1);
		array.add(cpu1);
		array.add(vga1);
		array.add(vga2);
		array.add(ssd1);
		
		
		return array;
	}
}
