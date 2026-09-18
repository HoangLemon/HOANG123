package CongNhan;
//khai bao
public class CongNhan {
	private int maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;
	private double tinhLuong;
	//dong goi
	public int getMaCN() {
		return maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public void setmSoSP(int mSoSP) throws Exception{
		if(mSoSP > 0)
		{
			this.mSoSP = mSoSP;
		}
		else
		{
			throw new Exception("So san pham phai lon hon 0");
		}
	}
	//viet ham tinh luong cho cong nhan
	public double getTinhLuong() {
		return tinhLuong;
	}
	public void setTinhLuong(double tinhLuong) {
		if(this.mSoSP >= 1 && this.mSoSP <= 199)
		{
			tinhLuong = getmSoSP() * 0.5;
		}
		else if(this.mSoSP >= 200 && this.mSoSP <= 399)
		{
			tinhLuong = getmSoSP() * 0.55;
		}
		else if(this.mSoSP >= 400 && this.mSoSP <= 599)
		{
			tinhLuong = getmSoSP() * 0.6;
		}
		else
		{
			tinhLuong = getmSoSP() * 0.65;
		}
	}
//tao Constructor
	public CongNhan(int maCN, String mHo, String mTen, int mSoSP, double tinhLuong) {
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
		this.tinhLuong = tinhLuong;
	}
	//tao ham toString
	public String toString(){
		return "MaCN: "+ maCN +"\n" + "Ho: "+ mHo +"\n" + "Ten: "+ mTen +"\n" + "So san pham: "+ mSoSP +"\n" + "Tien Luong: "+ tinhLuong +"\n";
	}
	
}
