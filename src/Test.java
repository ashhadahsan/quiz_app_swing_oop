import java.io.Serializable;

public class Test implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int getEng_marks() {
		return eng_marks;
	}
	public void setEng_marks(int eng_marks) {
		this.eng_marks = eng_marks;
	}
	public int getCs_marks() {
		return cs_marks;
	}
	public void setCs_marks(int cs_marks) {
		this.cs_marks = cs_marks;
	}
	public int getMaths_marks() {
		return maths_marks;
	}
	public void setMaths_marks(int maths_marks) {
		this.maths_marks = maths_marks;
	}
	private int eng_marks,cs_marks,maths_marks;
	
	public Test() {
		eng_marks=0;cs_marks=0;maths_marks=0;
		
	}
	public Test(int eng,int cs, int mth) {
		eng_marks=eng;cs_marks=cs;maths_marks=mth;
	}

}
