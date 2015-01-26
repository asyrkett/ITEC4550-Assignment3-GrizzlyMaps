package asyrkett.android.grizzlymaps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button campusMapButton;
	Button areaMapButton;
	Button aboutButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        campusMapButton = (Button) findViewById(R.id.btnCampus);
        campusMapButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v)
			{
				startActivity(new Intent(MainActivity.this, CampusMapActivity.class));
			}
        	
        });
        
        areaMapButton = (Button) findViewById(R.id.btnArea);
        areaMapButton.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v)
        	{
        		startActivity(new Intent(MainActivity.this, AreaMapActivity.class));
        	}
        });
        
        aboutButton = (Button) findViewById(R.id.btnAbout);
        aboutButton.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v)
        	{
        		startActivity(new Intent(MainActivity.this, AboutActivity.class));
        	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
