class Triangle{
    private int base;
    private int height;
    public Triangle(int base,int height){
        this.base = base;
        this.height = height;
    }
    public double Cal_area(){
        return 0.5*base*height;
    }
    public void display(int i){
        System.out.println("The area"+i+" is : "+Cal_area());
    }
}
public class TriangleDataType
{
	public static void main(String[] args) {
	    Triangle t1 = new Triangle(17,14);
	    Triangle t2 = new Triangle(13,19);
	    Triangle t3 = new Triangle(11,21);

	    Triangle[] triangle = {t1, t2, t3};

	    double maxArea = triangle[0].Cal_area();
	    for(int i=0; i<triangle.length; i++){

	        triangle[i].display(i+1);

		    if(maxArea < triangle[i].Cal_area())
		        maxArea = triangle[i].Cal_area();
	    }

		System.out.println("Maximum area is : "+maxArea);
	}
}
