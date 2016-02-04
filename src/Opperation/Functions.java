package Opperation;

import Object.Contains;
import Object.Rectangle;
import Object.points;

public class Functions {


	public void Setup(Rectangle A) {
		ResetRec(A);
		A.setAb(findLine(A.getA(), A.getB()));
		A.setBc(findLine(A.getB(), A.getC()));
		A.setCd(findLine(A.getC(), A.getD()));
		A.setDa(findLine(A.getD(), A.getA()));

	}

	/*
	 * set up rectangle for easier comparison 
	 * with A being bottom right
	 * B being bottom left
	 * C top right
	 * D top left
	 */
	public void ResetRec(Rectangle A) {

		for (double v = 0; v < 16; v++) {
			for (double i = 0; i < 3; i++) {
				if (i == 0) {
					double temp = Compareint(A.getC().getY(), A.getD().getY());
					if (temp > 0) {
						points c = A.getC();
						A.setC(A.getD());
						A.setD(c);
					}
				}
				if (i == 1) {
					double temp = Compareint(A.getB().getY(), A.getC().getY());
					if (temp > 0) {
						points c = A.getB();
						A.setB(A.getC());
						A.setC(c);
					}
				}
				if (i == 2) {
					double temp = Compareint(A.getA().getY(), A.getB().getY());
					if (temp > 0) {
						points c = A.getA();
						A.setA(A.getB());
						A.setB(c);
					}
				}

			}

		}
		if (Compareint(A.getA().getX(), A.getB().getX()) < 0) {
			points c = A.getA();
			A.setA(A.getB());
			A.setB(c);
		}
		;
		if (Compareint(A.getC().getX(), A.getD().getX()) > 0) {
			points c = A.getC();
			A.setC(A.getD());
			A.setD(c);
		}
		;

	}

	/*
	 * fiqures out if two Rectangles interset Contain has value in they do
	 */
	public double compareTointersect(Rectangle RA, Rectangle RB, Contains contains) {
		for (double i = 0; i < 4; i++) {
			double temp = 0;
			String LA = "";
			points A = null;
			points B = null;
			points C = null;
			if (i == 0) {
				LA = RA.getAb();
				A = RA.getA();
				B = RA.getB();
				C= RA.getC();
			}
			if (i == 1) {
				LA = RA.getBc();
				A = RA.getB();
				B = RA.getC();
				C= RA.getD();
			}
			if (i == 2) {
				LA = RA.getCd();
				A = RA.getC();
				B = RA.getD();
				C= RA.getA();
			}
			if (i == 3) {
				LA = RA.getDa();
				A = RA.getD();
				B = RA.getA();
				C= RA.getB();
			}
			for (double v = 0; v < 4; v++) {
				String LB = "";
				points A1 = null;
				points B1 = null;
				points C1= null;
				if (v == 0) {
					LB = RB.getAb();
					A1 = RB.getA();
					B1 = RB.getB();
					C1 = RB.getC();
				}
				if (v == 1) {
					LB = RB.getBc();
					A1 = RB.getB();
					B1 = RB.getC();
					C1 = RB.getD();
				}
				if (v == 2) {
					LB = RB.getCd();
					A1 = RB.getC();
					B1 = RB.getD();
					C1 = RB.getA();
				}
				if (v == 3) {
					LB = RB.getDa();
					A1 = RB.getD();
					B1 = RB.getA();
					C1 = RB.getB();
				}
				temp = findIfLinesInterset(LA, LB, A, B, A1, B1, C ,C1);
				
				
				if (temp == 0) {
					System.out.println("Ajents");
					contains.ajents++;
				}
				if (temp == 1) {
					contains.intercept++;
				}
				
			}
		}

		return 0;
	}

	/*
	 * return 0 for adjent returns 1 for interset return -1 for not touch
	 */
	public double findIfLinesInterset(String LA, String LB, points A, points B, points A1, points B1, points C, points C1) {
		System.out.println( A.GetString() + " " +B.GetString()+ " " + A1.GetString() + " " +B1.GetString());
		double y1 = A.getY() - A1.getY();
		double y2 = A.getY() - B1.getY();
		if (LA.compareTo("verticle") == 0) {
			if (LB.compareTo("verticle") == 0) {
				if (A.getX() - A1.getX() == 0) {
					/*
					 * on same X
					 */
					System.out.println("double verticle");
					points J = new points(0, 0);
					points k = new points(0, 0);
					J.setX(A.getY() - A1.getY());
					J.setY(B.getY() - A1.getY());
					k.setX(A.getY() - B1.getY());
					k.setY(B.getY() - B1.getY());
				
					if (J.getX() == k.getX() && J.getY() == k.getY()) {
						
						/*
						 * they are adjent
						 */
						return 0;
					} else {
						return -1;
					}

				} else {
					/*
					 * do not intereset
					 * 
					 */
					return -1;
				}
			} else {

				/*
				 * second line not vertical
				 */
				System.out.println("answer to one line verticle " +OneLineVerticle(LB, A, B, A1, B1) );
				return OneLineVerticle(LB, A, B, A1, B1);
			}
		} else {
			if (LB.compareTo("verticle") == 0) {
				return OneLineVerticle(LA, A1, B1, A, B);
			} else {
				/*
				 * neither are verticle
				 */
				return BothLinearenotVerticle(LA, LB, A, B, A1, B1);
			}
		}
	}

	/*
	 * return 1 if line interect and -1 if they dont zero if they just touch
	 */
	public double BothLinearenotVerticle(String LA, String LB, points A, points B, points A1, points B1) {

		double m;
		double m1;
		double b;
		double b1;
		int holder = 0;
		String temp = "";
		for (int i = 0; LA.charAt(i) != 'x'; i++) {
			temp = temp + LA.charAt(i);
			holder = i;
		}

		m = Double.parseDouble(temp);
		holder++;
		holder++;

		temp = LA.substring(holder);
		b = Double.parseDouble(temp);
		holder = 0;
		temp = "";

		for (int i = 0; LB.charAt(i) != 'x'; i++) {
			temp = temp + LB.charAt(i);
			holder = i;
		}

		m1 = Double.parseDouble(temp);
		holder++;
		holder++;

		temp = LB.substring(holder);

		b1 = Double.parseDouble(temp);
		double bottom = m - m1;
		double x = 0;
		if (bottom != 0) {
			x = (b - b1) / bottom;
		}

		if ((A.getX() + x) * (B.getX() + x) < 0) {
			if ((A1.getX() + x) * (B1.getX() + x) < 0) {
				return 1;
			} else if ((A1.getX() + x) * (B1.getX() + x) == 0) {
				return 0;
			} else {

				return -1;
			}

		} else if ((A.getX() + x) * (B.getX() + x) == 0) {
			if ((A1.getX() + x) * (B1.getX() + x) < 0) {
				return -1;
			} else if ((A1.getX() + x) * (B1.getX() + x) == 0) {
				return 0;
			} else {
				return -1;
			}
		} else {
			return -1;
		}

	}
	/*
	 * for when one line vertical and the other is not
	 */

	public double OneLineVerticle(String LB, points A, points B, points A1, points B1) {
		int holder = 0;
		String temp = "";
		for (int i = 0; LB.charAt(i) != 'x'; i++) {
			temp = temp + LB.charAt(i);
			holder = i;
		}

		double m = Double.parseDouble(temp);
		holder++;
		holder++;
		temp = LB.substring(holder);

		double b = Double.parseDouble(temp);
		double y = A.getX() * m + b;

		if ((A.getY() - y) * (B.getY() - y) < 0) {
			if ((A1.getY() - y) * (B1.getY() - y) < 0) {

				/*
				 * it intersect
				 */
				return 1;
			} else {
				return -1;
			}
		} else if ((A.getY() - y) * (B.getY() - y) == 0) {
			/*
			 * they are adjent
			 */
			return 0;
		} else {
			/*
			 * they dont touch
			 * 
			 */
			return -1;
		}
	}

	/*
	 * returns 1 if contains within; return -1 if not
	 */
	public double findEqual(points a, points b, points c, points d) {
		if (a.getX() != b.getX() || a.getY() != b.getY()) {
			if (a.getX() != c.getX() || a.getY() != c.getY()) {
				if (a.getX() != d.getX() || a.getY() != d.getY()) {
					return 1;
				} else {
					return -1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
/*
 * for checking to see if Contained
 */
	public double CompareToContained(Rectangle RA, Rectangle RB, Contains contain) {
		points a = ComparePointOnRec(RA.getA(), RB.getA());
		points b = ComparePointOnRec(RA.getB(), RB.getB());
		points c = ComparePointOnRec(RA.getC(), RB.getC());
		points d = ComparePointOnRec(RA.getD(), RB.getD());
		System.out.println(a.GetString()+ " | "+ b.GetString() +" | " + c.GetString() + " | " +d.GetString());
		if (findEqual(a, b, c, d) == -1) {
			System.out.println("failed on a");
			return -1;
		} else if (findEqual(b, a, c, d) == -1) {
			System.out.println("failed on b");
			return -1;
		} else if (findEqual(c, b, a, d) == -1) {
			System.out.println("failed on c");
			return -1;
		} else if (findEqual(d, b, c, a) == -1) {
			System.out.println("failed on d");
			return -1;
		} else {
			contain.iscontain= true;
			return 1;
		}
	}

	/*
	 * if the x value is 0 they are vertical of each other if the x value is 1 B
	 * is to the right of A if the x value is -1 B is to the left of A * if the
	 * y value is 0 they are horizontal of each other if the y value is 1 B is
	 * to the above of A if the y value is -1 B is to the below of A
	 */
	public points ComparePointOnRec(points A, points B) {
		
		points c = new points(Compareint(B.getX(), A.getX()), Compareint(B.getY(), A.getY()));
		return c;
	}

	public double Compareint(double A, double B) {
		double C = A - B;
		if (C > 0) {
			return 1;
		}
		if (C < 0) {
			return -1;
		}
		if (C == 0) {
			return 0;
		}
		return -2;
	}

	public void ComparePoints(points A, points B) {
		double x1 = A.getX();
		double y1 = A.getY();
		double x2 = A.getY();
		double y2 = A.getY();
		double x = x2 - x1;
		double y = y2 - x1;
	}

	/*
	 * this function returns a line equation y= mx+ b where the point x is m and
	 * point y is b
	 */
	public String findLine(points A, points B) {
		double rize = B.getY() - A.getY();
		double run = B.getX() - A.getX();
		if (run == 0) {
			// the line is horizontal
			return "verticle";

		} else {
			double m = rize / run;
			double b = A.getY() - m * A.getX();
			if (b >= 0) {
				return Double.toString(m) + "x+" + Double.toString(b);
			} else {
				return Double.toString(m) + "x" + Double.toString(b);
			}

		}
	}
	/*
	 * checking to see if valid input
	 */
	public boolean ContainsLetter(String holder)
	{
		try{
			  int num = Integer.parseInt(holder);
			  return true;
			} catch (NumberFormatException e) {
			  return false;
			}
		
	}
}
