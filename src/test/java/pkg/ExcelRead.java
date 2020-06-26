package pkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelRead {
	public static FileInputStream fp;
	public static XSSFWorkbook xs;
	public static Sheet sh;
	public static Object[][] obj;
	public static FileOutputStream fo;

	public static Object[][] readsheet(String sh1) throws IOException{
		fp=new FileInputStream("D:\\ENCLIPS\\MAVENandTESTNG\\dataDriven\\src\\test\\resources\\testdata.xlsx");
		xs=new XSSFWorkbook(fp);
		sh=xs.getSheet(sh1);
		int totalrow=sh.getLastRowNum();
		Row r=sh.getRow(1);
		System.out.println(totalrow);
		int totalcell=r.getLastCellNum();
		obj=new Object[totalrow][totalcell];
		System.out.println(totalcell);
		for(int i=1;i<=totalrow;i++) {
			for(int j=0;j<totalcell;j++) {
				obj[i-1][j]=sh.getRow(i).getCell(j).toString();		
			}
		}
		return obj;
	}
}
