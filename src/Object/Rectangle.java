package Object;

public class Rectangle {
private String ab; 
private String bc;
private String cd;
private String da;
private points a;
 private points b; 
 private points c;
 private points d;
public Rectangle(points a, points b, points c, points d) {
	this.a = a;
	this.b = b;
	this.c = c;
	this.d = d;
}
public points getA() {
	return a;
}
public void setA(points a) {
	this.a = a;
}
public points getB() {
	return b;
}
public void setB(points b) {
	this.b = b;
}
public points getC() {
	return c;
}
public void setC(points c) {
	this.c = c;
}
public points getD() {
	return d;
}
public void setD(points d) {
	this.d = d;
}
public String getAb() {
	return ab;
}
public void setAb(String ab) {
	this.ab = ab;
}
public String getBc() {
	return bc;
}
public void setBc(String bc) {
	this.bc = bc;
}
public String getCd() {
	return cd;
}
public void setCd(String cd) {
	this.cd = cd;
}
public String getDa() {
	return da;
}
public void setDa(String da) {
	this.da = da;
}

}
