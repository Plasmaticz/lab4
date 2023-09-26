package cs301.birthdaycake;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Switch;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeView);

        // Get a reference to the "Blow Out" button
        Button blowOutButton = findViewById(R.id.blowOutButton);
        // Set the click listener for the button
        blowOutButton.setOnClickListener(cakeController);

        // Attach the CakeController as the listener to the Candles switch
        Switch candlesSwitch = findViewById(R.id.candlesSwitch); // Replace 'yourSwitchId' with the id of your switch
        candlesSwitch.setOnCheckedChangeListener(cakeController);

        // Get a reference to the SeekBar
        SeekBar candleSeekBar = findViewById(R.id.candleSeekBar);
        // Set the CakeController as the change listener for the SeekBar
        candleSeekBar.setOnSeekBarChangeListener(cakeController);


    }


    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }
}
