package WriteExcelData;

import java.io.IOException;

public class EnterDetails {

	public static void main(String[] args) throws IOException {
		
		WriteData data = new WriteData();
				
		data.data(2, 0, "Rajasekhar");
		data.data(2, 1, "Welcome1");
		data.data(3, 0, "Mahalaksmi");
		data.data(3, 1, "Password");
	}
}
//Next we will see 'AssertAndVerify' concept