package CongNhan;

public class DanhSachCongNhan{
	private CongNhan[] ds;
	private int count;
//tao phuong thuc them n phan tu
	public DanhSachCongNhan(int n) {
		ds = new CongNhan[n];	
		count = 0;
    }
//them 1 cong nhan vao danh sach
	public boolean themCongNhan(CongNhan cn) {
		if(count >= ds.length)
		{
			return false;
		}
		ds[count] = cn;
		count++;
		return true;
	}
//xuat toan bo thong tin cong nhan vien
	public void xuatDanhSach(){
		for(int i = 0; i < count; i++)
		{
			System.out.println(ds[i]);
		}
	}
//xuat so luong cong nhan vien
	public int tinhSoLuong() {
		return count;
	}
//xuat thong tin cac nhan vien co san pham tren 200
	public void congNhanTren200() {
		for(int i = 0; i < count; i++)
		{
			if(ds[i].getmSoSP() > 200)
			{
				System.out.println(ds[i]);
			}
		}
	}
//sap xep cac cong nhan theo so san pham giam dan
	public void sapXepGiamDan() {
		for(int i = 0; i < count; i++)
		{
			for(int j = i + 1; j < count; j++)
			{
				if(ds[i].getmSoSP() < ds[j].getmSoSP())
				{
					CongNhan temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
	}
}
