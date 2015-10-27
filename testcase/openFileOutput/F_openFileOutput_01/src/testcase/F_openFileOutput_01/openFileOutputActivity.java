package testcase.F_openFileOutput_01;

import java.io.FileOutputStream;

import android.app.Activity;
import android.os.Bundle;

public class openFileOutputActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			String packageName = getPackageName();
			FileOutputStream fos = getBaseContext().openFileOutput(packageName, MODE_PRIVATE);
			fos.write((packageName + "\nthis is test\n").getBytes());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}