package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class alien {
         private String aname ;
         private String tech ;
         private int uid;
         @Autowired
         @Qualifier("lap1")
         private laptop laptop ;
         
         
         
        
		public alien() {
			super();
			
			System.out.println("object created");
			
			
			
			
		}
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		public String getTech() {
			return tech;
		}
		public void setTech(String tech) {
			this.tech = tech;
		}
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		
         public void show() {
        	 System.out.println("show");
        	 laptop.compile();
         }
		public laptop getLaptop() {
			return laptop;
		}
		public void setLaptop(laptop laptop) {
			this.laptop = laptop;
		}
         
	
	
}
