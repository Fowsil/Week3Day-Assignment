package org.college;

import java.util.ArrayList;
import java.util.List;

public class Department extends College {
public void dept() {
	List<String> dptName=new ArrayList<String>();
	dptName.add("B.Com");
	dptName.add("BCA");
	dptName.add("B.Sc");
	dptName.add("B.A.");
	System.out.println("Departments in college : "+dptName);
}
}
