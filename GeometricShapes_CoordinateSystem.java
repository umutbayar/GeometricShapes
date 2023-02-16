import java.util.Scanner;

public class GeometricShapes_CoordinateSystem {
	/*In this project,our purpose is to get the shape that the user wants to be displayed on the screen
	 * and the length of this shape.We will do this in a loop and if the user wants to end our loop will end  
	 name=Umut surname=Bayar ID=150120043
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int geometricshapes,a,b,c,d,e,f,radius;
		do {
		System.out.println("Which shape would you like to draw?");
		System.out.println("1. Line\r\n" + 
				"2. Triangle\r\n" + 
				"3. Rectangle\r\n" + 
				"4. Parabola\r\n" + 
				"5. Circle\r\n" + 
				"6.Exit");
		geometricshapes=scan.nextInt();
			if(geometricshapes==1) {
				System.out.println("Line formula is y = ax + b");
				System.out.println("Please enter the coefficients a and b: ");
				a=scan.nextInt();
				b=scan.nextInt();
				line(a,b);
			}
			else if(geometricshapes==2) {
				System.out.println("For triangle, we need the coordinates of the points for three vertices.");
			System.out.println("Please enter the coordinates of 3 vertices a, b, c, d, e, f: ");
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			d=scan.nextInt();
			e=scan.nextInt();
			f=scan.nextInt();
			triangle(a,b,c,d,e,f);
			}
		
			else if(geometricshapes==3) {
			System.out.println("For rectangle, we need the coordinates of the points for three vertices.");
			System.out.println("Please enter the coordinates of 3 vertices a, b, c, d, e, f:");
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			d=scan.nextInt();
			e=scan.nextInt();
			f=scan.nextInt();
			rectangle(a,b,c,d,e,f);
			}
		else if(geometricshapes==4) {
			System.out.println("Parabola formula is y = ax^2 + bx + c");
			System.out.println("Please enter the coefficients a, b and c:");
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			parabola(a,b,c);
		}
			else if(geometricshapes==5) {
			System.out.println("Circle formula is (x-a)^2 + (y-b)^2 = r^2");
			System.out.println("Please enter the coordinates of the center (a,b) and the radius:");
			a=scan.nextInt();
			b=scan.nextInt();
			radius=scan.nextInt();
			circle(a,b,radius);
		}
		} while(geometricshapes!=6);
	}
	public static void line (int a,int b) {
		for (int y = 10; y >= -11; y--) {
			for (int x = -10; x <= 11; x++) {
				if (y == 0) {
					if ((a * x + b) == 0)
						 System.out.print("*");
					else if (x == 0)
						 System.out.print("|");
					else if (x == 11)
						 System.out.print("x");
					else
					    System.out.print("-");
				} 
				else if ((a * x + b) == y)
					System.out.print("*");
				else if (x == 0) {
					if (y == 10)
					    System.out.print("y");
					else
					    System.out.print("|");
				}
				else
				    System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("\n");
		}
	
	public static void triangle(int a,int b,int c,int d,int e,int f) {
		for (int y = 10; y >= -11; y--) {
			for (int x = -10; x <= 11; x++) {
				 if(y==0) {
					if (x == 0)
						 System.out.print("|");
					else if (x == 11)
						 System.out.print("x");
					else
					    System.out.print("-");
				}
				else if(x==0) {
							if (y == 10)
						    System.out.print("y");
							else if(c==0) {
								if(y==d||y==b)
								System.out.print("*");
								else 
						    System.out.print("|");
							}
							else
					    System.out.print("|");
				}
					else if(x<=Math.min(a,e)&&x>=Math.max(a,e)) {
						if(y==b)
						System.out.print("*");
					else
						System.out.print(" ");
					}
					else if(x<=0&&x>=a) {
						if((y==(((d-b)/a)*(x-c))+d))
						System.out.print("*");
						else
							System.out.print(" ");
					}
					else if(x<=e&&x>=0)
						if((y==(((b-d)/a)*(x-c))+d))
							System.out.print("*");
							else
								System.out.print(" ");
					else 
					System.out.print(" ");
				}
			System.out.println("");
		}
		System.out.println("\n");
	}
	public static void rectangle(int a,int b,int c,int d,int e,int f) {
		for (int y = 10; y >= -11; y--) {
			for (int x = -10; x <= 11; x++) {
				 if(y==0) {
						if(b>0&&f<0) {
							if(x==a||x==c)
								System.out.print("*");
							
							else if (x == 0)
								 System.out.print("|");
							else if (x == 11)
								 System.out.print("x");
							else
							    System.out.print("-");
							}
						else if(((b>0)&&f>0)||(b<0&&f<0)) {
							if (x == 0)
								 System.out.print("|");
							else if (x == 11)
								 System.out.print("x");
							else
							    System.out.print("-");
						}
						}
					else if(x==0) {
						if(c>0&&a<0) {
							if(y==b||y==f) {
								System.out.print("*");
							}
							else if (y == 10)
								    System.out.print("y");
								else
								    System.out.print("|");
						}
						else if((a<0&&c<0)||(a>0&&c>0)) {
							if (x == 0)
								 System.out.print("|");
							else if (x == 11)
								 System.out.print("x");
							else
							    System.out.print("-");
						}
					}
						else if(x==a||x==c) {
							if(y<=b&&y>=f)
								System.out.print("*");
							else 
								System.out.print(" ");				
						}
						else if(y==b||y==f) {
							if(x<c&&x>a)
								System.out.print("*");
							else 
								System.out.print(" ");
						}
					else
					    System.out.print(" ");
				}
				System.out.println("");
			}
			System.out.println("\n");
			}
	public static void parabola(int a,int b,int c) {
		for (int y = 10; y >= -11; y--) {
			for (int x = -10; x <= 11; x++) {
				if (y == 0) {
					if ((a*x*x + b*x+c) == 0)
						 System.out.print("*");
					else if (x == 0)
						 System.out.print("|");
					else if (x == 11)
						 System.out.print("x");
					else
					    System.out.print("-");
				}
				else if ((a*x*x + b*x+c) == y)
					System.out.print("*");
				else if (x == 0) {
					if (y == 10)
					    System.out.print("y");
					else
					    System.out.print("|");
				}
				else
				    System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("\n");
		}
	public static void circle(int a,int b,int radius) {
		for (int y = 10; y >= -11; y--) {
			for (int x = -10; x <= 11; x++) {
				if(y==0) {
					if((x-a)*(x-a)+(y-b)*(y-b)==radius*radius)
						System.out.print("*");
					else if (x == 0)
						 System.out.print("|");
					else if (x == 11)
						 System.out.print("x");
					else
					    System.out.print("-");
				}
				else if((x-a)*(x-a)+(y-b)*(y-b)==(radius*radius))
					System.out.print("*");
				else if (x == 0) {
				if (y == 10)
				    System.out.print("y");
				else
				    System.out.print("|");
			}
			else
			    System.out.print(" ");
		}
		System.out.println("");
	}
	System.out.println("\n");
	}		
	}