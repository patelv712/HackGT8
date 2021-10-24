
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		hackgt_8___wtm
	 *	@date 		1635025335591
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class google_pixel_2_xl___3_activity extends Activity {

	
	private View _bg__google_pixel_2_xl___3_ek2;
	private View rectangle_2_ek2;
	private View rectangle_3_ek2;
	private ImageView vector_ek14;
	private ImageView vector_ek15;
	private ImageView vector_ek16;
	private ImageView vector_ek17;
	private ImageView vector_ek18;
	private ImageView vector_ek19;
	private TextView sunday__10_23_ek1;
	private View rectangle_4_ek1;
	private View rectangle_5_ek1;
	private View rectangle_6_ek1;
	private View rectangle_7_ek1;
	private View rectangle_8_ek1;
	private TextView my_events;
	private TextView _9_00_am_ek1;
	private TextView _10_00_am_ek1;
	private TextView _11_00_am_ek1;
	private ImageView vector_ek20;
	private ImageView vector_ek21;

	private Button buttonDash;
	private Button buttonProf;
	private Button buttonHome;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_pixel_2_xl___3);

		
		_bg__google_pixel_2_xl___3_ek2 = (View) findViewById(R.id._bg__google_pixel_2_xl___3_ek2);
		rectangle_2_ek2 = (View) findViewById(R.id.rectangle_2_ek2);
		rectangle_3_ek2 = (View) findViewById(R.id.rectangle_3_ek2);
		vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);

		vector_ek16 = (ImageView) findViewById(R.id.vector_ek16);

		vector_ek18 = (ImageView) findViewById(R.id.vector_ek18);

		sunday__10_23_ek1 = (TextView) findViewById(R.id.sunday__10_23_ek1);
		rectangle_4_ek1 = (View) findViewById(R.id.rectangle_4_ek1);
		rectangle_5_ek1 = (View) findViewById(R.id.rectangle_5_ek1);
		rectangle_6_ek1 = (View) findViewById(R.id.rectangle_6_ek1);
		rectangle_7_ek1 = (View) findViewById(R.id.rectangle_7_ek1);
		rectangle_8_ek1 = (View) findViewById(R.id.rectangle_8_ek1);
		my_events = (TextView) findViewById(R.id.my_events);
		_9_00_am_ek1 = (TextView) findViewById(R.id._9_00_am_ek1);
		_10_00_am_ek1 = (TextView) findViewById(R.id._10_00_am_ek1);
		_11_00_am_ek1 = (TextView) findViewById(R.id._11_00_am_ek1);
		vector_ek20 = (ImageView) findViewById(R.id.vector_ek20);
		vector_ek21 = (ImageView) findViewById(R.id.vector_ek21);


		buttonDash = (Button) findViewById(R.id.bDashboard);
		buttonProf = (Button) findViewById(R.id.bProf);
		buttonHome = (Button) findViewById(R.id.bHome);

		buttonDash.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				openDashboard();
			}
		});

		buttonProf.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				openProfile();
			}
		});

		buttonHome.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				openHome();
			}
		});
	}
	private void openDashboard() {
		finish();
		overridePendingTransition(0, 0);
		startActivity(getIntent());
		overridePendingTransition(0, 0);
	}
	private void openProfile() {
		Intent intent = new Intent(this, google_pixel_2_xl___4_activity.class);
		startActivity(intent);
	}
	private void openHome() {
		Intent intent = new Intent(this, google_pixel_2_xl___2_activity.class);
		startActivity(intent);

	}
	
}
	
	