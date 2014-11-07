/* ************************Sandesh******************************************
 * 
 *  
 * Sign bible page which displays 3 options for users to select * 
 * 
 * 
 */



package com.sandesh.forall;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class FirstActivity extends Activity implements OnClickListener {


	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);

		Button btnalpha = (Button) findViewById(R.id.alphabets);
		Button btnnum = (Button) findViewById(R.id.numbers);
		Button btnfuw = (Button) findViewById(R.id.fuw);
		ImageButton backbtn =(ImageButton) findViewById(R.id.backbutton_sign);
		ImageButton homebtn =(ImageButton) findViewById(R.id.homebutton_sign);
		btnalpha.setOnClickListener(this);
		btnnum.setOnClickListener(this);
		btnfuw.setOnClickListener(this);
		backbtn.setOnClickListener(this);
		homebtn.setOnClickListener(this);

	}



	public void onClick(View v) {				  

		Intent intent=new Intent(FirstActivity.this,MainActivity.class);

		switch(v.getId())
		
		{
		
		case R.id.alphabets: intent.putExtra("Userchoice", 1);
							 startActivity(intent);
							 break;
							 
		case R.id.numbers:	intent.putExtra("Userchoice", 2);
							startActivity(intent);			 
							break;
							
		case  R.id.fuw:intent.putExtra("Userchoice", 3);
						startActivity(intent);
						break;
						
		case R.id.backbutton_sign:startActivity(new Intent(FirstActivity.this,SearchText.class));
									break;
			
		case R.id.homebutton_sign:startActivity(new Intent(FirstActivity.this,SearchText.class));
									break;
		
		}
		
		
		
		}		

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == 1){
			if(resultCode == RESULT_OK){      
				//here is your result
				String result=data.getStringExtra("result");  
				Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();	            
			}
			if (resultCode == RESULT_CANCELED) {    
				//Write your code if there's no result
				Toast.makeText(getApplicationContext(), "Nothing Returned!", Toast.LENGTH_SHORT).show();
			}
		}
	}
}
