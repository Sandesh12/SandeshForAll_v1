/* ************************Sandesh******************************************
 * 
 * MainActivity and the launcher activity which loads the first page of the application 
 * performs voice recognition if the recogniser is available and sets text in the serach box
 * and displays corresponding characters onclick of search
 * 
 * 
 */



package com.sandesh.forall;



import java.util.ArrayList;
import java.util.HashMap;




import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class SearchText extends Activity implements OnClickListener,RecognitionListener {



	private static final int REQUEST_CODE = 1234;
	public  EditText entertext;
	public ImageView imagev;
	public ImageButton searchbtn,vsearchbtn,exitbtn,signbtn;
	public SpeechRecognizer sr;	
	public AnimationDrawable animation;
	private static final String NULL = null;	
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.uioneone);
		searchbtn=(ImageButton)findViewById(R.id.search_txt);
		vsearchbtn=(ImageButton)findViewById(R.id.VoiceConvert);
		signbtn=(ImageButton)findViewById(R.id.SignBible);
		imagev= (ImageView)findViewById(R.id.imageView1);
		exitbtn=(ImageButton)findViewById(R.id.TouchToExit);
		
		imagev.setOnClickListener(this);
		searchbtn.setOnClickListener(this);
		
		vsearchbtn.setOnClickListener(this);
		signbtn.setOnClickListener(this);
		exitbtn.setOnClickListener(this);
		entertext =(EditText) findViewById(R.id.entert);
		initSpeechRecognizer();
			}

	public void onClick(View v) {
		// TODO Auto-generated method stub (Voice recognition implementation and sett to search box
		if (v.getId() == R.id.VoiceConvert) {

			Toast.makeText(getApplicationContext(), "Receiving", Toast.LENGTH_SHORT).show();
			Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

			intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getClass().getPackage().getName());
			intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
			intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1);

			intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US");
			startActivityForResult(intent, REQUEST_CODE);
		}

		if(v.getId() == R.id.search_txt)
		{
			
			
			InputMethodManager inputManager = (InputMethodManager) this.getSystemService(getApplicationContext().INPUT_METHOD_SERVICE);

			inputManager.hideSoftInputFromWindow(v.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

			
			
			animation = new AnimationDrawable();
			
			
						Toast.makeText(getApplicationContext(), "Processing text,,,please wait", Toast.LENGTH_SHORT).show();
			
			imagev= (ImageView)findViewById(R.id.imageView1);
			String strtxt="Enter text";								//Invalid condition if user has clicked without entering any text
			String ch;
			if(entertext.getText().toString()==NULL)
			{
				Toast.makeText(getApplicationContext(), "Enter some text in the search box!!", Toast.LENGTH_SHORT).show();			

			}

			else
				strtxt=entertext.getText().toString();

			
			
			String strsplitstr[]=strtxt.split("\\s+");
			
				for(int j=0;j<strsplitstr.length;j++)
					{
					ch=strsplitstr[j];
					for(int i=0;i<ch.length();i++)
						{
				
	
	switch(Character.toLowerCase(ch.charAt(i)))
	{
	
	case 'a':animation.addFrame((getResources().getDrawable(R.drawable.frame_001)),800);
			break;

	case 'b':animation.addFrame((getResources().getDrawable(R.drawable.frame_002)),800);
			break;

	case 'c':animation.addFrame((getResources().getDrawable(R.drawable.frame_003)),800);
			break;

	case 'd':animation.addFrame((getResources().getDrawable(R.drawable.frame_004)),800);
			break;

	case 'e':animation.addFrame((getResources().getDrawable(R.drawable.frame_005)),800);
			break;

	case 'f':animation.addFrame((getResources().getDrawable(R.drawable.frame_006)),800);
			break;

	case 'g':animation.addFrame((getResources().getDrawable(R.drawable.frame_007)),800);
			break;

	case 'h':animation.addFrame((getResources().getDrawable(R.drawable.frame_008)),800);
			break;

	case 'i':animation.addFrame((getResources().getDrawable(R.drawable.frame_009)),800);
			break;

	case 'j':animation.addFrame((getResources().getDrawable(R.drawable.frame_010)),800);
			break;

	case 'k':animation.addFrame((getResources().getDrawable(R.drawable.frame_011)),800);
			break;

	case 'l':animation.addFrame((getResources().getDrawable(R.drawable.frame_012)),800);
			break;

	case 'm':animation.addFrame((getResources().getDrawable(R.drawable.frame_013)),800);
			break;
	case 'n':animation.addFrame((getResources().getDrawable(R.drawable.frame_014)),800);
	break;
	
	case 'o':animation.addFrame((getResources().getDrawable(R.drawable.frame_015)),800);
	break;
	
	case 'p':animation.addFrame((getResources().getDrawable(R.drawable.frame_016)),800);
	break;
	
	

	case 'q':animation.addFrame((getResources().getDrawable(R.drawable.frame_017)),800);
	break;

	case 'r':animation.addFrame((getResources().getDrawable(R.drawable.frame_018)),800);
	break;

	case 's':animation.addFrame((getResources().getDrawable(R.drawable.frame_019)),800);
	break;

	case 't':animation.addFrame((getResources().getDrawable(R.drawable.frame_020)),800);
	break;

	case 'u':animation.addFrame((getResources().getDrawable(R.drawable.frame_021)),800);
	break;
	
	case 'v':animation.addFrame((getResources().getDrawable(R.drawable.frame_022)),800);
	break;

	case 'w':animation.addFrame((getResources().getDrawable(R.drawable.frame_023)),800);
	break;

	case 'x':animation.addFrame((getResources().getDrawable(R.drawable.frame_024)),800);
	break;

	case 'y':animation.addFrame((getResources().getDrawable(R.drawable.frame_025)),800);
	break;

	case 'z':animation.addFrame((getResources().getDrawable(R.drawable.frame_026)),800);
	break;
	
	default:
		      break;
	
	}
						
							
						
						}
					}
					
	/* Animation*/
			
				
		animation.addFrame((getResources().getDrawable(R.drawable.replay)),800);
			animation.setOneShot(true);
			imagev.setImageDrawable(animation);
			animation.start();
			Toast.makeText(getApplicationContext(), "Click on search again to replay!!!", Toast.LENGTH_LONG).show();
			
						
			
		}


		if (v.getId() == R.id.SignBible)
		{
			Toast.makeText(getApplicationContext(), "Moving to sign language dictionary!", Toast.LENGTH_LONG).show();
			Intent intent = new Intent(SearchText.this, FirstActivity.class); 
			startActivity(intent);
			finish();
		}
		
		
		if (v.getId() == R.id.imageView1)
		{
			
						
			AlertDialog.Builder alertDialogBuilderforimage = new AlertDialog.Builder(this);
			alertDialogBuilderforimage.setTitle("Want to see the sighs again??");
			alertDialogBuilderforimage
			.setMessage("Click on search to play again!!")
			.setCancelable(false)
			.setPositiveButton("OK",
					new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					dialog.cancel();
				}
			});

			
			AlertDialog alertDialog = alertDialogBuilderforimage.create();
			alertDialog.show(); 

			
			
			
			animation.setOneShot(true);
			imagev.setImageDrawable(animation);
			animation.start();
			
			
		}
		
		

		if (v.getId() == R.id.TouchToExit)
		{
			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
			alertDialogBuilder.setTitle("Exit Application?");
			alertDialogBuilder
			.setMessage("Click yes to exit!")
			.setCancelable(false)
			.setPositiveButton("Yes",
					new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					moveTaskToBack(true);
					android.os.Process.killProcess(android.os.Process.myPid());
					System.exit(1);
				}
			})

			.setNegativeButton("No", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {

					dialog.cancel();
				}
			});

			AlertDialog alertDialog = alertDialogBuilder.create();
			alertDialog.show(); 
		}



	}



	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
			// Populate the wordsList with the String values the recognition engine thought it heard
			ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

			String topResult = matches.get(0);
			entertext.setText(topResult);
			
			super.onActivityResult(requestCode, resultCode, data);
		}
	}

	private void initSpeechRecognizer() {
		if(sr == null) {
			sr = SpeechRecognizer.createSpeechRecognizer(this);
			if (!SpeechRecognizer.isRecognitionAvailable(getApplicationContext())) {
				Toast.makeText(getApplicationContext(),"Speech Recognition is not available in your phone,You have to enter text in edit box next to you",Toast.LENGTH_LONG).show();
				vsearchbtn.setEnabled(false);
			}
			
		}
		return;
	}



	public void onResume(Bundle savedInstanceState)
	{
		super.onPostResume();
	}


	public void onBeginningOfSpeech() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Sounding good", Toast.LENGTH_SHORT).show();
	}


	public void onBufferReceived(byte[] buffer) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Receiving", Toast.LENGTH_SHORT).show();
	}


	public void onEndOfSpeech() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Displaying", Toast.LENGTH_SHORT).show();
	}


	public void onError(int error) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Oops!! Error", Toast.LENGTH_SHORT).show();
	}


	public void onEvent(int eventType, Bundle params) {
		// TODO Auto-generated method stub

	}


	public void onPartialResults(Bundle partialResults) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Receiving", Toast.LENGTH_SHORT).show();
	}


	public void onReadyForSpeech(Bundle params) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Speak!", Toast.LENGTH_SHORT).show();
	}


	public void onResults(Bundle results) {
		// TODO Auto-generated method stub
	}

	public void onRmsChanged(float rmsdB) {
		// TODO Auto-generated method stub

	}

	public void onPause()
	{
		super.onPause();
	}


	public void onResume()
	{
		super.onResume();
	}


}
