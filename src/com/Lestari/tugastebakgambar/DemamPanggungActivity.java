package com.Lestari.tugastebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DemamPanggungActivity extends Activity {

	//deklarasi variabel
		EditText jawabanTXT;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demam_panggung);
		
		//CARI KOMPONEN EDIT TEXT
		jawabanTXT = (EditText) findViewById(R.id.editText1);
		
		//SETTING INPUT DALAM HURUF BESAR
		jawabanTXT.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
	}
	
//cek jawaban (method)
	public void  cekJawaban(View v){
		String jawabanBenar = "DEMAM PANGGUNG";
		String jawabanUser = jawabanTXT.getText().toString();
		if(jawabanUser.equals(jawabanBenar)){
			//pesan toast (JAWABAN BENAR/SALAH)
			Toast.makeText(getApplicationContext(),
					"JAWABAN TEPAT!", Toast.LENGTH_LONG).show();
			Intent i = new Intent(getApplicationContext(), MotorActivity.class);
			startActivity(i);
		}
		else{
			//pesan text
			Toast.makeText(getApplicationContext(),
					"JAWABAN MASIH SALAH!", Toast.LENGTH_LONG).show();
					
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.demam_panggung, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
