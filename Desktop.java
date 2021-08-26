package org;

public class Desktop extends Computer {
public void dsktpsize() {
	System.out.println("Desktop Size :  Web 1920(1920*1080)");
	}
	public static void main(String[] args) {
		Computer cmp=new Computer();
		cmp.compModel();
		Desktop dsk=new Desktop();
		dsk.dsktpsize();
		
	}
}
