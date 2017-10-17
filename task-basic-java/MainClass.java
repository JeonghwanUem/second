package FirstClass;

import java.util.Scanner;


public class MainClass  {

	
	public static void main(String[] args) {//¸ŞÀÎ ÇÔ¼ö¸¦ ±â¾ïÇÏ°í Ä¥ ¼ö ÀÖÀ¸¸é ´õ ÁÁ´Ù 
	
		
		
	/* 1. teacher class ¹è¿­À» »ı¼ºÇÑ´Ù. »çÀÌÁî´Â 3
	 2. ¹Ø¿¡¿Í °°Àº ¸Ş´º È­¸éÀ» ±¸¼ºÇÑ´Ù 
	--------------
	 ¸Ş´º
	//1.µî·Ï ÀÌ¸§ ³ªÀÌ ¼ºº° °ú¸ñÀ» ÀÔ·Â¹Ş´Â´Ù 
	2.Ãâ·Â
	0.Á¾·á
	----------------
	3.»ç¿ëÀÚ·Î ºÎÅÍ ¹øÈ£¸¦ ÀÔ·Â¹Ş¾Æ¼­ teacher °´Ã¼ Á¤º¸¸¦ »ı¼ºÇÑ´Ù 
	4.»ı¼ºÇÑ teacher°´Ã¼´Â ¹è¿­¿¡ ´ã¾Æ¼­ ÀúÀåÇÑ´Ù
	Ãâ·Â ¸Ş´º¸¦ ´©¸£¸é µî·ÏµÈ °´Ã¼ÀÇ Á¤º¸´Ù ÀüºÎ Ãâ·ÂµÈ´Ù 
	0¹øÀ» ´©¸£±â Àü±îÁö ¸Ş´º°¡ °è¼Ó Ãâ·ÂµÈ¾î¾ß ÇÑ´Ù 
	*/
		int menu;
		int count = 0;
		int i, j;
		Scanner scan = new Scanner(System.in);
		Teacher teacher = new Teacher();
		Teacher t[] = new Teacher[3];

		while (true) {
			System.out.println("1.µî·Ï  \r\n" + "2.Ãâ·Â\r\n" + "0.Á¾·á");
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				if (count == 3) {

					System.out.println("´õ ÀÌ»ó µî·ÏÇÒ ¼ö ¾ø½À´Ï´Ù.");
					break;
				}

				System.out.println("ÀÌ¸§");
				teacher.setName(scan.next());
				System.out.println("³ªÀÌ");
				teacher.setAge(scan.nextInt());
				System.out.println("¼ºº°");
				teacher.setGender(scan.next());
				System.out.println("°ú¸ñ");
				teacher.setSubject(scan.next());

				t[count] = teacher;// new Teacher(teacher.getName(), teacher.getAge(), teacher.gerGender(),
									// teacher.getSubject());
	
	
				boolean flag = false; 			// ¡ç ¿©±â¼­ ºÎÅÍ ¿À´Ã ¼ö¾÷ÇÑ ³»¿ë. Ã³À½ÀÔ·Â °ªÀÌ¶û ´ÙÀ½ÀÔ·Â°ªÀÌ °°ÀºÁö È®ÀÎÇÏ´Â ÄÚµå

				for (i = 0; i < count; i++) { 	// toStringÀº ÁÖ¼Ò°ª¸¸ºñ±³ ÇÏ°í equals´Â ¸ğµç°ª

					if (!t[i].equals(teacher)) { 	// ¡ç Ã³À½ ÀÔ·Â °ª ÀÌ¶û ´ÙÀ½°ª ºñ±³ ÄÚµå
						flag = true; 				// °°À¸¸é true
					} else {
						flag = false;			 // Æ²¸®¸é false
						break;						 // break ·Î ¹İº¹¹® Á¾·á
					} 								// º¹¹®? ¹®º¹? ®G.. ²É±æ¸¸ °È°í ½Í³ë..¤¸¤µ
				}
													// Ã³À½ Á¶°Ç¹®ÀÌ ÀÛµ¿ ÇÏÁö ¾Ê¾Æ¼­ flag°ªÀÌ flase¶ó¼­ if °¡ ÀÛµ¿À»ÇØ¼­
				if (count != 0) {
					if (flag == false) { // ³Ö¾îÁØ ÄÚµå
						i--;
						System.out.println("ÀÌ¹Ì µî·ÏµÇ¾î ÀÖ½À´Ï´Ù.");
						continue;// ¸¸¾à ÀúÀåµÈ °ª°ú ÀÔ·Â°ªÀÌ °°À¸¸é ÀÛµ¿µÈ´Ù
					}

				}
				count++;	
				
				break;
	
			case 2:
				System.out.println("Ãâ·Â");

				for (i = 0; i < count; i++) {

					System.out.println(t[i]);
				}
				break;

			case 0:
				System.out.println("Á¾·á");
				return;
			}
	

		/*	Human h1= new Teacher("¼±»ı´Ô1",20,"³²ÀÚ", "¼öÇĞ");
			Human h2; 
			Teacher t3 = new Teacher();
			h2 = t3; 
			Human h2= new Teacher("¼±»ı´Ô2",21,"¿©Áö", "¿µ¾î");
			
			Teacher t1 = (Teacher)h1;
			Teacher t2= (Teacher)h2;
			System.out.println(x);
			
			if (h1 instanceof Teacher) {
				System.out.println("teacher °´Ã¼");
				
			}
			else if (h1 instanceof Student) {
				System.out.println("student °´Ã¼");
		}*/
			
			/*boolean flag = false; 
			int y = 0;
			if ( y !=0) {
			for (y = 0; y< count; y++) {
				
				if(!(t[y].equals(t))) {
					flag =true;
				}
				else if (t[y]==null) {
					flag = false;
					break;
				}
				else {
					flag = false;
					break;
				}
				if (!(t instanceof Teacher[]))
					return false; 
				*/


				

			
			
			}
			}
}

		


	
	


	

