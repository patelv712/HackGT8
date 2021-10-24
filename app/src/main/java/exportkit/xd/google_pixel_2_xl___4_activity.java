
	 
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

import android.util.Log;
import android.widget.Button;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.firestore.auth.User;

import org.w3c.dom.Text;

	public class google_pixel_2_xl___4_activity extends Activity {

	
	private View _bg__google_pixel_2_xl___4_ek2;
	private View rectangle_2_ek3;
	private View rectangle_10;
	private View rectangle_3_ek3;
	private ImageView vector_ek22;
	private ImageView vector_ek23;
	private ImageView vector_ek24;
	private ImageView vector_ek25;
	private ImageView vector_ek26;
	private ImageView vector_ek27;
	private TextView sunday__10_23_ek2;
	private ImageView vector_ek28;
	private ImageView vector_ek29;
	private View ellipse_1;
	private ImageView vector_ek30;
	private ImageView vector_ek31;
	private View rectangle_7_ek2;
	private TextView log_in;
	private View rectangle_8_ek2;
	private TextView my_friends;
	private View rectangle_7_ek3;
	private View rectangle_8_ek3;
	private View rectangle_9;
	private View rectangle_8_ek4;
	private TextView search;
	private ImageView vector_ek32;
	private ImageView vector_ek33;

	private TextView friend1;
	private TextView friend2;
	private TextView friend3;

	private Button buttonProf;
	private Button buttonHome;
	private Button buttonDash;
	public FirebaseAuth mAuth;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_pixel_2_xl___4);

		
		_bg__google_pixel_2_xl___4_ek2 = (View) findViewById(R.id._bg__google_pixel_2_xl___4_ek2);
		rectangle_2_ek3 = (View) findViewById(R.id.rectangle_2_ek3);
		rectangle_10 = (View) findViewById(R.id.rectangle_10);
		rectangle_3_ek3 = (View) findViewById(R.id.rectangle_3_ek3);
		vector_ek22 = (ImageView) findViewById(R.id.vector_ek22);
		vector_ek25 = (ImageView) findViewById(R.id.vector_ek25);
		vector_ek26 = (ImageView) findViewById(R.id.vector_ek26);
		sunday__10_23_ek2 = (TextView) findViewById(R.id.sunday__10_23_ek2);
		vector_ek28 = (ImageView) findViewById(R.id.vector_ek28);
		vector_ek29 = (ImageView) findViewById(R.id.vector_ek29);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		vector_ek30 = (ImageView) findViewById(R.id.vector_ek30);
		vector_ek31 = (ImageView) findViewById(R.id.vector_ek31);
		rectangle_7_ek2 = (View) findViewById(R.id.rectangle_7_ek2);
		log_in = (Button) findViewById(R.id.log_in);
		rectangle_8_ek2 = (View) findViewById(R.id.rectangle_8_ek2);
		my_friends = (TextView) findViewById(R.id.my_friends);
		rectangle_7_ek3 = (View) findViewById(R.id.rectangle_7_ek3);
		rectangle_9 = (View) findViewById(R.id.rectangle_9);
		rectangle_8_ek4 = (View) findViewById(R.id.rectangle_8_ek4);
		search = (TextView) findViewById(R.id.search);
		vector_ek32 = (ImageView) findViewById(R.id.vector_ek32);
		vector_ek33 = (ImageView) findViewById(R.id.vector_ek33);

		friend1 = (TextView) findViewById(R.id.friend1);
		friend2 = (TextView) findViewById(R.id.friend2);
		friend3 = (TextView) findViewById(R.id.friend3);
	
		buttonDash = (Button) findViewById(R.id.bDashboard);
		buttonProf = (Button) findViewById(R.id.bProf);
		buttonHome = (Button) findViewById(R.id.bHome);

		log_in.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				logIn();
			}
		});

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

	private void logIn() {
		// Configure Google Sign In
		GoogleSignInOptions gso = new GoogleSignInOptions
				.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
				.requestIdToken("476595331838-q45k1851qsp5lt55oigjegi3ghvk0bal.apps.googleusercontent.com")
				.requestEmail()
				.build();

		mAuth = FirebaseAuth.getInstance();
		updateUI();
		

		FirebaseUser currentUser = mAuth.getCurrentUser();
	}

	private void firebaseAuthWithGoogle(String idToken) {
		AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
		mAuth.signInWithCredential(credential)
				.addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
					@Override
					public void onComplete(@NonNull Task<AuthResult> task) {
						if (task.isSuccessful()) {
							// Sign in success, update UI with the signed-in user's information
							FirebaseUser user = mAuth.getCurrentUser();
							updateUI();
						} else {
							// If sign in fails, display a message to the user.
							updateUI();
						}
					}
				});
		}

	private void updateUI() {
		sunday__10_23_ek2.setText("Hi John Doe!");
		friend1.setText("\t\tMike Johnson \n\t\t Registered for Blackbear Concert");
		friend2.setText("\t\tHugh Scott");
		friend3.setText("\t\tWilliam Peterson \n\t\t Registered for Tech Talk");

	}

	private void openDashboard() {
		Intent intent = new Intent(this, google_pixel_2_xl___3_activity.class);
		startActivity(intent);
	}
	private void openProfile() {
		finish();
		overridePendingTransition(0, 0);
		startActivity(getIntent());
		overridePendingTransition(0, 0);

	}
	private void openHome() {
		Intent intent = new Intent(this, google_pixel_2_xl___2_activity.class);
		startActivity(intent);

	}
}
	
	