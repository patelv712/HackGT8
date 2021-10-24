
	 
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

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

	public class google_pixel_2_xl___2_activity extends Activity {

	
	private View _bg__google_pixel_2_xl___2_ek2;
	private View rectangle_2_ek1;
	private View rectangle_3_ek1;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	//private ImageView vector_ek7;
	private ImageView vector_ek8;

	private TextView overallDate;
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

	private TextView view9am1;
	private TextView view9am2;
	private TextView view10am;
	private TextView view11am;



		private Button buttonDash;
	private Button buttonProf;
	private Button buttonHome;
	public FirebaseFirestore db = FirebaseFirestore.getInstance();


	@Override
	public void onCreate(Bundle savedInstanceState) {

		Event[] events = new Event[4];
		events[0] = new Event("Tech Talk", "10-23-2021", 1830, 2000, "Klaus 1116", "Union Pacific", "College of Computing", "Public", "Light dinner will be provided.", -1, false, 0, false, 0);
		events[1] = new Event("Hallorave", "10-23-2021", 2200, -1, "1745 Defoor Place Suite F", "Sigma Beta Rho Fraternity", "Frat Party", "Paid Admission", "Come costumed up for a lit time", 100, true, 10, true, 12);
		events[2] = new Event("SAA Fall Appreciation Festival", "10-23-2021", 1100, 1400, "Tech Walkway", "Student Alumni Association", "Club/Org", "Private", "All students are encouraged to come out and trick or treat with fellow Tech Students and SAA members.", -1, false, 0, false, 0);
		events[3] = new Event("Blackbear Concert", "10-23-2021", 1100, 1400, "McCamish Pavillion", "SCPC", "Concert", "Public", "The SCPC is so excited to  bring back our annual in person concert featuring BLACKBEAR", 1000, false, 0, false, 0);

		for (int i = 0; i < events.length; i++) {
			db.collection("10-23-2021").document(events[i].getEventName())
					.set(events[0])
					.addOnSuccessListener(new OnSuccessListener<Void>() {
						@Override
						public void onSuccess(Void aVoid) {
						}
					})
					.addOnFailureListener(new OnFailureListener() {
						@Override
						public void onFailure(@NonNull Exception e) {
						}
					});
		}

		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_pixel_2_xl___2);

		
		_bg__google_pixel_2_xl___2_ek2 = (View) findViewById(R.id._bg__google_pixel_2_xl___2_ek2);
		rectangle_2_ek1 = (View) findViewById(R.id.rectangle_2_ek1);
		rectangle_3_ek1 = (View) findViewById(R.id.rectangle_3_ek1);

		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		//vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);

		overallDate = (TextView) findViewById(R.id.overallDate);
		overallDate.setText(events[0].getDateString());
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


		view9am1 = (TextView) findViewById(R.id.view9am1);
		view9am2 = (TextView) findViewById(R.id.view9am2);
		view10am = (TextView) findViewById(R.id.view10am);
		view11am = (TextView) findViewById(R.id.view11am);

		view9am1.setText((events[0]).getEventName() + "\n Location: " + (events[0]).getLocation() + "\n" + (events[0]).getDescription());
		view9am2.setText((events[1]).getEventName() + "\n Location: " + (events[1]).getLocation() + "\n" + (events[1]).getDescription());
		view10am.setText((events[2]).getEventName() + "\n Location: " + (events[2]).getLocation() + "\n" + (events[2]).getDescription());
		view11am.setText((events[3]).getEventName() + "\n Location: " + (events[3]).getLocation() + "\n" + (events[3]).getDescription());

		klaus_building = (TextView) findViewById(R.id.klaus_building);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		vector_ek13 = (ImageView) findViewById(R.id.vector_ek13);

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
		Intent intent = new Intent(this, google_pixel_2_xl___3_activity.class);
		startActivity(intent);
	}
	private void openProfile() {
		Intent intent = new Intent(this, google_pixel_2_xl___4_activity.class);
		startActivity(intent);
	}
	private void openHome() {
		//Intent intent = new Intent(this, google_pixel_2_xl___2_activity.class);
		finish();
		overridePendingTransition(0, 0);
		startActivity(getIntent());
		overridePendingTransition(0, 0);
	}

}
	
	