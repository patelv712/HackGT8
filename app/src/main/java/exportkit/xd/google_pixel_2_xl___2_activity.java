
	 
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

public class google_pixel_2_xl___2_activity extends Activity {

	
	private View _bg__google_pixel_2_xl___2_ek2;
	private View rectangle_2_ek1;
	private View rectangle_3_ek1;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	//private ImageView vector_ek7;
	private ImageView vector_ek8;
	private ImageView vector_ek9;
	private TextView sunday__10_23;
	private View rectangle_4;
	private View rectangle_5;
	private View rectangle_6;
	private View rectangle_7;
	private View rectangle_8;
	private TextView eotd___gt_hackathon;
	private TextView all_day;
	private TextView _9_00_am;
	private TextView _10_00_am;
	private TextView _11_00_am;
	private TextView klaus_building;
	private ImageView vector_ek10;
	private ImageView vector_ek11;
	private ImageView vector_ek12;
	private ImageView vector_ek13;

	private Button buttonDash;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_pixel_2_xl___2);

		
		_bg__google_pixel_2_xl___2_ek2 = (View) findViewById(R.id._bg__google_pixel_2_xl___2_ek2);
		rectangle_2_ek1 = (View) findViewById(R.id.rectangle_2_ek1);
		rectangle_3_ek1 = (View) findViewById(R.id.rectangle_3_ek1);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		//vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
		vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
		sunday__10_23 = (TextView) findViewById(R.id.sunday__10_23);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		rectangle_6 = (View) findViewById(R.id.rectangle_6);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		eotd___gt_hackathon = (TextView) findViewById(R.id.eotd___gt_hackathon);
		all_day = (TextView) findViewById(R.id.all_day);
		_9_00_am = (TextView) findViewById(R.id._9_00_am);
		_10_00_am = (TextView) findViewById(R.id._10_00_am);
		_11_00_am = (TextView) findViewById(R.id._11_00_am);
		klaus_building = (TextView) findViewById(R.id.klaus_building);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		vector_ek13 = (ImageView) findViewById(R.id.vector_ek13);

		buttonDash = (Button) findViewById(R.id.bDashboard);

		buttonDash.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				openDashboard();
			}
		});
		}
	private void openDashboard() {
		Intent intent = new Intent(this, google_pixel_2_xl___3_activity.class);
		startActivity(intent);
	}
}
	
	