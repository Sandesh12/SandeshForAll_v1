/* ************************Sandesh******************************************
 * 
 *  
 * 
 * Page displays selected item from the user choice
 * 
 * 
 */


package com.sandesh.forall;




import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;


public class DisplayActivity extends Activity implements OnClickListener{
	public ImageButton finishbtn,previousbtn;
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    final int choice;
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_startup);

	    int position=getIntent().getExtras().getInt("Image Int");
	    choice=getIntent().getExtras().getInt("Choice");
	    ImageView imagev = (ImageView) findViewById(R.id.imagedisplay);
	    
	    finishbtn=(ImageButton)findViewById(R.id.Exit_button);
	    previousbtn=(ImageButton)findViewById(R.id.Gobackbutton);
		   
		   finishbtn.setOnClickListener(this);
		   previousbtn.setOnClickListener(this);
		   
	    
	    position++;
	    
	    if(choice==2)
	    	position=position+26;
	    else if(choice==3)
	    	position=position+36;
	    
	    
	    int[] bLogos = {
	    		R.drawable.frame_001,
	    		R.drawable.frame_002,
	    		R.drawable.frame_003,
	    		R.drawable.frame_004,
	    		R.drawable.frame_005,
	    		R.drawable.frame_006,
	    		R.drawable.frame_007,
	    		R.drawable.frame_008,
	    		R.drawable.frame_009,
	    		R.drawable.frame_010,
	    		R.drawable.frame_011,
	    		R.drawable.frame_012,
	    		R.drawable.frame_013,
	    		R.drawable.frame_014,
	    		R.drawable.frame_015,
	    		R.drawable.frame_016,
	    		R.drawable.frame_017,
	    		R.drawable.frame_018,
	    		R.drawable.frame_019,
	    		R.drawable.frame_020,
	    		R.drawable.frame_021,
	    		R.drawable.frame_022,
	    		R.drawable.frame_023,
	    		R.drawable.frame_024,
	    		R.drawable.frame_024,
	    		R.drawable.frame_025,
	    		R.drawable.frame_026,
	    		R.drawable.frame_027,
	    		R.drawable.frame_028,
	    		R.drawable.frame_029,
	    		R.drawable.frame_030,
	    		R.drawable.frame_031,	    		
	    		R.drawable.frame_032,
	    		R.drawable.frame_033,
	    		R.drawable.frame_034,
	    		R.drawable.frame_035,
	    		R.drawable.frame_036,
	    		R.drawable.frame_037,
	    		R.drawable.frame_038,
	    		R.drawable.frame_039,
	    		R.drawable.frame_040,
	    		R.drawable.frame_041,
	    		R.drawable.frame_042,
	    		R.drawable.frame_043,
	    		R.drawable.frame_044,
	    		R.drawable.frame_045,
	    		R.drawable.frame_046,
	    		R.drawable.frame_029,
	    		R.drawable.frame_030,
	    		R.drawable.frame_031,	    		
	    		R.drawable.frame_032,
	    		R.drawable.frame_033,
	    		R.drawable.frame_034,
	    		R.drawable.frame_035,
	    		R.drawable.frame_036,
	    		R.drawable.frame_037,
	    		R.drawable.frame_038,
	    		R.drawable.frame_039,
	    		R.drawable.frame_040,
	    		R.drawable.frame_041,
	    		R.drawable.frame_042,
	    		R.drawable.frame_043,
	    		R.drawable.frame_044,
	    		R.drawable.frame_045,
	    		R.drawable.frame_046,
	    			    		
	    } ;
	    
	    
	    int cImage = bLogos[position];
	   
	    imagev.setImageResource(cImage);

	
	    
	    
	    
	
	}

	public void onClick(View  v) {
		
		
		// TODO Auto-generated method stub
		if (v.getId() == R.id.Gobackbutton)
		{
			Intent intent = new Intent(DisplayActivity.this, FirstActivity.class); 
			startActivity(intent);
			finish();
		}
			
		if (v.getId() == R.id.Exit_button)
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
	
	
	

}
